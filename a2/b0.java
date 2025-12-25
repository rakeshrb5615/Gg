package a2;
public class b0 {
    public int a;
    public androidx.recyclerview.widget.RecyclerView b;
    public a2.t0 c;
    public boolean d;
    public boolean e;
    public android.view.View f;
    public final a2.e1 g;
    public boolean h;
    public final android.view.animation.LinearInterpolator i;
    public final android.view.animation.DecelerateInterpolator j;
    public android.graphics.PointF k;
    public final android.util.DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public b0(android.content.Context p4)
    {
        this.a = -1;
        android.view.animation.DecelerateInterpolator v1_5 = new a2.e1();
        v1_5.d = -1;
        v1_5.f = 0;
        v1_5.g = 0;
        v1_5.a = 0;
        v1_5.b = 0;
        v1_5.c = -2147483648;
        v1_5.e = 0;
        this.g = v1_5;
        this.i = new android.view.animation.LinearInterpolator();
        this.j = new android.view.animation.DecelerateInterpolator();
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.l = p4.getResources().getDisplayMetrics();
        return;
    }

    public static int a(int p1, int p2, int p3, int p4, int p5)
    {
        if (p5 == -1) {
            return (p3 - p1);
        } else {
            if (p5 == 0) {
                int v3_2 = (p3 - p1);
                if (v3_2 <= 0) {
                    int v4_2 = (p4 - p2);
                    if (v4_2 >= 0) {
                        return 0;
                    } else {
                        return v4_2;
                    }
                } else {
                    return v3_2;
                }
            } else {
                if (p5 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                } else {
                    return (p4 - p2);
                }
            }
        }
    }

    public int b(android.view.View p5, int p6)
    {
        int v0_0 = this.c;
        if ((v0_0 != 0) && (v0_0.d())) {
            int v1_4 = ((a2.u0) p5.getLayoutParams());
            return a2.b0.a(((p5.getLeft() - ((a2.u0) p5.getLayoutParams()).b.left) - v1_4.leftMargin), ((p5.getRight() + ((a2.u0) p5.getLayoutParams()).b.right) + v1_4.rightMargin), v0_0.D(), (v0_0.n - v0_0.E()), p6);
        } else {
            return 0;
        }
    }

    public int c(android.view.View p5, int p6)
    {
        int v0_0 = this.c;
        if ((v0_0 != 0) && (v0_0.e())) {
            int v1_4 = ((a2.u0) p5.getLayoutParams());
            return a2.b0.a(((p5.getTop() - ((a2.u0) p5.getLayoutParams()).b.top) - v1_4.topMargin), ((p5.getBottom() + ((a2.u0) p5.getLayoutParams()).b.bottom) + v1_4.bottomMargin), v0_0.F(), (v0_0.o - v0_0.C()), p6);
        } else {
            return 0;
        }
    }

    public float d(android.util.DisplayMetrics p2)
    {
        return (1103626240 / ((float) p2.densityDpi));
    }

    public int e(int p3)
    {
        int v3_4 = ((float) Math.abs(p3));
        if (!this.m) {
            this.n = this.d(this.l);
            this.m = 1;
        }
        return ((int) Math.ceil(((double) (v3_4 * this.n))));
    }

    public android.graphics.PointF f(int p3)
    {
        String v0_0 = this.c;
        if (!(v0_0 instanceof a2.f1)) {
            int v3_5 = new StringBuilder("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            v3_5.append(a2.f1.getCanonicalName());
            android.util.Log.w("RecyclerView", v3_5.toString());
            return 0;
        } else {
            return ((a2.f1) v0_0).a(p3);
        }
    }

    public final void g(int p9, int p10)
    {
        androidx.recyclerview.widget.RecyclerView v0 = this.b;
        int v2_2 = -1;
        if ((this.a == -1) || (v0 == null)) {
            this.i();
        }
        if ((this.d) && ((this.f == null) && (this.c != null))) {
            a2.g1 v1_5 = this.f(this.a);
            if (v1_5 != null) {
                int v5_0 = v1_5.x;
                if ((v5_0 != 0) || (v1_5.y != 0)) {
                    v0.e0(((int) Math.signum(v5_0)), ((int) Math.signum(v1_5.y)), 0);
                }
            }
        }
        a2.g1 v1_3 = 0;
        this.d = 0;
        int v5_3 = this.f;
        float v6_3 = this.g;
        if (v5_3 != 0) {
            this.b.getClass();
            int v5_4 = androidx.recyclerview.widget.RecyclerView.M(v5_3);
            if (v5_4 != 0) {
                v2_2 = v5_4.b();
            }
            if (v2_2 != this.a) {
                android.util.Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = 0;
            } else {
                this.h(this.f, v6_3);
                v6_3.a(v0);
                this.i();
            }
        }
        if (this.e) {
            if (this.b.s.v() != 0) {
                int v2_9 = this.o;
                android.view.animation.LinearInterpolator v9_13 = (v2_9 - p9);
                if ((v2_9 * v9_13) <= 0) {
                    v9_13 = 0;
                }
                this.o = v9_13;
                int v2_11 = this.p;
                int v10_6 = (v2_11 - p10);
                if ((v2_11 * v10_6) <= 0) {
                    v10_6 = 0;
                }
                this.p = v10_6;
                if ((v9_13 == null) && (v10_6 == 0)) {
                    android.view.animation.LinearInterpolator v9_15 = this.f(this.a);
                    if (v9_15 != null) {
                        int v10_7 = v9_15.x;
                        if ((v10_7 != 0) || (v9_15.y != 0)) {
                            int v10_9 = ((float) Math.sqrt(((double) ((v9_15.y * v9_15.y) + (v10_7 * v10_7)))));
                            int v2_20 = (v9_15.x / v10_9);
                            v9_15.x = v2_20;
                            int v4_0 = (v9_15.y / v10_9);
                            v9_15.y = v4_0;
                            this.k = v9_15;
                            this.o = ((int) (v2_20 * 1176256512));
                            this.p = ((int) (v4_0 * 1176256512));
                            int v4_5 = ((int) (((float) this.p) * 1067030938));
                            android.view.animation.LinearInterpolator v9_7 = ((int) (((float) this.e(10000)) * 1067030938));
                            v6_3.a = ((int) (((float) this.o) * 1067030938));
                            v6_3.b = v4_5;
                            v6_3.c = v9_7;
                            v6_3.e = this.i;
                            v6_3.f = 1;
                            if (v6_3.d >= 0) {
                                v1_3 = 1;
                            }
                            v6_3.a(v0);
                            if ((v1_3 != null) && (this.e)) {
                                this.d = 1;
                                v0.h0.b();
                            }
                            return;
                        }
                    }
                    v6_3.d = this.a;
                    this.i();
                }
            } else {
                this.i();
            }
        }
        return;
    }

    public void h(android.view.View p7, a2.e1 p8)
    {
        int v0_1;
        int v0_0 = this.k;
        int v1_0 = 0;
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            int v0_5 = v0_0.x cmp 0;
            if (v0_5 != 0) {
                if (v0_5 <= 0) {
                    v0_1 = -1;
                } else {
                    v0_1 = 1;
                }
            }
        }
        int v0_2 = this.b(p7, v0_1);
        float v5_0 = this.k;
        if (v5_0 != 0) {
            long v4_0 = v5_0.y cmp 0;
            if (v4_0 != 0) {
                if (v4_0 <= 0) {
                    v1_0 = -1;
                } else {
                    v1_0 = 1;
                }
            }
        }
        android.view.animation.DecelerateInterpolator v7_1 = this.c(p7, v1_0);
        int v1_9 = ((int) Math.ceil((((double) this.e(((int) Math.sqrt(((double) ((v7_1 * v7_1) + (v0_2 * v0_2))))))) / 4599717252057688074)));
        if (v1_9 > 0) {
            android.view.animation.DecelerateInterpolator v7_2 = (- v7_1);
            p8.a = (- v0_2);
            p8.b = v7_2;
            p8.c = v1_9;
            p8.e = this.j;
            p8.f = 1;
        }
        return;
    }

    public final void i()
    {
        if (this.e) {
            this.e = 0;
            this.p = 0;
            this.o = 0;
            this.k = 0;
            this.b.k0.a = -1;
            this.f = 0;
            this.a = -1;
            this.d = 0;
            a2.t0 v0_1 = this.c;
            if (v0_1.e == this) {
                v0_1.e = 0;
            }
            this.c = 0;
            this.b = 0;
            return;
        } else {
            return;
        }
    }
}
