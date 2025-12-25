package q0;
public class p1 {
    public static final q0.s1 b;
    public final q0.s1 a;

    static p1()
    {
        q0.d1 v0_1;
        q0.d1 v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 < 34) {
            if (v0_0 < 30) {
                if (v0_0 < 29) {
                    v0_1 = new q0.d1();
                } else {
                    v0_1 = new q0.f1();
                }
            } else {
                v0_1 = new q0.g1();
            }
        } else {
            v0_1 = new q0.h1();
        }
        q0.p1.b = v0_1.b().a.a().a.b().a.c();
        return;
    }

    public p1(q0.s1 p1)
    {
        this.a = p1;
        return;
    }

    public q0.s1 a()
    {
        return this.a;
    }

    public q0.s1 b()
    {
        return this.a;
    }

    public q0.s1 c()
    {
        return this.a;
    }

    public void d(android.view.View p1)
    {
        return;
    }

    public q0.j e()
    {
        return 0;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof q0.p1)) {
                if ((this.n() != ((q0.p1) p5).n()) || ((this.m() != ((q0.p1) p5).m()) || ((!java.util.Objects.equals(this.j(), ((q0.p1) p5).j())) || ((!java.util.Objects.equals(this.h(), ((q0.p1) p5).h())) || (!java.util.Objects.equals(this.e(), ((q0.p1) p5).e())))))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public h0.b f(int p1)
    {
        return h0.b.e;
    }

    public h0.b g()
    {
        return this.j();
    }

    public h0.b h()
    {
        return h0.b.e;
    }

    public int hashCode()
    {
        return java.util.Objects.hash(new Object[] {Boolean.valueOf(this.n()), Boolean.valueOf(this.m()), this.j(), this.h(), this.e()}));
    }

    public h0.b i()
    {
        return this.j();
    }

    public h0.b j()
    {
        return h0.b.e;
    }

    public h0.b k()
    {
        return this.j();
    }

    public q0.s1 l(int p1, int p2, int p3, int p4)
    {
        return q0.p1.b;
    }

    public boolean m()
    {
        return 0;
    }

    public boolean n()
    {
        return 0;
    }

    public void o(h0.b[] p1)
    {
        return;
    }

    public void p(q0.s1 p1)
    {
        return;
    }

    public void q(h0.b p1)
    {
        return;
    }

    public void r(int p1)
    {
        return;
    }
}
