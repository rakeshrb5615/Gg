package x1;
public abstract class e extends x1.b {
    public final android.adservices.measurement.MeasurementManager a;

    public e(android.adservices.measurement.MeasurementManager p1)
    {
        this.a = p1;
        return;
    }

    public static Object h(x1.e p1, x1.a p2, l7.c p3)
    {
        new d8.n(1, q4.b.C(p3)).r();
        throw 0;
    }

    public static Object i(x1.e p2, l7.c p3)
    {
        d8.n v0_1 = new d8.n(1, q4.b.C(p3));
        v0_1.r();
        p2.a.getMeasurementApiStatus(new x1.d(), new m0.e(v0_1));
        return v0_1.q();
    }

    public static Object k(x1.e p2, android.net.Uri p3, android.view.InputEvent p4, l7.c p5)
    {
        d8.n v0_1 = new d8.n(1, q4.b.C(p5));
        v0_1.r();
        p2.a.registerSource(p3, p4, new x1.d(), new m0.e(v0_1));
        h7.l v2_1 = v0_1.q();
        if (v2_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v2_1;
        }
    }

    public static Object l(x1.e p2, x1.f p3, l7.c p4)
    {
        h7.l v2_1 = d8.f0.e(new a1.p(p2, 0, 3), p4);
        if (v2_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v2_1;
        }
    }

    public static Object m(x1.e p2, android.net.Uri p3, l7.c p4)
    {
        d8.n v0_1 = new d8.n(1, q4.b.C(p4));
        v0_1.r();
        p2.a.registerTrigger(p3, new x1.d(), new m0.e(v0_1));
        h7.l v2_1 = v0_1.q();
        if (v2_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v2_1;
        }
    }

    public static Object o(x1.e p1, x1.g p2, l7.c p3)
    {
        new d8.n(1, q4.b.C(p3)).r();
        throw 0;
    }

    public static Object q(x1.e p1, x1.h p2, l7.c p3)
    {
        new d8.n(1, q4.b.C(p3)).r();
        throw 0;
    }

    public Object b(l7.c p1)
    {
        return x1.e.i(this, p1);
    }

    public Object c(android.net.Uri p1, android.view.InputEvent p2, l7.c p3)
    {
        return x1.e.k(this, p1, p2, p3);
    }

    public Object d(android.net.Uri p1, l7.c p2)
    {
        return x1.e.m(this, p1, p2);
    }

    public Object g(x1.a p1, l7.c p2)
    {
        return x1.e.h(this, p1, p2);
    }

    public Object j(x1.f p1, l7.c p2)
    {
        return x1.e.l(this, p1, p2);
    }

    public Object n(x1.g p1, l7.c p2)
    {
        return x1.e.o(this, p1, p2);
    }

    public Object p(x1.h p1, l7.c p2)
    {
        return x1.e.q(this, p1, p2);
    }
}
