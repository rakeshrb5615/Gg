package y8;
public abstract class a {
    public static final byte[] a;
    public static final long[] b;

    static a()
    {
        long[] v0_1 = "0123456789abcdef".getBytes(b8.a.a);
        kotlin.jvm.internal.j.d(v0_1, "getBytes(...)");
        y8.a.a = v0_1;
        long[] v0_3 = new long[20];
        v0_3 = {nan, 4.4e-323, 4.9e-322, 4.936e-321, 4.94e-320, 4.9406e-319, 4.94065e-318, 4.940656e-317, 4.9406564e-316, 4.940656453e-315, 4.940656458e-314, 4.94065645836e-313, 4.940656458408e-312, 4.940656458412e-311, 4.9406564584124e-310, 4.94065645841246e-309, 5.431165199810527e-308, 5.620395787888204e-302, 7.832953389245684e-242, nan};
        y8.a.b = v0_3;
        return;
    }

    public static final boolean a(x8.c0 p5, int p6, byte[] p7, int p8, int p9)
    {
        int v0_0 = p5.c;
        byte[] v1_0 = p5.a;
        while (p8 < p9) {
            if (p6 == v0_0) {
                p5 = p5.f;
                kotlin.jvm.internal.j.b(p5);
                v1_0 = p5.a;
                p6 = p5.b;
                v0_0 = p5.c;
            }
            if (v1_0[p6] == p7[p8]) {
                p6++;
                p8++;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static final String b(x8.g p6, long p7)
    {
        if (p7 > 0) {
            long v3 = (p7 - 1);
            if (p6.A(v3) == 13) {
                String v7_3 = p6.F(v3, b8.a.a);
                p6.skip(2);
                return v7_3;
            }
        }
        String v7_1 = p6.F(p7, b8.a.a);
        p6.skip(1);
        return v7_1;
    }

    public static final int c(x8.g p16, x8.x p17, boolean p18)
    {
        kotlin.jvm.internal.j.e(p17, "options");
        x8.c0 v1_2 = p16.a;
        if (v1_2 != null) {
            int v3_1 = v1_2.a;
            x8.c0 v4_6 = v1_2.b;
            int v5_2 = v1_2.c;
            int v0_1 = p17.b;
            int v8_0 = v1_2;
            int v9 = -1;
            int v7_0 = 0;
            while(true) {
                int v11_0 = v0_1[v7_0];
                int v7_1 = (v7_0 + 2);
                int v10_1 = v0_1[(v7_0 + 1)];
                if (v10_1 != -1) {
                    v9 = v10_1;
                }
                if (v8_0 == 0) {
                    break;
                }
                int v7_3;
                x8.c0 v4_2;
                int v5_0;
                if (v11_0 >= 0) {
                    int v12_0 = (v4_6 + 1);
                    int v13_0 = (v7_1 + v11_0);
                    while (v7_1 != v13_0) {
                        if ((v3_1[v4_6] & 255) != v0_1[v7_1]) {
                            v7_1++;
                        } else {
                            v4_2 = v0_1[(v7_1 + v11_0)];
                            if (v12_0 != v5_2) {
                                v7_3 = v5_2;
                                v5_0 = v12_0;
                            } else {
                                v8_0 = v8_0.f;
                                kotlin.jvm.internal.j.b(v8_0);
                                int v3_0 = v8_0.b;
                                int v5_1 = v8_0.a;
                                v7_3 = v8_0.c;
                                if (v8_0 != v1_2) {
                                    v5_0 = v3_0;
                                    v3_1 = v5_1;
                                } else {
                                    v5_0 = v3_0;
                                    v3_1 = v5_1;
                                    v8_0 = 0;
                                }
                            }
                        }
                    }
                    return v9;
                } else {
                    int v12_1 = ((v11_0 * -1) + v7_1);
                    while(true) {
                        int v11_2 = (v4_6 + 1);
                        int v13_1 = (v7_1 + 1);
                        if ((v3_1[v4_6] & 255) == v0_1[v7_1]) {
                            x8.c0 v4_5;
                            if (v13_1 != v12_1) {
                                v4_5 = 0;
                            } else {
                                v4_5 = 1;
                            }
                            int v8_2;
                            int v7_5;
                            if (v11_2 != v5_2) {
                                v7_5 = v8_0;
                                v8_2 = v5_2;
                                v5_0 = v11_2;
                            } else {
                                kotlin.jvm.internal.j.b(v8_0);
                                int v3_2 = v8_0.f;
                                kotlin.jvm.internal.j.b(v3_2);
                                v5_0 = v3_2.b;
                                int v7_6 = v3_2.a;
                                v8_2 = v3_2.c;
                                if (v3_2 != v1_2) {
                                    v7_5 = v3_2;
                                    v3_1 = v7_6;
                                } else {
                                    if (v4_5 == null) {
                                        break;
                                    }
                                    v3_1 = v7_6;
                                    v7_5 = 0;
                                }
                            }
                            if (v4_5 == null) {
                                v4_6 = v5_0;
                                v5_2 = v8_2;
                                v8_0 = v7_5;
                                v7_1 = v13_1;
                            } else {
                                v4_2 = v0_1[v13_1];
                                v8_0 = v7_5;
                                v7_3 = v8_2;
                            }
                        }
                    }
                }
                if (v4_2 < null) {
                    v7_0 = (- v4_2);
                    v4_6 = v5_0;
                    v5_2 = v7_3;
                } else {
                    return v4_2;
                }
            }
            if (!p18) {
                return v9;
            } else {
                return -2;
            }
        } else {
            if (!p18) {
                return -1;
            }
        }
        return -2;
    }
}
