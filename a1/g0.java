package a1;
public final class g0 implements a1.h {
    public final a1.l0 a;
    public final l6.c b;
    public final d8.c0 c;
    public final l6.c d;
    public final m8.c e;
    public int f;
    public d8.w1 g;
    public final l6.c h;
    public final j6.s i;
    public final h7.j j;
    public final h7.j k;
    public final j6.s l;

    public g0(a1.l0 p3, java.util.List p4, l6.c p5, d8.c0 p6)
    {
        this.a = p3;
        this.b = p5;
        this.c = p6;
        this.d = new l6.c(new a1.t(this, 0, 0));
        this.e = m8.d.a();
        this.h = new l6.c(3);
        this.i = new j6.s(this, p4);
        this.j = a.a.F(new a1.m(this, 1));
        this.k = a.a.F(new a1.m(this, 0));
        this.l = new j6.s(p6, new a1.d0(this, 0), new a1.d(this, 0, 2));
        return;
    }

    public static final Object c(a1.g0 p4, n7.c p5)
    {
        int v0_3;
        if (!(p5 instanceof a1.u)) {
            v0_3 = new a1.u(p4, p5);
        } else {
            v0_3 = ((a1.u) p5);
            d8.w1 v1_4 = ((a1.u) p5).e;
            if ((v1_4 & -2147483648) == 0) {
            } else {
                ((a1.u) p5).e = (v1_4 - -2147483648);
            }
        }
        String v5_2;
        String v5_1 = v0_3.c;
        d8.w1 v1_1 = m7.a.a;
        int v2_0 = v0_3.e;
        if (v2_0 == 0) {
            c4.b.e0(v5_1);
            v5_2 = p4.e;
            v0_3.a = p4;
            v0_3.b = v5_2;
            v0_3.e = 1;
            if (v5_2.d(v0_3) == v1_1) {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                h7.l v4_3 = v0_3.b;
                int v0_4 = v0_3.a;
                c4.b.e0(v5_1);
                v5_2 = v4_3;
                p4 = v0_4;
            }
        }
        d8.w1 v1_3 = (p4.f - 1);
        p4.f = v1_3;
        if (v1_3 == null) {
            d8.w1 v1_5 = p4.g;
            if (v1_5 != null) {
                v1_5.cancel(0);
            }
            p4.g = 0;
        }
        v5_2.f(0);
        return h7.l.a;
    }

    public static final Object d(a1.g0 p9, a1.t0 p10, n7.c p11)
    {
        a1.v v0_2;
        if (!(p11 instanceof a1.v)) {
            v0_2 = new a1.v(p9, p11);
        } else {
            v0_2 = ((a1.v) p11);
            m7.a v1_2 = ((a1.v) p11).f;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.v) p11).f = (v1_2 - -2147483648);
            }
        }
        a5.o v9_10;
        Throwable v11_2;
        Throwable v11_1 = v0_2.d;
        m7.a v1_1 = m7.a.a;
        a1.r0 v2_0 = v0_2.f;
        a1.l1 v6_0 = 1;
        try {
            if (v2_0 == null) {
                c4.b.e0(v11_1);
                v11_2 = p10.b;
                a1.r0 v2_2 = p9.h.h();
                if (!(v2_2 instanceof a1.c)) {
                    if (!(v2_2 instanceof a1.d1)) {
                        v6_0 = (v2_2 instanceof a1.m1);
                    } else {
                    }
                    if (v6_0 == null) {
                        if (!(v2_2 instanceof a1.r0)) {
                            throw new a5.o();
                        } else {
                            throw ((a1.r0) v2_2).b;
                        }
                    } else {
                        if (v2_2 != p10.c) {
                            kotlin.jvm.internal.j.c(v2_2, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((a1.d1) v2_2).b;
                        } else {
                            v0_2.a = p10;
                            v0_2.b = p9;
                            v0_2.c = v11_2;
                            v0_2.f = 2;
                            if (p9.i(v0_2) != v1_1) {
                                a1.r0 v2_10 = p10.a;
                                h7.l v10_5 = p10.d;
                                v0_2.a = v11_2;
                                v0_2.b = 0;
                                v0_2.c = 0;
                                v0_2.f = 3;
                                try {
                                    v9_10 = p9.h().a(new a1.c0(p9, v10_5, v2_10, 0), v0_2);
                                } catch (a5.o v9_11) {
                                    h7.l v10_1 = v9_11;
                                    p9 = v11_2;
                                    v11_1 = c4.b.p(v10_1);
                                }
                                if (v9_10 != v1_1) {
                                    v11_1 = v9_10;
                                    p9 = v11_2;
                                } else {
                                    return v1_1;
                                }
                                p9 = ((d8.t) v0_2.a);
                                c4.b.e0(v11_1);
                            } else {
                                return v1_1;
                            }
                        }
                    }
                } else {
                    a1.r0 v2_7 = p10.a;
                    h7.l v10_3 = p10.d;
                    v0_2.a = v11_2;
                    v0_2.f = 1;
                    try {
                        v9_10 = p9.h().a(new a1.c0(p9, v10_3, v2_7, 0), v0_2);
                    } catch (a5.o v9_11) {
                    }
                    if (v9_10 != v1_1) {
                    }
                }
            } else {
                try {
                    if (v2_0 != 1) {
                        if (v2_0 == 2) {
                            a5.o v9_12 = v0_2.c;
                            h7.l v10_4 = v0_2.b;
                            a1.r0 v2_9 = ((a1.t0) v0_2.a);
                            c4.b.e0(v11_1);
                            v11_2 = v9_12;
                            p9 = v10_4;
                            p10 = v2_9;
                        } else {
                            if (v2_0 != 3) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                } catch (h7.l v10_1) {
                }
            }
        } catch (h7.l v10_1) {
        }
        h7.l v10_2 = h7.h.a(v11_1);
        if (v10_2 != null) {
            ((d8.u) p9).O(v10_2);
        } else {
            ((d8.u) p9).A(v11_1);
        }
        return h7.l.a;
    }

    public static final Object e(a1.g0 p4, n7.c p5)
    {
        int v0_3;
        if (!(p5 instanceof a1.w)) {
            v0_3 = new a1.w(p4, p5);
        } else {
            v0_3 = ((a1.w) p5);
            d8.w1 v1_4 = ((a1.w) p5).e;
            if ((v1_4 & -2147483648) == 0) {
            } else {
                ((a1.w) p5).e = (v1_4 - -2147483648);
            }
        }
        String v5_2;
        String v5_1 = v0_3.c;
        d8.w1 v1_1 = m7.a.a;
        a1.n v2_0 = v0_3.e;
        if (v2_0 == null) {
            c4.b.e0(v5_1);
            v5_2 = p4.e;
            v0_3.a = p4;
            v0_3.b = v5_2;
            v0_3.e = 1;
            if (v5_2.d(v0_3) == v1_1) {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                h7.l v4_3 = v0_3.b;
                int v0_4 = v0_3.a;
                c4.b.e0(v5_1);
                v5_2 = v4_3;
                p4 = v0_4;
            }
        }
        try {
            d8.w1 v1_3 = (p4.f + 1);
            p4.f = v1_3;
        } catch (h7.l v4_4) {
            v5_2.f(0);
            throw v4_4;
        }
        if (v1_3 == 1) {
            p4.g = d8.f0.p(p4.c, new a1.n(p4, 0, 1));
        }
        v5_2.f(0);
        return h7.l.a;
    }

    public static final Object f(a1.g0 p8, boolean p9, l7.c p10)
    {
        a1.y v0_2;
        if (!(p10 instanceof a1.y)) {
            v0_2 = new a1.y(p8, p10);
        } else {
            v0_2 = ((a1.y) p10);
            m7.a v1_2 = ((a1.y) p10).f;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.y) p10).f = (v1_2 - -2147483648);
            }
        }
        a1.g0 v8_6;
        a1.g0 v2_4;
        a1.g0 v8_4;
        Object v10_11;
        Object v10_2 = v0_2.d;
        m7.a v1_1 = m7.a.a;
        a1.g0 v2_0 = v0_2.f;
        if (v2_0 == null) {
            c4.b.e0(v10_2);
            Object v10_4 = p8.h.h();
            if ((v10_4 instanceof a1.m1)) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            } else {
                a1.g0 v2_2 = p8.h();
                v0_2.a = p8;
                v0_2.b = v10_4;
                v0_2.c = p9;
                v0_2.f = 1;
                a1.g0 v2_3 = v2_2.e(v0_2);
                if (v2_3 != v1_1) {
                    v2_4 = p8;
                    v8_4 = v10_4;
                    v10_2 = v2_3;
                    int v6;
                    int vtmp4 = ((Number) v10_2).intValue();
                    boolean v5_1 = (v8_4 instanceof a1.c);
                    if (!v5_1) {
                        v6 = -1;
                    } else {
                        v6 = v8_4.a;
                    }
                    if ((!v5_1) || (vtmp4 != v6)) {
                        if (p9 == null) {
                            a1.s0 v9_2 = v2_4.h();
                            Object v10_8 = new a1.a0(v2_4, v6, 0, 0);
                            v0_2.a = v2_4;
                            v0_2.b = 0;
                            v0_2.f = 3;
                            v10_2 = v9_2.b(v10_8, v0_2);
                            if (v10_2 != v1_1) {
                                v8_6 = v2_4;
                                v10_11 = ((h7.f) v10_2);
                            } else {
                                return v1_1;
                            }
                        } else {
                            a1.s0 v9_3 = v2_4.h();
                            Object v10_10 = new a1.z(v2_4, 0);
                            v0_2.a = v2_4;
                            v0_2.b = 0;
                            v0_2.f = 2;
                            v10_2 = v9_3.a(v10_10, v0_2);
                            if (v10_2 != v1_1) {
                                v8_6 = v2_4;
                                v10_11 = ((h7.f) v10_2);
                            }
                        }
                    } else {
                        return v8_4;
                    }
                }
            }
        } else {
            if (v2_0 == 1) {
                p9 = v0_2.c;
                v8_4 = v0_2.b;
                v2_4 = v0_2.a;
                c4.b.e0(v10_2);
            } else {
                if (v2_0 == 2) {
                    v8_6 = v0_2.a;
                    c4.b.e0(v10_2);
                } else {
                    if (v2_0 != 3) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v8_6 = v0_2.a;
                        c4.b.e0(v10_2);
                    }
                }
            }
        }
        a1.s0 v9_6 = ((a1.l1) v10_11.a);
        if (((Boolean) v10_11.b).booleanValue()) {
            v8_6.h.l(v9_6);
        }
        return v9_6;
    }

    public static final Object g(a1.g0 p9, boolean p10, n7.c p11)
    {
        Object v0_4;
        if (!(p11 instanceof a1.b0)) {
            v0_4 = new a1.b0(p9, p11);
        } else {
            v0_4 = ((a1.b0) p11);
            a1.c v1_3 = ((a1.b0) p11).o;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((a1.b0) p11).o = (v1_3 - -2147483648);
            }
        }
        try {
            Object v2_0;
            Object v5_1;
            int v9_6;
            int v9_1;
            Object v10_4;
            Object v11_1 = v0_4.m;
            a1.c v1_1 = m7.a.a;
            int v3_0 = 0;
            switch (v0_4.o) {
                case 0:
                    c4.b.e0(v11_1);
                    if (p10 == null) {
                        Object v11_7 = p9.h();
                        v0_4.a = p9;
                        v0_4.e = p10;
                        v0_4.o = 3;
                        v11_1 = v11_7.e(v0_4);
                        if (v11_1 != v1_1) {
                            Object v11_9 = ((Number) v11_1).intValue();
                            Object v2_7 = p9.h();
                            Object v5_10 = new a1.a0(p9, v11_9, 0, 1);
                            v0_4.a = p9;
                            v0_4.e = p10;
                            v0_4.o = 4;
                            v11_1 = v2_7.b(v5_10, v0_4);
                            if (v11_1 != v1_1) {
                                return ((a1.c) v11_1);
                            } else {
                            }
                        } else {
                        }
                    } else {
                        v0_4.a = p9;
                        v0_4.e = p10;
                        v0_4.o = 1;
                        v11_1 = p9.j(v0_4);
                        if (v11_1 != v1_1) {
                            Object v2_8;
                            if (v11_1 == null) {
                                v2_8 = 0;
                            } else {
                                v2_8 = v11_1.hashCode();
                            }
                            Object v5_11 = p9.h();
                            v0_4.a = p9;
                            v0_4.b = v11_1;
                            v0_4.e = p10;
                            v0_4.f = v2_8;
                            v0_4.o = 2;
                            Object v5_0 = v5_11.e(v0_4);
                            if (v5_0 != v1_1) {
                                v5_1 = p9;
                                v9_1 = v2_8;
                                v2_0 = v11_1;
                                v11_1 = v5_0;
                                return new a1.c(v2_0, v9_1, ((Number) v11_1).intValue());
                            } else {
                            }
                        } else {
                        }
                    }
                case 1:
                    p10 = v0_4.e;
                    p9 = ((a1.g0) v0_4.a);
                    c4.b.e0(v11_1);
                    break;
                case 2:
                    v9_1 = v0_4.f;
                    p10 = v0_4.e;
                    v2_0 = v0_4.b;
                    v5_1 = ((a1.g0) v0_4.a);
                    c4.b.e0(v11_1);
                    return new a1.c(v2_0, v9_1, ((Number) v11_1).intValue());
                case 3:
                    p10 = v0_4.e;
                    p9 = ((a1.g0) v0_4.a);
                    c4.b.e0(v11_1);
                    break;
                case 4:
                    p10 = v0_4.e;
                    p9 = ((a1.g0) v0_4.a);
                    c4.b.e0(v11_1);
                    return ((a1.c) v11_1);
                case 5:
                    int v9_2 = v0_4.e;
                    Object v10_1 = v0_4.d;
                    Object v2_2 = ((kotlin.jvm.internal.r) v0_4.c);
                    Object v5_6 = ((a1.b) v0_4.b);
                    int v6_4 = ((a1.g0) v0_4.a);
                    c4.b.e0(v11_1);
                    v10_1.a = v11_1;
                    Object v10_3 = new kotlin.jvm.internal.p();
                    try {
                        int v9_4;
                        Object v11_6 = new a1.c0(v2_2, v6_4, v10_3, 0);
                        v0_4.a = v5_6;
                        v0_4.b = v2_2;
                        v0_4.c = v10_3;
                        v0_4.d = 0;
                        v0_4.o = 6;
                    } catch (int v9_5) {
                        Object v0_1 = v5_6;
                        q4.b.a(v0_1, v9_5);
                        throw v0_1;
                    }
                    if (v9_2 == 0) {
                        v9_4 = v6_4.h().a(new a1.f(v11_6, 0, 1), v0_4);
                    } else {
                        v6_4.getClass();
                        v9_4 = v11_6.invoke(v0_4);
                    }
                    if (v9_4 != v1_1) {
                        v9_6 = v10_3;
                        v10_4 = v2_2;
                        Object v10_5 = v10_4.a;
                        if (v10_5 != null) {
                            v3_0 = v10_5.hashCode();
                        }
                        v1_1 = new a1.c(v10_5, v3_0, v9_6.a);
                    } else {
                    }
                    break;
                case 6:
                    v9_6 = ((kotlin.jvm.internal.p) v0_4.c);
                    v10_4 = ((kotlin.jvm.internal.r) v0_4.b);
                    v0_1 = ((a1.b) v0_4.a);
                    try {
                        c4.b.e0(v11_1);
                    } catch (int v9_5) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        } catch (Object v11_4) {
            v2_2 = new kotlin.jvm.internal.r();
            Object v5_2 = p9.b;
            v0_4.a = p9;
            v0_4.b = v11_4;
            v0_4.c = v2_2;
            v0_4.d = v2_2;
            v0_4.e = p10;
            v0_4.o = 5;
            Object v5_5 = ((u7.l) v5_2.b).invoke(v11_4);
            if (v5_5 != v1_1) {
                v5_6 = v11_4;
                v11_1 = v5_5;
                v6_4 = p9;
                v9_2 = p10;
                v10_1 = v2_2;
            } else {
            }
        } catch (Object v11_4) {
            p9 = v5_1;
        }
        return v1_1;
    }

    public final Object a(u7.p p4, n7.c p5)
    {
        a1.t v0_4 = ((a1.p1) p5.getContext().get(a1.o1.a));
        if (v0_4 != null) {
            v0_4.a(this);
        }
        return d8.f0.x(new a1.p1(v0_4, this), new a1.t(this, p4, 0), p5);
    }

    public final g8.c b()
    {
        return this.d;
    }

    public final a1.s0 h()
    {
        return ((a1.s0) this.k.getValue());
    }

    public final Object i(n7.c p6)
    {
        l6.c v0_2;
        if (!(p6 instanceof a1.x)) {
            v0_2 = new a1.x(this, p6);
        } else {
            v0_2 = ((a1.x) p6);
            h7.l v1_2 = ((a1.x) p6).e;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.x) p6).e = (v1_2 - -2147483648);
            }
        }
        a1.d1 v2_1;
        Throwable v6_1 = v0_2.c;
        h7.l v1_1 = m7.a.a;
        a1.d1 v2_0 = v0_2.e;
        if (v2_0 == null) {
            c4.b.e0(v6_1);
            Throwable v6_2 = this.h();
            v0_2.a = this;
            v0_2.e = 1;
            v6_1 = v6_2.e(v0_2);
            if (v6_1 != v1_1) {
                v2_1 = this;
                Throwable v6_4 = ((Number) v6_1).intValue();
                try {
                    j6.s v4_1 = v2_1.i;
                    v0_2.a = v2_1;
                    v0_2.b = v6_4;
                    v0_2.e = 2;
                    Throwable v6_5 = v4_1.q(v0_2);
                } catch (l6.c v0_3) {
                    h7.l v1_3 = v6_5;
                    Throwable v6_6 = v0_3;
                    l6.c v0_4 = v2_1;
                    v0_4.h.l(new a1.d1(v1_3, v6_6));
                    throw v6_6;
                }
                if (v6_5 == v1_1) {
                    return v1_1;
                }
            }
        } else {
            if (v2_0 == 1) {
                v2_1 = v0_2.a;
                c4.b.e0(v6_1);
            } else {
                if (v2_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v1_3 = v0_2.b;
                    v0_4 = v0_2.a;
                    try {
                        c4.b.e0(v6_1);
                    } catch (Throwable v6_6) {
                    }
                }
            }
        }
        return h7.l.a;
    }

    public final Object j(n7.c p5)
    {
        return ((a1.o0) this.j.getValue()).a(new a1.q(3, 0), p5);
    }

    public final Object k(Object p11, boolean p12, n7.c p13)
    {
        a1.e0 v0_2;
        if (!(p13 instanceof a1.e0)) {
            v0_2 = new a1.e0(this, p13);
        } else {
            v0_2 = ((a1.e0) p13);
            m7.a v1_2 = ((a1.e0) p13).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.e0) p13).d = (v1_2 - -2147483648);
            }
        }
        int v11_2;
        a1.o0 v13_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.d;
        if (v2_0 == 0) {
            c4.b.e0(v13_1);
            kotlin.jvm.internal.p v5_1 = new kotlin.jvm.internal.p();
            a1.o0 v13_4 = ((a1.o0) this.j.getValue());
            a1.f0 v4_1 = new a1.f0(v5_1, this, p11, p12, 0);
            v0_2.a = v5_1;
            v0_2.d = 1;
            if (v13_4.b(v4_1, v0_2) != v1_1) {
                v11_2 = v5_1;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v11_2 = v0_2.a;
                c4.b.e0(v13_1);
            }
        }
        return new Integer(v11_2.a);
    }
}
