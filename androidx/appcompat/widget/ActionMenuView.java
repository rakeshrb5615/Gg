package androidx.appcompat.widget;
public class ActionMenuView extends n.y1 implements m.l, m.a0 {
    public n.y2 A;
    public boolean B;
    public int C;
    public final int D;
    public final int E;
    public n.n F;
    public m.m v;
    public android.content.Context w;
    public int x;
    public boolean y;
    public n.k z;

    public ActionMenuView(android.content.Context p3, android.util.AttributeSet p4)
    {
        super(p3, p4, 0);
        super.setBaselineAligned(0);
        int v4_5 = p3.getResources().getDisplayMetrics().density;
        super.D = ((int) (1113587712 * v4_5));
        super.E = ((int) (v4_5 * 1082130432));
        super.w = p3;
        super.x = 0;
        return;
    }

    public static n.m j()
    {
        n.m v0_1 = new n.m(-2, -2);
        v0_1.a = 0;
        v0_1.gravity = 16;
        return v0_1;
    }

    public static n.m k(android.view.ViewGroup$LayoutParams p1)
    {
        if (p1 == 0) {
            return androidx.appcompat.widget.ActionMenuView.j();
        } else {
            n.m v0_0;
            if (!(p1 instanceof n.m)) {
                v0_0 = new n.m(p1);
            } else {
                v0_0 = new n.m(((n.m) p1));
                v0_0.a = ((n.m) p1).a;
            }
            if (v0_0.gravity <= 0) {
                v0_0.gravity = 16;
            }
            return v0_0;
        }
    }

    public final void b(m.m p1)
    {
        this.v = p1;
        return;
    }

    public final boolean c(m.o p4)
    {
        return this.v.q(p4, 0, 0);
    }

    public final boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        return (p1 instanceof n.m);
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p1)
    {
        return 0;
    }

    public final bridge synthetic n.x1 f()
    {
        return androidx.appcompat.widget.ActionMenuView.j();
    }

    public final n.x1 g(android.util.AttributeSet p3)
    {
        return new n.m(this.getContext(), p3);
    }

    public final bridge synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        return androidx.appcompat.widget.ActionMenuView.j();
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
    {
        return new n.m(this.getContext(), p3);
    }

    public final bridge synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        return androidx.appcompat.widget.ActionMenuView.k(p1);
    }

    public android.view.Menu getMenu()
    {
        if (this.v == null) {
            m.m v0_8 = this.getContext();
            n.k v1_3 = new m.m(v0_8);
            this.v = v1_3;
            v1_3.e = new j6.o(this, 5);
            n.k v1_1 = new n.k(v0_8);
            this.z = v1_1;
            v1_1.r = 1;
            v1_1.s = 1;
            v1_1.e = new a6.e();
            this.v.b(v1_1, this.w);
            m.m v0_5 = this.z;
            v0_5.n = this;
            this.v = v0_5.c;
        }
        return this.v;
    }

    public android.graphics.drawable.Drawable getOverflowIcon()
    {
        this.getMenu();
        int v0_0 = this.z;
        boolean v1_0 = v0_0.o;
        if (!v1_0) {
            if (!v0_0.q) {
                return 0;
            } else {
                return v0_0.p;
            }
        } else {
            return v1_0.getDrawable();
        }
    }

    public int getPopupTheme()
    {
        return this.x;
    }

    public int getWindowAnimations()
    {
        return 0;
    }

    public final bridge synthetic n.x1 h(android.view.ViewGroup$LayoutParams p1)
    {
        return androidx.appcompat.widget.ActionMenuView.k(p1);
    }

    public final boolean l(int p5)
    {
        boolean v0 = 0;
        if (p5 != 0) {
            n.l v1_2 = this.getChildAt((p5 - 1));
            n.l v2_1 = this.getChildAt(p5);
            if ((p5 < this.getChildCount()) && ((v1_2 instanceof n.l))) {
                v0 = ((n.l) v1_2).b();
            }
            if ((p5 <= 0) || (!(v2_1 instanceof n.l))) {
                return v0;
            } else {
                return (((n.l) v2_1).c() | v0);
            }
        } else {
            return 0;
        }
    }

    public final void onConfigurationChanged(android.content.res.Configuration p1)
    {
        super.onConfigurationChanged(p1);
        n.k v1_1 = this.z;
        if (v1_1 != null) {
            v1_1.d();
            if (this.z.f()) {
                this.z.c();
                this.z.l();
            }
        }
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        m.u v0_0 = this.z;
        if (v0_0 != null) {
            v0_0.c();
            m.u v0_1 = v0_0.z;
            if ((v0_1 != null) && (v0_1.b())) {
                v0_1.i.dismiss();
            }
        }
        return;
    }

    public final void onLayout(boolean p18, int p19, int p20, int p21, int p22)
    {
        if (this.B) {
            n.m v6_4;
            android.view.View v1_2 = this.getChildCount();
            int v2_2 = ((p22 - p20) / 2);
            int v3_6 = this.getDividerWidth();
            int v4_6 = (p21 - p19);
            int v5_5 = ((v4_6 - this.getPaddingRight()) - this.getPaddingLeft());
            if (this.getLayoutDirection() != 1) {
                v6_4 = 0;
            } else {
                v6_4 = 1;
            }
            int v9_0 = 0;
            int v10_1 = 0;
            int v11_0 = 0;
            while (v9_0 < v1_2) {
                int v13_0 = this.getChildAt(v9_0);
                if (v13_0.getVisibility() != 8) {
                    int v12_1 = ((n.m) v13_0.getLayoutParams());
                    if (!v12_1.a) {
                        v5_5 -= ((v13_0.getMeasuredWidth() + v12_1.leftMargin) + v12_1.rightMargin);
                        this.l(v9_0);
                        v11_0++;
                    } else {
                        int v10_0 = v13_0.getMeasuredWidth();
                        if (this.l(v9_0)) {
                            v10_0 += v3_6;
                        }
                        int v12_4;
                        int v15_2;
                        int v14_3 = v13_0.getMeasuredHeight();
                        if (v6_4 == null) {
                            v12_4 = ((this.getWidth() - this.getPaddingRight()) - v12_1.rightMargin);
                            v15_2 = (v12_4 - v10_0);
                        } else {
                            v15_2 = (this.getPaddingLeft() + v12_1.leftMargin);
                            v12_4 = (v15_2 + v10_0);
                        }
                        int v8_4 = (v2_2 - (v14_3 / 2));
                        v13_0.layout(v15_2, v8_4, v12_4, (v14_3 + v8_4));
                        v5_5 -= v10_0;
                        v10_1 = 1;
                    }
                }
                v9_0++;
            }
            if ((v1_2 != 1) || (v10_1 != 0)) {
                int v3_4;
                int v11_1 = (v11_0 - (v10_1 ^ 1));
                if (v11_1 <= 0) {
                    v3_4 = 0;
                } else {
                    v3_4 = (v5_5 / v11_1);
                }
                int v3_5 = Math.max(0, v3_4);
                if (v6_4 == null) {
                    int v5_6 = this.getPaddingLeft();
                    int v8_5 = 0;
                    while (v8_5 < v1_2) {
                        int v4_3 = this.getChildAt(v8_5);
                        n.m v6_6 = ((n.m) v4_3.getLayoutParams());
                        if ((v4_3.getVisibility() != 8) && (!v6_6.a)) {
                            int v5_7 = (v5_6 + v6_6.leftMargin);
                            int v7_6 = v4_3.getMeasuredWidth();
                            int v9_1 = v4_3.getMeasuredHeight();
                            int v10_3 = (v2_2 - (v9_1 / 2));
                            v4_3.layout(v5_7, v10_3, (v5_7 + v7_6), (v9_1 + v10_3));
                            v5_6 = (((v7_6 + v6_6.rightMargin) + v3_5) + v5_7);
                        }
                        v8_5++;
                    }
                } else {
                    int v5_0 = (this.getWidth() - this.getPaddingRight());
                    int v8_0 = 0;
                    while (v8_0 < v1_2) {
                        int v4_5 = this.getChildAt(v8_0);
                        n.m v6_9 = ((n.m) v4_5.getLayoutParams());
                        if ((v4_5.getVisibility() != 8) && (!v6_9.a)) {
                            int v5_9 = (v5_0 - v6_9.rightMargin);
                            int v7_13 = v4_5.getMeasuredWidth();
                            int v9_3 = v4_5.getMeasuredHeight();
                            int v10_5 = (v2_2 - (v9_3 / 2));
                            v4_5.layout((v5_9 - v7_13), v10_5, v5_9, (v9_3 + v10_5));
                            v5_0 = (v5_9 - ((v7_13 + v6_9.leftMargin) + v3_5));
                        }
                        v8_0++;
                    }
                }
                return;
            } else {
                android.view.View v1_1 = this.getChildAt(0);
                int v3_1 = v1_1.getMeasuredWidth();
                int v5_2 = v1_1.getMeasuredHeight();
                int v4_1 = ((v4_6 / 2) - (v3_1 / 2));
                int v2_0 = (v2_2 - (v5_2 / 2));
                v1_1.layout(v4_1, v2_0, (v3_1 + v4_1), (v5_2 + v2_0));
                return;
            }
        } else {
            super.onLayout(p18, p19, p20, p21, p22);
            return;
        }
    }

    public final void onMeasure(int p31, int p32)
    {
        n.m v2_9;
        int v1_0 = this.B;
        if (android.view.View$MeasureSpec.getMode(p31) != 1073741824) {
            v2_9 = 0;
        } else {
            v2_9 = 1;
        }
        this.B = v2_9;
        if (v1_0 != v2_9) {
            this.C = 0;
        }
        int v1_1 = android.view.View$MeasureSpec.getSize(p31);
        if (this.B) {
            n.m v2_1 = this.v;
            if ((v2_1 != null) && (v1_1 != this.C)) {
                this.C = v1_1;
                v2_1.p(1);
            }
        }
        int v1_2 = this.getChildCount();
        if ((!this.B) || (v1_2 <= 0)) {
            int v9_7 = 0;
            while (v9_7 < v1_2) {
                n.m v2_6 = ((n.m) this.getChildAt(v9_7).getLayoutParams());
                v2_6.rightMargin = 0;
                v2_6.leftMargin = 0;
                v9_7++;
            }
            super.onMeasure(p31, p32);
            return;
        } else {
            int v1_3 = android.view.View$MeasureSpec.getMode(p32);
            n.m v2_7 = android.view.View$MeasureSpec.getSize(p31);
            n.m v6_18 = android.view.View$MeasureSpec.getSize(p32);
            int v8_1 = (this.getPaddingRight() + this.getPaddingLeft());
            int v9_25 = (this.getPaddingBottom() + this.getPaddingTop());
            int v7_3 = android.view.ViewGroup.getChildMeasureSpec(p32, v9_25, -2);
            n.m v2_8 = (v2_7 - v8_1);
            int v8_2 = this.D;
            int v10_4 = (v2_8 / v8_2);
            if (v10_4 != 0) {
                int v11_18 = (((v2_8 % v8_2) / v10_4) + v8_2);
                int v8_3 = this.getChildCount();
                int v3_1 = 0;
                int v12_1 = 0;
                int v13 = 0;
                int v14_3 = 0;
                int v15_1 = 0;
                int v16 = 0;
                long v18 = 0;
                while(true) {
                    int v5_21 = this.E;
                    if (v14_3 >= v8_3) {
                        break;
                    }
                    int v23_2;
                    int v4_17 = this.getChildAt(v14_3);
                    int v21_0 = v6_18;
                    boolean v22_4 = v9_25;
                    if (v4_17.getVisibility() != 8) {
                        n.m v6_12 = (v4_17 instanceof androidx.appcompat.view.menu.ActionMenuItemView);
                        v12_1++;
                        if (v6_12 != null) {
                            v4_17.setPadding(v5_21, 0, v5_21, 0);
                        }
                        int v9_14;
                        int v5_17 = ((n.m) v4_17.getLayoutParams());
                        v5_17.f = 0;
                        v5_17.c = 0;
                        v5_17.b = 0;
                        v5_17.d = 0;
                        v5_17.leftMargin = 0;
                        v5_17.rightMargin = 0;
                        if ((v6_12 == null) || (android.text.TextUtils.isEmpty(((androidx.appcompat.view.menu.ActionMenuItemView) v4_17).getText()))) {
                            v9_14 = 0;
                        } else {
                            v9_14 = 1;
                        }
                        int v9_16;
                        v5_17.e = v9_14;
                        if (!v5_17.a) {
                            v9_16 = v10_4;
                        } else {
                            v9_16 = 1;
                        }
                        int v11_10;
                        long v24_1 = v6_12;
                        n.m v6_14 = ((n.m) v4_17.getLayoutParams());
                        int v25_0 = v10_4;
                        v23_2 = v11_18;
                        int v10_3 = android.view.View$MeasureSpec.makeMeasureSpec((android.view.View$MeasureSpec.getSize(v7_3) - v22_4), android.view.View$MeasureSpec.getMode(v7_3));
                        if (v24_1 == 0) {
                            v11_10 = 0;
                        } else {
                            v11_10 = ((androidx.appcompat.view.menu.ActionMenuItemView) v4_17);
                        }
                        if ((v11_10 == 0) || (android.text.TextUtils.isEmpty(v11_10.getText()))) {
                            int v11_14 = 0;
                        } else {
                            v11_14 = 1;
                        }
                        int v11_16;
                        long v24_2 = v11_14;
                        if ((v9_16 <= 0) || ((v11_14 != 0) && (v9_16 < 2))) {
                            v11_16 = 0;
                        } else {
                            v4_17.measure(android.view.View$MeasureSpec.makeMeasureSpec((v23_2 * v9_16), -2147483648), v10_3);
                            int v9_19 = v4_17.getMeasuredWidth();
                            v11_16 = (v9_19 / v23_2);
                            if ((v9_19 % v23_2) != 0) {
                                v11_16++;
                            }
                            if ((v24_2 != 0) && (v11_16 < 2)) {
                                v11_16 = 2;
                            }
                        }
                        if ((v6_14.a) || (v24_2 == 0)) {
                            int v9_23 = 0;
                        } else {
                            v9_23 = 1;
                        }
                        v6_14.d = v9_23;
                        v6_14.b = v11_16;
                        v4_17.measure(android.view.View$MeasureSpec.makeMeasureSpec((v11_16 * v23_2), 1073741824), v10_3);
                        v13 = Math.max(v13, v11_16);
                        if (v5_17.d) {
                            v16++;
                        }
                        if (v5_17.a) {
                            v15_1 = 1;
                        }
                        v10_4 = (v25_0 - v11_16);
                        v3_1 = Math.max(v3_1, v4_17.getMeasuredHeight());
                        if (v11_16 == 1) {
                            v18 |= ((long) (1 << v14_3));
                        }
                    } else {
                        v23_2 = v11_18;
                    }
                    v14_3++;
                    v6_18 = v21_0;
                    v9_25 = v22_4;
                    v11_18 = v23_2;
                }
                int v4_0;
                int v21_1 = v6_18;
                int v23_3 = v11_18;
                if ((v15_1 == 0) || (v12_1 != 2)) {
                    v4_0 = 0;
                } else {
                    v4_0 = 1;
                }
                int v10_0 = v10_4;
                n.m v6_0 = 0;
                while ((v16 > 0) && (v10_0 > 0)) {
                    int v9_6 = 2147483647;
                    long v26 = 0;
                    int v11_8 = 0;
                    int v14_2 = 0;
                    while (v14_2 < v8_3) {
                        int v3_20 = ((n.m) this.getChildAt(v14_2).getLayoutParams());
                        if (v3_20.d) {
                            int v3_21 = v3_20.b;
                            if (v3_21 >= v9_6) {
                                if (v3_21 == v9_6) {
                                    v26 |= (1 << v14_2);
                                    v11_8++;
                                }
                            } else {
                                v26 = (1 << v14_2);
                                v9_6 = v3_21;
                                v11_8 = 1;
                            }
                        }
                        v14_2++;
                    }
                    n.m v28_0 = v3_1;
                    boolean v22_0 = v4_0;
                    v18 |= v26;
                    if (v11_8 <= v10_0) {
                        int v9_0 = (v9_6 + 1);
                        int v3_0 = 0;
                        while (v3_0 < v8_3) {
                            int v4_1 = this.getChildAt(v3_0);
                            n.m v6_2 = ((n.m) v4_1.getLayoutParams());
                            int v29_0 = v15_1;
                            int v14_0 = ((long) (1 << v3_0));
                            if ((v26 & v14_0) != 0) {
                                if ((!v22_0) || (!v6_2.e)) {
                                    int v11_3 = 1;
                                } else {
                                    v11_3 = 1;
                                    if (v10_0 == 1) {
                                        v4_1.setPadding((v5_21 + v23_3), 0, v5_21, 0);
                                    }
                                }
                                v6_2.b = (v6_2.b + v11_3);
                                v6_2.f = v11_3;
                                v10_0--;
                            } else {
                                if (v6_2.b == v9_0) {
                                    v18 |= v14_0;
                                }
                            }
                            v3_0++;
                            v15_1 = v29_0;
                        }
                        v4_0 = v22_0;
                        v3_1 = v28_0;
                        v6_0 = 1;
                    }
                    if ((v15_1 != 0) || (v12_1 != 1)) {
                        int v3_2 = 0;
                    } else {
                        v3_2 = 1;
                    }
                    if ((v10_0 > 0) && ((v18 != 0) && ((v10_0 < (v12_1 - 1)) || ((v3_2 != 0) || (v13 > 1))))) {
                        int v4_7 = ((float) Long.bitCount(v18));
                        if (v3_2 == 0) {
                            if (((v18 & 1) != 0) && (!((n.m) this.getChildAt(0).getLayoutParams()).e)) {
                                v4_7 -= 1056964608;
                            }
                            int v3_8 = (v8_3 - 1);
                            if (((v18 & ((long) (1 << v3_8))) != 0) && (!((n.m) this.getChildAt(v3_8).getLayoutParams()).e)) {
                                v4_7 -= 1056964608;
                            }
                        }
                        int v9_3;
                        if (v4_7 <= 0) {
                            v9_3 = 0;
                        } else {
                            v9_3 = ((int) (((float) (v10_0 * v23_3)) / v4_7));
                        }
                        int v4_8 = v6_0;
                        int v3_17 = 0;
                        while (v3_17 < v8_3) {
                            if ((v18 & ((long) (1 << v3_17))) != 0) {
                                int v5_10 = this.getChildAt(v3_17);
                                n.m v6_10 = ((n.m) v5_10.getLayoutParams());
                                if (!(v5_10 instanceof androidx.appcompat.view.menu.ActionMenuItemView)) {
                                    if (!v6_10.a) {
                                        if (v3_17 != 0) {
                                            v6_10.leftMargin = (v9_3 / 2);
                                        }
                                        if (v3_17 != (v8_3 - 1)) {
                                            v6_10.rightMargin = (v9_3 / 2);
                                        }
                                    } else {
                                        v6_10.c = v9_3;
                                        v6_10.f = 1;
                                        v6_10.rightMargin = ((- v9_3) / 2);
                                        v4_8 = 1;
                                    }
                                } else {
                                    v6_10.c = v9_3;
                                    v6_10.f = 1;
                                    if ((v3_17 == 0) && (!v6_10.e)) {
                                        v6_10.leftMargin = ((- v9_3) / 2);
                                    }
                                    v4_8 = 1;
                                }
                            } else {
                                int v20 = 2;
                            }
                            v3_17++;
                        }
                        v6_0 = v4_8;
                    }
                    if (v6_0 != null) {
                        int v4_9 = 0;
                        while (v4_9 < v8_3) {
                            int v3_18 = this.getChildAt(v4_9);
                            int v5_3 = ((n.m) v3_18.getLayoutParams());
                            if (v5_3.f) {
                                v3_18.measure(android.view.View$MeasureSpec.makeMeasureSpec(((v5_3.b * v23_3) + v5_3.c), 1073741824), v7_3);
                            }
                            v4_9++;
                        }
                    }
                    n.m v6_4;
                    if (v1_3 == 1073741824) {
                        v6_4 = v21_1;
                    } else {
                        v6_4 = v28_0;
                    }
                    this.setMeasuredDimension(v2_8, v6_4);
                    return;
                }
                v28_0 = v3_1;
            } else {
                this.setMeasuredDimension(v2_8, 0);
                return;
            }
        }
    }

    public void setExpandedActionViewsExclusive(boolean p2)
    {
        this.z.w = p2;
        return;
    }

    public void setOnMenuItemClickListener(n.n p1)
    {
        this.F = p1;
        return;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable p3)
    {
        this.getMenu();
        n.k v0 = this.z;
        int v1_0 = v0.o;
        if (v1_0 == 0) {
            v0.q = 1;
            v0.p = p3;
            return;
        } else {
            v1_0.setImageDrawable(p3);
            return;
        }
    }

    public void setOverflowReserved(boolean p1)
    {
        this.y = p1;
        return;
    }

    public void setPopupTheme(int p3)
    {
        if (this.x != p3) {
            this.x = p3;
            if (p3 != null) {
                this.w = new android.view.ContextThemeWrapper(this.getContext(), p3);
            } else {
                this.w = this.getContext();
                return;
            }
        }
        return;
    }

    public void setPresenter(n.k p1)
    {
        this.z = p1;
        p1.n = this;
        this.v = p1.c;
        return;
    }
}
