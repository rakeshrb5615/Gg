package x8;
public final class c0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public x8.c0 f;
    public x8.c0 g;

    public c0()
    {
        int v0_1 = new byte[8192];
        this.a = v0_1;
        this.e = 1;
        this.d = 0;
        return;
    }

    public c0(byte[] p2, int p3, int p4, boolean p5, boolean p6)
    {
        kotlin.jvm.internal.j.e(p2, "data");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        return;
    }

    public final x8.c0 a()
    {
        int v0 = this.f;
        if (v0 == this) {
            v0 = 0;
        }
        x8.c0 v2_0 = this.g;
        kotlin.jvm.internal.j.b(v2_0);
        v2_0.f = this.f;
        x8.c0 v2_1 = this.f;
        kotlin.jvm.internal.j.b(v2_1);
        v2_1.g = this.g;
        this.f = 0;
        this.g = 0;
        return v0;
    }

    public final void b(x8.c0 p2)
    {
        kotlin.jvm.internal.j.e(p2, "segment");
        p2.g = this;
        p2.f = this.f;
        x8.c0 v0_2 = this.f;
        kotlin.jvm.internal.j.b(v0_2);
        v0_2.g = p2;
        this.f = p2;
        return;
    }

    public final x8.c0 c()
    {
        this.d = 1;
        return new x8.c0(this.a, this.b, this.c, 1, 0);
    }

    public final void d(x8.c0 p6, int p7)
    {
        kotlin.jvm.internal.j.e(p6, "sink");
        int v0_1 = p6.a;
        if (!p6.e) {
            throw new IllegalStateException("only owner can write");
        } else {
            int v1_4 = p6.c;
            int v2_0 = (v1_4 + p7);
            if (v2_0 > 8192) {
                if (p6.d) {
                    throw new IllegalArgumentException();
                } else {
                    int v4_1 = p6.b;
                    if ((v2_0 - v4_1) > 8192) {
                        throw new IllegalArgumentException();
                    } else {
                        i7.h.Y(v0_1, 0, v0_1, v4_1, v1_4);
                        p6.c = (p6.c - p6.b);
                        p6.b = 0;
                    }
                }
            }
            int v2_3 = this.b;
            i7.h.Y(this.a, p6.c, v0_1, v2_3, (v2_3 + p7));
            p6.c = (p6.c + p7);
            this.b = (this.b + p7);
            return;
        }
    }
}
