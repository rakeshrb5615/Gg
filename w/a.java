package w;
public final class a extends w.i {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    public final boolean A()
    {
        return this.v0;
    }

    public final boolean B()
    {
        return this.v0;
    }

    public final boolean T()
    {
        int v1_0 = 0;
        int v3_0 = 1;
        int v2_0 = 0;
        while(true) {
            int v4_4 = this.r0;
            if (v2_0 >= v4_4) {
                break;
            }
            int v4_14 = this.q0[v2_0];
            if ((this.t0) || (v4_14.c())) {
                int v7_5 = this.s0;
                if (((v7_5 != 0) && (v7_5 != 1)) || (v4_14.A())) {
                    int v7_7 = this.s0;
                    if (((v7_7 != 2) && (v7_7 != 3)) || (v4_14.B())) {
                        v2_0++;
                    }
                }
                v3_0 = 0;
            }
        }
        if ((v3_0 == 0) || (v4_4 <= 0)) {
            return 0;
        } else {
            int v2_1 = 0;
            int v3_1 = 0;
            while (v1_0 < this.r0) {
                int v4_3 = this.q0[v1_0];
                if ((this.t0) || (v4_3.c())) {
                    if (v3_1 == 0) {
                        int v3_2 = this.s0;
                        if (v3_2 != 0) {
                            if (v3_2 != 1) {
                                if (v3_2 != 2) {
                                    if (v3_2 == 3) {
                                        v2_1 = v4_3.i(5).d();
                                    }
                                } else {
                                    v2_1 = v4_3.i(3).d();
                                }
                            } else {
                                v2_1 = v4_3.i(4).d();
                            }
                        } else {
                            v2_1 = v4_3.i(2).d();
                        }
                        v3_1 = 1;
                    }
                    int v9 = this.s0;
                    if (v9 != 0) {
                        if (v9 != 1) {
                            if (v9 != 2) {
                                if (v9 == 3) {
                                    v2_1 = Math.max(v2_1, v4_3.i(5).d());
                                }
                            } else {
                                v2_1 = Math.min(v2_1, v4_3.i(3).d());
                            }
                        } else {
                            v2_1 = Math.max(v2_1, v4_3.i(4).d());
                        }
                    } else {
                        v2_1 = Math.min(v2_1, v4_3.i(2).d());
                    }
                }
                v1_0++;
            }
            int v2_2 = (v2_1 + this.u0);
            int v1_2 = this.s0;
            if ((v1_2 != 0) && (v1_2 != 1)) {
                this.K(v2_2, v2_2);
            } else {
                this.J(v2_2, v2_2);
            }
            this.v0 = 1;
            return 1;
        }
    }

    public final int U()
    {
        int v0_0 = this.s0;
        if ((v0_0 == 0) || (v0_0 == 1)) {
            return 0;
        } else {
            if ((v0_0 == 2) || (v0_0 == 3)) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public final void b(u.c p17, boolean p18)
    {
        u.f v2_12 = this.Q;
        u.f v4_22 = this.I;
        v2_12[0] = v4_22;
        u.f v5_11 = 2;
        int v6_4 = this.J;
        v2_12[2] = v6_4;
        w.c v8 = this.K;
        v2_12[1] = v8;
        w.c v10 = this.L;
        v2_12[3] = v10;
        int v11_0 = 0;
        while (v11_0 < v2_12.length) {
            int v12_7 = v2_12[v11_0];
            v12_7.i = p17.k(v12_7);
            v11_0++;
        }
        int v11_1 = this.s0;
        if ((v11_1 >= 0) && (v11_1 < 4)) {
            u.f v2_13 = v2_12[v11_1];
            if (!this.v0) {
                this.T();
            }
            if (!this.v0) {
                int v11_2 = 0;
                while (v11_2 < this.r0) {
                    int v13_4 = this.q0[v11_2];
                    if ((this.t0) || (v13_4.c())) {
                        u.f v14_8 = this.s0;
                        if ((((v14_8 == null) || (v14_8 == 1)) && ((v13_4.p0[0] == 3) && ((v13_4.I.f != null) && (v13_4.K.f != null)))) || (((v14_8 == 2) || (v14_8 == 3)) && ((v13_4.p0[1] == 3) && ((v13_4.J.f != null) && (v13_4.L.f != null))))) {
                            int v11_5 = 1;
                            if ((!v4_22.g()) && (!v8.g())) {
                                int v13_9 = 0;
                            } else {
                                v13_9 = 1;
                            }
                            if ((!v6_4.g()) && (!v10.g())) {
                                u.f v14_15 = 0;
                            } else {
                                v14_15 = 1;
                            }
                            int v11_7;
                            if (v11_5 != 0) {
                                v11_7 = 0;
                            } else {
                                int v11_6 = this.s0;
                                if (((v11_6 != 0) || (v13_9 == 0)) && (((v11_6 != 2) || (v14_15 == null)) && (((v11_6 != 1) || (v13_9 == 0)) && ((v11_6 != 3) || (v14_15 == null))))) {
                                } else {
                                    v11_7 = 1;
                                }
                            }
                            int v11_8;
                            if (v11_7 != 0) {
                                v11_8 = 5;
                            } else {
                                v11_8 = 4;
                            }
                            int v13_0 = 0;
                            while (v13_0 < this.r0) {
                                u.f v14_1 = this.q0[v13_0];
                                if ((this.t0) || (v14_1.c())) {
                                    int v7_3;
                                    int v9_3 = p17.k(v14_1.Q[this.s0]);
                                    int v15_3 = this.s0;
                                    u.f v14_3 = v14_1.Q[v15_3];
                                    v14_3.i = v9_3;
                                    int v7_1 = v14_3.f;
                                    if ((v7_1 == 0) || (v7_1.d != this)) {
                                        v7_3 = 0;
                                    } else {
                                        v7_3 = v14_3.g;
                                    }
                                    if ((v15_3 != 0) && (v15_3 != v5_11)) {
                                        u.f v14_4 = v2_13.i;
                                        int v15_5 = (this.u0 + v7_3);
                                        u.f v5_8 = p17.l();
                                        int v12_1 = p17.m();
                                        v12_1.d = 0;
                                        v5_8.b(v14_4, v9_3, v12_1, v15_5);
                                        p17.c(v5_8);
                                    } else {
                                        u.f v5_9 = v2_13.i;
                                        int v12_4 = (this.u0 - v7_3);
                                        u.f v14_5 = p17.l();
                                        int v15_6 = p17.m();
                                        v15_6.d = 0;
                                        v14_5.c(v5_9, v9_3, v15_6, v12_4);
                                        p17.c(v14_5);
                                    }
                                    p17.e(v2_13.i, v9_3, (this.u0 + v7_3), v11_8);
                                }
                                v13_0++;
                                v5_11 = 2;
                                int v9 = 3;
                            }
                            u.f v2_19 = this.s0;
                            if (v2_19 != null) {
                                if (v2_19 != 1) {
                                    if (v2_19 != 2) {
                                        if (v2_19 == 3) {
                                            p17.e(v6_4.i, v10.i, 0, 8);
                                            p17.e(v6_4.i, this.T.J.i, 0, 4);
                                            p17.e(v6_4.i, this.T.L.i, 0, 0);
                                        }
                                    } else {
                                        p17.e(v10.i, v6_4.i, 0, 8);
                                        p17.e(v6_4.i, this.T.L.i, 0, 4);
                                        p17.e(v6_4.i, this.T.J.i, 0, 0);
                                        return;
                                    }
                                } else {
                                    p17.e(v4_22.i, v8.i, 0, 8);
                                    p17.e(v4_22.i, this.T.I.i, 0, 4);
                                    p17.e(v4_22.i, this.T.K.i, 0, 0);
                                    return;
                                }
                            } else {
                                p17.e(v8.i, v4_22.i, 0, 8);
                                p17.e(v4_22.i, this.T.K.i, 0, 4);
                                p17.e(v4_22.i, this.T.I.i, 0, 0);
                                return;
                            }
                            return;
                        }
                    }
                    v11_2++;
                }
                v11_5 = 0;
            } else {
                this.v0 = 0;
                u.f v2_14 = this.s0;
                if ((v2_14 != null) && (v2_14 != 1)) {
                    if ((v2_14 == 2) || (v2_14 == 3)) {
                        p17.d(v6_4.i, this.Z);
                        p17.d(v10.i, this.Z);
                        return;
                    }
                } else {
                    p17.d(v4_22.i, this.Y);
                    p17.d(v8.i, this.Y);
                    return;
                }
            }
        }
        return;
    }

    public final boolean c()
    {
        return 1;
    }

    public final String toString()
    {
        String v0_2 = v1.a.n(new StringBuilder("[Barrier] "), this.h0, " {");
        int v1_2 = 0;
        while (v1_2 < this.r0) {
            String v2_1 = this.q0[v1_2];
            if (v1_2 > 0) {
                v0_2 = g2.g.d(v0_2, ", ");
            }
            String v0_4 = u.e.b(v0_2);
            v0_4.append(v2_1.h0);
            v0_2 = v0_4.toString();
            v1_2++;
        }
        return g2.g.d(v0_2, "}");
    }
}
