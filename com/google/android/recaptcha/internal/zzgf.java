package com.google.android.recaptcha.internal;
public final class zzgf {
    private final com.google.android.recaptcha.internal.zzge zza;
    private final java.util.HashMap zzb;
    private final com.google.android.recaptcha.internal.zzfw zzc;
    private final com.google.android.recaptcha.internal.zzcg zzd;

    public zzgf(com.google.android.recaptcha.internal.zzfw p1, com.google.android.recaptcha.internal.zzcg p2, com.google.android.recaptcha.internal.zzbo p3)
    {
        this.zzc = p1;
        this.zzd = p2;
        com.google.android.recaptcha.internal.zzge v1_2 = new com.google.android.recaptcha.internal.zzge();
        this.zza = v1_2;
        java.util.HashMap v2_2 = new java.util.HashMap();
        this.zzb = v2_2;
        v1_2.zzd(173, v2_2);
        return;
    }

    public final com.google.android.recaptcha.internal.zzge zza()
    {
        return this.zza;
    }

    public final void zzb()
    {
        this.zza.zzc();
        this.zza.zzd(173, this.zzb);
        return;
    }

    public final com.google.android.recaptcha.internal.zzcg zzc()
    {
        return this.zzd;
    }

    public final com.google.android.recaptcha.internal.zzfw zzd()
    {
        return this.zzc;
    }

    public final void zze(int p2, Object p3)
    {
        this.zzb.put(Integer.valueOf((p2 - 2)), p3);
        return;
    }
}
