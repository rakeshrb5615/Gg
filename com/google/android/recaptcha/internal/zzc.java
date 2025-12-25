package com.google.android.recaptcha.internal;
final class zzc extends n7.c {
    Object zza;
    synthetic Object zzb;
    final synthetic com.google.android.recaptcha.internal.zze zzc;
    int zzd;
    com.google.android.recaptcha.internal.zzen zze;

    public zzc(com.google.android.recaptcha.internal.zze p1, l7.c p2)
    {
        this.zzc = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p4)
    {
        this.zzb = p4;
        this.zzd = (this.zzd | -2147483648);
        Object v4_4 = this.zzc.zze(0, 0, this);
        if (v4_4 != m7.a.a) {
            return new h7.h(v4_4);
        } else {
            return v4_4;
        }
    }
}
