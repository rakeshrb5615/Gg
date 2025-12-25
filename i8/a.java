package i8;
public abstract class a {
    public static final d4.l a;
    public static final d4.l b;
    public static final d4.l c;
    public static final d4.l d;
    public static final d8.x e;
    public static final d8.x f;
    public static final d8.x g;

    static synthetic a()
    {
        i8.a.a = new d4.l("CLOSED", 4, 0);
        i8.a.b = new d4.l("UNDEFINED", 4, 0);
        i8.a.c = new d4.l("REUSABLE_CLAIMED", 4, 0);
        i8.a.d = new d4.l("NO_THREAD_ELEMENTS", 4, 0);
        i8.a.e = new d8.x(4);
        i8.a.f = new d8.x(5);
        i8.a.g = new d8.x(6);
        return;
    }

    public static final void a(int p1)
    {
        if (p1 < 1) {
            throw new IllegalArgumentException(g2.g.c(p1, "Expected positive parallelism level, but got ").toString());
        } else {
            return;
        }
    }

    public static final Object b(i8.r p5, long p6, u7.p p8)
    {
        while ((p5.c < p6) || (p5.d())) {
            boolean v0_4 = i8.b.a;
            i8.r v1_6 = v0_4.get(p5);
            Object v2_0 = i8.a.a;
            if (v1_6 != v2_0) {
                i8.r v1_1 = ((i8.r) ((i8.b) v1_6));
                if (v1_1 == null) {
                    v1_1 = ((i8.r) p8.invoke(Long.valueOf((p5.c + 1)), p5));
                    while (!v0_4.compareAndSet(p5, 0, v1_1)) {
                        if (v0_4.get(p5) != null) {
                        }
                    }
                    if (p5.d()) {
                        p5.e();
                    }
                }
                p5 = v1_1;
            } else {
                return v2_0;
            }
        }
        return p5;
    }

    public static final i8.r c(Object p1)
    {
        if (p1 == i8.a.a) {
            throw new IllegalStateException("Does not contain segment");
        } else {
            return ((i8.r) p1);
        }
    }

    public static final void d(Throwable p4, l7.h p5)
    {
        Thread$UncaughtExceptionHandler v0_2 = i8.d.a.iterator();
        while (v0_2.hasNext()) {
            try {
                ((e8.b) v0_2.next()).i(p4);
            } catch (Thread v1_2) {
                if (p4 != v1_2) {
                    RuntimeException v2_1 = new RuntimeException("Exception while trying to handle coroutine exception", v1_2);
                    q4.b.a(v2_1, p4);
                } else {
                    v2_1 = p4;
                }
                Thread v1_3 = Thread.currentThread();
                v1_3.getUncaughtExceptionHandler().uncaughtException(v1_3, v2_1);
            }
        }
        try {
            q4.b.a(p4, new i8.e(p5));
        } catch (Throwable) {
        }
        Thread v5_1 = Thread.currentThread();
        v5_1.getUncaughtExceptionHandler().uncaughtException(v5_1, p4);
        return;
    }

    public static final boolean e(Object p1)
    {
        if (p1 != i8.a.a) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final Object f(Object p2, Object p3)
    {
        if (p2 != null) {
            if (!(p2 instanceof java.util.ArrayList)) {
                java.util.ArrayList v0_3 = new java.util.ArrayList(4);
                v0_3.add(p2);
                v0_3.add(p3);
                return v0_3;
            } else {
                ((java.util.ArrayList) p2).add(p3);
                return p2;
            }
        } else {
            return p3;
        }
    }

    public static final void g(l7.h p2, Object p3)
    {
        if (p3 != i8.a.d) {
            if (!(p3 instanceof i8.v)) {
                Object v2_3 = p2.fold(0, i8.a.f);
                kotlin.jvm.internal.j.c(v2_3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                v1.a.t(v2_3);
                throw 0;
            } else {
                if ((((i8.v) p3).b.length - 1) >= 0) {
                    kotlin.jvm.internal.j.b(0);
                    throw 0;
                }
            }
        }
        return;
    }

    public static final void h(Object p9, l7.c p10)
    {
        if (!(p10 instanceof i8.f)) {
            p10.resumeWith(p9);
            return;
        } else {
            l7.h v3_1;
            d8.x0 v0_2 = ((i8.f) p10).d;
            boolean v1_1 = ((i8.f) p10).e;
            Object v2_8 = h7.h.a(p9);
            if (v2_8 != null) {
                v3_1 = new d8.w(0, v2_8);
            } else {
                v3_1 = p9;
            }
            if (!v0_2.s(v1_1.getContext())) {
                d8.x0 v0_1 = d8.z1.a();
                if (v0_1.c < 4294967296) {
                    v0_1.A(1);
                    Object v2_5 = ((d8.e1) v1_1.getContext().get(d8.b0.b));
                    if ((v2_5 == null) || (v2_5.isActive())) {
                        int v5_2;
                        Object v2_6 = ((i8.f) p10).m;
                        l7.h v3_4 = v1_1.getContext();
                        Object v2_7 = i8.a.l(v3_4, v2_6);
                        if (v2_7 == i8.a.d) {
                            v5_2 = 0;
                        } else {
                            v5_2 = d8.f0.w(v1_1, v3_4, v2_7);
                        }
                        try {
                            v1_1.resumeWith(p9);
                        } catch (boolean v9_1) {
                            if (v5_2 == 0) {
                                i8.a.g(v3_4, v2_7);
                            } else {
                                if (v5_2.R()) {
                                }
                            }
                            throw v9_1;
                        }
                        if ((v5_2 == 0) || (v5_2.R())) {
                            i8.a.g(v3_4, v2_7);
                        }
                    } else {
                        ((i8.f) p10).resumeWith(c4.b.p(v2_5.getCancellationException()));
                    }
                    while (v0_1.C()) {
                    }
                    v0_1.y(1);
                } else {
                    ((i8.f) p10).f = v3_1;
                    ((i8.f) p10).c = 1;
                    boolean v9_8 = v0_1.e;
                    if (!v9_8) {
                        v9_8 = new i7.g();
                        v0_1.e = v9_8;
                    }
                    v9_8.addLast(((i8.f) p10));
                }
                return;
            } else {
                ((i8.f) p10).f = v3_1;
                ((i8.f) p10).c = 1;
                v0_2.i(v1_1.getContext(), ((i8.f) p10));
                return;
            }
        }
    }

    public static final long i(long p23, long p25, long p27, String p29)
    {
        try {
            int v6_0 = System.getProperty(p29);
        } catch (SecurityException) {
            v6_0 = 0;
        }
        if (v6_0 != 0) {
            int v19;
            long v5_2;
            kotlin.jvm.internal.j.e(v6_0, "<this>");
            a.a.j(10);
            long v8_0 = v6_0.length();
            if (v8_0 != 0) {
                int v11_2;
                int v9_0 = 0;
                long v10_0 = v6_0.charAt(0);
                long v12 = -9223372036854775807;
                if (kotlin.jvm.internal.j.f(v10_0, 48) >= 0) {
                    v11_2 = 0;
                } else {
                    v11_2 = 1;
                    if (v8_0 != 1) {
                        if (v10_0 == 43) {
                            v11_2 = 0;
                            v9_0 = 1;
                        } else {
                            if (v10_0 == 45) {
                                v12 = -9223372036854775808;
                                v9_0 = 1;
                            } else {
                                v19 = v6_0;
                                v5_2 = 0;
                                if (v5_2 == 0) {
                                    String v1_1 = new StringBuilder("System property \'");
                                    v1_1.append(p29);
                                    v1_1.append("\' has unrecognized value \'");
                                    v1_1.append(v19);
                                    v1_1.append(39);
                                    throw new IllegalStateException(v1_1.toString().toString());
                                } else {
                                    long v8_1 = v5_2.longValue();
                                    if ((p25 > v8_1) || (v8_1 > p27)) {
                                        long v10_5 = new StringBuilder("System property \'");
                                        v10_5.append(p29);
                                        v10_5.append("\' should be in range ");
                                        v10_5.append(p25);
                                        v10_5.append("..");
                                        v10_5.append(p27);
                                        v10_5.append(", but is \'");
                                        v10_5.append(v8_1);
                                        v10_5.append(39);
                                        throw new IllegalStateException(v10_5.toString().toString());
                                    } else {
                                        return v8_1;
                                    }
                                }
                            }
                        }
                    }
                }
                long v14_1 = 0;
                long v16_1 = -256204778801521550;
                while (v9_0 < v8_0) {
                    long v10_2 = Character.digit(v6_0.charAt(v9_0), 10);
                    if (v10_2 >= 0) {
                        if (v14_1 >= v16_1) {
                            v19 = v6_0;
                        } else {
                            if (v16_1 != -256204778801521550) {
                            } else {
                                v19 = v6_0;
                                v16_1 = (v12 / ((long) 10));
                                if (v14_1 < v16_1) {
                                }
                            }
                        }
                        long v14_2 = (v14_1 * ((long) 10));
                        long v5_6 = ((long) v10_2);
                        if (v14_2 >= (v12 + v5_6)) {
                            v14_1 = (v14_2 - v5_6);
                            v9_0++;
                            v6_0 = v19;
                        }
                    }
                }
                v19 = v6_0;
                if (v11_2 == 0) {
                    v5_2 = Long.valueOf((- v14_1));
                } else {
                    v5_2 = Long.valueOf(v14_1);
                }
            }
        } else {
            return p23;
        }
    }

    public static int j(int p7, int p8, String p9)
    {
        int v8_2;
        if ((p8 & 8) == 0) {
            v8_2 = 2097150;
        } else {
            v8_2 = 2147483647;
        }
        return ((int) i8.a.i(((long) p7), ((long) 1), ((long) v8_2), p9));
    }

    public static final Object k(l7.h p2)
    {
        Object v2_1 = p2.fold(Integer.valueOf(0), i8.a.e);
        kotlin.jvm.internal.j.b(v2_1);
        return v2_1;
    }

    public static final Object l(l7.h p1, Object p2)
    {
        if (p2 == null) {
            p2 = i8.a.k(p1);
        }
        if (p2 != Integer.valueOf(0)) {
            if (!(p2 instanceof Integer)) {
                v1.a.t(p2);
                throw 0;
            } else {
                return p1.fold(new i8.v(((Number) p2).intValue(), p1), i8.a.g);
            }
        } else {
            return i8.a.d;
        }
    }
}
