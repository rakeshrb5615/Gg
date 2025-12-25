package com.google.android.recaptcha.internal;
final class zzda extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzdc zzb;
    final synthetic com.google.android.recaptcha.RecaptchaAction zzc;
    final synthetic long zzd;

    public zzda(com.google.android.recaptcha.internal.zzdc p1, com.google.android.recaptcha.RecaptchaAction p2, long p3, l7.c p5)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        return new com.google.android.recaptcha.internal.zzda(this.zzb, this.zzc, this.zzd, p8);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzda) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        Object v6_1;
        m7.a v0 = m7.a.a;
        com.google.android.recaptcha.RecaptchaAction v1_0 = this.zza;
        c4.b.e0(p6);
        if (v1_0 == null) {
            Object v6_3 = this.zzb;
            com.google.android.recaptcha.RecaptchaAction v1_1 = this.zzc;
            long v2 = this.zzd;
            this.zza = 1;
            v6_1 = com.google.android.recaptcha.internal.zzdc.zzb(v6_3, v1_1, v2, this);
            if (v6_1 == v0) {
                return v0;
            }
        } else {
            v6_1 = ((h7.h) p6).a;
        }
        c4.b.e0(v6_1);
        return v6_1;
    }
}
