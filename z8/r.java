package z8;
public final class r extends z8.s {
    public final z8.f d;

    public r(z8.p0 p1, okhttp3.Call$Factory p2, z8.m p3, z8.f p4)
    {
        super(p1, p2, p3);
        super.d = p4;
        return;
    }

    public final Object b(z8.z p4, Object[] p5)
    {
        m7.a v4_5 = ((z8.d) this.d.a(p4));
        try {
            d8.n v0_1 = new d8.n(1, q4.b.C(((l7.c) p5[(p5.length - 1)])));
            v0_1.r();
            v0_1.t(new z8.u(v4_5, 2));
            v4_5.f(new n8.b(v0_1, 3));
            return v0_1.q();
        } catch (m7.a v4_3) {
            z8.z0.q(v4_3, m7.a.a);
            return m7.a.a;
        }
    }
}
