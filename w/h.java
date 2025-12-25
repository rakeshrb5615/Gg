package w;
public final class h extends w.d {
    public float q0;
    public int r0;
    public int s0;
    public w.c t0;
    public int u0;
    public boolean v0;

    public h()
    {
        this.q0 = -1082130432;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = this.J;
        int v0_1 = 0;
        this.u0 = 0;
        this.R.clear();
        this.R.add(this.t0);
        int v1_3 = this.Q.length;
        while (v0_1 < v1_3) {
            this.Q[v0_1] = this.t0;
            v0_1++;
        }
        return;
    }

    public final boolean A()
    {
        return this.v0;
    }

    public final boolean B()
    {
        return this.v0;
    }

    public final void Q(u.c p3, boolean p4)
    {
        if (this.T != null) {
            int v4_1 = this.t0;
            p3.getClass();
            int v3_5 = u.c.n(v4_1);
            if (this.u0 != 1) {
                this.Y = 0;
                this.Z = v3_5;
                this.O(this.T.q());
                this.L(0);
                return;
            } else {
                this.Y = v3_5;
                this.Z = 0;
                this.L(this.T.k());
                this.O(0);
                return;
            }
        } else {
            return;
        }
    }

    public final void R(int p2)
    {
        this.t0.l(p2);
        this.v0 = 1;
        return;
    }

    public final void S(int p4)
    {
        if (this.u0 != p4) {
            this.u0 = p4;
            w.c[] v4_2 = this.R;
            v4_2.clear();
            if (this.u0 != 1) {
                this.t0 = this.J;
            } else {
                this.t0 = this.I;
            }
            v4_2.add(this.t0);
            w.c[] v4_1 = this.Q;
            int v0_3 = v4_1.length;
            int v1_0 = 0;
            while (v1_0 < v0_3) {
                v4_1[v1_0] = this.t0;
                v1_0++;
            }
        }
        return;
    }

    public final void b(u.c p9, boolean p10)
    {
        u.a v10_1 = ((w.e) this.T);
        if (v10_1 != null) {
            u.b v3_2;
            u.f v1_2 = v10_1.i(2);
            float v2_0 = v10_1.i(4);
            u.b v3_4 = this.T;
            u.a v4_0 = 1;
            if ((v3_4 == null) || (v3_4.p0[0] != 2)) {
                v3_2 = 0;
            } else {
                v3_2 = 1;
            }
            if (this.u0 == 0) {
                v1_2 = v10_1.i(3);
                v2_0 = v10_1.i(5);
                u.a v10_2 = this.T;
                if ((v10_2 == null) || (v10_2.p0[1] != 2)) {
                    v4_0 = 0;
                }
                v3_2 = v4_0;
            }
            if (this.v0) {
                u.a v10_6 = this.t0;
                if (v10_6.c) {
                    u.a v10_18 = p9.k(v10_6);
                    p9.d(v10_18, this.t0.d());
                    if (this.r0 == -1) {
                        if ((this.s0 != -1) && (v3_2 != null)) {
                            u.f v0_7 = p9.k(v2_0);
                            p9.f(v10_18, p9.k(v1_2), 0, 5);
                            p9.f(v0_7, v10_18, 0, 5);
                        }
                    } else {
                        if (v3_2 != null) {
                            p9.f(p9.k(v2_0), v10_18, 0, 5);
                        }
                    }
                    this.v0 = 0;
                    return;
                }
            }
            if (this.r0 == -1) {
                if (this.s0 == -1) {
                    if (this.q0 != -1082130432) {
                        u.a v10_12 = p9.k(this.t0);
                        u.f v1_3 = p9.k(v2_0);
                        float v2_1 = this.q0;
                        u.b v3_3 = p9.l();
                        v3_3.d.g(v10_12, -1082130432);
                        v3_3.d.g(v1_3, v2_1);
                        p9.c(v3_3);
                    }
                } else {
                    u.a v10_15 = p9.k(this.t0);
                    u.f v0_4 = p9.k(v2_0);
                    p9.e(v10_15, v0_4, (- this.s0), 8);
                    if (v3_2 != null) {
                        p9.f(v10_15, p9.k(v1_2), 0, 5);
                        p9.f(v0_4, v10_15, 0, 5);
                        return;
                    }
                }
            } else {
                u.a v10_17 = p9.k(this.t0);
                p9.e(v10_17, p9.k(v1_2), this.r0, 8);
                if (v3_2 != null) {
                    p9.f(p9.k(v2_0), v10_17, 0, 5);
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

    public final w.c i(int p3)
    {
        w.c v3_1 = u.e.c(p3);
        if (v3_1 == 1) {
            if (this.u0 != 1) {
                return 0;
            } else {
                return this.t0;
            }
            if (this.u0 == 0) {
                return this.t0;
            }
        } else {
            if (v3_1 != 2) {
                if (v3_1 == 3) {
                } else {
                    if (v3_1 != 4) {
                        return 0;
                    }
                }
            }
        }
        return 0;
    }
}
