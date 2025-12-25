package com.google.android.material.internal;
public class BaselineLayout extends android.view.ViewGroup {
    public int a;
    public boolean b;

    public BaselineLayout(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 0);
        super.a = -1;
        return;
    }

    public int getBaseline()
    {
        return this.a;
    }

    public final void onLayout(boolean p7, int p8, int p9, int p10, int p11)
    {
        p7 = this.getChildCount();
        p9 = this.getPaddingLeft();
        int v10_3 = (((p10 - p8) - this.getPaddingRight()) - p9);
        int v8_1 = this.getPaddingTop();
        p11 = 0;
        while (p11 < p7) {
            android.view.View v0 = this.getChildAt(p11);
            if (v0.getVisibility() != 8) {
                int v4_2;
                int v1_1 = v0.getMeasuredWidth();
                int v2_1 = v0.getMeasuredHeight();
                int v3_2 = (((v10_3 - v1_1) / 2) + p9);
                if ((this.a == -1) || (v0.getBaseline() == -1)) {
                    v4_2 = v8_1;
                } else {
                    v4_2 = ((this.a + v8_1) - v0.getBaseline());
                }
                v0.layout(v3_2, v4_2, (v1_1 + v3_2), (v2_1 + v4_2));
            }
            p11++;
        }
        return;
    }

    public final void onMeasure(int p13, int p14)
    {
        int v0_0 = this.getChildCount();
        int v1_0 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = -1;
        int v8 = -1;
        while (v1_0 < v0_0) {
            int v9_0 = this.getChildAt(v1_0);
            if (v9_0.getVisibility() != 8) {
                this.measureChild(v9_0, p13, p14);
                v3 = Math.max(v3, v9_0.getMeasuredHeight());
                int v10_2 = v9_0.getBaseline();
                if (v10_2 != -1) {
                    v7 = Math.max(v7, v10_2);
                    v8 = Math.max(v8, (v9_0.getMeasuredHeight() - v10_2));
                }
                v5 = Math.max(v5, v9_0.getMeasuredWidth());
                v4 = Math.max(v4, v9_0.getMeasuredHeight());
                v6 = android.view.View.combineMeasuredStates(v6, v9_0.getMeasuredState());
            }
            v1_0++;
        }
        if (v7 != -1) {
            if (this.b) {
                v4 = Math.max(v4, (Math.max(v8, this.getPaddingBottom()) + v7));
            }
            this.a = v7;
        }
        if (!this.b) {
            v4 = (this.getPaddingBottom() + v3);
        }
        this.setMeasuredDimension(android.view.View.resolveSizeAndState(Math.max(v5, this.getSuggestedMinimumWidth()), p13, v6), android.view.View.resolveSizeAndState(Math.max(v4, this.getSuggestedMinimumHeight()), p14, (v6 << 16)));
        return;
    }

    public void setMeasurePaddingFromBaseline(boolean p1)
    {
        this.b = p1;
        return;
    }
}
