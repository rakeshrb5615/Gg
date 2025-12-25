package androidx.recyclerview.widget;
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public static final java.util.Set P;
    public boolean E;
    public int F;
    public int[] G;
    public android.view.View[] H;
    public final android.util.SparseIntArray I;
    public final android.util.SparseIntArray J;
    public final k2.c K;
    public final android.graphics.Rect L;
    public int M;
    public int N;
    public int O;

    static GridLayoutManager()
    {
        androidx.recyclerview.widget.GridLayoutManager.P = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(new Integer[] {Integer.valueOf(17), Integer.valueOf(66), Integer.valueOf(33), Integer.valueOf(130)}))));
        return;
    }

    public GridLayoutManager(int p4)
    {
        super(1);
        super.E = 0;
        super.F = -1;
        super.I = new android.util.SparseIntArray();
        super.J = new android.util.SparseIntArray();
        super.K = new k2.c(1);
        super.L = new android.graphics.Rect();
        super.M = -1;
        super.N = -1;
        super.O = -1;
        super.u1(p4);
        return;
    }

    public GridLayoutManager(android.content.Context p4, android.util.AttributeSet p5, int p6, int p7)
    {
        super(p4, p5, p6, p7);
        super.E = 0;
        super.F = -1;
        super.I = new android.util.SparseIntArray();
        super.J = new android.util.SparseIntArray();
        super.K = new k2.c(1);
        super.L = new android.graphics.Rect();
        super.M = -1;
        super.N = -1;
        super.O = -1;
        super.u1(a2.t0.H(p4, p5, p6, p7).b);
        return;
    }

    public final boolean C0()
    {
        if ((this.z != null) || (this.E)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void E0(a2.g1 p6, a2.y p7, a2.r p8)
    {
        int v0 = this.F;
        int v2 = 0;
        while (v2 < this.F) {
            int v3_5 = p7.d;
            if ((v3_5 < 0) || ((v3_5 >= p6.b()) || (v0 <= 0))) {
                break;
            }
            p8.a(p7.d, Math.max(0, p7.g));
            this.K.getClass();
            v0--;
            p7.d = (p7.d + p7.e);
            v2++;
        }
        return;
    }

    public final int I(a2.z0 p3, a2.g1 p4)
    {
        if (this.p != 0) {
            if (p4.b() >= 1) {
                return (this.q1((p4.b() - 1), p3, p4) + 1);
            } else {
                return 0;
            }
        } else {
            return Math.min(this.F, this.B());
        }
    }

    public final android.view.View R0(a2.z0 p10, a2.g1 p11, boolean p12, boolean p13)
    {
        int v12_1;
        int v13_1;
        int v12_0 = this.v();
        int v0 = 1;
        if (p13 == 0) {
            v13_1 = v12_0;
            v12_1 = 0;
        } else {
            v12_1 = (this.v() - 1);
            v13_1 = -1;
            v0 = -1;
        }
        int v1 = p11.b();
        this.J0();
        int v2_1 = this.r.k();
        int v3_1 = this.r.g();
        android.view.View v4 = 0;
        android.view.View v5 = 0;
        while (v12_1 != v13_1) {
            android.view.View v6 = this.u(v12_1);
            int v7_0 = a2.t0.G(v6);
            if ((v7_0 >= 0) && ((v7_0 < v1) && (this.r1(v7_0, p10, p11) == 0))) {
                if (!((a2.u0) v6.getLayoutParams()).a.h()) {
                    if ((this.r.e(v6) < v3_1) && (this.r.b(v6) >= v2_1)) {
                        return v6;
                    } else {
                        if (v4 == null) {
                            v4 = v6;
                        }
                    }
                } else {
                    if (v5 == null) {
                        v5 = v6;
                    }
                }
            }
            v12_1 += v0;
        }
        if (v4 == null) {
            return v5;
        } else {
            return v4;
        }
    }

    public final android.view.View T(android.view.View p23, int p24, a2.z0 p25, a2.g1 p26)
    {
        int v3_2;
        a2.z0 v1_0 = p25;
        int v2_3 = p26;
        int v3_3 = this.b;
        if (v3_3 != 0) {
            v3_2 = v3_3.D(p23);
            if ((v3_2 == 0) || (((java.util.ArrayList) this.a.e).contains(v3_2))) {
                v3_2 = 0;
            }
        }
        if (v3_2 != 0) {
            int v6_5 = ((a2.u) v3_2.getLayoutParams());
            int v7 = v6_5.e;
            int v6_7 = (v6_5.f + v7);
            if (super.T(p23, p24, p25, p26) != null) {
                a2.z0 v5_5;
                if (this.I0(p24) != 1) {
                    v5_5 = 0;
                } else {
                    v5_5 = 1;
                }
                a2.z0 v5_7;
                int v12;
                int v10_2;
                if (v5_5 == this.u) {
                    v10_2 = this.v();
                    v12 = 1;
                    v5_7 = 0;
                } else {
                    v5_7 = (this.v() - 1);
                    v10_2 = -1;
                    v12 = -1;
                }
                if ((this.p != 1) || (!this.W0())) {
                    int v13_2 = 0;
                } else {
                    v13_2 = 1;
                }
                int v14 = this.q1(v5_7, p25, p26);
                a2.z0 v16 = 0;
                int v8 = -1;
                int v15 = -1;
                int v9_6 = 0;
                int v11_0 = v5_7;
                int v4_1 = 0;
                a2.z0 v5_0 = 0;
                while(true) {
                    int v17 = v5_0;
                    if (v11_0 != v10_2) {
                        a2.z0 v5_10 = this.q1(v11_0, v1_0, v2_3);
                        a2.z0 v1_1 = this.u(v11_0);
                        if (v1_1 != v3_2) {
                            if ((!v1_1.hasFocusable()) || (v5_10 == v14)) {
                                a2.z0 v5_12 = ((a2.u) v1_1.getLayoutParams());
                                int v2_4 = v5_12.e;
                                int v18_0 = v3_2;
                                int v3_5 = (v5_12.f + v2_4);
                                if ((v1_1.hasFocusable()) && ((v2_4 == v7) && (v3_5 == v6_7))) {
                                    break;
                                }
                                if (((!v1_1.hasFocusable()) || (v16 != null)) && ((v1_1.hasFocusable()) || (v17 != 0))) {
                                    int v21 = v10_2;
                                    int v10_0 = (Math.min(v3_5, v6_7) - Math.max(v2_4, v7));
                                    if (!v1_1.hasFocusable()) {
                                        if (v16 == null) {
                                            boolean v19_1 = v9_6;
                                            if ((!this.c.t(v1_1)) || (!this.d.t(v1_1))) {
                                                if (v10_0 <= v4_1) {
                                                    if (v10_0 != v4_1) {
                                                        v5_0 = v17;
                                                        v9_6 = v19_1;
                                                        v11_0 += v12;
                                                        v1_0 = p25;
                                                        v2_3 = p26;
                                                        v3_2 = v18_0;
                                                        v10_2 = v21;
                                                    } else {
                                                        int v9_4;
                                                        if (v2_4 <= v8) {
                                                            v9_4 = 0;
                                                        } else {
                                                            v9_4 = 1;
                                                        }
                                                        if (v13_2 != v9_4) {
                                                        } else {
                                                            if (!v1_1.hasFocusable()) {
                                                                v5_0 = v1_1;
                                                                v8 = v5_12.e;
                                                                v9_6 = v19_1;
                                                                v4_1 = (Math.min(v3_5, v6_7) - Math.max(v2_4, v7));
                                                            } else {
                                                                a2.z0 v5_1 = v5_12.e;
                                                                v9_6 = (Math.min(v3_5, v6_7) - Math.max(v2_4, v7));
                                                                v16 = v1_1;
                                                                v15 = v5_1;
                                                                v5_0 = v17;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (v10_0 <= v9_6) {
                                            if (v10_0 != v9_6) {
                                                v19_1 = v9_6;
                                            } else {
                                                int v10_1;
                                                if (v2_4 <= v15) {
                                                    v10_1 = 0;
                                                } else {
                                                    v10_1 = 1;
                                                }
                                                if (v13_2 != v10_1) {
                                                }
                                            }
                                        }
                                        v19_1 = v9_6;
                                    }
                                } else {
                                    v19_1 = v9_6;
                                    v21 = v10_2;
                                }
                            } else {
                                if (v16 == null) {
                                    v18_0 = v3_2;
                                    v19_1 = v9_6;
                                    v21 = v10_2;
                                } else {
                                    if (v16 == null) {
                                        return v17;
                                    } else {
                                        return v16;
                                    }
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return v1_1;
            }
        }
        return 0;
    }

    public final void V(a2.z0 p1, a2.g1 p2, r0.c p3)
    {
        super.V(p1, p2, p3);
        p3.i(android.widget.GridView.getName());
        r0.b v1_5 = this.b.r;
        if ((v1_5 != null) && (v1_5.a() > 1)) {
            p3.b(r0.b.o);
        }
        return;
    }

    public final void W(a2.z0 p3, a2.g1 p4, android.view.View p5, r0.c p6)
    {
        int v0_0 = p5.getLayoutParams();
        if ((v0_0 instanceof a2.u)) {
            int v0_3 = ((a2.u) v0_0);
            k4.i v3_3 = this.q1(v0_3.a.b(), p3, p4);
            if (this.p != 0) {
                p6.j(k4.i.c(0, v3_3, 1, v0_3.e, v0_3.f));
                return;
            } else {
                p6.j(k4.i.c(0, v0_3.e, v0_3.f, v3_3, 1));
                return;
            }
        } else {
            this.X(p5, p6);
            return;
        }
    }

    public final void X0(a2.z0 p19, a2.g1 p20, a2.y p21, a2.x p22)
    {
        int v9_1;
        int v5_13 = this.r.j();
        if (v5_13 == 1073741824) {
            v9_1 = 0;
        } else {
            v9_1 = 1;
        }
        int v10_1;
        if (this.v() <= 0) {
            v10_1 = 0;
        } else {
            v10_1 = this.G[this.F];
        }
        if (v9_1 != 0) {
            this.v1();
        }
        int v11_2;
        if (p21.e != 1) {
            v11_2 = 0;
        } else {
            v11_2 = 1;
        }
        int v12_6 = this.F;
        if (v11_2 == 0) {
            v12_6 = (this.r1(p21.d, p19, p20) + this.s1(p21.d, p19, p20));
        }
        int v13_2 = 0;
        while (v13_2 < this.F) {
            int v14_9 = p21.d;
            if ((v14_9 < 0) || ((v14_9 >= p20.b()) || (v12_6 <= 0))) {
                break;
            }
            int v14_10 = p21.d;
            int v15_1 = this.s1(v14_10, p19, p20);
            if (v15_1 > this.F) {
                int v2_23 = new StringBuilder("Item at position ");
                v2_23.append(v14_10);
                v2_23.append(" requires ");
                v2_23.append(v15_1);
                v2_23.append(" spans but GridLayoutManager has only ");
                v2_23.append(this.F);
                v2_23.append(" spans.");
                throw new IllegalArgumentException(v2_23.toString());
            } else {
                v12_6 -= v15_1;
                if (v12_6 < 0) {
                    break;
                }
                boolean v8_37 = p21.b(p19);
                if (!v8_37) {
                    break;
                }
                this.H[v13_2] = v8_37;
                v13_2++;
            }
        }
        if (v13_2 != 0) {
            int v14_12;
            int v12_12;
            int v15_2;
            if (v11_2 == 0) {
                v12_12 = (v13_2 - 1);
                v14_12 = -1;
                v15_2 = -1;
            } else {
                v15_2 = 1;
                v14_12 = v13_2;
                v12_12 = 0;
            }
            boolean v6_6 = 0;
            while (v12_12 != v14_12) {
                int v7_15 = this.H[v12_12];
                boolean v8_35 = ((a2.u) v7_15.getLayoutParams());
                int v7_17 = this.s1(a2.t0.G(v7_15), p19, p20);
                v8_35.f = v7_17;
                v8_35.e = v6_6;
                v6_6 += v7_17;
                v12_12 += v15_2;
            }
            int v1_18 = 0;
            int v2_21 = 0;
            boolean v6_5 = 0;
            while (v2_21 < v13_2) {
                int v12_8;
                int v7_9 = this.H[v2_21];
                if (p21.k != null) {
                    v12_8 = 0;
                    if (v11_2 == 0) {
                        this.b(v7_9, 0, 1);
                    } else {
                        this.b(v7_9, -1, 1);
                    }
                } else {
                    if (v11_2 == 0) {
                        v12_8 = 0;
                        this.b(v7_9, 0, 0);
                    } else {
                        v12_8 = 0;
                        this.b(v7_9, -1, 0);
                    }
                }
                boolean v8_25 = this.b;
                int v14_7 = this.L;
                if (v8_25) {
                    v14_7.set(v8_25.N(v7_9));
                } else {
                    v14_7.set(v12_8, v12_8, v12_8, v12_8);
                }
                this.t1(v7_9, v5_13, v12_8);
                boolean v8_28 = this.r.c(v7_9);
                if (v8_28 > v6_5) {
                    v6_5 = v8_28;
                }
                int v7_13 = ((((float) this.r.d(v7_9)) * 1065353216) / ((float) ((a2.u) v7_9.getLayoutParams()).f));
                if (v7_13 > v1_18) {
                    v1_18 = v7_13;
                }
                v2_21++;
            }
            if (v9_1 != 0) {
                this.j1(Math.max(Math.round((v1_18 * ((float) this.F))), v10_1));
                v6_5 = 0;
                int v12_0 = 0;
                while (v12_0 < v13_2) {
                    int v1_16 = this.H[v12_0];
                    this.t1(v1_16, 1073741824, 1);
                    int v1_17 = this.r.c(v1_16);
                    if (v1_17 > v6_5) {
                        v6_5 = v1_17;
                    }
                    v12_0++;
                }
            }
            int v12_1 = 0;
            while (v12_1 < v13_2) {
                int v1_14 = this.H[v12_1];
                if (this.r.c(v1_14) == v6_5) {
                    int v10 = 1073741824;
                } else {
                    int v5_10;
                    int v2_17;
                    int v2_15 = ((a2.u) v1_14.getLayoutParams());
                    int v5_4 = v2_15.b;
                    int v7_4 = (((v5_4.top + v5_4.bottom) + v2_15.topMargin) + v2_15.bottomMargin);
                    boolean v8_19 = (((v5_4.left + v5_4.right) + v2_15.leftMargin) + v2_15.rightMargin);
                    int v5_9 = this.p1(v2_15.e, v2_15.f);
                    if (this.p != 1) {
                        boolean v8_21 = android.view.View$MeasureSpec.makeMeasureSpec((v6_5 - v8_19), 1073741824);
                        v5_10 = a2.t0.w(0, v5_9, 1073741824, v7_4, v2_15.height);
                        v2_17 = v8_21;
                    } else {
                        v2_17 = a2.t0.w(0, v5_9, 1073741824, v8_19, v2_15.width);
                        v5_10 = android.view.View$MeasureSpec.makeMeasureSpec((v6_5 - v7_4), 1073741824);
                    }
                    if (this.z0(v1_14, v2_17, v5_10, ((a2.u0) v1_14.getLayoutParams()))) {
                        v1_14.measure(v2_17, v5_10);
                    }
                }
                v12_1++;
            }
            int v3_0;
            int v2_0;
            int v12_4;
            int v1_4;
            p22.a = v6_5;
            if (this.p != 1) {
                if (p21.f != -1) {
                    int v12_2 = p21.b;
                    v2_0 = (v12_2 + v6_5);
                    v3_0 = 0;
                    v1_4 = v12_2;
                } else {
                    int v12_3 = p21.b;
                    v1_4 = (v12_3 - v6_5);
                    v3_0 = 0;
                    v2_0 = v12_3;
                }
                v12_4 = v3_0;
            } else {
                if (p21.f != -1) {
                    int v12_5 = p21.b;
                    v2_0 = 0;
                    v3_0 = v12_5;
                    v12_4 = (v12_5 + v6_5);
                    v1_4 = 0;
                } else {
                    v12_4 = p21.b;
                    v3_0 = (v12_4 - v6_5);
                    v1_4 = 0;
                    v2_0 = 0;
                }
            }
            int v7_0 = 0;
            while (v7_0 < v13_2) {
                int v5_1 = this.H[v7_0];
                boolean v6_1 = ((a2.u) v5_1.getLayoutParams());
                if (this.p != 1) {
                    v3_0 = (this.F() + this.G[v6_1.e]);
                    v12_4 = (this.r.d(v5_1) + v3_0);
                } else {
                    if (!this.W0()) {
                        v1_4 = (this.D() + this.G[v6_1.e]);
                        v2_0 = (this.r.d(v5_1) + v1_4);
                    } else {
                        int v1_12 = (this.D() + this.G[(this.F - v6_1.e)]);
                        v2_0 = v1_12;
                        v1_4 = (v1_12 - this.r.d(v5_1));
                    }
                }
                a2.t0.N(v5_1, v1_4, v3_0, v2_0, v12_4);
                if ((v6_1.a.h()) || (v6_1.a.k())) {
                    p22.c = 1;
                }
                p22.d = (v5_1.hasFocusable() | p22.d);
                v7_0++;
            }
            java.util.Arrays.fill(this.H, 0);
            return;
        } else {
            p22.b = 1;
            return;
        }
    }

    public final void Y(int p1, int p2)
    {
        android.util.SparseIntArray v1_0 = this.K;
        v1_0.s();
        ((android.util.SparseIntArray) v1_0.c).clear();
        return;
    }

    public final void Y0(a2.z0 p5, a2.g1 p6, a2.w p7, int p8)
    {
        this.v1();
        if ((p6.b() > 0) && (!p6.g)) {
            int v8_5;
            if (p8 != 1) {
                v8_5 = 0;
            } else {
                v8_5 = 1;
            }
            int v1_1 = this.r1(p7.b, p5, p6);
            if (v8_5 == 0) {
                int v8_2 = (p6.b() - 1);
                int v0_0 = p7.b;
                while (v0_0 < v8_2) {
                    int v2 = (v0_0 + 1);
                    int v3 = this.r1(v2, p5, p6);
                    if (v3 <= v1_1) {
                        break;
                    }
                    v0_0 = v2;
                    v1_1 = v3;
                }
                p7.b = v0_0;
                this.k1();
                return;
            }
            while (v1_1 > 0) {
                int v8_3 = p7.b;
                if (v8_3 <= 0) {
                    break;
                }
                int v8_4 = (v8_3 - 1);
                p7.b = v8_4;
                v1_1 = this.r1(v8_4, p5, p6);
            }
        }
        this.k1();
        return;
    }

    public final void Z()
    {
        android.util.SparseIntArray v0_0 = this.K;
        v0_0.s();
        ((android.util.SparseIntArray) v0_0.c).clear();
        return;
    }

    public final void a0(int p1, int p2)
    {
        android.util.SparseIntArray v1_0 = this.K;
        v1_0.s();
        ((android.util.SparseIntArray) v1_0.c).clear();
        return;
    }

    public final void b0(int p1, int p2)
    {
        android.util.SparseIntArray v1_0 = this.K;
        v1_0.s();
        ((android.util.SparseIntArray) v1_0.c).clear();
        return;
    }

    public final void c0(int p1, int p2)
    {
        android.util.SparseIntArray v1_0 = this.K;
        v1_0.s();
        ((android.util.SparseIntArray) v1_0.c).clear();
        return;
    }

    public final void d0(a2.z0 p8, a2.g1 p9)
    {
        android.util.SparseIntArray v1 = this.J;
        android.util.SparseIntArray v2 = this.I;
        if (p9.g) {
            int v0_1 = this.v();
            int v3 = 0;
            while (v3 < v0_1) {
                int v4_2 = ((a2.u) this.u(v3).getLayoutParams());
                int v5_1 = v4_2.a.b();
                v2.put(v5_1, v4_2.f);
                v1.put(v5_1, v4_2.e);
                v3++;
            }
        }
        super.d0(p8, p9);
        v2.clear();
        v1.clear();
        return;
    }

    public final void e0(a2.g1 p3)
    {
        super.e0(p3);
        this.E = 0;
        android.view.View v3_2 = this.M;
        if (v3_2 != -1) {
            android.view.View v3_3 = this.q(v3_2);
            if (v3_3 != null) {
                v3_3.sendAccessibilityEvent(67108864);
                this.M = -1;
            }
        }
        return;
    }

    public final boolean f(a2.u0 p1)
    {
        return (p1 instanceof a2.u);
    }

    public final void f1(boolean p2)
    {
        if (p2 != null) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.f1(0);
            return;
        }
    }

    public final boolean i0(int p12, android.os.Bundle p13)
    {
        if ((p12 != r0.b.o.a()) || (p12 == -1)) {
            if ((p12 != 16908343) || (p13 == 0)) {
                return super.i0(p12, p13);
            } else {
                int v12_4 = p13.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                int v13_1 = p13.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if ((v12_4 != -1) && (v13_1 != -1)) {
                    int v0_5 = this.b.r.a();
                    Integer v4_10 = 0;
                    while (v4_10 < v0_5) {
                        int v5_7 = this.b;
                        int v5_11 = this.r1(v4_10, v5_7.c, v5_7.k0);
                        Integer v6_10 = this.b;
                        Integer v6_12 = this.q1(v4_10, v6_10.c, v6_10.k0);
                        if (this.p != 1) {
                            if ((v5_11 == v12_4) && (v6_12 == v13_1)) {
                                if (v4_10 > -1) {
                                    this.d1(v4_10, 0);
                                    return 1;
                                }
                                return 0;
                            }
                        } else {
                            if ((v5_11 == v13_1) && (v6_12 == v12_4)) {
                            }
                        }
                        v4_10++;
                    }
                    v4_10 = -1;
                }
            }
        } else {
            int v12_13 = 0;
            while (v12_13 < this.v()) {
                int v0_7 = this.u(v12_13);
                java.util.Objects.requireNonNull(v0_7);
                if (!v0_7.isAccessibilityFocused()) {
                    v12_13++;
                } else {
                    int v12_14 = this.u(v12_13);
                }
                if ((v12_14 != 0) && (p13 != 0)) {
                    int v13_10 = p13.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                    if (androidx.recyclerview.widget.GridLayoutManager.P.contains(Integer.valueOf(v13_10))) {
                        int v12_15 = this.b.L(v12_14);
                        if (v12_15 != 0) {
                            int v12_16;
                            int v0_13 = v12_15.r;
                            if (v0_13 != 0) {
                                v12_16 = v0_13.J(v12_15);
                            } else {
                                v12_16 = -1;
                            }
                            int v0_15 = this.m1(v12_16);
                            Integer v4_0 = this.l1(v12_16);
                            if ((v0_15 >= 0) && (v4_0 >= null)) {
                                if ((!this.n1(v12_16).contains(Integer.valueOf(this.N))) || (!this.o1(this.l1(v12_16), v12_16).contains(Integer.valueOf(this.O)))) {
                                    this.N = v0_15;
                                    this.O = v4_0;
                                }
                                int v5_2 = this.N;
                                if (v5_2 == -1) {
                                    v5_2 = v0_15;
                                }
                                Integer v6_2 = this.O;
                                if (v6_2 != -1) {
                                    v4_0 = v6_2;
                                }
                                int v12_1;
                                if (v13_10 == 17) {
                                    v12_1 = (v12_16 - 1);
                                    while (v12_1 >= 0) {
                                        boolean v8_0 = this.m1(v12_1);
                                        boolean v9_0 = this.l1(v12_1);
                                        if ((v8_0) || (v9_0)) {
                                            break;
                                        }
                                        if (this.p != 1) {
                                            if ((this.n1(v12_1).contains(Integer.valueOf(v5_2))) && (v9_0 < v4_0)) {
                                                this.O = v9_0;
                                                if (v12_1 == -1) {
                                                    Integer v4_6 = this.p;
                                                    if (v4_6 == null) {
                                                        if (v13_10 != 17) {
                                                            if (v13_10 != 66) {
                                                                if (v12_1 != -1) {
                                                                    this.q0(v12_1);
                                                                    this.M = v12_1;
                                                                    return 1;
                                                                }
                                                                return 0;
                                                            } else {
                                                                if ((v0_15 >= 0) && (v4_6 != 1)) {
                                                                    int v12_6 = new java.util.TreeMap();
                                                                    int v13_2 = 0;
                                                                    while (v13_2 < this.B()) {
                                                                        Integer v4_13 = this.n1(v13_2).iterator();
                                                                        while (v4_13.hasNext()) {
                                                                            int v5_6 = ((Integer) v4_13.next());
                                                                            if (v5_6.intValue() >= 0) {
                                                                                if (!v12_6.containsKey(v5_6)) {
                                                                                    v12_6.put(v5_6, Integer.valueOf(v13_2));
                                                                                }
                                                                            }
                                                                        }
                                                                        v13_2++;
                                                                    }
                                                                    int v13_4 = v12_6.keySet().iterator();
                                                                    while (v13_4.hasNext()) {
                                                                        Integer v4_11 = ((Integer) v13_4.next());
                                                                        int v5_3 = v4_11.intValue();
                                                                        if (v5_3 > v0_15) {
                                                                            v12_1 = ((Integer) v12_6.get(v4_11)).intValue();
                                                                            this.N = v5_3;
                                                                            this.O = 0;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if ((v0_15 >= 0) && (v4_6 != 1)) {
                                                                int v12_10 = new java.util.TreeMap(java.util.Collections.reverseOrder());
                                                                int v13_6 = 0;
                                                                while (v13_6 < this.B()) {
                                                                    Integer v4_19 = this.n1(v13_6).iterator();
                                                                    while (v4_19.hasNext()) {
                                                                        int v5_13 = ((Integer) v4_19.next());
                                                                        if (v5_13.intValue() >= 0) {
                                                                            v12_10.put(v5_13, Integer.valueOf(v13_6));
                                                                        }
                                                                    }
                                                                    v13_6++;
                                                                }
                                                                int v13_8 = v12_10.keySet().iterator();
                                                                while (v13_8.hasNext()) {
                                                                    Integer v4_17 = ((Integer) v13_8.next());
                                                                    int v5_9 = v4_17.intValue();
                                                                    if (v5_9 < v0_15) {
                                                                        v12_1 = ((Integer) v12_10.get(v4_17)).intValue();
                                                                        this.N = v5_9;
                                                                        this.O = this.l1(v12_1);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        v12_1 = -1;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (((v8_0 == v5_2) && (v9_0 < v4_0)) || (v8_0 < v5_2)) {
                                                this.N = v8_0;
                                                this.O = v9_0;
                                            }
                                        }
                                        v12_1--;
                                    }
                                    v12_1 = -1;
                                } else {
                                    if (v13_10 == 33) {
                                        v12_1 = (v12_16 - 1);
                                        while (v12_1 >= 0) {
                                            boolean v8_4 = this.m1(v12_1);
                                            boolean v9_1 = this.l1(v12_1);
                                            if ((v8_4) || (v9_1)) {
                                                break;
                                            }
                                            if (this.p != 1) {
                                                if ((v8_4 < v5_2) && (v9_1 == v4_0)) {
                                                    this.N = ((Integer) java.util.Collections.max(this.n1(v12_1))).intValue();
                                                }
                                            } else {
                                                if ((v8_4 < v5_2) && (this.o1(this.l1(v12_1), v12_1).contains(Integer.valueOf(v4_0)))) {
                                                    this.N = v8_4;
                                                }
                                            }
                                            v12_1--;
                                        }
                                    } else {
                                        if (v13_10 == 66) {
                                            v12_1 = (v12_16 + 1);
                                            while (v12_1 < this.B()) {
                                                boolean v8_6 = this.m1(v12_1);
                                                boolean v9_5 = this.l1(v12_1);
                                                if ((v8_6) || (v9_5)) {
                                                    break;
                                                }
                                                if (this.p != 1) {
                                                    if ((v9_5 > v4_0) && (this.n1(v12_1).contains(Integer.valueOf(v5_2)))) {
                                                        this.O = v9_5;
                                                    }
                                                } else {
                                                    if (((v8_6 == v5_2) && (v9_5 > v4_0)) || (v8_6 > v5_2)) {
                                                        this.N = v8_6;
                                                        this.O = v9_5;
                                                    }
                                                }
                                                v12_1++;
                                            }
                                        } else {
                                            if (v13_10 == 130) {
                                                v12_1 = (v12_16 + 1);
                                                while (v12_1 < this.B()) {
                                                    boolean v8_11 = this.m1(v12_1);
                                                    boolean v9_6 = this.l1(v12_1);
                                                    if ((v8_11) || (v9_6)) {
                                                        break;
                                                    }
                                                    if (this.p != 1) {
                                                        if ((v8_11 > v5_2) && (v9_6 == v4_0)) {
                                                            this.N = this.m1(v12_1);
                                                        }
                                                    } else {
                                                        if ((v8_11 > v5_2) && ((v9_6 == v4_0) || (this.o1(this.l1(v12_1), v12_1).contains(Integer.valueOf(v4_0))))) {
                                                            this.N = v8_11;
                                                        }
                                                    }
                                                    v12_1++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            v12_14 = 0;
        }
        return 0;
    }

    public final void j1(int p8)
    {
        int[] v0_0 = this.G;
        int v1 = this.F;
        int v2 = 1;
        if ((v0_0 == null) || ((v0_0.length != (v1 + 1)) || (v0_0[(v0_0.length - 1)] != p8))) {
            v0_0 = new int[(v1 + 1)];
        }
        int v3_0 = 0;
        v0_0[0] = 0;
        int v4_0 = (p8 / v1);
        int v8_1 = (p8 % v1);
        int v5 = 0;
        while (v2 <= v1) {
            int v6_1;
            v3_0 += v8_1;
            if ((v3_0 <= 0) || ((v1 - v3_0) >= v8_1)) {
                v6_1 = v4_0;
            } else {
                v6_1 = (v4_0 + 1);
                v3_0 -= v1;
            }
            v5 += v6_1;
            v0_0[v2] = v5;
            v2++;
        }
        this.G = v0_0;
        return;
    }

    public final int k(a2.g1 p1)
    {
        return this.G0(p1);
    }

    public final void k1()
    {
        android.view.View[] v0_0 = this.H;
        if ((v0_0 != null) && (v0_0.length == this.F)) {
            return;
        } else {
            android.view.View[] v0_3 = new android.view.View[this.F];
            this.H = v0_3;
            return;
        }
    }

    public final int l(a2.g1 p1)
    {
        return this.H0(p1);
    }

    public final int l1(int p3)
    {
        if (this.p != 0) {
            a2.g1 v0_2 = this.b;
            return this.r1(p3, v0_2.c, v0_2.k0);
        } else {
            a2.g1 v0_4 = this.b;
            return this.q1(p3, v0_4.c, v0_4.k0);
        }
    }

    public final int m1(int p3)
    {
        if (this.p != 1) {
            a2.g1 v0_2 = this.b;
            return this.r1(p3, v0_2.c, v0_2.k0);
        } else {
            a2.g1 v0_4 = this.b;
            return this.q1(p3, v0_4.c, v0_4.k0);
        }
    }

    public final int n(a2.g1 p1)
    {
        return this.G0(p1);
    }

    public final java.util.HashSet n1(int p2)
    {
        return this.o1(this.m1(p2), p2);
    }

    public final int o(a2.g1 p1)
    {
        return this.H0(p1);
    }

    public final java.util.HashSet o1(int p4, int p5)
    {
        java.util.HashSet v0_1 = new java.util.HashSet();
        int v1_1 = this.b;
        int v5_1 = this.s1(p5, v1_1.c, v1_1.k0);
        int v1_0 = p4;
        while (v1_0 < (p4 + v5_1)) {
            v0_1.add(Integer.valueOf(v1_0));
            v1_0++;
        }
        return v0_1;
    }

    public final int p0(int p1, a2.z0 p2, a2.g1 p3)
    {
        this.v1();
        this.k1();
        return super.p0(p1, p2, p3);
    }

    public final int p1(int p4, int p5)
    {
        if ((this.p != 1) || (!this.W0())) {
            int[] v0_3 = this.G;
            return (v0_3[(p5 + p4)] - v0_3[p4]);
        } else {
            int[] v0_1 = this.G;
            int v1_1 = this.F;
            return (v0_1[(v1_1 - p4)] - v0_1[((v1_1 - p4) - p5)]);
        }
    }

    public final int q1(int p2, a2.z0 p3, a2.g1 p4)
    {
        k2.c v0 = this.K;
        if (p4.g) {
            String v3_5 = p3.b(p2);
            if (v3_5 != -1) {
                int v2_5 = this.F;
                v0.getClass();
                return k2.c.q(v3_5, v2_5);
            } else {
                String v3_2 = new StringBuilder("Cannot find span size for pre layout position. ");
                v3_2.append(p2);
                android.util.Log.w("GridLayoutManager", v3_2.toString());
                return 0;
            }
        } else {
            String v3_4 = this.F;
            v0.getClass();
            return k2.c.q(p2, v3_4);
        }
    }

    public final a2.u0 r()
    {
        if (this.p != 0) {
            return new a2.u(-1, -2);
        } else {
            return new a2.u(-2, -1);
        }
    }

    public final int r0(int p1, a2.z0 p2, a2.g1 p3)
    {
        this.v1();
        this.k1();
        return super.r0(p1, p2, p3);
    }

    public final int r1(int p3, a2.z0 p4, a2.g1 p5)
    {
        k2.c v0 = this.K;
        if (p5.g) {
            String v5_4 = this.J.get(p3, -1);
            if (v5_4 == -1) {
                int v4_6 = p4.b(p3);
                if (v4_6 != -1) {
                    int v3_1 = this.F;
                    v0.getClass();
                    return (v4_6 % v3_1);
                } else {
                    int v4_3 = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
                    v4_3.append(p3);
                    android.util.Log.w("GridLayoutManager", v4_3.toString());
                    return 0;
                }
            } else {
                return v5_4;
            }
        } else {
            int v4_5 = this.F;
            v0.getClass();
            return (p3 % v4_5);
        }
    }

    public final a2.u0 s(android.content.Context p2, android.util.AttributeSet p3)
    {
        a2.u v0_1 = new a2.u(p2, p3);
        v0_1.e = -1;
        v0_1.f = 0;
        return v0_1;
    }

    public final int s1(int p4, a2.z0 p5, a2.g1 p6)
    {
        k2.c v0 = this.K;
        if (p6.g) {
            String v6_4 = this.I.get(p4, -1);
            if (v6_4 == -1) {
                if (p5.b(p4) != -1) {
                    v0.getClass();
                    return 1;
                } else {
                    String v5_3 = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
                    v5_3.append(p4);
                    android.util.Log.w("GridLayoutManager", v5_3.toString());
                    return 1;
                }
            } else {
                return v6_4;
            }
        } else {
            v0.getClass();
            return 1;
        }
    }

    public final a2.u0 t(android.view.ViewGroup$LayoutParams p4)
    {
        if (!(p4 instanceof android.view.ViewGroup$MarginLayoutParams)) {
            a2.u v0_3 = new a2.u(p4);
            v0_3.e = -1;
            v0_3.f = 0;
            return v0_3;
        } else {
            a2.u v0_1 = new a2.u(((android.view.ViewGroup$MarginLayoutParams) p4));
            v0_1.e = -1;
            v0_1.f = 0;
            return v0_1;
        }
    }

    public final void t1(android.view.View p9, int p10, boolean p11)
    {
        int v0_4;
        int v10_2;
        int v0_1 = ((a2.u) p9.getLayoutParams());
        a2.u0 v1_6 = v0_1.b;
        int v2_0 = (((v1_6.top + v1_6.bottom) + v0_1.topMargin) + v0_1.bottomMargin);
        int v3_3 = (((v1_6.left + v1_6.right) + v0_1.leftMargin) + v0_1.rightMargin);
        a2.u0 v1_4 = this.p1(v0_1.e, v0_1.f);
        if (this.p != 1) {
            v0_4 = a2.t0.w(0, v1_4, p10, v2_0, v0_1.height);
            v10_2 = a2.t0.w(1, this.r.l(), this.l, v3_3, v0_1.width);
        } else {
            v10_2 = a2.t0.w(0, v1_4, p10, v3_3, v0_1.width);
            v0_4 = a2.t0.w(1, this.r.l(), this.m, v2_0, v0_1.height);
        }
        boolean v11_1;
        a2.u0 v1_11 = ((a2.u0) p9.getLayoutParams());
        if (!p11) {
            v11_1 = this.x0(p9, v10_2, v0_4, v1_11);
        } else {
            v11_1 = this.z0(p9, v10_2, v0_4, v1_11);
        }
        if (v11_1) {
            p9.measure(v10_2, v0_4);
        }
        return;
    }

    public final void u0(android.graphics.Rect p5, int p6, int p7)
    {
        if (this.G == null) {
            super.u0(p5, p6, p7);
        }
        int v5_6;
        int v6_1;
        java.util.WeakHashMap v1_1 = (this.E() + this.D());
        java.util.WeakHashMap v2_1 = (this.C() + this.F());
        if (this.p != 1) {
            v6_1 = a2.t0.g(p6, (p5.width() + v1_1), this.b.getMinimumWidth());
            int v5_3 = this.G;
            v5_6 = a2.t0.g(p7, (v5_3[(v5_3.length - 1)] + v2_1), this.b.getMinimumHeight());
        } else {
            v5_6 = a2.t0.g(p7, (p5.height() + v2_1), this.b.getMinimumHeight());
            androidx.recyclerview.widget.RecyclerView v7_1 = this.G;
            v6_1 = a2.t0.g(p6, (v7_1[(v7_1.length - 1)] + v1_1), this.b.getMinimumWidth());
        }
        androidx.recyclerview.widget.RecyclerView.g(this.b, v6_1, v5_6);
        return;
    }

    public final void u1(int p3)
    {
        if (p3 != this.F) {
            this.E = 1;
            if (p3 < 1) {
                throw new IllegalArgumentException(g2.g.c(p3, "Span count should be at least 1. Provided "));
            } else {
                this.F = p3;
                this.K.s();
                this.o0();
                return;
            }
        } else {
            return;
        }
    }

    public final void v1()
    {
        int v1_2;
        int v0_1;
        if (this.p != 1) {
            v0_1 = (this.o - this.C());
            v1_2 = this.F();
        } else {
            v0_1 = (this.n - this.E());
            v1_2 = this.D();
        }
        this.j1((v0_1 - v1_2));
        return;
    }

    public final int x(a2.z0 p3, a2.g1 p4)
    {
        if (this.p != 1) {
            if (p4.b() >= 1) {
                return (this.q1((p4.b() - 1), p3, p4) + 1);
            } else {
                return 0;
            }
        } else {
            return Math.min(this.F, this.B());
        }
    }
}
