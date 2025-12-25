package com.google.android.material.divider;
public class MaterialDivider extends android.view.View {
    public final v3.k a;
    public int b;
    public int c;
    public int d;
    public int e;

    public MaterialDivider(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 2130969467, 2132018416), p9, 2130969467);
        android.content.Context v1 = super.getContext();
        super.a = new v3.k();
        int[] v6 = new int[0];
        android.content.res.TypedArray v9_1 = q3.k.f(v1, p9, c3.a.p, 2130969467, 2132018416, v6);
        super.b = v9_1.getDimensionPixelSize(3, super.getResources().getDimensionPixelSize(2131165995));
        super.d = v9_1.getDimensionPixelOffset(2, 0);
        super.e = v9_1.getDimensionPixelOffset(1, 0);
        super.setDividerColor(j5.t1.v(v1, v9_1, 0).getDefaultColor());
        v9_1.recycle();
        return;
    }

    public int getDividerColor()
    {
        return this.c;
    }

    public int getDividerInsetEnd()
    {
        return this.e;
    }

    public int getDividerInsetStart()
    {
        return this.d;
    }

    public int getDividerThickness()
    {
        return this.b;
    }

    public final void onDraw(android.graphics.Canvas p6)
    {
        super.onDraw(p6);
        int v2_2 = 1;
        if (this.getLayoutDirection() != 1) {
            v2_2 = 0;
        }
        int v0_1;
        if (v2_2 == 0) {
            v0_1 = this.d;
        } else {
            v0_1 = this.e;
        }
        int v2_0;
        int v3_0;
        if (v2_2 == 0) {
            v2_0 = this.getWidth();
            v3_0 = this.e;
        } else {
            v2_0 = this.getWidth();
            v3_0 = this.d;
        }
        v3.k v4_1 = this.a;
        v4_1.setBounds(v0_1, 0, (v2_0 - v3_0), (this.getBottom() - this.getTop()));
        v4_1.draw(p6);
        return;
    }

    public final void onMeasure(int p2, int p3)
    {
        super.onMeasure(p2, p3);
        int v2_2 = android.view.View$MeasureSpec.getMode(p3);
        int v3_1 = this.getMeasuredHeight();
        if ((v2_2 != -2147483648) && (v2_2 != 0)) {
            return;
        } else {
            int v2_3 = this.b;
            if ((v2_3 > 0) && (v3_1 != v2_3)) {
                v3_1 = v2_3;
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), v3_1);
            return;
        }
    }

    public void setDividerColor(int p2)
    {
        if (this.c != p2) {
            this.c = p2;
            this.a.o(android.content.res.ColorStateList.valueOf(p2));
            this.invalidate();
        }
        return;
    }

    public void setDividerColorResource(int p2)
    {
        this.setDividerColor(e0.c.getColor(this.getContext(), p2));
        return;
    }

    public void setDividerInsetEnd(int p1)
    {
        this.e = p1;
        return;
    }

    public void setDividerInsetEndResource(int p2)
    {
        this.setDividerInsetEnd(this.getContext().getResources().getDimensionPixelOffset(p2));
        return;
    }

    public void setDividerInsetStart(int p1)
    {
        this.d = p1;
        return;
    }

    public void setDividerInsetStartResource(int p2)
    {
        this.setDividerInsetStart(this.getContext().getResources().getDimensionPixelOffset(p2));
        return;
    }

    public void setDividerThickness(int p2)
    {
        if (this.b != p2) {
            this.b = p2;
            this.requestLayout();
        }
        return;
    }

    public void setDividerThicknessResource(int p2)
    {
        this.setDividerThickness(this.getContext().getResources().getDimensionPixelSize(p2));
        return;
    }
}
