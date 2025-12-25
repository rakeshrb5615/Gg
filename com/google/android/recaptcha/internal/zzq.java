package com.google.android.recaptcha.internal;
final class zzq extends n7.c {
    synthetic Object zza;
    final synthetic com.google.android.recaptcha.internal.zzv zzb;
    int zzc;

    public zzq(com.google.android.recaptcha.internal.zzv p1, l7.c p2)
    {
        this.zzb = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p2)
    {
        this.zza = p2;
        this.zzc = (this.zzc | -2147483648);
        Object v2_4 = this.zzb.zzf(0, this);
        if (v2_4 != m7.a.a) {
            return new h7.h(v2_4);
        } else {
            return v2_4;
        }
    }
}
