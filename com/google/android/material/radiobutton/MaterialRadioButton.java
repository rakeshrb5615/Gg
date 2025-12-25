package com.google.android.material.radiobutton;
public class MaterialRadioButton extends n.d0 {
    public static final int[][] m;
    public android.content.res.ColorStateList e;
    public boolean f;

    static MaterialRadioButton()
    {
        com.google.android.material.radiobutton.MaterialRadioButton.m = new int[][] {new int[] {16842910, 16842912}), new int[] {16842910, -16842912}), new int[] {-16842910, 16842912}), new int[] {-16842910, -16842912})});
        return;
    }

    public MaterialRadioButton(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 2130969663, 2132018384), p9);
        android.content.Context v1 = super.getContext();
        int[] v6 = new int[0];
        android.content.res.TypedArray v9_1 = q3.k.f(v1, p9, c3.a.q, 2130969663, 2132018384, v6);
        if (v9_1.hasValue(0)) {
            super.setButtonTintList(j5.t1.v(v1, v9_1, 0));
        }
        super.f = v9_1.getBoolean(1, 0);
        v9_1.recycle();
        return;
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList()
    {
        if (this.e == null) {
            android.content.res.ColorStateList v0_5 = j5.t1.u(this, 2130968847);
            android.content.res.ColorStateList v1_4 = j5.t1.u(this, 2130968867);
            int[][] v2_0 = j5.t1.u(this, 2130968890);
            this.e = new android.content.res.ColorStateList(com.google.android.material.radiobutton.MaterialRadioButton.m, new int[] {j5.t1.L(v2_0, v0_5, 1065353216), j5.t1.L(v2_0, v1_4, 1057635697), j5.t1.L(v2_0, v1_4, 1052938076), j5.t1.L(v2_0, v1_4, 1052938076)}));
        }
        return this.e;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if ((this.f) && (this.getButtonTintList() == null)) {
            this.setUseMaterialThemeColors(1);
        }
        return;
    }

    public void setUseMaterialThemeColors(boolean p1)
    {
        this.f = p1;
        if (p1 == 0) {
            this.setButtonTintList(0);
            return;
        } else {
            this.setButtonTintList(this.getMaterialThemeColorsTintList());
            return;
        }
    }
}
