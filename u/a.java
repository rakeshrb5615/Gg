package u;
public final class a {
    public int a;
    public final u.b b;
    public final b8.g c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;

    public a(u.b p4, b8.g p5)
    {
        this.a = 0;
        this.d = 8;
        int[] v2_0 = new int[8];
        this.e = v2_0;
        int[] v2_1 = new int[8];
        this.f = v2_1;
        int v1_2 = new float[8];
        this.g = v1_2;
        this.h = -1;
        this.i = -1;
        this.j = 0;
        this.b = p4;
        this.c = p5;
        return;
    }

    public final void a(u.f p12, float p13, boolean p14)
    {
        if ((p13 <= -1165815185) || (p13 >= 981668463)) {
            int v1_1 = this.h;
            u.b v3 = this.b;
            if (v1_1 != -1) {
                int v7 = 0;
                int v8 = -1;
                while ((v1_1 != -1) && (v7 < this.a)) {
                    int[] v9_3 = this.e[v1_1];
                    int v10 = p12.b;
                    if (v9_3 != v10) {
                        if (v9_3 < v10) {
                            v8 = v1_1;
                        }
                        v1_1 = this.f[v1_1];
                        v7++;
                    } else {
                        float[] v4_0 = this.g;
                        int[] v5_1 = (v4_0[v1_1] + p13);
                        if ((v5_1 > -1165815185) && (v5_1 < 981668463)) {
                            v5_1 = 0;
                        }
                        v4_0[v1_1] = v5_1;
                        if (v5_1 == 0) {
                            if (v1_1 != this.h) {
                                int v13_5 = this.f;
                                v13_5[v8] = v13_5[v1_1];
                            } else {
                                this.h = this.f[v1_1];
                            }
                            if (p14 != 0) {
                                p12.b(v3);
                            }
                            if (this.j) {
                                this.i = v1_1;
                            }
                            p12.q = (p12.q - 1);
                            this.a = (this.a - 1);
                            return;
                        }
                    }
                }
                int v14_4 = this.i;
                if (!this.j) {
                    v14_4++;
                } else {
                    int v0_4 = this.e;
                    if (v0_4[v14_4] != -1) {
                        v14_4 = v0_4.length;
                    }
                }
                int v0_5 = this.e;
                if ((v14_4 >= v0_5.length) && (this.a < v0_5.length)) {
                    int v0_7 = 0;
                    while(true) {
                        int v1_6 = this.e;
                        if (v0_7 < v1_6.length) {
                            if (v1_6[v0_7] == -1) {
                                break;
                            }
                            v0_7++;
                        }
                    }
                    v14_4 = v0_7;
                }
                int v0_8 = this.e;
                if (v14_4 >= v0_8.length) {
                    v14_4 = v0_8.length;
                    int v0_10 = (this.d * 2);
                    this.d = v0_10;
                    this.j = 0;
                    this.i = (v14_4 - 1);
                    this.g = java.util.Arrays.copyOf(this.g, v0_10);
                    this.e = java.util.Arrays.copyOf(this.e, this.d);
                    this.f = java.util.Arrays.copyOf(this.f, this.d);
                }
                this.e[v14_4] = p12.b;
                this.g[v14_4] = p13;
                if (v8 == -1) {
                    this.f[v14_4] = this.h;
                    this.h = v14_4;
                } else {
                    int v13_17 = this.f;
                    v13_17[v14_4] = v13_17[v8];
                    v13_17[v8] = v14_4;
                }
                p12.q = (p12.q + 1);
                p12.a(v3);
                this.a = (this.a + 1);
                if (!this.j) {
                    this.i = (this.i + 1);
                }
                int v13_20 = this.e;
                if (this.i >= v13_20.length) {
                    this.j = 1;
                    this.i = (v13_20.length - 1);
                }
            } else {
                this.h = 0;
                this.g[0] = p13;
                this.e[0] = p12.b;
                this.f[0] = -1;
                p12.q = (p12.q + 1);
                p12.a(v3);
                this.a = (this.a + 1);
                if (!this.j) {
                    int v12_7 = (this.i + 1);
                    this.i = v12_7;
                    int v13_15 = this.e;
                    if (v12_7 >= v13_15.length) {
                        this.j = 1;
                        this.i = (v13_15.length - 1);
                        return;
                    }
                }
            }
        }
        return;
    }

    public final void b()
    {
        int v0 = this.h;
        int v2 = 0;
        while ((v0 != -1) && (v2 < this.a)) {
            int[] v3_3 = ((u.f[]) this.c.d)[this.e[v0]];
            if (v3_3 != null) {
                v3_3.b(this.b);
            }
            v0 = this.f[v0];
            v2++;
        }
        this.h = -1;
        this.i = -1;
        this.j = 0;
        this.a = 0;
        return;
    }

    public final float c(u.f p5)
    {
        int v0 = this.h;
        int v1 = 0;
        while ((v0 != -1) && (v1 < this.a)) {
            if (this.e[v0] != p5.b) {
                v0 = this.f[v0];
                v1++;
            } else {
                return this.g[v0];
            }
        }
        return 0;
    }

    public final int d()
    {
        return this.a;
    }

    public final u.f e(int p4)
    {
        int v0_0 = this.h;
        int v1_0 = 0;
        while ((v0_0 != -1) && (v1_0 < this.a)) {
            if (v1_0 != p4) {
                v0_0 = this.f[v0_0];
                v1_0++;
            } else {
                return ((u.f[]) this.c.d)[this.e[v0_0]];
            }
        }
        return 0;
    }

    public final float f(int p4)
    {
        int v0 = this.h;
        int v1 = 0;
        while ((v0 != -1) && (v1 < this.a)) {
            if (v1 != p4) {
                v0 = this.f[v0];
                v1++;
            } else {
                return this.g[v0];
            }
        }
        return 0;
    }

    public final void g(u.f p10, float p11)
    {
        if (p11 != 0) {
            int v0_2 = this.h;
            u.b v2 = this.b;
            if (v0_2 != -1) {
                int v5_0 = 0;
                int v6 = -1;
                while ((v0_2 != -1) && (v5_0 < this.a)) {
                    int v7_10 = this.e[v0_2];
                    int v8_0 = p10.b;
                    if (v7_10 != v8_0) {
                        if (v7_10 < v8_0) {
                            v6 = v0_2;
                        }
                        v0_2 = this.f[v0_2];
                        v5_0++;
                    } else {
                        this.g[v0_2] = p11;
                        return;
                    }
                }
                int v0_6 = this.i;
                if (!this.j) {
                    v0_6++;
                } else {
                    int v5_2 = this.e;
                    if (v5_2[v0_6] != -1) {
                        v0_6 = v5_2.length;
                    }
                }
                int v5_3 = this.e;
                if ((v0_6 >= v5_3.length) && (this.a < v5_3.length)) {
                    int v5_5 = 0;
                    while(true) {
                        int v7_6 = this.e;
                        if (v5_5 < v7_6.length) {
                            if (v7_6[v5_5] == -1) {
                                break;
                            }
                            v5_5++;
                        }
                    }
                    v0_6 = v5_5;
                }
                int v5_6 = this.e;
                if (v0_6 >= v5_6.length) {
                    v0_6 = v5_6.length;
                    int v5_8 = (this.d * 2);
                    this.d = v5_8;
                    this.j = 0;
                    this.i = (v0_6 - 1);
                    this.g = java.util.Arrays.copyOf(this.g, v5_8);
                    this.e = java.util.Arrays.copyOf(this.e, this.d);
                    this.f = java.util.Arrays.copyOf(this.f, this.d);
                }
                this.e[v0_6] = p10.b;
                this.g[v0_6] = p11;
                if (v6 == -1) {
                    this.f[v0_6] = this.h;
                    this.h = v0_6;
                } else {
                    int[] v11_7 = this.f;
                    v11_7[v0_6] = v11_7[v6];
                    v11_7[v6] = v0_6;
                }
                p10.q = (p10.q + 1);
                p10.a(v2);
                int v10_10 = (this.a + 1);
                this.a = v10_10;
                if (!this.j) {
                    this.i = (this.i + 1);
                }
                int[] v11_13 = this.e;
                if (v10_10 >= v11_13.length) {
                    this.j = 1;
                }
                if (this.i >= v11_13.length) {
                    this.j = 1;
                    this.i = (v11_13.length - 1);
                }
            } else {
                this.h = 0;
                this.g[0] = p11;
                this.e[0] = p10.b;
                this.f[0] = -1;
                p10.q = (p10.q + 1);
                p10.a(v2);
                this.a = (this.a + 1);
                if (!this.j) {
                    int v10_6 = (this.i + 1);
                    this.i = v10_6;
                    int[] v11_5 = this.e;
                    if (v10_6 >= v11_5.length) {
                        this.j = 1;
                        this.i = (v11_5.length - 1);
                        return;
                    }
                }
            }
            return;
        } else {
            this.h(p10, 1);
            return;
        }
    }

    public final float h(u.f p8, boolean p9)
    {
        int v0 = this.h;
        if (v0 != -1) {
            int[] v2_0 = 0;
            int v3_2 = -1;
            while ((v0 != -1) && (v2_0 < this.a)) {
                if (this.e[v0] != p8.b) {
                    v2_0++;
                    v3_2 = v0;
                    v0 = this.f[v0];
                } else {
                    if (v0 != this.h) {
                        int[] v2_2 = this.f;
                        v2_2[v3_2] = v2_2[v0];
                    } else {
                        this.h = this.f[v0];
                    }
                    if (p9 != 0) {
                        p8.b(this.b);
                    }
                    p8.q = (p8.q - 1);
                    this.a = (this.a - 1);
                    this.e[v0] = -1;
                    if (this.j) {
                        this.i = v0;
                    }
                    return this.g[v0];
                }
            }
        }
        return 0;
    }

    public final String toString()
    {
        int v0 = this.h;
        String v1_0 = "";
        int v2 = 0;
        while ((v0 != -1) && (v2 < this.a)) {
            String v1_2 = u.e.b(g2.g.d(v1_0, " -> "));
            v1_2.append(this.g[v0]);
            v1_2.append(" : ");
            String v1_4 = u.e.b(v1_2.toString());
            v1_4.append(((u.f[]) this.c.d)[this.e[v0]]);
            v1_0 = v1_4.toString();
            v0 = this.f[v0];
            v2++;
        }
        return v1_0;
    }
}
