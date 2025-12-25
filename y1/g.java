package y1;
public abstract class g {
    public static final t.l a;
    public static final Object b;
    public static a6.e c;

    static g()
    {
        y1.g.a = new t.l();
        y1.g.b = new Object();
        y1.g.c = 0;
        return;
    }

    public static long a(android.content.Context p3)
    {
        long v0_3 = p3.getApplicationContext().getPackageManager();
        if (android.os.Build$VERSION.SDK_INT < 33) {
            return v0_3.getPackageInfo(p3.getPackageName(), 0).lastUpdateTime;
        } else {
            return y1.e.a(v0_3, p3).lastUpdateTime;
        }
    }

    public static a6.e b()
    {
        a6.e v0_1 = new a6.e();
        y1.g.c = v0_1;
        y1.g.a.j(v0_1);
        return y1.g.c;
    }

    public static void c(android.content.Context p19, boolean p20)
    {
        try {
            if ((p20) || (y1.g.c == null)) {
                if ((p20) || (y1.g.c == null)) {
                    int v5 = 0;
                    try {
                        int v6_1 = p19.getAssets().openFd("dexopt/baseline.prof");
                        try {
                            long v0_9;
                            if (v6_1.getLength() <= 0) {
                                v0_9 = 0;
                            } else {
                                v0_9 = 1;
                            }
                        } catch (long v0_7) {
                            long v7_1 = v0_7;
                            if (v6_1 != 0) {
                                try {
                                    v6_1.close();
                                } catch (long v0_8) {
                                    v7_1.addSuppressed(v0_8);
                                }
                            }
                            throw v7_1;
                        }
                        v6_1.close();
                        int v6_2 = android.os.Build$VERSION.SDK_INT;
                        if (v6_2 >= 28) {
                            if (v6_2 != 30) {
                                int v6_7;
                                int v6_4 = new java.io.File(new java.io.File("/data/misc/profiles/ref/", p19.getPackageName()), "primary.prof");
                                long v7_6 = v6_4.length();
                                if ((!v6_4.exists()) || (v7_6 <= 0)) {
                                    v6_7 = 0;
                                } else {
                                    v6_7 = 1;
                                }
                                int v2_1;
                                int v9_2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0/", p19.getPackageName()), "primary.prof");
                                long v17 = v9_2.length();
                                if ((!v9_2.exists()) || (v17 <= 0)) {
                                    v2_1 = 0;
                                } else {
                                    v2_1 = 1;
                                }
                                long v15 = y1.g.a(p19);
                                int v9_6;
                                java.io.File v3_1 = new java.io.File(p19.getFilesDir(), "profileInstalled");
                                if (!v3_1.exists()) {
                                    v9_6 = 0;
                                } else {
                                    v9_6 = y1.f.a(v3_1);
                                }
                                if ((v9_6 == 0) || (v9_6.c != v15)) {
                                    if (v0_9 != 0) {
                                        if (v6_7 == 0) {
                                            if (v2_1 != 0) {
                                                v5 = 2;
                                            }
                                        } else {
                                            v5 = 1;
                                        }
                                    } else {
                                        v5 = 327680;
                                    }
                                } else {
                                    int v11_4 = v9_6.b;
                                    if (v11_4 != 2) {
                                        v5 = v11_4;
                                    } else {
                                    }
                                }
                                if ((p20) && ((v2_1 != 0) && (v5 != 1))) {
                                    v5 = 2;
                                }
                                if ((v9_6 != 0) && ((v9_6.b == 2) && ((v5 == 1) && (v7_6 < v9_6.d)))) {
                                    v5 = 3;
                                }
                                y1.f v12_1 = new y1.f(1, v5, v15, v17);
                                if ((v9_6 == 0) || (!v9_6.equals(v12_1))) {
                                    v12_1.b(v3_1);
                                }
                                y1.g.b();
                                return;
                            } else {
                            }
                        }
                        y1.g.b();
                    } catch (java.io.IOException) {
                        v0_9 = 0;
                    }
                } else {
                    return;
                }
            }
        } catch (long v0_5) {
            throw v0_5;
        }
        return;
    }
}
