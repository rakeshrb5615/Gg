package y8;
public abstract class c {
    public static final x8.j a;
    public static final x8.j b;
    public static final x8.j c;
    public static final x8.j d;
    public static final x8.j e;

    static c()
    {
        y8.c.a = v3.f.i("/");
        y8.c.b = v3.f.i("\\");
        y8.c.c = v3.f.i("/\\");
        y8.c.d = v3.f.i(".");
        y8.c.e = v3.f.i("..");
        return;
    }

    public static final int a(x8.y p6)
    {
        int v6_1 = p6.a;
        if (v6_1.d() != 0) {
            if (v6_1.i(0) != 47) {
                if (v6_1.i(0) != 92) {
                    if ((v6_1.d() <= 2) || ((v6_1.i(1) != 58) || (v6_1.i(2) != 92))) {
                        return -1;
                    } else {
                        int v6_3 = ((char) v6_1.i(0));
                        if (((97 > v6_3) || (v6_3 >= 123)) && ((65 > v6_3) || (v6_3 >= 91))) {
                            return -1;
                        } else {
                            return 3;
                        }
                    }
                } else {
                    if ((v6_1.d() > 2) && (v6_1.i(1) == 92)) {
                        byte v2_4 = y8.c.b;
                        kotlin.jvm.internal.j.e(v2_4, "other");
                        int v0_10 = v6_1.f(2, v2_4.h());
                        if (v0_10 != -1) {
                            return v0_10;
                        } else {
                            return v6_1.d();
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final x8.y b(x8.y p6, x8.y p7, boolean p8)
    {
        kotlin.jvm.internal.j.e(p7, "child");
        if ((y8.c.a(p7) == -1) && (p7.d() == null)) {
            x8.j v0_1 = y8.c.c(p6);
            if (v0_1 == null) {
                v0_1 = y8.c.c(p7);
                if (v0_1 == null) {
                    v0_1 = y8.c.f(x8.y.b);
                }
            }
            x8.g v1_1 = new x8.g();
            v1_1.K(p6.a);
            if (v1_1.b > 0) {
                v1_1.K(v0_1);
            }
            v1_1.K(p7.a);
            return y8.c.d(v1_1, p8);
        } else {
            return p7;
        }
    }

    public static final x8.j c(x8.y p3)
    {
        x8.j v1 = y8.c.a;
        if (x8.j.g(p3.a, v1) == -1) {
            x8.j v0_2 = y8.c.b;
            if (x8.j.g(p3.a, v0_2) == -1) {
                return 0;
            } else {
                return v0_2;
            }
        } else {
            return v1;
        }
    }

    public static final x8.y d(x8.g p30, boolean p31)
    {
        x8.j v1_1 = new x8.g();
        long v2_0 = 0;
        int v3_18 = 0;
        long v4_26 = 0;
        while(true) {
            long v26;
            int v16_0;
            long v24_0;
            boolean v15_1;
            long v22;
            byte[] v5_5 = y8.c.a;
            kotlin.jvm.internal.j.e(v5_5, "bytes");
            int v7_0 = v5_5.d();
            if (v7_0 >= 0) {
                v22 = -1;
                int v11_2 = ((long) v7_0);
                v24_0 = 0;
                if ((v11_2 <= p30.b) && (v7_0 <= v5_5.d())) {
                    if (v7_0 != 0) {
                        v26 = 1;
                        long v20_1 = v11_2;
                        x8.b.e(((long) v5_5.d()), ((long) v3_18), v20_1);
                        if (v7_0 <= 0) {
                            break;
                        }
                        int v11_15;
                        boolean v9_6 = p30.b;
                        if (1 <= v9_6) {
                            v11_15 = 1;
                        } else {
                            v11_15 = v9_6;
                        }
                        long v4_2;
                        if (0 != v11_15) {
                            boolean v14_0 = p30.a;
                            if (v14_0) {
                                if (v9_6 >= 0) {
                                    v16_0 = v3_18;
                                    v15_1 = v4_26;
                                    int v3_1 = 0;
                                    while(true) {
                                        boolean v9_18 = (((long) (v14_0.c - v14_0.b)) + v3_1);
                                        if (v9_18 > 0) {
                                            break;
                                        }
                                        v14_0 = v14_0.f;
                                        kotlin.jvm.internal.j.b(v14_0);
                                        v3_1 = v9_18;
                                    }
                                    byte[] v5_4 = v5_5.h();
                                    boolean v9_19 = v5_4[v16_0];
                                    long v18_4 = v3_1;
                                    x8.c0 v10_8 = Math.min(v11_15, ((p30.b - v20_1) + 1));
                                    int v3_51 = 0;
                                    while (v18_4 < v10_8) {
                                        int v28_3 = v10_8;
                                        x8.c0 v10_0 = ((int) ((((long) v14_0.b) + v3_51) - v18_4));
                                        while (v10_0 < ((int) Math.min(((long) v14_0.c), ((((long) v14_0.b) + v10_8) - v18_4)))) {
                                            if ((v14_0.a[v10_0] != v9_19) || (!y8.a.a(v14_0, (v10_0 + 1), v5_4, 1, v7_0))) {
                                                v10_0++;
                                            } else {
                                                v4_2 = (((long) (v10_0 - v14_0.b)) + v18_4);
                                                if (v4_2 == -1) {
                                                    long v18_2;
                                                    long v4_9 = y8.c.b;
                                                    kotlin.jvm.internal.j.e(v4_9, "bytes");
                                                    byte[] v5_1 = v4_9.d();
                                                    if (v5_1 >= null) {
                                                        boolean v13_3 = ((long) v5_1);
                                                        if ((v13_3 <= p30.b) && (v5_1 <= v4_9.d())) {
                                                            if (v5_1 != null) {
                                                                x8.b.e(((long) v4_9.d()), ((long) v16_0), v13_3);
                                                                if (v5_1 <= null) {
                                                                    throw new IllegalArgumentException("byteCount == 0");
                                                                } else {
                                                                    boolean v8_2;
                                                                    int v6_5 = p30.b;
                                                                    if (v26 <= v6_5) {
                                                                        v8_2 = v26;
                                                                    } else {
                                                                        v8_2 = v6_5;
                                                                    }
                                                                    long v4_19;
                                                                    if (v24_0 != v8_2) {
                                                                        x8.c0 v10_4 = p30.a;
                                                                        if (v10_4 != null) {
                                                                            if (v6_5 >= v24_0) {
                                                                                v18_2 = v4_9;
                                                                                int v6_6 = v24_0;
                                                                                while(true) {
                                                                                    int v11_7 = (((long) (v10_4.c - v10_4.b)) + v6_6);
                                                                                    if (v11_7 > v24_0) {
                                                                                        break;
                                                                                    }
                                                                                    v10_4 = v10_4.f;
                                                                                    kotlin.jvm.internal.j.b(v10_4);
                                                                                    v6_6 = v11_7;
                                                                                }
                                                                                long v4_13 = v18_2.h();
                                                                                v16_0 = 0;
                                                                                int v11_8 = v4_13[0];
                                                                                byte[] v12_0 = v4_13;
                                                                                boolean v8_3 = Math.min(v8_2, ((p30.b - v13_3) + v26));
                                                                                int v3_22 = v24_0;
                                                                                while (v6_6 < v8_3) {
                                                                                    int v28_1 = v6_6;
                                                                                    int v6_11 = ((int) ((((long) v10_4.b) + v3_22) - v28_1));
                                                                                    while (v6_11 < ((int) Math.min(((long) v10_4.c), ((((long) v10_4.b) + v8_3) - v6_6)))) {
                                                                                        if ((v10_4.a[v6_11] != v11_8) || (!y8.a.a(v10_4, (v6_11 + 1), v12_0, 1, v5_1))) {
                                                                                            v6_11++;
                                                                                        } else {
                                                                                            v4_19 = (((long) (v6_11 - v10_4.b)) + v28_1);
                                                                                            if (v4_19 != v22) {
                                                                                                int v3_45 = p30.readByte();
                                                                                                if (v2_0 == 0) {
                                                                                                    v2_0 = y8.c.e(v3_45);
                                                                                                }
                                                                                                v4_26 = (v15_1 + 1);
                                                                                                v3_18 = v16_0;
                                                                                            }
                                                                                            x8.c0 v17_1;
                                                                                            long v4_28;
                                                                                            if (v15_1 < 2) {
                                                                                                v4_28 = v18_2;
                                                                                                v17_1 = v16_0;
                                                                                            } else {
                                                                                                v4_28 = v18_2;
                                                                                                if (!kotlin.jvm.internal.j.a(v2_0, v4_28)) {
                                                                                                } else {
                                                                                                    v17_1 = 1;
                                                                                                }
                                                                                            }
                                                                                            byte[] v5_3 = y8.c.c;
                                                                                            if (v17_1 == null) {
                                                                                                if (v15_1) {
                                                                                                    int v6_23 = p30.C(v5_3);
                                                                                                    if (v2_0 == 0) {
                                                                                                        if (v6_23 != v22) {
                                                                                                            v2_0 = y8.c.e(p30.A(v6_23));
                                                                                                        } else {
                                                                                                            v2_0 = y8.c.f(x8.y.b);
                                                                                                        }
                                                                                                    }
                                                                                                    if ((kotlin.jvm.internal.j.a(v2_0, v4_28)) && ((p30.b >= 2) && (p30.A(v26) == 58))) {
                                                                                                        long v4_33 = ((char) p30.A(v24_0));
                                                                                                        if (((97 <= v4_33) && (v4_33 < 123)) || ((65 <= v4_33) && (v4_33 < 91))) {
                                                                                                            if (v6_23 != 2) {
                                                                                                                v1_1.k(p30, 2);
                                                                                                            } else {
                                                                                                                v1_1.k(p30, 3);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    kotlin.jvm.internal.j.b(v2_0);
                                                                                                    v1_1.K(v2_0);
                                                                                                }
                                                                                            } else {
                                                                                                kotlin.jvm.internal.j.b(v2_0);
                                                                                                v1_1.K(v2_0);
                                                                                                v1_1.K(v2_0);
                                                                                            }
                                                                                            long v4_36;
                                                                                            if (v1_1.b <= 0) {
                                                                                                v4_36 = v16_0;
                                                                                            } else {
                                                                                                v4_36 = 1;
                                                                                            }
                                                                                            int v6_27 = new java.util.ArrayList();
                                                                                            do {
                                                                                                boolean v8_13 = y8.c.d;
                                                                                                if (p30.h()) {
                                                                                                    x8.y v0_5 = v6_27.size();
                                                                                                    int v3_46 = v16_0;
                                                                                                    while (v3_46 < v0_5) {
                                                                                                        if (v3_46 > 0) {
                                                                                                            v1_1.K(v2_0);
                                                                                                        }
                                                                                                        v1_1.K(((x8.j) v6_27.get(v3_46)));
                                                                                                        v3_46++;
                                                                                                    }
                                                                                                    if (v1_1.b == 0) {
                                                                                                        v1_1.K(v8_13);
                                                                                                    }
                                                                                                    return new x8.y(v1_1.e(v1_1.b));
                                                                                                } else {
                                                                                                    int v7_5;
                                                                                                    boolean v9_12 = p30.C(v5_3);
                                                                                                    if (v9_12 != v22) {
                                                                                                        v7_5 = p30.e(v9_12);
                                                                                                        p30.readByte();
                                                                                                    } else {
                                                                                                        v7_5 = p30.e(p30.b);
                                                                                                    }
                                                                                                    boolean v9_14 = y8.c.e;
                                                                                                    if (!kotlin.jvm.internal.j.a(v7_5, v9_14)) {
                                                                                                        if ((kotlin.jvm.internal.j.a(v7_5, v8_13)) || (kotlin.jvm.internal.j.a(v7_5, x8.j.d))) {
                                                                                                            break;
                                                                                                        }
                                                                                                        v6_27.add(v7_5);
                                                                                                        break;
                                                                                                    } else {
                                                                                                        if ((v4_36 != 0) && (v6_27.isEmpty())) {
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((p31) && ((v4_36 != 0) || ((!v6_27.isEmpty()) && (!kotlin.jvm.internal.j.a(i7.i.d0(v6_27), v9_14))))) {
                                                                                                        } else {
                                                                                                            v6_27.add(v7_5);
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } while(((v17_1 == null) || (v6_27.size() != 1)) && (!v6_27.isEmpty()));
                                                                                        }
                                                                                    }
                                                                                    v6_6 = (v28_1 + ((long) (v10_4.c - v10_4.b)));
                                                                                    v10_4 = v10_4.f;
                                                                                    kotlin.jvm.internal.j.b(v10_4);
                                                                                    v3_22 = v6_6;
                                                                                }
                                                                                v4_19 = v22;
                                                                            }
                                                                            while (v6_5 > v24_0) {
                                                                                v10_4 = v10_4.g;
                                                                                kotlin.jvm.internal.j.b(v10_4);
                                                                                v6_5 -= ((long) (v10_4.c - v10_4.b));
                                                                            }
                                                                            int v11_10 = v4_9.h();
                                                                            byte[] v12_1 = v11_10[0];
                                                                            v18_2 = v4_9;
                                                                            boolean v8_4 = Math.min(v8_2, ((p30.b - v13_3) + v26));
                                                                            int v3_35 = v24_0;
                                                                            while (v6_5 < v8_4) {
                                                                                int v28_2 = v6_5;
                                                                                int v6_19 = ((int) ((((long) v10_4.b) + v3_35) - v28_2));
                                                                                while (v6_19 < ((int) Math.min(((long) v10_4.c), ((((long) v10_4.b) + v8_4) - v6_5)))) {
                                                                                    if ((v10_4.a[v6_19] != v12_1) || (!y8.a.a(v10_4, (v6_19 + 1), v11_10, 1, v5_1))) {
                                                                                        v6_19++;
                                                                                    } else {
                                                                                        v4_19 = (((long) (v6_19 - v10_4.b)) + v28_2);
                                                                                        v16_0 = 0;
                                                                                    }
                                                                                }
                                                                                v6_5 = (v28_2 + ((long) (v10_4.c - v10_4.b)));
                                                                                v10_4 = v10_4.f;
                                                                                kotlin.jvm.internal.j.b(v10_4);
                                                                                v3_35 = v6_5;
                                                                            }
                                                                            v16_0 = 0;
                                                                        } else {
                                                                            v18_2 = v4_9;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            v18_2 = v4_9;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        x8.c0 v10_15 = (v18_4 + ((long) (v14_0.c - v14_0.b)));
                                        v14_0 = v14_0.f;
                                        kotlin.jvm.internal.j.b(v14_0);
                                        v3_51 = v10_15;
                                        v18_4 = v3_51;
                                        v10_8 = v28_3;
                                    }
                                    v4_2 = -1;
                                }
                                while (v9_6 > 0) {
                                    boolean v14_2 = v14_0.g;
                                    kotlin.jvm.internal.j.b(v14_2);
                                    v9_6 -= ((long) (v14_2.c - v14_2.b));
                                    v14_0 = v14_2;
                                }
                                v16_0 = v3_18;
                                byte[] v5_0 = v5_5.h();
                                boolean v13_1 = v5_0[v16_0];
                                v15_1 = v4_26;
                                int v11_1 = Math.min(v11_15, ((p30.b - v20_1) + 1));
                                int v3_5 = 0;
                                while (v9_6 < v11_1) {
                                    int v28_0 = v9_6;
                                    long v4_5 = ((int) ((((long) v14_0.b) + v3_5) - v28_0));
                                    while (v4_5 < ((int) Math.min(((long) v14_0.c), ((((long) v14_0.b) + v11_1) - v28_0)))) {
                                        if ((v14_0.a[v4_5] != v13_1) || (!y8.a.a(v14_0, (v4_5 + 1), v5_0, 1, v7_0))) {
                                            v4_5++;
                                        } else {
                                            v4_2 = (((long) (v4_5 - v14_0.b)) + v28_0);
                                        }
                                    }
                                    v3_5 = (v28_0 + ((long) (v14_0.c - v14_0.b)));
                                    v14_0 = v14_0.f;
                                    kotlin.jvm.internal.j.b(v14_0);
                                    v9_6 = v3_5;
                                }
                            } else {
                                v16_0 = v3_18;
                                v15_1 = v4_26;
                            }
                        }
                    } else {
                        v16_0 = v3_18;
                        v15_1 = v4_26;
                    }
                } else {
                    v16_0 = v3_18;
                    v15_1 = v4_26;
                    v26 = 1;
                }
            } else {
                v16_0 = v3_18;
                v15_1 = v4_26;
                v22 = -1;
                v24_0 = 0;
            }
        }
        throw new IllegalArgumentException("byteCount == 0");
    }

    public static final x8.j e(byte p2)
    {
        if (p2 == 47) {
            return y8.c.a;
        } else {
            if (p2 != 92) {
                throw new IllegalArgumentException(g2.g.c(p2, "not a directory separator: "));
            } else {
                return y8.c.b;
            }
        }
    }

    public static final x8.j f(String p2)
    {
        if (!kotlin.jvm.internal.j.a(p2, "/")) {
            if (!kotlin.jvm.internal.j.a(p2, "\\")) {
                throw new IllegalArgumentException(g2.g.l("not a directory separator: ", p2));
            } else {
                return y8.c.b;
            }
        } else {
            return y8.c.a;
        }
    }
}
