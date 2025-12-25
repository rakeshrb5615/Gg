package com.google.android.recaptcha.internal;
final class zziz extends n7.i implements u7.p {
    Object zza;
    int zzb;
    final synthetic com.google.android.recaptcha.internal.zzja zzc;
    final synthetic com.google.android.recaptcha.internal.zzen zzd;

    public zziz(com.google.android.recaptcha.internal.zzja p1, com.google.android.recaptcha.internal.zzen p2, l7.c p3)
    {
        this.zzc = p1;
        this.zzd = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zziz(this.zzc, this.zzd, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zziz) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        com.google.android.recaptcha.internal.zzbd v0_0 = m7.a.a;
        Object v1_0 = this.zzb;
        if (v1_0 == null) {
            c4.b.e0(p6);
            com.google.android.recaptcha.internal.zzbd v6_8 = this.zzc;
            this.zzb = 1;
            if (v6_8.zzx(this) == v0_0) {
                return v0_0;
            } else {
                com.google.android.recaptcha.internal.zzbd v6_2 = new com.google.android.recaptcha.internal.zziy(this.zzc, this.zzd, 0);
                this.zzb = 2;
                if (d8.f0.y(20000, v6_2, this) == v0_0) {
                    return v0_0;
                }
            }
        } else {
            if (v1_0 == 1) {
                c4.b.e0(p6);
            } else {
                if (v1_0 == 2) {
                    c4.b.e0(p6);
                } else {
                    com.google.android.recaptcha.internal.zzbd v0_1 = ((com.google.android.recaptcha.internal.zzbd) this.zza);
                    c4.b.e0(p6);
                    this.zzd.zzb(v0_1);
                }
            }
        }
        return h7.l.a;
    }
}
