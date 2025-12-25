package com.google.android.recaptcha.internal;
final class zza extends n7.c {
    Object zza;
    long zzb;
    synthetic Object zzc;
    final synthetic com.google.android.recaptcha.internal.zze zzd;
    int zze;
    String zzf;
    com.google.android.recaptcha.internal.zzen zzg;

    public zza(com.google.android.recaptcha.internal.zze p1, l7.c p2)
    {
        this.zzd = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p4)
    {
        this.zzc = p4;
        this.zze = (this.zze | -2147483648);
        Object v4_4 = this.zzd.zzc(0, 0, this);
        if (v4_4 != m7.a.a) {
            return new h7.h(v4_4);
        } else {
            return v4_4;
        }
    }
}
