package com.google.android.recaptcha.internal;
public final class zzce extends java.lang.Exception {
    private final Throwable zza;
    private final com.google.android.recaptcha.internal.zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int p1, int p2, Throwable p3)
    {
        this.zzc = p1;
        this.zzd = p2;
        this.zza = p3;
        com.google.android.recaptcha.internal.zztd v3_1 = com.google.android.recaptcha.internal.zzte.zzf();
        v3_1.zzq(p2);
        v3_1.zzr(p1);
        this.zzb = v3_1;
        return;
    }

    public final Throwable getCause()
    {
        return this.zza;
    }

    public final com.google.android.recaptcha.internal.zztd zza()
    {
        return this.zzb;
    }

    public final int zzb()
    {
        return this.zzd;
    }
}
