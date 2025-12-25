package y3;
public abstract class g extends android.widget.FrameLayout {
    public static final h3.f r;
    public y3.h a;
    public final v3.p b;
    public int c;
    public final float d;
    public final float e;
    public final int f;
    public final int m;
    public android.content.res.ColorStateList n;
    public android.graphics.PorterDuff$Mode o;
    public android.graphics.Rect p;
    public boolean q;

    static g()
    {
        y3.g.r = new h3.f(1);
        return;
    }

    public g(android.content.Context p5, android.util.AttributeSet p6)
    {
        super(a4.a.a(p5, p6, 0, 0), p6);
        android.content.res.ColorStateList v5_6 = super.getContext();
        android.graphics.drawable.GradientDrawable v1_3 = v5_6.obtainStyledAttributes(p6, c3.a.C);
        if (v1_3.hasValue(6)) {
            super.setElevation(((float) v1_3.getDimensionPixelSize(6, 0)));
        }
        super.c = v1_3.getInt(2, 0);
        if ((v1_3.hasValue(8)) || (v1_3.hasValue(9))) {
            super.b = v3.p.b(v5_6, p6, 0, 0).a();
        }
        super.d = v1_3.getFloat(3, 1065353216);
        super.setBackgroundTintList(j5.t1.v(v5_6, v1_3, 4));
        super.setBackgroundTintMode(q3.k.g(v1_3.getInt(5, -1), android.graphics.PorterDuff$Mode.SRC_IN));
        super.e = v1_3.getFloat(1, 1065353216);
        super.f = v1_3.getDimensionPixelSize(0, -1);
        super.m = v1_3.getDimensionPixelSize(7, -1);
        v1_3.recycle();
        super.setOnTouchListener(y3.g.r);
        super.setFocusable(1);
        if (super.getBackground() == null) {
            android.graphics.drawable.GradientDrawable v0_1;
            android.content.res.ColorStateList v5_10 = j5.t1.L(j5.t1.u(super, 2130968890), j5.t1.u(super, 2130968867), super.getBackgroundOverlayColorAlpha());
            float v6_11 = super.b;
            if (v6_11 == 0) {
                float v6_13 = super.getResources().getDimension(2131166187);
                android.graphics.drawable.GradientDrawable v1_6 = new android.graphics.drawable.GradientDrawable();
                v1_6.setShape(0);
                v1_6.setCornerRadius(v6_13);
                v1_6.setColor(v5_10);
                v0_1 = v1_6;
            } else {
                v0_1 = new v3.k(v6_11);
                v0_1.o(android.content.res.ColorStateList.valueOf(v5_10));
            }
            android.content.res.ColorStateList v5_12 = super.n;
            if (v5_12 != null) {
                v0_1.setTintList(v5_12);
            }
            super.setBackground(v0_1);
        }
        return;
    }

    public static synthetic void a(y3.g p0, y3.h p1)
    {
        p0.setBaseTransientBottomBar(p1);
        return;
    }

    private void setBaseTransientBottomBar(y3.h p1)
    {
        this.a = p1;
        return;
    }

    public float getActionTextColorAlpha()
    {
        return this.e;
    }

    public int getAnimationMode()
    {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha()
    {
        return this.d;
    }

    public int getMaxInlineActionWidth()
    {
        return this.m;
    }

    public int getMaxWidth()
    {
        return this.f;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        y3.h v0 = this.a;
        if (v0 != null) {
            v0.b();
        }
        this.requestApplyInsets();
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Throwable v0_0 = this.a;
        if (v0_0 != null) {
            int v1_6 = j6.s.h();
            y3.d v2_2 = v0_0.t;
            int v5 = 1;
            if (!v1_6.l(v2_2)) {
                int v1_4;
                int v1_1 = ((y3.l) v1_6.e);
                if ((v1_1 == 0) || (v1_1.a.get() != v2_2)) {
                    v1_4 = 0;
                } else {
                    v1_4 = 1;
                }
                if (v1_4 == 0) {
                    v5 = 0;
                } else {
                }
            }
            if (v5 != 0) {
                y3.h.x.post(new y3.d(v0_0, 1));
                return;
            }
        }
        return;
    }

    public final void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        y3.h v2_1 = super.onLayout(p1, p2, p3, p4, p5).a;
        if ((v2_1 != null) && (v2_1.r)) {
            v2_1.e();
            v2_1.r = 0;
        }
        return;
    }

    public void onMeasure(int p2, int p3)
    {
        super.onMeasure(p2, p3);
        int v2_1 = this.f;
        if ((v2_1 > 0) && (this.getMeasuredWidth() > v2_1)) {
            super.onMeasure(android.view.View$MeasureSpec.makeMeasureSpec(v2_1, 1073741824), p3);
        }
        return;
    }

    public void setAnimationMode(int p1)
    {
        this.c = p1;
        return;
    }

    public void setBackground(android.graphics.drawable.Drawable p1)
    {
        this.setBackgroundDrawable(p1);
        return;
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p2)
    {
        if ((p2 != null) && (this.n != null)) {
            p2 = p2.mutate();
            p2.setTintList(this.n);
            p2.setTintMode(this.o);
        }
        super.setBackgroundDrawable(p2);
        return;
    }

    public void setBackgroundTintList(android.content.res.ColorStateList p2)
    {
        this.n = p2;
        if (this.getBackground() != null) {
            android.graphics.drawable.Drawable v0_2 = this.getBackground().mutate();
            v0_2.setTintList(p2);
            v0_2.setTintMode(this.o);
            if (v0_2 != this.getBackground()) {
                super.setBackgroundDrawable(v0_2);
            }
        }
        return;
    }

    public void setBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        this.o = p2;
        if (this.getBackground() != null) {
            android.graphics.drawable.Drawable v0_2 = this.getBackground().mutate();
            v0_2.setTintMode(p2);
            if (v0_2 != this.getBackground()) {
                super.setBackgroundDrawable(v0_2);
            }
        }
        return;
    }

    public void setLayoutParams(android.view.ViewGroup$LayoutParams p5)
    {
        super.setLayoutParams(p5);
        if ((!this.q) && ((p5 instanceof android.view.ViewGroup$MarginLayoutParams))) {
            this.p = new android.graphics.Rect(((android.view.ViewGroup$MarginLayoutParams) p5).leftMargin, ((android.view.ViewGroup$MarginLayoutParams) p5).topMargin, ((android.view.ViewGroup$MarginLayoutParams) p5).rightMargin, ((android.view.ViewGroup$MarginLayoutParams) p5).bottomMargin);
            y3.h v5_2 = this.a;
            if (v5_2 != null) {
                v5_2.f();
            }
        }
        return;
    }

    public void setOnClickListener(android.view.View$OnClickListener p2)
    {
        h3.f v0;
        if (p2 == null) {
            v0 = y3.g.r;
        } else {
            v0 = 0;
        }
        this.setOnTouchListener(v0);
        super.setOnClickListener(p2);
        return;
    }
}
