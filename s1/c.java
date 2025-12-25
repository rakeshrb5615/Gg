package s1;
public final class c {
    public final a5.a a;
    public final s1.f b;
    public final java.util.LinkedHashSet c;
    public final java.util.LinkedHashSet d;

    public c(a5.a p1)
    {
        this.a = p1;
        this.b = new s1.f();
        new java.util.LinkedHashSet();
        this.c = new java.util.LinkedHashSet();
        this.d = new java.util.LinkedHashSet();
        return;
    }

    public final void a(s1.e p3)
    {
        if (this.d.add(p3)) {
            this.b.a(this, p3, -1);
        }
        return;
    }

    public final void b(s1.l p2, int p3)
    {
        if ((p3 != 1) && (p3 != null)) {
            throw new IllegalArgumentException(g2.g.c(p3, "Unsupported priority value: ").toString());
        } else {
            if (this.d.add(p2)) {
                this.b.a(this, p2, p3);
            }
            return;
        }
    }

    public final void c(s1.e p4, s1.b p5)
    {
        s1.h v0_0 = this.b;
        v0_0.getClass();
        if (v0_0.g == 0) {
            c.r v2 = v0_0.c(-1);
            v0_0.f = v2;
            v0_0.g = -1;
            v0_0.h = p4;
            if (p5 != 0) {
                if (v2 != null) {
                    v2.d.getClass();
                }
                g8.y v4_2 = v0_0.a;
                s1.h v0_2 = new s1.h(p5);
                v4_2.getClass();
                v4_2.e(0, v0_2);
            }
        }
        return;
    }
}
