package g8;
public abstract class z {
    public static final d4.l a;
    public static final d4.l b;

    static z()
    {
        g8.z.a = new d4.l("NONE", 4, 0);
        g8.z.b = new d4.l("PENDING", 4, 0);
        return;
    }

    public static final Object a(g8.b0 p4, a1.q p5, Throwable p6, n7.c p7)
    {
        g8.f v0_2;
        if (!(p7 instanceof g8.f)) {
            v0_2 = new g8.f(p7);
        } else {
            v0_2 = ((g8.f) p7);
            m7.a v1_2 = ((g8.f) p7).c;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((g8.f) p7).c = (v1_2 - -2147483648);
            }
        }
        Object v7_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.c;
        try {
            if (v2_0 == 0) {
                c4.b.e0(v7_1);
                v0_2.a = p6;
                v0_2.c = 1;
                if (p5.b(p4, p6, v0_2) == v1_1) {
                    return v1_1;
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    p6 = v0_2.a;
                    c4.b.e0(v7_1);
                }
            }
        } catch (h7.l v4_4) {
            if (p6 != null) {
                if (p6 != v4_4) {
                    q4.b.a(v4_4, p6);
                }
            }
            throw v4_4;
        }
        return h7.l.a;
    }

    public static final java.io.Serializable b(g8.c p4, g8.d p5, n7.c p6)
    {
        boolean v0_2;
        if (!(p6 instanceof g8.k)) {
            v0_2 = new g8.k(p6);
        } else {
            v0_2 = ((g8.k) p6);
            m7.a v1_2 = ((g8.k) p6).c;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((g8.k) p6).c = (v1_2 - -2147483648);
            }
        }
        boolean v6_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        g8.m v2_0 = v0_2.c;
        if (v2_0 == null) {
            c4.b.e0(v6_1);
            boolean v6_3 = new kotlin.jvm.internal.r();
            try {
                g8.m v2_2 = new g8.m(p5, v6_3);
                v0_2.a = v6_3;
                v0_2.c = 1;
            } catch (Throwable v5_1) {
                Throwable v4_2 = v6_3;
                Throwable v4_6 = ((Throwable) v4_2.a);
                if (v4_6 == null) {
                    boolean v6_7 = ((d8.e1) v0_2.getContext().get(d8.b0.b));
                    if (v6_7) {
                        if (v6_7.isCancelled()) {
                            boolean v6_8 = v6_7.getCancellationException();
                            if (v6_8) {
                                if (v6_8.equals(v5_1)) {
                                    throw v5_1;
                                }
                            }
                        }
                    }
                    if (v4_6 != null) {
                        if (!(v5_1 instanceof java.util.concurrent.CancellationException)) {
                            q4.b.a(v5_1, v4_6);
                            throw v5_1;
                        } else {
                            q4.b.a(v4_6, v5_1);
                            throw v4_6;
                        }
                    } else {
                        return v5_1;
                    }
                } else {
                    if (!v4_6.equals(v5_1)) {
                    }
                }
            }
            if (p4.f(v2_2, v0_2) == v1_1) {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v4_2 = v0_2.a;
                try {
                    c4.b.e0(v6_1);
                } catch (Throwable v5_1) {
                }
            }
        }
        return 0;
    }

    public static final Object c(g8.d p8, f8.p p9, boolean p10, n7.c p11)
    {
        g8.e v0_2;
        if (!(p11 instanceof g8.e)) {
            v0_2 = new g8.e(p11);
        } else {
            v0_2 = ((g8.e) p11);
            m7.a v1_2 = ((g8.e) p11).f;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((g8.e) p11).f = (v1_2 - -2147483648);
            }
        }
        g8.d v2_2;
        g8.d v2_3;
        Throwable v8_3;
        int v11_1 = v0_2.e;
        m7.a v1_1 = m7.a.a;
        g8.d v2_0 = v0_2.f;
        java.util.concurrent.CancellationException v3_1 = 0;
        try {
            if (v2_0 == null) {
                c4.b.e0(v11_1);
                if ((p8 instanceof g8.b0)) {
                    throw ((g8.b0) p8).a;
                } else {
                    int v11_3 = p9.d;
                    v11_3.getClass();
                    v2_2 = new f8.b(v11_3);
                    v0_2.a = p8;
                    v0_2.b = p9;
                    v0_2.c = v2_2;
                    v0_2.d = p10;
                    v0_2.f = 1;
                    v11_1 = v2_2.b(v0_2);
                    if (v11_1 != v1_1) {
                        v2_3 = p8;
                        v8_3 = v2_2;
                        if (!((Boolean) v11_1).booleanValue()) {
                            if (p10 != null) {
                                p9.cancel(0);
                            }
                            return h7.l.a;
                        } else {
                            int v11_6 = v8_3.a;
                            d4.l v6_0 = f8.e.p;
                            if (v11_6 == v6_0) {
                                throw new IllegalStateException("`hasNext()` has not been invoked");
                            } else {
                                v8_3.a = v6_0;
                                if (v11_6 == f8.e.l) {
                                    throw v8_3.c.n();
                                } else {
                                    v0_2.a = v2_3;
                                    v0_2.b = p9;
                                    v0_2.c = v8_3;
                                    v0_2.d = p10;
                                    v0_2.f = 2;
                                    if (v2_3.a(v11_6, v0_2) == v1_1) {
                                    }
                                }
                            }
                        }
                    } else {
                    }
                }
            } else {
                if (v2_0 == 1) {
                    p10 = v0_2.d;
                    v8_3 = v0_2.c;
                    p9 = v0_2.b;
                    v2_3 = v0_2.a;
                    c4.b.e0(v11_1);
                } else {
                    if (v2_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        p10 = v0_2.d;
                        v8_3 = v0_2.c;
                        p9 = v0_2.b;
                        v2_3 = v0_2.a;
                        c4.b.e0(v11_1);
                        v2_2 = v8_3;
                        p8 = v2_3;
                    }
                }
            }
        } catch (Throwable v8_10) {
            try {
                throw v8_10;
            } catch (int v11_10) {
                if (p10 != null) {
                    if ((v8_10 instanceof java.util.concurrent.CancellationException)) {
                        v3_1 = ((java.util.concurrent.CancellationException) v8_10);
                    }
                    if (v3_1 == null) {
                        v3_1 = new java.util.concurrent.CancellationException("Channel was consumed, consumer had failed");
                        v3_1.initCause(v8_10);
                    }
                    p9.cancel(v3_1);
                }
                throw v11_10;
            }
        }
        return v1_1;
    }

    public static final Object d(g8.c p6, n7.c p7)
    {
        h8.a v0_2;
        if (!(p7 instanceof g8.s)) {
            v0_2 = new g8.s(p7);
        } else {
            v0_2 = ((g8.s) p7);
            Object v1_2 = ((g8.s) p7).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((g8.s) p7).d = (v1_2 - -2147483648);
            }
        }
        h8.a v0_3;
        String v7_1 = v0_2.c;
        Object v1_1 = m7.a.a;
        g8.r v2_0 = v0_2.d;
        d4.l v3_0 = h8.f.a;
        if (v2_0 == null) {
            c4.b.e0(v7_1);
            String v7_3 = new kotlin.jvm.internal.r();
            v7_3.a = v3_0;
            g8.r v2_2 = new g8.r(v7_3, 0);
            try {
                v0_2.a = v7_3;
                v0_2.b = v2_2;
                v0_2.d = 1;
            } catch (java.util.NoSuchElementException v6_2) {
                v0_3 = v7_3;
                String v7_4 = v6_2;
                java.util.NoSuchElementException v6_3 = v2_2;
                if (v7_4.a != v6_3) {
                    throw v7_4;
                }
            }
            if (p6.f(v2_2, v0_2) != v1_1) {
                v0_3 = v7_3;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v6_3 = v0_2.b;
                v0_3 = v0_2.a;
                try {
                    c4.b.e0(v7_1);
                } catch (String v7_4) {
                }
            }
        }
        java.util.NoSuchElementException v6_6 = v0_3.a;
        if (v6_6 == v3_0) {
            throw new java.util.NoSuchElementException("Expected at least one element");
        } else {
            return v6_6;
        }
    }

    public static final Object e(g8.c p5, n7.c p6)
    {
        h8.a v0_2;
        if (!(p6 instanceof g8.t)) {
            v0_2 = new g8.t(p6);
        } else {
            v0_2 = ((g8.t) p6);
            Object v1_2 = ((g8.t) p6).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((g8.t) p6).d = (v1_2 - -2147483648);
            }
        }
        h8.a v0_3;
        h8.a v6_1 = v0_2.c;
        Object v1_1 = m7.a.a;
        g8.r v2_0 = v0_2.d;
        if (v2_0 == null) {
            c4.b.e0(v6_1);
            h8.a v6_3 = new kotlin.jvm.internal.r();
            g8.r v2_2 = new g8.r(v6_3, 1);
            try {
                v0_2.a = v6_3;
                v0_2.b = v2_2;
                v0_2.d = 1;
            } catch (Object v5_2) {
                v0_3 = v6_3;
                h8.a v6_4 = v5_2;
                Object v5_3 = v2_2;
                if (v6_4.a != v5_3) {
                    throw v6_4;
                }
            }
            if (p5.f(v2_2, v0_2) != v1_1) {
                v0_3 = v6_3;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v5_3 = v0_2.b;
                v0_3 = v0_2.a;
                try {
                    c4.b.e0(v6_1);
                } catch (h8.a v6_4) {
                }
            }
        }
        return v0_3.a;
    }

    public static final g8.c f(g8.w p7, l7.h p8, int p9, f8.a p10)
    {
        if (((((p9 < 0) || (p9 >= 2)) && (p9 != -2)) || (p10 != f8.a.b)) && (((p9 != 0) && (p9 != -3)) || (p10 != f8.a.a))) {
            return new g8.b(p7, p8, p9, p10, 1);
        } else {
            return p7;
        }
    }
}
