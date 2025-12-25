package androidx.appcompat.widget;
public class ActionBarContextView extends android.view.ViewGroup {
    public final n.a a;
    public final android.content.Context b;
    public androidx.appcompat.widget.ActionMenuView c;
    public n.k d;
    public int e;
    public q0.t0 f;
    public boolean m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public android.view.View q;
    public android.view.View r;
    public android.view.View s;
    public android.widget.LinearLayout t;
    public android.widget.TextView u;
    public android.widget.TextView v;
    public final int w;
    public final int x;
    public boolean y;
    public final int z;

    public ActionBarContextView(android.content.Context p6, android.util.AttributeSet p7)
    {
        super(p6, p7, 2130968607);
        super.a = new n.a(super);
        int[] v1_5 = new android.util.TypedValue();
        if ((!p6.getTheme().resolveAttribute(2130968581, v1_5, 1)) || (v1_5.resourceId == 0)) {
            super.b = p6;
        } else {
            super.b = new android.view.ContextThemeWrapper(p6, v1_5.resourceId);
        }
        int v6_1;
        android.content.res.TypedArray v7_1 = p6.obtainStyledAttributes(p7, g.a.d, 2130968607, 0);
        if (!v7_1.hasValue(0)) {
            v6_1 = v7_1.getDrawable(0);
        } else {
            int v0_2 = v7_1.getResourceId(0, 0);
            if (v0_2 == 0) {
            } else {
                v6_1 = j5.t1.A(p6, v0_2);
            }
        }
        super.setBackground(v6_1);
        super.w = v7_1.getResourceId(5, 0);
        super.x = v7_1.getResourceId(4, 0);
        super.e = v7_1.getLayoutDimension(3, 0);
        super.z = v7_1.getResourceId(2, 2131558405);
        v7_1.recycle();
        return;
    }

    public static synthetic void a(androidx.appcompat.widget.ActionBarContextView p1)
    {
        super.setVisibility(0);
        return;
    }

    public static synthetic void b(androidx.appcompat.widget.ActionBarContextView p0, int p1)
    {
        super.setVisibility(p1);
        return;
    }

    public static int f(android.view.View p1, int p2, int p3)
    {
        p1.measure(android.view.View$MeasureSpec.makeMeasureSpec(p2, -2147483648), p3);
        return Math.max(0, (p2 - p1.getMeasuredWidth()));
    }

    public static int g(android.view.View p2, int p3, int p4, int p5, boolean p6)
    {
        int v0 = p2.getMeasuredWidth();
        int v1_1 = p2.getMeasuredHeight();
        int v5_3 = (((p5 - v1_1) / 2) + p4);
        if (!p6) {
            p2.layout(p3, v5_3, (p3 + v0), (v1_1 + v5_3));
        } else {
            p2.layout((p3 - v0), v5_3, p3, (v1_1 + v5_3));
        }
        if (!p6) {
            return v0;
        } else {
            return (- v0);
        }
    }

    public final void c(l.a p6)
    {
        m.u v0_0 = this.q;
        if (v0_0 != null) {
            if (v0_0.getParent() == null) {
                this.addView(this.q);
            }
        } else {
            m.u v0_2 = android.view.LayoutInflater.from(this.getContext()).inflate(this.z, this, 0);
            this.q = v0_2;
            this.addView(v0_2);
        }
        m.u v0_4 = this.q.findViewById(2131361862);
        this.r = v0_4;
        v0_4.setOnClickListener(new com.google.android.material.datepicker.m(p6, 3));
        androidx.appcompat.widget.ActionMenuView v6_1 = p6.d();
        m.u v0_5 = this.d;
        if (v0_5 != null) {
            v0_5.c();
            m.u v0_6 = v0_5.z;
            if ((v0_6 != null) && (v0_6.b())) {
                v0_6.i.dismiss();
            }
        }
        m.u v0_10 = new n.k(this.getContext());
        this.d = v0_10;
        v0_10.r = 1;
        v0_10.s = 1;
        m.u v0_12 = new android.view.ViewGroup$LayoutParams(-2, -1);
        v6_1.b(this.d, this.b);
        androidx.appcompat.widget.ActionMenuView v6_2 = this.d;
        androidx.appcompat.widget.ActionMenuView v2_9 = v6_2.n;
        if (v2_9 == null) {
            androidx.appcompat.widget.ActionMenuView v1_2 = ((m.a0) v6_2.d.inflate(v6_2.f, this, 0));
            v6_2.n = v1_2;
            v1_2.b(v6_2.c);
            v6_2.d();
        }
        androidx.appcompat.widget.ActionMenuView v1_3 = v6_2.n;
        if (v2_9 != v1_3) {
            ((androidx.appcompat.widget.ActionMenuView) v1_3).setPresenter(v6_2);
        }
        androidx.appcompat.widget.ActionMenuView v1_4 = ((androidx.appcompat.widget.ActionMenuView) v1_3);
        this.c = v1_4;
        v1_4.setBackground(0);
        this.addView(this.c, v0_12);
        return;
    }

    public final void d()
    {
        if (this.t == null) {
            android.view.LayoutInflater.from(this.getContext()).inflate(2131558400, this);
            android.widget.LinearLayout v0_3 = ((android.widget.LinearLayout) this.getChildAt((this.getChildCount() - 1)));
            this.t = v0_3;
            this.u = ((android.widget.TextView) v0_3.findViewById(2131361852));
            this.v = ((android.widget.TextView) this.t.findViewById(2131361851));
            android.widget.LinearLayout v0_9 = this.w;
            if (v0_9 != null) {
                this.u.setTextAppearance(this.getContext(), v0_9);
            }
            android.widget.LinearLayout v0_11 = this.x;
            if (v0_11 != null) {
                this.v.setTextAppearance(this.getContext(), v0_11);
            }
        }
        int v5;
        this.u.setText(this.o);
        this.v.setText(this.p);
        android.widget.LinearLayout v0_15 = android.text.TextUtils.isEmpty(this.o);
        android.widget.TextView v1_7 = android.text.TextUtils.isEmpty(this.p);
        int v3 = 8;
        if (v1_7 != null) {
            v5 = 8;
        } else {
            v5 = 0;
        }
        this.v.setVisibility(v5);
        if ((v0_15 == null) || (v1_7 == null)) {
            v3 = 0;
        }
        this.t.setVisibility(v3);
        if (this.t.getParent() == null) {
            this.addView(this.t);
        }
        return;
    }

    public final void e()
    {
        this.removeAllViews();
        this.s = 0;
        this.c = 0;
        this.d = 0;
        android.view.View v1 = this.r;
        if (v1 != null) {
            v1.setOnClickListener(0);
        }
        return;
    }

    public final android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup$MarginLayoutParams(-1, -2);
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
    {
        return new android.view.ViewGroup$MarginLayoutParams(this.getContext(), p3);
    }

    public int getAnimatedVisibility()
    {
        if (this.f == null) {
            return this.getVisibility();
        } else {
            return this.a.b;
        }
    }

    public int getContentHeight()
    {
        return this.e;
    }

    public CharSequence getSubtitle()
    {
        return this.p;
    }

    public CharSequence getTitle()
    {
        return this.o;
    }

    public final void h(int p2)
    {
        if (p2 != this.getVisibility()) {
            q0.t0 v0_1 = this.f;
            if (v0_1 != null) {
                v0_1.b();
            }
            super.setVisibility(p2);
        }
        return;
    }

    public final q0.t0 i(int p4, long p5)
    {
        n.a v0_0 = this.f;
        if (v0_0 != null) {
            v0_0.b();
        }
        n.a v0_1 = this.a;
        if (p4 != 0) {
            int v2_2 = q0.q0.b(this);
            v2_2.a(0);
            v2_2.c(p5);
            v0_1.c.f = v2_2;
            v0_1.b = p4;
            v2_2.d(v0_1);
            return v2_2;
        } else {
            if (this.getVisibility() != 0) {
                this.setAlpha(0);
            }
            q0.t0 v1_0 = q0.q0.b(this);
            v1_0.a(1065353216);
            v1_0.c(p5);
            v0_1.c.f = v1_0;
            v0_1.b = p4;
            v1_0.d(v0_1);
            return v1_0;
        }
    }

    public final void onConfigurationChanged(android.content.res.Configuration p5)
    {
        super.onConfigurationChanged(p5);
        m.m v5_4 = this.getContext().obtainStyledAttributes(0, g.a.a, 2130968584, 0);
        this.setContentHeight(v5_4.getLayoutDimension(13, 0));
        v5_4.recycle();
        m.m v5_1 = this.d;
        if (v5_1 != null) {
            int v0_10;
            int v0_3 = v5_1.b.getResources().getConfiguration();
            int v1_0 = v0_3.screenWidthDp;
            int v2_0 = v0_3.screenHeightDp;
            if (((v0_3.smallestScreenWidthDp <= 600) && ((v1_0 <= 600) && ((v1_0 <= 960) || (v2_0 <= 720)))) && ((v1_0 <= 720) || (v2_0 <= 960))) {
                if (((v1_0 < 500) && ((v1_0 <= 640) || (v2_0 <= 480))) && ((v1_0 <= 480) || (v2_0 <= 640))) {
                    if (v1_0 < 360) {
                        v0_10 = 2;
                    } else {
                        v0_10 = 3;
                    }
                } else {
                    v0_10 = 4;
                }
            } else {
                v0_10 = 5;
            }
            v5_1.v = v0_10;
            m.m v5_3 = v5_1.c;
            if (v5_3 != null) {
                v5_3.p(1);
            }
        }
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        m.u v0_0 = this.d;
        if (v0_0 != null) {
            v0_0.c();
            m.u v0_3 = this.d.z;
            if ((v0_3 != null) && (v0_3.b())) {
                v0_3.i.dismiss();
            }
        }
        return;
    }

    public final boolean onHoverEvent(android.view.MotionEvent p6)
    {
        int v0 = p6.getActionMasked();
        if (v0 == 9) {
            this.n = 0;
        }
        if (!this.n) {
            int v6_1 = super.onHoverEvent(p6);
            if ((v0 == 9) && (v6_1 == 0)) {
                this.n = 1;
            }
        }
        if ((v0 != 10) && (v0 != 3)) {
            return 1;
        } else {
            this.n = 0;
            return 1;
        }
    }

    public final void onLayout(boolean p6, int p7, int p8, int p9, int p10)
    {
        int v6_1;
        if (this.getLayoutDirection() != 1) {
            v6_1 = 0;
        } else {
            v6_1 = 1;
        }
        int v1_1;
        if (v6_1 == 0) {
            v1_1 = this.getPaddingLeft();
        } else {
            v1_1 = ((p9 - p7) - this.getPaddingRight());
        }
        int v2_1 = this.getPaddingTop();
        int v10_3 = (((p10 - p8) - this.getPaddingTop()) - this.getPaddingBottom());
        androidx.appcompat.widget.ActionMenuView v8_3 = this.q;
        if ((v8_3 != null) && (v8_3.getVisibility() != 8)) {
            int v4_0;
            androidx.appcompat.widget.ActionMenuView v8_7 = ((android.view.ViewGroup$MarginLayoutParams) this.q.getLayoutParams());
            if (v6_1 == 0) {
                v4_0 = v8_7.leftMargin;
            } else {
                v4_0 = v8_7.rightMargin;
            }
            androidx.appcompat.widget.ActionMenuView v8_8;
            if (v6_1 == 0) {
                v8_8 = v8_7.rightMargin;
            } else {
                v8_8 = v8_7.leftMargin;
            }
            int v1_2;
            if (v6_1 == 0) {
                v1_2 = (v1_1 + v4_0);
            } else {
                v1_2 = (v1_1 - v4_0);
            }
            int v4_4;
            int v4_3 = (androidx.appcompat.widget.ActionBarContextView.g(this.q, v1_2, v2_1, v10_3, v6_1) + v1_2);
            if (v6_1 == 0) {
                v4_4 = (v4_3 + v8_8);
            } else {
                v4_4 = (v4_3 - v8_8);
            }
            v1_1 = v4_4;
        }
        androidx.appcompat.widget.ActionMenuView v8_9 = this.t;
        if ((v8_9 != null) && ((this.s == null) && (v8_9.getVisibility() != 8))) {
            v1_1 += androidx.appcompat.widget.ActionBarContextView.g(this.t, v1_1, v2_1, v10_3, v6_1);
        }
        androidx.appcompat.widget.ActionMenuView v8_13 = this.s;
        if (v8_13 != null) {
            androidx.appcompat.widget.ActionBarContextView.g(v8_13, v1_1, v2_1, v10_3, v6_1);
        }
        int v7_2;
        if (v6_1 == 0) {
            v7_2 = ((p9 - p7) - this.getPaddingRight());
        } else {
            v7_2 = this.getPaddingLeft();
        }
        androidx.appcompat.widget.ActionMenuView v8_14 = this.c;
        if (v8_14 != null) {
            androidx.appcompat.widget.ActionBarContextView.g(v8_14, v7_2, v2_1, v10_3, (v6_1 ^ 1));
        }
        return;
    }

    public final void onMeasure(int p11, int p12)
    {
        int v1_0 = 1073741824;
        if (android.view.View$MeasureSpec.getMode(p11) != 1073741824) {
            throw new IllegalStateException(this.getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else {
            if (android.view.View$MeasureSpec.getMode(p12) == 0) {
                throw new IllegalStateException(this.getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            } else {
                IllegalStateException v11_4 = android.view.View$MeasureSpec.getSize(p11);
                int v0_4 = this.e;
                if (v0_4 <= 0) {
                    v0_4 = android.view.View$MeasureSpec.getSize(p12);
                }
                int v2_1 = (this.getPaddingBottom() + this.getPaddingTop());
                int v12_1 = ((v11_4 - this.getPaddingLeft()) - this.getPaddingRight());
                int v3_0 = (v0_4 - v2_1);
                android.widget.LinearLayout v5_1 = android.view.View$MeasureSpec.makeMeasureSpec(v3_0, -2147483648);
                int v6_0 = this.q;
                if (v6_0 != 0) {
                    int v6_3 = ((android.view.ViewGroup$MarginLayoutParams) this.q.getLayoutParams());
                    v12_1 = (androidx.appcompat.widget.ActionBarContextView.f(v6_0, v12_1, v5_1) - (v6_3.leftMargin + v6_3.rightMargin));
                }
                int v6_5 = this.c;
                if ((v6_5 != 0) && (v6_5.getParent() == this)) {
                    v12_1 = androidx.appcompat.widget.ActionBarContextView.f(this.c, v12_1, v5_1);
                }
                int v6_8 = this.t;
                int v7_0 = 0;
                if ((v6_8 != 0) && (this.s == null)) {
                    if (!this.y) {
                        v12_1 = androidx.appcompat.widget.ActionBarContextView.f(v6_8, v12_1, v5_1);
                    } else {
                        int v6_10;
                        this.t.measure(android.view.View$MeasureSpec.makeMeasureSpec(0, 0), v5_1);
                        android.widget.LinearLayout v5_3 = this.t.getMeasuredWidth();
                        if (v5_3 > v12_1) {
                            v6_10 = 0;
                        } else {
                            v6_10 = 1;
                        }
                        if (v6_10 != 0) {
                            v12_1 -= v5_3;
                        }
                        int v6_11;
                        if (v6_10 == 0) {
                            v6_11 = 8;
                        } else {
                            v6_11 = 0;
                        }
                        this.t.setVisibility(v6_11);
                    }
                }
                android.widget.LinearLayout v5_5 = this.s;
                if (v5_5 != null) {
                    int v9;
                    android.widget.LinearLayout v5_6 = v5_5.getLayoutParams();
                    int v6_12 = v5_6.width;
                    if (v6_12 == -2) {
                        v9 = -2147483648;
                    } else {
                        v9 = 1073741824;
                    }
                    if (v6_12 >= 0) {
                        v12_1 = Math.min(v6_12, v12_1);
                    }
                    android.widget.LinearLayout v5_0 = v5_6.height;
                    if (v5_0 == -2) {
                        v1_0 = -2147483648;
                    }
                    if (v5_0 >= null) {
                        v3_0 = Math.min(v5_0, v3_0);
                    }
                    this.s.measure(android.view.View$MeasureSpec.makeMeasureSpec(v12_1, v9), android.view.View$MeasureSpec.makeMeasureSpec(v3_0, v1_0));
                }
                if (this.e > 0) {
                    this.setMeasuredDimension(v11_4, v0_4);
                    return;
                } else {
                    int v12_5 = this.getChildCount();
                    int v0_1 = 0;
                    while (v7_0 < v12_5) {
                        int v1_4 = (this.getChildAt(v7_0).getMeasuredHeight() + v2_1);
                        if (v1_4 > v0_1) {
                            v0_1 = v1_4;
                        }
                        v7_0++;
                    }
                    this.setMeasuredDimension(v11_4, v0_1);
                    return;
                }
            }
        }
    }

    public final boolean onTouchEvent(android.view.MotionEvent p5)
    {
        int v0 = p5.getActionMasked();
        if (v0 == 0) {
            this.m = 0;
        }
        if (!this.m) {
            int v5_2 = super.onTouchEvent(p5);
            if ((v0 == 0) && (v5_2 == 0)) {
                this.m = 1;
            }
        }
        if ((v0 != 1) && (v0 != 3)) {
            return 1;
        } else {
            this.m = 0;
            return 1;
        }
    }

    public void setContentHeight(int p1)
    {
        this.e = p1;
        return;
    }

    public void setCustomView(android.view.View p2)
    {
        int v0_0 = this.s;
        if (v0_0 != 0) {
            this.removeView(v0_0);
        }
        this.s = p2;
        if (p2 != null) {
            int v0_1 = this.t;
            if (v0_1 != 0) {
                this.removeView(v0_1);
                this.t = 0;
            }
        }
        if (p2 != null) {
            this.addView(p2);
        }
        this.requestLayout();
        return;
    }

    public void setSubtitle(CharSequence p1)
    {
        this.p = p1;
        this.d();
        return;
    }

    public void setTitle(CharSequence p1)
    {
        this.o = p1;
        this.d();
        q0.q0.o(this, p1);
        return;
    }

    public void setTitleOptional(boolean p2)
    {
        if (p2 != this.y) {
            this.requestLayout();
        }
        this.y = p2;
        return;
    }

    public bridge synthetic void setVisibility(int p1)
    {
        this.h(p1);
        return;
    }

    public final boolean shouldDelayChildPressedState()
    {
        return 0;
    }
}
