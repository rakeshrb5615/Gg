package t0;
public final class d implements android.view.View$OnTouchListener {
    public static final int x;
    public final t0.a a;
    public final android.view.animation.AccelerateInterpolator b;
    public final n.t1 c;
    public a2.l d;
    public final float[] e;
    public final float[] f;
    public final int m;
    public final int n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final n.t1 w;

    static d()
    {
        t0.d.x = android.view.ViewConfiguration.getTapTimeout();
        return;
    }

    public d(n.t1 p12)
    {
        t0.a v0_1 = new t0.a();
        v0_1.e = -9223372036854775808;
        v0_1.g = -1;
        v0_1.f = 0;
        this.a = v0_1;
        this.b = new android.view.animation.AccelerateInterpolator();
        float[] v2 = new float[2];
        v2 = {0, 0};
        this.e = v2;
        float[] v3 = new float[2];
        v3 = {2139095039, 2139095039};
        this.f = v3;
        float[] v4 = new float[2];
        v4 = {0, 0};
        this.o = v4;
        float[] v5 = new float[2];
        v5 = {0, 0};
        this.p = v5;
        int v1_3 = new float[2];
        v1_3 = {2139095039, 2139095039};
        this.q = v1_3;
        this.c = p12;
        int v6_2 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        int v6_5 = ((int) ((v6_2 * 1134395392) + 1056964608));
        float v7_5 = (((float) ((int) ((1153753088 * v6_2) + 1056964608))) / 1148846080);
        v1_3[0] = v7_5;
        v1_3[1] = v7_5;
        int v1_7 = (((float) v6_5) / 1148846080);
        v5[0] = v1_7;
        v5[1] = v1_7;
        this.m = 1;
        v3[0] = 2139095039;
        v3[1] = 2139095039;
        v2[0] = 1045220557;
        v2[1] = 1045220557;
        v4[0] = 981668463;
        v4[1] = 981668463;
        this.n = t0.d.x;
        v0_1.a = 500;
        v0_1.b = 500;
        this.w = p12;
        return;
    }

    public static float b(float p1, float p2, float p3)
    {
        if (p1 <= p3) {
            if (p1 >= p2) {
                return p1;
            } else {
                return p2;
            }
        } else {
            return p3;
        }
    }

    public final float a(int p4, float p5, float p6, float p7)
    {
        float v5_4;
        float v5_3;
        float v0_8 = t0.d.b((this.e[p4] * p6), 0, this.f[p4]);
        float v5_2 = (this.c((p6 - p5), v0_8) - this.c(p5, v0_8));
        float v0_2 = this.b;
        if (v5_2 >= 0) {
            if (v5_2 <= 0) {
                v5_3 = 0;
            } else {
                v5_4 = v0_2.getInterpolation(v5_2);
                v5_3 = t0.d.b(v5_4, -1082130432, 1065353216);
            }
        } else {
            v5_4 = (- v0_2.getInterpolation((- v5_2)));
        }
        float v6_5 = v5_3 cmp 0;
        if (v6_5 != 0) {
            float v1_3 = this.p[p4];
            float v4_1 = this.q[p4];
            float v0_6 = (this.o[p4] * p7);
            if (v6_5 <= 0) {
                return (- t0.d.b(((- v5_3) * v0_6), v1_3, v4_1));
            } else {
                return t0.d.b((v5_3 * v0_6), v1_3, v4_1);
            }
        } else {
            return 0;
        }
    }

    public final float c(float p6, float p7)
    {
        if (p7 != 0) {
            int v2 = this.m;
            if ((v2 == 0) || (v2 == 1)) {
                if (p6 < p7) {
                    if (p6 < 0) {
                        if ((this.u) && (v2 == 1)) {
                            return 1065353216;
                        }
                    } else {
                        return (1065353216 - (p6 / p7));
                    }
                }
            } else {
                if ((v2 == 2) && (p6 < 0)) {
                    return (p6 / (- p7));
                }
            }
        }
        return 0;
    }

    public final void d()
    {
        int v1_0 = 0;
        if (!this.s) {
            long v2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            t0.a v0_1 = this.a;
            int v4_2 = ((int) (v2 - v0_1.e));
            int v5 = v0_1.b;
            if (v4_2 <= v5) {
                if (v4_2 >= 0) {
                    v1_0 = v4_2;
                }
            } else {
                v1_0 = v5;
            }
            v0_1.i = v1_0;
            v0_1.h = v0_1.a(v2);
            v0_1.g = v2;
            return;
        } else {
            this.u = 0;
            return;
        }
    }

    public final boolean e()
    {
        int v0_0 = this.a;
        int v1_0 = v0_0.d;
        int v1_6 = ((int) (v1_0 / Math.abs(v1_0)));
        Math.abs(v0_0.c);
        if (v1_6 != 0) {
            int v2_0 = this.w;
            int v3 = v2_0.getCount();
            if (v3 != 0) {
                int v4_0 = v2_0.getChildCount();
                int v5 = v2_0.getFirstVisiblePosition();
                if (v1_6 <= 0) {
                    if ((v1_6 >= 0) || ((v5 <= 0) && (v2_0.getChildAt(0).getTop() >= 0))) {
                        return 0;
                    }
                } else {
                    if (((v5 + v4_0) >= v3) && (v2_0.getChildAt((v4_0 - 1)).getBottom() <= v2_0.getHeight())) {
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    public final boolean onTouch(android.view.View p8, android.view.MotionEvent p9)
    {
        if (this.v) {
            float v0_3 = p9.getActionMasked();
            if (v0_3 == 0) {
                this.t = 1;
                this.r = 0;
            } else {
                if (v0_3 != 1) {
                    if (v0_3 == 2) {
                        n.t1 v4 = this.c;
                        float v0_2 = this.a(0, p9.getX(), ((float) p8.getWidth()), ((float) v4.getWidth()));
                        java.util.WeakHashMap v8_3 = this.a(1, p9.getY(), ((float) p8.getHeight()), ((float) v4.getHeight()));
                        a2.l v9_2 = this.a;
                        v9_2.c = v0_2;
                        v9_2.d = v8_3;
                        if ((this.u) || (!this.e())) {
                            return 0;
                        } else {
                            if (this.d == null) {
                                this.d = new a2.l(this, 8);
                            }
                            this.u = 1;
                            this.s = 1;
                            if (this.r) {
                                this.d.run();
                            } else {
                                java.util.WeakHashMap v8_10 = this.n;
                                if (v8_10 <= null) {
                                } else {
                                    v4.postOnAnimationDelayed(this.d, ((long) v8_10));
                                }
                            }
                            this.r = 1;
                            return 0;
                        }
                    } else {
                        if (v0_3 != 3) {
                            return 0;
                        }
                    }
                }
                this.d();
                return 0;
            }
        }
        return 0;
    }
}
