package y8;
public abstract class b {
    public static final char[] a;
    public static final byte[] b;

    static synthetic b()
    {
        byte[] v0_1 = new char[16];
        v0_1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        y8.b.a = v0_1;
        byte[] v0_3 = new byte[0];
        y8.b.b = v0_3;
        return;
    }

    public static final int a(char p3)
    {
        if ((48 > p3) || (p3 >= 58)) {
            if ((97 > p3) || (p3 >= 103)) {
                if ((65 > p3) || (p3 >= 71)) {
                    StringBuilder v1_1 = new StringBuilder("Unexpected hex digit: ");
                    v1_1.append(p3);
                    throw new IllegalArgumentException(v1_1.toString());
                } else {
                    return (p3 - 55);
                }
            } else {
                return (p3 - 87);
            }
        } else {
            return (p3 - 48);
        }
    }

    public static final java.util.LinkedHashMap b(java.util.ArrayList p26)
    {
        java.util.List v1_4;
        y8.j v2_3 = a6.e.d("/");
        java.util.LinkedHashMap v0_4 = i7.r.o0(new h7.f[] {new h7.f(v2_3, new y8.j(v2_3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65532))}));
        java.util.List v1_2 = new a2.q(5);
        if (p26.size() > 1) {
            y8.j v2_4 = new Object[0];
            y8.j v2_5 = p26.toArray(v2_4);
            kotlin.jvm.internal.j.e(v2_5, "<this>");
            if (v2_5.length > 1) {
                java.util.Arrays.sort(v2_5, v1_2);
            }
            v1_4 = i7.h.V(v2_5);
        } else {
            v1_4 = i7.i.j0(p26);
        }
        java.util.List v1_5 = v1_4.iterator();
        while (v1_5.hasNext()) {
            y8.j v2_0 = ((y8.j) v1_5.next());
            if (((y8.j) v0_4.put(v2_0.a, v2_0)) == null) {
            }
            while(true) {
                x8.y v6_1;
                x8.y v8_2;
                y8.j v2_8 = v2_0.a;
                x8.j v5_16 = v2_8.a;
                x8.y v6_7 = y8.c.d;
                if (kotlin.jvm.internal.j.a(v5_16, v6_7)) {
                    v6_1 = 0;
                    v8_2 = v6_1;
                } else {
                    y8.j v7_5 = y8.c.a;
                    if (kotlin.jvm.internal.j.a(v5_16, v7_5)) {
                    } else {
                        x8.y v8_4 = y8.c.b;
                        if (kotlin.jvm.internal.j.a(v5_16, v8_4)) {
                        } else {
                            boolean v9_6 = y8.c.e;
                            v5_16.getClass();
                            kotlin.jvm.internal.j.e(v9_6, "suffix");
                            long v11_2 = v9_6.a;
                            if ((!v5_16.l((v5_16.d() - v11_2.length), v9_6, v11_2.length)) || ((v5_16.d() != 2) && ((!v5_16.l((v5_16.d() - 3), v7_5, 1)) && (!v5_16.l((v5_16.d() - 3), v8_4, 1))))) {
                                y8.j v7_1 = x8.j.k(v5_16, v7_5);
                                if (v7_1 == -1) {
                                    v7_1 = x8.j.k(v5_16, v8_4);
                                }
                                if ((v7_1 != 2) || (v2_8.d() == null)) {
                                    if (v7_1 == 1) {
                                        kotlin.jvm.internal.j.e(v8_4, "prefix");
                                        if (v5_16.l(0, v8_4, v8_4.d())) {
                                        }
                                    }
                                    if ((v7_1 != -1) || (v2_8.d() == null)) {
                                        if (v7_1 != -1) {
                                            if (v7_1 != null) {
                                                v6_1 = new x8.y(x8.j.p(v5_16, 0, v7_1, 1));
                                            } else {
                                                v6_1 = new x8.y(x8.j.p(v5_16, 0, 1, 1));
                                            }
                                        } else {
                                            v8_2 = new x8.y(v6_7);
                                        }
                                    } else {
                                        if (v5_16.d() != 2) {
                                            v6_1 = new x8.y(x8.j.p(v5_16, 0, 2, 1));
                                        }
                                    }
                                } else {
                                    if (v5_16.d() != 3) {
                                        v6_1 = new x8.y(x8.j.p(v5_16, 0, 3, 1));
                                    }
                                }
                            }
                        }
                    }
                }
                if (v8_2 == null) {
                    break;
                }
                x8.j v5_7 = ((y8.j) v0_4.get(v8_2));
                if (v5_7 == null) {
                    y8.j v7_3 = new y8.j(v8_2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65532);
                    v0_4.put(v8_2, v7_3);
                    v7_3.n.add(v2_8);
                    v2_0 = v7_3;
                } else {
                    v5_7.n.add(v2_8);
                    break;
                }
            }
        }
        return v0_4;
    }

    public static final String c(int p1)
    {
        a.a.j(16);
        String v1_1 = Integer.toString(p1, 16);
        kotlin.jvm.internal.j.d(v1_1, "toString(...)");
        return "0x".concat(v1_1);
    }

    public static final y8.j d(x8.b0 p24)
    {
        java.io.IOException v0_11 = p24.f();
        if (v0_11 != 33639248) {
            x8.y v3_3 = new StringBuilder("bad zip: expected ");
            v3_3.append(y8.b.c(33639248));
            v3_3.append(" but was ");
            v3_3.append(y8.b.c(v0_11));
            throw new java.io.IOException(v3_3.toString());
        } else {
            p24.skip(4);
            java.io.IOException v0_13 = p24.s();
            y8.j v2_4 = (v0_13 & 65535);
            if ((v0_13 & 1) != 0) {
                String v1_13 = new StringBuilder("unsupported zip: general purpose bit flag=");
                v1_13.append(y8.b.c(v2_4));
                throw new java.io.IOException(v1_13.toString());
            } else {
                int v12_2 = (p24.s() & 65535);
                int v16 = (p24.s() & 65535);
                int v15 = (p24.s() & 65535);
                long v13_3 = (((long) p24.f()) & 4294967295);
                long v6_4 = new kotlin.jvm.internal.q();
                v6_4.a = (((long) p24.f()) & 4294967295);
                boolean v4_2 = new kotlin.jvm.internal.q();
                v4_2.a = (((long) p24.f()) & 4294967295);
                java.io.IOException v0_24 = (p24.s() & 65535);
                long v11_1 = (p24.s() & 65535);
                String v1_15 = (65535 & p24.s());
                p24.skip(8);
                kotlin.jvm.internal.q v7_8 = new kotlin.jvm.internal.q();
                v7_8.a = (((long) p24.f()) & 4294967295);
                java.io.IOException v0_25 = p24.x(((long) v0_24));
                if (b8.i.r0(v0_25, 0)) {
                    throw new java.io.IOException("bad zip: filename contains 0x00");
                } else {
                    y8.j v2_0;
                    if (v4_2.a != 4294967295) {
                        v2_0 = 0;
                    } else {
                        v2_0 = ((long) 8);
                    }
                    if (v6_4.a == 4294967295) {
                        v2_0 += ((long) 8);
                    }
                    if (v7_8.a == 4294967295) {
                        v2_0 += ((long) 8);
                    }
                    long v8_7 = new kotlin.jvm.internal.r();
                    kotlin.jvm.internal.r v9_1 = new kotlin.jvm.internal.r();
                    long v10_2 = new kotlin.jvm.internal.r();
                    Long v19_1 = v1_15;
                    String v1_3 = new kotlin.jvm.internal.o();
                    int v21 = v12_2;
                    int v12_0 = v19_1;
                    long v13_0 = v0_25;
                    Long v19_2 = v13_3;
                    y8.b.e(p24, v11_1, new y8.l(v1_3, v2_0, v4_2, p24, v6_4, v7_8, v8_7, v9_1, v10_2));
                    if ((v2_0 > 0) && (!v1_3.a)) {
                        throw new java.io.IOException("bad zip: zip64 extra required but absent");
                    } else {
                        return new y8.j(a6.e.d("/").c(v13_0), b8.p.l0(v13_0, "/", 0), p24.x(((long) v12_0)), v19_2, v6_4.a, v4_2.a, v21, v7_8.a, v15, v16, ((Long) v8_7.a), ((Long) v9_1.a), ((Long) v10_2.a), 57344);
                    }
                }
            }
        }
    }

    public static final void e(x8.b0 p11, int p12, u7.p p13)
    {
        x8.g v0 = p11.b;
        long v1_0 = ((long) p12);
        while (v1_0 != 0) {
            if (v1_0 < 4) {
                throw new java.io.IOException("bad zip: truncated header in extra field");
            } else {
                String v12_3 = (p11.s() & 65535);
                long v5_3 = (((long) p11.s()) & 65535);
                long v1_1 = (v1_0 - ((long) 4));
                if (v1_1 < v5_3) {
                    throw new java.io.IOException("bad zip: truncated value in extra field");
                } else {
                    p11.o(v5_3);
                    long v7_4 = v0.b;
                    p13.invoke(Integer.valueOf(v12_3), Long.valueOf(v5_3));
                    long v9_3 = ((v0.b + v5_3) - v7_4);
                    long v3_1 = v9_3 cmp 0;
                    if (v3_1 < 0) {
                        throw new java.io.IOException(g2.g.c(v12_3, "unsupported zip: too many bytes processed for "));
                    } else {
                        if (v3_1 > 0) {
                            v0.skip(v9_3);
                        }
                        v1_0 = (v1_1 - v5_3);
                    }
                }
            }
        }
        return;
    }

    public static final y8.j f(x8.b0 p27, y8.j p28)
    {
        long v2_4 = p27.f();
        if (v2_4 != 67324752) {
            Long v1_7 = new StringBuilder("bad zip: expected ");
            v1_7.append(y8.b.c(67324752));
            v1_7.append(" but was ");
            v1_7.append(y8.b.c(v2_4));
            throw new java.io.IOException(v1_7.toString());
        } else {
            p27.skip(2);
            long v2_2 = p27.s();
            int v4_0 = (v2_2 & 65535);
            if ((v2_2 & 1) != 0) {
                Long v1_3 = new StringBuilder("unsupported zip: general purpose bit flag=");
                v1_3.append(y8.b.c(v4_0));
                throw new java.io.IOException(v1_3.toString());
            } else {
                p27.skip(18);
                int v4_3 = (((long) p27.s()) & 65535);
                long v2_9 = (p27.s() & 65535);
                p27.skip(v4_3);
                if (p28 != null) {
                    kotlin.jvm.internal.r v3_5 = new kotlin.jvm.internal.r();
                    int v4_5 = new kotlin.jvm.internal.r();
                    int v5_1 = new kotlin.jvm.internal.r();
                    y8.b.e(p27, v2_9, new y8.k(p27, v3_5, v4_5, v5_1));
                    return new y8.j(p28.a, p28.b, p28.c, p28.d, p28.e, p28.f, p28.g, p28.h, p28.i, p28.j, p28.k, p28.l, p28.m, ((Integer) v3_5.a), ((Integer) v4_5.a), ((Integer) v5_1.a));
                } else {
                    p27.skip(((long) v2_9));
                    return 0;
                }
            }
        }
    }

    public static final int g(x8.e0 p4, int p5)
    {
        int[] v0 = p4.f;
        int v5_1 = (p5 + 1);
        int v4_4 = p4.e.length;
        kotlin.jvm.internal.j.e(v0, "<this>");
        int v4_3 = (v4_4 - 1);
        int v1_0 = 0;
        while (v1_0 <= v4_3) {
            int v2_0 = ((v1_0 + v4_3) >> 1);
            int v3 = v0[v2_0];
            if (v3 >= v5_1) {
                if (v3 > v5_1) {
                    v4_3 = (v2_0 - 1);
                }
            } else {
                v1_0 = (v2_0 + 1);
            }
            if (v2_0 < 0) {
                return (~ v2_0);
            } else {
                return v2_0;
            }
        }
        v2_0 = ((- v1_0) - 1);
    }
}
