package d8;
public final class k1 extends d8.i1 {
    public final d8.r1 e;
    public final d8.l1 f;
    public final d8.r m;
    public final Object n;

    public k1(d8.r1 p1, d8.l1 p2, d8.r p3, Object p4)
    {
        this.e = p1;
        this.f = p2;
        this.m = p3;
        this.n = p4;
        return;
    }

    public final boolean j()
    {
        return 0;
    }

    public final void k(Throwable p7)
    {
        Object v7_0 = this.m;
        d8.s1 v0_1 = d8.r1.D(v7_0);
        d8.r1 v1 = this.e;
        d8.l1 v2 = this.f;
        Object v3 = this.n;
        if ((v0_1 == null) || (!v1.N(v2, v0_1, v3))) {
            v2.a.d(new i8.h(2), 2);
            Object v7_1 = d8.r1.D(v7_0);
            if ((v7_1 == null) || (!v1.N(v2, v7_1, v3))) {
                v1.f(v1.p(v2, v3));
                return;
            }
        }
        return;
    }
}
