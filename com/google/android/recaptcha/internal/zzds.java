package com.google.android.recaptcha.internal;
final class zzds extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzdt zzb;
    final synthetic com.google.android.recaptcha.internal.zzen zzc;

    public zzds(com.google.android.recaptcha.internal.zzdt p1, com.google.android.recaptcha.internal.zzen p2, l7.c p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzds(this.zzb, this.zzc, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzds) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p3)
    {
        com.google.android.recaptcha.internal.zzen v0_0 = m7.a.a;
        int v1_0 = this.zza;
        c4.b.e0(p3);
        if (v1_0 == 0) {
            com.google.android.recaptcha.internal.zzsc v3_2 = this.zzb;
            this.zza = 1;
            p3 = com.google.android.recaptcha.internal.zzdt.zzj(v3_2, this);
            if (p3 == v0_0) {
                return v0_0;
            }
        }
        this.zzc.zza();
        return ((com.google.android.recaptcha.internal.zzsc) p3);
    }
}
