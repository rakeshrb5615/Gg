package com.google.android.recaptcha.internal;
public final class zzcq {
    private static com.google.android.recaptcha.internal.zzcv zza;

    public static final com.google.android.recaptcha.internal.zzcv zza(android.app.Application p1)
    {
        com.google.android.recaptcha.internal.zzcv v0_0 = com.google.android.recaptcha.internal.zzcq.zza;
        if (v0_0 == null) {
            v0_0 = new com.google.android.recaptcha.internal.zzcv(p1);
        }
        if (com.google.android.recaptcha.internal.zzcq.zza == null) {
            com.google.android.recaptcha.internal.zzcq.zza = v0_0;
        }
        return v0_0;
    }

    public static final Object zzb(android.app.Application p10, String p11, long p12, l7.c p14)
    {
        return com.google.android.recaptcha.internal.zzcv.zzh(com.google.android.recaptcha.internal.zzcq.zza(p10), p11, p12, 0, 0, 0, p14, 28, 0);
    }

    public static final com.google.android.gms.tasks.Task zzc(android.app.Application p7, String p8, long p9)
    {
        return com.google.android.recaptcha.internal.zzas.zza(d8.f0.c(com.google.android.recaptcha.internal.zzcq.zza(p7).zzd().zza(), new com.google.android.recaptcha.internal.zzco(p7, p8, p9, 0)));
    }

    public static final Object zzd(android.app.Application p7, String p8, l7.c p9)
    {
        return com.google.android.recaptcha.internal.zzcv.zzf(com.google.android.recaptcha.internal.zzcq.zza(p7), p8, 0, 0, p9, 6, 0);
    }

    public static final com.google.android.gms.tasks.Task zze(android.app.Application p3, String p4)
    {
        return com.google.android.recaptcha.internal.zzas.zza(d8.f0.c(com.google.android.recaptcha.internal.zzcq.zza(p3).zzd().zza(), new com.google.android.recaptcha.internal.zzcp(p3, p4, 0)));
    }
}
