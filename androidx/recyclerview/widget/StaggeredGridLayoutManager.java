package androidx.recyclerview.widget;
public class StaggeredGridLayoutManager extends a2.t0 implements a2.f1 {
    public int A;
    public final k2.c B;
    public final int C;
    public boolean D;
    public boolean E;
    public a2.r1 F;
    public final android.graphics.Rect G;
    public final a2.o1 H;
    public final boolean I;
    public int[] J;
    public final a2.l K;
    public final int p;
    public final a2.s1[] q;
    public final a2.e0 r;
    public final a2.e0 s;
    public final int t;
    public int u;
    public final a2.v v;
    public boolean w;
    public boolean x;
    public final java.util.BitSet y;
    public int z;

    public StaggeredGridLayoutManager(android.content.Context p6, android.util.AttributeSet p7, int p8, int p9)
    {
        this.p = -1;
        this.w = 0;
        this.x = 0;
        this.z = -1;
        this.A = -2147483648;
        a2.s1 v0_1 = new k2.c(2, 0);
        this.B = v0_1;
        this.C = 2;
        this.G = new android.graphics.Rect();
        this.H = new a2.o1(this);
        this.I = 1;
        this.K = new a2.l(this, 2);
        a2.e0 v6_1 = a2.t0.H(p6, p7, p8, p9);
        int v7_1 = v6_1.a;
        if ((v7_1 != 0) && (v7_1 != 1)) {
            throw new IllegalArgumentException("invalid orientation.");
        } else {
            this.c(0);
            if (v7_1 != this.t) {
                this.t = v7_1;
                int v7_3 = this.r;
                this.r = this.s;
                this.s = v7_3;
                this.o0();
            }
            int v7_4 = v6_1.b;
            this.c(0);
            if (v7_4 != this.p) {
                v0_1.j();
                this.o0();
                this.p = v7_4;
                this.y = new java.util.BitSet(this.p);
                int v7_8 = new a2.s1[this.p];
                this.q = v7_8;
                int v7_9 = 0;
                while (v7_9 < this.p) {
                    this.q[v7_9] = new a2.s1(this, v7_9);
                    v7_9++;
                }
                this.o0();
            }
            a2.e0 v6_4 = v6_1.c;
            this.c(0);
            int v7_10 = this.F;
            if ((v7_10 != 0) && (v7_10.n != v6_4)) {
                v7_10.n = v6_4;
            }
            this.w = v6_4;
            this.o0();
            a2.e0 v6_6 = new a2.v();
            v6_6.a = 1;
            v6_6.f = 0;
            v6_6.g = 0;
            this.v = v6_6;
            this.r = a2.e0.a(this, this.t);
            this.s = a2.e0.a(this, (1 - this.t));
            return;
        }
    }

    public static int d1(int p2, int p3, int p4)
    {
        if ((p3 != 0) || (p4 != 0)) {
            int v0 = android.view.View$MeasureSpec.getMode(p2);
            if ((v0 == -2147483648) || (v0 == 1073741824)) {
                return android.view.View$MeasureSpec.makeMeasureSpec(Math.max(0, ((android.view.View$MeasureSpec.getSize(p2) - p3) - p4)), v0);
            }
        }
        return p2;
    }

    public final void A0(androidx.recyclerview.widget.RecyclerView p2, int p3)
    {
        a2.b0 v0_1 = new a2.b0(p2.getContext());
        v0_1.a = p3;
        this.B0(v0_1);
        return;
    }

    public final boolean C0()
    {
        if (this.F != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean D0()
    {
        if ((this.v() != 0) && ((this.C != 0) && (this.g))) {
            int v0_1;
            if (!this.x) {
                v0_1 = this.K0();
                this.L0();
            } else {
                v0_1 = this.L0();
                this.K0();
            }
            if ((v0_1 == 0) && (this.P0() != null)) {
                this.B.j();
                this.f = 1;
                this.o0();
                return 1;
            }
        }
        return 0;
    }

    public final int E0(a2.g1 p9)
    {
        if (this.v() != 0) {
            int v0_2 = (this.I ^ 1);
            return c4.b.m(p9, this.r, this.H0(v0_2), this.G0(v0_2), this, this.I, this.x);
        } else {
            return 0;
        }
    }

    public final int F0(a2.z0 p20, a2.v p21, a2.g1 p22)
    {
        int v5_2;
        int v4_6 = 0;
        java.util.BitSet v6_18 = 1;
        this.y.set(0, this.p, 1);
        int v3_6 = this.v;
        if (!v3_6.i) {
            if (p21.e != 1) {
                v5_2 = (p21.f - p21.b);
            } else {
                v5_2 = (p21.g + p21.b);
            }
        } else {
            if (p21.e != 1) {
                v5_2 = -2147483648;
            } else {
                v5_2 = 2147483647;
            }
        }
        int v10_0 = 0;
        while (v10_0 < this.p) {
            if (!this.q[v10_0].a.isEmpty()) {
                this.c1(this.q[v10_0], p21.e, v5_2);
            }
            v10_0++;
        }
        int v9_5;
        if (!this.x) {
            v9_5 = this.r.k();
        } else {
            v9_5 = this.r.g();
        }
        int v10_1 = 0;
        while(true) {
            int v11_27 = p21.c;
            if ((v11_27 < 0) || ((v11_27 >= p22.b()) || ((!v3_6.i) && (this.y.isEmpty())))) {
                break;
            }
            int v8_25;
            int v10_3 = p20.d(p21.c);
            p21.c = (p21.c + p21.d);
            int v11_34 = ((a2.p1) v10_3.getLayoutParams());
            int v13_13 = v11_34.a.b();
            int v14_6 = this.B;
            int v15_2 = ((int[]) v14_6.b);
            if ((v15_2 != 0) && (v13_13 < v15_2.length)) {
                v8_25 = v15_2[v13_13];
            } else {
                v8_25 = -1;
            }
            int v4_1;
            if (v8_25 != -1) {
                v4_1 = this.q[v8_25];
            } else {
                int v15_0;
                int v16;
                int v8_3;
                if (!this.T0(p21.e)) {
                    v16 = v6_18;
                    v15_0 = this.p;
                    v8_3 = v4_6;
                } else {
                    v8_3 = (this.p - v6_18);
                    v15_0 = -1;
                    v16 = -1;
                }
                int v17 = 0;
                if (p21.e != v6_18) {
                    int v4_3 = this.r.g();
                    java.util.BitSet v6_0 = -2147483648;
                    while (v8_3 != v15_0) {
                        int v7_2 = this.q[v8_3];
                        int v12_0 = v7_2.h(v4_3);
                        if (v12_0 > v6_0) {
                            v17 = v7_2;
                            v6_0 = v12_0;
                        }
                        v8_3 += v16;
                    }
                } else {
                    int v7_4 = this.r.k();
                    int v4_4 = 2147483647;
                    while (v8_3 != v15_0) {
                        int v12_26 = this.q[v8_3];
                        java.util.BitSet v6_19 = v12_26.f(v7_4);
                        if (v6_19 < v4_4) {
                            v4_4 = v6_19;
                            v17 = v12_26;
                        }
                        v8_3 += v16;
                        int v12 = -1;
                    }
                }
                v4_1 = v17;
                v14_6.l(v13_13);
                ((int[]) v14_6.b)[v13_13] = v4_1.e;
            }
            int v8_5;
            v11_34.e = v4_1;
            if (p21.e != 1) {
                v8_5 = 0;
                this.b(v10_3, 0, 0);
            } else {
                v8_5 = 0;
                this.b(v10_3, -1, 0);
            }
            if (this.t != 1) {
                this.R0(v10_3, a2.t0.w(1, this.n, this.l, (this.E() + this.D()), v11_34.width), a2.t0.w(0, this.u, this.m, 0, v11_34.height));
            } else {
                this.R0(v10_3, a2.t0.w(v8_5, this.u, this.l, v8_5, v11_34.width), a2.t0.w(1, this.o, this.m, (this.C() + this.F()), v11_34.height));
            }
            int v7_7;
            java.util.BitSet v6_13;
            if (p21.e != 1) {
                v7_7 = v4_1.h(v9_5);
                v6_13 = (v7_7 - this.r.c(v10_3));
            } else {
                v6_13 = v4_1.f(v9_5);
                v7_7 = (this.r.c(v10_3) + v6_13);
            }
            if (p21.e != 1) {
                int v8_12 = v11_34.e;
                v8_12.getClass();
                int v11_1 = ((a2.p1) v10_3.getLayoutParams());
                v11_1.e = v8_12;
                int v12_7 = v8_12.a;
                v12_7.add(0, v10_3);
                v8_12.b = -2147483648;
                if (v12_7.size() == 1) {
                    v8_12.c = -2147483648;
                }
                if ((v11_1.a.h()) || (v11_1.a.k())) {
                    v8_12.d = (v8_12.f.r.c(v10_3) + v8_12.d);
                }
            } else {
                int v8_13 = v11_34.e;
                v8_13.getClass();
                int v11_6 = ((a2.p1) v10_3.getLayoutParams());
                v11_6.e = v8_13;
                int v13_7 = v8_13.a;
                v13_7.add(v10_3);
                v8_13.c = -2147483648;
                if (v13_7.size() == 1) {
                    v8_13.b = -2147483648;
                }
                if ((v11_6.a.h()) || (v11_6.a.k())) {
                    v8_13.d = (v8_13.f.r.c(v10_3) + v8_13.d);
                }
            }
            if ((!this.Q0()) || (this.t != 1)) {
                int v11_14 = (this.s.k() + (v4_1.e * this.u));
                int v8_20 = (this.s.c(v10_3) + v11_14);
            } else {
                v8_20 = (this.s.g() - (((this.p - 1) - v4_1.e) * this.u));
                v11_14 = (v8_20 - this.s.c(v10_3));
            }
            if (this.t != 1) {
                a2.t0.N(v10_3, v6_13, v11_14, v7_7, v8_20);
            } else {
                a2.t0.N(v10_3, v11_14, v6_13, v8_20, v7_7);
            }
            this.c1(v4_1, v3_6.e, v5_2);
            this.V0(p20, v3_6);
            if ((v3_6.h) && (v10_3.hasFocusable())) {
                this.y.set(v4_1.e, 0);
            }
            v6_18 = 1;
            v10_1 = 1;
            v4_6 = 0;
        }
        if (v10_1 == 0) {
            this.V0(p20, v3_6);
        }
        int v3_3;
        if (v3_6.e != -1) {
            v3_3 = (this.M0(this.r.g()) - this.r.g());
        } else {
            v3_3 = (this.r.k() - this.N0(this.r.k()));
        }
        if (v3_3 <= 0) {
            return 0;
        } else {
            return Math.min(p21.b, v3_3);
        }
    }

    public final android.view.View G0(boolean p8)
    {
        int v0_1 = this.r.k();
        int v1_1 = this.r.g();
        int v2_0 = (this.v() - 1);
        android.view.View v3 = 0;
        while (v2_0 >= 0) {
            android.view.View v4 = this.u(v2_0);
            int v5_1 = this.r.e(v4);
            int v6_1 = this.r.b(v4);
            if ((v6_1 > v0_1) && (v5_1 < v1_1)) {
                if ((v6_1 > v1_1) && (p8)) {
                    if (v3 == null) {
                        v3 = v4;
                    }
                } else {
                    return v4;
                }
            }
            v2_0--;
        }
        return v3;
    }

    public final android.view.View H0(boolean p9)
    {
        int v0_1 = this.r.k();
        int v1_1 = this.r.g();
        int v2 = this.v();
        android.view.View v3 = 0;
        int v4 = 0;
        while (v4 < v2) {
            android.view.View v5 = this.u(v4);
            int v6_1 = this.r.e(v5);
            if ((this.r.b(v5) > v0_1) && (v6_1 < v1_1)) {
                if ((v6_1 < v0_1) && (p9)) {
                    if (v3 == null) {
                        v3 = v5;
                    }
                } else {
                    return v5;
                }
            }
            v4++;
        }
        return v3;
    }

    public final int I(a2.z0 p1, a2.g1 p2)
    {
        if (this.t != 0) {
            return -1;
        } else {
            return Math.min(this.p, p2.b());
        }
    }

    public final void I0(a2.z0 p3, a2.g1 p4, boolean p5)
    {
        int v1_0 = this.M0(-2147483648);
        if (v1_0 != -2147483648) {
            int v0_4 = (this.r.g() - v1_0);
            if (v0_4 > 0) {
                int v0_1 = (v0_4 - (- this.Z0((- v0_4), p3, p4)));
                if ((p5) && (v0_1 > 0)) {
                    this.r.o(v0_1);
                }
            }
        }
        return;
    }

    public final void J0(a2.z0 p3, a2.g1 p4, boolean p5)
    {
        int v1_1 = this.N0(2147483647);
        if (v1_1 != 2147483647) {
            int v1_2 = (v1_1 - this.r.k());
            if (v1_2 > 0) {
                int v1_0 = (v1_2 - this.Z0(v1_2, p3, p4));
                if ((p5) && (v1_0 > 0)) {
                    this.r.o((- v1_0));
                }
            }
        }
        return;
    }

    public final boolean K()
    {
        if (this.C == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int K0()
    {
        if (this.v() != 0) {
            return a2.t0.G(this.u(0));
        } else {
            return 0;
        }
    }

    public final boolean L()
    {
        return this.w;
    }

    public final int L0()
    {
        int v0_0 = this.v();
        if (v0_0 != 0) {
            return a2.t0.G(this.u((v0_0 - 1)));
        } else {
            return 0;
        }
    }

    public final int M0(int p4)
    {
        int v0_1 = this.q[0].f(p4);
        int v1_1 = 1;
        while (v1_1 < this.p) {
            int v2_1 = this.q[v1_1].f(p4);
            if (v2_1 > v0_1) {
                v0_1 = v2_1;
            }
            v1_1++;
        }
        return v0_1;
    }

    public final int N0(int p4)
    {
        int v0_1 = this.q[0].h(p4);
        int v1_1 = 1;
        while (v1_1 < this.p) {
            int v2_1 = this.q[v1_1].h(p4);
            if (v2_1 < v0_1) {
                v0_1 = v2_1;
            }
            v1_1++;
        }
        return v0_1;
    }

    public final void O(int p5)
    {
        super.O(p5);
        int v0 = 0;
        while (v0 < this.p) {
            a2.s1 v1_2 = this.q[v0];
            int v2_3 = v1_2.b;
            if (v2_3 != -2147483648) {
                v1_2.b = (v2_3 + p5);
            }
            int v2_1 = v1_2.c;
            if (v2_1 != -2147483648) {
                v1_2.c = (v2_1 + p5);
            }
            v0++;
        }
        return;
    }

    public final void O0(int p10, int p11, int p12)
    {
        int v0_1;
        if (!this.x) {
            v0_1 = this.K0();
        } else {
            v0_1 = this.L0();
        }
        int v2;
        int v3;
        if (p12 != 8) {
            v2 = (p10 + p11);
            v3 = p10;
        } else {
            if (p10 >= p11) {
                v2 = (p10 + 1);
                v3 = p11;
            } else {
                v2 = (p11 + 1);
            }
        }
        k2.c v4 = this.B;
        int v5_1 = ((int[]) v4.b);
        if ((v5_1 != 0) && (v3 < v5_1.length)) {
            int v5_16;
            int v5_4 = ((java.util.ArrayList) v4.c);
            if (v5_4 != 0) {
                int v7_3;
                if (v5_4 != 0) {
                    int v5_6 = (v5_4.size() - 1);
                    while (v5_6 >= 0) {
                        v7_3 = ((a2.q1) ((java.util.ArrayList) v4.c).get(v5_6));
                        if (v7_3.a != v3) {
                            v5_6--;
                        }
                    }
                    v7_3 = 0;
                }
                if (v7_3 != 0) {
                    ((java.util.ArrayList) v4.c).remove(v7_3);
                }
                int v5_11 = ((java.util.ArrayList) v4.c).size();
                int v7_4 = 0;
                while (v7_4 < v5_11) {
                    if (((a2.q1) ((java.util.ArrayList) v4.c).get(v7_4)).a < v3) {
                        v7_4++;
                    }
                    if (v7_4 == -1) {
                        v5_16 = -1;
                    } else {
                        int v5_15 = ((a2.q1) ((java.util.ArrayList) v4.c).get(v7_4));
                        ((java.util.ArrayList) v4.c).remove(v7_4);
                        v5_16 = v5_15.a;
                    }
                }
                v7_4 = -1;
            }
            if (v5_16 != -1) {
                java.util.Arrays.fill(((int[]) v4.b), v3, Math.min((v5_16 + 1), ((int[]) v4.b).length), -1);
            } else {
                int v5_20 = ((int[]) v4.b);
                java.util.Arrays.fill(v5_20, v3, v5_20.length, -1);
            }
        }
        if (p12 == 1) {
            v4.u(p10, p11);
        } else {
            if (p12 == 2) {
                v4.v(p10, p11);
            } else {
                if (p12 == 8) {
                    v4.v(p10, 1);
                    v4.u(p11, 1);
                }
            }
        }
        if (v2 > v0_1) {
            int v10_1;
            if (!this.x) {
                v10_1 = this.L0();
            } else {
                v10_1 = this.K0();
            }
            if (v3 <= v10_1) {
                this.o0();
            }
        }
        return;
    }

    public final void P(int p5)
    {
        super.P(p5);
        int v0 = 0;
        while (v0 < this.p) {
            a2.s1 v1_2 = this.q[v0];
            int v2_3 = v1_2.b;
            if (v2_3 != -2147483648) {
                v1_2.b = (v2_3 + p5);
            }
            int v2_1 = v1_2.c;
            if (v2_1 != -2147483648) {
                v1_2.c = (v2_1 + p5);
            }
            v0++;
        }
        return;
    }

    public final android.view.View P0()
    {
        int v3_2;
        a2.p1 v0_0 = this.v();
        int v1_2 = (v0_0 - 1);
        java.util.BitSet v2_1 = new java.util.BitSet(this.p);
        v2_1.set(0, this.p, 1);
        int v6 = -1;
        if ((this.t != 1) || (!this.Q0())) {
            v3_2 = -1;
        } else {
            v3_2 = 1;
        }
        if (!this.x) {
            v1_2 = 0;
        } else {
            v0_0 = -1;
        }
        if (v1_2 < v0_0) {
            v6 = 1;
        }
        while (v1_2 != v0_0) {
            android.view.View v7_1 = this.u(v1_2);
            int v8_5 = ((a2.p1) v7_1.getLayoutParams());
            if (v2_1.get(v8_5.e.e)) {
                int v9_8 = v8_5.e;
                if (!this.x) {
                    int v10_1 = v9_8.b;
                    java.util.ArrayList v12 = v9_8.a;
                    if (v10_1 == -2147483648) {
                        int v10_3 = ((android.view.View) v12.get(0));
                        int v11_2 = ((a2.p1) v10_3.getLayoutParams());
                        v9_8.b = v9_8.f.r.e(v10_3);
                        v11_2.getClass();
                        v10_1 = v9_8.b;
                    }
                    if (v10_1 > this.r.k()) {
                        ((a2.p1) ((android.view.View) v12.get(0)).getLayoutParams()).getClass();
                        return v7_1;
                    }
                } else {
                    int v10_5 = v9_8.c;
                    if (v10_5 == -2147483648) {
                        v9_8.a();
                        v10_5 = v9_8.c;
                    }
                    if (v10_5 < this.r.g()) {
                        a2.p1 v0_1 = v9_8.a;
                        ((a2.p1) ((android.view.View) v0_1.get((v0_1.size() - 1))).getLayoutParams()).getClass();
                        return v7_1;
                    }
                }
                v2_1.clear(v8_5.e.e);
            }
            v1_2 += v6;
            if (v1_2 != v0_0) {
                int v9_13 = this.u(v1_2);
                if (!this.x) {
                    int v10_8 = this.r.e(v7_1);
                    int v11_6 = this.r.e(v9_13);
                    if (v10_8 <= v11_6) {
                        if (v10_8 == v11_6) {
                            int v8_3;
                            if ((v8_5.e.e - ((a2.p1) v9_13.getLayoutParams()).e.e) >= 0) {
                                v8_3 = 0;
                            } else {
                                v8_3 = 1;
                            }
                            int v9_4;
                            if (v3_2 >= 0) {
                                v9_4 = 0;
                            } else {
                                v9_4 = 1;
                            }
                            if (v8_3 != v9_4) {
                            }
                        }
                    }
                } else {
                    int v10_10 = this.r.b(v7_1);
                    int v11_8 = this.r.b(v9_13);
                    if (v10_10 >= v11_8) {
                        if (v10_10 == v11_8) {
                        }
                    }
                }
                return v7_1;
            }
        }
        return 0;
    }

    public final void Q()
    {
        this.B.j();
        int v0_1 = 0;
        while (v0_1 < this.p) {
            this.q[v0_1].b();
            v0_1++;
        }
        return;
    }

    public final boolean Q0()
    {
        if (this.b.getLayoutDirection() != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void R0(android.view.View p6, int p7, int p8)
    {
        boolean v0_0 = this.b;
        int v1_0 = this.G;
        if (v0_0) {
            v1_0.set(v0_0.N(p6));
        } else {
            v1_0.set(0, 0, 0, 0);
        }
        boolean v0_1 = ((a2.p1) p6.getLayoutParams());
        int v7_1 = androidx.recyclerview.widget.StaggeredGridLayoutManager.d1(p7, (v0_1.leftMargin + v1_0.left), (v0_1.rightMargin + v1_0.right));
        int v8_1 = androidx.recyclerview.widget.StaggeredGridLayoutManager.d1(p8, (v0_1.topMargin + v1_0.top), (v0_1.bottomMargin + v1_0.bottom));
        if (this.x0(p6, v7_1, v8_1, v0_1)) {
            p6.measure(v7_1, v8_1);
        }
        return;
    }

    public final void S(androidx.recyclerview.widget.RecyclerView p3)
    {
        int v0_0 = this.b;
        if (v0_0 != 0) {
            v0_0.removeCallbacks(this.K);
        }
        int v0_1 = 0;
        while (v0_1 < this.p) {
            this.q[v0_1].b();
            v0_1++;
        }
        p3.requestLayout();
        return;
    }

    public final void S0(a2.z0 p17, a2.g1 p18, boolean p19)
    {
        a2.o1 v5 = this.H;
        if (((this.F == null) && (this.z == -1)) || (p18.b() != 0)) {
            boolean v3_4;
            int v6_0 = v5.g;
            int v8 = 1;
            if ((v5.e) && ((this.z == -1) && (this.F == null))) {
                v3_4 = 0;
            } else {
                v3_4 = 1;
            }
            android.view.View v9_0 = this.B;
            if (v3_4) {
                v5.a();
                int v11_27 = this.F;
                if (v11_27 == 0) {
                    this.Y0();
                    v5.c = this.x;
                } else {
                    int v12_31 = v11_27.c;
                    if (v12_31 > 0) {
                        if (v12_31 != this.p) {
                            v11_27.d = 0;
                            v11_27.c = 0;
                            v11_27.e = 0;
                            v11_27.f = 0;
                            v11_27.m = 0;
                            v11_27.a = v11_27.b;
                        } else {
                            int v11_50 = 0;
                            while (v11_50 < this.p) {
                                this.q[v11_50].b();
                                int v12_39 = this.F;
                                int v14_5 = v12_39.d[v11_50];
                                if (v14_5 != -2147483648) {
                                    int v12_42;
                                    if (!v12_39.o) {
                                        v12_42 = this.r.k();
                                    } else {
                                        v12_42 = this.r.g();
                                    }
                                    v14_5 += v12_42;
                                }
                                int v12_45 = this.q[v11_50];
                                v12_45.b = v14_5;
                                v12_45.c = v14_5;
                                v11_50++;
                            }
                        }
                    }
                    int v11_51 = this.F;
                    this.E = v11_51.p;
                    int v11_52 = v11_51.n;
                    this.c(0);
                    int v12_46 = this.F;
                    if ((v12_46 != 0) && (v12_46.n != v11_52)) {
                        v12_46.n = v11_52;
                    }
                    this.w = v11_52;
                    this.o0();
                    this.Y0();
                    int v11_53 = this.F;
                    int v12_47 = v11_53.a;
                    if (v12_47 == -1) {
                        v5.c = this.x;
                    } else {
                        this.z = v12_47;
                        v5.c = v11_53.o;
                    }
                    if (v11_53.e > 1) {
                        v9_0.b = v11_53.f;
                        v9_0.c = v11_53.m;
                    }
                }
                if (p18.g) {
                    a2.e0 v13_10;
                    if (!this.D) {
                        int v11_21 = p18.b();
                        int v12_23 = this.v();
                        a2.e0 v13_9 = 0;
                        while (v13_9 < v12_23) {
                            int v14_1 = a2.t0.G(this.u(v13_9));
                            if ((v14_1 < 0) || (v14_1 >= v11_21)) {
                                v13_9++;
                            } else {
                                v13_10 = v14_1;
                            }
                        }
                        v13_10 = 0;
                    } else {
                        int v11_22 = p18.b();
                        int v12_25 = (this.v() - 1);
                        while (v12_25 >= 0) {
                            v13_10 = a2.t0.G(this.u(v12_25));
                            if ((v13_10 < null) || (v13_10 >= v11_22)) {
                                v12_25--;
                            }
                        }
                    }
                    v5.a = v13_10;
                    v5.b = -2147483648;
                } else {
                    int v11_56 = this.z;
                    if (v11_56 != -1) {
                        if ((v11_56 >= 0) && (v11_56 < p18.b())) {
                            int v11_57 = this.F;
                            if ((v11_57 != 0) && ((v11_57.a != -1) && (v11_57.c >= 1))) {
                                v5.b = -2147483648;
                                v5.a = this.z;
                            } else {
                                int v11_61 = this.q(this.z);
                                if (v11_61 == 0) {
                                    int v11_62 = this.z;
                                    v5.a = v11_62;
                                    int v12_54 = this.A;
                                    if (v12_54 != -2147483648) {
                                        if (!v5.c) {
                                            v5.b = (v6_0.r.k() + v12_54);
                                        } else {
                                            v5.b = (v6_0.r.g() - v12_54);
                                        }
                                    } else {
                                        int v11_8;
                                        if (this.v() != 0) {
                                            int v11_6;
                                            if (v11_62 >= this.K0()) {
                                                v11_6 = 0;
                                            } else {
                                                v11_6 = 1;
                                            }
                                            if (v11_6 == this.x) {
                                                v11_8 = 1;
                                            } else {
                                                v11_8 = 0;
                                            }
                                        } else {
                                            if (!this.x) {
                                            }
                                        }
                                        int v11_10;
                                        v5.c = v11_8;
                                        if (v11_8 == 0) {
                                            v11_10 = v6_0.r.k();
                                        } else {
                                            v11_10 = v6_0.r.g();
                                        }
                                        v5.b = v11_10;
                                    }
                                    v5.d = 1;
                                } else {
                                    int v12_4;
                                    if (!this.x) {
                                        v12_4 = this.K0();
                                    } else {
                                        v12_4 = this.L0();
                                    }
                                    v5.a = v12_4;
                                    if (this.A == -2147483648) {
                                        if (this.r.c(v11_61) <= this.r.l()) {
                                            int v12_10 = (this.r.e(v11_61) - this.r.k());
                                            if (v12_10 >= 0) {
                                                int v12_13 = (this.r.g() - this.r.b(v11_61));
                                                if (v12_13 >= 0) {
                                                    v5.b = -2147483648;
                                                } else {
                                                    v5.b = v12_13;
                                                }
                                            } else {
                                                v5.b = (- v12_10);
                                            }
                                        } else {
                                            int v11_16;
                                            if (!v5.c) {
                                                v11_16 = this.r.k();
                                            } else {
                                                v11_16 = this.r.g();
                                            }
                                            v5.b = v11_16;
                                        }
                                    } else {
                                        if (!v5.c) {
                                            v5.b = ((this.r.k() + this.A) - this.r.e(v11_61));
                                        } else {
                                            v5.b = ((this.r.g() - this.A) - this.r.b(v11_61));
                                        }
                                    }
                                }
                            }
                        } else {
                            this.z = -1;
                            this.A = -2147483648;
                        }
                    }
                }
                v5.e = 1;
            }
            if ((this.F == null) && ((this.z == -1) && ((v5.c != this.D) || (this.Q0() != this.E)))) {
                v9_0.j();
                v5.d = 1;
            }
            if (this.v() > 0) {
                android.view.View v9_2 = this.F;
                if ((v9_2 == null) || (v9_2.c < 1)) {
                    if (!v5.d) {
                        if ((!v3_4) && (v5.f != null)) {
                            boolean v3_6 = 0;
                            while (v3_6 < this.p) {
                                int v6_3 = this.q[v3_6];
                                v6_3.b();
                                android.view.View v9_6 = v5.f[v3_6];
                                v6_3.b = v9_6;
                                v6_3.c = v9_6;
                                v3_6++;
                            }
                        } else {
                            boolean v3_7 = 0;
                            while (v3_7 < this.p) {
                                int v14_2;
                                android.view.View v9_10 = this.q[v3_7];
                                int v11_31 = this.x;
                                int v12_30 = v5.b;
                                a2.e0 v13_12 = v9_10.f;
                                if (v11_31 == 0) {
                                    v14_2 = v9_10.h(-2147483648);
                                } else {
                                    v14_2 = v9_10.f(-2147483648);
                                }
                                v9_10.b();
                                if (((v14_2 != -2147483648) && ((v11_31 == 0) || (v14_2 >= v13_12.r.g()))) && ((v11_31 != 0) || (v14_2 <= v13_12.r.k()))) {
                                    if (v12_30 != -2147483648) {
                                        v14_2 += v12_30;
                                    }
                                    v9_10.c = v14_2;
                                    v9_10.b = v14_2;
                                }
                                v3_7++;
                            }
                            boolean v3_8 = this.q;
                            android.view.View v9_8 = v3_8.length;
                            int v11_28 = v5.f;
                            if ((v11_28 == 0) || (v11_28.length < v9_8)) {
                                int v6_6 = new int[v6_0.q.length];
                                v5.f = v6_6;
                            }
                            int v6_7 = 0;
                            while (v6_7 < v9_8) {
                                v5.f[v6_7] = v3_8[v6_7].h(-2147483648);
                                v6_7++;
                            }
                        }
                    } else {
                        boolean v3_10 = 0;
                        while (v3_10 < this.p) {
                            this.q[v3_10].b();
                            int v6_19 = v5.b;
                            if (v6_19 != -2147483648) {
                                android.view.View v9_30 = this.q[v3_10];
                                v9_30.b = v6_19;
                                v9_30.c = v6_19;
                            }
                            v3_10++;
                        }
                    }
                }
            }
            this.p(p17);
            boolean v3_11 = this.v;
            v3_11.a = 0;
            int v6_10 = this.s.l();
            this.u = (v6_10 / this.p);
            android.view.View$MeasureSpec.makeMeasureSpec(v6_10, this.s.i());
            this.b1(v5.a, p18);
            if (!v5.c) {
                this.a1(1);
                this.F0(p17, v3_11, p18);
                this.a1(-1);
                v3_11.c = (v5.a + v3_11.d);
                this.F0(p17, v3_11, p18);
            } else {
                this.a1(-1);
                this.F0(p17, v3_11, p18);
                this.a1(1);
                v3_11.c = (v5.a + v3_11.d);
                this.F0(p17, v3_11, p18);
            }
            if (this.s.i() != 1073741824) {
                boolean v3_14 = this.v();
                int v4_5 = 0;
                int v6_15 = 0;
                while (v6_15 < v3_14) {
                    android.view.View v9_26 = this.u(v6_15);
                    int v11_49 = ((float) this.s.c(v9_26));
                    if (v11_49 >= v4_5) {
                        ((a2.p1) v9_26.getLayoutParams()).getClass();
                        v4_5 = Math.max(v4_5, v11_49);
                    }
                    v6_15++;
                }
                int v6_16 = this.u;
                int v4_7 = Math.round((v4_5 * ((float) this.p)));
                if (this.s.i() == -2147483648) {
                    v4_7 = Math.min(v4_7, this.s.l());
                }
                this.u = (v4_7 / this.p);
                android.view.View$MeasureSpec.makeMeasureSpec(v4_7, this.s.i());
                if (this.u != v6_16) {
                    int v4_9 = 0;
                    while (v4_9 < v3_14) {
                        android.view.View v9_25 = this.u(v4_9);
                        int v10_2 = ((a2.p1) v9_25.getLayoutParams());
                        v10_2.getClass();
                        if ((!this.Q0()) || (this.t != 1)) {
                            int v10_4 = v10_2.e.e;
                            int v11_38 = (this.u * v10_4);
                            int v10_5 = (v10_4 * v6_16);
                            if (this.t != 1) {
                                v9_25.offsetTopAndBottom((v11_38 - v10_5));
                            } else {
                                v9_25.offsetLeftAndRight((v11_38 - v10_5));
                            }
                        } else {
                            int v10_8 = (- ((this.p - 1) - v10_2.e.e));
                            v9_25.offsetLeftAndRight(((this.u * v10_8) - (v10_8 * v6_16)));
                        }
                        v4_9++;
                    }
                }
            }
            if (this.v() > 0) {
                if (!this.x) {
                    this.J0(p17, p18, 1);
                    this.I0(p17, p18, 0);
                } else {
                    this.I0(p17, p18, 1);
                    this.J0(p17, p18, 0);
                }
            }
            if ((!p19) || ((p18.g) || ((this.C == 0) || ((this.v() <= 0) || (this.P0() == null))))) {
                v8 = 0;
            } else {
                boolean v3_21 = this.b;
                if (v3_21) {
                    v3_21.removeCallbacks(this.K);
                }
                if (!this.D0()) {
                }
            }
            if (p18.g) {
                v5.a();
            }
            this.D = v5.c;
            this.E = this.Q0();
            if (v8 != 0) {
                v5.a();
                this.S0(p17, p18, 0);
            }
            return;
        } else {
            this.j0(p17);
            v5.a();
            return;
        }
    }

    public final android.view.View T(android.view.View p9, int p10, a2.z0 p11, a2.g1 p12)
    {
        if (this.v() != 0) {
            int v9_1;
            a2.s1 v0_5 = this.b;
            if (v0_5 != null) {
                v9_1 = v0_5.D(p9);
                if ((v9_1 == 0) || (((java.util.ArrayList) this.a.e).contains(v9_1))) {
                    v9_1 = 0;
                }
            }
            if (v9_1 != 0) {
                int v10_17;
                this.Y0();
                if (p10 == 1) {
                    if ((this.t == 1) || (!this.Q0())) {
                        v10_17 = -1;
                    } else {
                        v10_17 = 1;
                    }
                } else {
                    if (p10 == 2) {
                        if ((this.t == 1) || (!this.Q0())) {
                        }
                    } else {
                        if (p10 == 17) {
                            if (this.t == 0) {
                            }
                        } else {
                            if (p10 == 33) {
                                if (this.t == 1) {
                                }
                            } else {
                                if (p10 == 66) {
                                    if (this.t == 0) {
                                    }
                                } else {
                                    if ((p10 == 130) && (this.t == 1)) {
                                    }
                                }
                            }
                        }
                        v10_17 = -2147483648;
                    }
                }
                if (v10_17 != -2147483648) {
                    int v4_5;
                    a2.s1 v0_7 = ((a2.p1) v9_1.getLayoutParams());
                    v0_7.getClass();
                    a2.s1 v0_8 = v0_7.e;
                    if (v10_17 != 1) {
                        v4_5 = this.K0();
                    } else {
                        v4_5 = this.L0();
                    }
                    this.b1(v4_5, p12);
                    this.a1(v10_17);
                    a2.v v5 = this.v;
                    v5.c = (v5.d + v4_5);
                    v5.b = ((int) (((float) this.r.l()) * 1051372203));
                    v5.h = 1;
                    int v6_0 = 0;
                    v5.a = 0;
                    this.F0(p11, v5, p12);
                    this.D = this.x;
                    int v11_8 = v0_8.g(v4_5, v10_17);
                    if ((v11_8 == 0) || (v11_8 == v9_1)) {
                        if (!this.T0(v10_17)) {
                            int v11_1 = 0;
                            while (v11_1 < this.p) {
                                android.view.View v12_17 = this.q[v11_1].g(v4_5, v10_17);
                                if ((v12_17 == null) || (v12_17 == v9_1)) {
                                    v11_1++;
                                } else {
                                    return v12_17;
                                }
                            }
                        } else {
                            int v11_3 = (this.p - 1);
                            while (v11_3 >= 0) {
                                android.view.View v12_13 = this.q[v11_3].g(v4_5, v10_17);
                                if ((v12_13 == null) || (v12_13 == v9_1)) {
                                    v11_3--;
                                } else {
                                    return v12_13;
                                }
                            }
                        }
                        android.view.View v12_1;
                        if (v10_17 != -1) {
                            v12_1 = 0;
                        } else {
                            v12_1 = 1;
                        }
                        int v11_6;
                        if ((this.w ^ 1) != v12_1) {
                            v11_6 = 0;
                        } else {
                            v11_6 = 1;
                        }
                        android.view.View v12_2;
                        if (v11_6 == 0) {
                            v12_2 = v0_8.d();
                        } else {
                            v12_2 = v0_8.c();
                        }
                        android.view.View v12_3 = this.q(v12_2);
                        if ((v12_3 == null) || (v12_3 == v9_1)) {
                            if (this.T0(v10_17)) {
                                int v10_10 = (this.p - 1);
                                while (v10_10 >= 0) {
                                    if (v10_10 != v0_8.e) {
                                        android.view.View v12_7;
                                        if (v11_6 == 0) {
                                            v12_7 = this.q[v10_10].d();
                                        } else {
                                            v12_7 = this.q[v10_10].c();
                                        }
                                        android.view.View v12_10 = this.q(v12_7);
                                        if ((v12_10 != null) && (v12_10 != v9_1)) {
                                            return v12_10;
                                        }
                                    }
                                    v10_10--;
                                }
                                return 0;
                            }
                            while (v6_0 < this.p) {
                                int v10_5;
                                if (v11_6 == 0) {
                                    v10_5 = this.q[v6_0].d();
                                } else {
                                    v10_5 = this.q[v6_0].c();
                                }
                                int v10_8 = this.q(v10_5);
                                if ((v10_8 == 0) || (v10_8 == v9_1)) {
                                    v6_0++;
                                } else {
                                    return v10_8;
                                }
                            }
                        } else {
                            return v12_3;
                        }
                    } else {
                        return v11_8;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean T0(int p5)
    {
        if (this.t != 0) {
            int v5_3;
            if (p5 != -1) {
                v5_3 = 0;
            } else {
                v5_3 = 1;
            }
            int v5_1;
            if (v5_3 != this.x) {
                v5_1 = 0;
            } else {
                v5_1 = 1;
            }
            if (v5_1 != this.Q0()) {
                return 0;
            } else {
                return 1;
            }
        } else {
            int v5_2;
            if (p5 != -1) {
                v5_2 = 0;
            } else {
                v5_2 = 1;
            }
            if (v5_2 == this.x) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final void U(android.view.accessibility.AccessibilityEvent p3)
    {
        super.U(p3);
        if (this.v() > 0) {
            int v1_1 = this.H0(0);
            int v0_3 = this.G0(0);
            if ((v1_1 != 0) && (v0_3 != 0)) {
                int v1_0 = a2.t0.G(v1_1);
                int v0_0 = a2.t0.G(v0_3);
                if (v1_0 >= v0_0) {
                    p3.setFromIndex(v0_0);
                    p3.setToIndex(v1_0);
                } else {
                    p3.setFromIndex(v1_0);
                    p3.setToIndex(v0_0);
                    return;
                }
            }
        }
        return;
    }

    public final void U0(int p5, a2.g1 p6)
    {
        int v2;
        int v1_1;
        if (p5 <= 0) {
            v1_1 = this.K0();
            v2 = -1;
        } else {
            v1_1 = this.L0();
            v2 = 1;
        }
        a2.v v3 = this.v;
        v3.a = 1;
        this.b1(v1_1, p6);
        this.a1(v2);
        v3.c = (v1_1 + v3.d);
        v3.b = Math.abs(p5);
        return;
    }

    public final void V(a2.z0 p1, a2.g1 p2, r0.c p3)
    {
        super.V(p1, p2, p3);
        p3.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
        return;
    }

    public final void V0(a2.z0 p5, a2.v p6)
    {
        if ((p6.a) && (!p6.i)) {
            if (p6.b != 0) {
                int v2 = 1;
                if (p6.e != -1) {
                    int v0_1 = p6.g;
                    int v1_2 = this.q[0].f(v0_1);
                    while (v2 < this.p) {
                        int v3_3 = this.q[v2].f(v0_1);
                        if (v3_3 < v1_2) {
                            v1_2 = v3_3;
                        }
                        v2++;
                    }
                    int v6_3;
                    int v1_3 = (v1_2 - p6.g);
                    if (v1_3 >= 0) {
                        v6_3 = (Math.min(v1_3, p6.b) + p6.f);
                    } else {
                        v6_3 = p6.f;
                    }
                    this.X0(p5, v6_3);
                } else {
                    int v0_5 = p6.f;
                    int v1_6 = this.q[0].h(v0_5);
                    while (v2 < this.p) {
                        int v3_7 = this.q[v2].h(v0_5);
                        if (v3_7 > v1_6) {
                            v1_6 = v3_7;
                        }
                        v2++;
                    }
                    int v6_6;
                    int v0_7 = (v0_5 - v1_6);
                    if (v0_7 >= 0) {
                        v6_6 = (p6.g - Math.min(v0_7, p6.b));
                    } else {
                        v6_6 = p6.g;
                    }
                    this.W0(p5, v6_6);
                    return;
                }
            } else {
                if (p6.e != -1) {
                    this.X0(p5, p6.f);
                    return;
                } else {
                    this.W0(p5, p6.g);
                    return;
                }
            }
        }
        return;
    }

    public final void W(a2.z0 p3, a2.g1 p4, android.view.View p5, r0.c p6)
    {
        k4.i v3_0 = p5.getLayoutParams();
        if ((v3_0 instanceof a2.p1)) {
            k4.i v3_7 = ((a2.p1) v3_0);
            if (this.t != 0) {
                k4.i v3_2;
                k4.i v3_1 = v3_7.e;
                if (v3_1 != null) {
                    v3_2 = v3_1.e;
                } else {
                    v3_2 = -1;
                }
                p6.j(k4.i.c(0, -1, -1, v3_2, 1));
                return;
            } else {
                k4.i v3_5;
                k4.i v3_4 = v3_7.e;
                if (v3_4 != null) {
                    v3_5 = v3_4.e;
                } else {
                    v3_5 = -1;
                }
                p6.j(k4.i.c(0, v3_5, 1, -1, -1));
                return;
            }
        } else {
            this.X(p5, p6);
            return;
        }
    }

    public final void W0(a2.z0 p9, int p10)
    {
        int v0_1 = (this.v() - 1);
        while (v0_1 >= 0) {
            android.view.View v2 = this.u(v0_1);
            if ((this.r.e(v2) < p10) || (this.r.n(v2) < p10)) {
                break;
            }
            a2.s1 v3_3 = ((a2.p1) v2.getLayoutParams());
            v3_3.getClass();
            if (v3_3.e.a.size() == 1) {
                break;
            }
            a2.s1 v3_4 = v3_3.e;
            int v4_3 = v3_4.a;
            int v5 = v4_3.size();
            int v4_5 = ((android.view.View) v4_3.remove((v5 - 1)));
            int v6_2 = ((a2.p1) v4_5.getLayoutParams());
            v6_2.e = 0;
            if ((v6_2.a.h()) || (v6_2.a.k())) {
                v3_4.d = (v3_4.d - v3_4.f.r.c(v4_5));
            }
            if (v5 == 1) {
                v3_4.b = -2147483648;
            }
            v3_4.c = -2147483648;
            this.l0(v2, p9);
            v0_1--;
        }
        return;
    }

    public final void X0(a2.z0 p7, int p8)
    {
        while (this.v() > 0) {
            android.view.View v1 = this.u(0);
            if ((this.r.b(v1) > p8) || (this.r.m(v1) > p8)) {
                break;
            }
            a2.s1 v2_3 = ((a2.p1) v1.getLayoutParams());
            v2_3.getClass();
            if (v2_3.e.a.size() == 1) {
                break;
            }
            a2.s1 v2_4 = v2_3.e;
            int v3_3 = v2_4.a;
            int v0_2 = ((android.view.View) v3_3.remove(0));
            a2.e0 v4_2 = ((a2.p1) v0_2.getLayoutParams());
            v4_2.e = 0;
            if (v3_3.size() == 0) {
                v2_4.c = -2147483648;
            }
            if ((v4_2.a.h()) || (v4_2.a.k())) {
                v2_4.d = (v2_4.d - v2_4.f.r.c(v0_2));
            }
            v2_4.b = -2147483648;
            this.l0(v1, p7);
        }
        return;
    }

    public final void Y(int p2, int p3)
    {
        this.O0(p2, p3, 1);
        return;
    }

    public final void Y0()
    {
        if ((this.t != 1) && (this.Q0())) {
            this.x = (this.w ^ 1);
            return;
        } else {
            this.x = this.w;
            return;
        }
    }

    public final void Z()
    {
        this.B.j();
        this.o0();
        return;
    }

    public final int Z0(int p4, a2.z0 p5, a2.g1 p6)
    {
        if ((this.v() != 0) && (p4)) {
            this.U0(p4, p6);
            a2.v v0_1 = this.v;
            boolean v6_3 = this.F0(p5, v0_1, p6);
            if (v0_1.b >= v6_3) {
                if (p4) {
                    p4 = v6_3;
                } else {
                    p4 = (- v6_3);
                }
            }
            this.r.o((- p4));
            this.D = this.x;
            v0_1.b = 0;
            this.V0(p5, v0_1);
            return p4;
        } else {
            return 0;
        }
    }

    public final android.graphics.PointF a(int p4)
    {
        int v1 = -1;
        if (this.v() != 0) {
            int v4_5;
            if (p4 >= this.K0()) {
                v4_5 = 0;
            } else {
                v4_5 = 1;
            }
            if (v4_5 == this.x) {
                v1 = 1;
            }
        } else {
            if (this.x) {
            }
        }
        int v4_3 = new android.graphics.PointF();
        if (v1 != 0) {
            if (this.t != 0) {
                v4_3.x = 0;
                v4_3.y = ((float) v1);
                return v4_3;
            } else {
                v4_3.x = ((float) v1);
                v4_3.y = 0;
                return v4_3;
            }
        } else {
            return 0;
        }
    }

    public final void a0(int p2, int p3)
    {
        this.O0(p2, p3, 8);
        return;
    }

    public final void a1(int p5)
    {
        int v5_1;
        a2.v v0 = this.v;
        v0.e = p5;
        int v2 = 1;
        if (p5 != -1) {
            v5_1 = 0;
        } else {
            v5_1 = 1;
        }
        if (this.x != v5_1) {
            v2 = -1;
        }
        v0.d = v2;
        return;
    }

    public final void b0(int p2, int p3)
    {
        this.O0(p2, p3, 2);
        return;
    }

    public final void b1(int p5, a2.g1 p6)
    {
        int v6_1;
        int v5_1;
        a2.v v0 = this.v;
        int v1 = 0;
        v0.b = 0;
        v0.c = p5;
        int v2_8 = this.e;
        if ((v2_8 == 0) || (!v2_8.e)) {
            v5_1 = 0;
            v6_1 = 0;
        } else {
            int v6_5 = p6.a;
            if (v6_5 == -1) {
            } else {
                int v5_2;
                if (v6_5 >= p5) {
                    v5_2 = 0;
                } else {
                    v5_2 = 1;
                }
                if (this.x != v5_2) {
                    v6_1 = this.r.l();
                    v5_1 = 0;
                } else {
                    v5_1 = this.r.l();
                    v6_1 = 0;
                }
            }
        }
        int v2_2 = this.b;
        if ((v2_2 == 0) || (!v2_2.n)) {
            v0.g = (this.r.f() + v5_1);
            v0.f = (- v6_1);
        } else {
            v0.f = (this.r.k() - v6_1);
            v0.g = (this.r.g() + v5_1);
        }
        v0.h = 0;
        v0.a = 1;
        if ((this.r.i() == 0) && (this.r.f() == 0)) {
            v1 = 1;
        }
        v0.i = v1;
        return;
    }

    public final void c(String p2)
    {
        if (this.F == null) {
            super.c(p2);
        }
        return;
    }

    public final void c0(int p2, int p3)
    {
        this.O0(p2, p3, 4);
        return;
    }

    public final void c1(a2.s1 p6, int p7, int p8)
    {
        int v0 = p6.d;
        int v1 = p6.e;
        if (p7 != -1) {
            int v7_8 = p6.c;
            if (v7_8 == -2147483648) {
                p6.a();
                v7_8 = p6.c;
            }
            if ((v7_8 - v0) >= p8) {
                this.y.set(v1, 0);
            }
        } else {
            int v7_2 = p6.b;
            if (v7_2 == -2147483648) {
                int v7_5 = ((android.view.View) p6.a.get(0));
                a2.p1 v2_2 = ((a2.p1) v7_5.getLayoutParams());
                p6.b = p6.f.r.e(v7_5);
                v2_2.getClass();
                v7_2 = p6.b;
            }
            if ((v7_2 + v0) <= p8) {
                this.y.set(v1, 0);
                return;
            }
        }
        return;
    }

    public final boolean d()
    {
        if (this.t != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d0(a2.z0 p2, a2.g1 p3)
    {
        this.S0(p2, p3, 1);
        return;
    }

    public final boolean e()
    {
        if (this.t != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void e0(a2.g1 p1)
    {
        this.z = -1;
        this.A = -2147483648;
        this.F = 0;
        this.H.a();
        return;
    }

    public final boolean f(a2.u0 p1)
    {
        return (p1 instanceof a2.p1);
    }

    public final void f0(android.os.Parcelable p3)
    {
        if ((p3 instanceof a2.r1)) {
            this.F = ((a2.r1) p3);
            if (this.z != -1) {
                ((a2.r1) p3).a = -1;
                ((a2.r1) p3).b = -1;
                ((a2.r1) p3).d = 0;
                ((a2.r1) p3).c = 0;
                ((a2.r1) p3).e = 0;
                ((a2.r1) p3).f = 0;
                ((a2.r1) p3).m = 0;
            }
            this.o0();
        }
        return;
    }

    public final android.os.Parcelable g0()
    {
        a2.r1 v0_0 = this.F;
        if (v0_0 == null) {
            a2.r1 v0_2 = new a2.r1();
            v0_2.n = this.w;
            v0_2.o = this.D;
            v0_2.p = this.E;
            int v1_0 = 0;
            int v2_0 = this.B;
            if (v2_0 == 0) {
                v0_2.e = 0;
            } else {
                int v3_1 = ((int[]) v2_0.b);
                if (v3_1 == 0) {
                } else {
                    v0_2.f = v3_1;
                    v0_2.e = v3_1.length;
                    v0_2.m = ((java.util.ArrayList) v2_0.c);
                }
            }
            int v3_3 = -1;
            if (this.v() <= 0) {
                v0_2.a = -1;
                v0_2.b = -1;
                v0_2.c = 0;
                return v0_2;
            } else {
                int v2_5;
                if (!this.D) {
                    v2_5 = this.K0();
                } else {
                    v2_5 = this.L0();
                }
                int v2_7;
                v0_2.a = v2_5;
                if (!this.x) {
                    v2_7 = this.H0(1);
                } else {
                    v2_7 = this.G0(1);
                }
                if (v2_7 != 0) {
                    v3_3 = a2.t0.G(v2_7);
                }
                v0_2.b = v3_3;
                int v2_8 = this.p;
                v0_2.c = v2_8;
                int v2_9 = new int[v2_8];
                v0_2.d = v2_9;
                while (v1_0 < this.p) {
                    int v2_14;
                    int v3_6;
                    if (!this.D) {
                        v2_14 = this.q[v1_0].h(-2147483648);
                        if (v2_14 != -2147483648) {
                            v3_6 = this.r.k();
                            v2_14 -= v3_6;
                        }
                    } else {
                        v2_14 = this.q[v1_0].f(-2147483648);
                        if (v2_14 != -2147483648) {
                            v3_6 = this.r.g();
                        }
                    }
                    v0_2.d[v1_0] = v2_14;
                    v1_0++;
                }
                return v0_2;
            }
        } else {
            int v1_5 = new a2.r1();
            v1_5.c = v0_0.c;
            v1_5.a = v0_0.a;
            v1_5.b = v0_0.b;
            v1_5.d = v0_0.d;
            v1_5.e = v0_0.e;
            v1_5.f = v0_0.f;
            v1_5.n = v0_0.n;
            v1_5.o = v0_0.o;
            v1_5.p = v0_0.p;
            v1_5.m = v0_0.m;
            return v1_5;
        }
    }

    public final void h(int p5, int p6, a2.g1 p7, a2.r p8)
    {
        if (this.t != 0) {
            p5 = p6;
        }
        if ((this.v() != 0) && (p5 != 0)) {
            this.U0(p5, p7);
            int v5_5 = this.J;
            if ((v5_5 == 0) || (v5_5.length < this.p)) {
                int v5_3 = new int[this.p];
                this.J = v5_3;
            }
            int v5_4 = 0;
            int v6_2 = 0;
            int v0_1 = 0;
            while(true) {
                int[] v2_0 = this.v;
                if (v6_2 >= this.p) {
                    break;
                }
                int v1_8;
                int[] v2_1;
                if (v2_0.d != -1) {
                    v1_8 = this.q[v6_2].f(v2_0.g);
                    v2_1 = v2_0.g;
                } else {
                    v1_8 = v2_0.f;
                    v2_1 = this.q[v6_2].h(v1_8);
                }
                int v1_9 = (v1_8 - v2_1);
                if (v1_9 >= 0) {
                    this.J[v0_1] = v1_9;
                    v0_1++;
                }
                v6_2++;
            }
            java.util.Arrays.sort(this.J, 0, v0_1);
            while (v5_4 < v0_1) {
                int v6_4 = v2_0.c;
                if ((v6_4 < 0) || (v6_4 >= p7.b())) {
                    break;
                }
                p8.a(v2_0.c, this.J[v5_4]);
                v2_0.c = (v2_0.c + v2_0.d);
                v5_4++;
            }
        }
        return;
    }

    public final void h0(int p1)
    {
        if (p1 == 0) {
            this.D0();
        }
        return;
    }

    public final int j(a2.g1 p8)
    {
        if (this.v() != 0) {
            int v0_2 = (this.I ^ 1);
            return c4.b.l(p8, this.r, this.H0(v0_2), this.G0(v0_2), this, this.I);
        } else {
            return 0;
        }
    }

    public final int k(a2.g1 p1)
    {
        return this.E0(p1);
    }

    public final int l(a2.g1 p8)
    {
        if (this.v() != 0) {
            int v0_2 = (this.I ^ 1);
            return c4.b.n(p8, this.r, this.H0(v0_2), this.G0(v0_2), this, this.I);
        } else {
            return 0;
        }
    }

    public final int m(a2.g1 p8)
    {
        if (this.v() != 0) {
            int v0_2 = (this.I ^ 1);
            return c4.b.l(p8, this.r, this.H0(v0_2), this.G0(v0_2), this, this.I);
        } else {
            return 0;
        }
    }

    public final int n(a2.g1 p1)
    {
        return this.E0(p1);
    }

    public final int o(a2.g1 p8)
    {
        if (this.v() != 0) {
            int v0_2 = (this.I ^ 1);
            return c4.b.n(p8, this.r, this.H0(v0_2), this.G0(v0_2), this, this.I);
        } else {
            return 0;
        }
    }

    public final int p0(int p1, a2.z0 p2, a2.g1 p3)
    {
        return this.Z0(p1, p2, p3);
    }

    public final void q0(int p3)
    {
        a2.r1 v0 = this.F;
        if ((v0 != null) && (v0.a != p3)) {
            v0.d = 0;
            v0.c = 0;
            v0.a = -1;
            v0.b = -1;
        }
        this.z = p3;
        this.A = -2147483648;
        this.o0();
        return;
    }

    public final a2.u0 r()
    {
        if (this.t != 0) {
            return new a2.p1(-1, -2);
        } else {
            return new a2.p1(-2, -1);
        }
    }

    public final int r0(int p1, a2.z0 p2, a2.g1 p3)
    {
        return this.Z0(p1, p2, p3);
    }

    public final a2.u0 s(android.content.Context p2, android.util.AttributeSet p3)
    {
        return new a2.p1(p2, p3);
    }

    public final a2.u0 t(android.view.ViewGroup$LayoutParams p2)
    {
        if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
            return new a2.p1(p2);
        } else {
            return new a2.p1(((android.view.ViewGroup$MarginLayoutParams) p2));
        }
    }

    public final void u0(android.graphics.Rect p6, int p7, int p8)
    {
        int v7_1;
        int v6_6;
        java.util.WeakHashMap v1_1 = (this.E() + this.D());
        java.util.WeakHashMap v2_1 = (this.C() + this.F());
        int v4 = this.p;
        if (this.t != 1) {
            v7_1 = a2.t0.g(p7, (p6.width() + v1_1), this.b.getMinimumWidth());
            v6_6 = a2.t0.g(p8, ((this.u * v4) + v2_1), this.b.getMinimumHeight());
        } else {
            v6_6 = a2.t0.g(p8, (p6.height() + v2_1), this.b.getMinimumHeight());
            v7_1 = a2.t0.g(p7, ((this.u * v4) + v1_1), this.b.getMinimumWidth());
        }
        androidx.recyclerview.widget.RecyclerView.g(this.b, v7_1, v6_6);
        return;
    }

    public final int x(a2.z0 p2, a2.g1 p3)
    {
        if (this.t != 1) {
            return -1;
        } else {
            return Math.min(this.p, p3.b());
        }
    }
}
