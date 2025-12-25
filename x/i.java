package x;
public final class i extends x.o {

    public final void a(x.d p3)
    {
        p3 = this.h;
        if ((p3.c) && (!p3.j)) {
            p3.d(((int) ((((float) ((x.f) p3.l.get(0)).g) * ((w.h) this.b).q0) + 1056964608)));
            return;
        } else {
            return;
        }
    }

    public final void d()
    {
        java.util.ArrayList v0_0 = this.b;
        java.util.ArrayList v1_2 = ((w.h) v0_0);
        int v2 = v1_2.r0;
        int v3 = v1_2.s0;
        x.f v5 = this.h;
        if (v1_2.u0 != 1) {
            if (v2 == -1) {
                if (v3 == -1) {
                    v5.b = 1;
                    v5.l.add(v0_0.T.e.i);
                    this.b.T.e.i.k.add(v5);
                } else {
                    v5.l.add(v0_0.T.e.i);
                    this.b.T.e.i.k.add(v5);
                    v5.f = (- v3);
                }
            } else {
                v5.l.add(v0_0.T.e.h);
                this.b.T.e.h.k.add(v5);
                v5.f = v2;
            }
            this.m(this.b.e.h);
            this.m(this.b.e.i);
            return;
        } else {
            if (v2 == -1) {
                if (v3 == -1) {
                    v5.b = 1;
                    v5.l.add(v0_0.T.d.i);
                    this.b.T.d.i.k.add(v5);
                } else {
                    v5.l.add(v0_0.T.d.i);
                    this.b.T.d.i.k.add(v5);
                    v5.f = (- v3);
                }
            } else {
                v5.l.add(v0_0.T.d.h);
                this.b.T.d.h.k.add(v5);
                v5.f = v2;
            }
            this.m(this.b.d.h);
            this.m(this.b.d.i);
            return;
        }
    }

    public final void e()
    {
        w.d v0 = this.b;
        x.f v3 = this.h;
        if (((w.h) v0).u0 != 1) {
            v0.Z = v3.g;
            return;
        } else {
            v0.Y = v3.g;
            return;
        }
    }

    public final void f()
    {
        this.h.c();
        return;
    }

    public final boolean k()
    {
        return 0;
    }

    public final void m(x.f p3)
    {
        x.f v0 = this.h;
        v0.k.add(p3);
        p3.l.add(v0);
        return;
    }
}
