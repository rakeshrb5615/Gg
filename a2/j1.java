package a2;
public final class j1 implements java.lang.Runnable {
    public int a;
    public int b;
    public android.widget.OverScroller c;
    public android.view.animation.Interpolator d;
    public boolean e;
    public boolean f;
    public final synthetic androidx.recyclerview.widget.RecyclerView m;

    public j1(androidx.recyclerview.widget.RecyclerView p3)
    {
        this.m = p3;
        a2.g0 v0 = androidx.recyclerview.widget.RecyclerView.M0;
        this.d = v0;
        this.e = 0;
        this.f = 0;
        this.c = new android.widget.OverScroller(p3.getContext(), v0);
        return;
    }

    public final void a(int p13, int p14)
    {
        android.content.Context v1_0 = this.m;
        v1_0.setScrollState(2);
        this.b = 0;
        this.a = 0;
        a2.g0 v2 = androidx.recyclerview.widget.RecyclerView.M0;
        if (this.d != v2) {
            this.d = v2;
            this.c = new android.widget.OverScroller(v1_0.getContext(), v2);
        }
        this.c.fling(0, 0, p13, p14, -2147483648, 2147483647, -2147483648, 2147483647);
        this.b();
        return;
    }

    public final void b()
    {
        if (!this.e) {
            androidx.recyclerview.widget.RecyclerView v0_1 = this.m;
            v0_1.removeCallbacks(this);
            v0_1.postOnAnimation(this);
            return;
        } else {
            this.f = 1;
            return;
        }
    }

    public final void c(int p10, int p11, int p12, android.view.animation.Interpolator p13)
    {
        androidx.recyclerview.widget.RecyclerView v2 = this.m;
        if (p12 == -2147483648) {
            android.widget.OverScroller v3_0;
            int v12_1 = Math.abs(p10);
            int v0_6 = Math.abs(p11);
            if (v12_1 <= v0_6) {
                v3_0 = 0;
            } else {
                v3_0 = 1;
            }
            int v4_0;
            if (v3_0 == null) {
                v4_0 = v2.getHeight();
            } else {
                v4_0 = v2.getWidth();
            }
            if (v3_0 == null) {
                v12_1 = v0_6;
            }
            p12 = Math.min(((int) (((((float) v12_1) / ((float) v4_0)) + 1065353216) * 1133903872)), 2000);
        }
        if (p13 == null) {
            p13 = androidx.recyclerview.widget.RecyclerView.M0;
        }
        if (this.d != p13) {
            this.d = p13;
            this.c = new android.widget.OverScroller(v2.getContext(), p13);
        }
        this.b = 0;
        this.a = 0;
        v2.setScrollState(2);
        this.c.startScroll(0, 0, p10, p11, p12);
        this.b();
        return;
    }

    public final void run()
    {
        android.widget.OverScroller v0_0 = this.m;
        int[] v8 = v0_0.w0;
        if (v0_0.s != null) {
            this.f = 0;
            this.e = 1;
            v0_0.p();
            android.widget.OverScroller v11 = this.c;
            if (v11.computeScrollOffset()) {
                int v1_1 = v11.getCurrX();
                int v2_1 = v11.getCurrY();
                android.widget.EdgeEffect v3_11 = (v1_1 - this.a);
                int v4_4 = (v2_1 - this.b);
                this.a = v1_1;
                this.b = v2_1;
                int v1_15 = androidx.recyclerview.widget.RecyclerView.o(v3_11, v0_0.L, v0_0.N, v0_0.getWidth());
                int v2_8 = androidx.recyclerview.widget.RecyclerView.o(v4_4, v0_0.M, v0_0.O, v0_0.getHeight());
                int v4_5 = v0_0.w0;
                v4_5[0] = 0;
                v4_5[1] = 0;
                if (v0_0.u(v1_15, v2_8, 1, v4_5, 0)) {
                    v1_15 -= v8[0];
                    v2_8 -= v8[1];
                }
                if (v0_0.getOverScrollMode() != 2) {
                    v0_0.n(v1_15, v2_8);
                }
                int v1_16;
                android.widget.EdgeEffect v3_24;
                int v4_6;
                int v2_9;
                if (v0_0.r == null) {
                    v3_24 = v1_15;
                    v4_6 = v2_8;
                    v1_16 = 0;
                    v2_9 = 0;
                } else {
                    v8[0] = 0;
                    v8[1] = 0;
                    v0_0.e0(v1_15, v2_8, v8);
                    android.widget.EdgeEffect v3_25 = v8[0];
                    int v4_7 = v8[1];
                    int v1_17 = (v1_15 - v3_25);
                    int v2_10 = (v2_8 - v4_7);
                    int v5_10 = v0_0.s.e;
                    if ((v5_10 != 0) && ((!v5_10.d) && (v5_10.e))) {
                        boolean v6_9 = v0_0.k0.b();
                        if (v6_9) {
                            if (v5_10.a < v6_9) {
                                v5_10.g(v3_25, v4_7);
                            } else {
                                v5_10.a = (v6_9 - 1);
                                v5_10.g(v3_25, v4_7);
                            }
                        } else {
                            v5_10.i();
                        }
                    }
                    v3_24 = v1_17;
                    v1_16 = v3_25;
                    v4_6 = v2_10;
                    v2_9 = v4_7;
                }
                if (!v0_0.u.isEmpty()) {
                    v0_0.invalidate();
                }
                boolean v7_3 = v0_0.w0;
                v7_3[0] = 0;
                v7_3[1] = 0;
                v0_0.v(v1_16, v2_9, v3_24, v4_6, 0, 1, v7_3);
                android.widget.EdgeEffect v3_0 = (v3_24 - v8[0]);
                int v4_0 = (v4_6 - v8[1]);
                if ((v1_16 != 0) || (v2_9 != 0)) {
                    v0_0.w(v1_16, v2_9);
                }
                if (!androidx.recyclerview.widget.RecyclerView.d(v0_0)) {
                    v0_0.invalidate();
                }
                int v5_4;
                if (v11.getCurrX() != v11.getFinalX()) {
                    v5_4 = 0;
                } else {
                    v5_4 = 1;
                }
                boolean v6_2;
                if (v11.getCurrY() != v11.getFinalY()) {
                    v6_2 = 0;
                } else {
                    v6_2 = 1;
                }
                if ((!v11.isFinished()) && (((v5_4 == 0) && (v3_0 == null)) || ((!v6_2) && (v4_0 == 0)))) {
                    int v5_5 = 0;
                } else {
                    v5_5 = 1;
                }
                boolean v6_4 = v0_0.s.e;
                if (((v6_4) && (v6_4.d)) || (v5_5 == 0)) {
                    this.b();
                    android.widget.EdgeEffect v3_16 = v0_0.i0;
                    if (v3_16 != null) {
                        v3_16.a(v0_0, v1_16, v2_9);
                    }
                } else {
                    if (v0_0.getOverScrollMode() != 2) {
                        int v2_0;
                        int v1_4 = ((int) v11.getCurrVelocity());
                        if (v3_0 >= null) {
                            if (v3_0 <= null) {
                                v2_0 = 0;
                            } else {
                                v2_0 = v1_4;
                            }
                        } else {
                            v2_0 = (- v1_4);
                        }
                        if (v4_0 >= 0) {
                            if (v4_0 <= 0) {
                                v1_4 = 0;
                            }
                        } else {
                            v1_4 = (- v1_4);
                        }
                        if (v2_0 >= 0) {
                            if (v2_0 > 0) {
                                v0_0.z();
                                if (v0_0.N.isFinished()) {
                                    v0_0.N.onAbsorb(v2_0);
                                }
                            }
                        } else {
                            v0_0.y();
                            if (v0_0.L.isFinished()) {
                                v0_0.L.onAbsorb((- v2_0));
                            }
                        }
                        if (v1_4 >= 0) {
                            if (v1_4 > 0) {
                                v0_0.x();
                                if (v0_0.O.isFinished()) {
                                    v0_0.O.onAbsorb(v1_4);
                                }
                            }
                        } else {
                            v0_0.A();
                            if (v0_0.M.isFinished()) {
                                v0_0.M.onAbsorb((- v1_4));
                            }
                        }
                        if ((v2_0 != 0) || (v1_4 != 0)) {
                            v0_0.postInvalidateOnAnimation();
                        }
                    }
                    if (androidx.recyclerview.widget.RecyclerView.K0) {
                        int v1_6 = v0_0.j0;
                        int v2_3 = ((int[]) v1_6.d);
                        if (v2_3 != 0) {
                            java.util.Arrays.fill(v2_3, -1);
                        }
                        v1_6.c = 0;
                    }
                }
                if (android.os.Build$VERSION.SDK_INT >= 35) {
                    a2.l0.a(v0_0, Math.abs(v11.getCurrVelocity()));
                }
            }
            int v1_12 = v0_0.s.e;
            if ((v1_12 != 0) && (v1_12.d)) {
                v1_12.g(0, 0);
            }
            this.e = 0;
            if (!this.f) {
                v0_0.setScrollState(0);
                v0_0.m0(1);
                return;
            } else {
                v0_0.removeCallbacks(this);
                v0_0.postOnAnimation(this);
                return;
            }
        } else {
            v0_0.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
    }
}
