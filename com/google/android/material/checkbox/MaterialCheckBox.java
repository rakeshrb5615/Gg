package com.google.android.material.checkbox;
public class MaterialCheckBox extends n.r {
    public static final int[] E;
    public static final int[] F;
    public static final int[][] G;
    public static final int H;
    public CharSequence A;
    public android.widget.CompoundButton$OnCheckedChangeListener B;
    public final g2.f C;
    public final k3.a D;
    public final java.util.LinkedHashSet e;
    public final java.util.LinkedHashSet f;
    public android.content.res.ColorStateList m;
    public boolean n;
    public boolean o;
    public boolean p;
    public CharSequence q;
    public android.graphics.drawable.Drawable r;
    public android.graphics.drawable.Drawable s;
    public boolean t;
    public android.content.res.ColorStateList u;
    public android.content.res.ColorStateList v;
    public android.graphics.PorterDuff$Mode w;
    public int x;
    public int[] y;
    public boolean z;

    static MaterialCheckBox()
    {
        com.google.android.material.checkbox.MaterialCheckBox.E = new int[] {2130969796});
        com.google.android.material.checkbox.MaterialCheckBox.F = new int[] {2130969795});
        com.google.android.material.checkbox.MaterialCheckBox.G = new int[][] {new int[] {16842910, 2130969795}), new int[] {16842910, 16842912}), new int[] {16842910, -16842912}), new int[] {-16842910, 16842912}), new int[] {-16842910, -16842912})});
        com.google.android.material.checkbox.MaterialCheckBox.H = android.content.res.Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
        return;
    }

    public MaterialCheckBox(android.content.Context p9, android.util.AttributeSet p10)
    {
        super(a4.a.a(p9, p10, 2130968770, 2132018383), p10, 2130968770);
        super.e = new java.util.LinkedHashSet();
        super.f = new java.util.LinkedHashSet();
        android.graphics.drawable.Drawable v9_10 = super.getContext();
        android.content.res.TypedArray v0_2 = new g2.f(v9_10, 0);
        android.graphics.drawable.Drawable v9_12 = v9_10.getResources().getDrawable(2131231309, v9_10.getTheme());
        v0_2.a = v9_12;
        v9_12.setCallback(v0_2.f);
        new g2.e(v0_2.a.getConstantState());
        super.C = v0_2;
        super.D = new k3.a(super);
        boolean v1_5 = super.getContext();
        super.r = super.getButtonDrawable();
        super.u = super.getSuperButtonTintList();
        super.setSupportButtonTintList(0);
        int[] v6 = new int[0];
        q3.k.a(v1_5, p10, 2130968770, 2132018383);
        int v3_0 = c3.a.o;
        q3.k.b(v1_5, p10, v3_0, 2130968770, 2132018383, v6);
        android.content.res.TypedArray v0_3 = v1_5.obtainStyledAttributes(p10, v3_0, 2130968770, 2132018383);
        b8.g v10_2 = new b8.g(v1_5, v0_3);
        super.s = v10_2.i(2);
        if ((super.r != null) && (c4.b.U(v1_5, 2130969277, 0))) {
            int v2_7 = v0_3.getResourceId(0, 0);
            int v4_1 = v0_3.getResourceId(1, 0);
            if ((v2_7 == com.google.android.material.checkbox.MaterialCheckBox.H) && (v4_1 == 0)) {
                super.setButtonDrawable(0);
                super.r = j5.t1.A(v1_5, 2131231308);
                super.t = 1;
                if (super.s == null) {
                    super.s = j5.t1.A(v1_5, 2131231310);
                }
            }
        }
        super.v = j5.t1.w(v1_5, v10_2, 3);
        super.w = q3.k.g(v0_3.getInt(4, -1), android.graphics.PorterDuff$Mode.SRC_IN);
        super.n = v0_3.getBoolean(10, 0);
        super.o = v0_3.getBoolean(6, 1);
        super.p = v0_3.getBoolean(9, 0);
        super.q = v0_3.getText(8);
        if (v0_3.hasValue(7)) {
            super.setCheckedState(v0_3.getInt(7, 0));
        }
        v10_2.r();
        super.a();
        return;
    }

    private String getButtonStateDescription()
    {
        String v0_0 = this.x;
        if (v0_0 != 1) {
            if (v0_0 != null) {
                return this.getResources().getString(2131952127);
            } else {
                return this.getResources().getString(2131952128);
            }
        } else {
            return this.getResources().getString(2131952126);
        }
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList()
    {
        if (this.m == null) {
            android.content.res.ColorStateList v0_5 = j5.t1.u(this, 2130968847);
            android.content.res.ColorStateList v1_4 = j5.t1.u(this, 2130968850);
            int[][] v2_0 = j5.t1.u(this, 2130968890);
            int v3_1 = j5.t1.u(this, 2130968867);
            this.m = new android.content.res.ColorStateList(com.google.android.material.checkbox.MaterialCheckBox.G, new int[] {j5.t1.L(v2_0, v1_4, 1065353216), j5.t1.L(v2_0, v0_5, 1065353216), j5.t1.L(v2_0, v3_1, 1057635697), j5.t1.L(v2_0, v3_1, 1052938076), j5.t1.L(v2_0, v3_1, 1052938076)}));
        }
        return this.m;
    }

    private android.content.res.ColorStateList getSuperButtonTintList()
    {
        android.content.res.ColorStateList v0_0 = this.u;
        if (v0_0 == null) {
            if (super.getButtonTintList() == null) {
                return this.getSupportButtonTintList();
            } else {
                return super.getButtonTintList();
            }
        } else {
            return v0_0;
        }
    }

    public final void a()
    {
        this.r = f2.b0.b(this.r, this.u, this.getButtonTintMode());
        this.s = f2.b0.b(this.s, this.v, this.w);
        if (this.t) {
            android.graphics.drawable.Drawable v0_4 = this.C;
            if (v0_4 != null) {
                android.animation.AnimatorSet v1_1 = v0_4.b;
                f2.o v2_0 = v0_4.a;
                int v3_0 = this.D;
                if (v2_0 != null) {
                    f2.o v2_1 = ((android.graphics.drawable.AnimatedVectorDrawable) v2_0);
                    if (v3_0.a == null) {
                        v3_0.a = new g2.b(v3_0);
                    }
                    v2_1.unregisterAnimationCallback(v3_0.a);
                }
                f2.o v2_2 = v0_4.e;
                if ((v2_2 != null) && (v3_0 != 0)) {
                    v2_2.remove(v3_0);
                    if (v0_4.e.size() == 0) {
                        f2.o v2_6 = v0_4.d;
                        if (v2_6 != null) {
                            v1_1.b.removeListener(v2_6);
                            v0_4.d = 0;
                        }
                    }
                }
                f2.o v2_8 = v0_4.a;
                if (v2_8 == null) {
                    if (v3_0 != 0) {
                        if (v0_4.e == null) {
                            v0_4.e = new java.util.ArrayList();
                        }
                        if (!v0_4.e.contains(v3_0)) {
                            v0_4.e.add(v3_0);
                            if (v0_4.d == null) {
                                v0_4.d = new f2.o(v0_4, 3);
                            }
                            v1_1.b.addListener(v0_4.d);
                        }
                    }
                } else {
                    f2.o v2_19 = ((android.graphics.drawable.AnimatedVectorDrawable) v2_8);
                    if (v3_0.a == null) {
                        v3_0.a = new g2.b(v3_0);
                    }
                    v2_19.registerAnimationCallback(v3_0.a);
                }
            }
            android.animation.AnimatorSet v1_7 = this.r;
            if (((v1_7 instanceof android.graphics.drawable.AnimatedStateListDrawable)) && (v0_4 != null)) {
                ((android.graphics.drawable.AnimatedStateListDrawable) v1_7).addTransition(2131361963, 2131362583, v0_4, 0);
                ((android.graphics.drawable.AnimatedStateListDrawable) this.r).addTransition(2131362121, 2131362583, v0_4, 0);
            }
        }
        android.graphics.drawable.Drawable v0_7 = this.r;
        if (v0_7 != null) {
            android.animation.AnimatorSet v1_12 = this.u;
            if (v1_12 != null) {
                v0_7.setTintList(v1_12);
            }
        }
        android.graphics.drawable.Drawable v0_8 = this.s;
        if (v0_8 != null) {
            android.animation.AnimatorSet v1_13 = this.v;
            if (v1_13 != null) {
                v0_8.setTintList(v1_13);
            }
        }
        super.setButtonDrawable(f2.b0.a(this.r, this.s, -1, -1));
        this.refreshDrawableState();
        return;
    }

    public android.graphics.drawable.Drawable getButtonDrawable()
    {
        return this.r;
    }

    public android.graphics.drawable.Drawable getButtonIconDrawable()
    {
        return this.s;
    }

    public android.content.res.ColorStateList getButtonIconTintList()
    {
        return this.v;
    }

    public android.graphics.PorterDuff$Mode getButtonIconTintMode()
    {
        return this.w;
    }

    public android.content.res.ColorStateList getButtonTintList()
    {
        return this.u;
    }

    public int getCheckedState()
    {
        return this.x;
    }

    public CharSequence getErrorAccessibilityLabel()
    {
        return this.q;
    }

    public final boolean isChecked()
    {
        if (this.x != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if ((this.n) && ((this.u == null) && (this.v == null))) {
            this.setUseMaterialThemeColors(1);
        }
        return;
    }

    public final int[] onCreateDrawableState(int p3)
    {
        int[] v3_2 = super.onCreateDrawableState((p3 + 2));
        if (this.getCheckedState() == 2) {
            android.view.View.mergeDrawableStates(v3_2, com.google.android.material.checkbox.MaterialCheckBox.E);
        }
        if (this.p) {
            android.view.View.mergeDrawableStates(v3_2, com.google.android.material.checkbox.MaterialCheckBox.F);
        }
        this.y = f2.b0.c(v3_2);
        return v3_2;
    }

    public final void onDraw(android.graphics.Canvas p6)
    {
        if ((this.o) && (android.text.TextUtils.isEmpty(this.getText()))) {
            android.graphics.drawable.Drawable v0_4 = this.getButtonDrawable();
            if (v0_4 != null) {
                int v2_0 = 1;
                if (this.getLayoutDirection() == 1) {
                    v2_0 = -1;
                }
                int v1_4 = (((this.getWidth() - v0_4.getIntrinsicWidth()) / 2) * v2_0);
                int v2_1 = p6.save();
                p6.translate(((float) v1_4), 0);
                super.onDraw(p6);
                p6.restoreToCount(v2_1);
                if (this.getBackground() != null) {
                    int v6_2 = v0_4.getBounds();
                    this.getBackground().setHotspotBounds((v6_2.left + v1_4), v6_2.top, (v6_2.right + v1_4), v6_2.bottom);
                }
                return;
            }
        }
        super.onDraw(p6);
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p3)
    {
        super.onInitializeAccessibilityNodeInfo(p3);
        if ((p3 != null) && (this.p)) {
            String v0_3 = new StringBuilder();
            v0_3.append(p3.getText());
            v0_3.append(", ");
            v0_3.append(this.q);
            p3.setText(v0_3.toString());
        }
        return;
    }

    public final void onRestoreInstanceState(android.os.Parcelable p2)
    {
        if ((p2 instanceof k3.b)) {
            super.onRestoreInstanceState(((k3.b) p2).getSuperState());
            this.setCheckedState(((k3.b) p2).a);
            return;
        } else {
            super.onRestoreInstanceState(p2);
            return;
        }
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        k3.b v1_1 = new k3.b(super.onSaveInstanceState());
        v1_1.a = this.getCheckedState();
        return v1_1;
    }

    public void setButtonDrawable(int p2)
    {
        this.setButtonDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setButtonDrawable(android.graphics.drawable.Drawable p1)
    {
        this.r = p1;
        this.t = 0;
        this.a();
        return;
    }

    public void setButtonIconDrawable(android.graphics.drawable.Drawable p1)
    {
        this.s = p1;
        this.a();
        return;
    }

    public void setButtonIconDrawableResource(int p2)
    {
        this.setButtonIconDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setButtonIconTintList(android.content.res.ColorStateList p2)
    {
        if (this.v != p2) {
            this.v = p2;
            this.a();
            return;
        } else {
            return;
        }
    }

    public void setButtonIconTintMode(android.graphics.PorterDuff$Mode p2)
    {
        if (this.w != p2) {
            this.w = p2;
            this.a();
            return;
        } else {
            return;
        }
    }

    public void setButtonTintList(android.content.res.ColorStateList p2)
    {
        if (this.u != p2) {
            this.u = p2;
            this.a();
            return;
        } else {
            return;
        }
    }

    public void setButtonTintMode(android.graphics.PorterDuff$Mode p1)
    {
        this.setSupportButtonTintMode(p1);
        this.a();
        return;
    }

    public void setCenterIfNoTextEnabled(boolean p1)
    {
        this.o = p1;
        return;
    }

    public void setChecked(boolean p1)
    {
        this.setCheckedState(p1);
        return;
    }

    public void setCheckedState(int p4)
    {
        if (this.x != p4) {
            android.view.autofill.AutofillManager v4_13;
            this.x = p4;
            if (p4 != 1) {
                v4_13 = 0;
            } else {
                v4_13 = 1;
            }
            super.setChecked(v4_13);
            this.refreshDrawableState();
            if ((android.os.Build$VERSION.SDK_INT >= 30) && (this.A == null)) {
                super.setStateDescription(this.getButtonStateDescription());
            }
            if (!this.z) {
                this.z = 1;
                android.view.autofill.AutofillManager v4_5 = this.f;
                if (v4_5 != null) {
                    android.view.autofill.AutofillManager v4_6 = v4_5.iterator();
                    if (v4_6.hasNext()) {
                        throw v1.a.e(v4_6);
                    }
                }
                if (this.x != 2) {
                    android.view.autofill.AutofillManager v4_9 = this.B;
                    if (v4_9 != null) {
                        v4_9.onCheckedChanged(this, this.isChecked());
                    }
                }
                android.view.autofill.AutofillManager v4_12 = ((android.view.autofill.AutofillManager) this.getContext().getSystemService(android.view.autofill.AutofillManager));
                if (v4_12 != null) {
                    v4_12.notifyValueChanged(this);
                }
                this.z = 0;
            }
        }
        return;
    }

    public void setErrorAccessibilityLabel(CharSequence p1)
    {
        this.q = p1;
        return;
    }

    public void setErrorAccessibilityLabelResource(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = this.getResources().getText(p2);
        }
        this.setErrorAccessibilityLabel(v2_1);
        return;
    }

    public void setErrorShown(boolean p2)
    {
        if (this.p != p2) {
            this.p = p2;
            this.refreshDrawableState();
            ClassCastException v2_3 = this.e.iterator();
            if (v2_3.hasNext()) {
                throw v1.a.e(v2_3);
            }
        }
        return;
    }

    public void setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener p1)
    {
        this.B = p1;
        return;
    }

    public void setStateDescription(CharSequence p3)
    {
        this.A = p3;
        if (p3 != null) {
            super.setStateDescription(p3);
            return;
        } else {
            if ((android.os.Build$VERSION.SDK_INT >= 30) && (p3 == null)) {
                super.setStateDescription(this.getButtonStateDescription());
            }
            return;
        }
    }

    public void setUseMaterialThemeColors(boolean p1)
    {
        this.n = p1;
        if (p1 == 0) {
            this.setButtonTintList(0);
            return;
        } else {
            this.setButtonTintList(this.getMaterialThemeColorsTintList());
            return;
        }
    }

    public final void toggle()
    {
        this.setChecked((this.isChecked() ^ 1));
        return;
    }
}
