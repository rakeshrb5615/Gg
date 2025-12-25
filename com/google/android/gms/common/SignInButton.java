package com.google.android.gms.common;
public final class SignInButton extends android.widget.FrameLayout implements android.view.View$OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private android.view.View zac;
    private android.view.View$OnClickListener zad;

    public SignInButton(android.content.Context p2)
    {
        this(p2, 0);
        return;
    }

    public SignInButton(android.content.Context p2, android.util.AttributeSet p3)
    {
        this(p2, p3, 0);
        return;
    }

    public SignInButton(android.content.Context p2, android.util.AttributeSet p3, int p4)
    {
        super(p2, p3, p4);
        super.zad = 0;
        int v2_3 = p2.getTheme().obtainStyledAttributes(p3, com.google.android.gms.base.R$styleable.SignInButton, 0, 0);
        try {
            super.zaa = v2_3.getInt(com.google.android.gms.base.R$styleable.SignInButton_buttonSize, 0);
            super.zab = v2_3.getInt(com.google.android.gms.base.R$styleable.SignInButton_colorScheme, 2);
            v2_3.recycle();
            int v2_1 = super.zaa;
            super.setStyle(v2_1, super.zab);
            return;
        } catch (Throwable v3_5) {
            v2_1.recycle();
            throw v3_5;
        }
    }

    private final void zaa(android.content.Context p5)
    {
        boolean v0_0 = this.zac;
        if (v0_0) {
            this.removeView(v0_0);
        }
        try {
            this.zac = com.google.android.gms.common.internal.zaz.zaa(p5, this.zaa, this.zab);
        } catch (com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException) {
            android.util.Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            boolean v0_1 = this.zaa;
            int v1_0 = this.zab;
            com.google.android.gms.common.internal.zaaa v2_1 = new com.google.android.gms.common.internal.zaaa(p5, 0);
            v2_1.zaa(p5.getResources(), v0_1, v1_0);
            this.zac = v2_1;
        }
        this.addView(this.zac);
        this.zac.setEnabled(this.isEnabled());
        this.zac.setOnClickListener(this);
        return;
    }

    public void onClick(android.view.View p3)
    {
        android.view.View$OnClickListener v0 = this.zad;
        if ((v0 != null) && (p3 == this.zac)) {
            v0.onClick(this);
        }
        return;
    }

    public void setColorScheme(int p2)
    {
        this.setStyle(this.zaa, p2);
        return;
    }

    public void setEnabled(boolean p2)
    {
        super.setEnabled(p2);
        this.zac.setEnabled(p2);
        return;
    }

    public void setOnClickListener(android.view.View$OnClickListener p1)
    {
        this.zad = p1;
        android.view.View v1_1 = this.zac;
        if (v1_1 != null) {
            v1_1.setOnClickListener(this);
        }
        return;
    }

    public void setScopes(com.google.android.gms.common.api.Scope[] p2)
    {
        this.setStyle(this.zaa, this.zab);
        return;
    }

    public void setSize(int p2)
    {
        this.setStyle(p2, this.zab);
        return;
    }

    public void setStyle(int p1, int p2)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zaa(this.getContext());
        return;
    }

    public void setStyle(int p1, int p2, com.google.android.gms.common.api.Scope[] p3)
    {
        this.setStyle(p1, p2);
        return;
    }
}
