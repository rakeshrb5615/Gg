package a2;
public final class p extends a2.q0 {
    public static final int[] C;
    public static final int[] D;
    public int A;
    public final a2.l B;
    public final int a;
    public final int b;
    public final android.graphics.drawable.StateListDrawable c;
    public final android.graphics.drawable.Drawable d;
    public final int e;
    public final int f;
    public final android.graphics.drawable.StateListDrawable g;
    public final android.graphics.drawable.Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public final androidx.recyclerview.widget.RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final android.animation.ValueAnimator z;

    static p()
    {
        a2.p.C = new int[] {16842919});
        int[] v0_3 = new int[0];
        a2.p.D = v0_3;
        return;
    }

    public p(androidx.recyclerview.widget.RecyclerView p7, android.graphics.drawable.StateListDrawable p8, android.graphics.drawable.Drawable p9, android.graphics.drawable.StateListDrawable p10, android.graphics.drawable.Drawable p11, int p12, int p13, int p14)
    {
        int v0 = 0;
        this.q = 0;
        this.r = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        android.animation.ValueAnimator v2_3 = new int[2];
        this.x = v2_3;
        android.animation.ValueAnimator v2_0 = new int[2];
        this.y = v2_0;
        android.animation.ValueAnimator v2_1 = new float[2];
        v2_1 = {0, 1065353216};
        android.animation.ValueAnimator v2_2 = android.animation.ValueAnimator.ofFloat(v2_1);
        this.z = v2_2;
        this.A = 0;
        a2.l v3_1 = new a2.l(this, 0);
        this.B = v3_1;
        a2.m v4_1 = new a2.m(this, 0);
        this.c = p8;
        this.d = p9;
        this.g = p10;
        this.h = p11;
        this.e = Math.max(p12, p8.getIntrinsicWidth());
        this.f = Math.max(p12, p9.getIntrinsicWidth());
        this.i = Math.max(p12, p10.getIntrinsicWidth());
        this.j = Math.max(p12, p11.getIntrinsicWidth());
        this.a = p13;
        this.b = p14;
        p8.setAlpha(255);
        p9.setAlpha(255);
        v2_2.addListener(new a2.n(this));
        v2_2.addUpdateListener(new a2.o(this, 0));
        androidx.recyclerview.widget.RecyclerView v8_5 = this.s;
        if (v8_5 != p7) {
            if (v8_5 != null) {
                int v9_1 = v8_5.u;
                a2.t0 v10_6 = v8_5.s;
                if (v10_6 != null) {
                    v10_6.c("Cannot remove item decoration during a scroll  or layout");
                }
                v9_1.remove(this);
                if (v9_1.isEmpty()) {
                    if (v8_5.getOverScrollMode() == 2) {
                        v0 = 1;
                    }
                    v8_5.setWillNotDraw(v0);
                }
                v8_5.R();
                v8_5.requestLayout();
                androidx.recyclerview.widget.RecyclerView v8_6 = this.s;
                v8_6.v.remove(this);
                if (v8_6.w == this) {
                    v8_6.w = 0;
                }
                androidx.recyclerview.widget.RecyclerView v8_8 = this.s.m0;
                if (v8_8 != null) {
                    v8_8.remove(v4_1);
                }
                this.s.removeCallbacks(v3_1);
            }
            this.s = p7;
            p7.i(this);
            this.s.v.add(this);
            this.s.j(v4_1);
            return;
        } else {
            return;
        }
    }

    public static int e(float p2, float p3, int[] p4, int p5, int p6, int p7)
    {
        int v0_2 = (p4[1] - p4[0]);
        if (v0_2 != 0) {
            int v5_1 = (p5 - p7);
            int v2_2 = ((int) (((p3 - p2) / ((float) v0_2)) * ((float) v5_1)));
            int v6_1 = (p6 + v2_2);
            if ((v6_1 < v5_1) && (v6_1 >= 0)) {
                return v2_2;
            }
        }
        return 0;
    }

    public final void b(android.graphics.Canvas p9, androidx.recyclerview.widget.RecyclerView p10)
    {
        if ((this.q == this.s.getWidth()) && (this.r == this.s.getHeight())) {
            if (this.A != 0) {
                if (this.t) {
                    int v2_0 = this.e;
                    float v10_4 = (this.q - v2_0);
                    int v4_0 = this.k;
                    int v3_1 = (this.l - (v4_0 / 2));
                    android.graphics.drawable.StateListDrawable v5_1 = this.c;
                    v5_1.setBounds(0, 0, v2_0, v4_0);
                    android.graphics.drawable.Drawable v7 = this.d;
                    v7.setBounds(0, 0, this.f, this.r);
                    if (this.s.getLayoutDirection() != 1) {
                        p9.translate(((float) v10_4), 0);
                        v7.draw(p9);
                        p9.translate(0, ((float) v3_1));
                        v5_1.draw(p9);
                        p9.translate(((float) (- v10_4)), ((float) (- v3_1)));
                    } else {
                        v7.draw(p9);
                        p9.translate(((float) v2_0), ((float) v3_1));
                        p9.scale(-1082130432, 1065353216);
                        v5_1.draw(p9);
                        p9.scale(-1082130432, 1065353216);
                        p9.translate(((float) (- v2_0)), ((float) (- v3_1)));
                    }
                }
                if (this.u) {
                    int v2_7 = this.i;
                    float v10_14 = (this.r - v2_7);
                    int v4_6 = this.n;
                    int v3_3 = (this.o - (v4_6 / 2));
                    android.graphics.drawable.StateListDrawable v5_3 = this.g;
                    v5_3.setBounds(0, 0, v4_6, v2_7);
                    android.graphics.drawable.Drawable v6_2 = this.h;
                    v6_2.setBounds(0, 0, this.q, this.j);
                    p9.translate(0, ((float) v10_14));
                    v6_2.draw(p9);
                    p9.translate(((float) v3_3), 0);
                    v5_3.draw(p9);
                    p9.translate(((float) (- v3_3)), ((float) (- v10_14)));
                }
            }
            return;
        } else {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            this.f(0);
            return;
        }
    }

    public final boolean c(float p3, float p4)
    {
        if (p4 >= ((float) (this.r - this.i))) {
            float v4_3 = this.o;
            int v0_5 = this.n;
            if ((p3 >= ((float) (v4_3 - (v0_5 / 2)))) && (p3 <= ((float) ((v0_5 / 2) + v4_3)))) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean d(float p4, float p5)
    {
        float v1_3 = this.e;
        if (this.s.getLayoutDirection() != 1) {
            if (p4 >= ((float) (this.q - v1_3))) {
                float v4_2 = this.l;
                int v0_3 = (this.k / 2);
                if ((p5 >= ((float) (v4_2 - v0_3))) && (p5 <= ((float) (v0_3 + v4_2)))) {
                    return 1;
                }
            }
        } else {
            if (p4 <= ((float) v1_3)) {
            }
        }
        return 0;
    }

    public final void f(int p5)
    {
        a2.l v0 = this.B;
        androidx.recyclerview.widget.RecyclerView v1_0 = this.c;
        if ((p5 == 2) && (this.v != 2)) {
            v1_0.setState(a2.p.C);
            this.s.removeCallbacks(v0);
        }
        if (p5 != 0) {
            this.g();
        } else {
            this.s.invalidate();
        }
        if ((this.v != 2) || (p5 == 2)) {
            if (p5 == 1) {
                this.s.removeCallbacks(v0);
                this.s.postDelayed(v0, ((long) 1500));
            }
        } else {
            v1_0.setState(a2.p.D);
            this.s.removeCallbacks(v0);
            this.s.postDelayed(v0, ((long) 1200));
        }
        this.v = p5;
        return;
    }

    public final void g()
    {
        int v0_0 = this.A;
        android.animation.ValueAnimator v1 = this.z;
        if (v0_0 != 0) {
            if (v0_0 == 3) {
                v1.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        float[] v3_1 = new float[2];
        v3_1[0] = ((Float) v1.getAnimatedValue()).floatValue();
        v3_1[1] = 1065353216;
        v1.setFloatValues(v3_1);
        v1.setDuration(500);
        v1.setStartDelay(0);
        v1.start();
        return;
    }
}
