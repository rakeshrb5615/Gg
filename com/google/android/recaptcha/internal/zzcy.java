package com.google.android.recaptcha.internal;
final class zzcy extends n7.c {
    synthetic Object zza;
    final synthetic com.google.android.recaptcha.internal.zzdc zzb;
    int zzc;

    public zzcy(com.google.android.recaptcha.internal.zzdc p1, l7.c p2)
    {
        this.zzb = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p4)
    {
        this.zza = p4;
        this.zzc = (this.zzc | -2147483648);
        Object v4_4 = com.google.android.recaptcha.internal.zzdc.zzb(this.zzb, 0, 0, this);
        if (v4_4 != m7.a.a) {
            return new h7.h(v4_4);
        } else {
            return v4_4;
        }
    }
}
