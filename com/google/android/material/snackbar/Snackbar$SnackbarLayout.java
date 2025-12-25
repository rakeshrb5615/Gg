package com.google.android.material.snackbar;
public final class Snackbar$SnackbarLayout extends y3.g {

    public Snackbar$SnackbarLayout(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        return;
    }

    public final void onMeasure(int p6, int p7)
    {
        super.onMeasure(p6, p7);
        int v6_1 = this.getChildCount();
        int v7_1 = ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight());
        int v0_0 = 0;
        while (v0_0 < v6_1) {
            android.view.View v1 = this.getChildAt(v0_0);
            if (v1.getLayoutParams().width == -1) {
                v1.measure(android.view.View$MeasureSpec.makeMeasureSpec(v7_1, 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(v1.getMeasuredHeight(), 1073741824));
            }
            v0_0++;
        }
        return;
    }

    public bridge synthetic void setBackground(android.graphics.drawable.Drawable p1)
    {
        super.setBackground(p1);
        return;
    }

    public bridge synthetic void setBackgroundDrawable(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        return;
    }

    public bridge synthetic void setBackgroundTintList(android.content.res.ColorStateList p1)
    {
        super.setBackgroundTintList(p1);
        return;
    }

    public bridge synthetic void setBackgroundTintMode(android.graphics.PorterDuff$Mode p1)
    {
        super.setBackgroundTintMode(p1);
        return;
    }

    public bridge synthetic void setLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        super.setLayoutParams(p1);
        return;
    }

    public bridge synthetic void setOnClickListener(android.view.View$OnClickListener p1)
    {
        super.setOnClickListener(p1);
        return;
    }
}
