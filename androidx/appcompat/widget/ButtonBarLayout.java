package androidx.appcompat.widget;
public class ButtonBarLayout extends android.widget.LinearLayout {
    public boolean a;
    public boolean b;
    public int c;

    public ButtonBarLayout(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(p8, p9);
        super.c = -1;
        int[] v3 = g.a.k;
        android.content.res.TypedArray v5 = p8.obtainStyledAttributes(p9, v3);
        q0.q0.m(super, p8, v3, p9, v5, 0);
        super.a = v5.getBoolean(0, 1);
        v5.recycle();
        if (super.getOrientation() == 1) {
            super.setStacked(super.a);
        }
        return;
    }

    private void setStacked(boolean p2)
    {
        if ((this.b != p2) && ((p2 == 0) || (this.a))) {
            android.view.View v0_5;
            this.b = p2;
            this.setOrientation(p2);
            if (p2 == 0) {
                v0_5 = 80;
            } else {
                v0_5 = 8388613;
            }
            this.setGravity(v0_5);
            android.view.View v0_2 = this.findViewById(2131362429);
            if (v0_2 != null) {
                int v2_1;
                if (p2 == 0) {
                    v2_1 = 4;
                } else {
                    v2_1 = 8;
                }
                v0_2.setVisibility(v2_1);
            }
            int v2_3 = (this.getChildCount() - 2);
            while (v2_3 >= 0) {
                this.bringChildToFront(this.getChildAt(v2_3));
                v2_3--;
            }
        }
        return;
    }

    public final void onMeasure(int p7, int p8)
    {
        int v0_0 = android.view.View$MeasureSpec.getSize(p7);
        int v2_0 = 0;
        if (this.a) {
            if ((v0_0 > this.c) && (this.b)) {
                this.setStacked(0);
            }
            this.c = v0_0;
        }
        if ((this.b) || (android.view.View$MeasureSpec.getMode(p7) != 1073741824)) {
            int v0_2 = p7;
            int v1_2 = 0;
        } else {
            v0_2 = android.view.View$MeasureSpec.makeMeasureSpec(v0_0, -2147483648);
            v1_2 = 1;
        }
        super.onMeasure(v0_2, p8);
        if ((this.a) && ((!this.b) && ((this.getMeasuredWidthAndState() & -16777216) == 16777216))) {
            this.setStacked(1);
            v1_2 = 1;
        }
        if (v1_2 != 0) {
            super.onMeasure(p7, p8);
        }
        int v0_7 = this.getChildCount();
        int v1_5 = 0;
        while(true) {
            int v4_3 = -1;
            if (v1_5 >= v0_7) {
                break;
            }
            if (this.getChildAt(v1_5).getVisibility() != 0) {
                v1_5++;
            }
            if (v1_5 >= 0) {
                int v0_8 = this.getChildAt(v1_5);
                int v2_2 = ((android.widget.LinearLayout$LayoutParams) v0_8.getLayoutParams());
                int v0_12 = (((v0_8.getMeasuredHeight() + this.getPaddingTop()) + v2_2.topMargin) + v2_2.bottomMargin);
                if (!this.b) {
                    v2_0 = (this.getPaddingBottom() + v0_12);
                } else {
                    int v1_9 = (v1_5 + 1);
                    int v2_5 = this.getChildCount();
                    while (v1_9 < v2_5) {
                        if (this.getChildAt(v1_9).getVisibility() != 0) {
                            v1_9++;
                        } else {
                            v4_3 = v1_9;
                            break;
                        }
                    }
                    if (v4_3 < 0) {
                        v2_0 = v0_12;
                    } else {
                        v2_0 = ((this.getChildAt(v4_3).getPaddingTop() + ((int) (this.getResources().getDisplayMetrics().density * 1098907648))) + v0_12);
                    }
                }
            }
            if (this.getMinimumHeight() != v2_0) {
                this.setMinimumHeight(v2_0);
                if (p8 == 0) {
                    super.onMeasure(p7, p8);
                }
            }
            return;
        }
        v1_5 = -1;
    }

    public void setAllowStacking(boolean p2)
    {
        if (this.a != p2) {
            this.a = p2;
            if ((p2 == 0) && (this.b)) {
                this.setStacked(0);
            }
            this.requestLayout();
        }
        return;
    }
}
