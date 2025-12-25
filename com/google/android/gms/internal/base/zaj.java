package com.google.android.gms.internal.base;
final class zaj extends android.graphics.drawable.Drawable$ConstantState {
    int zaa;
    int zab;

    public zaj(com.google.android.gms.internal.base.zaj p2)
    {
        if (p2 != 0) {
            this.zaa = p2.zaa;
            this.zab = p2.zab;
        }
        return;
    }

    public final int getChangingConfigurations()
    {
        return this.zaa;
    }

    public final android.graphics.drawable.Drawable newDrawable()
    {
        return new com.google.android.gms.internal.base.zak(this);
    }
}
