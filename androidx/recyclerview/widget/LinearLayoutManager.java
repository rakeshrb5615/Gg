package androidx.recyclerview.widget;
public class LinearLayoutManager extends a2.t0 implements a2.f1 {
    public final a2.w A;
    public final a2.x B;
    public final int C;
    public final int[] D;
    public int p;
    public a2.y q;
    public a2.e0 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public a2.a0 z;

    public LinearLayoutManager(int p4)
    {
        this.p = 1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 1;
        this.x = -1;
        this.y = -2147483648;
        this.z = 0;
        this.A = new a2.w();
        this.B = new a2.x();
        this.C = 2;
        int[] v2_5 = new int[2];
        this.D = v2_5;
        this.e1(p4);
        this.c(0);
        if (this.t) {
            this.t = 0;
            this.o0();
            return;
        } else {
            return;
        }
    }

    public LinearLayoutManager(android.content.Context p3, android.util.AttributeSet p4, int p5, int p6)
    {
        this.p = 1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 1;
        this.x = -1;
        this.y = -2147483648;
        this.z = 0;
        this.A = new a2.w();
        this.B = new a2.x();
        this.C = 2;
        int[] v1_5 = new int[2];
        this.D = v1_5;
        boolean v3_1 = a2.t0.H(p3, p4, p5, p6);
        this.e1(v3_1.a);
        boolean v4_2 = v3_1.c;
        this.c(0);
        if (v4_2 != this.t) {
            this.t = v4_2;
            this.o0();
        }
        this.f1(v3_1.d);
        return;
    }

    public void A0(androidx.recyclerview.widget.RecyclerView p2, int p3)
    {
        a2.b0 v0_1 = new a2.b0(p2.getContext());
        v0_1.a = p3;
        this.B0(v0_1);
        return;
    }

    public boolean C0()
    {
        if ((this.z != null) || (this.s != this.v)) {
            return 0;
        } else {
            return 1;
        }
    }

    public void D0(a2.g1 p4, int[] p5)
    {
        int v4_2;
        if (p4.a == -1) {
            v4_2 = 0;
        } else {
            v4_2 = this.r.l();
        }
        int v1_0;
        if (this.q.f != -1) {
            v1_0 = v4_2;
            v4_2 = 0;
        } else {
            v1_0 = 0;
        }
        p5[0] = v4_2;
        p5[1] = v1_0;
        return;
    }

    public void E0(a2.g1 p2, a2.y p3, a2.r p4)
    {
        int v0 = p3.d;
        if ((v0 >= 0) && (v0 < p2.b())) {
            p4.a(v0, Math.max(0, p3.g));
        }
        return;
    }

    public final int F0(a2.g1 p7)
    {
        if (this.v() != 0) {
            this.J0();
            int v0_3 = (this.w ^ 1);
            return c4.b.l(p7, this.r, this.M0(v0_3), this.L0(v0_3), this, this.w);
        } else {
            return 0;
        }
    }

    public final int G0(a2.g1 p8)
    {
        if (this.v() != 0) {
            this.J0();
            int v0_3 = (this.w ^ 1);
            return c4.b.m(p8, this.r, this.M0(v0_3), this.L0(v0_3), this, this.w, this.u);
        } else {
            return 0;
        }
    }

    public final int H0(a2.g1 p7)
    {
        if (this.v() != 0) {
            this.J0();
            int v0_3 = (this.w ^ 1);
            return c4.b.n(p7, this.r, this.M0(v0_3), this.L0(v0_3), this, this.w);
        } else {
            return 0;
        }
    }

    public final int I0(int p5)
    {
        if (p5 == 1) {
            if (this.p != 1) {
                if (!this.W0()) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
        } else {
            if (p5 == 2) {
                if (this.p != 1) {
                    if (!this.W0()) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return 1;
                }
            } else {
                if (p5 == 17) {
                    if (this.p != 0) {
                        return -2147483648;
                    } else {
                        return -1;
                    }
                } else {
                    if (p5 == 33) {
                        if (this.p != 1) {
                            return -2147483648;
                        } else {
                            return -1;
                        }
                    } else {
                        if (p5 == 66) {
                            if (this.p != 0) {
                                return -2147483648;
                            } else {
                                return 1;
                            }
                        } else {
                            if (p5 == 130) {
                                if (this.p != 1) {
                                    return -2147483648;
                                } else {
                                    return 1;
                                }
                            } else {
                                return -2147483648;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void J0()
    {
        if (this.q == null) {
            a2.y v0_2 = new a2.y();
            v0_2.a = 1;
            v0_2.h = 0;
            v0_2.i = 0;
            v0_2.k = 0;
            this.q = v0_2;
        }
        return;
    }

    public final boolean K()
    {
        return 1;
    }

    public final int K0(a2.z0 p8, a2.y p9, a2.g1 p10, boolean p11)
    {
        int v0_0 = p9.c;
        int v1_0 = p9.g;
        if (v1_0 != -2147483648) {
            if (v0_0 < 0) {
                p9.g = (v1_0 + v0_0);
            }
            this.Z0(p8, p9);
        }
        int v1_1 = (p9.c + p9.h);
        while ((p9.l) || (v1_1 > 0)) {
            boolean v3_1 = p9.d;
            if ((v3_1) || (v3_1 >= p10.b())) {
                break;
            }
            boolean v3_2 = this.B;
            v3_2.a = 0;
            v3_2.b = 0;
            v3_2.c = 0;
            v3_2.d = 0;
            this.X0(p8, p10, p9, v3_2);
            if (v3_2.b) {
                break;
            }
            int v5_0 = v3_2.a;
            p9.b = ((p9.f * v5_0) + p9.b);
            if ((!v3_2.c) || ((p9.k != null) || (!p10.g))) {
                p9.c = (p9.c - v5_0);
                v1_1 -= v5_0;
            }
            int v4_9 = p9.g;
            if (v4_9 != -2147483648) {
                int v4_10 = (v4_9 + v5_0);
                p9.g = v4_10;
                int v5_1 = p9.c;
                if (v5_1 < 0) {
                    p9.g = (v4_10 + v5_1);
                }
                this.Z0(p8, p9);
            }
            if ((p11) && (v3_2.d)) {
                break;
            }
        }
        return (v0_0 - p9.c);
    }

    public final boolean L()
    {
        return this.t;
    }

    public final android.view.View L0(boolean p3)
    {
        if (!this.u) {
            return this.Q0((this.v() - 1), p3, -1);
        } else {
            return this.Q0(0, p3, this.v());
        }
    }

    public final android.view.View M0(boolean p3)
    {
        if (!this.u) {
            return this.Q0(0, p3, this.v());
        } else {
            return this.Q0((this.v() - 1), p3, -1);
        }
    }

    public final int N0()
    {
        int v0_1 = this.Q0(0, 0, this.v());
        if (v0_1 != 0) {
            return a2.t0.G(v0_1);
        } else {
            return -1;
        }
    }

    public final int O0()
    {
        int v0_2 = this.Q0((this.v() - 1), 0, -1);
        if (v0_2 != 0) {
            return a2.t0.G(v0_2);
        } else {
            return -1;
        }
    }

    public final android.view.View P0(int p4, int p5)
    {
        this.J0();
        if ((p5 <= p4) && (p5 >= p4)) {
            return this.u(p4);
        } else {
            int v1_2;
            int v0_1;
            if (this.r.e(this.u(p4)) >= this.r.k()) {
                v0_1 = 4161;
                v1_2 = 4097;
            } else {
                v0_1 = 16644;
                v1_2 = 16388;
            }
            if (this.p != 0) {
                return this.d.n(p4, p5, v0_1, v1_2);
            } else {
                return this.c.n(p4, p5, v0_1, v1_2);
            }
        }
    }

    public final android.view.View Q0(int p3, boolean p4, int p5)
    {
        int v4_1;
        this.J0();
        if (p4 == 0) {
            v4_1 = 320;
        } else {
            v4_1 = 24579;
        }
        if (this.p != 0) {
            return this.d.n(p3, p5, v4_1, 320);
        } else {
            return this.c.n(p3, p5, v4_1, 320);
        }
    }

    public android.view.View R0(a2.z0 p17, a2.g1 p18, boolean p19, boolean p20)
    {
        int v1_1;
        int v4;
        int v5;
        this.J0();
        int v1_2 = this.v();
        if (!p20) {
            v4 = v1_2;
            v1_1 = 0;
            v5 = 1;
        } else {
            v1_1 = (this.v() - 1);
            v4 = -1;
            v5 = -1;
        }
        int v6 = p18.b();
        int v7_1 = this.r.k();
        int v8_1 = this.r.g();
        android.view.View v9 = 0;
        android.view.View v10 = 0;
        android.view.View v11 = 0;
        while (v1_1 != v4) {
            android.view.View v12 = this.u(v1_1);
            int v13_0 = a2.t0.G(v12);
            int v14_1 = this.r.e(v12);
            int v15_1 = this.r.b(v12);
            if ((v13_0 >= 0) && (v13_0 < v6)) {
                if (!((a2.u0) v12.getLayoutParams()).a.h()) {
                    if ((v15_1 > v7_1) || (v14_1 >= v7_1)) {
                        int v13_5 = 0;
                    } else {
                        v13_5 = 1;
                    }
                    if ((v14_1 < v8_1) || (v15_1 <= v8_1)) {
                        int v14_2 = 0;
                    } else {
                        v14_2 = 1;
                    }
                    if ((v13_5 == 0) && (v14_2 == 0)) {
                        return v12;
                    } else {
                        if (!p19) {
                            if (v13_5 == 0) {
                                if (v9 != null) {
                                    v1_1 += v5;
                                }
                            } else {
                                v10 = v12;
                            }
                        } else {
                            if (v14_2 == 0) {
                                if (v9 != null) {
                                }
                            }
                        }
                        v9 = v12;
                    }
                } else {
                    if (v11 == null) {
                        v11 = v12;
                    }
                }
            }
        }
        if (v9 == null) {
            if (v10 == null) {
                return v11;
            } else {
                return v10;
            }
        } else {
            return v9;
        }
    }

    public final void S(androidx.recyclerview.widget.RecyclerView p1)
    {
        return;
    }

    public final int S0(int p2, a2.z0 p3, a2.g1 p4, boolean p5)
    {
        int v0_2 = (this.r.g() - p2);
        if (v0_2 <= 0) {
            return 0;
        } else {
            int v3_1 = (- this.c1((- v0_2), p3, p4));
            if (p5) {
                int v4_3 = (this.r.g() - (p2 + v3_1));
                if (v4_3 > 0) {
                    this.r.o(v4_3);
                    return (v4_3 + v3_1);
                }
            }
            return v3_1;
        }
    }

    public android.view.View T(android.view.View p3, int p4, a2.z0 p5, a2.g1 p6)
    {
        android.view.View v3_1;
        this.b1();
        if (this.v() != 0) {
            android.view.View v3_2 = this.I0(p4);
            if (v3_2 != -2147483648) {
                android.view.View v4_2;
                this.J0();
                this.g1(v3_2, ((int) (((float) this.r.l()) * 1051372203)), 0, p6);
                a2.y v0_4 = this.q;
                v0_4.g = -2147483648;
                v0_4.a = 0;
                this.K0(p5, v0_4, p6, 1);
                if (v3_2 != -1) {
                    if (!this.u) {
                        v4_2 = this.P0((this.v() - 1), -1);
                    } else {
                        v4_2 = this.P0(0, this.v());
                    }
                } else {
                    if (!this.u) {
                        v4_2 = this.P0(0, this.v());
                    } else {
                        v4_2 = this.P0((this.v() - 1), -1);
                    }
                }
                if (v3_2 != -1) {
                    v3_1 = this.U0();
                } else {
                    v3_1 = this.V0();
                }
                if (!v3_1.hasFocusable()) {
                    return v4_2;
                } else {
                    if (v4_2 == null) {
                        v3_1 = 0;
                    }
                }
            }
        }
        return v3_1;
    }

    public final int T0(int p2, a2.z0 p3, a2.g1 p4, boolean p5)
    {
        int v0_2 = (p2 - this.r.k());
        if (v0_2 <= 0) {
            return 0;
        } else {
            int v3_1 = (- this.c1(v0_2, p3, p4));
            if (p5 != 0) {
                int v2_2 = ((p2 + v3_1) - this.r.k());
                if (v2_2 > 0) {
                    this.r.o((- v2_2));
                    v3_1 -= v2_2;
                }
            }
            return v3_1;
        }
    }

    public final void U(android.view.accessibility.AccessibilityEvent p2)
    {
        super.U(p2);
        if (this.v() > 0) {
            p2.setFromIndex(this.N0());
            p2.setToIndex(this.O0());
        }
        return;
    }

    public final android.view.View U0()
    {
        android.view.View v0_2;
        if (!this.u) {
            v0_2 = (this.v() - 1);
        } else {
            v0_2 = 0;
        }
        return this.u(v0_2);
    }

    public void V(a2.z0 p1, a2.g1 p2, r0.c p3)
    {
        super.V(p1, p2, p3);
        r0.b v1_2 = this.b.r;
        if ((v1_2 != null) && (v1_2.a() > 0)) {
            p3.b(r0.b.k);
        }
        return;
    }

    public final android.view.View V0()
    {
        android.view.View v0_1;
        if (!this.u) {
            v0_1 = 0;
        } else {
            v0_1 = (this.v() - 1);
        }
        return this.u(v0_1);
    }

    public final boolean W0()
    {
        if (this.b.getLayoutDirection() != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public void X0(a2.z0 p11, a2.g1 p12, a2.y p13, a2.x p14)
    {
        boolean v11_1 = p13.b(p11);
        if (v11_1) {
            a2.u0 v0_1 = ((a2.u0) v11_1.getLayoutParams());
            if (p13.k != null) {
                int v4_2;
                if (p13.f != -1) {
                    v4_2 = 0;
                } else {
                    v4_2 = 1;
                }
                if (this.u != v4_2) {
                    this.b(v11_1, 0, 1);
                } else {
                    this.b(v11_1, -1, 1);
                }
            } else {
                int v4_4;
                if (p13.f != -1) {
                    v4_4 = 0;
                } else {
                    v4_4 = 1;
                }
                if (this.u != v4_4) {
                    this.b(v11_1, 0, 0);
                } else {
                    this.b(v11_1, -1, 0);
                }
            }
            int v1_8 = ((a2.u0) v11_1.getLayoutParams());
            int v3_5 = this.b.N(v11_1);
            int v5_2 = (v3_5.top + v3_5.bottom);
            int v3_8 = a2.t0.w(this.d(), this.n, this.l, ((((this.E() + this.D()) + v1_8.leftMargin) + v1_8.rightMargin) + (v3_5.left + v3_5.right)), v1_8.width);
            int v4_9 = a2.t0.w(this.e(), this.o, this.m, ((((this.C() + this.F()) + v1_8.topMargin) + v1_8.bottomMargin) + v5_2), v1_8.height);
            if (this.x0(v11_1, v3_8, v4_9, v1_8)) {
                v11_1.measure(v3_8, v4_9);
            }
            int v3_0;
            int v2_2;
            int v1_0;
            boolean v13_2;
            p14.a = this.r.c(v11_1);
            if (this.p != 1) {
                int v1_14 = this.F();
                int v3_11 = (this.r.d(v11_1) + v1_14);
                if (p13.f != -1) {
                    boolean v13_8 = p13.b;
                    v3_0 = v13_8;
                    v13_2 = v3_11;
                    v2_2 = v1_14;
                    v1_0 = (p14.a + v13_8);
                } else {
                    boolean v13_1 = p13.b;
                    v1_0 = v13_1;
                    v13_2 = v3_11;
                    v3_0 = (v13_1 - p14.a);
                    v2_2 = v1_14;
                }
            } else {
                if (!this.W0()) {
                    v3_0 = this.D();
                    v1_0 = (this.r.d(v11_1) + v3_0);
                } else {
                    v1_0 = (this.n - this.E());
                    v3_0 = (v1_0 - this.r.d(v11_1));
                }
                if (p13.f != -1) {
                    v2_2 = p13.b;
                    v13_2 = (p14.a + v2_2);
                } else {
                    v13_2 = p13.b;
                    v2_2 = (v13_2 - p14.a);
                }
            }
            a2.t0.N(v11_1, v3_0, v2_2, v1_0, v13_2);
            if ((v0_1.a.h()) || (v0_1.a.k())) {
                p14.c = 1;
            }
            p14.d = v11_1.hasFocusable();
            return;
        } else {
            p14.b = 1;
            return;
        }
    }

    public void Y0(a2.z0 p1, a2.g1 p2, a2.w p3, int p4)
    {
        return;
    }

    public final void Z0(a2.z0 p6, a2.y p7)
    {
        if ((p7.a) && (!p7.l)) {
            int v0_3 = p7.g;
            int v1_3 = p7.i;
            if (p7.f != -1) {
                if (v0_3 >= 0) {
                    int v0_1 = (v0_3 - v1_3);
                    int v7_1 = this.v();
                    if (!this.u) {
                        int v1_1 = 0;
                        while (v1_1 < v7_1) {
                            int v3_0 = this.u(v1_1);
                            if ((this.r.b(v3_0) <= v0_1) && (this.r.m(v3_0) <= v0_1)) {
                                v1_1++;
                            } else {
                                this.a1(p6, 0, v1_1);
                                break;
                            }
                        }
                    } else {
                        int v7_2 = (v7_1 - 1);
                        int v1_2 = v7_2;
                        while (v1_2 >= 0) {
                            int v2_0 = this.u(v1_2);
                            if ((this.r.b(v2_0) <= v0_1) && (this.r.m(v2_0) <= v0_1)) {
                                v1_2--;
                            } else {
                                this.a1(p6, v7_2, v1_2);
                                return;
                            }
                        }
                    }
                }
            } else {
                int v7_3 = this.v();
                if (v0_3 >= 0) {
                    int v3_8 = ((this.r.f() - v0_3) + v1_3);
                    if (!this.u) {
                        int v7_4 = (v7_3 - 1);
                        int v0_5 = v7_4;
                        while (v0_5 >= 0) {
                            int v1_4 = this.u(v0_5);
                            if ((this.r.e(v1_4) >= v3_8) && (this.r.n(v1_4) >= v3_8)) {
                                v0_5--;
                            } else {
                                this.a1(p6, v7_4, v0_5);
                                return;
                            }
                        }
                    } else {
                        int v0_6 = 0;
                        while (v0_6 < v7_3) {
                            int v1_6 = this.u(v0_6);
                            if ((this.r.e(v1_6) >= v3_8) && (this.r.n(v1_6) >= v3_8)) {
                                v0_6++;
                            } else {
                                this.a1(p6, 0, v0_6);
                                return;
                            }
                        }
                    }
                }
            }
        }
        return;
    }

    public final android.graphics.PointF a(int p4)
    {
        if (this.v() != 0) {
            int v0_1 = 0;
            int v2 = 1;
            if (p4 < a2.t0.G(this.u(0))) {
                v0_1 = 1;
            }
            if (v0_1 != this.u) {
                v2 = -1;
            }
            if (this.p != 0) {
                return new android.graphics.PointF(0, ((float) v2));
            } else {
                return new android.graphics.PointF(((float) v2), 0);
            }
        } else {
            return 0;
        }
    }

    public final void a1(a2.z0 p2, int p3, int p4)
    {
        if (p3 != p4) {
            if (p4 > p3) {
                int v4_1 = (p4 - 1);
                while (v4_1 >= p3) {
                    android.view.View v0_0 = this.u(v4_1);
                    this.m0(v4_1);
                    p2.i(v0_0);
                    v4_1--;
                }
                return;
            }
            while (p3 > p4) {
                android.view.View v0_1 = this.u(p3);
                this.m0(p3);
                p2.i(v0_1);
                p3--;
            }
        }
        return;
    }

    public final void b1()
    {
        if ((this.p != 1) && (this.W0())) {
            this.u = (this.t ^ 1);
            return;
        } else {
            this.u = this.t;
            return;
        }
    }

    public final void c(String p2)
    {
        if (this.z == null) {
            super.c(p2);
        }
        return;
    }

    public final int c1(int p6, a2.z0 p7, a2.g1 p8)
    {
        if ((this.v() != 0) && (p6 != 0)) {
            int v0_1;
            this.J0();
            this.q.a = 1;
            if (p6 <= 0) {
                v0_1 = -1;
            } else {
                v0_1 = 1;
            }
            int v3 = Math.abs(p6);
            this.g1(v0_1, v3, 1, p8);
            a2.y v2_0 = this.q;
            a2.y v7_2 = (this.K0(p7, v2_0, p8, 0) + v2_0.g);
            if (v7_2 >= null) {
                if (v3 > v7_2) {
                    p6 = (v0_1 * v7_2);
                }
                this.r.o((- p6));
                this.q.j = p6;
                return p6;
            }
        }
        return 0;
    }

    public final boolean d()
    {
        if (this.p != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void d0(a2.z0 p18, a2.g1 p19)
    {
        int v4_0 = -1;
        if (((this.z == null) && (this.x == -1)) || (p19.b() != 0)) {
            a2.y v3_4 = this.z;
            if (v3_4 != null) {
                a2.y v3_6 = v3_4.a;
                if (v3_6 >= null) {
                    this.x = v3_6;
                }
            }
            a2.y v3_27;
            this.J0();
            this.q.a = 0;
            this.b1();
            a2.y v3_23 = this.b;
            if (v3_23 != null) {
                v3_27 = v3_23.getFocusedChild();
                if ((v3_27 == null) || (((java.util.ArrayList) this.a.e).contains(v3_27))) {
                    v3_27 = 0;
                }
            }
            a2.w v7_4 = this.A;
            if ((v7_4.e) && ((this.x == -1) && (this.z == null))) {
                if ((v3_27 != null) && ((this.r.e(v3_27) >= this.r.g()) || (this.r.b(v3_27) <= this.r.k()))) {
                    v7_4.c(v3_27, a2.t0.G(v3_27));
                }
            } else {
                v7_4.d();
                v7_4.d = (this.u ^ this.v);
                if (p19.g) {
                    if (this.v() != 0) {
                        a2.y v3_22;
                        a2.y v3_21 = this.b;
                        if (v3_21 != null) {
                            v3_22 = v3_21.getFocusedChild();
                            if ((v3_22 == null) || (((java.util.ArrayList) this.a.e).contains(v3_22))) {
                                v3_22 = 0;
                            }
                        }
                        if (v3_22 != null) {
                            int v8_24 = ((a2.u0) v3_22.getLayoutParams());
                            if ((!v8_24.a.h()) && ((v8_24.a.b() >= 0) && (v8_24.a.b() < p19.b()))) {
                                v7_4.c(v3_22, a2.t0.G(v3_22));
                                v7_4.e = 1;
                                int v8_35;
                                a2.y v3_34 = this.q;
                                if (v3_34.j < 0) {
                                    v8_35 = -1;
                                } else {
                                    v8_35 = 1;
                                }
                                v3_34.f = v8_35;
                                a2.y v3_35 = this.D;
                                v3_35[0] = 0;
                                v3_35[1] = 0;
                                this.D0(p19, v3_35);
                                int v11_20 = (this.r.k() + Math.max(0, v3_35[0]));
                                int v8_40 = (this.r.h() + Math.max(0, v3_35[1]));
                                if (p19.g) {
                                    a2.y v3_39 = this.x;
                                    if ((v3_39 != -1) && (this.y != -2147483648)) {
                                        a2.y v3_41 = this.q(v3_39);
                                        if (v3_41 != null) {
                                            int v9_4;
                                            a2.y v3_43;
                                            if (!this.u) {
                                                v3_43 = (this.r.e(v3_41) - this.r.k());
                                                v9_4 = this.y;
                                            } else {
                                                v9_4 = (this.r.g() - this.r.b(v3_41));
                                                v3_43 = this.y;
                                            }
                                            int v9_7 = (v9_4 - v3_43);
                                            if (v9_7 <= 0) {
                                                v8_40 -= v9_7;
                                            } else {
                                                v11_20 += v9_7;
                                            }
                                        }
                                    }
                                }
                                if (!v7_4.d) {
                                    if (!this.u) {
                                        v4_0 = 1;
                                    }
                                } else {
                                    if (this.u) {
                                    }
                                }
                                int v4_5;
                                this.Y0(p18, p19, v7_4, v4_0);
                                this.p(p18);
                                if ((this.r.i() != 0) || (this.r.f() != 0)) {
                                    v4_5 = 0;
                                } else {
                                    v4_5 = 1;
                                }
                                int v4_9;
                                int v8_42;
                                this.q.l = v4_5;
                                this.q.getClass();
                                this.q.i = 0;
                                if (!v7_4.d) {
                                    this.h1(v7_4.b, v7_4.c);
                                    a2.y v3_53 = this.q;
                                    v3_53.h = v8_40;
                                    this.K0(p18, v3_53, p19, 0);
                                    a2.y v3_54 = this.q;
                                    v8_42 = v3_54.b;
                                    int v4_7 = v3_54.d;
                                    a2.y v3_55 = v3_54.c;
                                    if (v3_55 > null) {
                                        v11_20 += v3_55;
                                    }
                                    this.i1(v7_4.b, v7_4.c);
                                    a2.y v3_57 = this.q;
                                    v3_57.h = v11_20;
                                    v3_57.d = (v3_57.d + v3_57.e);
                                    this.K0(p18, v3_57, p19, 0);
                                    a2.y v3_58 = this.q;
                                    int v9_12 = v3_58.b;
                                    a2.y v3_59 = v3_58.c;
                                    if (v3_59 > null) {
                                        this.h1(v4_7, v8_42);
                                        int v4_8 = this.q;
                                        v4_8.h = v3_59;
                                        this.K0(p18, v4_8, p19, 0);
                                        v8_42 = this.q.b;
                                    }
                                    v4_9 = v9_12;
                                } else {
                                    this.i1(v7_4.b, v7_4.c);
                                    a2.y v3_62 = this.q;
                                    v3_62.h = v11_20;
                                    this.K0(p18, v3_62, p19, 0);
                                    a2.y v3_63 = this.q;
                                    v4_9 = v3_63.b;
                                    int v9_13 = v3_63.d;
                                    a2.y v3_64 = v3_63.c;
                                    if (v3_64 > null) {
                                        v8_40 += v3_64;
                                    }
                                    this.h1(v7_4.b, v7_4.c);
                                    a2.y v3_66 = this.q;
                                    v3_66.h = v8_40;
                                    v3_66.d = (v3_66.d + v3_66.e);
                                    this.K0(p18, v3_66, p19, 0);
                                    a2.y v3_67 = this.q;
                                    v8_42 = v3_67.b;
                                    a2.y v3_68 = v3_67.c;
                                    if (v3_68 > null) {
                                        this.i1(v9_13, v4_9);
                                        int v4_11 = this.q;
                                        v4_11.h = v3_68;
                                        this.K0(p18, v4_11, p19, 0);
                                        v4_9 = this.q.b;
                                    }
                                }
                                if (this.v() > 0) {
                                    int v4_12;
                                    a2.y v3_74;
                                    int v8_48;
                                    if ((this.u ^ this.v) == 0) {
                                        a2.y v3_73 = this.T0(v4_9, p18, p19, 1);
                                        v4_12 = (v4_9 + v3_73);
                                        v8_48 = (v8_42 + v3_73);
                                        v3_74 = this.S0(v8_48, p18, p19, 0);
                                    } else {
                                        a2.y v3_75 = this.S0(v8_42, p18, p19, 1);
                                        v4_12 = (v4_9 + v3_75);
                                        v8_48 = (v8_42 + v3_75);
                                        v3_74 = this.T0(v4_12, p18, p19, 0);
                                    }
                                    v4_9 = (v4_12 + v3_74);
                                    v8_42 = (v8_48 + v3_74);
                                }
                                if ((p19.k) && ((this.v() != 0) && ((!p19.g) && (this.C0())))) {
                                    a2.y v3_80 = p18.d;
                                    int v9_15 = v3_80.size();
                                    int v11_25 = a2.t0.G(this.u(0));
                                    int v12_4 = 0;
                                    int v13_1 = 0;
                                    int v14 = 0;
                                    while (v12_4 < v9_15) {
                                        int v15_1 = ((a2.k1) v3_80.get(v12_4));
                                        int v10_1 = v15_1.a;
                                        if (!v15_1.h()) {
                                            int v15_3;
                                            if (v15_1.b() >= v11_25) {
                                                v15_3 = 0;
                                            } else {
                                                v15_3 = 1;
                                            }
                                            if (v15_3 == this.u) {
                                                v14 += this.r.c(v10_1);
                                            } else {
                                                v13_1 += this.r.c(v10_1);
                                            }
                                        }
                                        v12_4++;
                                    }
                                    this.q.k = v3_80;
                                    if (v13_1 > 0) {
                                        this.i1(a2.t0.G(this.V0()), v4_9);
                                        a2.y v3_83 = this.q;
                                        v3_83.h = v13_1;
                                        v3_83.c = 0;
                                        v3_83.a(0);
                                        this.K0(p18, androidx.recyclerview.widget.LinearLayoutManager v0.q, p19, 0);
                                    }
                                    int v4_14;
                                    if (v14 <= 0) {
                                        v4_14 = 0;
                                    } else {
                                        this.h1(a2.t0.G(this.U0()), v8_42);
                                        a2.y v3_87 = this.q;
                                        v3_87.h = v14;
                                        v3_87.c = 0;
                                        v4_14 = 0;
                                        v3_87.a(0);
                                        this.K0(p18, this.q, p19, 0);
                                    }
                                    this.q.k = v4_14;
                                }
                                if (p19.g) {
                                    v7_4.d();
                                } else {
                                    a2.y v1_3 = this.r;
                                    v1_3.a = v1_3.l();
                                }
                                this.s = this.v;
                                return;
                            }
                        }
                        int v8_27 = this.v;
                        if (this.s == v8_27) {
                            a2.y v3_26 = this.R0(p18, p19, v7_4.d, v8_27);
                            if (v3_26 != null) {
                                v7_4.b(v3_26, a2.t0.G(v3_26));
                                if ((p19.g) || (!this.C0())) {
                                } else {
                                    int v13_0;
                                    int v8_32 = this.r.e(v3_26);
                                    a2.y v3_28 = this.r.b(v3_26);
                                    int v11_17 = this.r.k();
                                    int v12_1 = this.r.g();
                                    if ((v3_28 > v11_17) || (v8_32 >= v11_17)) {
                                        v13_0 = 0;
                                    } else {
                                        v13_0 = 1;
                                    }
                                    if ((v8_32 < v12_1) || (v3_28 <= v12_1)) {
                                        a2.y v3_29 = 0;
                                    } else {
                                        v3_29 = 1;
                                    }
                                    if ((v13_0 == 0) && (v3_29 == null)) {
                                    } else {
                                        if (v7_4.d) {
                                            v11_17 = v12_1;
                                        }
                                        v7_4.c = v11_17;
                                    }
                                }
                            }
                        }
                    }
                    a2.y v3_32;
                    v7_4.a();
                    if (!this.v) {
                        v3_32 = 0;
                    } else {
                        v3_32 = (p19.b() - 1);
                    }
                    v7_4.b = v3_32;
                } else {
                    a2.y v3_93 = this.x;
                    if (v3_93 != -1) {
                        if ((v3_93 >= null) && (v3_93 < p19.b())) {
                            a2.y v3_94 = this.x;
                            v7_4.b = v3_94;
                            int v8_55 = this.z;
                            if ((v8_55 == 0) || (v8_55.a < 0)) {
                                if (this.y != -2147483648) {
                                    a2.y v3_95 = this.u;
                                    v7_4.d = v3_95;
                                    if (v3_95 == null) {
                                        v7_4.c = (this.r.k() + this.y);
                                    } else {
                                        v7_4.c = (this.r.g() - this.y);
                                    }
                                } else {
                                    a2.y v3_103 = this.q(v3_94);
                                    if (v3_103 == null) {
                                        if (this.v() > 0) {
                                            a2.y v3_3;
                                            if (this.x >= a2.t0.G(this.u(0))) {
                                                v3_3 = 0;
                                            } else {
                                                v3_3 = 1;
                                            }
                                            a2.y v3_5;
                                            if (v3_3 != this.u) {
                                                v3_5 = 0;
                                            } else {
                                                v3_5 = 1;
                                            }
                                            v7_4.d = v3_5;
                                        }
                                        v7_4.a();
                                    } else {
                                        if (this.r.c(v3_103) <= this.r.l()) {
                                            if ((this.r.e(v3_103) - this.r.k()) >= 0) {
                                                if ((this.r.g() - this.r.b(v3_103)) >= 0) {
                                                    int v11_6;
                                                    if (!v7_4.d) {
                                                        v11_6 = this.r.e(v3_103);
                                                    } else {
                                                        int v11_9;
                                                        a2.y v3_7 = this.r.b(v3_103);
                                                        int v8_13 = this.r;
                                                        if (-2147483648 != v8_13.a) {
                                                            v11_9 = (v8_13.l() - v8_13.a);
                                                        } else {
                                                            v11_9 = 0;
                                                        }
                                                        v11_6 = (v11_9 + v3_7);
                                                    }
                                                    v7_4.c = v11_6;
                                                } else {
                                                    v7_4.c = this.r.g();
                                                    v7_4.d = 1;
                                                }
                                            } else {
                                                v7_4.c = this.r.k();
                                                v7_4.d = 0;
                                            }
                                        } else {
                                            v7_4.a();
                                        }
                                    }
                                }
                            } else {
                                a2.y v3_12 = v8_55.c;
                                v7_4.d = v3_12;
                                if (v3_12 == null) {
                                    v7_4.c = (this.r.k() + this.z.b);
                                } else {
                                    v7_4.c = (this.r.g() - this.z.b);
                                }
                            }
                        } else {
                            this.x = -1;
                            this.y = -2147483648;
                        }
                    }
                }
            }
        } else {
            this.j0(p18);
            return;
        }
    }

    public final void d1(int p1, int p2)
    {
        this.x = p1;
        this.y = p2;
        a2.a0 v1_1 = this.z;
        if (v1_1 != null) {
            v1_1.a = -1;
        }
        this.o0();
        return;
    }

    public final boolean e()
    {
        if (this.p != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public void e0(a2.g1 p1)
    {
        this.z = 0;
        this.x = -1;
        this.y = -2147483648;
        this.A.d();
        return;
    }

    public final void e1(int p3)
    {
        if ((p3 != null) && (p3 != 1)) {
            throw new IllegalArgumentException(g2.g.c(p3, "invalid orientation:"));
        } else {
            this.c(0);
            if ((p3 == this.p) && (this.r != null)) {
                return;
            } else {
                a2.e0 v0_3 = a2.e0.a(this, p3);
                this.r = v0_3;
                this.A.a = v0_3;
                this.p = p3;
                this.o0();
                return;
            }
        }
    }

    public final void f0(android.os.Parcelable p3)
    {
        if ((p3 instanceof a2.a0)) {
            this.z = ((a2.a0) p3);
            if (this.x != -1) {
                ((a2.a0) p3).a = -1;
            }
            this.o0();
        }
        return;
    }

    public void f1(boolean p2)
    {
        this.c(0);
        if (this.v != p2) {
            this.v = p2;
            this.o0();
            return;
        } else {
            return;
        }
    }

    public final android.os.Parcelable g0()
    {
        a2.a0 v0_0 = this.z;
        if (v0_0 == null) {
            a2.a0 v0_2 = new a2.a0();
            if (this.v() <= 0) {
                v0_2.a = -1;
                return v0_2;
            } else {
                this.J0();
                int v1_1 = (this.s ^ this.u);
                v0_2.c = v1_1;
                if (v1_1 == 0) {
                    int v1_2 = this.V0();
                    v0_2.a = a2.t0.G(v1_2);
                    v0_2.b = (this.r.e(v1_2) - this.r.k());
                    return v0_2;
                } else {
                    int v1_5 = this.U0();
                    v0_2.b = (this.r.g() - this.r.b(v1_5));
                    v0_2.a = a2.t0.G(v1_5);
                    return v0_2;
                }
            }
        } else {
            int v1_8 = new a2.a0();
            v1_8.a = v0_0.a;
            v1_8.b = v0_0.b;
            v1_8.c = v0_0.c;
            return v1_8;
        }
    }

    public final void g1(int p5, int p6, boolean p7, a2.g1 p8)
    {
        a2.y v1_1;
        int v2_0 = 0;
        int v3 = 1;
        if ((this.r.i() != 0) || (this.r.f() != 0)) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.q.l = v1_1;
        this.q.f = p5;
        a2.y v0_2 = this.D;
        v0_2[0] = 0;
        v0_2[1] = 0;
        this.D0(p8, v0_2);
        int v8_2 = Math.max(0, v0_2[0]);
        a2.y v0_4 = Math.max(0, v0_2[1]);
        if (p5 == 1) {
            v2_0 = 1;
        }
        a2.y v1_3;
        int v5_1 = this.q;
        if (v2_0 == 0) {
            v1_3 = v8_2;
        } else {
            v1_3 = v0_4;
        }
        v5_1.h = v1_3;
        if (v2_0 == 0) {
            v8_2 = v0_4;
        }
        int v5_5;
        v5_1.i = v8_2;
        if (v2_0 == 0) {
            int v5_2 = this.V0();
            a2.y v0_5 = this.q;
            v0_5.h = (this.r.k() + v0_5.h);
            a2.y v0_6 = this.q;
            if (!this.u) {
                v3 = -1;
            }
            v0_6.e = v3;
            a2.y v1_6 = this.q;
            v0_6.d = (a2.t0.G(v5_2) + v1_6.e);
            v1_6.b = this.r.e(v5_2);
            v5_5 = ((- this.r.e(v5_2)) + this.r.k());
        } else {
            v5_1.h = (this.r.h() + v1_3);
            int v5_6 = this.U0();
            a2.y v0_10 = this.q;
            if (this.u) {
                v3 = -1;
            }
            v0_10.e = v3;
            a2.y v1_9 = this.q;
            v0_10.d = (a2.t0.G(v5_6) + v1_9.e);
            v1_9.b = this.r.b(v5_6);
            v5_5 = (this.r.b(v5_6) - this.r.g());
        }
        int v8_18 = this.q;
        v8_18.c = p6;
        if (p7) {
            v8_18.c = (p6 - v5_5);
        }
        v8_18.g = v5_5;
        return;
    }

    public final void h(int p2, int p3, a2.g1 p4, a2.r p5)
    {
        if (this.p != 0) {
            p2 = p3;
        }
        if ((this.v() != 0) && (p2 != null)) {
            int v0_1;
            this.J0();
            if (p2 <= null) {
                v0_1 = -1;
            } else {
                v0_1 = 1;
            }
            this.g1(v0_1, Math.abs(p2), 1, p4);
            this.E0(p4, this.q, p5);
        }
        return;
    }

    public final void h1(int p4, int p5)
    {
        int v1_1;
        this.q.c = (this.r.g() - p5);
        a2.y v0_1 = this.q;
        if (!this.u) {
            v1_1 = 1;
        } else {
            v1_1 = -1;
        }
        v0_1.e = v1_1;
        v0_1.d = p4;
        v0_1.f = 1;
        v0_1.b = p5;
        v0_1.g = -2147483648;
        return;
    }

    public final void i(int p6, a2.r p7)
    {
        int v0_1;
        int v3;
        int v0_0 = this.z;
        int v1 = -1;
        if (v0_0 == 0) {
            this.b1();
            v0_1 = this.u;
            v3 = this.x;
            if (v3 == -1) {
                if (v0_1 == 0) {
                    v3 = 0;
                } else {
                    v3 = (p6 - 1);
                }
            }
        } else {
            v3 = v0_0.a;
            if (v3 < 0) {
            } else {
                v0_1 = v0_0.c;
            }
        }
        if (v0_1 == 0) {
            v1 = 1;
        }
        int v0_2 = 0;
        while ((v0_2 < this.C) && ((v3 >= 0) && (v3 < p6))) {
            p7.a(v3, 0);
            v3 += v1;
            v0_2++;
        }
        return;
    }

    public boolean i0(int p4, android.os.Bundle p5)
    {
        if (!super.i0(p4, p5)) {
            if ((p4 == 16908343) && (p5 != 0)) {
                int v4_3;
                if (this.p != 1) {
                    int v4_2 = p5.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                    if (v4_2 >= 0) {
                        int v5_1 = this.b;
                        v4_3 = Math.min(v4_2, (this.x(v5_1.c, v5_1.k0) - 1));
                    } else {
                        return 0;
                    }
                } else {
                    int v4_5 = p5.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                    if (v4_5 >= 0) {
                        int v5_5 = this.b;
                        v4_3 = Math.min(v4_5, (this.I(v5_5.c, v5_5.k0) - 1));
                    } else {
                        return 0;
                    }
                }
                if (v4_3 >= 0) {
                    this.d1(v4_3, 0);
                    return 1;
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final void i1(int p3, int p4)
    {
        int v3_1;
        this.q.c = (p4 - this.r.k());
        a2.y v0_1 = this.q;
        v0_1.d = p3;
        if (!this.u) {
            v3_1 = -1;
        } else {
            v3_1 = 1;
        }
        v0_1.e = v3_1;
        v0_1.f = -1;
        v0_1.b = p4;
        v0_1.g = -2147483648;
        return;
    }

    public final int j(a2.g1 p1)
    {
        return this.F0(p1);
    }

    public int k(a2.g1 p1)
    {
        return this.G0(p1);
    }

    public int l(a2.g1 p1)
    {
        return this.H0(p1);
    }

    public final int m(a2.g1 p1)
    {
        return this.F0(p1);
    }

    public int n(a2.g1 p1)
    {
        return this.G0(p1);
    }

    public int o(a2.g1 p1)
    {
        return this.H0(p1);
    }

    public int p0(int p3, a2.z0 p4, a2.g1 p5)
    {
        if (this.p != 1) {
            return this.c1(p3, p4, p5);
        } else {
            return 0;
        }
    }

    public final android.view.View q(int p3)
    {
        android.view.View v0_0 = this.v();
        if (v0_0 != null) {
            int v1_4 = (p3 - a2.t0.G(this.u(0)));
            if ((v1_4 >= 0) && (v1_4 < v0_0)) {
                android.view.View v0_1 = this.u(v1_4);
                if (a2.t0.G(v0_1) == p3) {
                    return v0_1;
                }
            }
            return super.q(p3);
        } else {
            return 0;
        }
    }

    public final void q0(int p2)
    {
        this.x = p2;
        this.y = -2147483648;
        a2.a0 v2_2 = this.z;
        if (v2_2 != null) {
            v2_2.a = -1;
        }
        this.o0();
        return;
    }

    public a2.u0 r()
    {
        return new a2.u0(-2, -2);
    }

    public int r0(int p2, a2.z0 p3, a2.g1 p4)
    {
        if (this.p != 0) {
            return this.c1(p2, p3, p4);
        } else {
            return 0;
        }
    }

    public final boolean y0()
    {
        if ((this.m != 1073741824) && (this.l != 1073741824)) {
            int v0_3 = this.v();
            int v2_0 = 0;
            while (v2_0 < v0_3) {
                int v3_1 = this.u(v2_0).getLayoutParams();
                if ((v3_1.width >= 0) || (v3_1.height >= 0)) {
                    v2_0++;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}
