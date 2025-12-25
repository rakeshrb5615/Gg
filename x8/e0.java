package x8;
public final class e0 extends x8.j {
    public final transient byte[][] e;
    public final transient int[] f;

    public e0(byte[][] p2, int[] p3)
    {
        super(x8.j.d.a);
        super.e = p2;
        super.f = p3;
        return;
    }

    public final String a()
    {
        throw 0;
    }

    public final x8.j c(String p8)
    {
        byte[] v8_1 = java.security.MessageDigest.getInstance(p8);
        x8.j v0_1 = this.e;
        int v1 = v0_1.length;
        int v2 = 0;
        int v3_1 = 0;
        while (v2 < v1) {
            int v5_0 = this.f;
            int v5_1 = v5_0[v2];
            v8_1.update(v0_1[v2], v5_0[(v1 + v2)], (v5_1 - v3_1));
            v2++;
            v3_1 = v5_1;
        }
        byte[] v8_2 = v8_1.digest();
        kotlin.jvm.internal.j.b(v8_2);
        return new x8.j(v8_2);
    }

    public final int d()
    {
        return this.f[(this.e.length - 1)];
    }

    public final String e()
    {
        return this.u().e();
    }

    public final boolean equals(Object p4)
    {
        if ((p4 != this) && ((!(p4 instanceof x8.j)) || ((((x8.j) p4).d() != this.d()) || (!this.l(0, ((x8.j) p4), this.d()))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int f(int p2, byte[] p3)
    {
        kotlin.jvm.internal.j.e(p3, "other");
        return this.u().f(p2, p3);
    }

    public final byte[] h()
    {
        return this.t();
    }

    public final int hashCode()
    {
        byte[][] v0_0 = this.b;
        if (v0_0 == null) {
            byte[][] v0_1 = this.e;
            int v1 = v0_1.length;
            int v2 = 0;
            int v4_1 = 1;
            int v3_2 = 0;
            while (v2 < v1) {
                int v6_0 = this.f;
                int v5_1 = v6_0[(v1 + v2)];
                int v6_1 = v6_0[v2];
                int v3_1 = ((v6_1 - v3_2) + v5_1);
                while (v5_1 < v3_1) {
                    v4_1 = ((v4_1 * 31) + v0_1[v2][v5_1]);
                    v5_1++;
                }
                v2++;
                v3_2 = v6_1;
            }
            this.b = v4_1;
            return v4_1;
        } else {
            return v0_0;
        }
    }

    public final byte i(int p10)
    {
        int v3_1;
        byte[] v0_0 = this.e;
        int v2_1 = this.f;
        x8.b.e(((long) v2_1[(v0_0.length - 1)]), ((long) p10), 1);
        int v1_1 = y8.b.g(this, p10);
        if (v1_1 != 0) {
            v3_1 = v2_1[(v1_1 - 1)];
        } else {
            v3_1 = 0;
        }
        return v0_0[v1_1][((p10 - v3_1) + v2_1[(v0_0.length + v1_1)])];
    }

    public final int j(byte[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "other");
        return this.u().j(p2);
    }

    public final boolean l(int p9, x8.j p10, int p11)
    {
        kotlin.jvm.internal.j.e(p10, "other");
        if ((p9 >= 0) && (p9 <= (this.d() - p11))) {
            int v11_1 = (p11 + p9);
            int v1_0 = y8.b.g(this, p9);
            int v2 = 0;
            while (p9 < v11_1) {
                int v4_1;
                boolean v3_0 = this.f;
                if (v1_0 != 0) {
                    v4_1 = v3_0[(v1_0 - 1)];
                } else {
                    v4_1 = 0;
                }
                byte[][] v6 = this.e;
                boolean v3_1 = v3_0[(v6.length + v1_0)];
                int v5_4 = (Math.min(v11_1, ((v3_0[v1_0] - v4_1) + v4_1)) - p9);
                if (p10.m(v2, v6[v1_0], ((p9 - v4_1) + v3_1), v5_4)) {
                    v2 += v5_4;
                    p9 += v5_4;
                    v1_0++;
                }
            }
            return 1;
        }
        return 0;
    }

    public final boolean m(int p8, byte[] p9, int p10, int p11)
    {
        kotlin.jvm.internal.j.e(p9, "other");
        if ((p8 >= 0) && ((p8 <= (this.d() - p11)) && ((p10 >= 0) && (p10 <= (p9.length - p11))))) {
            int v11_1 = (p11 + p8);
            int v1_1 = y8.b.g(this, p8);
            while (p8 < v11_1) {
                int v3_1;
                boolean v2_0 = this.f;
                if (v1_1 != 0) {
                    v3_1 = v2_0[(v1_1 - 1)];
                } else {
                    v3_1 = 0;
                }
                byte[][] v5 = this.e;
                boolean v2_1 = v2_0[(v5.length + v1_1)];
                int v4_4 = (Math.min(v11_1, ((v2_0[v1_1] - v3_1) + v3_1)) - p8);
                if (x8.b.a(v5[v1_1], ((p8 - v3_1) + v2_1), p9, p10, v4_4)) {
                    p10 += v4_4;
                    p8 += v4_4;
                    v1_1++;
                } else {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final String n(java.nio.charset.Charset p2)
    {
        kotlin.jvm.internal.j.e(p2, "charset");
        return this.u().n(p2);
    }

    public final x8.j o(int p12, int p13)
    {
        if (p13 == -1234567890) {
            p13 = this.d();
        }
        if (p12 < null) {
            throw new IllegalArgumentException(v1.a.j("beginIndex=", p12, " < 0").toString());
        } else {
            if (p13 > this.d()) {
                x8.e0 v12_3 = v1.a.p("endIndex=", p13, " > length(");
                v12_3.append(this.d());
                v12_3.append(41);
                throw new IllegalArgumentException(v12_3.toString().toString());
            } else {
                int v0_2 = (p13 - p12);
                if (v0_2 < 0) {
                    throw new IllegalArgumentException(v1.a.i("endIndex=", p13, p12, " < beginIndex=").toString());
                } else {
                    if ((p12 != null) || (p13 != this.d())) {
                        if (p12 != p13) {
                            int v1_2 = y8.b.g(this, p12);
                            int v13_10 = y8.b.g(this, (p13 - 1));
                            byte[][] v3 = this.e;
                            byte[][] v2_2 = ((byte[][]) i7.h.c0(v3, v1_2, (v13_10 + 1)));
                            int[] v4_2 = new int[(v2_2.length * 2)];
                            int v5 = 0;
                            int[] v6 = this.f;
                            if (v1_2 <= v13_10) {
                                int v8 = v1_2;
                                int v7_0 = 0;
                                while(true) {
                                    v4_2[v7_0] = Math.min((v6[v8] - p12), v0_2);
                                    int v9_3 = (v7_0 + 1);
                                    v4_2[(v7_0 + v2_2.length)] = v6[(v3.length + v8)];
                                    if (v8 == v13_10) {
                                        break;
                                    }
                                    v8++;
                                    v7_0 = v9_3;
                                }
                            }
                            if (v1_2 != 0) {
                                v5 = v6[(v1_2 - 1)];
                            }
                            int v13_11 = v2_2.length;
                            v4_2[v13_11] = ((p12 - v5) + v4_2[v13_11]);
                            return new x8.e0(v2_2, v4_2);
                        } else {
                            return x8.j.d;
                        }
                    } else {
                        return this;
                    }
                }
            }
        }
    }

    public final x8.j q()
    {
        return this.u().q();
    }

    public final void s(x8.g p14, int p15)
    {
        int v1 = y8.b.g(this, 0);
        int v2_0 = 0;
        while (v2_0 < p15) {
            int v4_1;
            x8.c0 v3_0 = this.f;
            if (v1 != 0) {
                v4_1 = v3_0[(v1 - 1)];
            } else {
                v4_1 = 0;
            }
            byte[][] v6 = this.e;
            x8.c0 v3_1 = v3_0[(v6.length + v1)];
            int v5_4 = (Math.min(p15, ((v3_0[v1] - v4_1) + v4_1)) - v2_0);
            int v9 = ((v2_0 - v4_1) + v3_1);
            x8.c0 v7_3 = new x8.c0(v6[v1], v9, (v9 + v5_4), 1, 0);
            x8.c0 v3_2 = p14.a;
            if (v3_2 != null) {
                x8.c0 v3_3 = v3_2.g;
                kotlin.jvm.internal.j.b(v3_3);
                v3_3.b(v7_3);
            } else {
                v7_3.g = v7_3;
                v7_3.f = v7_3;
                p14.a = v7_3;
            }
            v2_0 += v5_4;
            v1++;
        }
        p14.b = (p14.b + ((long) p15));
        return;
    }

    public final byte[] t()
    {
        byte[] v0_1 = new byte[this.d()];
        byte[][] v1 = this.e;
        int v2 = v1.length;
        int v3 = 0;
        int v4_1 = 0;
        int v5 = 0;
        while (v3 < v2) {
            int v7_0 = this.f;
            int v6_1 = v7_0[(v2 + v3)];
            int v7_1 = v7_0[v3];
            int v4_0 = (v7_1 - v4_1);
            i7.h.Y(v1[v3], v5, v0_1, v6_1, (v6_1 + v4_0));
            v5 += v4_0;
            v3++;
            v4_1 = v7_1;
        }
        return v0_1;
    }

    public final String toString()
    {
        return this.u().toString();
    }

    public final x8.j u()
    {
        return new x8.j(this.t());
    }
}
