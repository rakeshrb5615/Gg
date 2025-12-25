package com.google.android.material.timepicker;
 class ChipTextInputComboView extends android.widget.FrameLayout implements android.widget.Checkable {
    public final com.google.android.material.chip.Chip a;
    public final android.widget.EditText b;

    public ChipTextInputComboView(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5, 0);
        android.widget.TextView v4_3 = android.view.LayoutInflater.from(p4);
        int v5_5 = ((com.google.android.material.chip.Chip) v4_3.inflate(2131558482, super, 0));
        super.a = v5_5;
        v5_5.setAccessibilityClassName("android.view.View");
        android.widget.TextView v4_2 = ((com.google.android.material.textfield.TextInputLayout) v4_3.inflate(2131558483, super, 0));
        android.widget.EditText v1_1 = v4_2.getEditText();
        super.b = v1_1;
        v1_1.setVisibility(4);
        v1_1.addTextChangedListener(new com.google.android.material.timepicker.a(super));
        v1_1.setImeHintLocales(super.getContext().getResources().getConfiguration().getLocales());
        super.addView(v5_5);
        super.addView(v4_2);
        android.widget.TextView v4_6 = ((android.widget.TextView) super.findViewById(2131362195));
        v1_1.setId(android.view.View.generateViewId());
        v4_6.setLabelFor(v1_1.getId());
        v1_1.setSaveEnabled(0);
        v1_1.setLongClickable(0);
        return;
    }

    public static String a(com.google.android.material.timepicker.ChipTextInputComboView p1, CharSequence p2)
    {
        try {
            return String.format(p1.getResources().getConfiguration().locale, "%02d", new Object[] {Integer.valueOf(Integer.parseInt(String.valueOf(p2)))}));
        } catch (NumberFormatException) {
            return 0;
        }
    }

    public final boolean isChecked()
    {
        return this.a.isChecked();
    }

    public final void onConfigurationChanged(android.content.res.Configuration p2)
    {
        super.onConfigurationChanged(p2);
        this.b.setImeHintLocales(this.getContext().getResources().getConfiguration().getLocales());
        return;
    }

    public final void setChecked(boolean p5)
    {
        int v2;
        int v0_0 = this.a;
        v0_0.setChecked(p5);
        int v1 = 0;
        if (p5 == null) {
            v2 = 4;
        } else {
            v2 = 0;
        }
        android.widget.EditText v3 = this.b;
        v3.setVisibility(v2);
        if (p5 != null) {
            v1 = 8;
        }
        v0_0.setVisibility(v1);
        if (v0_0.isChecked()) {
            v3.requestFocus();
            v3.post(new i2.v(v3, 4));
        }
        return;
    }

    public final void setOnClickListener(android.view.View$OnClickListener p2)
    {
        this.a.setOnClickListener(p2);
        return;
    }

    public final void setTag(int p2, Object p3)
    {
        this.a.setTag(p2, p3);
        return;
    }

    public final void toggle()
    {
        this.a.toggle();
        return;
    }
}
