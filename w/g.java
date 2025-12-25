package w;
public final class g extends w.i {
    public int A0;
    public x.b B0;
    public z.f C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public java.util.ArrayList W0;
    public w.d[] X0;
    public w.d[] Y0;
    public int[] Z0;
    public w.d[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    public final void S()
    {
        int v0 = 0;
        while (v0 < this.r0) {
            w.d v1_2 = this.q0[v0];
            if (v1_2 != null) {
                v1_2.F = 1;
            }
            v0++;
        }
        return;
    }

    public final int T(w.d p11, int p12)
    {
        if (p11 != 0) {
            int v9_0;
            int[] v1 = p11.p0;
            if (v1[1] != 3) {
                v9_0 = p11;
            } else {
                float v3_3 = p11.s;
                if (v3_3 != 0) {
                    if (v3_3 != 2) {
                        v9_0 = p11;
                        if (v3_3 != 1) {
                            if (v3_3 == 3) {
                                return ((int) ((((float) p11.q()) * p11.W) + 1056964608));
                            }
                        } else {
                            return p11.k();
                        }
                    } else {
                        int v8 = ((int) (p11.z * ((float) p12)));
                        if (v8 != p11.k()) {
                            p11.g = 1;
                            this.V(v1[0], p11.q(), 1, v8, p11);
                        }
                        return v8;
                    }
                } else {
                    return 0;
                }
            }
            return v9_0.k();
        }
        return 0;
    }

    public final int U(w.d p12, int p13)
    {
        if (p12 != 0) {
            int v10_0;
            int[] v1 = p12.p0;
            if (v1[0] != 3) {
                v10_0 = p12;
            } else {
                int v2_1 = p12.r;
                if (v2_1 != 0) {
                    if (v2_1 != 2) {
                        v10_0 = p12;
                        if (v2_1 != 1) {
                            if (v2_1 == 3) {
                                return ((int) ((((float) p12.k()) * p12.W) + 1056964608));
                            }
                        } else {
                            return p12.q();
                        }
                    } else {
                        int v7 = ((int) (p12.w * ((float) p13)));
                        if (v7 != p12.q()) {
                            p12.g = 1;
                            this.V(1, v7, v1[1], p12.k(), p12);
                        }
                        return v7;
                    }
                } else {
                    return 0;
                }
            }
            return v10_0.q();
        }
        return 0;
    }

    public final void V(int p4, int p5, int p6, int p7, w.d p8)
    {
        x.b v0 = this.B0;
        while(true) {
            z.f v1_0 = this.C0;
            if (v1_0 != null) {
                break;
            }
            w.e v2_1 = this.T;
            if (v2_1 == null) {
                break;
            }
            this.C0 = ((w.e) v2_1).u0;
        }
        v0.a = p4;
        v0.b = p6;
        v0.c = p5;
        v0.d = p7;
        v1_0.b(p8, v0);
        p8.O(v0.e);
        p8.L(v0.f);
        p8.E = v0.h;
        p8.I(v0.g);
        return;
    }

    public final void b(u.c p12, boolean p13)
    {
        int v12_1;
        int v0_0 = this.W0;
        super.b(p12, p13);
        int v12_3 = this.T;
        if ((v12_3 == 0) || (!((w.e) v12_3).v0)) {
            v12_1 = 0;
        } else {
            v12_1 = 1;
        }
        int v2_0 = this.T0;
        if (v2_0 == 0) {
            if (v0_0.size() > 0) {
                ((w.f) v0_0.get(0)).b(0, v12_1, 1);
            }
        } else {
            if (v2_0 == 1) {
                int v2_5 = v0_0.size();
                int v3_6 = 0;
                while (v3_6 < v2_5) {
                    w.c v5_4;
                    w.d v4_3 = v0_0.get(v3_6);
                    if (v3_6 != (v2_5 - 1)) {
                        v5_4 = 0;
                    } else {
                        v5_4 = 1;
                    }
                    ((w.f) v4_3).b(v3_6, v12_1, v5_4);
                    v3_6++;
                }
            } else {
                if (v2_0 == 2) {
                    if ((this.Z0 != null) && ((this.Y0 != null) && (this.X0 != null))) {
                        int v0_1 = 0;
                        while (v0_1 < this.b1) {
                            this.a1[v0_1].D();
                            v0_1++;
                        }
                        int v0_7 = this.Z0;
                        int v2_7 = v0_7[0];
                        int v0_8 = v0_7[1];
                        int v3_3 = this.J0;
                        w.d v4_0 = 0;
                        w.c v5_0 = 0;
                        while (v5_0 < v2_7) {
                            w.c v7_5;
                            int v3_0;
                            if (v12_1 == 0) {
                                v7_5 = v3_3;
                                v3_0 = v5_0;
                            } else {
                                v3_0 = ((v2_7 - v5_0) - 1);
                                v7_5 = (1065353216 - this.J0);
                            }
                            int v3_2 = this.Y0[v3_0];
                            if (v3_2 != 0) {
                                w.c v8_5 = v3_2.I;
                                if (v3_2.g0 != 8) {
                                    if (v5_0 == null) {
                                        v3_2.f(v8_5, this.I, this.w0);
                                        v3_2.i0 = this.D0;
                                        v3_2.d0 = v7_5;
                                    }
                                    if (v5_0 == (v2_7 - 1)) {
                                        v3_2.f(v3_2.K, this.K, this.x0);
                                    }
                                    if ((v5_0 > null) && (v4_0 != null)) {
                                        w.c v6_4 = v4_0.K;
                                        v3_2.f(v8_5, v6_4, this.P0);
                                        v4_0.f(v6_4, v8_5, 0);
                                    }
                                    v4_0 = v3_2;
                                }
                            }
                            v5_0++;
                            v3_3 = v7_5;
                        }
                        int v12_2 = 0;
                        while (v12_2 < v0_8) {
                            int v3_10 = this.X0[v12_2];
                            if (v3_10 != 0) {
                                w.c v5_13 = v3_10.J;
                                if (v3_10.g0 != 8) {
                                    if (v12_2 == 0) {
                                        v3_10.f(v5_13, this.J, this.s0);
                                        v3_10.j0 = this.E0;
                                        v3_10.e0 = this.K0;
                                    }
                                    if (v12_2 == (v0_8 - 1)) {
                                        v3_10.f(v3_10.L, this.L, this.t0);
                                    }
                                    if ((v12_2 > 0) && (v4_0 != null)) {
                                        w.c v7_4 = v4_0.L;
                                        v3_10.f(v5_13, v7_4, this.Q0);
                                        v4_0.f(v7_4, v5_13, 0);
                                    }
                                    v4_0 = v3_10;
                                }
                            }
                            v12_2++;
                        }
                        int v12_4 = 0;
                        while (v12_4 < v2_7) {
                            int v3_8 = 0;
                            while (v3_8 < v0_8) {
                                w.d v4_6 = ((v3_8 * v2_7) + v12_4);
                                if (this.V0 == 1) {
                                    v4_6 = ((v12_4 * v0_8) + v3_8);
                                }
                                w.c v5_6 = this.a1;
                                if (v4_6 < v5_6.length) {
                                    w.d v4_8 = v5_6[v4_6];
                                    if ((v4_8 != null) && (v4_8.g0 != 8)) {
                                        w.c v5_9 = this.Y0[v12_4];
                                        w.c v7_9 = this.X0[v3_8];
                                        if (v4_8 != v5_9) {
                                            v4_8.f(v4_8.I, v5_9.I, 0);
                                            v4_8.f(v4_8.K, v5_9.K, 0);
                                        }
                                        if (v4_8 != v7_9) {
                                            v4_8.f(v4_8.J, v7_9.J, 0);
                                            v4_8.f(v4_8.L, v7_9.L, 0);
                                        }
                                    }
                                }
                                v3_8++;
                            }
                            v12_4++;
                        }
                    }
                } else {
                    if (v2_0 == 3) {
                        int v2_4 = v0_0.size();
                        int v3_5 = 0;
                        while (v3_5 < v2_4) {
                            w.c v5_2;
                            w.d v4_1 = v0_0.get(v3_5);
                            if (v3_5 != (v2_4 - 1)) {
                                v5_2 = 0;
                            } else {
                                v5_2 = 1;
                            }
                            ((w.f) v4_1).b(v3_5, v12_1, v5_2);
                            v3_5++;
                        }
                    }
                }
            }
        }
        this.y0 = 0;
        return;
    }
}
