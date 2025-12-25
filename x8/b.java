package x8;
public abstract class b {

    static b()
    {
        return;
    }

    public static final boolean a(byte[] p4, int p5, byte[] p6, int p7, int p8)
    {
        kotlin.jvm.internal.j.e(p4, "a");
        kotlin.jvm.internal.j.e(p6, "b");
        int v1 = 0;
        while (v1 < p8) {
            if (p4[(v1 + p5)] == p6[(v1 + p7)]) {
                v1++;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static final x8.a0 b(x8.f0 p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        return new x8.a0(p1);
    }

    public static final x8.b0 c(x8.h0 p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        return new x8.b0(p1);
    }

    public static void d(long p20, x8.g p22, int p23, java.util.ArrayList p24, int p25, int p26, java.util.ArrayList p27)
    {
        String v1_0 = p23;
        java.util.ArrayList v5_1 = p24;
        int v8_2 = p27;
        if (p25 >= p26) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            byte v4_0 = p25;
            while (v4_0 < p26) {
                if (((x8.j) p24.get(v4_0)).d() < p23) {
                    throw new IllegalArgumentException("Failed requirement.");
                } else {
                    v4_0++;
                }
            }
            java.util.ArrayList v6_6;
            long v2_16;
            int v3_4 = ((x8.j) p24.get(p25));
            byte v4_6 = ((x8.j) p24.get((p26 - 1)));
            if (p23 != v3_4.d()) {
                v6_6 = p25;
                v2_16 = -1;
            } else {
                long v2_18 = (p25 + 1);
                v6_6 = v2_18;
                v2_16 = ((Number) p27.get(p25)).intValue();
                v3_4 = ((x8.j) p24.get(v2_18));
            }
            if (v3_4.i(p23) == v4_6.i(p23)) {
                java.util.ArrayList v7_7 = Math.min(v3_4.d(), v4_6.d());
                int v8_0 = 0;
                int v11_0 = p23;
                while ((v11_0 < v7_7) && (v3_4.i(v11_0) == v4_6.i(v11_0))) {
                    v8_0++;
                    v11_0++;
                }
                long v14_11 = (((((p22.b / ((long) 4)) + p20) + ((long) 2)) + ((long) v8_0)) + 1);
                p22.P((- v8_0));
                p22.P(v2_16);
                byte v4_12 = (p23 + v8_0);
                while (v1_0 < v4_12) {
                    p22.P((v3_4.i(v1_0) & 255));
                    v1_0++;
                }
                if ((v6_6 + 1) != p26) {
                    int v3_17 = new x8.g();
                    p22.P((((int) ((v3_17.b / ((long) 4)) + v14_11)) * -1));
                    x8.b.d(v14_11, v3_17, v4_12, p24, v6_6, p26, p27);
                    p22.L(v3_17);
                    return;
                } else {
                    if (v4_12 != ((x8.j) p24.get(v6_6)).d()) {
                        throw new IllegalStateException("Check failed.");
                    } else {
                        p22.P(((Number) p27.get(v6_6)).intValue());
                        return;
                    }
                }
            } else {
                int v3_0 = (v6_6 + 1);
                byte v4_1 = 1;
                while (v3_0 < p26) {
                    if (((x8.j) p24.get((v3_0 - 1))).i(p23) != ((x8.j) p24.get(v3_0)).i(p23)) {
                        v4_1++;
                    }
                    v3_0++;
                }
                long v14_4 = ((((p22.b / ((long) 4)) + p20) + ((long) 2)) + ((long) (v4_1 * 2)));
                p22.P(v4_1);
                p22.P(v2_16);
                long v2_2 = v6_6;
                while (v2_2 < p26) {
                    int v3_10 = ((x8.j) p24.get(v2_2)).i(p23);
                    if ((v2_2 == v6_6) || (v3_10 != ((x8.j) p24.get((v2_2 - 1))).i(p23))) {
                        p22.P((v3_10 & 255));
                    }
                    v2_2++;
                }
                byte v4_3 = new x8.g();
                java.util.ArrayList v7_0 = v6_6;
                while (v7_0 < p26) {
                    long v2_5 = ((x8.j) v5_1.get(v7_0)).i(p23);
                    int v3_3 = (v7_0 + 1);
                    java.util.ArrayList v6_0 = v3_3;
                    while (v6_0 < p26) {
                        if (v2_5 == ((x8.j) v5_1.get(v6_0)).i(p23)) {
                            v6_0++;
                        }
                        if ((v3_3 != v6_0) || ((p23 + 1) != ((x8.j) v5_1.get(v7_0)).d())) {
                            p22.P((((int) ((v4_3.b / ((long) 4)) + v14_4)) * -1));
                            int v9_3 = v8_2;
                            long v2_12 = v14_4;
                            int v8_1 = v6_0;
                            x8.b.d(v2_12, v4_3, (p23 + 1), p24, v7_0, v8_1, v9_3);
                            v5_1 = p24;
                        } else {
                            p22.P(((Number) v8_2.get(v7_0)).intValue());
                            v9_3 = v8_2;
                            v2_12 = v14_4;
                            v8_1 = v6_0;
                        }
                        v14_4 = v2_12;
                        v7_0 = v8_1;
                        v8_2 = v9_3;
                    }
                    v6_0 = p26;
                }
                p22.L(v4_3);
                return;
            }
        }
    }

    public static final void e(long p4, long p6, long p8)
    {
        if (((p6 | p8) < 0) || ((p6 > p4) || ((p4 - p6) < p8))) {
            StringBuilder v1_1 = new StringBuilder("size=");
            v1_1.append(p4);
            v1_1.append(" offset=");
            v1_1.append(p6);
            v1_1.append(" byteCount=");
            v1_1.append(p8);
            throw new ArrayIndexOutOfBoundsException(v1_1.toString());
        } else {
            return;
        }
    }

    public static varargs x8.x f(x8.j[] p14)
    {
        String v2_0 = 0;
        if (p14.length != 0) {
            java.util.ArrayList v7_1 = new java.util.ArrayList(new i7.f(p14, 0));
            if (v7_1.size() > 1) {
                java.util.Collections.sort(v7_1);
            }
            IllegalArgumentException v0_5 = v7_1.size();
            java.util.ArrayList v10_1 = new java.util.ArrayList(v0_5);
            int v4_2 = 0;
            while (v4_2 < v0_5) {
                v10_1.add(Integer.valueOf(-1));
                v4_2++;
            }
            IllegalArgumentException v0_8 = p14.length;
            int v4_1 = 0;
            Number v5_6 = 0;
            while (v4_1 < v0_8) {
                int v6_3 = p14[v4_1];
                int v8_0 = (v5_6 + 1);
                int v9_0 = v7_1.size();
                int v11_0 = v7_1.size();
                if (v9_0 < 0) {
                    throw new IllegalArgumentException(v1.a.j("fromIndex (0) is greater than toIndex (", v9_0, ")."));
                } else {
                    if (v9_0 > v11_0) {
                        IllegalArgumentException v0_4 = new StringBuilder("toIndex (");
                        v0_4.append(v9_0);
                        v0_4.append(") is greater than size (");
                        v0_4.append(v11_0);
                        v0_4.append(").");
                        throw new IndexOutOfBoundsException(v0_4.toString());
                    } else {
                        int v9_1 = (v9_0 - 1);
                        int v11_1 = 0;
                        while (v11_1 <= v9_1) {
                            int v13_2;
                            int v12_1 = ((v11_1 + v9_1) >> 1);
                            int v13_1 = ((Comparable) v7_1.get(v12_1));
                            if (v13_1 != v6_3) {
                                if (v13_1 != 0) {
                                    if (v6_3 != 0) {
                                        v13_2 = v13_1.compareTo(v6_3);
                                    } else {
                                        v13_2 = 1;
                                    }
                                } else {
                                    v13_2 = -1;
                                }
                            } else {
                                v13_2 = 0;
                            }
                            if (v13_2 >= 0) {
                                if (v13_2 > 0) {
                                    v9_1 = (v12_1 - 1);
                                }
                            } else {
                                v11_1 = (v12_1 + 1);
                            }
                            v10_1.set(v12_1, Integer.valueOf(v5_6));
                            v4_1++;
                            v5_6 = v8_0;
                        }
                        v12_1 = (- (v11_1 + 1));
                    }
                }
            }
            if (((x8.j) v7_1.get(0)).d() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            } else {
                IllegalArgumentException v0_13 = 0;
                while (v0_13 < v7_1.size()) {
                    int[] v1_7 = ((x8.j) v7_1.get(v0_13));
                    int v3_5 = (v0_13 + 1);
                    int v4_0 = v3_5;
                    while (v4_0 < v7_1.size()) {
                        Number v5_12 = ((x8.j) v7_1.get(v4_0));
                        v5_12.getClass();
                        kotlin.jvm.internal.j.e(v1_7, "prefix");
                        if (!v5_12.l(0, v1_7, v1_7.d())) {
                            break;
                        }
                        if (v5_12.d() == v1_7.d()) {
                            String v14_12 = new StringBuilder("duplicate option: ");
                            v14_12.append(v5_12);
                            throw new IllegalArgumentException(v14_12.toString().toString());
                        } else {
                            if (((Number) v10_1.get(v4_0)).intValue() <= ((Number) v10_1.get(v0_13)).intValue()) {
                                v4_0++;
                            } else {
                                v7_1.remove(v4_0);
                                ((Number) v10_1.remove(v4_0)).intValue();
                            }
                        }
                    }
                    v0_13 = v3_5;
                }
                Number v5_9 = new x8.g();
                x8.b.d(0, v5_9, 0, v7_1, 0, v7_1.size(), v10_1);
                IllegalArgumentException v0_16 = ((int) (v5_9.b / ((long) 4)));
                int[] v1_5 = new int[v0_16];
                while (v2_0 < v0_16) {
                    v1_5[v2_0] = v5_9.readInt();
                    v2_0++;
                }
                String v14_9 = java.util.Arrays.copyOf(p14, p14.length);
                kotlin.jvm.internal.j.d(v14_9, "copyOf(...)");
                return new x8.x(((x8.j[]) v14_9), v1_5);
            }
        } else {
            IllegalArgumentException v0_7 = new x8.j[0];
            return new x8.x(v0_7, new int[] {0, -1}));
        }
    }

    public static final int g(int p2)
    {
        return (((p2 & 255) << 24) | ((((-16777216 & p2) >> 24) | ((16711680 & p2) >> 8)) | ((65280 & p2) << 8)));
    }

    public static final String h(byte p3)
    {
        char[] v0_0 = y8.b.a;
        String v3_4 = v0_0[(p3 & 15)];
        char[] v0_2 = new char[2];
        v0_2[0] = v0_0[((p3 >> 4) & 15)];
        v0_2[1] = v3_4;
        return new String(v0_2);
    }

    public static final String i(int p10)
    {
        if (p10 != null) {
            int v0_0 = y8.b.a;
            String v2_5 = v0_0[((p10 >> 24) & 15)];
            char v3_0 = v0_0[((p10 >> 20) & 15)];
            char v4_2 = v0_0[((p10 >> 16) & 15)];
            char v5_2 = v0_0[((p10 >> 12) & 15)];
            char v6_2 = v0_0[((p10 >> 8) & 15)];
            char v7_2 = v0_0[((p10 >> 4) & 15)];
            String v10_2 = v0_0[(p10 & 15)];
            char[] v8 = new char[8];
            int v9 = 0;
            v8[0] = v0_0[((p10 >> 28) & 15)];
            v8[1] = v2_5;
            v8[2] = v3_0;
            v8[3] = v4_2;
            v8[4] = v5_2;
            v8[5] = v6_2;
            v8[6] = v7_2;
            v8[7] = v10_2;
            while ((v9 < 8) && (v8[v9] == 48)) {
                v9++;
            }
            if (v9 < 0) {
                String v2_2 = new StringBuilder("startIndex: ");
                v2_2.append(v9);
                v2_2.append(", endIndex: ");
                v2_2.append(8);
                v2_2.append(", size: ");
                v2_2.append(8);
                throw new IndexOutOfBoundsException(v2_2.toString());
            } else {
                if (v9 > 8) {
                    throw new IllegalArgumentException(v1.a.i("startIndex: ", v9, 8, " > endIndex: "));
                } else {
                    return new String(v8, v9, (8 - v9));
                }
            }
        } else {
            return "0";
        }
    }
}
