package com.google.android.recaptcha.internal;
final class zzi extends n7.c {
    synthetic Object zza;
    final synthetic com.google.android.recaptcha.internal.zzl zzb;
    int zzc;

    public zzi(com.google.android.recaptcha.internal.zzl p1, l7.c p2)
    {
        this.zzb = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p7)
    {
        this.zza = p7;
        this.zzc = (this.zzc | -2147483648);
        Object v7_2 = this.zzb.zzc(0, 0, 0, this);
        if (v7_2 != m7.a.a) {
            return new h7.h(v7_2);
        } else {
            return v7_2;
        }
    }
}
