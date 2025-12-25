package x8;
public final class g implements x8.i, x8.h, java.lang.Cloneable, java.nio.channels.ByteChannel {
    public x8.c0 a;
    public long b;

    public final byte A(long p8)
    {
        x8.b.e(this.b, p8, 1);
        byte v8_3 = this.a;
        if (v8_3 == 0) {
            kotlin.jvm.internal.j.b(0);
            throw 0;
        } else {
            long v0_2 = this.b;
            if ((v0_2 - p8) >= p8) {
                long v0_1 = 0;
                while(true) {
                    long v4_2 = v8_3.b;
                    long v5_1 = (((long) (v8_3.c - v4_2)) + v0_1);
                    if (v5_1 > p8) {
                        break;
                    }
                    v8_3 = v8_3.f;
                    kotlin.jvm.internal.j.b(v8_3);
                    v0_1 = v5_1;
                }
                return v8_3.a[((int) ((((long) v4_2) + p8) - v0_1))];
            }
            while (v0_2 > p8) {
                v8_3 = v8_3.g;
                kotlin.jvm.internal.j.b(v8_3);
                v0_2 -= ((long) (v8_3.c - v8_3.b));
            }
            return v8_3.a[((int) ((((long) v8_3.b) + p8) - v0_2))];
        }
    }

    public final long B(byte p10, long p11, long p13)
    {
        long v0_0 = 0;
        if ((0 > p11) || (p11 > p13)) {
            long v10_8 = new StringBuilder("size=");
            v10_8.append(this.b);
            v10_8.append(" fromIndex=");
            v10_8.append(p11);
            v10_8.append(" toIndex=");
            v10_8.append(p13);
            throw new IllegalArgumentException(v10_8.toString().toString());
        } else {
            long v2_1 = this.b;
            if (p13 > v2_1) {
                p13 = v2_1;
            }
            if (p11 != p13) {
                x8.c0 v4_0 = this.a;
                if (v4_0 != null) {
                    if ((v2_1 - p11) >= p11) {
                        while(true) {
                            long v2_6 = (((long) (v4_0.c - v4_0.b)) + v0_0);
                            if (v2_6 > p11) {
                                break;
                            }
                            v4_0 = v4_0.f;
                            kotlin.jvm.internal.j.b(v4_0);
                            v0_0 = v2_6;
                        }
                        while (v0_0 < p13) {
                            long v2_8 = v4_0.a;
                            long v5_4 = Math.min(((long) v4_0.c), ((((long) v4_0.b) + p13) - v0_0));
                            int v11_8 = ((int) ((((long) v4_0.b) + p11) - v0_0));
                            while (v11_8 < ((int) v5_4)) {
                                if (v2_8[v11_8] != p10) {
                                    v11_8++;
                                } else {
                                    return (((long) (v11_8 - v4_0.b)) + v0_0);
                                }
                            }
                            v0_0 += ((long) (v4_0.c - v4_0.b));
                            v4_0 = v4_0.f;
                            kotlin.jvm.internal.j.b(v4_0);
                            p11 = v0_0;
                        }
                        return -1;
                    }
                    while (v2_1 > p11) {
                        v4_0 = v4_0.g;
                        kotlin.jvm.internal.j.b(v4_0);
                        v2_1 -= ((long) (v4_0.c - v4_0.b));
                    }
                    while (v2_1 < p13) {
                        long v0_9 = v4_0.a;
                        long v5_10 = Math.min(((long) v4_0.c), ((((long) v4_0.b) + p13) - v2_1));
                        int v11_3 = ((int) ((((long) v4_0.b) + p11) - v2_1));
                        while (v11_3 < ((int) v5_10)) {
                            if (v0_9[v11_3] != p10) {
                                v11_3++;
                            } else {
                                return (((long) (v11_3 - v4_0.b)) + v2_1);
                            }
                        }
                        v2_1 += ((long) (v4_0.c - v4_0.b));
                        v4_0 = v4_0.f;
                        kotlin.jvm.internal.j.b(v4_0);
                        p11 = v2_1;
                    }
                }
            }
            return -1;
        }
    }

    public final long C(x8.j p12)
    {
        kotlin.jvm.internal.j.e(p12, "targetBytes");
        x8.c0 v0_1 = this.a;
        if (v0_1 != null) {
            int v3_3;
            int v12_1;
            long v1 = this.b;
            int v3_2 = 0;
            if (v1 >= 0) {
                v1 = 0;
                while(true) {
                    int v9_5 = (((long) (v0_1.c - v0_1.b)) + v1);
                    if (v9_5 > 0) {
                        break;
                    }
                    v0_1 = v0_1.f;
                    kotlin.jvm.internal.j.b(v0_1);
                    v1 = v9_5;
                }
                if (p12.d() != 2) {
                    int v12_3 = p12.h();
                    while (v1 < this.b) {
                        v3_3 = ((int) ((((long) v0_1.b) + v3_2) - v1));
                        while (v3_3 < v0_1.c) {
                            int v9_6 = 0;
                            while (v9_6 < v12_3.length) {
                                if (v0_1.a[v3_3] != v12_3[v9_6]) {
                                    v9_6++;
                                } else {
                                    v12_1 = v0_1.b;
                                }
                            }
                            v3_3++;
                        }
                        v3_2 = (((long) (v0_1.c - v0_1.b)) + v1);
                        v0_1 = v0_1.f;
                        kotlin.jvm.internal.j.b(v0_1);
                        v1 = v3_2;
                    }
                    return -1;
                } else {
                    byte[] v5_10 = p12.i(0);
                    int v12_4 = p12.i(1);
                    while (v1 < this.b) {
                        v3_3 = ((int) ((((long) v0_1.b) + v3_2) - v1));
                        while (v3_3 < v0_1.c) {
                            byte v7_9 = v0_1.a[v3_3];
                            if ((v7_9 != v5_10) && (v7_9 != v12_4)) {
                                v3_3++;
                            } else {
                                v12_1 = v0_1.b;
                            }
                        }
                        v3_2 = (((long) (v0_1.c - v0_1.b)) + v1);
                        v0_1 = v0_1.f;
                        kotlin.jvm.internal.j.b(v0_1);
                        v1 = v3_2;
                    }
                    return -1;
                }
            } else {
                while (v1 > 0) {
                    v0_1 = v0_1.g;
                    kotlin.jvm.internal.j.b(v0_1);
                    v1 -= ((long) (v0_1.c - v0_1.b));
                }
                if (p12.d() != 2) {
                    int v12_5 = p12.h();
                    while (v1 < this.b) {
                        v3_3 = ((int) ((((long) v0_1.b) + v3_2) - v1));
                        while (v3_3 < v0_1.c) {
                            int v9_0 = 0;
                            while (v9_0 < v12_5.length) {
                                if (v0_1.a[v3_3] != v12_5[v9_0]) {
                                    v9_0++;
                                }
                            }
                            v3_3++;
                        }
                        v3_2 = (((long) (v0_1.c - v0_1.b)) + v1);
                        v0_1 = v0_1.f;
                        kotlin.jvm.internal.j.b(v0_1);
                        v1 = v3_2;
                    }
                    return -1;
                } else {
                    byte[] v5_0 = p12.i(0);
                    int v12_2 = p12.i(1);
                    while (v1 < this.b) {
                        v3_3 = ((int) ((((long) v0_1.b) + v3_2) - v1));
                        while (v3_3 < v0_1.c) {
                            byte v7_4 = v0_1.a[v3_3];
                            if ((v7_4 != v5_0) && (v7_4 != v12_2)) {
                                v3_3++;
                            }
                        }
                        v3_2 = (((long) (v0_1.c - v0_1.b)) + v1);
                        v0_1 = v0_1.f;
                        kotlin.jvm.internal.j.b(v0_1);
                        v1 = v3_2;
                    }
                    return -1;
                }
            }
            return (((long) (v3_3 - v12_1)) + v1);
        }
        return -1;
    }

    public final byte[] D(long p3)
    {
        if ((p3 < 0) || (p3 > 2147483647)) {
            throw new IllegalArgumentException(v1.a.g(p3, "byteCount: ").toString());
        } else {
            if (this.b < p3) {
                throw new java.io.EOFException();
            } else {
                java.io.EOFException v3_5 = new byte[((int) p3)];
                kotlin.jvm.internal.j.e(v3_5, "sink");
                int v4_2 = 0;
                while (v4_2 < v3_5.length) {
                    int v0_8 = this.read(v3_5, v4_2, (v3_5.length - v4_2));
                    if (v0_8 == -1) {
                        throw new java.io.EOFException();
                    } else {
                        v4_2 += v0_8;
                    }
                }
                return v3_5;
            }
        }
    }

    public final short E()
    {
        short v0_0 = this.readShort();
        return ((short) (((v0_0 & 255) << 8) | ((65280 & v0_0) >> 8)));
    }

    public final String F(long p7, java.nio.charset.Charset p9)
    {
        kotlin.jvm.internal.j.e(p9, "charset");
        String v0_3 = p7 cmp 0;
        if ((v0_3 < null) || (p7 > 2147483647)) {
            throw new IllegalArgumentException(v1.a.g(p7, "byteCount: ").toString());
        } else {
            if (this.b < p7) {
                throw new java.io.EOFException();
            } else {
                if (v0_3 != null) {
                    String v0_2 = this.a;
                    kotlin.jvm.internal.j.b(v0_2);
                    int v1_2 = v0_2.b;
                    if ((((long) v1_2) + p7) <= ((long) v0_2.c)) {
                        String v2_4 = new String(v0_2.a, v1_2, ((int) p7), p9);
                        int v9_2 = (v0_2.b + ((int) p7));
                        v0_2.b = v9_2;
                        this.b = (this.b - p7);
                        if (v9_2 == v0_2.c) {
                            this.a = v0_2.a();
                            x8.d0.a(v0_2);
                        }
                        return v2_4;
                    } else {
                        return new String(this.D(p7), p9);
                    }
                } else {
                    return "";
                }
            }
        }
    }

    public final String G()
    {
        return this.F(this.b, b8.a.a);
    }

    public final int H()
    {
        if (this.b == 0) {
            throw new java.io.EOFException();
        } else {
            int v1_3;
            int v6;
            int v5_3;
            int v0_12 = this.A(0);
            int v2_1 = 1;
            if ((v0_12 & 128) != 0) {
                if ((v0_12 & 224) != 192) {
                    if ((v0_12 & 240) != 224) {
                        if ((v0_12 & 248) != 240) {
                            this.skip(1);
                            return 65533;
                        } else {
                            v1_3 = (v0_12 & 7);
                            v5_3 = 4;
                            v6 = 65536;
                        }
                    } else {
                        v1_3 = (v0_12 & 15);
                        v5_3 = 3;
                        v6 = 2048;
                    }
                } else {
                    v1_3 = (v0_12 & 31);
                    v5_3 = 2;
                    v6 = 128;
                }
            } else {
                v1_3 = (v0_12 & 127);
                v6 = 0;
                v5_3 = 1;
            }
            long v9 = ((long) v5_3);
            if (this.b < v9) {
                int v2_3 = v1.a.p("size < ", v5_3, ": ");
                v2_3.append(this.b);
                v2_3.append(" (to read code point prefixed 0x");
                v2_3.append(x8.b.h(v0_12));
                v2_3.append(41);
                throw new java.io.EOFException(v2_3.toString());
            }
            while (v2_1 < v5_3) {
                long v7_2 = ((long) v2_1);
                int v0_11 = this.A(v7_2);
                if ((v0_11 & 192) != 128) {
                    this.skip(v7_2);
                    return 65533;
                } else {
                    v1_3 = ((v1_3 << 6) | (v0_11 & 63));
                    v2_1++;
                }
            }
            this.skip(v9);
            if (v1_3 <= 1114111) {
                if ((55296 > v1_3) || (v1_3 >= 57344)) {
                    if (v1_3 >= v6) {
                        return v1_3;
                    } else {
                        return 65533;
                    }
                } else {
                    return 65533;
                }
            } else {
                return 65533;
            }
        }
    }

    public final x8.j I(int p9)
    {
        if (p9 != null) {
            x8.b.e(this.b, 0, ((long) p9));
            String v0_3 = this.a;
            int v1 = 0;
            int v2_3 = 0;
            int v3 = 0;
            while (v2_3 < p9) {
                kotlin.jvm.internal.j.b(v0_3);
                int v4_3 = v0_3.c;
                x8.c0 v5_1 = v0_3.b;
                if (v4_3 == v5_1) {
                    throw new AssertionError("s.limit == s.pos");
                } else {
                    v2_3 += (v4_3 - v5_1);
                    v3++;
                    v0_3 = v0_3.f;
                }
            }
            String v0_1 = new byte[][v3];
            int v2_1 = new int[(v3 * 2)];
            x8.c0 v5_0 = this.a;
            int v4_1 = 0;
            while (v1 < p9) {
                kotlin.jvm.internal.j.b(v5_0);
                v0_1[v4_1] = v5_0.a;
                v1 += (v5_0.c - v5_0.b);
                v2_1[v4_1] = Math.min(v1, p9);
                v2_1[(v4_1 + v3)] = v5_0.b;
                v5_0.d = 1;
                v4_1++;
                v5_0 = v5_0.f;
            }
            return new x8.e0(v0_1, v2_1);
        } else {
            return x8.j.d;
        }
    }

    public final x8.c0 J(int p4)
    {
        if ((p4 < 1) || (p4 > 8192)) {
            throw new IllegalArgumentException("unexpected capacity");
        } else {
            x8.c0 v1_1 = this.a;
            if (v1_1 != null) {
                x8.c0 v1_0 = v1_1.g;
                kotlin.jvm.internal.j.b(v1_0);
                if (((v1_0.c + p4) <= 8192) && (v1_0.e)) {
                    return v1_0;
                } else {
                    x8.c0 v4_2 = x8.d0.b();
                    v1_0.b(v4_2);
                    return v4_2;
                }
            } else {
                x8.c0 v4_3 = x8.d0.b();
                this.a = v4_3;
                v4_3.g = v4_3;
                v4_3.f = v4_3;
                return v4_3;
            }
        }
    }

    public final void K(x8.j p2)
    {
        kotlin.jvm.internal.j.e(p2, "byteString");
        p2.s(this, p2.d());
        return;
    }

    public final long L(x8.h0 p7)
    {
        kotlin.jvm.internal.j.e(p7, "source");
        long v0_1 = 0;
        while(true) {
            long v2_1 = p7.t(this, 8192);
            if (v2_1 == -1) {
                break;
            }
            v0_1 += v2_1;
        }
        return v0_1;
    }

    public final void M(int p5)
    {
        long v0_2 = this.J(1);
        byte[] v1 = v0_2.a;
        long v2_1 = v0_2.c;
        v0_2.c = (v2_1 + 1);
        v1[v2_1] = ((byte) p5);
        this.b = (this.b + 1);
        return;
    }

    public final void N(long p13)
    {
        int v2_0 = p13 cmp 0;
        if (v2_0 != 0) {
            int v2_1;
            x8.c0 v3_0 = 0;
            if (v2_0 >= 0) {
                v2_1 = 0;
            } else {
                p13 = (- p13);
                if (p13 >= 0) {
                    v2_1 = 1;
                } else {
                    this.S("-9223372036854775808");
                    return;
                }
            }
            int v5_3 = (((64 - Long.numberOfLeadingZeros(p13)) * 10) >> 5);
            if (p13 > y8.a.b[v5_3]) {
                v3_0 = 1;
            }
            int v5_4 = (v5_3 + v3_0);
            if (v2_1 != 0) {
                v5_4++;
            }
            x8.c0 v3_1 = this.J(v5_4);
            byte[] v4_0 = v3_1.a;
            int v7_3 = (v3_1.c + v5_4);
            while (p13 != 0) {
                v7_3--;
                v4_0[v7_3] = y8.a.a[((int) (p13 % ((long) 10)))];
                p13 /= ((long) 10);
            }
            if (v2_1 != 0) {
                v4_0[(v7_3 - 1)] = 45;
            }
            v3_1.c = (v3_1.c + v5_4);
            this.b = (this.b + ((long) v5_4));
            return;
        } else {
            this.M(48);
            return;
        }
    }

    public final void O(long p13)
    {
        if (p13 != 0) {
            int v1_18 = ((p13 >> 1) | p13);
            int v1_19 = (v1_18 | (v1_18 >> 2));
            int v1_0 = (v1_19 | (v1_19 >> 4));
            int v1_1 = (v1_0 | (v1_0 >> 8));
            int v1_2 = (v1_1 | (v1_1 >> 16));
            int v1_3 = (v1_2 | (v1_2 >> 32));
            int v1_4 = (v1_3 - ((v1_3 >> 1) & 6148914691236517205));
            long v8_5 = (((v1_4 >> 2) & 3689348814741910323) + (v1_4 & 3689348814741910323));
            int v1_8 = (((v8_5 >> 4) + v8_5) & 1085102592571150095);
            int v1_9 = (v1_8 + (v1_8 >> 8));
            int v1_10 = (v1_9 + (v1_9 >> 16));
            int v1_17 = ((int) ((((v1_10 & 63) + ((v1_10 >> 32) & 63)) + ((long) 3)) / ((long) 4)));
            x8.c0 v2 = this.J(v1_17);
            int v5_4 = v2.c;
            int v6_3 = ((v5_4 + v1_17) - 1);
            while (v6_3 >= v5_4) {
                v2.a[v6_3] = y8.a.a[((int) (15 & p13))];
                p13 >>= 4;
                v6_3--;
            }
            v2.c = (v2.c + v1_17);
            this.b = (this.b + ((long) v1_17));
            return;
        } else {
            this.M(48);
            return;
        }
    }

    public final void P(int p8)
    {
        x8.c0 v1 = this.J(4);
        long v2_1 = v1.a;
        int v3_1 = v1.c;
        int v4_1 = (v3_1 + 1);
        v2_1[v3_1] = ((byte) ((p8 >> 24) & 255));
        int v5_0 = (v3_1 + 2);
        v2_1[v4_1] = ((byte) ((p8 >> 16) & 255));
        int v4_0 = (v3_1 + 3);
        v2_1[v5_0] = ((byte) ((p8 >> 8) & 255));
        int v3_0 = (v3_1 + 4);
        v2_1[v4_0] = ((byte) (p8 & 255));
        v1.c = v3_0;
        this.b = (this.b + 4);
        return;
    }

    public final void Q(int p7)
    {
        x8.c0 v1 = this.J(2);
        long v2_1 = v1.a;
        int v3_1 = v1.c;
        int v4 = (v3_1 + 1);
        v2_1[v3_1] = ((byte) ((p7 >> 8) & 255));
        int v3_0 = (v3_1 + 2);
        v2_1[v4] = ((byte) (p7 & 255));
        v1.c = v3_0;
        this.b = (this.b + 2);
        return;
    }

    public final void R(int p10, int p11, String p12)
    {
        kotlin.jvm.internal.j.e(p12, "string");
        if (p10 < 0) {
            throw new IllegalArgumentException(g2.g.c(p10, "beginIndex < 0: ").toString());
        } else {
            if (p11 < p10) {
                throw new IllegalArgumentException(v1.a.i("endIndex < beginIndex: ", p11, p10, " < ").toString());
            } else {
                if (p11 > p12.length()) {
                    int v10_6 = v1.a.p("endIndex > string.length: ", p11, " > ");
                    v10_6.append(p12.length());
                    throw new IllegalArgumentException(v10_6.toString().toString());
                }
                while (p10 < p11) {
                    long v0_22 = p12.charAt(p10);
                    if (v0_22 >= 128) {
                        if (v0_22 >= 2048) {
                            if ((v0_22 >= 55296) && (v0_22 <= 57343)) {
                                x8.c0 v4_6;
                                long v2_10 = (p10 + 1);
                                if (v2_10 >= p11) {
                                    v4_6 = 0;
                                } else {
                                    v4_6 = p12.charAt(v2_10);
                                }
                                if ((v0_22 > 56319) || ((56320 > v4_6) || (v4_6 >= 57344))) {
                                    this.M(63);
                                    p10 = v2_10;
                                } else {
                                    long v0_26 = ((((v0_22 & 1023) << 10) | (v4_6 & 1023)) + 65536);
                                    x8.c0 v4_7 = this.J(4);
                                    byte[] v5_8 = v4_7.a;
                                    int v6_7 = v4_7.c;
                                    v5_8[v6_7] = ((byte) ((v0_26 >> 18) | 240));
                                    v5_8[(v6_7 + 1)] = ((byte) (((v0_26 >> 12) & 63) | 128));
                                    v5_8[(v6_7 + 2)] = ((byte) (((v0_26 >> 6) & 63) | 128));
                                    v5_8[(v6_7 + 3)] = ((byte) ((v0_26 & 63) | 128));
                                    v4_7.c = (v6_7 + 4);
                                    this.b = (this.b + 4);
                                    p10 += 2;
                                }
                            } else {
                                x8.c0 v4_0 = this.J(3);
                                byte[] v5_0 = v4_0.a;
                                int v6_0 = v4_0.c;
                                v5_0[v6_0] = ((byte) ((v0_22 >> 12) | 224));
                                v5_0[(v6_0 + 1)] = ((byte) ((63 & (v0_22 >> 6)) | 128));
                                v5_0[(v6_0 + 2)] = ((byte) ((v0_22 & 63) | 128));
                                v4_0.c = (v6_0 + 3);
                                this.b = (this.b + 3);
                            }
                        } else {
                            int v3_4 = this.J(2);
                            x8.c0 v4_1 = v3_4.a;
                            byte[] v5_1 = v3_4.c;
                            v4_1[v5_1] = ((byte) ((v0_22 >> 6) | 192));
                            v4_1[(v5_1 + 1)] = ((byte) ((v0_22 & 63) | 128));
                            v3_4.c = (v5_1 + 2);
                            this.b = (this.b + 2);
                        }
                        p10++;
                    } else {
                        long v2_5 = this.J(1);
                        int v3_5 = v2_5.a;
                        x8.c0 v4_3 = (v2_5.c - p10);
                        byte[] v5_4 = Math.min(p11, (8192 - v4_3));
                        int v6_6 = (p10 + 1);
                        v3_5[(p10 + v4_3)] = ((byte) v0_22);
                        while(true) {
                            p10 = v6_6;
                            if (p10 >= v5_4) {
                                break;
                            }
                            long v0_14 = p12.charAt(p10);
                            if (v0_14 >= 128) {
                                break;
                            }
                            v6_6 = (p10 + 1);
                            v3_5[(p10 + v4_3)] = ((byte) v0_14);
                        }
                        long v0_15 = v2_5.c;
                        x8.c0 v4_5 = ((v4_3 + p10) - v0_15);
                        v2_5.c = (v0_15 + v4_5);
                        this.b = (this.b + ((long) v4_5));
                    }
                }
                return;
            }
        }
    }

    public final void S(String p3)
    {
        kotlin.jvm.internal.j.e(p3, "string");
        this.R(0, p3.length(), p3);
        return;
    }

    public final void T(int p9)
    {
        if (p9 >= 128) {
            if (p9 >= 2048) {
                if ((55296 > p9) || (p9 >= 57344)) {
                    if (p9 >= 65536) {
                        if (p9 > 1114111) {
                            throw new IllegalArgumentException("Unexpected code point: 0x".concat(x8.b.i(p9)));
                        } else {
                            x8.c0 v3_0 = this.J(4);
                            byte[] v4_0 = v3_0.a;
                            int v5_0 = v3_0.c;
                            v4_0[v5_0] = ((byte) ((p9 >> 18) | 240));
                            v4_0[(v5_0 + 1)] = ((byte) (((p9 >> 12) & 63) | 128));
                            v4_0[(v5_0 + 2)] = ((byte) (((p9 >> 6) & 63) | 128));
                            v4_0[(v5_0 + 3)] = ((byte) ((p9 & 63) | 128));
                            v3_0.c = (v5_0 + 4);
                            this.b = (this.b + 4);
                            return;
                        }
                    } else {
                        x8.c0 v3_1 = this.J(3);
                        byte[] v4_1 = v3_1.a;
                        int v5_2 = v3_1.c;
                        v4_1[v5_2] = ((byte) ((p9 >> 12) | 224));
                        v4_1[(v5_2 + 1)] = ((byte) (((p9 >> 6) & 63) | 128));
                        v4_1[(v5_2 + 2)] = ((byte) ((p9 & 63) | 128));
                        v3_1.c = (v5_2 + 3);
                        this.b = (this.b + 3);
                        return;
                    }
                } else {
                    this.M(63);
                    return;
                }
            } else {
                x8.c0 v3_2 = this.J(2);
                byte[] v4_2 = v3_2.a;
                int v5_4 = v3_2.c;
                v4_2[v5_4] = ((byte) ((p9 >> 6) | 192));
                v4_2[(v5_4 + 1)] = ((byte) ((p9 & 63) | 128));
                v3_2.c = (v5_4 + 2);
                this.b = (this.b + 2);
                return;
            }
        } else {
            this.M(p9);
            return;
        }
    }

    public final x8.g a()
    {
        return this;
    }

    public final x8.j0 b()
    {
        return x8.j0.d;
    }

    public final bridge synthetic Object clone()
    {
        return this.x();
    }

    public final void close()
    {
        return;
    }

    public final bridge synthetic x8.h d(long p1)
    {
        this.O(p1);
        return this;
    }

    public final x8.j e(long p3)
    {
        if ((p3 < 0) || (p3 > 2147483647)) {
            throw new IllegalArgumentException(v1.a.g(p3, "byteCount: ").toString());
        } else {
            if (this.b < p3) {
                throw new java.io.EOFException();
            } else {
                if (p3 < 4096) {
                    return new x8.j(this.D(p3));
                } else {
                    x8.j v0_10 = this.I(((int) p3));
                    this.skip(p3);
                    return v0_10;
                }
            }
        }
    }

    public final boolean equals(Object p19)
    {
        if (this != p19) {
            if ((p19 instanceof x8.g)) {
                int v5_3 = this.b;
                if (v5_3 == ((x8.g) p19).b) {
                    if (v5_3 != 0) {
                        x8.c0 v3_2 = this.a;
                        kotlin.jvm.internal.j.b(v3_2);
                        x8.c0 v1_1 = ((x8.g) p19).a;
                        kotlin.jvm.internal.j.b(v1_1);
                        int v5_0 = v3_2.b;
                        int v6_0 = v1_1.b;
                        long v9 = 0;
                        while (v9 < this.b) {
                            long v11_5 = ((long) Math.min((v3_2.c - v5_0), (v1_1.c - v6_0)));
                            int v13_0 = 0;
                            while (v13_0 < v11_5) {
                                if (v3_2.a[v5_0] == v1_1.a[v6_0]) {
                                    v13_0++;
                                    v5_0++;
                                    v6_0++;
                                } else {
                                    return 0;
                                }
                            }
                            if (v5_0 == v3_2.c) {
                                v3_2 = v3_2.f;
                                kotlin.jvm.internal.j.b(v3_2);
                                v5_0 = v3_2.b;
                            }
                            if (v6_0 == v1_1.c) {
                                v1_1 = v1_1.f;
                                kotlin.jvm.internal.j.b(v1_1);
                                v6_0 = v1_1.b;
                            }
                            v9 += v11_5;
                        }
                        return 1;
                    } else {
                        return 1;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final void flush()
    {
        return;
    }

    public final String g()
    {
        return this.l(9223372036854775807);
    }

    public final boolean h()
    {
        if (this.b != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        x8.c0 v0_0 = this.a;
        if (v0_0 != null) {
            int v1_1 = 1;
            do {
                x8.c0 v2_0 = v0_0.b;
                if (v2_0 >= v0_0.c) {
                    v0_0 = v0_0.f;
                    kotlin.jvm.internal.j.b(v0_0);
                } else {
                    v1_1 = ((v1_1 * 31) + v0_0.a[v2_0]);
                    v2_0++;
                    while (v2_0 < v0_0.c) {
                    }
                }
            } while(v0_0 != this.a);
            return v1_1;
        } else {
            return 0;
        }
    }

    public final boolean isOpen()
    {
        return 1;
    }

    public final bridge synthetic x8.h j(x8.j p1)
    {
        this.K(p1);
        return this;
    }

    public final void k(x8.g p9, long p10)
    {
        kotlin.jvm.internal.j.e(p9, "source");
        if (p9 == this) {
            throw new IllegalArgumentException("source == this");
        } else {
            x8.b.e(p9.b, 0, p10);
            while (p10 > 0) {
                x8.c0 v0_11 = p9.a;
                kotlin.jvm.internal.j.b(v0_11);
                x8.c0 v0_12 = v0_11.c;
                x8.c0 v1_4 = p9.a;
                kotlin.jvm.internal.j.b(v1_4);
                x8.c0 v1_1 = 0;
                if (p10 < ((long) (v0_12 - v1_4.b))) {
                    x8.c0 v0_17;
                    x8.c0 v0_16 = this.a;
                    if (v0_16 == null) {
                        v0_17 = 0;
                    } else {
                        v0_17 = v0_16.g;
                    }
                    if ((v0_17 != null) && (v0_17.e)) {
                        int v4_3;
                        if (!v0_17.d) {
                            v4_3 = v0_17.b;
                        } else {
                            v4_3 = 0;
                        }
                        if (((((long) v0_17.c) + p10) - ((long) v4_3)) <= 8192) {
                            x8.c0 v1_3 = p9.a;
                            kotlin.jvm.internal.j.b(v1_3);
                            v1_3.d(v0_17, ((int) p10));
                            p9.b = (p9.b - p10);
                            this.b = (this.b + p10);
                            return;
                        }
                    }
                    x8.c0 v0_18 = p9.a;
                    kotlin.jvm.internal.j.b(v0_18);
                    if ((((int) p10) <= 0) || (((int) p10) > (v0_18.c - v0_18.b))) {
                        throw new IllegalArgumentException("byteCount out of range");
                    } else {
                        x8.c0 v3_3;
                        if (((int) p10) < 1024) {
                            v3_3 = x8.d0.b();
                            int v6_2 = v0_18.b;
                            i7.h.Y(v0_18.a, 0, v3_3.a, v6_2, (v6_2 + ((int) p10)));
                        } else {
                            v3_3 = v0_18.c();
                        }
                        v3_3.c = (v3_3.b + ((int) p10));
                        v0_18.b = (v0_18.b + ((int) p10));
                        x8.c0 v0_19 = v0_18.g;
                        kotlin.jvm.internal.j.b(v0_19);
                        v0_19.b(v3_3);
                        p9.a = v3_3;
                    }
                }
                x8.c0 v0_20 = p9.a;
                kotlin.jvm.internal.j.b(v0_20);
                int v2_10 = ((long) (v0_20.c - v0_20.b));
                p9.a = v0_20.a();
                int v4_13 = this.a;
                if (v4_13 != 0) {
                    int v4_14 = v4_13.g;
                    kotlin.jvm.internal.j.b(v4_14);
                    v4_14.b(v0_20);
                    int v4_15 = v0_20.g;
                    if (v4_15 == v0_20) {
                        throw new IllegalStateException("cannot compact");
                    } else {
                        kotlin.jvm.internal.j.b(v4_15);
                        if (v4_15.e) {
                            int v4_1 = (v0_20.c - v0_20.b);
                            byte[] v5_1 = v0_20.g;
                            kotlin.jvm.internal.j.b(v5_1);
                            byte[] v5_3 = (8192 - v5_1.c);
                            int v6_0 = v0_20.g;
                            kotlin.jvm.internal.j.b(v6_0);
                            if (!v6_0.d) {
                                x8.c0 v1_0 = v0_20.g;
                                kotlin.jvm.internal.j.b(v1_0);
                                v1_1 = v1_0.b;
                            }
                            if (v4_1 <= (v5_3 + v1_1)) {
                                x8.c0 v1_2 = v0_20.g;
                                kotlin.jvm.internal.j.b(v1_2);
                                v0_20.d(v1_2, v4_1);
                                v0_20.a();
                                x8.d0.a(v0_20);
                            }
                        }
                    }
                } else {
                    this.a = v0_20;
                    v0_20.g = v0_20;
                    v0_20.f = v0_20;
                }
                p9.b = (p9.b - v2_10);
                this.b = (this.b + v2_10);
                p10 -= v2_10;
            }
            return;
        }
    }

    public final String l(long p11)
    {
        if (p11 < 0) {
            throw new IllegalArgumentException(v1.a.g(p11, "limit < 0: ").toString());
        } else {
            x8.g v0_2 = 9223372036854775807;
            if (p11 != 9223372036854775807) {
                v0_2 = (p11 + 1);
            }
            long v4_0 = v0_2;
            String v1_1 = this.B(10, 0, v4_0);
            if (v1_1 == -1) {
                if ((v4_0 >= this.b) || ((this.A((v4_0 - 1)) != 13) || (this.A(v4_0) != 10))) {
                    String v1_9 = new x8.g();
                    this.z(v1_9, 0, Math.min(((long) 32), this.b));
                    StringBuilder v3_2 = new StringBuilder("\\n not found: limit=");
                    v3_2.append(Math.min(this.b, p11));
                    v3_2.append(" content=");
                    v3_2.append(v1_9.e(v1_9.b).e());
                    v3_2.append(8230);
                    throw new java.io.EOFException(v3_2.toString());
                } else {
                    return y8.a.b(this, v4_0);
                }
            } else {
                return y8.a.b(this, v1_1);
            }
        }
    }

    public final int m(x8.x p4)
    {
        kotlin.jvm.internal.j.e(p4, "options");
        int v0_2 = y8.a.c(this, p4, 0);
        if (v0_2 != -1) {
            this.skip(((long) p4.a[v0_2].d()));
            return v0_2;
        } else {
            return -1;
        }
    }

    public final bridge synthetic x8.h n(int p2, byte[] p3)
    {
        this.write(p3, 0, p2);
        return this;
    }

    public final void o(long p3)
    {
        if (this.b < p3) {
            throw new java.io.EOFException();
        } else {
            return;
        }
    }

    public final long p(x8.g p5)
    {
        long v0 = this.b;
        if (v0 > 0) {
            p5.k(this, v0);
        }
        return v0;
    }

    public final bridge synthetic x8.h q(String p1)
    {
        this.S(p1);
        return this;
    }

    public final java.io.OutputStream r()
    {
        return new a1.n1(this, 1);
    }

    public final int read(java.nio.ByteBuffer p7)
    {
        kotlin.jvm.internal.j.e(p7, "sink");
        x8.c0 v0_1 = this.a;
        if (v0_1 != null) {
            int v1_0 = Math.min(p7.remaining(), (v0_1.c - v0_1.b));
            p7.put(v0_1.a, v0_1.b, v1_0);
            x8.c0 v7_2 = (v0_1.b + v1_0);
            v0_1.b = v7_2;
            this.b = (this.b - ((long) v1_0));
            if (v7_2 == v0_1.c) {
                this.a = v0_1.a();
                x8.d0.a(v0_1);
            }
            return v1_0;
        } else {
            return -1;
        }
    }

    public final int read(byte[] p8, int p9, int p10)
    {
        kotlin.jvm.internal.j.e(p8, "sink");
        x8.b.e(((long) p8.length), ((long) p9), ((long) p10));
        x8.c0 v0_2 = this.a;
        if (v0_2 != null) {
            int v10_1 = Math.min(p10, (v0_2.c - v0_2.b));
            int v2_1 = v0_2.b;
            i7.h.Y(v0_2.a, p9, p8, v2_1, (v2_1 + v10_1));
            x8.c0 v8_2 = (v0_2.b + v10_1);
            v0_2.b = v8_2;
            this.b = (this.b - ((long) v10_1));
            if (v8_2 == v0_2.c) {
                this.a = v0_2.a();
                x8.d0.a(v0_2);
            }
            return v10_1;
        } else {
            return -1;
        }
    }

    public final byte readByte()
    {
        if (this.b == 0) {
            throw new java.io.EOFException();
        } else {
            java.io.EOFException v0_4 = this.a;
            kotlin.jvm.internal.j.b(v0_4);
            byte v1_1 = v0_4.b;
            x8.c0 v2_1 = v0_4.c;
            int v4 = (v1_1 + 1);
            byte v1_0 = v0_4.a[v1_1];
            this.b = (this.b - 1);
            if (v4 != v2_1) {
                v0_4.b = v4;
                return v1_0;
            } else {
                this.a = v0_4.a();
                x8.d0.a(v0_4);
                return v1_0;
            }
        }
    }

    public final int readInt()
    {
        if (this.b < 4) {
            throw new java.io.EOFException();
        } else {
            int v0_10 = this.a;
            kotlin.jvm.internal.j.b(v0_10);
            x8.c0 v1_10 = v0_10.b;
            int v4 = v0_10.c;
            if (((long) (v4 - v1_10)) >= 4) {
                int v5_3 = v0_10.a;
                x8.c0 v1_0 = (v1_10 + 4);
                int v5_6 = ((v5_3[(v1_10 + 3)] & 255) | ((((v5_3[(v1_10 + 1)] & 255) << 16) | ((v5_3[v1_10] & 255) << 24)) | ((v5_3[(v1_10 + 2)] & 255) << 8)));
                this.b = (this.b - 4);
                if (v1_0 != v4) {
                    v0_10.b = v1_0;
                    return v5_6;
                } else {
                    this.a = v0_10.a();
                    x8.d0.a(v0_10);
                    return v5_6;
                }
            } else {
                return (((((this.readByte() & 255) << 24) | ((this.readByte() & 255) << 16)) | ((this.readByte() & 255) << 8)) | (this.readByte() & 255));
            }
        }
    }

    public final short readShort()
    {
        if (this.b < 2) {
            throw new java.io.EOFException();
        } else {
            short v0_10 = this.a;
            kotlin.jvm.internal.j.b(v0_10);
            x8.c0 v1_4 = v0_10.b;
            int v4 = v0_10.c;
            if ((v4 - v1_4) >= 2) {
                int v5_1 = v0_10.a;
                x8.c0 v1_0 = (v1_4 + 2);
                int v5_4 = ((v5_1[(v1_4 + 1)] & 255) | ((v5_1[v1_4] & 255) << 8));
                this.b = (this.b - 2);
                if (v1_0 != v4) {
                    v0_10.b = v1_0;
                } else {
                    this.a = v0_10.a();
                    x8.d0.a(v0_10);
                }
                return ((short) v5_4);
            } else {
                return ((short) (((this.readByte() & 255) << 8) | (this.readByte() & 255)));
            }
        }
    }

    public final boolean request(long p3)
    {
        if (this.b < p3) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void s()
    {
        this.skip(this.b);
        return;
    }

    public final void skip(long p7)
    {
        while (p7 > 0) {
            x8.c0 v0_2 = this.a;
            if (v0_2 == null) {
                throw new java.io.EOFException();
            } else {
                x8.c0 v1_3 = ((int) Math.min(p7, ((long) (v0_2.c - v0_2.b))));
                long v4 = ((long) v1_3);
                this.b = (this.b - v4);
                p7 -= v4;
                int v2_4 = (v0_2.b + v1_3);
                v0_2.b = v2_4;
                if (v2_4 == v0_2.c) {
                    this.a = v0_2.a();
                    x8.d0.a(v0_2);
                }
            }
        }
        return;
    }

    public final long t(x8.g p5, long p6)
    {
        kotlin.jvm.internal.j.e(p5, "sink");
        if (p6 < 0) {
            throw new IllegalArgumentException(v1.a.g(p6, "byteCount < 0: ").toString());
        } else {
            long v2_0 = this.b;
            if (v2_0 != 0) {
                if (p6 > v2_0) {
                    p6 = v2_0;
                }
                p5.k(this, p6);
                return p6;
            } else {
                return -1;
            }
        }
    }

    public final String toString()
    {
        String v0_0 = this.b;
        if (v0_0 > 2147483647) {
            String v0_7 = new StringBuilder("size > Int.MAX_VALUE: ");
            v0_7.append(this.b);
            throw new IllegalStateException(v0_7.toString().toString());
        } else {
            return this.I(((int) v0_0)).toString();
        }
    }

    public final long u()
    {
        if (this.b == 0) {
            throw new java.io.EOFException();
        } else {
            NumberFormatException v0_10 = 0;
            String v1_2 = 0;
            long v4_1 = 0;
            do {
                long v6_0 = this.a;
                kotlin.jvm.internal.j.b(v6_0);
                int v8 = v6_0.b;
                int v9 = v6_0.c;
                if (v8 < v9) {
                    int v11_6;
                    long v10_0 = v6_0.a[v8];
                    if ((v10_0 < 48) || (v10_0 > 57)) {
                        if ((v10_0 < 97) || (v10_0 > 102)) {
                            if ((v10_0 < 65) || (v10_0 > 70)) {
                                if (v0_10 == null) {
                                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(x8.b.h(v10_0)));
                                } else {
                                    v1_2 = 1;
                                }
                                if (v8 != v9) {
                                    v6_0.b = v8;
                                } else {
                                    this.a = v6_0.a();
                                    x8.d0.a(v6_0);
                                }
                            } else {
                                v11_6 = (v10_0 - 55);
                            }
                        } else {
                            v11_6 = (v10_0 - 87);
                        }
                    } else {
                        v11_6 = (v10_0 - 48);
                    }
                    if ((-1152921504606846976 & v4_1) != 0) {
                        NumberFormatException v0_7 = new x8.g();
                        v0_7.O(v4_1);
                        v0_7.M(v10_0);
                        throw new NumberFormatException("Number too large: ".concat(v0_7.G()));
                    } else {
                        v4_1 = ((v4_1 << 4) | ((long) v11_6));
                        v8++;
                        v0_10++;
                        while (v8 >= v9) {
                        }
                    }
                }
            } while((v1_2 == null) && (this.a != null));
            this.b = (this.b - ((long) v0_10));
            return v4_1;
        }
    }

    public final String v(java.nio.charset.Charset p3)
    {
        kotlin.jvm.internal.j.e(p3, "charset");
        return this.F(this.b, p3);
    }

    public final java.io.InputStream w()
    {
        return new x8.f(this, 0);
    }

    public final int write(java.nio.ByteBuffer p7)
    {
        kotlin.jvm.internal.j.e(p7, "source");
        int v0_1 = p7.remaining();
        long v1_0 = v0_1;
        while (v1_0 > 0) {
            x8.c0 v2_1 = this.J(1);
            long v3_2 = Math.min(v1_0, (8192 - v2_1.c));
            p7.get(v2_1.a, v2_1.c, v3_2);
            v1_0 -= v3_2;
            v2_1.c = (v2_1.c + v3_2);
        }
        this.b = (this.b + ((long) v0_1));
        return v0_1;
    }

    public final x8.h write(byte[] p3)
    {
        kotlin.jvm.internal.j.e(p3, "source");
        this.write(p3, 0, p3.length);
        return this;
    }

    public final void write(byte[] p8, int p9, int p10)
    {
        kotlin.jvm.internal.j.e(p8, "source");
        x8.b.e(((long) p8.length), ((long) p9), ((long) p10));
        int v10_1 = (p10 + p9);
        while (p9 < v10_1) {
            x8.c0 v0_2 = this.J(1);
            int v1_1 = Math.min((v10_1 - p9), (8192 - v0_2.c));
            int v4 = (p9 + v1_1);
            i7.h.Y(p8, v0_2.c, v0_2.a, p9, v4);
            v0_2.c = (v0_2.c + v1_1);
            p9 = v4;
        }
        this.b = (this.b + ((long) p10));
        return;
    }

    public final bridge synthetic x8.h writeByte(int p1)
    {
        this.M(p1);
        return this;
    }

    public final bridge synthetic x8.h writeInt(int p1)
    {
        this.P(p1);
        return this;
    }

    public final bridge synthetic x8.h writeShort(int p1)
    {
        this.Q(p1);
        return this;
    }

    public final x8.g x()
    {
        x8.g v0_1 = new x8.g();
        if (this.b != 0) {
            long v1_3 = this.a;
            kotlin.jvm.internal.j.b(v1_3);
            x8.c0 v2 = v1_3.c();
            v0_1.a = v2;
            v2.g = v2;
            v2.f = v2;
            x8.c0 v3_0 = v1_3.f;
            while (v3_0 != v1_3) {
                x8.c0 v4 = v2.g;
                kotlin.jvm.internal.j.b(v4);
                kotlin.jvm.internal.j.b(v3_0);
                v4.b(v3_0.c());
                v3_0 = v3_0.f;
            }
            v0_1.b = this.b;
            return v0_1;
        } else {
            return v0_1;
        }
    }

    public final long y()
    {
        long v0 = this.b;
        if (v0 != 0) {
            long v2_3 = this.a;
            kotlin.jvm.internal.j.b(v2_3);
            long v2_4 = v2_3.g;
            kotlin.jvm.internal.j.b(v2_4);
            int v3_1 = v2_4.c;
            if ((v3_1 < 8192) && (v2_4.e)) {
                v0 -= ((long) (v3_1 - v2_4.b));
            }
            return v0;
        } else {
            return 0;
        }
    }

    public final void z(x8.g p8, long p9, long p11)
    {
        kotlin.jvm.internal.j.e(p8, "out");
        long v3_1 = p9;
        x8.b.e(this.b, p9, p11);
        if (p11 != 0) {
            p8.b = (p8.b + p11);
            long v11_2 = this.a;
            while(true) {
                kotlin.jvm.internal.j.b(v11_2);
                x8.c0 v0_2 = ((long) (v11_2.c - v11_2.b));
                if (v3_1 < v0_2) {
                    break;
                }
                v3_1 -= v0_2;
                v11_2 = v11_2.f;
            }
            x8.c0 v0_3 = v11_2;
            long v11_3 = p11;
            while (v11_3 > 0) {
                kotlin.jvm.internal.j.b(v0_3);
                long v1_2 = v0_3.c();
                int v2_1 = (v1_2.b + ((int) v3_1));
                v1_2.b = v2_1;
                v1_2.c = Math.min((v2_1 + ((int) v11_3)), v1_2.c);
                int v2_4 = p8.a;
                if (v2_4 != 0) {
                    int v2_5 = v2_4.g;
                    kotlin.jvm.internal.j.b(v2_5);
                    v2_5.b(v1_2);
                } else {
                    v1_2.g = v1_2;
                    v1_2.f = v1_2;
                    p8.a = v1_2;
                }
                v11_3 -= ((long) (v1_2.c - v1_2.b));
                v0_3 = v0_3.f;
                v3_1 = 0;
            }
        }
        return;
    }
}
