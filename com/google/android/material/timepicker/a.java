package com.google.android.material.timepicker;
public final class a extends q3.j {
    public final synthetic com.google.android.material.timepicker.ChipTextInputComboView a;

    public a(com.google.android.material.timepicker.ChipTextInputComboView p1)
    {
        this.a = p1;
        return;
    }

    public final void afterTextChanged(android.text.Editable p5)
    {
        com.google.android.material.timepicker.ChipTextInputComboView v2 = this.a;
        if (!android.text.TextUtils.isEmpty(p5)) {
            String v5_1 = com.google.android.material.timepicker.ChipTextInputComboView.a(v2, p5);
            com.google.android.material.chip.Chip v0_2 = v2.a;
            if (android.text.TextUtils.isEmpty(v5_1)) {
                v5_1 = com.google.android.material.timepicker.ChipTextInputComboView.a(v2, "00");
            }
            v0_2.setText(v5_1);
            return;
        } else {
            v2.a.setText(com.google.android.material.timepicker.ChipTextInputComboView.a(v2, "00"));
            return;
        }
    }
}
