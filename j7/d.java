package j7;
public final class d extends h1.c implements java.util.Iterator, v7.a {
    public final synthetic int e;

    public d(j7.f p1, int p2)
    {
        this.e = p2;
        kotlin.jvm.internal.j.e(p1, "map");
        this.d = p1;
        this.b = -1;
        this.c = p1.n;
        this.f();
        return;
    }

    public final Object next()
    {
        switch (this.e) {
            case 0:
                this.c();
                java.util.NoSuchElementException v0_2 = this.a;
                Object[] v1_2 = ((j7.f) this.d);
                if (v0_2 >= v1_2.f) {
                    throw new java.util.NoSuchElementException();
                } else {
                    this.a = (v0_2 + 1);
                    this.b = v0_2;
                    int v2_4 = new j7.e(v1_2, v0_2);
                    this.f();
                    return v2_4;
                }
            case 1:
                this.c();
                java.util.NoSuchElementException v0_5 = this.a;
                Object[] v1_7 = ((j7.f) this.d);
                if (v0_5 >= v1_7.f) {
                    throw new java.util.NoSuchElementException();
                } else {
                    this.a = (v0_5 + 1);
                    this.b = v0_5;
                    java.util.NoSuchElementException v0_1 = v1_7.a[v0_5];
                    this.f();
                    return v0_1;
                }
            default:
                this.c();
                java.util.NoSuchElementException v0_6 = this.a;
                Object[] v1_4 = ((j7.f) this.d);
                if (v0_6 >= v1_4.f) {
                    throw new java.util.NoSuchElementException();
                } else {
                    this.a = (v0_6 + 1);
                    this.b = v0_6;
                    java.util.NoSuchElementException v0_9 = v1_4.b;
                    kotlin.jvm.internal.j.b(v0_9);
                    java.util.NoSuchElementException v0_10 = v0_9[this.b];
                    this.f();
                    return v0_10;
                }
        }
    }
}
