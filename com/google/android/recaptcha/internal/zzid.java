package com.google.android.recaptcha.internal;
public final class zzid implements com.google.android.recaptcha.internal.zzih {
    private final android.content.Context zza;

    public zzid(android.content.Context p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic Object cs(Object[] p1)
    {
        return com.google.android.recaptcha.internal.zzie.zza(this, p1);
    }

    public final varargs Object zza(Object[] p3)
    {
        return this.zza.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
