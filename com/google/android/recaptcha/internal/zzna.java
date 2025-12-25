package com.google.android.recaptcha.internal;
public abstract class zzna extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    protected com.google.android.recaptcha.internal.zzmt zzb;

    public zzna()
    {
        this.zzb = com.google.android.recaptcha.internal.zzmt.zzd();
        return;
    }

    public final com.google.android.recaptcha.internal.zzmt zzi()
    {
        if (this.zzb.zzj()) {
            this.zzb = this.zzb.zzc();
        }
        return this.zzb;
    }
}
