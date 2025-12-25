package a2;
public final class c0 extends a2.v0 {
    public androidx.recyclerview.widget.RecyclerView a;
    public android.widget.Scroller b;
    public final a2.n1 c;
    public final synthetic int d;
    public a2.d0 e;
    public a2.d0 f;

    public c0(int p1)
    {
        this.d = p1;
        this.c = new a2.n1(this);
        return;
    }

    public static int c(android.view.View p1, a2.e0 p2)
    {
        return (((p2.c(p1) / 2) + p2.e(p1)) - ((p2.l() / 2) + p2.k()));
    }

    public static android.view.View e(a2.t0 p8, a2.e0 p9)
    {
        int v0 = p8.v();
        android.view.View v1 = 0;
        if (v0 != 0) {
            int v3_2 = ((p9.l() / 2) + p9.k());
            int v2_0 = 2147483647;
            int v4 = 0;
            while (v4 < v0) {
                android.view.View v5 = p8.u(v4);
                int v6_1 = Math.abs((((p9.c(v5) / 2) + p9.e(v5)) - v3_2));
                if (v6_1 < v2_0) {
                    v1 = v5;
                    v2_0 = v6_1;
                }
                v4++;
            }
            return v1;
        } else {
            return 0;
        }
    }

    public static android.view.View f(a2.t0 p8, a2.e0 p9)
    {
        int v0 = p8.v();
        android.view.View v1 = 0;
        if (v0 != 0) {
            int v3_2 = ((p9.l() / 2) + p9.k());
            int v2_0 = 2147483647;
            int v4 = 0;
            while (v4 < v0) {
                android.view.View v5 = p8.u(v4);
                int v6_1 = Math.abs((((p9.c(v5) / 2) + p9.e(v5)) - v3_2));
                if (v6_1 < v2_0) {
                    v1 = v5;
                    v2_0 = v6_1;
                }
                v4++;
            }
            return v1;
        } else {
            return 0;
        }
    }

    public final void a(androidx.recyclerview.widget.RecyclerView p4)
    {
        String v0_0 = this.a;
        if (v0_0 != p4) {
            android.view.animation.DecelerateInterpolator v1_0 = this.c;
            if (v0_0 != null) {
                String v0_4 = v0_0.m0;
                if (v0_4 != null) {
                    v0_4.remove(v1_0);
                }
                this.a.setOnFlingListener(0);
            }
            this.a = p4;
            if (p4 != null) {
                if (p4.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                } else {
                    this.a.j(v1_0);
                    this.a.setOnFlingListener(this);
                    this.b = new android.widget.Scroller(this.a.getContext(), new android.view.animation.DecelerateInterpolator());
                    this.l();
                    return;
                }
            }
        }
        return;
    }

    public final int[] b(a2.t0 p7, android.view.View p8)
    {
        switch (this.d) {
            case 0:
                boolean v1_0 = new int[2];
                if (!p7.d()) {
                    v1_0[0] = 0;
                } else {
                    int v2_0 = this.h(p7);
                    v1_0[0] = (((v2_0.c(p8) / 2) + v2_0.e(p8)) - ((v2_0.l() / 2) + v2_0.k()));
                }
                if (!p7.e()) {
                    v1_0[1] = 0;
                } else {
                    int v7_1 = this.j(p7);
                    v1_0[1] = (((v7_1.c(p8) / 2) + v7_1.e(p8)) - ((v7_1.l() / 2) + v7_1.k()));
                }
                return v1_0;
            default:
                int v0_3 = new int[2];
                if (!p7.d()) {
                    v0_3[0] = 0;
                } else {
                    v0_3[0] = a2.c0.c(p8, this.i(p7));
                }
                if (!p7.e()) {
                    v0_3[1] = 0;
                } else {
                    v0_3[1] = a2.c0.c(p8, this.k(p7));
                }
                return v0_3;
        }
    }

    public int d(a2.t0 p12, a2.e0 p13, int p14, int p15)
    {
        this.b.fling(0, 0, p14, p15, -2147483648, 2147483647, -2147483648, 2147483647);
        int[] v14_3 = new int[] {this.b.getFinalX(), this.b.getFinalY()});
        int v15_3 = p12.v();
        float v2_0 = 1065353216;
        if (v15_3 != 0) {
            android.view.View v3_0 = 0;
            int v7_1 = 0;
            int v6_0 = -2147483648;
            int v5_1 = 2147483647;
            android.view.View v4_1 = 0;
            while (v7_1 < v15_3) {
                android.view.View v8_1 = p12.u(v7_1);
                int v9 = a2.t0.G(v8_1);
                if (v9 != -1) {
                    if (v9 < v5_1) {
                        v3_0 = v8_1;
                        v5_1 = v9;
                    }
                    if (v9 > v6_0) {
                        v4_1 = v8_1;
                        v6_0 = v9;
                    }
                }
                v7_1++;
            }
            if ((v3_0 != null) && (v4_1 != null)) {
                float v13_3 = (Math.max(p13.b(v3_0), p13.b(v4_1)) - Math.min(p13.e(v3_0), p13.e(v4_1)));
                if (v13_3 != 0) {
                    v2_0 = ((((float) v13_3) * 1065353216) / ((float) ((v6_0 - v5_1) + 1)));
                }
            }
        }
        if (v2_0 > 0) {
            float v12_9;
            if (Math.abs(v14_3[0]) <= Math.abs(v14_3[1])) {
                v12_9 = v14_3[1];
            } else {
                v12_9 = v14_3[0];
            }
            return Math.round((((float) v12_9) / v2_0));
        } else {
            return 0;
        }
    }

    public final android.view.View g(a2.t0 p2)
    {
        switch (this.d) {
            case 0:
                int v2_1;
                if (!p2.e()) {
                    if (!p2.d()) {
                        v2_1 = 0;
                    } else {
                        v2_1 = a2.c0.e(p2, this.h(p2));
                    }
                } else {
                    v2_1 = a2.c0.e(p2, this.j(p2));
                }
                return v2_1;
            default:
                int v2_2;
                if (!p2.e()) {
                    if (!p2.d()) {
                        v2_2 = 0;
                    } else {
                        v2_2 = a2.c0.f(p2, this.i(p2));
                    }
                } else {
                    v2_2 = a2.c0.f(p2, this.k(p2));
                }
                return v2_2;
        }
    }

    public a2.e0 h(a2.t0 p3)
    {
        a2.d0 v0_0 = this.f;
        if ((v0_0 == null) || (((a2.t0) v0_0.b) != p3)) {
            this.f = new a2.d0(p3, 0);
        }
        return this.f;
    }

    public a2.e0 i(a2.t0 p3)
    {
        a2.d0 v0_0 = this.f;
        if ((v0_0 == null) || (((a2.t0) v0_0.b) != p3)) {
            this.f = new a2.d0(p3, 0);
        }
        return this.f;
    }

    public a2.e0 j(a2.t0 p3)
    {
        a2.d0 v0_0 = this.e;
        if ((v0_0 == null) || (((a2.t0) v0_0.b) != p3)) {
            this.e = new a2.d0(p3, 1);
        }
        return this.e;
    }

    public a2.e0 k(a2.t0 p3)
    {
        a2.d0 v0_0 = this.e;
        if ((v0_0 == null) || (((a2.t0) v0_0.b) != p3)) {
            this.e = new a2.d0(p3, 1);
        }
        return this.e;
    }

    public final void l()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            int v0_2 = v0_0.getLayoutManager();
            if (v0_2 != 0) {
                int v1_1 = this.g(v0_2);
                if (v1_1 != 0) {
                    int v0_3 = this.b(v0_2, v1_1);
                    int v2 = v0_3[0];
                    if ((v2 != 0) || (v0_3[1] != 0)) {
                        this.a.h0(v2, 0, v0_3[1]);
                        return;
                    }
                }
            }
        }
        return;
    }
}
