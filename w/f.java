package w;
public final class f {
    public int a;
    public w.d b;
    public int c;
    public w.c d;
    public w.c e;
    public w.c f;
    public w.c g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final synthetic w.g r;

    public f(w.g p2, int p3, w.c p4, w.c p5, w.c p6, w.c p7, int p8)
    {
        this.r = p2;
        this.b = 0;
        this.c = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.a = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p2.w0;
        this.i = p2.s0;
        this.j = p2.x0;
        this.k = p2.t0;
        this.q = p8;
        return;
    }

    public final void a(w.d p9)
    {
        int v4 = 0;
        int v5_1 = this.r;
        if (this.a != 0) {
            int v0_10 = v5_1.U(p9, this.q);
            int v6_1 = v5_1.T(p9, this.q);
            if (p9.p0[1] == 3) {
                this.p = (this.p + 1);
                v6_1 = 0;
            }
            if (p9.g0 != 8) {
                v4 = v5_1.Q0;
            }
            this.m = ((v6_1 + v4) + this.m);
            if ((this.b == null) || (this.c < v0_10)) {
                this.b = p9;
                this.c = v0_10;
                this.l = v0_10;
            }
        } else {
            int v0_2 = v5_1.U(p9, this.q);
            if (p9.p0[0] == 3) {
                this.p = (this.p + 1);
                v0_2 = 0;
            }
            if (p9.g0 != 8) {
                v4 = v5_1.P0;
            }
            this.l = ((v0_2 + v4) + this.l);
            int v0_8 = v5_1.T(p9, this.q);
            if ((this.b == null) || (this.c < v0_8)) {
                this.b = p9;
                this.c = v0_8;
                this.m = v0_8;
            }
        }
        this.o = (this.o + 1);
        return;
    }

    public final void b(int p23, boolean p24, boolean p25)
    {
        w.f v0 = this;
        w.c v1_0 = this.o;
        w.d v3_0 = 0;
        while(true) {
            w.d v4_2 = this.r;
            if (v3_0 >= v1_0) {
                break;
            }
            w.c v5_19 = (this.n + v3_0);
            if (v5_19 >= v4_2.b1) {
                break;
            }
            w.d v4_1 = v4_2.a1[v5_19];
            if (v4_1 != null) {
                v4_1.D();
            }
            v3_0++;
        }
        if ((v1_0 != null) && (this.b != null)) {
            if ((!p25) || (p23 != 0)) {
                w.c v5_1 = 0;
            } else {
                v5_1 = 1;
            }
            w.d v7_1 = 0;
            int v8 = -1;
            float v9_8 = -1;
            while (v7_1 < v1_0) {
                int v10_9;
                if (!p24) {
                    v10_9 = v7_1;
                } else {
                    v10_9 = ((v1_0 - 1) - v7_1);
                }
                w.c v11_3 = (this.n + v10_9);
                if (v11_3 >= v4_2.b1) {
                    break;
                }
                int v10_13 = v4_2.a1[v11_3];
                if ((v10_13 != 0) && (v10_13.g0 == 0)) {
                    if (v8 == -1) {
                        v8 = v7_1;
                    }
                    v9_8 = v7_1;
                }
                v7_1++;
            }
            if (this.a != 0) {
                w.c v20_0 = v1_0;
                int v18_1 = v5_1;
                int v19_1 = v9_8;
                w.c v1_7 = this.b;
                v1_7.i0 = v4_2.D0;
                int v2_5 = v1_7.I;
                w.d v3_5 = v1_7.K;
                w.c v5_13 = this.h;
                if (p23 > 0) {
                    v5_13 += v4_2.P0;
                }
                if (!p24) {
                    v2_5.a(this.d, v5_13);
                    if (p25) {
                        v3_5.a(this.f, this.j);
                    }
                    if (p23 > 0) {
                        this.d.d.K.a(v2_5, 0);
                    }
                } else {
                    v3_5.a(this.f, v5_13);
                    if (p25) {
                        v2_5.a(this.d, this.j);
                    }
                    if (p23 > 0) {
                        this.f.d.I.a(v3_5, 0);
                    }
                }
                w.c v5_0 = 0;
                int v10_5 = 0;
                while(true) {
                    int v6_20 = v20_0;
                    if (v5_0 >= v6_20) {
                        break;
                    }
                    w.d v7_4 = (this.n + v5_0);
                    if (v7_4 >= v4_2.b1) {
                        break;
                    }
                    w.d v7_5 = v4_2.a1[v7_4];
                    if (v7_5 != null) {
                        float v9_21 = v7_5.J;
                        w.c v11_4 = v7_5.K;
                        w.c v12_1 = v7_5.I;
                        if (v5_0 != null) {
                            v20_0 = v6_20;
                        } else {
                            int v15_1;
                            int v6_0;
                            v7_5.f(v9_21, this.e, this.i);
                            w.d v13_1 = v4_2.E0;
                            boolean v14_1 = v4_2.K0;
                            if (this.n != 0) {
                                v20_0 = v6_20;
                                v6_0 = -1;
                                if (p25) {
                                    v15_1 = v4_2.I0;
                                    if (v15_1 != v6_0) {
                                        v14_1 = v4_2.O0;
                                        v13_1 = v15_1;
                                    }
                                }
                            } else {
                                v15_1 = v4_2.G0;
                                v20_0 = v6_20;
                                v6_0 = -1;
                                if (v15_1 == -1) {
                                } else {
                                    v14_1 = v4_2.M0;
                                }
                            }
                            v7_5.j0 = v13_1;
                            v7_5.e0 = v14_1;
                        }
                        if (v5_0 == (v20_0 - 1)) {
                            v7_5.f(v7_5.L, this.g, this.k);
                        }
                        if (v10_5 != 0) {
                            int v10_0 = v10_5.L;
                            v9_21.a(v10_0, v4_2.Q0);
                            if ((v5_0 == v8) && (v9_21.h())) {
                                v9_21.h = this.i;
                            }
                            v10_0.a(v9_21, 0);
                            if ((v5_0 == (v19_1 + 1)) && (v10_0.h())) {
                                v10_0.h = this.k;
                            }
                        }
                        if (v7_5 == v1_7) {
                            w.d v13 = 1;
                        } else {
                            if (!p24) {
                                int v10_1 = v4_2.R0;
                                if (v10_1 == 0) {
                                    v12_1.a(v2_5, 0);
                                } else {
                                    if (v10_1 == 1) {
                                        v11_4.a(v3_5, 0);
                                    } else {
                                        if (v10_1 == 2) {
                                            if (v18_1 == 0) {
                                                v12_1.a(v2_5, 0);
                                                v11_4.a(v3_5, 0);
                                            } else {
                                                v12_1.a(this.d, this.h);
                                                v11_4.a(v0.f, v0.j);
                                            }
                                        }
                                    }
                                }
                            } else {
                                int v10_4 = v4_2.R0;
                                if (v10_4 == 0) {
                                    v11_4.a(v3_5, 0);
                                } else {
                                    if (v10_4 == 1) {
                                        v12_1.a(v2_5, 0);
                                    } else {
                                        if (v10_4 == 2) {
                                            v12_1.a(v2_5, 0);
                                            v11_4.a(v3_5, 0);
                                        }
                                    }
                                }
                            }
                        }
                        v10_5 = v7_5;
                    } else {
                        v20_0 = v6_20;
                        float v9 = 0;
                    }
                    v5_0++;
                }
            } else {
                w.d v7_0 = this.b;
                v7_0.j0 = v4_2.E0;
                w.c v11_1 = v7_0.L;
                w.c v12_0 = v7_0.J;
                w.d v13_13 = this.i;
                if (p23 > 0) {
                    v13_13 += v4_2.Q0;
                }
                v12_0.a(this.e, v13_13);
                if (p25) {
                    v11_1.a(this.g, this.k);
                }
                if (p23 > 0) {
                    this.e.d.L.a(v12_0, 0);
                }
                if ((v4_2.S0 != 3) || (v7_0.E)) {
                    int v10_8 = v7_0;
                } else {
                    w.d v13_20 = 0;
                    while (v13_20 < v1_0) {
                        int v15_3;
                        if (!p24) {
                            v15_3 = v13_20;
                        } else {
                            v15_3 = ((v1_0 - 1) - v13_20);
                        }
                        int v10_7 = (this.n + v15_3);
                        if (v10_7 >= v4_2.b1) {
                            break;
                        }
                        v10_8 = v4_2.a1[v10_7];
                        if (!v10_8.E) {
                            v13_20++;
                        }
                    }
                }
                int v15_8 = 0;
                w.d v13_21 = 0;
                while (v15_8 < v1_0) {
                    int v16_0;
                    if (!p24) {
                        v16_0 = v15_8;
                    } else {
                        v16_0 = ((v1_0 - 1) - v15_8);
                    }
                    w.d v3_3 = (this.n + v16_0);
                    if (v3_3 >= v4_2.b1) {
                        break;
                    }
                    int v19_0;
                    w.c v20_2;
                    int v18_0;
                    w.d v3_4 = v4_2.a1[v3_3];
                    if (v3_4 != null) {
                        boolean v14_10 = v3_4.L;
                        int v2_1 = v3_4.J;
                        int v6_2 = v3_4.I;
                        v18_0 = v5_1;
                        if (v15_8 != 0) {
                            v19_0 = v9_8;
                        } else {
                            v19_0 = v9_8;
                            v3_4.f(v6_2, this.d, this.h);
                        }
                        if (v16_0 == 0) {
                            int v16_2;
                            float v9_10;
                            if (!p24) {
                                v16_2 = 1065353216;
                                v9_10 = v4_2.J0;
                            } else {
                                v16_2 = 1065353216;
                                v9_10 = (1065353216 - v4_2.J0);
                            }
                            w.c v5_5;
                            float v9_14;
                            int v21;
                            float v9_15;
                            if (this.n != 0) {
                                v21 = v9_10;
                                if (p25) {
                                    v5_5 = v4_2.H0;
                                    if (v5_5 != -1) {
                                        if (!p24) {
                                            v9_14 = v4_2.N0;
                                            v3_4.i0 = v5_5;
                                            v3_4.d0 = v9_14;
                                            if (v15_8 != (v1_0 - 1)) {
                                                v20_2 = v1_0;
                                            } else {
                                                v20_2 = v1_0;
                                                v3_4.f(v3_4.K, this.f, this.j);
                                            }
                                            if (v13_21 != null) {
                                                w.c v1_2 = v13_21.K;
                                                v6_2.a(v1_2, v4_2.P0);
                                                if ((v15_8 == v8) && (v6_2.h())) {
                                                    v6_2.h = this.h;
                                                }
                                                v1_2.a(v6_2, 0);
                                                if ((v15_8 == (v19_0 + 1)) && (v1_2.h())) {
                                                    v1_2.h = this.j;
                                                }
                                            }
                                            if (v3_4 != v7_0) {
                                                w.c v1_3 = v4_2.S0;
                                                if ((v1_3 != 3) || ((!v10_8.E) || ((v3_4 == v10_8) || (!v3_4.E)))) {
                                                    if (v1_3 == null) {
                                                        v2_1.a(v12_0, 0);
                                                    } else {
                                                        if (v1_3 == 1) {
                                                            v14_10.a(v11_1, 0);
                                                        } else {
                                                            if (v18_0 == 0) {
                                                                v2_1.a(v12_0, 0);
                                                                v14_10.a(v11_1, 0);
                                                            } else {
                                                                v2_1.a(this.e, this.i);
                                                                v14_10.a(v0.g, v0.k);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    v3_4.M.a(v10_8.M, 0);
                                                }
                                            }
                                            v13_21 = v3_4;
                                            v15_8++;
                                            v5_1 = v18_0;
                                            v9_8 = v19_0;
                                            v1_0 = v20_2;
                                            int v6 = -1;
                                        } else {
                                            v9_15 = v4_2.N0;
                                            v9_14 = (v16_2 - v9_15);
                                        }
                                    }
                                }
                                v5_5 = v4_2.D0;
                                v9_14 = v21;
                            } else {
                                v5_5 = v4_2.F0;
                                v21 = v9_10;
                                if (v5_5 == -1) {
                                } else {
                                    if (!p24) {
                                        v9_14 = v4_2.L0;
                                    } else {
                                        v9_15 = v4_2.L0;
                                    }
                                }
                            }
                        }
                    } else {
                        v20_2 = v1_0;
                        v18_0 = v5_1;
                        v19_0 = v9_8;
                    }
                }
            }
        }
        return;
    }

    public final int c()
    {
        if (this.a != 1) {
            return this.m;
        } else {
            return (this.m - this.r.Q0);
        }
    }

    public final int d()
    {
        if (this.a != 0) {
            return this.l;
        } else {
            return (this.l - this.r.P0);
        }
    }

    public final void e(int p12)
    {
        int v0_0 = this.p;
        if (v0_0 != 0) {
            int v1_1 = this.o;
            int v4_1 = (p12 / v0_0);
            int v0_1 = 0;
            while(true) {
                w.g v2 = this.r;
                if (v0_1 >= v1_1) {
                    break;
                }
                w.d v3_10 = (this.n + v0_1);
                if (v3_10 >= v2.b1) {
                    break;
                }
                int v7_0 = v2.a1[v3_10];
                if (this.a != 0) {
                    if (v7_0 != 0) {
                        int v5_5 = v7_0.p0;
                        if ((v5_5[1] == 3) && (v7_0.s == 0)) {
                            int v6_2 = v4_1;
                            v2.V(v5_5[0], v7_0.q(), 1, v6_2, v7_0);
                            v4_1 = v6_2;
                        }
                    }
                } else {
                    if (v7_0 != 0) {
                        w.d v3_3 = v7_0.p0;
                        if ((v3_3[0] == 3) && (v7_0.r == 0)) {
                            v2.V(1, v4_1, v3_3[1], v7_0.k(), v7_0);
                        }
                    }
                }
                v0_1++;
            }
            this.l = 0;
            this.m = 0;
            this.b = 0;
            this.c = 0;
            int v0_3 = this.o;
            int v1_0 = 0;
            while (v1_0 < v0_3) {
                w.d v3_7 = (this.n + v1_0);
                if (v3_7 >= v2.b1) {
                    break;
                }
                w.d v3_8 = v2.a1[v3_7];
                if (this.a != 0) {
                    int v4_6 = v2.U(v3_8, this.q);
                    int vtmp3 = v2.T(v3_8, this.q);
                    int v7_1 = v2.Q0;
                    if (v3_8.g0 == 8) {
                        v7_1 = 0;
                    }
                    this.m = ((vtmp3 + v7_1) + this.m);
                    if ((this.b == null) || (this.c < v4_6)) {
                        this.b = v3_8;
                        this.c = v4_6;
                        this.l = v4_6;
                    }
                } else {
                    int v4_7 = v3_8.q();
                    int v6_9 = v2.P0;
                    if (v3_8.g0 == 8) {
                        v6_9 = 0;
                    }
                    this.l = ((v4_7 + v6_9) + this.l);
                    int v4_11 = v2.T(v3_8, this.q);
                    if ((this.b == null) || (this.c < v4_11)) {
                        this.b = v3_8;
                        this.c = v4_11;
                        this.m = v4_11;
                    }
                }
                v1_0++;
            }
        }
        return;
    }

    public final void f(int p1, w.c p2, w.c p3, w.c p4, w.c p5, int p6, int p7, int p8, int p9, int p10)
    {
        this.a = p1;
        this.d = p2;
        this.e = p3;
        this.f = p4;
        this.g = p5;
        this.h = p6;
        this.i = p7;
        this.j = p8;
        this.k = p9;
        this.q = p10;
        return;
    }
}
