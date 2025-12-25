package com.google.android.gms.common.internal;
public final class zaaa extends android.widget.Button {

    public zaaa(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, 0, 16842824);
        return;
    }

    private static final int zab(int p0, int p1, int p2, int p3)
    {
        if (p0 == null) {
            return p1;
        } else {
            if (p0 == 1) {
                return p2;
            } else {
                if (p0 != 2) {
                    throw new IllegalStateException(g2.g.c(p0, "Unknown color scheme: "));
                } else {
                    return p3;
                }
            }
        }
    }

    public final void zaa(android.content.res.Resources p6, int p7, int p8)
    {
        this.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        this.setTextSize(1096810496);
        int v0_2 = ((int) ((p6.getDisplayMetrics().density * 1111490560) + 1056964608));
        this.setMinHeight(v0_2);
        this.setMinWidth(v0_2);
        int v0_4 = com.google.android.gms.common.internal.zaaa.zab(p8, com.google.android.gms.base.R$drawable.common_google_signin_btn_icon_dark, com.google.android.gms.base.R$drawable.common_google_signin_btn_icon_light, com.google.android.gms.base.R$drawable.common_google_signin_btn_icon_light);
        int vtmp3 = com.google.android.gms.common.internal.zaaa.zab(p8, com.google.android.gms.base.R$drawable.common_google_signin_btn_text_dark, com.google.android.gms.base.R$drawable.common_google_signin_btn_text_light, com.google.android.gms.base.R$drawable.common_google_signin_btn_text_light);
        if ((p7 == null) || (p7 == 1)) {
            v0_4 = vtmp3;
        } else {
            if (p7 != 2) {
                throw new IllegalStateException(g2.g.c(p7, "Unknown button size: "));
            }
        }
        int v0_6 = p6.getDrawable(v0_4);
        v0_6.setTintList(p6.getColorStateList(com.google.android.gms.base.R$color.common_google_signin_btn_tint));
        v0_6.setTintMode(android.graphics.PorterDuff$Mode.SRC_ATOP);
        this.setBackgroundDrawable(v0_6);
        this.setTextColor(((android.content.res.ColorStateList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6.getColorStateList(com.google.android.gms.common.internal.zaaa.zab(p8, com.google.android.gms.base.R$color.common_google_signin_btn_text_dark, com.google.android.gms.base.R$color.common_google_signin_btn_text_light, com.google.android.gms.base.R$color.common_google_signin_btn_text_light)))));
        if (p7 == null) {
            this.setText(p6.getString(com.google.android.gms.base.R$string.common_signin_button_text));
        } else {
            if (p7 == 1) {
                this.setText(p6.getString(com.google.android.gms.base.R$string.common_signin_button_text_long));
            } else {
                if (p7 != 2) {
                    throw new IllegalStateException(g2.g.c(p7, "Unknown button size: "));
                } else {
                    this.setText(0);
                }
            }
        }
        this.setTransformationMethod(0);
        if (com.google.android.gms.common.util.DeviceProperties.isWearable(this.getContext())) {
            this.setGravity(19);
        }
        return;
    }
}
