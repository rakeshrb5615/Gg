package androidx.datastore.preferences.protobuf;
public final class m0 implements androidx.datastore.preferences.protobuf.u0 {
    public static final int[] n;
    public static final sun.misc.Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final androidx.datastore.preferences.protobuf.a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final androidx.datastore.preferences.protobuf.o0 j;
    public final androidx.datastore.preferences.protobuf.b0 k;
    public final androidx.datastore.preferences.protobuf.c1 l;
    public final androidx.datastore.preferences.protobuf.i0 m;

    static m0()
    {
        sun.misc.Unsafe v0_1 = new int[0];
        androidx.datastore.preferences.protobuf.m0.n = v0_1;
        androidx.datastore.preferences.protobuf.m0.o = androidx.datastore.preferences.protobuf.h1.i();
        return;
    }

    public m0(int[] p1, Object[] p2, int p3, int p4, androidx.datastore.preferences.protobuf.a p5, int[] p6, int p7, int p8, androidx.datastore.preferences.protobuf.o0 p9, androidx.datastore.preferences.protobuf.b0 p10, androidx.datastore.preferences.protobuf.c1 p11, androidx.datastore.preferences.protobuf.o p12, androidx.datastore.preferences.protobuf.i0 p13)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.f = (p5 instanceof androidx.datastore.preferences.protobuf.v);
        this.g = p6;
        this.h = p7;
        this.i = p8;
        this.j = p9;
        this.k = p10;
        this.l = p11;
        this.e = p5;
        this.m = p13;
        return;
    }

    public static reflect.Field F(Class p5, String p6)
    {
        try {
            String v5_1 = p5.getDeclaredField(p6);
            return v5_1;
        } catch (NoSuchFieldException) {
            reflect.Field[] v0 = v5_1.getDeclaredFields();
            int v2_0 = 0;
        }
    }

    public static int K(int p1)
    {
        return ((p1 & 267386880) >> 20);
    }

    public static boolean p(Object p1)
    {
        if (p1 != 0) {
            if (!(p1 instanceof androidx.datastore.preferences.protobuf.v)) {
                return 1;
            } else {
                return ((androidx.datastore.preferences.protobuf.v) p1).g();
            }
        } else {
            return 0;
        }
    }

    public static androidx.datastore.preferences.protobuf.m0 w(androidx.datastore.preferences.protobuf.t0 p34, androidx.datastore.preferences.protobuf.o0 p35, androidx.datastore.preferences.protobuf.b0 p36, androidx.datastore.preferences.protobuf.c1 p37, androidx.datastore.preferences.protobuf.o p38, androidx.datastore.preferences.protobuf.i0 p39)
    {
        int v7_0;
        androidx.datastore.preferences.protobuf.m0 v1_0 = p34.b;
        int v2_5 = v1_0.length();
        int v6_11 = 55296;
        if (v1_0.charAt(0) < 55296) {
            v7_0 = 1;
        } else {
            int v4_0 = 1;
            while(true) {
                v7_0 = (v4_0 + 1);
                if (v1_0.charAt(v4_0) < 55296) {
                    break;
                }
                v4_0 = v7_0;
            }
        }
        int v4_2 = (v7_0 + 1);
        int v7_3 = v1_0.charAt(v7_0);
        if (v7_3 >= 55296) {
            int v7_9 = (v7_3 & 8191);
            int v9_6 = 13;
            while(true) {
                int v10_6 = (v4_2 + 1);
                int v4_5 = v1_0.charAt(v4_2);
                if (v4_5 < 55296) {
                    break;
                }
                v7_9 |= ((v4_5 & 8191) << v9_6);
                v9_6 += 13;
                v4_2 = v10_6;
            }
            v7_3 = (v7_9 | (v4_5 << v9_6));
            v4_2 = v10_6;
        }
        int v13_7;
        int v10_0;
        int v16_5;
        int v9_0;
        int v7_2;
        int v12_1;
        int v15_5;
        int v11_5;
        if (v7_3 != 0) {
            int v7_7 = (v4_2 + 1);
            int v4_23 = v1_0.charAt(v4_2);
            if (v4_23 >= 55296) {
                int v4_3 = (v4_23 & 8191);
                int v9_5 = 13;
                while(true) {
                    int v10_12 = (v7_7 + 1);
                    int v7_21 = v1_0.charAt(v7_7);
                    if (v7_21 < 55296) {
                        break;
                    }
                    v4_3 |= ((v7_21 & 8191) << v9_5);
                    v9_5 += 13;
                    v7_7 = v10_12;
                }
                v4_23 = (v4_3 | (v7_21 << v9_5));
                v7_7 = v10_12;
            }
            int v9_4 = (v7_7 + 1);
            int v7_29 = v1_0.charAt(v7_7);
            if (v7_29 >= 55296) {
                int v7_4 = (v7_29 & 8191);
                int v10_5 = 13;
                while(true) {
                    int v11_8 = (v9_4 + 1);
                    int v9_10 = v1_0.charAt(v9_4);
                    if (v9_10 < 55296) {
                        break;
                    }
                    v7_4 |= ((v9_10 & 8191) << v10_5);
                    v10_5 += 13;
                    v9_4 = v11_8;
                }
                v7_29 = (v7_4 | (v9_10 << v10_5));
                v9_4 = v11_8;
            }
            int v10_4 = (v9_4 + 1);
            int v9_12 = v1_0.charAt(v9_4);
            if (v9_12 >= 55296) {
                int v9_1 = (v9_12 & 8191);
                int v11_4 = 13;
                while(true) {
                    int v12_7 = (v10_4 + 1);
                    int v10_15 = v1_0.charAt(v10_4);
                    if (v10_15 < 55296) {
                        break;
                    }
                    v9_1 |= ((v10_15 & 8191) << v11_4);
                    v11_4 += 13;
                    v10_4 = v12_7;
                }
                v9_12 = (v9_1 | (v10_15 << v11_4));
                v10_4 = v12_7;
            }
            int v11_3 = (v10_4 + 1);
            int v10_17 = v1_0.charAt(v10_4);
            if (v10_17 >= 55296) {
                int v10_1 = (v10_17 & 8191);
                int v12_6 = 13;
                while(true) {
                    int v13_11 = (v11_3 + 1);
                    int v11_9 = v1_0.charAt(v11_3);
                    if (v11_9 < 55296) {
                        break;
                    }
                    v10_1 |= ((v11_9 & 8191) << v12_6);
                    v12_6 += 13;
                    v11_3 = v13_11;
                }
                v10_17 = (v10_1 | (v11_9 << v12_6));
                v11_3 = v13_11;
            }
            int v12_5 = (v11_3 + 1);
            v11_5 = v1_0.charAt(v11_3);
            if (v11_5 >= 55296) {
                int v11_0 = (v11_5 & 8191);
                int v13_10 = 13;
                while(true) {
                    int v14_10 = (v12_5 + 1);
                    int v12_8 = v1_0.charAt(v12_5);
                    if (v12_8 < 55296) {
                        break;
                    }
                    v11_0 |= ((v12_8 & 8191) << v13_10);
                    v13_10 += 13;
                    v12_5 = v14_10;
                }
                v11_5 = (v11_0 | (v12_8 << v13_10));
                v12_5 = v14_10;
            }
            int v13_2 = (v12_5 + 1);
            int v12_0 = v1_0.charAt(v12_5);
            if (v12_0 >= 55296) {
                int v12_2 = (v12_0 & 8191);
                int v14_7 = 13;
                while(true) {
                    int v15_0 = (v13_2 + 1);
                    int v13_0 = v1_0.charAt(v13_2);
                    if (v13_0 < 55296) {
                        break;
                    }
                    v12_2 |= ((v13_0 & 8191) << v14_7);
                    v14_7 += 13;
                    v13_2 = v15_0;
                }
                v12_0 = (v12_2 | (v13_0 << v14_7));
                v13_2 = v15_0;
            }
            int v14_0 = (v13_2 + 1);
            int v13_3 = v1_0.charAt(v13_2);
            if (v13_3 >= 55296) {
                int v13_4 = (v13_3 & 8191);
                int v15_1 = 13;
                while(true) {
                    int v16_0 = (v14_0 + 1);
                    int v14_1 = v1_0.charAt(v14_0);
                    if (v14_1 < 55296) {
                        break;
                    }
                    v13_4 |= ((v14_1 & 8191) << v15_1);
                    v15_1 += 13;
                    v14_0 = v16_0;
                }
                v13_3 = (v13_4 | (v14_1 << v15_1));
                v14_0 = v16_0;
            }
            int v15_2 = (v14_0 + 1);
            int v14_3 = v1_0.charAt(v14_0);
            if (v14_3 >= 55296) {
                int v14_4 = (v14_3 & 8191);
                int v16_1 = 13;
                while(true) {
                    int v17_0 = (v15_2 + 1);
                    int v15_3 = v1_0.charAt(v15_2);
                    if (v15_3 < 55296) {
                        break;
                    }
                    v14_4 |= ((v15_3 & 8191) << v16_1);
                    v16_1 += 13;
                    v15_2 = v17_0;
                }
                v14_3 = (v14_4 | (v15_3 << v16_1));
                v15_2 = v17_0;
            }
            int v13_6 = new int[((v14_3 + v12_0) + v13_3)];
            v12_1 = v9_12;
            v9_0 = v12_0;
            v7_2 = v4_23;
            v4_2 = v15_2;
            v15_5 = v13_6;
            v13_7 = v10_17;
            v10_0 = ((v4_23 * 2) + v7_29);
            v16_5 = v14_3;
        } else {
            v9_0 = 0;
            v10_0 = 0;
            v11_5 = 0;
            v12_1 = 0;
            v13_7 = 0;
            v16_5 = 0;
            v15_5 = androidx.datastore.preferences.protobuf.m0.n;
            v7_2 = 0;
        }
        int v14_8 = androidx.datastore.preferences.protobuf.m0.o;
        int v3_0 = p34.c;
        int v8_1 = p34.a.getClass();
        int[] v5_1 = new int[(v11_5 * 3)];
        int v11_7 = new Object[(v11_5 * 2)];
        int v9_7 = (v16_5 + v9_0);
        int v23_0 = v9_7;
        int v22_0 = v16_5;
        int v20_0 = 0;
        int v21_0 = 0;
        while (v4_2 < v2_5) {
            int v2_0;
            int v27;
            int v24_0 = (v4_2 + 1);
            int v4_4 = v1_0.charAt(v4_2);
            if (v4_4 < v6_11) {
                v27 = v2_5;
                v2_0 = v24_0;
            } else {
                int v4_6 = (v4_4 & 8191);
                int v6_0 = v24_0;
                int v24_1 = 13;
                while(true) {
                    androidx.datastore.preferences.protobuf.m0 v26_0 = (v6_0 + 1);
                    int v6_1 = v1_0.charAt(v6_0);
                    v27 = v2_5;
                    if (v6_1 < 55296) {
                        break;
                    }
                    v4_6 |= ((v6_1 & 8191) << v24_1);
                    v24_1 += 13;
                    v6_0 = v26_0;
                    v2_5 = v27;
                }
                v4_4 = (v4_6 | (v6_1 << v24_1));
                v2_0 = v26_0;
            }
            int v6_2 = (v2_0 + 1);
            int v2_3 = v1_0.charAt(v2_0);
            int v24_2 = v3_0;
            int v3_1 = 55296;
            if (v2_3 >= 55296) {
                int v2_4 = (v2_3 & 8191);
                androidx.datastore.preferences.protobuf.m0 v26_1 = 13;
                while(true) {
                    int v28_0 = (v6_2 + 1);
                    int v6_3 = v1_0.charAt(v6_2);
                    if (v6_3 < v3_1) {
                        break;
                    }
                    v2_4 |= ((v6_3 & 8191) << v26_1);
                    v26_1 += 13;
                    v6_2 = v28_0;
                    v3_1 = 55296;
                }
                v2_3 = (v2_4 | (v6_3 << v26_1));
                v6_2 = v28_0;
            }
            int v3_3 = (v2_3 & 255);
            androidx.datastore.preferences.protobuf.m0 v26_2 = v4_4;
            if ((v2_3 & 1024) != 0) {
                int v4_9 = (v20_0 + 1);
                v15_5[v20_0] = v21_0;
                v20_0 = v4_9;
            }
            int v4_35;
            int v29_2;
            int v28_1;
            int v6_4;
            int v10_8;
            int[] v5_6;
            int v7_16;
            int[] v30_1 = v5_1;
            if (v3_3 < 51) {
                int v4_22;
                int v4_11 = (v10_0 + 1);
                int[] v5_4 = androidx.datastore.preferences.protobuf.m0.F(v8_1, ((String) v24_2[v10_0]));
                int v31_0 = v4_11;
                if ((v3_3 != 9) && (v3_3 != 17)) {
                    if ((v3_3 != 27) && (v3_3 != 49)) {
                        if ((v3_3 != 12) && ((v3_3 != 30) && (v3_3 != 44))) {
                            if (v3_3 != 50) {
                                v28_1 = v7_2;
                                v10_8 = v8_1;
                                v4_22 = v31_0;
                                int[] v5_5 = ((int) v14_8.objectFieldOffset(v5_4));
                                if (((v2_3 & 4096) == 0) || (v3_3 > 17)) {
                                    v7_16 = 1048575;
                                    v29_2 = v6_2;
                                    v6_4 = 0;
                                } else {
                                    int v7_17 = (v6_2 + 1);
                                    int v6_5 = v1_0.charAt(v6_2);
                                    if (v6_5 < 55296) {
                                        v29_2 = v7_17;
                                    } else {
                                        int v6_6 = (v6_5 & 8191);
                                        int v25_0 = 13;
                                        while(true) {
                                            v29_2 = (v7_17 + 1);
                                            int v7_18 = v1_0.charAt(v7_17);
                                            if (v7_18 < 55296) {
                                                break;
                                            }
                                            v6_6 |= ((v7_18 & 8191) << v25_0);
                                            v25_0 += 13;
                                            v7_17 = v29_2;
                                        }
                                        v6_5 = (v6_6 | (v7_18 << v25_0));
                                    }
                                    int v7_24;
                                    int v25_2 = ((v6_5 / 32) + (v28_1 * 2));
                                    int v7_22 = v24_2[v25_2];
                                    if (!(v7_22 instanceof reflect.Field)) {
                                        v7_24 = androidx.datastore.preferences.protobuf.m0.F(v10_8, ((String) v7_22));
                                        v24_2[v25_2] = v7_24;
                                    } else {
                                        v7_24 = ((reflect.Field) v7_22);
                                    }
                                    v7_16 = ((int) v14_8.objectFieldOffset(v7_24));
                                    v6_4 = (v6_5 % 32);
                                }
                                if ((v3_3 < 18) || (v3_3 > 49)) {
                                    v5_6 = v4_22;
                                    v4_35 = v5_5;
                                } else {
                                    int v8_6 = (v23_0 + 1);
                                    v15_5[v23_0] = v5_5;
                                    v5_6 = v4_22;
                                    v4_35 = v5_5;
                                    v23_0 = v8_6;
                                }
                                androidx.datastore.preferences.protobuf.m0 v1_3;
                                int v8_7 = (v21_0 + 1);
                                v30_1[v21_0] = v26_2;
                                int v25_3 = (v21_0 + 2);
                                androidx.datastore.preferences.protobuf.m0 v26_3 = v1_0;
                                if ((v2_3 & 512) == 0) {
                                    v1_3 = 0;
                                } else {
                                    v1_3 = 536870912;
                                }
                                androidx.datastore.preferences.protobuf.m0 v1_5;
                                if ((v2_3 & 256) == 0) {
                                    v1_5 = 0;
                                } else {
                                    v1_5 = 268435456;
                                }
                                int v2_7;
                                if ((v2_3 & 2048) == 0) {
                                    v2_7 = 0;
                                } else {
                                    v2_7 = -2147483648;
                                }
                                v30_1[v8_7] = ((((v1_3 | v1_5) | v2_7) | (v3_3 << 20)) | v4_35);
                                v21_0 += 3;
                                v30_1[v25_3] = ((v6_4 << 20) | v7_16);
                                v8_1 = v10_8;
                                v3_0 = v24_2;
                                v1_0 = v26_3;
                                v2_5 = v27;
                                v7_2 = v28_1;
                                v4_2 = v29_2;
                                v6_11 = 55296;
                                v10_0 = v5_6;
                                v5_1 = v30_1;
                            } else {
                                int v4_20 = (v22_0 + 1);
                                v15_5[v22_0] = v21_0;
                                int v22_3 = ((v21_0 / 3) * 2);
                                int v28_2 = (v10_0 + 2);
                                v11_7[v22_3] = v24_2[v31_0];
                                int v29_1 = v4_20;
                                if ((v2_3 & 2048) == 0) {
                                    v10_8 = v8_1;
                                    v4_22 = v28_2;
                                    v22_0 = v29_1;
                                    v28_1 = v7_2;
                                } else {
                                    v4_22 = (v10_0 + 3);
                                    v11_7[(v22_3 + 1)] = v24_2[v28_2];
                                    v28_1 = v7_2;
                                    v10_8 = v8_1;
                                    v22_0 = v29_1;
                                }
                            }
                        } else {
                            v28_1 = v7_2;
                            if ((p34.a() != 1) && ((v2_3 & 2048) == 0)) {
                            } else {
                                int v10_10 = (v10_0 + 2);
                                v11_7[(((v21_0 / 3) * 2) + 1)] = v24_2[v31_0];
                            }
                        }
                    } else {
                        v28_1 = v7_2;
                        v10_10 = (v10_0 + 2);
                        v11_7[(((v21_0 / 3) * 2) + 1)] = v24_2[v31_0];
                    }
                    v4_22 = v10_10;
                    v10_8 = v8_1;
                } else {
                    v28_1 = v7_2;
                    v11_7[(((v21_0 / 3) * 2) + 1)] = v5_4.getType();
                }
            } else {
                int v4_36 = (v6_2 + 1);
                int v6_7 = v1_0.charAt(v6_2);
                int[] v5_7 = 55296;
                if (v6_7 >= 55296) {
                    int v6_8 = (v6_7 & 8191);
                    int v31_1 = 13;
                    while(true) {
                        int v32 = (v4_36 + 1);
                        int v4_37 = v1_0.charAt(v4_36);
                        if (v4_37 < v5_7) {
                            break;
                        }
                        v6_8 |= ((v4_37 & 8191) << v31_1);
                        v31_1 += 13;
                        v4_36 = v32;
                        v5_7 = 55296;
                    }
                    v6_7 = (v6_8 | (v4_37 << v31_1));
                    v4_36 = v32;
                }
                int[] v5_10;
                int[] v5_8 = (v3_3 - 51);
                int v31_2 = v4_36;
                if ((v5_8 != 9) && (v5_8 != 17)) {
                    if ((v5_8 == 12) && ((u.e.a(p34.a(), 1)) || ((v2_3 & 2048) != 0))) {
                        v5_10 = (v10_0 + 1);
                        v11_7[(((v21_0 / 3) * 2) + 1)] = v24_2[v10_0];
                        v10_0 = v5_10;
                    }
                } else {
                    v5_10 = (v10_0 + 1);
                    v11_7[(((v21_0 / 3) * 2) + 1)] = v24_2[v10_0];
                }
                int v4_53;
                int v6_9 = (v6_7 * 2);
                int v4_51 = v24_2[v6_9];
                if (!(v4_51 instanceof reflect.Field)) {
                    v4_53 = androidx.datastore.preferences.protobuf.m0.F(v8_1, ((String) v4_51));
                    v24_2[v6_9] = v4_53;
                } else {
                    v4_53 = ((reflect.Field) v4_51);
                }
                int[] v5_14;
                int v6_10 = (v6_9 + 1);
                int[] v5_12 = v24_2[v6_10];
                int v28_3 = ((int) v14_8.objectFieldOffset(v4_53));
                if (!(v5_12 instanceof reflect.Field)) {
                    v5_14 = androidx.datastore.preferences.protobuf.m0.F(v8_1, ((String) v5_12));
                    v24_2[v6_10] = v5_14;
                } else {
                    v5_14 = ((reflect.Field) v5_12);
                }
                v7_16 = ((int) v14_8.objectFieldOffset(v5_14));
                v4_35 = v28_3;
                v28_1 = v7_2;
                v5_6 = v10_0;
                v29_2 = v31_2;
                v6_4 = 0;
                v10_8 = v8_1;
            }
        }
        return new androidx.datastore.preferences.protobuf.m0(v5_1, v11_7, v12_1, v13_7, p34.a, v15_5, v16_5, v9_7, p35, p36, p37, p38, p39);
    }

    public static long x(int p2)
    {
        return ((long) (p2 & 1048575));
    }

    public static int y(long p1, Object p3)
    {
        return ((Integer) androidx.datastore.preferences.protobuf.h1.c.h(p1, p3)).intValue();
    }

    public static long z(long p1, Object p3)
    {
        return ((Long) androidx.datastore.preferences.protobuf.h1.c.h(p1, p3)).longValue();
    }

    public final int A(int p8)
    {
        if ((p8 >= this.c) && (p8 <= this.d)) {
            int[] v0_2 = this.a;
            int v2_0 = ((v0_2.length / 3) - 1);
            int v3 = 0;
            while (v3 <= v2_0) {
                int v4_1 = ((v2_0 + v3) >> 1);
                int v5 = (v4_1 * 3);
                int v6 = v0_2[v5];
                if (p8 != v6) {
                    if (p8 >= v6) {
                        v3 = (v4_1 + 1);
                    } else {
                        v2_0 = (v4_1 - 1);
                    }
                } else {
                    return v5;
                }
            }
        }
        return -1;
    }

    public final void B(Object p3, long p4, a2.r p6, androidx.datastore.preferences.protobuf.u0 p7, androidx.datastore.preferences.protobuf.n p8)
    {
        this.k.getClass();
        androidx.datastore.preferences.protobuf.y v3_2 = androidx.datastore.preferences.protobuf.b0.a(p4, p3);
        androidx.datastore.preferences.protobuf.j v4_2 = ((androidx.datastore.preferences.protobuf.j) p6.d);
        int v5 = p6.a;
        if ((v5 & 7) != 3) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            int v0_1 = p7.i();
            p6.d(v0_1, p7, p8);
            p7.e(v0_1);
            ((androidx.datastore.preferences.protobuf.s0) v3_2).add(v0_1);
            if ((!v4_2.c()) && (p6.c == 0)) {
                int v0_4 = v4_2.u();
            }
            return;
        } while(v0_4 == v5);
        p6.c = v0_4;
        return;
    }

    public final void C(Object p4, int p5, a2.r p6, androidx.datastore.preferences.protobuf.u0 p7, androidx.datastore.preferences.protobuf.n p8)
    {
        int v0_1 = ((long) (p5 & 1048575));
        this.k.getClass();
        androidx.datastore.preferences.protobuf.y v4_2 = androidx.datastore.preferences.protobuf.b0.a(v0_1, p4);
        androidx.datastore.preferences.protobuf.j v5_4 = ((androidx.datastore.preferences.protobuf.j) p6.d);
        int v0_2 = p6.a;
        if ((v0_2 & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            int v1_1 = p7.i();
            p6.e(v1_1, p7, p8);
            p7.e(v1_1);
            ((androidx.datastore.preferences.protobuf.s0) v4_2).add(v1_1);
            if ((!v5_4.c()) && (p6.c == 0)) {
                int v1_4 = v5_4.u();
            }
            return;
        } while(v1_4 == v0_2);
        p6.c = v1_4;
        return;
    }

    public final void D(int p6, a2.r p7, Object p8)
    {
        long v0_1 = ((androidx.datastore.preferences.protobuf.j) p7.d);
        if ((536870912 & p6) == 0) {
            if (!this.f) {
                androidx.datastore.preferences.protobuf.h1.o(p8, ((long) (p6 & 1048575)), p7.g());
                return;
            } else {
                long v3_0 = ((long) (p6 & 1048575));
                p7.y(2);
                androidx.datastore.preferences.protobuf.h1.o(p8, v3_0, v0_1.s());
                return;
            }
        } else {
            long v3_1 = ((long) (p6 & 1048575));
            p7.y(2);
            androidx.datastore.preferences.protobuf.h1.o(p8, v3_1, v0_1.t());
            return;
        }
    }

    public final void E(int p4, a2.r p5, Object p6)
    {
        androidx.datastore.preferences.protobuf.b0 v2 = this.k;
        if ((536870912 & p4) == 0) {
            long v0_3 = ((long) (p4 & 1048575));
            v2.getClass();
            p5.u(androidx.datastore.preferences.protobuf.b0.a(v0_3, p6), 0);
            return;
        } else {
            long v0_2 = ((long) (p4 & 1048575));
            v2.getClass();
            p5.u(androidx.datastore.preferences.protobuf.b0.a(v0_2, p6), 1);
            return;
        }
    }

    public final void G(int p5, Object p6)
    {
        int v5_4 = this.a[(p5 + 2)];
        long v0_3 = ((long) (1048575 & v5_4));
        if (v0_3 != 1048575) {
            androidx.datastore.preferences.protobuf.h1.m(p6, v0_3, ((1 << (v5_4 >> 20)) | androidx.datastore.preferences.protobuf.h1.c.f(v0_3, p6)));
            return;
        } else {
            return;
        }
    }

    public final void H(Object p3, int p4, int p5)
    {
        androidx.datastore.preferences.protobuf.h1.m(p3, ((long) (this.a[(p5 + 2)] & 1048575)), p4);
        return;
    }

    public final void I(Object p4, int p5, androidx.datastore.preferences.protobuf.a p6)
    {
        androidx.datastore.preferences.protobuf.m0.o.putObject(p4, ((long) (this.L(p5) & 1048575)), p6);
        this.G(p5, p4);
        return;
    }

    public final void J(Object p4, int p5, int p6, androidx.datastore.preferences.protobuf.a p7)
    {
        androidx.datastore.preferences.protobuf.m0.o.putObject(p4, ((long) (this.L(p6) & 1048575)), p7);
        this.H(p4, p5, p6);
        return;
    }

    public final int L(int p2)
    {
        return this.a[(p2 + 1)];
    }

    public final void M(Object p22, androidx.datastore.preferences.protobuf.e0 p23)
    {
        androidx.datastore.preferences.protobuf.g v0_0 = this;
        int[] v7 = this.a;
        int v8 = v7.length;
        sun.misc.Unsafe v9 = androidx.datastore.preferences.protobuf.m0.o;
        androidx.datastore.preferences.protobuf.l v10_47 = 1048575;
        int v3_2 = 1048575;
        int v2_1 = 0;
        int v4 = 0;
        while (v2_1 < v8) {
            int v11_3;
            androidx.datastore.preferences.protobuf.g v5_47;
            androidx.datastore.preferences.protobuf.g v5_24 = v0_0.L(v2_1);
            Object v12_0 = v7[v2_1];
            androidx.datastore.preferences.protobuf.l v13_0 = androidx.datastore.preferences.protobuf.m0.K(v5_24);
            if (v13_0 > 17) {
                v11_3 = v5_24;
                v5_47 = 0;
            } else {
                Object v14_4 = v7[(v2_1 + 2)];
                int v11_9 = (v14_4 & v10_47);
                if (v11_9 != v3_2) {
                    if (v11_9 != v10_47) {
                        v4 = v9.getInt(p22, ((long) v11_9));
                    } else {
                        v4 = 0;
                    }
                    v3_2 = v11_9;
                }
                v11_3 = v5_24;
                v5_47 = (1 << (v14_4 >> 20));
            }
            int v19_0;
            int v19_2;
            androidx.datastore.preferences.protobuf.l v10_33 = ((long) (v11_3 & v10_47));
            switch (v13_0) {
                case 0:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        androidx.datastore.preferences.protobuf.l v10_56 = androidx.datastore.preferences.protobuf.h1.c.d(v10_33, p22);
                        androidx.datastore.preferences.protobuf.g v5_165 = ((androidx.datastore.preferences.protobuf.l) p23.a);
                        v5_165.getClass();
                        v5_165.D0(v12_0, Double.doubleToRawLongBits(v10_56));
                    }
                    break;
                case 1:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                        v0_0 = this;
                    } else {
                        androidx.datastore.preferences.protobuf.g v0_27 = androidx.datastore.preferences.protobuf.h1.c.e(v10_33, p22);
                        androidx.datastore.preferences.protobuf.g v5_161 = ((androidx.datastore.preferences.protobuf.l) p23.a);
                        v5_161.getClass();
                        v5_161.B0(v12_0, Float.floatToRawIntBits(v0_27));
                    }
                    break;
                case 2:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).N0(v12_0, v9.getLong(p22, v10_33));
                    }
                    break;
                case 3:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).N0(v12_0, v9.getLong(p22, v10_33));
                    }
                    break;
                case 4:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).F0(v12_0, v9.getInt(p22, v10_33));
                    }
                    break;
                case 5:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).D0(v12_0, v9.getLong(p22, v10_33));
                    }
                    break;
                case 6:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).B0(v12_0, v9.getInt(p22, v10_33));
                    }
                    break;
                case 7:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).y0(v12_0, androidx.datastore.preferences.protobuf.h1.c.c(v10_33, p22));
                    }
                    break;
                case 8:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        androidx.datastore.preferences.protobuf.g v0_13 = v9.getObject(p22, v10_33);
                        if (!(v0_13 instanceof String)) {
                            ((androidx.datastore.preferences.protobuf.l) p23.a).z0(v12_0, ((androidx.datastore.preferences.protobuf.g) v0_13));
                        } else {
                            ((androidx.datastore.preferences.protobuf.l) p23.a).I0(v12_0, ((String) v0_13));
                        }
                    }
                    break;
                case 9:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).H0(v12_0, ((androidx.datastore.preferences.protobuf.a) v9.getObject(p22, v10_33)), v0_0.m(v2_1));
                    }
                    break;
                case 10:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).z0(v12_0, ((androidx.datastore.preferences.protobuf.g) v9.getObject(p22, v10_33)));
                    }
                    break;
                case 11:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).L0(v12_0, v9.getInt(p22, v10_33));
                    }
                    break;
                case 12:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).F0(v12_0, v9.getInt(p22, v10_33));
                    }
                    break;
                case 13:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).B0(v12_0, v9.getInt(p22, v10_33));
                    }
                    break;
                case 14:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).D0(v12_0, v9.getLong(p22, v10_33));
                    }
                    break;
                case 15:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        androidx.datastore.preferences.protobuf.g v0_3 = v9.getInt(p22, v10_33);
                        ((androidx.datastore.preferences.protobuf.l) p23.a).L0(v12_0, ((v0_3 >> 31) ^ (v0_3 << 1)));
                    }
                    break;
                case 16:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        androidx.datastore.preferences.protobuf.l v10_41 = v9.getLong(p22, v10_33);
                        ((androidx.datastore.preferences.protobuf.l) p23.a).N0(v12_0, ((v10_41 >> 63) ^ (v10_41 << 1)));
                    }
                    break;
                case 17:
                    if (!v0_0.o(p22, v2_1, v3_2, v4, v5_47)) {
                    } else {
                        p23.a(v12_0, v9.getObject(p22, v10_33), v0_0.m(v2_1));
                    }
                    break;
                case 18:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.n(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    v3_2 = v19_2;
                    break;
                case 19:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.r(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 20:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.t(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 21:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.z(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 22:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.s(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 23:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.q(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 24:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.p(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 25:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.m(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 26:
                    v19_0 = v3_2;
                    int v3_28 = v7[v2_1];
                    androidx.datastore.preferences.protobuf.g v5_95 = ((java.util.List) v9.getObject(p22, v10_33));
                    if ((v5_95 == null) || (v5_95.isEmpty())) {
                        v3_2 = v19_0;
                    } else {
                        p23.getClass();
                        Object v12_6 = 0;
                        while (v12_6 < v5_95.size()) {
                            ((androidx.datastore.preferences.protobuf.l) p23.a).I0(v3_28, ((String) v5_95.get(v12_6)));
                            v12_6++;
                        }
                    }
                    break;
                case 27:
                    v19_0 = v3_2;
                    int v3_27 = v7[v2_1];
                    androidx.datastore.preferences.protobuf.g v5_93 = ((java.util.List) v9.getObject(p22, v10_33));
                    androidx.datastore.preferences.protobuf.l v10_34 = v0_0.m(v2_1);
                    if ((v5_93 == null) || (v5_93.isEmpty())) {
                    } else {
                        p23.getClass();
                        Object v12_5 = 0;
                        while (v12_5 < v5_93.size()) {
                            ((androidx.datastore.preferences.protobuf.l) p23.a).H0(v3_27, ((androidx.datastore.preferences.protobuf.a) v5_93.get(v12_5)), v10_34);
                            v12_5++;
                        }
                    }
                    break;
                case 28:
                    v19_0 = v3_2;
                    int v3_26 = v7[v2_1];
                    androidx.datastore.preferences.protobuf.g v5_91 = ((java.util.List) v9.getObject(p22, v10_33));
                    if ((v5_91 == null) || (v5_91.isEmpty())) {
                    } else {
                        p23.getClass();
                        Object v12_4 = 0;
                        while (v12_4 < v5_91.size()) {
                            ((androidx.datastore.preferences.protobuf.l) p23.a).z0(v3_26, ((androidx.datastore.preferences.protobuf.g) v5_91.get(v12_4)));
                            v12_4++;
                        }
                    }
                    break;
                case 29:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.y(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 30:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.o(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 31:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.u(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 32:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.v(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 33:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.w(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 34:
                    v19_2 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.x(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 0);
                    break;
                case 35:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.n(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 36:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.r(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 37:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.t(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 38:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.z(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 39:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.s(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 40:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.q(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 41:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.p(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 42:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.m(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 43:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.y(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 44:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.o(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 45:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.u(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 46:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.v(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 47:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.w(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 48:
                    v19_0 = v3_2;
                    androidx.datastore.preferences.protobuf.v0.x(v7[v2_1], ((java.util.List) v9.getObject(p22, v10_33)), p23, 1);
                    break;
                case 49:
                    v19_0 = v3_2;
                    int v3_3 = v7[v2_1];
                    androidx.datastore.preferences.protobuf.g v5_49 = ((java.util.List) v9.getObject(p22, v10_33));
                    androidx.datastore.preferences.protobuf.l v10_28 = v0_0.m(v2_1);
                    if ((v5_49 == null) || (v5_49.isEmpty())) {
                    } else {
                        p23.getClass();
                        int v11_8 = 0;
                        while (v11_8 < v5_49.size()) {
                            p23.a(v3_3, v5_49.get(v11_8), v10_28);
                            v11_8++;
                        }
                    }
                    break;
                case 50:
                    androidx.datastore.preferences.protobuf.g v5_43 = v9.getObject(p22, v10_33);
                    if (v5_43 != null) {
                        int v11_2 = 2;
                        androidx.datastore.preferences.protobuf.l v10_25 = v0_0.b[((v2_1 / 3) * 2)];
                        v0_0.m.getClass();
                        androidx.datastore.preferences.protobuf.l v10_27 = ((androidx.datastore.preferences.protobuf.g0) v10_25).a;
                        androidx.datastore.preferences.protobuf.g v5_44 = ((androidx.datastore.preferences.protobuf.h0) v5_43);
                        androidx.datastore.preferences.protobuf.l v13_4 = ((androidx.datastore.preferences.protobuf.l) p23.a);
                        v13_4.getClass();
                        androidx.datastore.preferences.protobuf.g v5_46 = v5_44.entrySet().iterator();
                        while (v5_46.hasNext()) {
                            java.util.Map$Entry v16_2 = ((java.util.Map$Entry) v5_46.next());
                            v13_4.K0(v12_0, v11_2);
                            v13_4.M0(androidx.datastore.preferences.protobuf.g0.a(v10_27, v16_2.getKey(), v16_2.getValue()));
                            int v11_6 = v16_2.getKey();
                            Object v14_2 = v16_2.getValue();
                            int v19_1 = v3_2;
                            androidx.datastore.preferences.protobuf.q.b(v13_4, v10_27.a, 1, v11_6);
                            v11_2 = 2;
                            androidx.datastore.preferences.protobuf.q.b(v13_4, v10_27.b, 2, v14_2);
                            v3_2 = v19_1;
                        }
                    }
                    v19_0 = v3_2;
                    break;
                case 51:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        androidx.datastore.preferences.protobuf.l v10_21 = ((Double) androidx.datastore.preferences.protobuf.h1.c.h(v10_33, p22)).doubleValue();
                        androidx.datastore.preferences.protobuf.g v5_42 = ((androidx.datastore.preferences.protobuf.l) p23.a);
                        v5_42.getClass();
                        v5_42.D0(v12_0, Double.doubleToRawLongBits(v10_21));
                    }
                    break;
                case 52:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        androidx.datastore.preferences.protobuf.g v5_35 = ((Float) androidx.datastore.preferences.protobuf.h1.c.h(v10_33, p22)).floatValue();
                        androidx.datastore.preferences.protobuf.l v10_20 = ((androidx.datastore.preferences.protobuf.l) p23.a);
                        v10_20.getClass();
                        v10_20.B0(v12_0, Float.floatToRawIntBits(v5_35));
                    }
                    break;
                case 53:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).N0(v12_0, androidx.datastore.preferences.protobuf.m0.z(v10_33, p22));
                    }
                    break;
                case 54:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).N0(v12_0, androidx.datastore.preferences.protobuf.m0.z(v10_33, p22));
                    }
                    break;
                case 55:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).F0(v12_0, androidx.datastore.preferences.protobuf.m0.y(v10_33, p22));
                    }
                    break;
                case 56:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).D0(v12_0, androidx.datastore.preferences.protobuf.m0.z(v10_33, p22));
                    }
                    break;
                case 57:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).B0(v12_0, androidx.datastore.preferences.protobuf.m0.y(v10_33, p22));
                    }
                    break;
                case 58:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).y0(v12_0, ((Boolean) androidx.datastore.preferences.protobuf.h1.c.h(v10_33, p22)).booleanValue());
                    }
                    break;
                case 59:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        androidx.datastore.preferences.protobuf.g v5_9 = v9.getObject(p22, v10_33);
                        if (!(v5_9 instanceof String)) {
                            ((androidx.datastore.preferences.protobuf.l) p23.a).z0(v12_0, ((androidx.datastore.preferences.protobuf.g) v5_9));
                        } else {
                            ((androidx.datastore.preferences.protobuf.l) p23.a).I0(v12_0, ((String) v5_9));
                        }
                    }
                    break;
                case 60:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).H0(v12_0, ((androidx.datastore.preferences.protobuf.a) p23), v0_0.m(v2_1));
                    }
                    break;
                case 61:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).z0(v12_0, ((androidx.datastore.preferences.protobuf.g) v9.getObject(p22, v10_33)));
                    }
                    break;
                case 62:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).L0(v12_0, androidx.datastore.preferences.protobuf.m0.y(v10_33, p22));
                    }
                    break;
                case 63:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).F0(v12_0, androidx.datastore.preferences.protobuf.m0.y(v10_33, p22));
                    }
                    break;
                case 64:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).B0(v12_0, androidx.datastore.preferences.protobuf.m0.y(v10_33, p22));
                    }
                    break;
                case 65:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        ((androidx.datastore.preferences.protobuf.l) p23.a).D0(v12_0, androidx.datastore.preferences.protobuf.m0.z(v10_33, p22));
                    }
                    break;
                case 66:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        androidx.datastore.preferences.protobuf.g v5_157 = androidx.datastore.preferences.protobuf.m0.y(v10_33, p22);
                        ((androidx.datastore.preferences.protobuf.l) p23.a).L0(v12_0, ((v5_157 >> 31) ^ (v5_157 << 1)));
                    }
                    break;
                case 67:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        androidx.datastore.preferences.protobuf.l v10_46 = androidx.datastore.preferences.protobuf.m0.z(v10_33, p22);
                        ((androidx.datastore.preferences.protobuf.l) p23.a).N0(v12_0, ((v10_46 << 1) ^ (v10_46 >> 63)));
                    }
                    break;
                case 68:
                    if (!v0_0.q(p22, v12_0, v2_1)) {
                    } else {
                        p23.a(v12_0, v9.getObject(p22, v10_33), v0_0.m(v2_1));
                    }
                    break;
                default:
            }
            v2_1 += 3;
            v10_47 = 1048575;
        }
        v0_0.l.getClass();
        ((androidx.datastore.preferences.protobuf.v) p22).unknownFields.d(p23);
        return;
    }

    public final void a(Object p19, a2.r p20, androidx.datastore.preferences.protobuf.n p21)
    {
        androidx.datastore.preferences.protobuf.v v1_0 = this;
        androidx.datastore.preferences.protobuf.v v2 = p19;
        a2.r v4_0 = p20;
        androidx.datastore.preferences.protobuf.n v5_9 = p21;
        p21.getClass();
        if (!androidx.datastore.preferences.protobuf.m0.p(p19)) {
            androidx.datastore.preferences.protobuf.v v1_2 = new StringBuilder("Mutating immutable message: ");
            v1_2.append(p19);
            throw new IllegalArgumentException(v1_2.toString());
        } else {
            androidx.datastore.preferences.protobuf.c1 v8 = this.l;
            int[] v9 = this.g;
            int v10 = this.i;
            int v11 = this.h;
            androidx.datastore.preferences.protobuf.b1 v12 = 0;
            while(true) {
                androidx.datastore.preferences.protobuf.v v0_5 = v4_0.c();
                int v3_2 = v1_0.A(v0_5);
                if (v3_2 >= 0) {
                    androidx.datastore.preferences.protobuf.v v6_18 = v1_0.L(v3_2);
                    androidx.datastore.preferences.protobuf.v v0_4;
                    androidx.datastore.preferences.protobuf.n v14_42;
                    androidx.datastore.preferences.protobuf.v v6_16;
                    androidx.datastore.preferences.protobuf.n v14_43 = v1_0.k;
                    switch (androidx.datastore.preferences.protobuf.m0.K(v6_18)) {
                        case 0:
                            androidx.datastore.preferences.protobuf.u0 v7_25 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_64 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(1);
                            try {
                                androidx.datastore.preferences.protobuf.v v1_6 = v2;
                                v2 = v3_64;
                                v14_42 = p20;
                                try {
                                    androidx.datastore.preferences.protobuf.h1.c.l(v1_6, v2, ((androidx.datastore.preferences.protobuf.j) v0_4.d).h());
                                    v2 = v1_6;
                                } catch (androidx.datastore.preferences.protobuf.y) {
                                    v2 = v1_6;
                                    v8.getClass();
                                    if (v12 == null) {
                                        v12 = androidx.datastore.preferences.protobuf.c1.a(v2);
                                    }
                                    if (!androidx.datastore.preferences.protobuf.c1.b(0, v14_42, v12)) {
                                        break;
                                    }
                                } catch (androidx.datastore.preferences.protobuf.v v0_4) {
                                    v2 = v1_6;
                                }
                                v6_16.G(v7_25, v2);
                            } catch (androidx.datastore.preferences.protobuf.y) {
                                v14_42 = p20;
                            }
                            break;
                        case 1:
                            androidx.datastore.preferences.protobuf.u0 v7_24 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_62 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(5);
                            androidx.datastore.preferences.protobuf.h1.c.m(v2, v3_62, ((androidx.datastore.preferences.protobuf.j) v0_4.d).l());
                            v6_16.G(v7_24, v2);
                            v14_42 = v0_4;
                            break;
                        case 2:
                            androidx.datastore.preferences.protobuf.u0 v7_23 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_60 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(0);
                            androidx.datastore.preferences.protobuf.h1.n(v2, v3_60, ((androidx.datastore.preferences.protobuf.j) v0_4.d).n());
                            v6_16.G(v7_23, v2);
                            break;
                        case 3:
                            androidx.datastore.preferences.protobuf.u0 v7_22 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_58 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(0);
                            androidx.datastore.preferences.protobuf.h1.n(v2, v3_58, ((androidx.datastore.preferences.protobuf.j) v0_4.d).w());
                            v6_16.G(v7_22, v2);
                            break;
                        case 4:
                            androidx.datastore.preferences.protobuf.u0 v7_21 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_56 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(0);
                            androidx.datastore.preferences.protobuf.h1.m(v2, v3_56, ((androidx.datastore.preferences.protobuf.j) v0_4.d).m());
                            v6_16.G(v7_21, v2);
                            break;
                        case 5:
                            androidx.datastore.preferences.protobuf.u0 v7_20 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_54 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(1);
                            androidx.datastore.preferences.protobuf.h1.n(v2, v3_54, ((androidx.datastore.preferences.protobuf.j) v0_4.d).k());
                            v6_16.G(v7_20, v2);
                            break;
                        case 6:
                            androidx.datastore.preferences.protobuf.u0 v7_19 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_52 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(5);
                            androidx.datastore.preferences.protobuf.h1.m(v2, v3_52, ((androidx.datastore.preferences.protobuf.j) v0_4.d).j());
                            v6_16.G(v7_19, v2);
                            break;
                        case 7:
                            androidx.datastore.preferences.protobuf.u0 v7_18 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_50 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(0);
                            androidx.datastore.preferences.protobuf.h1.c.j(v2, v3_50, ((androidx.datastore.preferences.protobuf.j) v0_4.d).f());
                            v6_16.G(v7_18, v2);
                            break;
                        case 8:
                            androidx.datastore.preferences.protobuf.u0 v7_17 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            v6_16.D(v6_18, v0_4, v2);
                            v6_16.G(v7_17, v2);
                            break;
                        case 9:
                            v6_16 = v1_0;
                            androidx.datastore.preferences.protobuf.u0 v7_16 = v3_2;
                            v0_4 = v4_0;
                            androidx.datastore.preferences.protobuf.v v1_5 = v5_9;
                            int v3_47 = ((androidx.datastore.preferences.protobuf.a) v6_16.u(v7_16, v2));
                            a2.r v4_6 = v6_16.m(v7_16);
                            v0_4.y(2);
                            v0_4.e(v3_47, v4_6, v1_5);
                            v6_16.I(v2, v7_16, v3_47);
                            break;
                        case 10:
                            androidx.datastore.preferences.protobuf.u0 v7_15 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            androidx.datastore.preferences.protobuf.h1.o(v2, androidx.datastore.preferences.protobuf.m0.x(v6_18), v0_4.g());
                            v6_16.G(v7_15, v2);
                            break;
                        case 11:
                            androidx.datastore.preferences.protobuf.u0 v7_14 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_43 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(0);
                            androidx.datastore.preferences.protobuf.h1.m(v2, v3_43, ((androidx.datastore.preferences.protobuf.j) v0_4.d).v());
                            v6_16.G(v7_14, v2);
                            break;
                        case 12:
                            androidx.datastore.preferences.protobuf.u0 v7_13 = v3_2;
                            v0_4 = v4_0;
                            int v3_41 = v6_18;
                            v6_16 = v1_0;
                            v0_4.y(0);
                            a2.r v4_5 = ((androidx.datastore.preferences.protobuf.j) v0_4.d).i();
                            v6_16.l(v7_13);
                            androidx.datastore.preferences.protobuf.h1.m(v2, androidx.datastore.preferences.protobuf.m0.x(v3_41), v4_5);
                            v6_16.G(v7_13, v2);
                            break;
                        case 13:
                            androidx.datastore.preferences.protobuf.u0 v7_12 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_40 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(5);
                            androidx.datastore.preferences.protobuf.h1.m(v2, v3_40, ((androidx.datastore.preferences.protobuf.j) v0_4.d).o());
                            v6_16.G(v7_12, v2);
                            break;
                        case 14:
                            androidx.datastore.preferences.protobuf.u0 v7_11 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_38 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(1);
                            androidx.datastore.preferences.protobuf.h1.n(v2, v3_38, ((androidx.datastore.preferences.protobuf.j) v0_4.d).p());
                            v6_16.G(v7_11, v2);
                            break;
                        case 15:
                            androidx.datastore.preferences.protobuf.u0 v7_10 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_36 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(0);
                            androidx.datastore.preferences.protobuf.h1.m(v2, v3_36, ((androidx.datastore.preferences.protobuf.j) v0_4.d).q());
                            v6_16.G(v7_10, v2);
                            break;
                        case 16:
                            androidx.datastore.preferences.protobuf.u0 v7_9 = v3_2;
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_34 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v0_4.y(0);
                            androidx.datastore.preferences.protobuf.h1.n(v2, v3_34, ((androidx.datastore.preferences.protobuf.j) v0_4.d).r());
                            v6_16.G(v7_9, v2);
                            break;
                        case 17:
                            v6_16 = v1_0;
                            androidx.datastore.preferences.protobuf.u0 v7_8 = v3_2;
                            v0_4 = v4_0;
                            androidx.datastore.preferences.protobuf.v v1_4 = v5_9;
                            int v3_32 = ((androidx.datastore.preferences.protobuf.a) v6_16.u(v7_8, v2));
                            a2.r v4_2 = v6_16.m(v7_8);
                            v0_4.y(3);
                            v0_4.d(v3_32, v4_2, v1_4);
                            v6_16.I(v2, v7_8, v3_32);
                            break;
                        case 18:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_29 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.i(androidx.datastore.preferences.protobuf.b0.a(v3_29, v2));
                            break;
                        case 19:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_26 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.n(androidx.datastore.preferences.protobuf.b0.a(v3_26, v2));
                            break;
                        case 20:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_23 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.p(androidx.datastore.preferences.protobuf.b0.a(v3_23, v2));
                            break;
                        case 21:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_20 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.w(androidx.datastore.preferences.protobuf.b0.a(v3_20, v2));
                            break;
                        case 22:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_17 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.o(androidx.datastore.preferences.protobuf.b0.a(v3_17, v2));
                            break;
                        case 23:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_14 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.m(androidx.datastore.preferences.protobuf.b0.a(v3_14, v2));
                            break;
                        case 24:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_11 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.l(androidx.datastore.preferences.protobuf.b0.a(v3_11, v2));
                            break;
                        case 25:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            int v3_8 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v0_4.f(androidx.datastore.preferences.protobuf.b0.a(v3_8, v2));
                            break;
                        case 26:
                            v0_4 = v4_0;
                            v6_16 = v1_0;
                            v6_16.E(v6_18, v0_4, v2);
                            break;
                        case 27:
                            try {
                                try {
                                    v1_0.C(v2, v6_18, v4_0, v1_0.m(v3_2), p21);
                                    v6_16 = v1_0;
                                    v1_0 = p21;
                                    v0_4 = v4_0;
                                } catch (androidx.datastore.preferences.protobuf.y) {
                                    androidx.datastore.preferences.protobuf.v v17 = v6_16;
                                    v6_16 = p21;
                                    v1_0 = v17;
                                    v14_42 = v4_0;
                                }
                            } catch (androidx.datastore.preferences.protobuf.y) {
                                v6_16 = v1_0;
                                v1_0 = p21;
                            }
                            break;
                        case 28:
                            androidx.datastore.preferences.protobuf.n v5_22 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.h(androidx.datastore.preferences.protobuf.b0.a(v5_22, v2));
                            v6_16 = v1_0;
                            v14_42 = v4_0;
                            break;
                        case 29:
                            androidx.datastore.preferences.protobuf.n v5_21 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.v(androidx.datastore.preferences.protobuf.b0.a(v5_21, v2));
                            break;
                        case 30:
                            androidx.datastore.preferences.protobuf.u0 v7_5 = v3_2;
                            androidx.datastore.preferences.protobuf.n v5_20 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            int v3_4 = androidx.datastore.preferences.protobuf.b0.a(v5_20, v2);
                            v4_0.j(v3_4);
                            v1_0.l(v7_5);
                            androidx.datastore.preferences.protobuf.v0.j(v2, v0_5, v3_4, v12, v8);
                            break;
                        case 31:
                            androidx.datastore.preferences.protobuf.n v5_19 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.q(androidx.datastore.preferences.protobuf.b0.a(v5_19, v2));
                            break;
                        case 32:
                            androidx.datastore.preferences.protobuf.n v5_18 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.r(androidx.datastore.preferences.protobuf.b0.a(v5_18, v2));
                            break;
                        case 33:
                            androidx.datastore.preferences.protobuf.n v5_17 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.s(androidx.datastore.preferences.protobuf.b0.a(v5_17, v2));
                            break;
                        case 34:
                            androidx.datastore.preferences.protobuf.n v5_16 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.t(androidx.datastore.preferences.protobuf.b0.a(v5_16, v2));
                            break;
                        case 35:
                            androidx.datastore.preferences.protobuf.n v5_15 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.i(androidx.datastore.preferences.protobuf.b0.a(v5_15, v2));
                            break;
                        case 36:
                            androidx.datastore.preferences.protobuf.n v5_14 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.n(androidx.datastore.preferences.protobuf.b0.a(v5_14, v2));
                            break;
                        case 37:
                            androidx.datastore.preferences.protobuf.n v5_13 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.p(androidx.datastore.preferences.protobuf.b0.a(v5_13, v2));
                            break;
                        case 38:
                            androidx.datastore.preferences.protobuf.n v5_12 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.w(androidx.datastore.preferences.protobuf.b0.a(v5_12, v2));
                            break;
                        case 39:
                            androidx.datastore.preferences.protobuf.n v5_11 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.o(androidx.datastore.preferences.protobuf.b0.a(v5_11, v2));
                            break;
                        case 40:
                            androidx.datastore.preferences.protobuf.n v5_10 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.m(androidx.datastore.preferences.protobuf.b0.a(v5_10, v2));
                            break;
                        case 41:
                            androidx.datastore.preferences.protobuf.n v5_8 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.l(androidx.datastore.preferences.protobuf.b0.a(v5_8, v2));
                            break;
                        case 42:
                            androidx.datastore.preferences.protobuf.n v5_7 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.f(androidx.datastore.preferences.protobuf.b0.a(v5_7, v2));
                            break;
                        case 43:
                            androidx.datastore.preferences.protobuf.n v5_6 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.v(androidx.datastore.preferences.protobuf.b0.a(v5_6, v2));
                            break;
                        case 44:
                            androidx.datastore.preferences.protobuf.u0 v7_3 = v3_2;
                            androidx.datastore.preferences.protobuf.n v5_5 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            int v3_3 = androidx.datastore.preferences.protobuf.b0.a(v5_5, v2);
                            v4_0.j(v3_3);
                            v1_0.l(v7_3);
                            androidx.datastore.preferences.protobuf.v0.j(v2, v0_5, v3_3, v12, v8);
                            break;
                        case 45:
                            androidx.datastore.preferences.protobuf.n v5_4 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.q(androidx.datastore.preferences.protobuf.b0.a(v5_4, v2));
                            break;
                        case 46:
                            androidx.datastore.preferences.protobuf.n v5_3 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.r(androidx.datastore.preferences.protobuf.b0.a(v5_3, v2));
                            break;
                        case 47:
                            androidx.datastore.preferences.protobuf.n v5_2 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.s(androidx.datastore.preferences.protobuf.b0.a(v5_2, v2));
                            break;
                        case 48:
                            androidx.datastore.preferences.protobuf.n v5_1 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v14_43.getClass();
                            v4_0.t(androidx.datastore.preferences.protobuf.b0.a(v5_1, v2));
                            break;
                        case 49:
                            v2 = p19;
                            try {
                                v1_0.B(p19, androidx.datastore.preferences.protobuf.m0.x(v6_18), p20, v1_0.m(v3_2), p21);
                                v4_0 = p20;
                            } catch (androidx.datastore.preferences.protobuf.y) {
                                v6_16 = v1_0;
                                v14_42 = p20;
                            }
                            break;
                        case 50:
                            v1_0.r(v2, v3_2, v1_0.b[((v3_2 / 3) * 2)], v5_9, v4_0);
                            v2 = p19;
                            v14_42 = p20;
                            v6_16 = v1_0;
                            break;
                        case 51:
                            androidx.datastore.preferences.protobuf.v v6_12 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(1);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_12, Double.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).h()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 52:
                            androidx.datastore.preferences.protobuf.v v6_11 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(5);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_11, Float.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).l()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 53:
                            androidx.datastore.preferences.protobuf.v v6_10 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_10, Long.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).n()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 54:
                            androidx.datastore.preferences.protobuf.v v6_9 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_9, Long.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).w()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 55:
                            androidx.datastore.preferences.protobuf.v v6_8 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_8, Integer.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).m()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 56:
                            androidx.datastore.preferences.protobuf.v v6_7 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(1);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_7, Long.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).k()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 57:
                            androidx.datastore.preferences.protobuf.v v6_6 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(5);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_6, Integer.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).j()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 58:
                            androidx.datastore.preferences.protobuf.v v6_5 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_5, Boolean.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).f()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 59:
                            v1_0.D(v6_18, v4_0, v2);
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 60:
                            androidx.datastore.preferences.protobuf.v v6_4 = ((androidx.datastore.preferences.protobuf.a) v1_0.v(v2, v0_5, v3_2));
                            androidx.datastore.preferences.protobuf.u0 v7_0 = v1_0.m(v3_2);
                            v4_0.y(2);
                            v4_0.e(v6_4, v7_0, v5_9);
                            v1_0.J(v2, v0_5, v3_2, v6_4);
                            break;
                        case 61:
                            androidx.datastore.preferences.protobuf.h1.o(v2, androidx.datastore.preferences.protobuf.m0.x(v6_18), v4_0.g());
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 62:
                            androidx.datastore.preferences.protobuf.v v6_1 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_1, Integer.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).v()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 63:
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.u0 v7_28 = ((androidx.datastore.preferences.protobuf.j) v4_0.d).i();
                            v1_0.l(v3_2);
                            androidx.datastore.preferences.protobuf.h1.o(v2, androidx.datastore.preferences.protobuf.m0.x(v6_18), Integer.valueOf(v7_28));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 64:
                            androidx.datastore.preferences.protobuf.v v6_25 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(5);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_25, Integer.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).o()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 65:
                            androidx.datastore.preferences.protobuf.v v6_24 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(1);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_24, Long.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).p()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 66:
                            androidx.datastore.preferences.protobuf.v v6_23 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_23, Integer.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).q()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 67:
                            androidx.datastore.preferences.protobuf.v v6_22 = androidx.datastore.preferences.protobuf.m0.x(v6_18);
                            v4_0.y(0);
                            androidx.datastore.preferences.protobuf.h1.o(v2, v6_22, Long.valueOf(((androidx.datastore.preferences.protobuf.j) v4_0.d).r()));
                            v1_0.H(v2, v0_5, v3_2);
                            break;
                        case 68:
                            androidx.datastore.preferences.protobuf.v v6_21 = ((androidx.datastore.preferences.protobuf.a) v1_0.v(v2, v0_5, v3_2));
                            androidx.datastore.preferences.protobuf.u0 v7_7 = v1_0.m(v3_2);
                            v4_0.y(3);
                            v4_0.d(v6_21, v7_7, v5_9);
                            v1_0.J(v2, v0_5, v3_2, v6_21);
                            break;
                        default:
                            if (v12 == null) {
                                v8.getClass();
                                v12 = androidx.datastore.preferences.protobuf.c1.a(v2);
                            }
                            v8.getClass();
                            if (androidx.datastore.preferences.protobuf.c1.b(0, v4_0, v12)) {
                            }
                            while (v11 < v10) {
                                v1_0.k(v9[v11], v2, v12);
                                v11++;
                            }
                            if (v12 != null) {
                                ((androidx.datastore.preferences.protobuf.v) v2).unknownFields = v12;
                            }
                    }
                    v5_9 = p21;
                    v1_0 = v6_16;
                    v4_0 = v14_42;
                } else {
                    if (v0_5 != 2147483647) {
                        v8.getClass();
                        if (v12 == null) {
                            v12 = androidx.datastore.preferences.protobuf.c1.a(v2);
                        }
                        if (androidx.datastore.preferences.protobuf.c1.b(0, v4_0, v12)) {
                        }
                        while (v11 < v10) {
                            v1_0.k(v9[v11], v2, v12);
                            v11++;
                        }
                        if (v12 == null) {
                            return;
                        }
                    }
                    while (v11 < v10) {
                        v1_0.k(v9[v11], v2, v12);
                        v11++;
                    }
                    if (v12 != null) {
                        v8.getClass();
                    }
                }
                return;
            }
            while (v11 < v10) {
                v6_16.k(v9[v11], v2, v12);
                v11++;
            }
            if (v12 == null) {
                return;
            } else {
                ((androidx.datastore.preferences.protobuf.v) v2).unknownFields = v12;
                return;
            }
        }
    }

    public final void b(Object p11, Object p12)
    {
        if (!androidx.datastore.preferences.protobuf.m0.p(p11)) {
            String v12_3 = new StringBuilder("Mutating immutable message: ");
            v12_3.append(p11);
            throw new IllegalArgumentException(v12_3.toString());
        } else {
            p12.getClass();
            int v0_1 = 0;
            while(true) {
                Object v1_19 = this.a;
                if (v0_1 >= v1_19.length) {
                    break;
                }
                int v5_1;
                androidx.datastore.preferences.protobuf.s0 v2_3 = this.L(v0_1);
                long v6 = ((long) (1048575 & v2_3));
                Object v1_42 = v1_19[v0_1];
                switch (androidx.datastore.preferences.protobuf.m0.K(v2_3)) {
                    case 0:
                        if (!this.n(v0_1, p12)) {
                            v5_1 = p11;
                        } else {
                            androidx.datastore.preferences.protobuf.g1 v4_0 = androidx.datastore.preferences.protobuf.h1.c;
                            v5_1 = p11;
                            v4_0.l(p11, v6, v4_0.d(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 1:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            Object v1_40 = androidx.datastore.preferences.protobuf.h1.c;
                            v1_40.m(p11, v6, v1_40.e(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 2:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.n(p11, v6, androidx.datastore.preferences.protobuf.h1.c.g(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 3:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.n(p11, v6, androidx.datastore.preferences.protobuf.h1.c.g(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 4:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.m(p11, v6, androidx.datastore.preferences.protobuf.h1.c.f(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 5:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.n(p11, v6, androidx.datastore.preferences.protobuf.h1.c.g(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 6:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.m(p11, v6, androidx.datastore.preferences.protobuf.h1.c.f(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 7:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            Object v1_23 = androidx.datastore.preferences.protobuf.h1.c;
                            v1_23.j(p11, v6, v1_23.c(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 8:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.o(p11, v6, androidx.datastore.preferences.protobuf.h1.c.h(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 9:
                        this.s(v0_1, p11, p12);
                        break;
                    case 10:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.o(p11, v6, androidx.datastore.preferences.protobuf.h1.c.h(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 11:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.m(p11, v6, androidx.datastore.preferences.protobuf.h1.c.f(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 12:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.m(p11, v6, androidx.datastore.preferences.protobuf.h1.c.f(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 13:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.m(p11, v6, androidx.datastore.preferences.protobuf.h1.c.f(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 14:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.n(p11, v6, androidx.datastore.preferences.protobuf.h1.c.g(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 15:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.m(p11, v6, androidx.datastore.preferences.protobuf.h1.c.f(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 16:
                        if (!this.n(v0_1, p12)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.n(p11, v6, androidx.datastore.preferences.protobuf.h1.c.g(v6, p12));
                            this.G(v0_1, p11);
                        }
                        break;
                    case 17:
                        this.s(v0_1, p11, p12);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.k.getClass();
                        Object v1_47 = androidx.datastore.preferences.protobuf.h1.c;
                        androidx.datastore.preferences.protobuf.s0 v2_13 = ((androidx.datastore.preferences.protobuf.w) v1_47.h(v6, p11));
                        Object v1_49 = ((androidx.datastore.preferences.protobuf.w) v1_47.h(v6, p12));
                        androidx.datastore.preferences.protobuf.b v3_4 = ((androidx.datastore.preferences.protobuf.s0) v2_13);
                        androidx.datastore.preferences.protobuf.g1 v4_1 = v3_4.c;
                        int v5_5 = ((androidx.datastore.preferences.protobuf.s0) v1_49).c;
                        if ((v4_1 > null) && (v5_5 > 0)) {
                            if (!((androidx.datastore.preferences.protobuf.b) v2_13).a) {
                                v2_13 = v3_4.c((v5_5 + v4_1));
                            }
                            ((androidx.datastore.preferences.protobuf.b) v2_13).addAll(v1_49);
                        }
                        if (v4_1 > null) {
                            v1_49 = v2_13;
                        }
                        androidx.datastore.preferences.protobuf.h1.o(p11, v6, v1_49);
                        break;
                    case 50:
                        Object v1_43 = androidx.datastore.preferences.protobuf.h1.c;
                        androidx.datastore.preferences.protobuf.s0 v2_11 = v1_43.h(v6, p11);
                        Object v1_44 = v1_43.h(v6, p12);
                        this.m.getClass();
                        androidx.datastore.preferences.protobuf.h1.o(p11, v6, androidx.datastore.preferences.protobuf.i0.a(v2_11, v1_44));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!this.q(p12, v1_42, v0_1)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.o(p11, v6, androidx.datastore.preferences.protobuf.h1.c.h(v6, p12));
                            this.H(p11, v1_42, v0_1);
                        }
                        break;
                    case 60:
                        this.t(v0_1, p11, p12);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!this.q(p12, v1_42, v0_1)) {
                        } else {
                            androidx.datastore.preferences.protobuf.h1.o(p11, v6, androidx.datastore.preferences.protobuf.h1.c.h(v6, p12));
                            this.H(p11, v1_42, v0_1);
                        }
                        break;
                    case 68:
                        this.t(v0_1, p11, p12);
                        break;
                    default:
                }
                v0_1 += 3;
                p11 = v5_1;
            }
            androidx.datastore.preferences.protobuf.v0.k(this.l, p11, p12);
            return;
        }
    }

    public final void c(Object p1, androidx.datastore.preferences.protobuf.e0 p2)
    {
        p2.getClass();
        this.M(p1, p2);
        return;
    }

    public final int d(androidx.datastore.preferences.protobuf.v p12)
    {
        androidx.datastore.preferences.protobuf.c1 v0_0 = this.a;
        int v1 = v0_0.length;
        int v2 = 0;
        int v3_3 = 0;
        while (v2 < v1) {
            int v3_1;
            int v3_0;
            int v4_0;
            int v4_12 = this.L(v2);
            java.nio.charset.Charset v5 = v0_0[v2];
            long v6_2 = ((long) (1048575 & v4_12));
            int v8_0 = 1237;
            int v10 = 37;
            switch (androidx.datastore.preferences.protobuf.m0.K(v4_12)) {
                case 0:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.x.b(Double.doubleToLongBits(androidx.datastore.preferences.protobuf.h1.c.d(v6_2, p12)));
                    v3_3 = (v4_0 + v3_1);
                    break;
                case 1:
                    v3_1 = (v3_3 * 53);
                    v4_0 = Float.floatToIntBits(androidx.datastore.preferences.protobuf.h1.c.e(v6_2, p12));
                    break;
                case 2:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.h1.c.g(v6_2, p12));
                    break;
                case 3:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.h1.c.g(v6_2, p12));
                    break;
                case 4:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.f(v6_2, p12);
                    break;
                case 5:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.h1.c.g(v6_2, p12));
                    break;
                case 6:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.f(v6_2, p12);
                    break;
                case 7:
                    v3_0 = (v3_3 * 53);
                    if (!androidx.datastore.preferences.protobuf.h1.c.c(v6_2, p12)) {
                        v3_3 = (v8_0 + v3_0);
                    } else {
                        v8_0 = 1231;
                    }
                    break;
                case 8:
                    v3_1 = (v3_3 * 53);
                    v4_0 = ((String) androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12)).hashCode();
                    break;
                case 9:
                    int v4_44 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12);
                    if (v4_44 == 0) {
                        v3_3 = ((v3_3 * 53) + v10);
                    } else {
                        v10 = v4_44.hashCode();
                    }
                    break;
                case 10:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12).hashCode();
                    break;
                case 11:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.f(v6_2, p12);
                    break;
                case 12:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.f(v6_2, p12);
                    break;
                case 13:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.f(v6_2, p12);
                    break;
                case 14:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.h1.c.g(v6_2, p12));
                    break;
                case 15:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.f(v6_2, p12);
                    break;
                case 16:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.h1.c.g(v6_2, p12));
                    break;
                case 17:
                    int v4_31 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12);
                    if (v4_31 == 0) {
                    } else {
                        v10 = v4_31.hashCode();
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12).hashCode();
                    break;
                case 50:
                    v3_1 = (v3_3 * 53);
                    v4_0 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12).hashCode();
                    break;
                case 51:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.x.b(Double.doubleToLongBits(((Double) androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12)).doubleValue()));
                    }
                    break;
                case 52:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = Float.floatToIntBits(((Float) androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12)).floatValue());
                    }
                    break;
                case 53:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.m0.z(v6_2, p12));
                    }
                    break;
                case 54:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.m0.z(v6_2, p12));
                    }
                    break;
                case 55:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.m0.y(v6_2, p12);
                    }
                    break;
                case 56:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.m0.z(v6_2, p12));
                    }
                    break;
                case 57:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.m0.y(v6_2, p12);
                    }
                    break;
                case 58:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_0 = (v3_3 * 53);
                        if (!((Boolean) androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12)).booleanValue()) {
                        }
                    }
                    break;
                case 59:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = ((String) androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12)).hashCode();
                    }
                    break;
                case 60:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12).hashCode();
                    }
                    break;
                case 61:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12).hashCode();
                    }
                    break;
                case 62:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.m0.y(v6_2, p12);
                    }
                    break;
                case 63:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.m0.y(v6_2, p12);
                    }
                    break;
                case 64:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.m0.y(v6_2, p12);
                    }
                    break;
                case 65:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.m0.z(v6_2, p12));
                    }
                    break;
                case 66:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.m0.y(v6_2, p12);
                    }
                    break;
                case 67:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.x.b(androidx.datastore.preferences.protobuf.m0.z(v6_2, p12));
                    }
                    break;
                case 68:
                    if (!this.q(p12, v5, v2)) {
                    } else {
                        v3_1 = (v3_3 * 53);
                        v4_0 = androidx.datastore.preferences.protobuf.h1.c.h(v6_2, p12).hashCode();
                    }
                    break;
                default:
            }
            v2 += 3;
        }
        int v3_4 = (v3_3 * 53);
        this.l.getClass();
        return (p12.unknownFields.hashCode() + v3_4);
    }

    public final void e(Object p10)
    {
        if (androidx.datastore.preferences.protobuf.m0.p(p10)) {
            if ((p10 instanceof androidx.datastore.preferences.protobuf.v)) {
                ((androidx.datastore.preferences.protobuf.v) p10).k(2147483647);
                ((androidx.datastore.preferences.protobuf.v) p10).memoizedHashCode = 0;
                ((androidx.datastore.preferences.protobuf.v) p10).h();
            }
            boolean v0_1 = this.a;
            int v2_0 = v0_1.length;
            int v3 = 0;
            while (v3 < v2_0) {
                sun.misc.Unsafe v4_0 = this.L(v3);
                boolean v5_2 = ((long) (1048575 & v4_0));
                sun.misc.Unsafe v4_1 = androidx.datastore.preferences.protobuf.m0.K(v4_0);
                if (v4_1 == 9) {
                    if (this.n(v3, p10)) {
                        this.m(v3).e(androidx.datastore.preferences.protobuf.m0.o.getObject(p10, v5_2));
                    }
                } else {
                    if ((v4_1 == 60) || (v4_1 == 68)) {
                        if (this.q(p10, v0_1[v3], v3)) {
                            this.m(v3).e(androidx.datastore.preferences.protobuf.m0.o.getObject(p10, v5_2));
                        }
                    } else {
                        switch (v4_1) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.k.getClass();
                                sun.misc.Unsafe v4_10 = ((androidx.datastore.preferences.protobuf.b) ((androidx.datastore.preferences.protobuf.w) androidx.datastore.preferences.protobuf.h1.c.h(v5_2, p10)));
                                if (v4_10.a) {
                                    v4_10.a = 0;
                                }
                                break;
                            case 50:
                                sun.misc.Unsafe v4_5 = androidx.datastore.preferences.protobuf.m0.o;
                                Object v7_4 = v4_5.getObject(p10, v5_2);
                                if (v7_4 != null) {
                                    this.m.getClass();
                                    ((androidx.datastore.preferences.protobuf.h0) v7_4).a = 0;
                                    v4_5.putObject(p10, v5_2, v7_4);
                                }
                                break;
                            default:
                        }
                    }
                }
                v3 += 3;
            }
            this.l.getClass();
            androidx.datastore.preferences.protobuf.b1 v10_2 = ((androidx.datastore.preferences.protobuf.v) p10).unknownFields;
            if (v10_2.e) {
                v10_2.e = 0;
            }
        }
        return;
    }

    public final boolean f(Object p17)
    {
        java.util.Iterator v2_9 = 1048575;
        int v3_0 = 0;
        int v8 = 0;
        while (v8 < this.h) {
            int v4_2;
            int v3_1;
            java.util.Iterator v2_10;
            int v4_1 = this.g[v8];
            boolean v9_6 = this.a;
            Class v10_1 = v9_6[v4_1];
            int v11 = this.L(v4_1);
            boolean v9_10 = v9_6[(v4_1 + 2)];
            int v12_1 = (v9_10 & 1048575);
            androidx.datastore.preferences.protobuf.u0 v5_7 = (1 << (v9_10 >> 20));
            if (v12_1 == v2_9) {
                v3_1 = v2_9;
                v2_10 = v4_1;
                v4_2 = v3_0;
            } else {
                if (v12_1 != 1048575) {
                    v3_0 = androidx.datastore.preferences.protobuf.m0.o.getInt(p17, ((long) v12_1));
                }
                v2_10 = v4_1;
                v4_2 = v3_0;
                v3_1 = v12_1;
            }
            if (((268435456 & v11) == 0) || (this.o(p17, v2_10, v3_1, v4_2, v5_7))) {
                boolean v9_15 = androidx.datastore.preferences.protobuf.m0.K(v11);
                if ((v9_15 == 9) || (v9_15 == 17)) {
                    if ((this.o(p17, v2_10, v3_1, v4_2, v5_7)) && (!this.m(v2_10).f(androidx.datastore.preferences.protobuf.h1.c.h(((long) (v11 & 1048575)), p17)))) {
                        return 0;
                    }
                } else {
                    if (v9_15 != 27) {
                        if ((v9_15 == 60) || (v9_15 == 68)) {
                            if ((!this.q(p17, v10_1, v2_10)) || (this.m(v2_10).f(androidx.datastore.preferences.protobuf.h1.c.h(((long) (v11 & 1048575)), p17)))) {
                                v8++;
                                v2_9 = v3_1;
                                v3_0 = v4_2;
                            }
                        } else {
                            if (v9_15 != 49) {
                                if (v9_15 == 50) {
                                    androidx.datastore.preferences.protobuf.u0 v5_3 = androidx.datastore.preferences.protobuf.h1.c.h(((long) (v11 & 1048575)), p17);
                                    this.m.getClass();
                                    androidx.datastore.preferences.protobuf.u0 v5_4 = ((androidx.datastore.preferences.protobuf.h0) v5_3);
                                    if ((!v5_4.isEmpty()) && (((androidx.datastore.preferences.protobuf.g0) this.b[((v2_10 / 3) * 2)]).a.b.a == androidx.datastore.preferences.protobuf.q1.o)) {
                                        java.util.Iterator v2_8 = v5_4.values().iterator();
                                        androidx.datastore.preferences.protobuf.u0 v5_5 = 0;
                                        while (v2_8.hasNext()) {
                                            boolean v9_8 = v2_8.next();
                                            if (v5_5 == null) {
                                                v5_5 = androidx.datastore.preferences.protobuf.r0.c.a(v9_8.getClass());
                                            }
                                            if (!v5_5.f(v9_8)) {
                                                return 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    androidx.datastore.preferences.protobuf.u0 v5_24 = ((java.util.List) androidx.datastore.preferences.protobuf.h1.c.h(((long) (v11 & 1048575)), p17));
                    if (!v5_24.isEmpty()) {
                        java.util.Iterator v2_16 = this.m(v2_10);
                        boolean v9_0 = 0;
                        while (v9_0 < v5_24.size()) {
                            if (v2_16.f(v5_24.get(v9_0))) {
                                v9_0++;
                            }
                        }
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final boolean g(androidx.datastore.preferences.protobuf.v p12, androidx.datastore.preferences.protobuf.v p13)
    {
        androidx.datastore.preferences.protobuf.c1 v0_0 = this.a;
        int v1 = v0_0.length;
        int v3 = 0;
        while(true) {
            int v4_0 = 1;
            if (v3 >= v1) {
                break;
            }
            boolean v5_18 = this.L(v3);
            long v7_1 = ((long) (v5_18 & 1048575));
            switch (androidx.datastore.preferences.protobuf.m0.K(v5_18)) {
                case 0:
                    if (!this.j(p12, p13, v3)) {
                        v4_0 = 0;
                    } else {
                        boolean v5_48 = androidx.datastore.preferences.protobuf.h1.c;
                        if (Double.doubleToLongBits(v5_48.d(v7_1, p12)) != Double.doubleToLongBits(v5_48.d(v7_1, p13))) {
                        } else {
                        }
                    }
                    return 0;
                case 1:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_43 = androidx.datastore.preferences.protobuf.h1.c;
                        if (Float.floatToIntBits(v5_43.e(v7_1, p12)) != Float.floatToIntBits(v5_43.e(v7_1, p13))) {
                        } else {
                        }
                    }
                    return 0;
                case 2:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_39 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_39.g(v7_1, p12) != v5_39.g(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 3:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_34 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_34.g(v7_1, p12) != v5_34.g(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 4:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_31 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_31.f(v7_1, p12) != v5_31.f(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 5:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_27 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_27.g(v7_1, p12) != v5_27.g(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 6:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_24 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_24.f(v7_1, p12) != v5_24.f(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 7:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_21 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_21.c(v7_1, p12) != v5_21.c(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 8:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_16 = androidx.datastore.preferences.protobuf.h1.c;
                        if (!androidx.datastore.preferences.protobuf.v0.l(v5_16.h(v7_1, p12), v5_16.h(v7_1, p13))) {
                        } else {
                        }
                    }
                    return 0;
                case 9:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_12 = androidx.datastore.preferences.protobuf.h1.c;
                        if (!androidx.datastore.preferences.protobuf.v0.l(v5_12.h(v7_1, p12), v5_12.h(v7_1, p13))) {
                        } else {
                        }
                    }
                    return 0;
                case 10:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_8 = androidx.datastore.preferences.protobuf.h1.c;
                        if (!androidx.datastore.preferences.protobuf.v0.l(v5_8.h(v7_1, p12), v5_8.h(v7_1, p13))) {
                        } else {
                        }
                    }
                    return 0;
                case 11:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_5 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_5.f(v7_1, p12) != v5_5.f(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 12:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_2 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_2.f(v7_1, p12) != v5_2.f(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 13:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_76 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_76.f(v7_1, p12) != v5_76.f(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 14:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_72 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_72.g(v7_1, p12) != v5_72.g(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 15:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_69 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_69.f(v7_1, p12) != v5_69.f(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 16:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_65 = androidx.datastore.preferences.protobuf.h1.c;
                        if (v5_65.g(v7_1, p12) != v5_65.g(v7_1, p13)) {
                        } else {
                        }
                    }
                    return 0;
                case 17:
                    if (!this.j(p12, p13, v3)) {
                    } else {
                        boolean v5_61 = androidx.datastore.preferences.protobuf.h1.c;
                        if (!androidx.datastore.preferences.protobuf.v0.l(v5_61.h(v7_1, p12), v5_61.h(v7_1, p13))) {
                        } else {
                        }
                    }
                    return 0;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    int v4_3 = androidx.datastore.preferences.protobuf.h1.c;
                    v4_0 = androidx.datastore.preferences.protobuf.v0.l(v4_3.h(v7_1, p12), v4_3.h(v7_1, p13));
                    break;
                case 50:
                    int v4_1 = androidx.datastore.preferences.protobuf.h1.c;
                    v4_0 = androidx.datastore.preferences.protobuf.v0.l(v4_1.h(v7_1, p12), v4_1.h(v7_1, p13));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    boolean v5_54 = ((long) (v0_0[(v3 + 2)] & 1048575));
                    long v9_5 = androidx.datastore.preferences.protobuf.h1.c;
                    if ((v9_5.f(v5_54, p12) != v9_5.f(v5_54, p13)) || (!androidx.datastore.preferences.protobuf.v0.l(v9_5.h(v7_1, p12), v9_5.h(v7_1, p13)))) {
                    } else {
                    }
                    return 0;
                default:
            }
            if (v4_0 != 0) {
                v3 += 3;
            }
            return 0;
        }
        this.l.getClass();
        if (p12.unknownFields.equals(p13.unknownFields)) {
            return 1;
        }
        return 0;
    }

    public final int h(androidx.datastore.preferences.protobuf.v p17)
    {
        int v0_0 = this;
        androidx.datastore.preferences.protobuf.v v1_0 = p17;
        sun.misc.Unsafe v6 = androidx.datastore.preferences.protobuf.m0.o;
        long v3_2 = 1048575;
        int v2_1 = 0;
        int v4 = 0;
        int v9 = 0;
        while(true) {
            int v5_144 = v0_0.a;
            if (v2_1 >= v5_144.length) {
                break;
            }
            int v5_42;
            int v10_8 = v0_0.L(v2_1);
            int v11_3 = androidx.datastore.preferences.protobuf.m0.K(v10_8);
            int v12_0 = v5_144[v2_1];
            int v5_36 = v5_144[(v2_1 + 2)];
            int v13_6 = (v5_36 & 1048575);
            if (v11_3 > 17) {
                v5_42 = 0;
            } else {
                if (v13_6 != v3_2) {
                    if (v13_6 != 1048575) {
                        v4 = v6.getInt(v1_0, ((long) v13_6));
                    } else {
                        v4 = 0;
                    }
                    v3_2 = v13_6;
                }
                v5_42 = (1 << (v5_36 >> 20));
            }
            int v13_10 = ((long) (v10_8 & 1048575));
            // Both branches of the condition point to the same code.
            // if (v11_3 < androidx.datastore.preferences.protobuf.r.b.a) {
                int v10_20;
                int v10_0;
                int v0_5;
                int v0_6;
                int v0_7;
                int v10_24;
                int v5_22;
                int v5_1;
                int v10_4;
                int v11_7;
                int v5_24;
                int v0_12;
                int v10_9;
                int v5_28;
                int v5_7;
                int v7_3;
                int v7_4;
                int v0_20;
                int v5_77;
                int v10_16;
                int v0_1;
                int v5_121;
                int v5_123;
                switch (v11_3) {
                    case 0:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            v5_24 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_7 = (v5_24 + 8);
                            v9 += v5_7;
                        }
                        break;
                    case 1:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                            v0_0 = this;
                            v1_0 = p17;
                        } else {
                            v0_7 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v0_20 = (v0_7 + 4);
                            v9 += v0_20;
                        }
                        break;
                    case 2:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                            v0_0 = this;
                        } else {
                            int v10_38 = v6.getLong(v1_0, v13_10);
                            v0_1 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_121 = androidx.datastore.preferences.protobuf.l.t0(v10_38);
                            v9 += (v5_121 + v0_1);
                        }
                        break;
                    case 3:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v10_37 = v6.getLong(v1_0, v13_10);
                            v0_1 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_121 = androidx.datastore.preferences.protobuf.l.t0(v10_37);
                        }
                        break;
                    case 4:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v0_21 = v6.getInt(v1_0, v13_10);
                            v5_123 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v0_5 = androidx.datastore.preferences.protobuf.l.t0(((long) v0_21));
                            v0_12 = (v0_5 + v5_123);
                            v9 += v0_12;
                        }
                        break;
                    case 5:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            v0_6 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v0_20 = (v0_6 + 8);
                        }
                        break;
                    case 6:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            v0_7 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 7:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            v0_20 = (androidx.datastore.preferences.protobuf.l.r0(v12_0) + 1);
                        }
                        break;
                    case 8:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v0_16;
                            int v0_13 = v6.getObject(v1_0, v13_10);
                            if (!(v0_13 instanceof androidx.datastore.preferences.protobuf.g)) {
                                v0_16 = (androidx.datastore.preferences.protobuf.l.q0(((String) v0_13)) + androidx.datastore.preferences.protobuf.l.r0(v12_0));
                            } else {
                                v0_16 = androidx.datastore.preferences.protobuf.l.p0(v12_0, ((androidx.datastore.preferences.protobuf.g) v0_13));
                            }
                            v9 = (v0_16 + v9);
                        }
                        break;
                    case 9:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v5_130 = v6.getObject(v1_0, v13_10);
                            int v7_16 = v0_0.m(v2_1);
                            int v5_131 = ((androidx.datastore.preferences.protobuf.a) v5_130);
                            int v10_35 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            int v5_132 = v5_131.a(v7_16);
                            v9 += ((androidx.datastore.preferences.protobuf.l.s0(v5_132) + v5_132) + v10_35);
                        }
                        break;
                    case 10:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            v0_12 = androidx.datastore.preferences.protobuf.l.p0(v12_0, ((androidx.datastore.preferences.protobuf.g) v6.getObject(v1_0, v13_10)));
                        }
                        break;
                    case 11:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v0_9 = v6.getInt(v1_0, v13_10);
                            v5_123 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v0_5 = androidx.datastore.preferences.protobuf.l.s0(v0_9);
                        }
                        break;
                    case 12:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v0_8 = v6.getInt(v1_0, v13_10);
                            v5_123 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v0_5 = androidx.datastore.preferences.protobuf.l.t0(((long) v0_8));
                        }
                        break;
                    case 13:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            v0_7 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 14:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            v0_6 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 15:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v0_2 = v6.getInt(v1_0, v13_10);
                            v5_123 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v0_5 = androidx.datastore.preferences.protobuf.l.s0(((v0_2 >> 31) ^ (v0_2 << 1)));
                        }
                        break;
                    case 16:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v13_18 = v6.getLong(v1_0, v13_10);
                            v0_1 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_121 = androidx.datastore.preferences.protobuf.l.t0(((v13_18 << 1) ^ (v13_18 >> 63)));
                        }
                        break;
                    case 17:
                        if (!v0_0.o(v1_0, v2_1, v3_2, v4, v5_42)) {
                        } else {
                            int v5_119 = ((androidx.datastore.preferences.protobuf.a) v6.getObject(v1_0, v13_10));
                            int v7_14 = v0_0.m(v2_1);
                            v10_0 = (androidx.datastore.preferences.protobuf.l.r0(v12_0) * 2);
                            v5_1 = v5_119.a(v7_14);
                            v5_7 = (v5_1 + v10_0);
                        }
                        break;
                    case 18:
                        v5_7 = androidx.datastore.preferences.protobuf.v0.c(v12_0, ((java.util.List) v6.getObject(v1_0, v13_10)));
                        break;
                    case 19:
                        v5_7 = androidx.datastore.preferences.protobuf.v0.b(v12_0, ((java.util.List) v6.getObject(v1_0, v13_10)));
                        break;
                    case 20:
                        int v5_110 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        if (v5_110.size() != 0) {
                            v10_24 = ((androidx.datastore.preferences.protobuf.l.r0(v12_0) * v5_110.size()) + androidx.datastore.preferences.protobuf.v0.e(v5_110));
                            v9 += v10_24;
                        } else {
                            v10_24 = 0;
                        }
                        break;
                    case 21:
                        int v5_107 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        v7_4 = v5_107.size();
                        if (v7_4 != 0) {
                            v5_77 = androidx.datastore.preferences.protobuf.v0.i(v5_107);
                            v10_20 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_24 = ((v10_20 * v7_4) + v5_77);
                        }
                        break;
                    case 22:
                        int v5_105 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        v7_4 = v5_105.size();
                        if (v7_4 != 0) {
                            v5_77 = androidx.datastore.preferences.protobuf.v0.d(v5_105);
                            v10_20 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 23:
                        v5_7 = androidx.datastore.preferences.protobuf.v0.c(v12_0, ((java.util.List) v6.getObject(v1_0, v13_10)));
                        break;
                    case 24:
                        v5_7 = androidx.datastore.preferences.protobuf.v0.b(v12_0, ((java.util.List) v6.getObject(v1_0, v13_10)));
                        break;
                    case 25:
                        int v7_11;
                        int v5_99 = ((java.util.List) v6.getObject(v1_0, v13_10)).size();
                        if (v5_99 != 0) {
                            v7_11 = ((androidx.datastore.preferences.protobuf.l.r0(v12_0) + 1) * v5_99);
                        } else {
                            v7_11 = 0;
                        }
                        v9 += v7_11;
                        break;
                    case 26:
                        int v5_96 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        int v7_8 = v5_96.size();
                        if (v7_8 != 0) {
                            v10_24 = (androidx.datastore.preferences.protobuf.l.r0(v12_0) * v7_8);
                            int v11_14 = 0;
                            while (v11_14 < v7_8) {
                                int v12_4 = v5_96.get(v11_14);
                                if (!(v12_4 instanceof androidx.datastore.preferences.protobuf.g)) {
                                    v10_24 = (androidx.datastore.preferences.protobuf.l.q0(((String) v12_4)) + v10_24);
                                } else {
                                    int v12_9 = ((androidx.datastore.preferences.protobuf.g) v12_4).size();
                                    v10_24 = ((androidx.datastore.preferences.protobuf.l.s0(v12_9) + v12_9) + v10_24);
                                }
                                v11_14++;
                            }
                        }
                        break;
                    case 27:
                        int v5_92 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        int v7_7 = v0_0.m(v2_1);
                        int v10_25 = v5_92.size();
                        if (v10_25 != 0) {
                            v11_7 = (androidx.datastore.preferences.protobuf.l.r0(v12_0) * v10_25);
                            int v12_3 = 0;
                            while (v12_3 < v10_25) {
                                int v13_13 = ((androidx.datastore.preferences.protobuf.a) v5_92.get(v12_3)).a(v7_7);
                                v11_7 += (androidx.datastore.preferences.protobuf.l.s0(v13_13) + v13_13);
                                v12_3++;
                            }
                            v9 += v11_7;
                        } else {
                            v11_7 = 0;
                        }
                        break;
                    case 28:
                        int v5_89 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        int v7_5 = v5_89.size();
                        if (v7_5 != 0) {
                            v10_24 = (androidx.datastore.preferences.protobuf.l.r0(v12_0) * v7_5);
                            int v7_6 = 0;
                            while (v7_6 < v5_89.size()) {
                                int v11_12 = ((androidx.datastore.preferences.protobuf.g) v5_89.get(v7_6)).size();
                                v10_24 += (androidx.datastore.preferences.protobuf.l.s0(v11_12) + v11_12);
                                v7_6++;
                            }
                        }
                        break;
                    case 29:
                        int v5_87 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        v7_4 = v5_87.size();
                        if (v7_4 != 0) {
                            v5_77 = androidx.datastore.preferences.protobuf.v0.h(v5_87);
                            v10_20 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 30:
                        int v5_85 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        v7_4 = v5_85.size();
                        if (v7_4 != 0) {
                            v5_77 = androidx.datastore.preferences.protobuf.v0.a(v5_85);
                            v10_20 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 31:
                        v5_7 = androidx.datastore.preferences.protobuf.v0.b(v12_0, ((java.util.List) v6.getObject(v1_0, v13_10)));
                        break;
                    case 32:
                        v5_7 = androidx.datastore.preferences.protobuf.v0.c(v12_0, ((java.util.List) v6.getObject(v1_0, v13_10)));
                        break;
                    case 33:
                        int v5_79 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        v7_4 = v5_79.size();
                        if (v7_4 != 0) {
                            v5_77 = androidx.datastore.preferences.protobuf.v0.f(v5_79);
                            v10_20 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 34:
                        int v5_76 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        v7_4 = v5_76.size();
                        if (v7_4 != 0) {
                            v5_77 = androidx.datastore.preferences.protobuf.v0.g(v5_76);
                            v10_20 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 35:
                        v5_28 = (((java.util.List) v6.getObject(v1_0, v13_10)).size() * 8);
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                            v10_9 = (v10_16 + v7_3);
                            v10_4 = (v10_9 + v5_28);
                            v9 += v10_4;
                        }
                        break;
                    case 36:
                        v5_28 = (((java.util.List) v6.getObject(v1_0, v13_10)).size() * 4);
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 37:
                        v5_28 = androidx.datastore.preferences.protobuf.v0.e(((java.util.List) v6.getObject(v1_0, v13_10)));
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 38:
                        v5_28 = androidx.datastore.preferences.protobuf.v0.i(((java.util.List) v6.getObject(v1_0, v13_10)));
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 39:
                        v5_28 = androidx.datastore.preferences.protobuf.v0.d(((java.util.List) v6.getObject(v1_0, v13_10)));
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 40:
                        v5_28 = (((java.util.List) v6.getObject(v1_0, v13_10)).size() * 8);
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 41:
                        v5_28 = (((java.util.List) v6.getObject(v1_0, v13_10)).size() * 4);
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 42:
                        v5_28 = ((java.util.List) v6.getObject(v1_0, v13_10)).size();
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 43:
                        v5_28 = androidx.datastore.preferences.protobuf.v0.h(((java.util.List) v6.getObject(v1_0, v13_10)));
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 44:
                        v5_28 = androidx.datastore.preferences.protobuf.v0.a(((java.util.List) v6.getObject(v1_0, v13_10)));
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 45:
                        v5_28 = (((java.util.List) v6.getObject(v1_0, v13_10)).size() * 4);
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 46:
                        v5_28 = (((java.util.List) v6.getObject(v1_0, v13_10)).size() * 8);
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 47:
                        v5_28 = androidx.datastore.preferences.protobuf.v0.f(((java.util.List) v6.getObject(v1_0, v13_10)));
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 48:
                        v5_28 = androidx.datastore.preferences.protobuf.v0.g(((java.util.List) v6.getObject(v1_0, v13_10)));
                        if (v5_28 <= 0) {
                        } else {
                            v7_3 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_16 = androidx.datastore.preferences.protobuf.l.s0(v5_28);
                        }
                        break;
                    case 49:
                        int v13_9;
                        int v5_38 = ((java.util.List) v6.getObject(v1_0, v13_10));
                        int v7_2 = v0_0.m(v2_1);
                        int v10_15 = v5_38.size();
                        if (v10_15 != 0) {
                            int v11_8 = 0;
                            v13_9 = 0;
                            while (v11_8 < v10_15) {
                                v13_9 += (((androidx.datastore.preferences.protobuf.a) v5_38.get(v11_8)).a(v7_2) + (androidx.datastore.preferences.protobuf.l.r0(v12_0) * 2));
                                v11_8++;
                            }
                        } else {
                            v13_9 = 0;
                        }
                        v9 += v13_9;
                        break;
                    case 50:
                        int v5_32 = v6.getObject(v1_0, v13_10);
                        int v10_13 = v0_0.b[((v2_1 / 3) * 2)];
                        v0_0.m.getClass();
                        int v5_33 = ((androidx.datastore.preferences.protobuf.h0) v5_32);
                        int v10_14 = ((androidx.datastore.preferences.protobuf.g0) v10_13);
                        if (!v5_33.isEmpty()) {
                            int v5_35 = v5_33.entrySet().iterator();
                            v11_7 = 0;
                            while (v5_35.hasNext()) {
                                int v13_3 = ((java.util.Map$Entry) v5_35.next());
                                Object v14_0 = v13_3.getKey();
                                int v13_4 = v13_3.getValue();
                                v10_14.getClass();
                                int v15_0 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                                int v7_1 = androidx.datastore.preferences.protobuf.g0.a(v10_14.a, v14_0, v13_4);
                                v11_7 += ((androidx.datastore.preferences.protobuf.l.s0(v7_1) + v7_1) + v15_0);
                            }
                        }
                        break;
                    case 51:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_24 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 52:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_22 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_7 = (v5_22 + 4);
                        }
                        break;
                    case 53:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v10_10 = androidx.datastore.preferences.protobuf.m0.z(v13_10, v1_0);
                            v5_28 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_9 = androidx.datastore.preferences.protobuf.l.t0(v10_10);
                        }
                        break;
                    case 54:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v10_7 = androidx.datastore.preferences.protobuf.m0.z(v13_10, v1_0);
                            v5_28 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_9 = androidx.datastore.preferences.protobuf.l.t0(v10_7);
                        }
                        break;
                    case 55:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v5_26 = androidx.datastore.preferences.protobuf.m0.y(v13_10, v1_0);
                            v10_0 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_1 = androidx.datastore.preferences.protobuf.l.t0(((long) v5_26));
                        }
                        break;
                    case 56:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_24 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 57:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_22 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 58:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_7 = (androidx.datastore.preferences.protobuf.l.r0(v12_0) + 1);
                        }
                        break;
                    case 59:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v5_16;
                            int v5_13 = v6.getObject(v1_0, v13_10);
                            if (!(v5_13 instanceof androidx.datastore.preferences.protobuf.g)) {
                                v5_16 = (androidx.datastore.preferences.protobuf.l.q0(((String) v5_13)) + androidx.datastore.preferences.protobuf.l.r0(v12_0));
                            } else {
                                v5_16 = androidx.datastore.preferences.protobuf.l.p0(v12_0, ((androidx.datastore.preferences.protobuf.g) v5_13));
                            }
                            v9 = (v5_16 + v9);
                        }
                        break;
                    case 60:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v5_9 = v6.getObject(v1_0, v13_10);
                            int v10_1 = v0_0.m(v2_1);
                            int v5_10 = ((androidx.datastore.preferences.protobuf.a) v5_9);
                            int v11_1 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            int v5_11 = v5_10.a(v10_1);
                            v10_4 = ((androidx.datastore.preferences.protobuf.l.s0(v5_11) + v5_11) + v11_1);
                        }
                        break;
                    case 61:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_7 = androidx.datastore.preferences.protobuf.l.p0(v12_0, ((androidx.datastore.preferences.protobuf.g) v6.getObject(v1_0, v13_10)));
                        }
                        break;
                    case 62:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v5_3 = androidx.datastore.preferences.protobuf.m0.y(v13_10, v1_0);
                            v10_0 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_1 = androidx.datastore.preferences.protobuf.l.s0(v5_3);
                        }
                        break;
                    case 63:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v5_0 = androidx.datastore.preferences.protobuf.m0.y(v13_10, v1_0);
                            v10_0 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_1 = androidx.datastore.preferences.protobuf.l.t0(((long) v5_0));
                        }
                        break;
                    case 64:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_22 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 65:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_24 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                        }
                        break;
                    case 66:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v5_142 = androidx.datastore.preferences.protobuf.m0.y(v13_10, v1_0);
                            v10_0 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v5_1 = androidx.datastore.preferences.protobuf.l.s0(((v5_142 >> 31) ^ (v5_142 << 1)));
                        }
                        break;
                    case 67:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            int v13_20 = androidx.datastore.preferences.protobuf.m0.z(v13_10, v1_0);
                            v5_28 = androidx.datastore.preferences.protobuf.l.r0(v12_0);
                            v10_9 = androidx.datastore.preferences.protobuf.l.t0(((v13_20 << 1) ^ (v13_20 >> 63)));
                        }
                        break;
                    case 68:
                        if (!v0_0.q(v1_0, v12_0, v2_1)) {
                        } else {
                            v5_7 = (((androidx.datastore.preferences.protobuf.a) v6.getObject(v1_0, v13_10)).a(v0_0.m(v2_1)) + (androidx.datastore.preferences.protobuf.l.r0(v12_0) * 2));
                        }
                        break;
                    default:
                }
                v2_1 += 3;
            // }
        }
        v0_0.l.getClass();
        return (v1_0.unknownFields.b() + v9);
    }

    public final androidx.datastore.preferences.protobuf.v i()
    {
        this.j.getClass();
        return ((androidx.datastore.preferences.protobuf.v) this.e).i();
    }

    public final boolean j(androidx.datastore.preferences.protobuf.v p1, androidx.datastore.preferences.protobuf.v p2, int p3)
    {
        if (this.n(p3, p1) != this.n(p3, p2)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void k(int p3, Object p4, Object p5)
    {
        if (androidx.datastore.preferences.protobuf.h1.c.h(((long) (this.L(p3) & 1048575)), p4) != null) {
            this.l(p3);
            return;
        } else {
            return;
        }
    }

    public final void l(int p2)
    {
        if (this.b[(((p2 / 3) * 2) + 1)] != null) {
            throw new ClassCastException();
        } else {
            return;
        }
    }

    public final androidx.datastore.preferences.protobuf.u0 m(int p4)
    {
        int v4_2 = ((p4 / 3) * 2);
        Object[] v0 = this.b;
        androidx.datastore.preferences.protobuf.u0 v1_2 = ((androidx.datastore.preferences.protobuf.u0) v0[v4_2]);
        if (v1_2 == null) {
            androidx.datastore.preferences.protobuf.u0 v1_0 = androidx.datastore.preferences.protobuf.r0.c.a(((Class) v0[(v4_2 + 1)]));
            v0[v4_2] = v1_0;
            return v1_0;
        } else {
            return v1_2;
        }
    }

    public final boolean n(int p7, Object p8)
    {
        androidx.datastore.preferences.protobuf.g1 v0_3 = this.a[(p7 + 2)];
        androidx.datastore.preferences.protobuf.g1 v2_2 = ((long) (v0_3 & 1048575));
        if (v2_2 != 1048575) {
            if (((1 << (v0_3 >> 20)) & androidx.datastore.preferences.protobuf.h1.c.f(v2_2, p8)) != 0) {
                return 1;
            }
        } else {
            IllegalArgumentException v7_22 = this.L(p7);
            androidx.datastore.preferences.protobuf.g1 v0_4 = ((long) (v7_22 & 1048575));
            switch (androidx.datastore.preferences.protobuf.m0.K(v7_22)) {
                case 0:
                    if (Double.doubleToRawLongBits(androidx.datastore.preferences.protobuf.h1.c.d(v0_4, p8)) != 0) {
                        return 1;
                    }
                case 1:
                    if (Float.floatToRawIntBits(androidx.datastore.preferences.protobuf.h1.c.e(v0_4, p8)) != 0) {
                        return 1;
                    }
                case 2:
                    if (androidx.datastore.preferences.protobuf.h1.c.g(v0_4, p8) != 0) {
                        return 1;
                    }
                case 3:
                    if (androidx.datastore.preferences.protobuf.h1.c.g(v0_4, p8) != 0) {
                        return 1;
                    }
                case 4:
                    if (androidx.datastore.preferences.protobuf.h1.c.f(v0_4, p8) != 0) {
                        return 1;
                    }
                case 5:
                    if (androidx.datastore.preferences.protobuf.h1.c.g(v0_4, p8) != 0) {
                        return 1;
                    }
                case 6:
                    if (androidx.datastore.preferences.protobuf.h1.c.f(v0_4, p8) != 0) {
                        return 1;
                    }
                case 7:
                    return androidx.datastore.preferences.protobuf.h1.c.c(v0_4, p8);
                case 8:
                    IllegalArgumentException v7_46 = androidx.datastore.preferences.protobuf.h1.c.h(v0_4, p8);
                    if (!(v7_46 instanceof String)) {
                        if (!(v7_46 instanceof androidx.datastore.preferences.protobuf.g)) {
                            throw new IllegalArgumentException();
                        } else {
                            return (androidx.datastore.preferences.protobuf.g.c.equals(v7_46) ^ 1);
                        }
                    } else {
                        return (((String) v7_46).isEmpty() ^ 1);
                    }
                case 9:
                    if (androidx.datastore.preferences.protobuf.h1.c.h(v0_4, p8) != null) {
                        return 1;
                    }
                case 10:
                    return (androidx.datastore.preferences.protobuf.g.c.equals(androidx.datastore.preferences.protobuf.h1.c.h(v0_4, p8)) ^ 1);
                case 11:
                    if (androidx.datastore.preferences.protobuf.h1.c.f(v0_4, p8) != 0) {
                        return 1;
                    }
                case 12:
                    if (androidx.datastore.preferences.protobuf.h1.c.f(v0_4, p8) != 0) {
                        return 1;
                    }
                case 13:
                    if (androidx.datastore.preferences.protobuf.h1.c.f(v0_4, p8) != 0) {
                        return 1;
                    }
                case 14:
                    if (androidx.datastore.preferences.protobuf.h1.c.g(v0_4, p8) != 0) {
                        return 1;
                    }
                case 15:
                    if (androidx.datastore.preferences.protobuf.h1.c.f(v0_4, p8) != 0) {
                        return 1;
                    }
                case 16:
                    if (androidx.datastore.preferences.protobuf.h1.c.g(v0_4, p8) != 0) {
                        return 1;
                    }
                case 17:
                    if (androidx.datastore.preferences.protobuf.h1.c.h(v0_4, p8) != null) {
                        return 1;
                    }
                default:
                    throw new IllegalArgumentException();
            }
        }
        return 0;
    }

    public final boolean o(Object p2, int p3, int p4, int p5, int p6)
    {
        if (p4 != 1048575) {
            if ((p5 & p6) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return this.n(p3, p2);
        }
    }

    public final boolean q(Object p3, int p4, int p5)
    {
        if (androidx.datastore.preferences.protobuf.h1.c.f(((long) (this.a[(p5 + 2)] & 1048575)), p3) != p4) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void r(Object p9, int p10, Object p11, androidx.datastore.preferences.protobuf.n p12, a2.r p13)
    {
        androidx.datastore.preferences.protobuf.j v0_3 = ((long) (this.L(p10) & 1048575));
        androidx.datastore.preferences.protobuf.h0 v10_2 = androidx.datastore.preferences.protobuf.h1.c.h(v0_3, p9);
        Object v2_1 = this.m;
        if (v10_2 != null) {
            v2_1.getClass();
            if (!((androidx.datastore.preferences.protobuf.h0) v10_2).a) {
                Object v3_4 = androidx.datastore.preferences.protobuf.h0.b.d();
                androidx.datastore.preferences.protobuf.i0.a(v3_4, v10_2);
                androidx.datastore.preferences.protobuf.h1.o(p9, v0_3, v3_4);
                v10_2 = v3_4;
            }
        } else {
            v2_1.getClass();
            v10_2 = androidx.datastore.preferences.protobuf.h0.b.d();
            androidx.datastore.preferences.protobuf.h1.o(p9, v0_3, v10_2);
        }
        v2_1.getClass();
        androidx.datastore.preferences.protobuf.h0 v10_4 = ((androidx.datastore.preferences.protobuf.h0) v10_2);
        androidx.datastore.preferences.protobuf.z v9_1 = ((androidx.datastore.preferences.protobuf.g0) p11).a;
        p13.y(2);
        androidx.datastore.preferences.protobuf.j v0_2 = ((androidx.datastore.preferences.protobuf.j) p13.d);
        int v1_1 = v0_2.e(v0_2.v());
        Object v2_0 = v9_1.c;
        Object v3_5 = "";
        Object v4 = v2_0;
        while(true) {
            androidx.datastore.preferences.protobuf.z v5_0 = p13.c();
            if ((v5_0 != 2147483647) && (!v0_2.c())) {
                if (v5_0 == 1) {
                    break;
                }
                if (v5_0 == 2) {
                    v4 = p13.k(v9_1.b, v2_0.getClass(), p12);
                } else {
                    if (!p13.z()) {
                        throw new androidx.datastore.preferences.protobuf.z("Unable to parse map entry.");
                    } else {
                    }
                }
            } else {
                v10_4.put(v3_5, v4);
                v0_2.d(v1_1);
                return;
            }
        }
        v3_5 = p13.k(v9_1.a, 0, 0);
    }

    public final void s(int p6, Object p7, Object p8)
    {
        if (this.n(p6, p8)) {
            StringBuilder v0_5 = ((long) (this.L(p6) & 1048575));
            sun.misc.Unsafe v2 = androidx.datastore.preferences.protobuf.m0.o;
            Object v3 = v2.getObject(p8, v0_5);
            if (v3 == null) {
                StringBuilder v0_2 = new StringBuilder("Source subfield ");
                v0_2.append(this.a[p6]);
                v0_2.append(" is present but null: ");
                v0_2.append(p8);
                throw new IllegalStateException(v0_2.toString());
            } else {
                androidx.datastore.preferences.protobuf.u0 v8_1 = this.m(p6);
                if (this.n(p6, p7)) {
                    androidx.datastore.preferences.protobuf.v v6_4 = v2.getObject(p7, v0_5);
                    if (!androidx.datastore.preferences.protobuf.m0.p(v6_4)) {
                        androidx.datastore.preferences.protobuf.v v4_2 = v8_1.i();
                        v8_1.b(v4_2, v6_4);
                        v2.putObject(p7, v0_5, v4_2);
                        v6_4 = v4_2;
                    }
                    v8_1.b(v6_4, v3);
                    return;
                } else {
                    if (androidx.datastore.preferences.protobuf.m0.p(v3)) {
                        androidx.datastore.preferences.protobuf.v v4_4 = v8_1.i();
                        v8_1.b(v4_4, v3);
                        v2.putObject(p7, v0_5, v4_4);
                    } else {
                        v2.putObject(p7, v0_5, v3);
                    }
                    this.G(p6, p7);
                    return;
                }
            }
        } else {
            return;
        }
    }

    public final void t(int p7, Object p8, Object p9)
    {
        androidx.datastore.preferences.protobuf.v v0_0 = this.a;
        StringBuilder v1_0 = v0_0[p7];
        if (this.q(p9, v1_0, p7)) {
            String v2_4 = ((long) (this.L(p7) & 1048575));
            sun.misc.Unsafe v4 = androidx.datastore.preferences.protobuf.m0.o;
            Object v5 = v4.getObject(p9, v2_4);
            if (v5 == null) {
                StringBuilder v1_2 = new StringBuilder("Source subfield ");
                v1_2.append(v0_0[p7]);
                v1_2.append(" is present but null: ");
                v1_2.append(p9);
                throw new IllegalStateException(v1_2.toString());
            } else {
                androidx.datastore.preferences.protobuf.u0 v9_1 = this.m(p7);
                if (this.q(p8, v1_0, p7)) {
                    androidx.datastore.preferences.protobuf.v v7_4 = v4.getObject(p8, v2_4);
                    if (!androidx.datastore.preferences.protobuf.m0.p(v7_4)) {
                        androidx.datastore.preferences.protobuf.v v0_3 = v9_1.i();
                        v9_1.b(v0_3, v7_4);
                        v4.putObject(p8, v2_4, v0_3);
                        v7_4 = v0_3;
                    }
                    v9_1.b(v7_4, v5);
                    return;
                } else {
                    if (androidx.datastore.preferences.protobuf.m0.p(v5)) {
                        androidx.datastore.preferences.protobuf.v v0_5 = v9_1.i();
                        v9_1.b(v0_5, v5);
                        v4.putObject(p8, v2_4, v0_5);
                    } else {
                        v4.putObject(p8, v2_4, v5);
                    }
                    this.H(p8, v1_0, p7);
                    return;
                }
            }
        } else {
            return;
        }
    }

    public final Object u(int p4, Object p5)
    {
        androidx.datastore.preferences.protobuf.u0 v0 = this.m(p4);
        if (this.n(p4, p5)) {
            Object v4_2 = androidx.datastore.preferences.protobuf.m0.o.getObject(p5, ((long) (this.L(p4) & 1048575)));
            if (!androidx.datastore.preferences.protobuf.m0.p(v4_2)) {
                androidx.datastore.preferences.protobuf.v v5_2 = v0.i();
                if (v4_2 != null) {
                    v0.b(v5_2, v4_2);
                }
                return v5_2;
            } else {
                return v4_2;
            }
        } else {
            return v0.i();
        }
    }

    public final Object v(Object p4, int p5, int p6)
    {
        androidx.datastore.preferences.protobuf.u0 v0 = this.m(p6);
        if (this.q(p4, p5, p6)) {
            Object v4_1 = androidx.datastore.preferences.protobuf.m0.o.getObject(p4, ((long) (this.L(p6) & 1048575)));
            if (!androidx.datastore.preferences.protobuf.m0.p(v4_1)) {
                androidx.datastore.preferences.protobuf.v v5_2 = v0.i();
                if (v4_1 != null) {
                    v0.b(v5_2, v4_1);
                }
                return v5_2;
            } else {
                return v4_1;
            }
        } else {
            return v0.i();
        }
    }
}
