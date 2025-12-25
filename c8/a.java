package c8;
public final class a implements java.lang.Comparable {
    public static final long b;
    public static final long c;
    public static final synthetic int d;
    public final long a;

    static a()
    {
        c8.a.b = j5.t1.o(4611686018427387903);
        c8.a.c = j5.t1.o(-4611686018427387903);
        return;
    }

    public synthetic a(long p1)
    {
        this.a = p1;
        return;
    }

    public static final void a(StringBuilder p3, int p4, int p5, int p6, String p7, boolean p8)
    {
        p3.append(p4);
        if (p5 != 0) {
            p3.append(46);
            String v4_3 = b8.i.C0(p6, String.valueOf(p5));
            int v6_1 = -1;
            int v5_1 = (v4_3.length() + -1);
            if (v5_1 >= 0) {
                while(true) {
                    int v0_0 = (v5_1 - 1);
                    if (v4_3.charAt(v5_1) != 48) {
                        break;
                    }
                    if (v0_0 >= 0) {
                        v5_1 = v0_0;
                    }
                }
                v6_1 = v5_1;
            }
            int v5_2 = (v6_1 + 1);
            if ((p8) || (v5_2 >= 3)) {
                p3.append(v4_3, 0, (((v6_1 + 3) / 3) * 3));
            } else {
                p3.append(v4_3, 0, v5_2);
            }
        }
        p3.append(p7);
        return;
    }

    public static int b(long p5, long p7)
    {
        int v0_0 = (p5 ^ p7);
        if ((v0_0 >= 0) && ((((int) v0_0) & 1) != 0)) {
            int v0_1 = ((((int) p5) & 1) - (((int) p7) & 1));
            if (p5 >= 0) {
                return v0_1;
            } else {
                return (- v0_1);
            }
        } else {
            return kotlin.jvm.internal.j.g(p5, p7);
        }
    }

    public static final boolean c(long p2)
    {
        if ((p2 != c8.a.b) && (p2 != c8.a.c)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final long d(long p3, c8.c p5)
    {
        kotlin.jvm.internal.j.e(p5, "unit");
        if (p3 != c8.a.b) {
            if (p3 != c8.a.c) {
                long v3_3;
                long v1 = (p3 >> 1);
                if ((((int) p3) & 1) != 0) {
                    v3_3 = c8.c.c;
                } else {
                    v3_3 = c8.c.b;
                }
                kotlin.jvm.internal.j.e(v3_3, "sourceUnit");
                return p5.a.convert(v1, v3_3.a);
            } else {
                return -9223372036854775808;
            }
        } else {
            return 9223372036854775807;
        }
    }

    public final int compareTo(Object p5)
    {
        return c8.a.b(this.a, ((c8.a) p5).a);
    }

    public final boolean equals(Object p5)
    {
        if (((p5 instanceof c8.a)) && (this.a == ((c8.a) p5).a)) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return Long.hashCode(this.a);
    }

    public final String toString()
    {
        String v1_0 = this.a;
        int v5_3 = v1_0 cmp 0;
        if (v5_3 != 0) {
            if (v1_0 != c8.a.b) {
                if (v1_0 != c8.a.c) {
                    int v8;
                    if (v5_3 >= 0) {
                        v8 = 0;
                    } else {
                        v8 = 1;
                    }
                    StringBuilder v9_1 = new StringBuilder();
                    if (v8 != 0) {
                        v9_1.append(45);
                    }
                    if (v5_3 < 0) {
                        v1_0 = (((long) (((int) v1_0) & 1)) + ((- (v1_0 >> 1)) << 1));
                    }
                    int v5_7;
                    int v10_9 = c8.a.d(v1_0, c8.c.m);
                    if (!c8.a.c(v1_0)) {
                        v5_7 = ((int) (c8.a.d(v1_0, c8.c.f) % ((long) 24)));
                    } else {
                        v5_7 = 0;
                    }
                    int v16_1;
                    int v3_4;
                    if (!c8.a.c(v1_0)) {
                        v16_1 = 0;
                        v3_4 = ((int) (c8.a.d(v1_0, c8.c.e) % ((long) 60)));
                    } else {
                        v16_1 = 0;
                        v3_4 = 0;
                    }
                    int v4_2;
                    if (!c8.a.c(v1_0)) {
                        v4_2 = ((int) (c8.a.d(v1_0, c8.c.d) % ((long) 60)));
                    } else {
                        v4_2 = 0;
                    }
                    int v15;
                    String v1_15;
                    if (!c8.a.c(v1_0)) {
                        String v1_12;
                        if ((((int) v1_0) & 1) != 1) {
                            v15 = 1;
                            v1_12 = ((v1_0 >> 1) % ((long) 1000000000));
                        } else {
                            v15 = 1;
                            v1_12 = (((v1_0 >> 1) % ((long) 1000)) * ((long) 1000000));
                        }
                        v1_15 = ((int) v1_12);
                    } else {
                        v15 = 1;
                        v1_15 = 0;
                    }
                    int v2_2;
                    if (v10_9 == v16_1) {
                        v2_2 = 0;
                    } else {
                        v2_2 = v15;
                    }
                    int v6_8;
                    if (v5_7 == 0) {
                        v6_8 = 0;
                    } else {
                        v6_8 = v15;
                    }
                    int v7_1;
                    if (v3_4 == 0) {
                        v7_1 = 0;
                    } else {
                        v7_1 = v15;
                    }
                    if ((v4_2 == 0) && (v1_15 == null)) {
                        int v16_0 = 0;
                    } else {
                        v16_0 = v15;
                    }
                    int v12_0;
                    if (v2_2 == 0) {
                        v12_0 = 0;
                    } else {
                        v9_1.append(v10_9);
                        v9_1.append(100);
                        v12_0 = v15;
                    }
                    if ((v6_8 != 0) || ((v2_2 != 0) && ((v7_1 != 0) || (v16_0 != 0)))) {
                        int v11_0 = (v12_0 + 1);
                        if (v12_0 > 0) {
                            v9_1.append(32);
                        }
                        v9_1.append(v5_7);
                        v9_1.append(104);
                        v12_0 = v11_0;
                    }
                    if ((v7_1 != 0) || ((v16_0 != 0) && ((v6_8 != 0) || (v2_2 != 0)))) {
                        int v5_1 = (v12_0 + 1);
                        if (v12_0 > 0) {
                            v9_1.append(32);
                        }
                        v9_1.append(v3_4);
                        v9_1.append(109);
                        v12_0 = v5_1;
                    }
                    if (v16_0 != 0) {
                        int v3_1 = (v12_0 + 1);
                        if (v12_0 > 0) {
                            v9_1.append(32);
                        }
                        if ((v4_2 == 0) && ((v2_2 == 0) && ((v6_8 == 0) && (v7_1 == 0)))) {
                            if (v1_15 < 1000000) {
                                if (v1_15 < 1000) {
                                    v9_1.append(v1_15);
                                    v9_1.append("ns");
                                } else {
                                    c8.a.a(v9_1, (v1_15 / 1000), (v1_15 % 1000), 3, "us", 0);
                                }
                            } else {
                                c8.a.a(v9_1, (v1_15 / 1000000), (v1_15 % 1000000), 6, "ms", 0);
                            }
                        } else {
                            c8.a.a(v9_1, v4_2, v1_15, 9, "s", 0);
                        }
                        v12_0 = v3_1;
                    }
                    if ((v8 != 0) && (v12_0 > v15)) {
                        v9_1.insert(v15, 40).append(41);
                    }
                    return v9_1.toString();
                } else {
                    return "-Infinity";
                }
            } else {
                return "Infinity";
            }
        } else {
            return "0s";
        }
    }
}
