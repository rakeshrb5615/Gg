package androidx.appcompat.widget;
public class AlertDialogLayout extends n.y1 {

    public AlertDialogLayout(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 0);
        return;
    }

    public static int j(android.view.View p3)
    {
        int v0_0 = p3.getMinimumHeight();
        if (v0_0 <= 0) {
            if ((!(p3 instanceof android.view.ViewGroup)) || (((android.view.ViewGroup) p3).getChildCount() != 1)) {
                return 0;
            } else {
                return androidx.appcompat.widget.AlertDialogLayout.j(((android.view.ViewGroup) p3).getChildAt(0));
            }
        } else {
            return v0_0;
        }
    }

    public final void onLayout(boolean p10, int p11, int p12, int p13, int p14)
    {
        int v12_1;
        p10 = this.getPaddingLeft();
        int v13_1 = (p13 - p11);
        int v11_2 = (v13_1 - this.getPaddingRight());
        int v13_3 = ((v13_1 - p10) - this.getPaddingRight());
        int v0_0 = this.getMeasuredHeight();
        int v1 = this.getChildCount();
        int v2_0 = this.getGravity();
        int v3_0 = (v2_0 & 112);
        int v2_1 = (v2_0 & 8388615);
        if (v3_0 == 16) {
            v12_1 = ((((p14 - p12) - v0_0) / 2) + this.getPaddingTop());
        } else {
            if (v3_0 == 80) {
                v12_1 = (((this.getPaddingTop() + p14) - p12) - v0_0);
            } else {
                v12_1 = this.getPaddingTop();
            }
        }
        int v14_5;
        int v14_4 = this.getDividerDrawable();
        int v0_1 = 0;
        if (v14_4 != 0) {
            v14_5 = v14_4.getIntrinsicHeight();
        } else {
            v14_5 = 0;
        }
        while (v0_1 < v1) {
            int v3_5 = this.getChildAt(v0_1);
            if ((v3_5 != 0) && (v3_5.getVisibility() != 8)) {
                int v4_4 = v3_5.getMeasuredWidth();
                int v5_1 = v3_5.getMeasuredHeight();
                n.x1 v6_1 = ((n.x1) v3_5.getLayoutParams());
                int v7_0 = v6_1.gravity;
                if (v7_0 < 0) {
                    v7_0 = v2_1;
                }
                int v8_3;
                int v7_7;
                int v7_6;
                int v7_2 = (android.view.Gravity.getAbsoluteGravity(v7_0, this.getLayoutDirection()) & 7);
                if (v7_2 == 1) {
                    v7_6 = ((((v13_3 - v4_4) / 2) + p10) + v6_1.leftMargin);
                    v8_3 = v6_1.rightMargin;
                    v7_7 = (v7_6 - v8_3);
                } else {
                    if (v7_2 == 5) {
                        v7_6 = (v11_2 - v4_4);
                        v8_3 = v6_1.rightMargin;
                    } else {
                        v7_7 = (v6_1.leftMargin + p10);
                    }
                }
                if (this.i(v0_1)) {
                    v12_1 += v14_5;
                }
                int v12_2 = (v12_1 + v6_1.topMargin);
                v3_5.layout(v7_7, v12_2, (v4_4 + v7_7), (v12_2 + v5_1));
                v12_1 = ((v5_1 + v6_1.bottomMargin) + v12_2);
            }
            v0_1++;
        }
        return;
    }

    public final void onMeasure(int p17, int p18)
    {
        void v0 = this;
        int v6 = this.getChildCount();
        int v2_2 = 0;
        int v4_3 = 0;
        int v5_3 = 0;
        int v7_7 = 0;
        while (v7_7 < v6) {
            n.x1 v9_4 = this.getChildAt(v7_7);
            if (v9_4.getVisibility() != 8) {
                int v8_0 = v9_4.getId();
                if (v8_0 != 2131362539) {
                    if (v8_0 != 2131361934) {
                        if (((v8_0 == 2131361987) || (v8_0 == 2131362000)) && (v5_3 == 0)) {
                            v5_3 = v9_4;
                        } else {
                            super.onMeasure(p17, p18);
                            return;
                        }
                    } else {
                        v4_3 = v9_4;
                    }
                } else {
                    v2_2 = v9_4;
                }
            }
            v7_7++;
        }
        int v2_3;
        int v7_4 = android.view.View$MeasureSpec.getMode(p18);
        n.x1 v9_2 = android.view.View$MeasureSpec.getSize(p18);
        int v10_3 = android.view.View$MeasureSpec.getMode(p17);
        int v12_1 = (this.getPaddingBottom() + this.getPaddingTop());
        if (v2_2 == 0) {
            v2_3 = 0;
        } else {
            v2_2.measure(p17, 0);
            v12_1 += v2_2.getMeasuredHeight();
            v2_3 = android.view.View.combineMeasuredStates(0, v2_2.getMeasuredState());
        }
        int v13_0;
        int v11_2;
        if (v4_3 == 0) {
            v11_2 = 0;
            v13_0 = 0;
        } else {
            v4_3.measure(p17, 0);
            v11_2 = androidx.appcompat.widget.AlertDialogLayout.j(v4_3);
            v13_0 = (v4_3.getMeasuredHeight() - v11_2);
            v12_1 += v11_2;
            v2_3 = android.view.View.combineMeasuredStates(v2_3, v4_3.getMeasuredState());
        }
        int v14_1;
        if (v5_3 == 0) {
            v14_1 = 0;
        } else {
            int v14_4;
            if (v7_4 != 0) {
                v14_4 = android.view.View$MeasureSpec.makeMeasureSpec(Math.max(0, (v9_2 - v12_1)), v7_4);
            } else {
                v14_4 = 0;
            }
            v5_3.measure(p17, v14_4);
            v14_1 = v5_3.getMeasuredHeight();
            v12_1 += v14_1;
            v2_3 = android.view.View.combineMeasuredStates(v2_3, v5_3.getMeasuredState());
        }
        n.x1 v9_5 = (v9_2 - v12_1);
        if (v4_3 != 0) {
            int v12_2 = (v12_1 - v11_2);
            int v13_2 = Math.min(v9_5, v13_0);
            if (v13_2 > 0) {
                v9_5 -= v13_2;
                v11_2 += v13_2;
            }
            v4_3.measure(p17, android.view.View$MeasureSpec.makeMeasureSpec(v11_2, 1073741824));
            v12_1 = (v12_2 + v4_3.getMeasuredHeight());
            v2_3 = android.view.View.combineMeasuredStates(v2_3, v4_3.getMeasuredState());
        }
        if ((v5_3 != 0) && (v9_5 > null)) {
            int v12_3 = (v12_1 - v14_1);
            v5_3.measure(p17, android.view.View$MeasureSpec.makeMeasureSpec((v14_1 + v9_5), v7_4));
            v12_1 = (v12_3 + v5_3.getMeasuredHeight());
            v2_3 = android.view.View.combineMeasuredStates(v2_3, v5_3.getMeasuredState());
        }
        int v4_2 = 0;
        int v5_2 = 0;
        while (v4_2 < v6) {
            int v7_5 = this.getChildAt(v4_2);
            if (v7_5.getVisibility() != 8) {
                v5_2 = Math.max(v5_2, v7_5.getMeasuredWidth());
            }
            v4_2++;
        }
        int v4_1 = p18;
        this.setMeasuredDimension(android.view.View.resolveSizeAndState(((this.getPaddingRight() + this.getPaddingLeft()) + v5_2), p17, v2_3), android.view.View.resolveSizeAndState(v12_1, p18, 0));
        if (v10_3 != 1073741824) {
            int v2_1 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
            int v7_3 = 0;
            while (v7_3 < v6) {
                android.view.View v1_3 = v0.getChildAt(v7_3);
                if (v1_3.getVisibility() != 8) {
                    n.x1 v9_1 = ((n.x1) v1_3.getLayoutParams());
                    if (v9_1.width == -1) {
                        int v10_0 = v9_1.height;
                        v9_1.height = v1_3.getMeasuredHeight();
                        v0.measureChildWithMargins(v1_3, v2_1, 0, v4_1, 0);
                        v9_1.height = v10_0;
                    }
                }
                v7_3++;
                v0 = this;
                v4_1 = p18;
            }
        }
        return;
    }
}
