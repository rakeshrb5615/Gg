package n0;
public abstract class h {
    public static final r.i a;
    public static final java.util.concurrent.ThreadPoolExecutor b;
    public static final Object c;
    public static final r.j d;

    static h()
    {
        n0.h.a = new r.i(16);
        java.util.concurrent.ThreadPoolExecutor v2_0 = new java.util.concurrent.ThreadPoolExecutor(0, 1, ((long) 10000), java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new n0.k());
        v2_0.allowCoreThreadTimeOut(1);
        n0.h.b = v2_0;
        n0.h.c = new Object();
        n0.h.d = new r.j(0);
        return;
    }

    public static String a(int p3, java.util.List p4)
    {
        StringBuilder v0_1 = new StringBuilder();
        int v1 = 0;
        while (v1 < p4.size()) {
            v0_1.append(((n0.d) p4.get(v1)).e);
            v0_1.append("-");
            v0_1.append(p3);
            if (v1 < (p4.size() - 1)) {
                v0_1.append(";");
            }
            v1++;
        }
        return v0_1.toString();
    }

    public static n0.g b(String p8, android.content.Context p9, java.util.List p10, int p11)
    {
        r.i v0 = n0.h.a;
        j5.t1.c("getFontSync");
        try {
            c4.b v1_4 = ((android.graphics.Typeface) v0.get(p8));
        } catch (n0.g v8_6) {
            android.os.Trace.endSection();
            throw v8_6;
        }
        if (v1_4 == null) {
            try {
                int v10_11 = n0.c.a(p9, p10);
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                n0.g v8_1 = new n0.g(-1);
                android.os.Trace.endSection();
                return v8_1;
            }
            int v10_4;
            c4.b v1_2 = ((java.util.List) v10_11.c);
            int v10_1 = v10_11.b;
            if (v10_1 == 0) {
                int v10_3 = ((n0.i[]) v1_2.get(0));
                if (v10_3 != 0) {
                    if (v10_3.length != 0) {
                        int v6 = 0;
                        while (v6 < v10_3.length) {
                            int v7_1 = v10_3[v6].e;
                            if (v7_1 == 0) {
                                v6++;
                            } else {
                                if (v7_1 >= 0) {
                                    v10_4 = v7_1;
                                    if (v10_4 == 0) {
                                        if ((v1_2.size() <= 1) || (android.os.Build$VERSION.SDK_INT < 29)) {
                                            int v10_8 = ((n0.i[]) v1_2.get(0));
                                            j5.t1.c("TypefaceCompat.createFromFontInfo");
                                            try {
                                                android.graphics.Typeface v9_2 = h0.e.a.s(p9, v10_8, p11);
                                            } catch (n0.g v8_2) {
                                                android.os.Trace.endSection();
                                                throw v8_2;
                                            }
                                            android.os.Trace.endSection();
                                        } else {
                                            j5.t1.c("TypefaceCompat.createFromFontInfoWithFallback");
                                            v9_2 = h0.e.a.t(p9, v1_2, p11);
                                            android.os.Trace.endSection();
                                        }
                                        if (v9_2 == null) {
                                            n0.g v8_5 = new n0.g(-3);
                                            android.os.Trace.endSection();
                                            return v8_5;
                                        } else {
                                            v0.put(p8, v9_2);
                                            n0.g v8_8 = new n0.g(v9_2);
                                            android.os.Trace.endSection();
                                            return v8_8;
                                        }
                                    } else {
                                        n0.g v8_10 = new n0.g(v10_4);
                                        android.os.Trace.endSection();
                                        return v8_10;
                                    }
                                } else {
                                    v10_4 = -3;
                                }
                            }
                        }
                        v10_4 = 0;
                    } else {
                    }
                }
                v10_4 = 1;
            } else {
                if (v10_1 == 1) {
                    v10_4 = -2;
                }
            }
        } else {
            n0.g v8_12 = new n0.g(v1_4);
            android.os.Trace.endSection();
            return v8_12;
        }
    }
}
