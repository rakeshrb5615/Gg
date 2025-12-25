package z3;
public final class u extends n.o {
    public final n.g2 e;
    public final android.view.accessibility.AccessibilityManager f;
    public final android.graphics.Rect m;
    public final int n;
    public final float o;
    public android.content.res.ColorStateList p;
    public int q;
    public android.content.res.ColorStateList r;

    public u(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 2130968648, 0), p9);
        super.m = new android.graphics.Rect();
        boolean v0_4 = super.getContext();
        int[] v5 = new int[0];
        android.content.res.TypedArray v8_1 = q3.k.f(v0_4, p9, c3.a.i, 2130968648, 2132018028, v5);
        if ((v8_1.hasValue(0)) && (v8_1.getInt(0, 0) == 0)) {
            super.setKeyListener(0);
        }
        super.n = v8_1.getResourceId(3, 2131558495);
        super.o = ((float) v8_1.getDimensionPixelOffset(1, 2131166109));
        if (v8_1.hasValue(2)) {
            super.p = android.content.res.ColorStateList.valueOf(v8_1.getColor(2, 0));
        }
        super.q = v8_1.getColor(4, 0);
        super.r = j5.t1.v(v0_4, v8_1, 5);
        super.f = ((android.view.accessibility.AccessibilityManager) v0_4.getSystemService("accessibility"));
        n.g2 v3_12 = new n.g2(v0_4, 0, 2130969414, 0);
        super.e = v3_12;
        v3_12.E = 1;
        v3_12.F.setFocusable(1);
        v3_12.u = super;
        v3_12.F.setInputMethodMode(2);
        v3_12.p(super.getAdapter());
        v3_12.v = new n.m0(super, 1);
        if (v8_1.hasValue(6)) {
            super.setSimpleItems(v8_1.getResourceId(6, 0));
        }
        v8_1.recycle();
        return;
    }

    public static synthetic CharSequence a(z3.u p0, Object p1)
    {
        return p0.convertSelectionToString(p1);
    }

    public final com.google.android.material.textfield.TextInputLayout b()
    {
        android.view.ViewParent v0_0 = this.getParent();
        while (v0_0 != null) {
            if (!(v0_0 instanceof com.google.android.material.textfield.TextInputLayout)) {
                v0_0 = v0_0.getParent();
            } else {
                return ((com.google.android.material.textfield.TextInputLayout) v0_0);
            }
        }
        return 0;
    }

    public final boolean c()
    {
        java.util.Iterator v0_0 = this.f;
        if ((v0_0 == null) || (!v0_0.isTouchExplorationEnabled())) {
            if ((v0_0 != null) && (v0_0.isEnabled())) {
                java.util.Iterator v0_1 = v0_0.getEnabledAccessibilityServiceList(16);
                if (v0_1 != null) {
                    java.util.Iterator v0_2 = v0_1.iterator();
                    while (v0_2.hasNext()) {
                        boolean v1_2 = ((android.accessibilityservice.AccessibilityServiceInfo) v0_2.next());
                        if ((v1_2.getSettingsActivityName() != null) && (v1_2.getSettingsActivityName().contains("SwitchAccess"))) {
                            return 1;
                        }
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final void dismissDropDown()
    {
        if (!this.c()) {
            super.dismissDropDown();
            return;
        } else {
            this.e.dismiss();
            return;
        }
    }

    public android.content.res.ColorStateList getDropDownBackgroundTintList()
    {
        return this.p;
    }

    public CharSequence getHint()
    {
        CharSequence v0_0 = this.b();
        if ((v0_0 == null) || (!v0_0.L)) {
            return super.getHint();
        } else {
            return v0_0.getHint();
        }
    }

    public float getPopupElevation()
    {
        return this.o;
    }

    public int getSimpleItemSelectedColor()
    {
        return this.q;
    }

    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor()
    {
        return this.r;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        boolean v0_2 = this.b();
        if ((v0_2) && ((v0_2.L) && (super.getHint() == null))) {
            boolean v0_0;
            boolean v0_5 = android.os.Build.MANUFACTURER;
            if (!v0_5) {
                v0_0 = "";
            } else {
                v0_0 = v0_5.toLowerCase(java.util.Locale.ENGLISH);
            }
            if (v0_0.equals("meizu")) {
                this.setHint("");
            }
        }
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        this.e.dismiss();
        return;
    }

    public final void onMeasure(int p14, int p15)
    {
        super.onMeasure(p14, p15);
        if (android.view.View$MeasureSpec.getMode(p14) == -2147483648) {
            int v15_2 = this.getMeasuredWidth();
            int v0_7 = this.getAdapter();
            com.google.android.material.textfield.TextInputLayout v1 = this.b();
            int v2_0 = 0;
            if ((v0_7 != 0) && (v1 != null)) {
                int v6_3;
                int v3_1 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
                int v4_1 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
                n.g2 v5 = this.e;
                if (v5.F.isShowing()) {
                    v6_3 = v5.c.getSelectedItemPosition();
                } else {
                    v6_3 = -1;
                }
                int v6_6 = Math.min(v0_7.getCount(), (Math.max(0, v6_3) + 15));
                int v9 = Math.max(0, (v6_6 - 15));
                android.view.View v10 = 0;
                int v7_3 = 0;
                while (v9 < v6_6) {
                    int v11_0 = v0_7.getItemViewType(v9);
                    if (v11_0 != v2_0) {
                        v10 = 0;
                        v2_0 = v11_0;
                    }
                    v10 = v0_7.getView(v9, v10, v1);
                    if (v10.getLayoutParams() == null) {
                        v10.setLayoutParams(new android.view.ViewGroup$LayoutParams(-2, -2));
                    }
                    v10.measure(v3_1, v4_1);
                    v7_3 = Math.max(v7_3, v10.getMeasuredWidth());
                    v9++;
                }
                int v0_2 = v5.F.getBackground();
                if (v0_2 != 0) {
                    int v2_1 = this.m;
                    v0_2.getPadding(v2_1);
                    v7_3 += (v2_1.left + v2_1.right);
                }
                v2_0 = (v1.getEndIconView().getMeasuredWidth() + v7_3);
            }
            this.setMeasuredDimension(Math.min(Math.max(v15_2, v2_0), android.view.View$MeasureSpec.getSize(p14)), this.getMeasuredHeight());
        }
        return;
    }

    public final void onWindowFocusChanged(boolean p2)
    {
        if (!this.c()) {
            super.onWindowFocusChanged(p2);
            return;
        } else {
            return;
        }
    }

    public void setAdapter(android.widget.ListAdapter p2)
    {
        super.setAdapter(p2);
        this.e.p(this.getAdapter());
        return;
    }

    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable p2)
    {
        super.setDropDownBackgroundDrawable(p2);
        n.g2 v0 = this.e;
        if (v0 != null) {
            v0.h(p2);
        }
        return;
    }

    public void setDropDownBackgroundTint(int p1)
    {
        this.setDropDownBackgroundTintList(android.content.res.ColorStateList.valueOf(p1));
        return;
    }

    public void setDropDownBackgroundTintList(android.content.res.ColorStateList p2)
    {
        this.p = p2;
        v3.k v2_1 = this.getDropDownBackground();
        if ((v2_1 instanceof v3.k)) {
            ((v3.k) v2_1).o(this.p);
        }
        return;
    }

    public void setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener p2)
    {
        super.setOnItemSelectedListener(p2);
        this.e.w = this.getOnItemSelectedListener();
        return;
    }

    public void setRawInputType(int p1)
    {
        super.setRawInputType(p1);
        com.google.android.material.textfield.TextInputLayout v1_1 = this.b();
        if (v1_1 != null) {
            v1_1.u();
        }
        return;
    }

    public void setSimpleItemSelectedColor(int p1)
    {
        this.q = p1;
        if ((this.getAdapter() instanceof z3.t)) {
            ((z3.t) this.getAdapter()).a();
        }
        return;
    }

    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList p1)
    {
        this.r = p1;
        if ((this.getAdapter() instanceof z3.t)) {
            ((z3.t) this.getAdapter()).a();
        }
        return;
    }

    public void setSimpleItems(int p2)
    {
        this.setSimpleItems(this.getResources().getStringArray(p2));
        return;
    }

    public void setSimpleItems(String[] p4)
    {
        this.setAdapter(new z3.t(this, this.getContext(), this.n, p4));
        return;
    }

    public final void showDropDown()
    {
        if (!this.c()) {
            super.showDropDown();
            return;
        } else {
            this.e.c();
            return;
        }
    }
}
