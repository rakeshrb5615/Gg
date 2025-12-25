package com.google.android.recaptcha.internal;
final class zzd extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zze zzb;
    final synthetic com.google.android.recaptcha.internal.zzsc zzc;

    public zzd(com.google.android.recaptcha.internal.zze p1, com.google.android.recaptcha.internal.zzsc p2, l7.c p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzd(this.zzb, this.zzc, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzd) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p4)
    {
        Object v4_2;
        h7.h v0_0 = m7.a.a;
        com.google.android.recaptcha.internal.zzsc v1_0 = this.zza;
        c4.b.e0(p4);
        if (v1_0 == null) {
            Object v4_3 = this.zzb;
            com.google.android.recaptcha.internal.zzsc v1_1 = this.zzc;
            this.zza = 1;
            v4_2 = v4_3.zzh(v1_1, this);
            if (v4_2 == v0_0) {
                return v0_0;
            }
        } else {
            v4_2 = ((h7.h) p4).a;
        }
        return new h7.h(v4_2);
    }
}
