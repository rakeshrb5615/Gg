package x8;
public class j implements java.io.Serializable, java.lang.Comparable {
    public static final x8.j d;
    public final byte[] a;
    public transient int b;
    public transient String c;

    static j()
    {
        byte[] v1_1 = new byte[0];
        x8.j.d = new x8.j(v1_1);
        return;
    }

    public j(byte[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "data");
        this.a = p2;
        return;
    }

    public static int g(x8.j p1, x8.j p2)
    {
        p1.getClass();
        kotlin.jvm.internal.j.e(p2, "other");
        return p1.f(0, p2.h());
    }

    public static int k(x8.j p1, x8.j p2)
    {
        p1.getClass();
        kotlin.jvm.internal.j.e(p2, "other");
        return p1.j(p2.h());
    }

    public static synthetic x8.j p(x8.j p1, int p2, int p3, int p4)
    {
        if ((p4 & 1) != 0) {
            p2 = 0;
        }
        if ((p4 & 2) != 0) {
            p3 = -1234567890;
        }
        return p1.o(p2, p3);
    }

    public String a()
    {
        String v0_0 = x8.a.a;
        java.nio.charset.Charset v2_0 = this.a;
        kotlin.jvm.internal.j.e(v2_0, "<this>");
        kotlin.jvm.internal.j.e(v0_0, "map");
        byte[] v1_2 = new byte[(((v2_0.length + 2) / 3) * 4)];
        int v4_1 = (v2_0.length - (v2_0.length % 3));
        byte v5_2 = 0;
        int v6_0 = 0;
        while (v5_2 < v4_1) {
            int v8_1 = v2_0[v5_2];
            int v9_2 = (v5_2 + 2);
            int v7_7 = v2_0[(v5_2 + 1)];
            v5_2 += 3;
            int v9_3 = v2_0[v9_2];
            int v10_0 = (v6_0 + 1);
            v1_2[v6_0] = v0_0[((v8_1 & 255) >> 2)];
            int v11_3 = (v6_0 + 2);
            v1_2[v10_0] = v0_0[(((v8_1 & 3) << 4) | ((v7_7 & 255) >> 4))];
            int v8_6 = (v6_0 + 3);
            v1_2[v11_3] = v0_0[(((v7_7 & 15) << 2) | ((v9_3 & 255) >> 6))];
            v6_0 += 4;
            v1_2[v8_6] = v0_0[(v9_3 & 63)];
        }
        int v7_1 = (v2_0.length - v4_1);
        if (v7_1 == 1) {
            java.nio.charset.Charset v2_1 = v2_0[v5_2];
            int v4_3 = (v6_0 + 1);
            v1_2[v6_0] = v0_0[((v2_1 & 255) >> 2)];
            int v3_2 = (v6_0 + 2);
            v1_2[v4_3] = v0_0[((v2_1 & 3) << 4)];
            int v6_1 = (v6_0 + 3);
            v1_2[v3_2] = 61;
            v1_2[v6_1] = 61;
        } else {
            if (v7_1 == 2) {
                byte v5_4 = v2_0[v5_2];
                java.nio.charset.Charset v2_4 = v2_0[(v5_2 + 1)];
                int v4_5 = (v6_0 + 1);
                v1_2[v6_0] = v0_0[((v5_4 & 255) >> 2)];
                int v7_5 = (v6_0 + 2);
                v1_2[v4_5] = v0_0[(((v5_4 & 3) << 4) | ((v2_4 & 255) >> 4))];
                int v6_2 = (v6_0 + 3);
                v1_2[v7_5] = v0_0[((v2_4 & 15) << 2)];
                v1_2[v6_2] = 61;
            }
        }
        return new String(v1_2, b8.a.a);
    }

    public final int b(x8.j p10)
    {
        kotlin.jvm.internal.j.e(p10, "other");
        int v0_1 = this.d();
        int v1 = p10.d();
        int v2 = Math.min(v0_1, v1);
        int v4 = 0;
        while (v4 < v2) {
            int v7_1 = (this.i(v4) & 255);
            int v8_1 = (p10.i(v4) & 255);
            if (v7_1 != v8_1) {
                if (v7_1 >= v8_1) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                v4++;
            }
        }
        if (v0_1 != v1) {
            if (v0_1 >= v1) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    public x8.j c(String p4)
    {
        byte[] v4_1 = java.security.MessageDigest.getInstance(p4);
        v4_1.update(this.a, 0, this.d());
        byte[] v4_2 = v4_1.digest();
        kotlin.jvm.internal.j.b(v4_2);
        return new x8.j(v4_2);
    }

    public final bridge synthetic int compareTo(Object p1)
    {
        return this.b(((x8.j) p1));
    }

    public int d()
    {
        return this.a.length;
    }

    public String e()
    {
        String v0_0 = this.a;
        char[] v1_2 = new char[(v0_0.length * 2)];
        int v2 = v0_0.length;
        int v3 = 0;
        int v4 = 0;
        while (v3 < v2) {
            char v5_0 = v0_0[v3];
            int v6 = (v4 + 1);
            char[] v7 = y8.b.a;
            v1_2[v4] = v7[((v5_0 >> 4) & 15)];
            v4 += 2;
            v1_2[v6] = v7[(v5_0 & 15)];
            v3++;
        }
        return new String(v1_2);
    }

    public boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof x8.j)) {
                byte[] v2 = this.a;
                if ((((x8.j) p5).d() == v2.length) && (((x8.j) p5).m(0, v2, 0, v2.length))) {
                    return 1;
                }
            }
            return 0;
        }
        return 1;
    }

    public int f(int p5, byte[] p6)
    {
        kotlin.jvm.internal.j.e(p6, "other");
        byte[] v0_1 = this.a;
        int v1_1 = (v0_1.length - p6.length);
        int v5_2 = Math.max(p5, 0);
        if (v5_2 <= v1_1) {
            while (!x8.b.a(v0_1, v5_2, p6, 0, p6.length)) {
                if (v5_2 != v1_1) {
                    v5_2++;
                }
            }
            return v5_2;
        }
        return -1;
    }

    public byte[] h()
    {
        return this.a;
    }

    public int hashCode()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            int v0_2 = java.util.Arrays.hashCode(this.a);
            this.b = v0_2;
            return v0_2;
        } else {
            return v0_0;
        }
    }

    public byte i(int p2)
    {
        return this.a[p2];
    }

    public int j(byte[] p5)
    {
        kotlin.jvm.internal.j.e(p5, "other");
        byte[] v1 = this.a;
        int v0_1 = Math.min(this.d(), (v1.length - p5.length));
        while (-1 < v0_1) {
            if (!x8.b.a(v1, v0_1, p5, 0, p5.length)) {
                v0_1--;
            } else {
                return v0_1;
            }
        }
        return -1;
    }

    public boolean l(int p3, x8.j p4, int p5)
    {
        kotlin.jvm.internal.j.e(p4, "other");
        return p4.m(0, this.a, p3, p5);
    }

    public boolean m(int p3, byte[] p4, int p5, int p6)
    {
        kotlin.jvm.internal.j.e(p4, "other");
        if (p3 >= 0) {
            byte[] v0_1 = this.a;
            if ((p3 <= (v0_1.length - p6)) && ((p5 >= 0) && ((p5 <= (p4.length - p6)) && (x8.b.a(v0_1, p3, p4, p5, p6))))) {
                return 1;
            }
        }
        return 0;
    }

    public String n(java.nio.charset.Charset p3)
    {
        kotlin.jvm.internal.j.e(p3, "charset");
        return new String(this.a, p3);
    }

    public x8.j o(int p3, int p4)
    {
        if (p4 == -1234567890) {
            p4 = this.d();
        }
        if (p3 < null) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else {
            byte[] v0_1 = this.a;
            if (p4 > v0_1.length) {
                byte[] v3_2 = new StringBuilder("endIndex > length(");
                v3_2.append(v0_1.length);
                v3_2.append(41);
                throw new IllegalArgumentException(v3_2.toString().toString());
            } else {
                if ((p4 - p3) < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else {
                    if ((p3 != null) || (p4 != v0_1.length)) {
                        return new x8.j(i7.h.b0(v0_1, p3, p4));
                    } else {
                        return this;
                    }
                }
            }
        }
    }

    public x8.j q()
    {
        byte v0_0 = 0;
        while(true) {
            byte[] v1_0 = this.a;
            if (v0_0 >= v1_0.length) {
                return this;
            } else {
                byte v2_3 = v1_0[v0_0];
                if ((v2_3 >= 65) && (v2_3 <= 90)) {
                    break;
                }
                v0_0++;
            }
        }
        byte[] v1_1 = java.util.Arrays.copyOf(v1_0, v1_0.length);
        kotlin.jvm.internal.j.d(v1_1, "copyOf(...)");
        int v5_2 = (v0_0 + 1);
        v1_1[v0_0] = ((byte) (v2_3 + 32));
        while (v5_2 < v1_1.length) {
            byte v0_4 = v1_1[v5_2];
            if ((v0_4 >= 65) && (v0_4 <= 90)) {
                v1_1[v5_2] = ((byte) (v0_4 + 32));
            }
            v5_2++;
        }
        return new x8.j(v1_1);
    }

    public final String r()
    {
        byte[] v0_0 = this.c;
        if (v0_0 != null) {
            return v0_0;
        } else {
            byte[] v0_1 = this.h();
            kotlin.jvm.internal.j.e(v0_1, "<this>");
            String v1_2 = new String(v0_1, b8.a.a);
            this.c = v1_2;
            return v1_2;
        }
    }

    public void s(x8.g p3, int p4)
    {
        p3.write(this.a, 0, p4);
        return;
    }

    public String toString()
    {
        String v1_0 = this.a;
        if (v1_0.length != 0) {
            IllegalArgumentException v2_9 = v1_0.length;
            int v4_0 = 0;
            int v5_0 = 0;
            int v6_7 = 0;
            while (v4_0 < v2_9) {
                String v9_0 = v1_0[v4_0];
                int v16 = 2;
                if (v9_0 < null) {
                    int v7_2;
                    if ((v9_0 >> 5) != -2) {
                        if ((v9_0 >> 4) != -2) {
                            if ((v9_0 >> 3) != -2) {
                                if (v6_7 == 64) {
                                    break;
                                }
                                v5_0 = -1;
                                break;
                            } else {
                                int v3_15 = (v4_0 + 3);
                                if (v2_9 > v3_15) {
                                    int v7_14 = v1_0[(v4_0 + 1)];
                                    if ((v7_14 & 192) != 128) {
                                        if (v6_7 == 64) {
                                            break;
                                        }
                                    } else {
                                        String v13_3 = v1_0[(v4_0 + 2)];
                                        if ((v13_3 & 192) != 128) {
                                            if (v6_7 == 64) {
                                                break;
                                            }
                                        } else {
                                            int v3_16 = v1_0[v3_15];
                                            if ((v3_16 & 192) != 128) {
                                                if (v6_7 == 64) {
                                                    break;
                                                }
                                            } else {
                                                int v3_20 = ((((v3_16 ^ 3678080) ^ (v13_3 << 6)) ^ (v7_14 << 12)) ^ (v9_0 << 18));
                                                if (v3_20 <= 1114111) {
                                                    if ((55296 > v3_20) || (v3_20 >= 57344)) {
                                                        if (v3_20 >= 65536) {
                                                            v7_2 = (v6_7 + 1);
                                                            if (v6_7 == 64) {
                                                                break;
                                                            }
                                                            if ((((v3_20 == 10) || (v3_20 == 13)) || (((v3_20 < 0) || (v3_20 >= 32)) && ((127 > v3_20) || (v3_20 >= 160)))) && (v3_20 != 65533)) {
                                                                if (v3_20 < 65536) {
                                                                    v16 = 1;
                                                                }
                                                                v5_0 += v16;
                                                                v4_0 += 4;
                                                            }
                                                        } else {
                                                            if (v6_7 == 64) {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        if (v6_7 == 64) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    if (v6_7 == 64) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (v6_7 == 64) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            int v3_21 = (v4_0 + 2);
                            if (v2_9 > v3_21) {
                                int v7_20 = v1_0[(v4_0 + 1)];
                                if ((v7_20 & 192) != 128) {
                                    if (v6_7 == 64) {
                                        break;
                                    }
                                } else {
                                    int v3_22 = v1_0[v3_21];
                                    if ((v3_22 & 192) != 128) {
                                        if (v6_7 == 64) {
                                            break;
                                        }
                                    } else {
                                        int v3_0 = (((v3_22 ^ -123008) ^ (v7_20 << 6)) ^ (v9_0 << 12));
                                        if (v3_0 >= 2048) {
                                            if ((55296 > v3_0) || (v3_0 >= 57344)) {
                                                v7_2 = (v6_7 + 1);
                                                if (v6_7 == 64) {
                                                    break;
                                                }
                                                if ((((v3_0 == 10) || (v3_0 == 13)) || (((v3_0 < 0) || (v3_0 >= 32)) && ((127 > v3_0) || (v3_0 >= 160)))) && (v3_0 != 65533)) {
                                                    if (v3_0 < 65536) {
                                                        v16 = 1;
                                                    }
                                                    v5_0 += v16;
                                                    v4_0 += 3;
                                                }
                                            } else {
                                                if (v6_7 == 64) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            if (v6_7 == 64) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (v6_7 == 64) {
                                    break;
                                }
                            }
                        }
                    } else {
                        int v3_1 = (v4_0 + 1);
                        if (v2_9 > v3_1) {
                            int v3_2 = v1_0[v3_1];
                            if ((v3_2 & 192) != 128) {
                                if (v6_7 == 64) {
                                    break;
                                }
                            } else {
                                int v3_4 = ((v3_2 ^ 3968) ^ (v9_0 << 6));
                                if (v3_4 >= 128) {
                                    v7_2 = (v6_7 + 1);
                                    if (v6_7 == 64) {
                                        break;
                                    }
                                    if ((((v3_4 == 10) || (v3_4 == 13)) || (((v3_4 < 0) || (v3_4 >= 32)) && ((127 > v3_4) || (v3_4 >= 160)))) && (v3_4 != 65533)) {
                                        if (v3_4 < 65536) {
                                            v16 = 1;
                                        }
                                        v5_0 += v16;
                                        v4_0 += 2;
                                    }
                                } else {
                                    if (v6_7 == 64) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            if (v6_7 == 64) {
                                break;
                            }
                        }
                    }
                    v6_7 = v7_2;
                } else {
                    int v18 = (v6_7 + 1);
                    if (v6_7 == 64) {
                        break;
                    }
                    if ((((v9_0 == 10) || (v9_0 == 13)) || (((v9_0 < null) || (v9_0 >= 32)) && ((127 > v9_0) || (v9_0 >= 160)))) && (v9_0 != 65533)) {
                        int v6_8;
                        if (v9_0 >= 65536) {
                            v6_8 = 2;
                        } else {
                            v6_8 = 1;
                        }
                        v5_0 += v6_8;
                        v4_0++;
                        while(true) {
                            v6_7 = v18;
                            if (v4_0 >= v2_9) {
                                break;
                            }
                            String v9_1 = v1_0[v4_0];
                            if (v9_1 < null) {
                                break;
                            }
                            v4_0++;
                            v18 = (v6_7 + 1);
                            if (v6_7 != 64) {
                                if ((((v9_1 == 10) || (v9_1 == 13)) || (((v9_1 < null) || (v9_1 >= 32)) && ((127 > v9_1) || (v9_1 >= 160)))) && (v9_1 != 65533)) {
                                    int v6_9;
                                    if (v9_1 >= 65536) {
                                        v6_9 = 2;
                                    } else {
                                        v6_9 = 1;
                                    }
                                    v5_0 += v6_9;
                                }
                            } else {
                                if (v5_0 != -1) {
                                    int v6_11 = this.r();
                                    int v7_6 = v6_11.substring(0, v5_0);
                                    kotlin.jvm.internal.j.d(v7_6, "substring(...)");
                                    int v7_10 = b8.p.n0(b8.p.n0(b8.p.n0(v7_6, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
                                    if (v5_0 >= v6_11.length()) {
                                        String v1_2 = new StringBuilder("[text=");
                                        v1_2.append(v7_10);
                                        v1_2.append(93);
                                        return v1_2.toString();
                                    } else {
                                        int v4_3 = new StringBuilder("[size=");
                                        v4_3.append(v1_0.length);
                                        v4_3.append(" text=");
                                        v4_3.append(v7_10);
                                        v4_3.append("\u2026]");
                                        return v4_3.toString();
                                    }
                                } else {
                                    if (v1_0.length > 64) {
                                        int v4_5 = new StringBuilder("[size=");
                                        v4_5.append(v1_0.length);
                                        v4_5.append(" hex=");
                                        if (64 > v1_0.length) {
                                            IllegalArgumentException v2_4 = new StringBuilder("endIndex > length(");
                                            v2_4.append(v1_0.length);
                                            v2_4.append(41);
                                            throw new IllegalArgumentException(v2_4.toString().toString());
                                        } else {
                                            int v3_14;
                                            if (64 != v1_0.length) {
                                                v3_14 = new x8.j(i7.h.b0(v1_0, 0, 64));
                                            } else {
                                                v3_14 = this;
                                            }
                                            v4_5.append(v3_14.e());
                                            v4_5.append("\u2026]");
                                            return v4_5.toString();
                                        }
                                    } else {
                                        String v1_15 = new StringBuilder("[hex=");
                                        v1_15.append(this.e());
                                        v1_15.append(93);
                                        return v1_15.toString();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return "[size=0]";
        }
    }
}
