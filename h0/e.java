package h0;
public abstract class e {
    public static final c4.b a;
    public static final r.i b;

    static e()
    {
        j5.t1.c("TypefaceCompat static init");
        h0.f v0_7 = android.os.Build$VERSION.SDK_INT;
        if (v0_7 < 29) {
            if (v0_7 < 28) {
                h0.e.a = new h0.f();
            } else {
                h0.e.a = new h0.g();
            }
        } else {
            h0.e.a = new h0.h();
        }
        h0.e.b = new r.i(16);
        android.os.Trace.endSection();
        return;
    }

    public static android.graphics.Typeface a(android.content.Context p16, g0.e p17, android.content.res.Resources p18, int p19, String p20, int p21, int p22, g0.b p23, boolean p24)
    {
        n0.g v0_3;
        if (!(p17 instanceof g0.h)) {
            v0_3 = h0.e.a.r(p16, ((g0.f) p17), p18, p22);
            if (p23 != null) {
                if (v0_3 == null) {
                    p23.a(-3);
                } else {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new a5.i(5, p23, v0_3));
                }
            }
        } else {
            java.util.concurrent.TimeUnit v3_13;
            java.util.concurrent.TimeUnit v3_12 = ((g0.h) p17).e;
            android.graphics.Typeface v7_1 = 0;
            if ((v3_12 != null) && (!v3_12.isEmpty())) {
                v3_13 = android.graphics.Typeface.create(v3_12, 0);
                android.graphics.Typeface vtmp4 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
                if ((v3_13 == null) || (v3_13.equals(vtmp4))) {
                    v3_13 = 0;
                }
            }
            if (v3_13 == null) {
                java.util.concurrent.TimeUnit v3_16;
                if (!p24) {
                    if (p23 != null) {
                        v3_16 = 0;
                    } else {
                        v3_16 = 1;
                    }
                } else {
                    if (((g0.h) p17).d != 0) {
                    }
                }
                int v10;
                if (!p24) {
                    v10 = -1;
                } else {
                    v10 = ((g0.h) p17).c;
                }
                n0.g v0_34;
                int v11_1 = new android.os.Handler(android.os.Looper.getMainLooper());
                l6.c v12_2 = new l6.c(23, 0);
                v12_2.b = p23;
                RuntimeException v1_19 = ((g0.h) p17).b;
                if (v1_19 == null) {
                    n0.g v0_32 = new Object[] {((g0.h) p17).a});
                    RuntimeException v1_21 = new java.util.ArrayList(1);
                    n0.g v0_33 = v0_32[0];
                    java.util.Objects.requireNonNull(v0_33);
                    v1_21.add(v0_33);
                    v0_34 = java.util.Collections.unmodifiableList(v1_21);
                } else {
                    n0.g v0_36 = new Object[] {((g0.h) p17).a, v1_19});
                    RuntimeException v1_23 = new java.util.ArrayList(2);
                    int v14_0 = 0;
                    while (v14_0 < 2) {
                        android.graphics.Typeface v15_5 = v0_36[v14_0];
                        java.util.Objects.requireNonNull(v15_5);
                        v1_23.add(v15_5);
                        v14_0++;
                    }
                    v0_34 = java.util.Collections.unmodifiableList(v1_23);
                }
                RuntimeException v1_25 = new m0.f(v11_1, 1);
                int v14_2 = new n0.a(0, v12_2, v1_25);
                if (v3_16 == null) {
                    com.google.android.material.datepicker.g v2_11 = n0.h.a(p22, v0_34);
                    java.util.concurrent.TimeUnit v3_20 = ((android.graphics.Typeface) n0.h.a.get(v2_11));
                    if (v3_20 == null) {
                        RuntimeException v1_27 = new n0.f(v14_2, 0);
                        n0.l v5_7 = n0.h.d;
                        java.util.ArrayList v6_1 = ((java.util.ArrayList) v5_7.get(v2_11));
                        if (v6_1 == null) {
                            RuntimeException v1_3;
                            java.util.ArrayList v6_3 = new java.util.ArrayList();
                            v6_3.add(v1_27);
                            v5_7.put(v2_11, v6_3);
                            RuntimeException v1_0 = v2_11;
                            n0.g v0_2 = new n0.e(v1_0, p16, v0_34, p22, 1);
                            java.util.concurrent.TimeUnit v3_2 = new n0.f(v1_0, 1);
                            if (android.os.Looper.myLooper() != null) {
                                v1_3 = new android.os.Handler();
                            } else {
                                v1_3 = new android.os.Handler(android.os.Looper.getMainLooper());
                            }
                            n0.l v5_3 = new n0.l();
                            v5_3.b = v0_2;
                            v5_3.c = v3_2;
                            v5_3.d = v1_3;
                            n0.h.b.execute(v5_3);
                        } else {
                            v6_1.add(v1_27);
                        }
                    } else {
                        v1_25.execute(new b5.l(7, v12_2, v3_20));
                        v7_1 = v3_20;
                    }
                } else {
                    if (v0_34.size() > 1) {
                        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                    } else {
                        java.util.concurrent.TimeUnit v3_5 = ((n0.d) v0_34.get(0));
                        n0.g v0_10 = new Object[] {v3_5});
                        android.graphics.Typeface v15_1 = new java.util.ArrayList(1);
                        n0.g v0_11 = v0_10[0];
                        java.util.Objects.requireNonNull(v0_11);
                        v15_1.add(v0_11);
                        n0.g v0_13 = n0.h.a(p22, java.util.Collections.unmodifiableList(v15_1));
                        android.graphics.Typeface v15_4 = ((android.graphics.Typeface) n0.h.a.get(v0_13));
                        if (v15_4 == null) {
                            if (v10 != -1) {
                                try {
                                } catch (InterruptedException) {
                                    ((m0.f) v14_2.c).execute(new com.google.android.material.datepicker.g(((l6.c) v14_2.b), -3, 2));
                                }
                                n0.g v0_22 = ((n0.g) n0.h.b.submit(new n0.e(v0_13, p16, v3_5, p22, 0)).get(((long) v10), java.util.concurrent.TimeUnit.MILLISECONDS));
                                v14_2.k(v0_22);
                                v7_1 = v0_22.a;
                            } else {
                                RuntimeException v1_14 = new Object[] {v3_5});
                                java.util.concurrent.TimeUnit v3_10 = new java.util.ArrayList(1);
                                RuntimeException v1_15 = v1_14[0];
                                java.util.Objects.requireNonNull(v1_15);
                                v3_10.add(v1_15);
                                n0.g v0_25 = n0.h.b(v0_13, p16, java.util.Collections.unmodifiableList(v3_10), p22);
                                v14_2.k(v0_25);
                                v7_1 = v0_25.a;
                            }
                        } else {
                            v1_25.execute(new b5.l(7, v12_2, v15_4));
                            v7_1 = v15_4;
                        }
                    }
                }
                v0_3 = v7_1;
            } else {
                if (p23 != null) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new a5.i(5, p23, v3_13));
                }
                return v3_13;
            }
        }
        if (v0_3 != null) {
            h0.e.b.put(h0.e.b(p18, p19, p20, p21, p22), v0_3);
        }
        return v0_3;
    }

    public static String b(android.content.res.Resources p1, int p2, String p3, int p4, int p5)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p1.getResourcePackageName(p2));
        v0_1.append(45);
        v0_1.append(p3);
        v0_1.append(45);
        v0_1.append(p4);
        v0_1.append(45);
        v0_1.append(p2);
        v0_1.append(45);
        v0_1.append(p5);
        return v0_1.toString();
    }
}
