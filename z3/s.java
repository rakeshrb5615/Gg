package z3;
public final class s {
    public android.content.res.ColorStateList A;
    public android.graphics.Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final android.animation.TimeInterpolator d;
    public final android.animation.TimeInterpolator e;
    public final android.animation.TimeInterpolator f;
    public final android.content.Context g;
    public final com.google.android.material.textfield.TextInputLayout h;
    public android.widget.LinearLayout i;
    public int j;
    public android.widget.FrameLayout k;
    public android.animation.AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public n.b1 r;
    public CharSequence s;
    public int t;
    public int u;
    public android.content.res.ColorStateList v;
    public CharSequence w;
    public boolean x;
    public n.b1 y;
    public int z;

    public s(com.google.android.material.textfield.TextInputLayout p4)
    {
        android.content.Context v0 = p4.getContext();
        this.g = v0;
        this.h = p4;
        this.m = ((float) v0.getResources().getDimensionPixelSize(2131165331));
        this.a = j5.t1.P(v0, 2130969533, 217);
        this.b = j5.t1.P(v0, 2130969529, 167);
        this.c = j5.t1.P(v0, 2130969533, 167);
        this.d = j5.t1.Q(v0, 2130969538, d3.a.d);
        android.animation.TimeInterpolator v4_9 = d3.a.a;
        this.e = j5.t1.Q(v0, 2130969538, v4_9);
        this.f = j5.t1.Q(v0, 2130969541, v4_9);
        return;
    }

    public final void a(n.b1 p7, int p8)
    {
        if ((this.i == null) && (this.k == null)) {
            android.widget.LinearLayout v3_2 = this.g;
            android.widget.EditText v0_10 = new android.widget.LinearLayout(v3_2);
            this.i = v0_10;
            v0_10.setOrientation(0);
            com.google.android.material.textfield.TextInputLayout v5 = this.h;
            v5.addView(this.i, -1, -2);
            this.k = new android.widget.FrameLayout(v3_2);
            this.i.addView(this.k, new android.widget.LinearLayout$LayoutParams(0, -2, 1065353216));
            if (v5.getEditText() != null) {
                this.b();
            }
        }
        if ((p8 != null) && (p8 != 1)) {
            this.i.addView(p7, new android.widget.LinearLayout$LayoutParams(-2, -2));
        } else {
            this.k.setVisibility(0);
            this.k.addView(p7);
        }
        this.i.setVisibility(0);
        this.j = (this.j + 1);
        return;
    }

    public final void b()
    {
        if (this.i != null) {
            int v0_1 = this.h;
            if (v0_1.getEditText() != null) {
                int v0_4 = v0_1.getEditText();
                int v1_2 = this.g;
                boolean v2 = j5.t1.J(v1_2);
                android.widget.LinearLayout v3 = this.i;
                int v4_0 = v0_4.getPaddingStart();
                if (v2) {
                    v4_0 = v1_2.getResources().getDimensionPixelSize(2131166007);
                }
                int v6_1 = v1_2.getResources().getDimensionPixelSize(2131166006);
                if (v2) {
                    v6_1 = v1_2.getResources().getDimensionPixelSize(2131166008);
                }
                int v0_2 = v0_4.getPaddingEnd();
                if (v2) {
                    v0_2 = v1_2.getResources().getDimensionPixelSize(2131166007);
                }
                v3.setPaddingRelative(v4_0, v6_1, v0_2, 0);
            }
        }
        return;
    }

    public final void c()
    {
        android.animation.AnimatorSet v0 = this.l;
        if (v0 != null) {
            v0.cancel();
        }
        return;
    }

    public final void d(java.util.ArrayList p8, boolean p9, n.b1 p10, int p11, int p12, int p13)
    {
        if ((p10 != 0) && ((p9 != null) && ((p11 == p13) || (p11 == p12)))) {
            android.animation.TimeInterpolator v1_1;
            if (p13 != p11) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            android.animation.ObjectAnimator v3_0;
            if (v1_1 == null) {
                v3_0 = 0;
            } else {
                v3_0 = 1065353216;
            }
            long v5_1;
            long v5_0 = new float[1];
            v5_0[0] = v3_0;
            android.animation.ObjectAnimator v3_1 = android.animation.ObjectAnimator.ofFloat(p10, android.view.View.ALPHA, v5_0);
            int v4_1 = this.c;
            if (v1_1 == null) {
                v5_1 = ((long) v4_1);
            } else {
                v5_1 = ((long) this.b);
            }
            android.animation.TimeInterpolator v1_0;
            v3_1.setDuration(v5_1);
            if (v1_1 == null) {
                v1_0 = this.f;
            } else {
                v1_0 = this.e;
            }
            v3_1.setInterpolator(v1_0);
            if ((p11 == p13) && (p12 != 0)) {
                v3_1.setStartDelay(((long) v4_1));
            }
            p8.add(v3_1);
            if ((p13 == p11) && (p12 != 0)) {
                float[] v13_2 = new float[2];
                v13_2[0] = (- this.m);
                v13_2[1] = 0;
                android.animation.ObjectAnimator v9_2 = android.animation.ObjectAnimator.ofFloat(p10, android.view.View.TRANSLATION_Y, v13_2);
                v9_2.setDuration(((long) this.a));
                v9_2.setInterpolator(this.d);
                v9_2.setStartDelay(((long) v4_1));
                p8.add(v9_2);
            }
        }
        return;
    }

    public final android.widget.TextView e(int p2)
    {
        if (p2 == 1) {
            return this.r;
        } else {
            if (p2 == 2) {
                return this.y;
            } else {
                return 0;
            }
        }
    }

    public final void f()
    {
        this.p = 0;
        this.c();
        if (this.n == 1) {
            if ((!this.x) || (android.text.TextUtils.isEmpty(this.w))) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        this.i(this.n, this.h(this.r, ""), this.o);
        return;
    }

    public final void g(n.b1 p3, int p4)
    {
        android.widget.LinearLayout v0 = this.i;
        if (v0 != null) {
            if ((p4 != null) && (p4 != 1)) {
                v0.removeView(p3);
            } else {
                android.widget.LinearLayout v4_2 = this.k;
                if (v4_2 == null) {
                } else {
                    v4_2.removeView(p3);
                }
            }
            int v3_1 = (this.j - 1);
            this.j = v3_1;
            if (v3_1 == 0) {
                this.i.setVisibility(8);
            }
        }
        return;
    }

    public final boolean h(n.b1 p3, CharSequence p4)
    {
        int v0_0 = this.h;
        if ((!v0_0.isLaidOut()) || ((!v0_0.isEnabled()) || ((this.o == this.n) && ((p3) && (android.text.TextUtils.equals(p3.getText(), p4)))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void i(int p17, boolean p18, int p19)
    {
        z3.s v0_0 = this;
        if (p17 != p19) {
            if (!p18) {
                if (p17 != p19) {
                    if (p19 != 0) {
                        android.widget.TextView v1_0 = this.e(p19);
                        if (v1_0 != null) {
                            v1_0.setVisibility(0);
                            v1_0.setAlpha(1065353216);
                        }
                    }
                    if (p17 != 0) {
                        android.widget.TextView v1_1 = this.e(p17);
                        if (v1_1 != null) {
                            v1_1.setVisibility(4);
                            if (p17 == 1) {
                                v1_1.setText(0);
                            }
                        }
                    }
                    this.n = p19;
                }
            } else {
                android.animation.AnimatorSet v9_1 = new android.animation.AnimatorSet();
                this.l = v9_1;
                android.widget.TextView v1_3 = new java.util.ArrayList();
                v0_0.d(v1_3, v0_0.x, this.y, 2, p17, p19);
                v0_0.d(v1_3, v0_0.q, v0_0.r, 1, p17, p19);
                int v2_6 = v1_3.size();
                android.widget.TextView v3_2 = 0;
                android.widget.TextView v5_2 = 0;
                while (v5_2 < v2_6) {
                    android.animation.Animator v10_1 = ((android.animation.Animator) v1_3.get(v5_2));
                    v3_2 = Math.max(v3_2, (v10_1.getDuration() + v10_1.getStartDelay()));
                    v5_2++;
                }
                int v2_8 = android.animation.ValueAnimator.ofInt(new int[] {0, 0}));
                v2_8.setDuration(v3_2);
                v1_3.add(0, v2_8);
                v9_1.playTogether(v1_3);
                v0_0 = this;
                v9_1.addListener(new z3.q(this, p19, this.e(p17), p17, this.e(p19)));
                v9_1.start();
            }
            android.widget.TextView v1_6 = v0_0.h;
            v1_6.t();
            v1_6.w(p18, 0);
            v1_6.z();
            return;
        } else {
            return;
        }
    }
}
