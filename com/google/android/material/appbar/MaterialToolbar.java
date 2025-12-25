package com.google.android.material.appbar;
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    public static final android.widget.ImageView$ScaleType[] f0;
    public Integer a0;
    public boolean b0;
    public boolean c0;
    public android.widget.ImageView$ScaleType d0;
    public Boolean e0;

    static MaterialToolbar()
    {
        android.widget.ImageView$ScaleType v2 = android.widget.ImageView$ScaleType.FIT_START;
        android.widget.ImageView$ScaleType v4 = android.widget.ImageView$ScaleType.FIT_END;
        android.widget.ImageView$ScaleType v6 = android.widget.ImageView$ScaleType.CENTER_CROP;
        com.google.android.material.appbar.MaterialToolbar.f0 = new android.widget.ImageView$ScaleType[] {android.widget.ImageView$ScaleType.MATRIX, android.widget.ImageView$ScaleType.CENTER_INSIDE});
        return;
    }

    public MaterialToolbar(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 2130970000, 2132018459), p9, 0);
        android.content.Context v1 = super.getContext();
        int[] v6 = new int[0];
        float v8_1 = q3.k.f(v1, p9, c3.a.w, 2130970000, 2132018459, v6);
        if (v8_1.hasValue(2)) {
            super.setNavigationIconTint(v8_1.getColor(2, -1));
        }
        super.b0 = v8_1.getBoolean(4, 0);
        super.c0 = v8_1.getBoolean(3, 0);
        v3.k v9_8 = v8_1.getInt(1, -1);
        if (v9_8 >= null) {
            android.widget.ImageView$ScaleType[] v2_2 = com.google.android.material.appbar.MaterialToolbar.f0;
            if (v9_8 < v2_2.length) {
                super.d0 = v2_2[v9_8];
            }
        }
        if (v8_1.hasValue(0)) {
            super.e0 = Boolean.valueOf(v8_1.getBoolean(0, 0));
        }
        float v8_4;
        v8_1.recycle();
        float v8_3 = super.getBackground();
        if (v8_3 != 0) {
            v8_4 = f2.b0.d(v8_3);
        } else {
            v8_4 = android.content.res.ColorStateList.valueOf(0);
        }
        if (v8_4 != 0) {
            v3.k v9_14 = new v3.k();
            v9_14.o(v8_4);
            v9_14.l(v1);
            v9_14.n(super.getElevation());
            super.setBackground(v9_14);
        }
        return;
    }

    public android.widget.ImageView$ScaleType getLogoScaleType()
    {
        return this.d0;
    }

    public Integer getNavigationIconTint()
    {
        return this.a0;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        v3.k v0_0 = this.getBackground();
        if ((v0_0 instanceof v3.k)) {
            q4.b.O(this, ((v3.k) v0_0));
        }
        return;
    }

    public final void onLayout(boolean p8, int p9, int p10, int p11, int p12)
    {
        this = super.onLayout(p8, p9, p10, p11, p12);
        android.widget.ImageView$ScaleType v9_4 = q3.k.c;
        int v11_1 = 0;
        android.widget.ImageView v12_1 = 0;
        if ((this.b0) || (this.c0)) {
            boolean v10_4;
            boolean v10_2 = q3.k.e(this, this.getTitle());
            if (!v10_2.isEmpty()) {
                v10_4 = ((android.widget.TextView) java.util.Collections.min(v10_2, v9_4));
            } else {
                v10_4 = 0;
            }
            android.widget.ImageView$ScaleType v9_6;
            int v0_4 = q3.k.e(this, this.getSubtitle());
            if (!v0_4.isEmpty()) {
                v9_6 = ((android.widget.TextView) java.util.Collections.max(v0_4, v9_4));
            } else {
                v9_6 = 0;
            }
            if ((v10_4) || (v9_6 != null)) {
                int v0_5 = this.getMeasuredWidth();
                android.util.Pair v1_2 = (v0_5 / 2);
                int v2_0 = this.getPaddingLeft();
                int v0_6 = (v0_5 - this.getPaddingRight());
                int v3_1 = 0;
                while (v3_1 < this.getChildCount()) {
                    android.view.View v4_1 = this.getChildAt(v3_1);
                    if ((v4_1.getVisibility() != 8) && ((v4_1 != v10_4) && (v4_1 != v9_6))) {
                        if ((v4_1.getRight() < v1_2) && (v4_1.getRight() > v2_0)) {
                            v2_0 = v4_1.getRight();
                        }
                        if ((v4_1.getLeft() > v1_2) && (v4_1.getLeft() < v0_6)) {
                            v0_6 = v4_1.getLeft();
                        }
                    }
                    v3_1++;
                }
                android.util.Pair v1_4 = new android.util.Pair(Integer.valueOf(v2_0), Integer.valueOf(v0_6));
                if ((this.b0) && (v10_4)) {
                    this.u(v10_4, v1_4);
                }
                if ((this.c0) && (v9_6 != null)) {
                    this.u(v9_6, v1_4);
                }
            }
        }
        android.widget.ImageView$ScaleType v9_7 = this.getLogo();
        if (v9_7 != null) {
            while (v11_1 < this.getChildCount()) {
                boolean v10_9 = this.getChildAt(v11_1);
                if ((v10_9 instanceof android.widget.ImageView)) {
                    boolean v10_10 = ((android.widget.ImageView) v10_9);
                    int v0_10 = v10_10.getDrawable();
                    if ((v0_10 != 0) && ((v0_10.getConstantState() != null) && (v0_10.getConstantState().equals(v9_7.getConstantState())))) {
                        v12_1 = v10_10;
                        break;
                    }
                }
                v11_1++;
            }
        }
        if (v12_1 != null) {
            android.widget.ImageView$ScaleType v9_1 = this.e0;
            if (v9_1 != null) {
                v12_1.setAdjustViewBounds(v9_1.booleanValue());
            }
            android.widget.ImageView$ScaleType v9_3 = this.d0;
            if (v9_3 != null) {
                v12_1.setScaleType(v9_3);
            }
        }
        return;
    }

    public void setElevation(float p3)
    {
        super.setElevation(p3);
        v3.k v0_0 = this.getBackground();
        if ((v0_0 instanceof v3.k)) {
            ((v3.k) v0_0).n(p3);
        }
        return;
    }

    public void setLogoAdjustViewBounds(boolean p2)
    {
        boolean v0_0 = this.e0;
        if ((v0_0) && (v0_0.booleanValue() == p2)) {
            return;
        } else {
            this.e0 = Boolean.valueOf(p2);
            this.requestLayout();
            return;
        }
    }

    public void setLogoScaleType(android.widget.ImageView$ScaleType p2)
    {
        if (this.d0 != p2) {
            this.d0 = p2;
            this.requestLayout();
        }
        return;
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable p2)
    {
        if ((p2 != null) && (this.a0 != null)) {
            p2 = p2.mutate();
            p2.setTint(this.a0.intValue());
        }
        super.setNavigationIcon(p2);
        return;
    }

    public void setNavigationIconTint(int p1)
    {
        this.a0 = Integer.valueOf(p1);
        android.graphics.drawable.Drawable v1_2 = this.getNavigationIcon();
        if (v1_2 != null) {
            this.setNavigationIcon(v1_2);
        }
        return;
    }

    public void setSubtitleCentered(boolean p2)
    {
        if (this.c0 != p2) {
            this.c0 = p2;
            this.requestLayout();
        }
        return;
    }

    public void setTitleCentered(boolean p2)
    {
        if (this.b0 != p2) {
            this.b0 = p2;
            this.requestLayout();
        }
        return;
    }

    public final void u(android.widget.TextView p5, android.util.Pair p6)
    {
        int v0_0 = this.getMeasuredWidth();
        int v1_1 = p5.getMeasuredWidth();
        int v0_1 = ((v0_0 / 2) - (v1_1 / 2));
        int v1_0 = (v1_1 + v0_1);
        int v6_6 = Math.max(Math.max((((Integer) p6.first).intValue() - v0_1), 0), Math.max((v1_0 - ((Integer) p6.second).intValue()), 0));
        if (v6_6 > 0) {
            v0_1 += v6_6;
            v1_0 -= v6_6;
            p5.measure(android.view.View$MeasureSpec.makeMeasureSpec((v1_0 - v0_1), 1073741824), p5.getMeasuredHeightAndState());
        }
        p5.layout(v0_1, p5.getTop(), v1_0, p5.getBottom());
        return;
    }
}
