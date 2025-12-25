package a1;
public final class a0 extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public synthetic boolean c;
    public final synthetic a1.g0 d;
    public final synthetic int e;
    public Object f;

    public synthetic a0(a1.g0 p1, int p2, l7.c p3, int p4)
    {
        this.a = p4;
        this.d = p1;
        this.e = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p5, l7.c p6)
    {
        switch (this.a) {
            case 0:
                a1.a0 v0_4 = new a1.a0(this.d, this.e, p6, 0);
                v0_4.c = ((Boolean) p5).booleanValue();
                return v0_4;
            default:
                a1.a0 v0_2 = new a1.a0(this.d, this.e, p6, 1);
                v0_2.c = ((Boolean) p5).booleanValue();
                return v0_2;
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        int v0 = this.a;
        ((Boolean) p2).booleanValue();
        switch (v0) {
            case 0:
                return ((a1.a0) this.create(((Boolean) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((a1.a0) this.create(((Boolean) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p7)
    {
        switch (this.a) {
            case 0:
                Object v7_3;
                int v1_1;
                a1.d1 v0_2 = m7.a.a;
                int v1_3 = this.b;
                Object v2_3 = this.d;
                try {
                    if (v1_3 == 0) {
                        c4.b.e0(p7);
                        v1_1 = this.c;
                        this.c = v1_1;
                        this.b = 1;
                        p7 = a1.g0.g(v2_3, v1_1, this);
                        if (p7 != v0_2) {
                            v7_3 = ((a1.l1) p7);
                            v0_2 = new h7.f(v7_3, Boolean.valueOf(v1_1));
                        } else {
                        }
                    } else {
                        if (v1_3 == 1) {
                            v1_1 = this.c;
                            c4.b.e0(p7);
                        } else {
                            if (v1_3 != 2) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            } else {
                                a1.d1 v0_4 = this.c;
                                int v1_2 = ((Throwable) this.f);
                                c4.b.e0(p7);
                                Object v7_2 = ((Number) p7).intValue();
                                v1_1 = v0_4;
                                v7_3 = new a1.d1(v7_2, v1_2);
                            }
                        }
                    }
                } catch (Object v7_1) {
                    if (v1_1 == 0) {
                        v1_2 = v7_1;
                        v7_2 = this.e;
                        v0_4 = v1_1;
                    } else {
                        Object v2_1 = v2_3.h();
                        this.f = v7_1;
                        this.c = v1_1;
                        this.b = 2;
                        Object v2_2 = v2_1.e(this);
                        if (v2_2 != v0_2) {
                            v0_4 = v1_1;
                            v1_2 = v7_1;
                            p7 = v2_2;
                        }
                    }
                }
                return v0_2;
            default:
                int v1_8;
                Object v7_7;
                a1.d1 v0_8;
                a1.d1 v0_1 = m7.a.a;
                int v1_7 = this.b;
                Object v2_6 = this.d;
                if (v1_7 == 0) {
                    c4.b.e0(p7);
                    v1_8 = this.c;
                    this.c = v1_8;
                    this.b = 1;
                    p7 = v2_6.j(this);
                    if (p7 != v0_1) {
                        if (v1_8 == 0) {
                            v0_8 = p7;
                            v7_7 = this.e;
                            Object v2_0;
                            if (v0_8 == null) {
                                v2_0 = 0;
                            } else {
                                v2_0 = v0_8.hashCode();
                            }
                            v0_1 = new a1.c(v0_8, v2_0, v7_7);
                        } else {
                            int v1_9 = v2_6.h();
                            this.f = p7;
                            this.b = 2;
                            int v1_10 = v1_9.e(this);
                            if (v1_10 != v0_1) {
                                v0_8 = p7;
                                p7 = v1_10;
                                v7_7 = ((Number) p7).intValue();
                            }
                        }
                    }
                } else {
                    if (v1_7 == 1) {
                        v1_8 = this.c;
                        c4.b.e0(p7);
                    } else {
                        if (v1_7 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v0_8 = this.f;
                            c4.b.e0(p7);
                        }
                    }
                }
                return v0_1;
        }
    }
}
