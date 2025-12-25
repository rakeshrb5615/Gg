package com.google.android.recaptcha.internal;
final class zzcz extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzdc zzb;
    final synthetic long zzc;
    final synthetic com.google.android.recaptcha.RecaptchaAction zzd;
    final synthetic String zze;

    public zzcz(com.google.android.recaptcha.internal.zzdc p1, long p2, com.google.android.recaptcha.RecaptchaAction p4, String p5, l7.c p6)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p4;
        this.zze = p5;
        super(2, p6);
        return;
    }

    public final l7.c create(Object p8, l7.c p9)
    {
        return new com.google.android.recaptcha.internal.zzcz(this.zzb, this.zzc, this.zzd, this.zze, p9);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzcz) this.create(((com.google.android.recaptcha.internal.zzek) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        h7.h v0_0 = m7.a.a;
        com.google.android.recaptcha.internal.zzcn v1_0 = this.zza;
        c4.b.e0(p8);
        if (v1_0 == null) {
            com.google.android.recaptcha.internal.zzdc.zze(this.zzb, this.zzc, this.zzd);
            String v2 = this.zze;
            com.google.android.recaptcha.RecaptchaAction v3_0 = this.zzd;
            long v4 = this.zzc;
            com.google.android.recaptcha.internal.zzcn v1_1 = com.google.android.recaptcha.internal.zzdc.zza(this.zzb);
            this.zza = 1;
            p8 = v1_1.zza(v2, v3_0, v4, this);
            if (p8 == v0_0) {
                return v0_0;
            }
        }
        return new h7.h(((String) p8));
    }
}
