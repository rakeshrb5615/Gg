package com.google.android.recaptcha.internal;
final class zzdf extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzdt zzb;
    final synthetic com.google.android.recaptcha.internal.zzsp zzc;
    final synthetic com.google.android.recaptcha.internal.zzen zzd;

    public zzdf(com.google.android.recaptcha.internal.zzdt p1, com.google.android.recaptcha.internal.zzsp p2, com.google.android.recaptcha.internal.zzen p3, l7.c p4)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzdf(this.zzb, this.zzc, this.zzd, p5);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzdf) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p5)
    {
        com.google.android.recaptcha.internal.zzen v0_0 = m7.a.a;
        com.google.android.recaptcha.internal.zzsp v1_0 = this.zza;
        c4.b.e0(p5);
        if (v1_0 == null) {
            com.google.android.recaptcha.internal.zzsr v5_2 = this.zzb;
            com.google.android.recaptcha.internal.zzsp v1_1 = this.zzc;
            com.google.android.recaptcha.internal.zzfj v2 = com.google.android.recaptcha.internal.zzdt.zzh(v5_2);
            com.google.android.recaptcha.internal.zzsr v5_3 = com.google.android.recaptcha.internal.zzdt.zzd(v5_2);
            this.zza = 1;
            p5 = v2.zzb(v5_3, v1_1, this);
            if (p5 == v0_0) {
                return v0_0;
            }
        }
        this.zzd.zza();
        return ((com.google.android.recaptcha.internal.zzsr) p5);
    }
}
