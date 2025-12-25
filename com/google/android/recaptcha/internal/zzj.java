package com.google.android.recaptcha.internal;
final class zzj extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zze zzb;
    final synthetic long zzc;
    final synthetic com.google.android.recaptcha.internal.zzsc zzd;

    public zzj(com.google.android.recaptcha.internal.zze p1, long p2, com.google.android.recaptcha.internal.zzsc p4, l7.c p5)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p4;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        return new com.google.android.recaptcha.internal.zzj(this.zzb, this.zzc, this.zzd, p8);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzj) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        Object v6_1;
        h7.h v0_0 = m7.a.a;
        long v1_0 = this.zza;
        c4.b.e0(p6);
        if (v1_0 == 0) {
            Object v6_3 = this.zzb;
            long v1_1 = this.zzc;
            com.google.android.recaptcha.internal.zzsc v3 = this.zzd;
            this.zza = 1;
            v6_1 = v6_3.zze(v1_1, v3, this);
            if (v6_1 == v0_0) {
                return v0_0;
            }
        } else {
            v6_1 = ((h7.h) p6).a;
        }
        return new h7.h(v6_1);
    }
}
