package a5;
public final class b {
    public String a;
    public final java.util.HashSet b;
    public final java.util.HashSet c;
    public int d;
    public int e;
    public a5.f f;
    public final java.util.HashSet g;

    public b(a5.x p4, a5.x[] p5)
    {
        this.a = 0;
        a5.x v0_3 = new java.util.HashSet();
        this.b = v0_3;
        this.c = new java.util.HashSet();
        int v1_0 = 0;
        this.d = 0;
        this.e = 0;
        this.g = new java.util.HashSet();
        v0_3.add(p4);
        java.util.HashSet v4_1 = p5.length;
        while (v1_0 < v4_1) {
            q4.b.f(p5[v1_0], "Null interface");
            v1_0++;
        }
        java.util.Collections.addAll(this.b, p5);
        return;
    }

    public b(Class p4, Class[] p5)
    {
        this.a = 0;
        a5.x v0_4 = new java.util.HashSet();
        this.b = v0_4;
        this.c = new java.util.HashSet();
        int v1_0 = 0;
        this.d = 0;
        this.e = 0;
        this.g = new java.util.HashSet();
        v0_4.add(a5.x.a(p4));
        int v4_2 = p5.length;
        while (v1_0 < v4_2) {
            a5.x v0_1 = p5[v1_0];
            q4.b.f(v0_1, "Null interface");
            this.b.add(a5.x.a(v0_1));
            v1_0++;
        }
        return;
    }

    public final void a(a5.m p3)
    {
        if (this.b.contains(p3.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(p3);
            return;
        }
    }

    public final a5.c b()
    {
        IllegalStateException v0_3;
        if (this.f == null) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (v0_3 == null) {
            throw new IllegalStateException("Missing required property: factory.");
        } else {
            return new a5.c(this.a, new java.util.HashSet(this.b), new java.util.HashSet(this.c), this.d, this.e, this.f, this.g);
        }
    }

    public final void c(int p2)
    {
        String v0_1;
        if (this.d != 0) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (v0_1 == null) {
            throw new IllegalStateException("Instantiation type has already been set.");
        } else {
            this.d = p2;
            return;
        }
    }
}
