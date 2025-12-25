package z3;
public final class w extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout a;
    public final n.b1 b;
    public CharSequence c;
    public final com.google.android.material.internal.CheckableImageButton d;
    public android.content.res.ColorStateList e;
    public android.graphics.PorterDuff$Mode f;
    public int m;
    public android.widget.ImageView$ScaleType n;
    public android.view.View$OnLongClickListener o;
    public boolean p;

    public w(com.google.android.material.textfield.TextInputLayout p11, b8.g p12)
    {
        super(p11.getContext());
        super.a = p11;
        super.setVisibility(8);
        super.setOrientation(0);
        super.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-2, -1, 8388611));
        com.google.android.material.internal.CheckableImageButton v1_4 = ((com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(super.getContext()).inflate(2131558449, super, 0));
        super.d = v1_4;
        CharSequence v6 = 0;
        n.b1 v2_2 = new n.b1(super.getContext(), 0);
        super.b = v2_2;
        if (j5.t1.J(super.getContext())) {
            ((android.view.ViewGroup$MarginLayoutParams) v1_4.getLayoutParams()).setMarginEnd(0);
        }
        android.content.res.TypedArray v5_5 = super.o;
        v1_4.setOnClickListener(0);
        y0.d.i(v1_4, v5_5);
        super.o = 0;
        v1_4.setOnLongClickListener(0);
        y0.d.i(v1_4, 0);
        android.content.res.TypedArray v5_7 = ((android.content.res.TypedArray) p12.c);
        if (v5_7.hasValue(70)) {
            super.e = j5.t1.w(super.getContext(), p12, 70);
        }
        if (v5_7.hasValue(71)) {
            super.f = q3.k.g(v5_7.getInt(71, -1), 0);
        }
        if (v5_7.hasValue(67)) {
            super.b(p12.i(67));
            if (v5_7.hasValue(66)) {
                int v7_9 = v5_7.getText(66);
                if (v1_4.getContentDescription() != v7_9) {
                    v1_4.setContentDescription(v7_9);
                }
            }
            v1_4.setCheckable(v5_7.getBoolean(65, 1));
        }
        int v7_14 = v5_7.getDimensionPixelSize(68, super.getResources().getDimensionPixelSize(2131166140));
        if (v7_14 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else {
            if (v7_14 != super.m) {
                super.m = v7_14;
                v1_4.setMinimumWidth(v7_14);
                v1_4.setMinimumHeight(v7_14);
            }
            if (v5_7.hasValue(69)) {
                android.widget.ImageView$ScaleType v4_2 = y0.d.d(v5_7.getInt(69, -1));
                super.n = v4_2;
                v1_4.setScaleType(v4_2);
            }
            v2_2.setVisibility(8);
            v2_2.setId(2131362507);
            v2_2.setLayoutParams(new android.widget.LinearLayout$LayoutParams(-2, -2));
            v2_2.setAccessibilityLiveRegion(1);
            v2_2.setTextAppearance(v5_7.getResourceId(61, 0));
            if (v5_7.hasValue(62)) {
                v2_2.setTextColor(p12.h(62));
            }
            CharSequence v11_9 = v5_7.getText(60);
            if (!android.text.TextUtils.isEmpty(v11_9)) {
                v6 = v11_9;
            }
            super.c = v6;
            v2_2.setText(v11_9);
            super.e();
            super.addView(v1_4);
            super.addView(v2_2);
            return;
        }
    }

    public final int a()
    {
        int v0_2;
        int v0_0 = this.d;
        if (v0_0.getVisibility() != 0) {
            v0_2 = 0;
        } else {
            v0_2 = (((android.view.ViewGroup$MarginLayoutParams) v0_0.getLayoutParams()).getMarginEnd() + v0_0.getMeasuredWidth());
        }
        return ((this.b.getPaddingStart() + this.getPaddingStart()) + v0_2);
    }

    public final void b(android.graphics.drawable.Drawable p4)
    {
        com.google.android.material.internal.CheckableImageButton v0 = this.d;
        v0.setImageDrawable(p4);
        if (p4 == null) {
            this.c(0);
            CharSequence v4_6 = this.o;
            v0.setOnClickListener(0);
            y0.d.i(v0, v4_6);
            this.o = 0;
            v0.setOnLongClickListener(0);
            y0.d.i(v0, 0);
            if (v0.getContentDescription() != null) {
                v0.setContentDescription(0);
            }
            return;
        } else {
            com.google.android.material.textfield.TextInputLayout v2 = this.a;
            y0.d.a(v2, v0, this.e, this.f);
            this.c(1);
            y0.d.h(v2, v0, this.e);
            return;
        }
    }

    public final void c(boolean p4)
    {
        int v1_1;
        com.google.android.material.internal.CheckableImageButton v0 = this.d;
        int v2 = 0;
        if (v0.getVisibility() != 0) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        if (v1_1 != p4) {
            if (!p4) {
                v2 = 8;
            }
            v0.setVisibility(v2);
            this.d();
            this.e();
        }
        return;
    }

    public final void d()
    {
        int v0_1 = this.a.e;
        if (v0_1 != 0) {
            int v1_2;
            if (this.d.getVisibility() != 0) {
                v1_2 = v0_1.getPaddingStart();
            } else {
                v1_2 = 0;
            }
            this.b.setPaddingRelative(v1_2, v0_1.getCompoundPaddingTop(), this.getContext().getResources().getDimensionPixelSize(2131166009), v0_1.getCompoundPaddingBottom());
            return;
        } else {
            return;
        }
    }

    public final void e()
    {
        com.google.android.material.textfield.TextInputLayout v0_3;
        n.b1 v1_0 = 8;
        if ((this.c == null) || (this.p)) {
            v0_3 = 8;
        } else {
            v0_3 = 0;
        }
        if ((this.d.getVisibility() == 0) || (v0_3 == null)) {
            v1_0 = 0;
        }
        this.setVisibility(v1_0);
        this.b.setVisibility(v0_3);
        this.a.s();
        return;
    }

    public final void onMeasure(int p1, int p2)
    {
        super.onMeasure(p1, p2);
        this.d();
        return;
    }
}
