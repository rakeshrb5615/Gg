package a1;
public final class n extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public final synthetic a1.g0 c;

    public synthetic n(a1.g0 p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        switch (this.a) {
            case 0:
                return new a1.n(this.c, p4, 0);
            case 1:
                return new a1.n(this.c, p4, 1);
            default:
                return new a1.n(this.c, p4, 2);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((a1.n) this.create(((g8.d) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            case 1:
                return ((a1.n) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((a1.n) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p13)
    {
        int v1_0 = h7.l.a;
        a1.g0 v4 = this.c;
        switch (this.a) {
            case 0:
                int v0_1 = m7.a.a;
                int v2_1 = this.b;
                if (v2_1 == 0) {
                    c4.b.e0(p13);
                    this.b = 1;
                    if (a1.g0.e(v4, this) == v0_1) {
                        v1_0 = v0_1;
                    }
                } else {
                    if (v2_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p13);
                    }
                }
                return v1_0;
            case 1:
                int v0_3 = m7.a.a;
                g8.b v6_3 = this.b;
                if (v6_3 == null) {
                    c4.b.e0(p13);
                    Object v13_1 = v4.i;
                    this.b = 1;
                    Object v13_4 = ((d8.u) v13_1.c).h(this);
                    if (v13_4 != v0_3) {
                        v13_4 = v1_0;
                    }
                    if (v13_4 != v0_3) {
                        Object v13_7;
                        h8.d v7_0 = v4.h().d();
                        f8.a v10 = f8.a.b;
                        l7.i v8 = l7.i.a;
                        if (!(v7_0 instanceof h8.d)) {
                            v13_7 = new g8.b(v7_0, v8, 0, v10, 1);
                        } else {
                            v13_7 = ((h8.d) v7_0).c(v8, 0, v10);
                        }
                        a1.s v3_2 = new a1.s(v4, 1);
                        this.b = 2;
                        if (v13_7.f(v3_2, this) == v0_3) {
                            v1_0 = v0_3;
                        }
                    }
                } else {
                    if (v6_3 == 1) {
                        c4.b.e0(p13);
                    } else {
                        if (v6_3 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            c4.b.e0(p13);
                        }
                    }
                }
                return v1_0;
            default:
                int v0_2 = v4.h;
                int v1_1 = m7.a.a;
                g8.b v6_2 = this.b;
                try {
                    if (v6_2 == null) {
                        c4.b.e0(p13);
                        if (!(v0_2.h() instanceof a1.r0)) {
                            this.b = 1;
                            if (v4.i(this) != v1_1) {
                                this.b = 2;
                                p13 = a1.g0.f(v4, 0, this);
                                if (p13 != v1_1) {
                                    v1_1 = ((a1.l1) p13);
                                }
                            }
                        } else {
                            v1_1 = v0_2.h();
                        }
                    } else {
                        if (v6_2 == 1) {
                            c4.b.e0(p13);
                        } else {
                            if (v6_2 != 2) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            } else {
                                c4.b.e0(p13);
                            }
                        }
                    }
                } catch (int v0_4) {
                    v1_1 = new a1.d1(-1, v0_4);
                }
                return v1_1;
        }
    }
}
