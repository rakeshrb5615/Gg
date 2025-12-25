package i3;
public final class f {
    public final com.google.android.material.button.MaterialButton a;
    public v3.p b;
    public v3.d0 c;
    public f1.h d;
    public a5.a e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public android.graphics.PorterDuff$Mode l;
    public android.content.res.ColorStateList m;
    public android.content.res.ColorStateList n;
    public android.content.res.ColorStateList o;
    public v3.k p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public android.graphics.drawable.RippleDrawable v;
    public int w;

    public f(com.google.android.material.button.MaterialButton p2, v3.p p3)
    {
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.u = 1;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final v3.k a(boolean p3)
    {
        android.graphics.drawable.LayerDrawable v0_0 = this.v;
        if ((v0_0 == null) || (v0_0.getNumberOfLayers() <= 0)) {
            return 0;
        } else {
            return ((v3.k) ((android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable((p3 ^ 1)));
        }
    }

    public final void b(int p9, int p10)
    {
        com.google.android.material.button.MaterialButton v0 = this.a;
        int v1 = v0.getPaddingStart();
        int v2_2 = v0.getPaddingTop();
        int v3 = v0.getPaddingEnd();
        int v4_2 = v0.getPaddingBottom();
        int v5 = this.h;
        int v6 = this.i;
        this.i = p10;
        this.h = p9;
        if (!this.r) {
            this.c();
        }
        v0.setPaddingRelative(v1, ((v2_2 + p9) - v5), v3, ((v4_2 + p10) - v6));
        return;
    }

    public final void c()
    {
        v3.k v0_1 = new v3.k(this.b);
        int[] v1_2 = this.c;
        if (v1_2 != null) {
            v0_1.q(v1_2);
        }
        int[] v1_3 = this.d;
        if (v1_3 != null) {
            v0_1.m(v1_3);
        }
        int[] v1_4 = this.e;
        if (v1_4 != null) {
            v0_1.J = v1_4;
        }
        int[] v1_1 = this.a;
        v0_1.l(v1_1.getContext());
        v0_1.setTintList(this.m);
        float v2_2 = this.l;
        if (v2_2 != 0) {
            v0_1.setTintMode(v2_2);
        }
        int v3_0 = this.n;
        v0_1.b.k = ((float) this.k);
        v0_1.invalidateSelf();
        v0_1.r(v3_0);
        float v2_6 = new v3.k(this.b);
        int v3_2 = this.c;
        if (v3_2 != 0) {
            v2_6.q(v3_2);
        }
        int v3_3 = this.d;
        if (v3_3 != 0) {
            v2_6.m(v3_3);
        }
        android.content.res.ColorStateList v5_1;
        v2_6.setTint(0);
        android.graphics.drawable.RippleDrawable v4_2 = ((float) this.k);
        if (!this.q) {
            v5_1 = 0;
        } else {
            v5_1 = j5.t1.u(v1_1, 2130968890);
        }
        v2_6.b.k = v4_2;
        v2_6.invalidateSelf();
        v2_6.r(android.content.res.ColorStateList.valueOf(v5_1));
        android.graphics.drawable.RippleDrawable v4_5 = new v3.k(this.b);
        this.p = v4_5;
        android.content.res.ColorStateList v5_4 = this.c;
        if (v5_4 != null) {
            v4_5.q(v5_4);
        }
        android.graphics.drawable.RippleDrawable v4_6 = this.d;
        if (v4_6 != null) {
            this.p.m(v4_6);
        }
        this.p.setTint(-1);
        android.content.res.ColorStateList v5_8 = t3.a.a(this.o);
        android.graphics.drawable.InsetDrawable v6_2 = new android.graphics.drawable.Drawable[2];
        v6_2[0] = v2_6;
        v6_2[1] = v0_1;
        android.graphics.drawable.RippleDrawable v4_9 = new android.graphics.drawable.RippleDrawable(v5_8, new android.graphics.drawable.InsetDrawable(new android.graphics.drawable.LayerDrawable(v6_2), this.f, this.h, this.g, this.i), this.p);
        this.v = v4_9;
        v1_1.setInternalBackground(v4_9);
        v3.k v0_3 = this.a(0);
        if (v0_3 != null) {
            v0_3.n(((float) this.w));
            v0_3.setState(v1_1.getDrawableState());
        }
        return;
    }

    public final void d()
    {
        v3.k v0_2 = this.a(0);
        if (v0_2 != null) {
            f1.h v1_6 = this.c;
            if (v1_6 == null) {
                v0_2.setShapeAppearanceModel(this.b);
            } else {
                v0_2.q(v1_6);
            }
            f1.h v1_12 = this.d;
            if (v1_12 != null) {
                v0_2.m(v1_12);
            }
        }
        f1.h v1_0 = this.a(1);
        if (v1_0 != null) {
            int v2_0 = this.c;
            if (v2_0 == 0) {
                v1_0.setShapeAppearanceModel(this.b);
            } else {
                v1_0.q(v2_0);
            }
            int v2_2 = this.d;
            if (v2_2 != 0) {
                v1_0.m(v2_2);
            }
        }
        v3.k v0_3;
        f1.h v1_1 = this.v;
        if ((v1_1 == null) || (v1_1.getNumberOfLayers() <= 1)) {
            v0_3 = 0;
        } else {
            if (this.v.getNumberOfLayers() <= 2) {
                v0_3 = ((v3.a0) this.v.getDrawable(1));
            } else {
                v0_3 = ((v3.a0) this.v.getDrawable(2));
            }
        }
        if (v0_3 != null) {
            v0_3.setShapeAppearanceModel(this.b);
            if ((v0_3 instanceof v3.k)) {
                v3.k v0_7 = ((v3.k) v0_3);
                f1.h v1_9 = this.c;
                if (v1_9 != null) {
                    v0_7.q(v1_9);
                }
                f1.h v1_10 = this.d;
                if (v1_10 != null) {
                    v0_7.m(v1_10);
                }
            }
        }
        return;
    }

    public final void e()
    {
        android.content.res.ColorStateList v0_0 = 0;
        float v1_2 = this.a(0);
        v3.k v2_1 = this.a(1);
        if (v1_2 != 0) {
            android.content.res.ColorStateList v4 = this.n;
            v1_2.b.k = ((float) this.k);
            v1_2.invalidateSelf();
            v1_2.r(v4);
            if (v2_1 != null) {
                float v1_1 = ((float) this.k);
                if (this.q) {
                    v0_0 = j5.t1.u(this.a, 2130968890);
                }
                v2_1.b.k = v1_1;
                v2_1.invalidateSelf();
                v2_1.r(android.content.res.ColorStateList.valueOf(v0_0));
            }
        }
        return;
    }
}
