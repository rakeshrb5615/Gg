package com.google.android.recaptcha.internal;
final class zzdl extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzdt zzb;
    final synthetic com.google.android.recaptcha.internal.zzsc zzc;
    final synthetic long zzd;

    public zzdl(com.google.android.recaptcha.internal.zzdt p1, com.google.android.recaptcha.internal.zzsc p2, long p3, l7.c p5)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        super(2, p5);
        return;
    }

    public final l7.c create(Object p7, l7.c p8)
    {
        return new com.google.android.recaptcha.internal.zzdl(this.zzb, this.zzc, this.zzd, p8);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzdl) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        m7.a v0 = m7.a.a;
        com.google.android.recaptcha.internal.zzsc v1_0 = this.zza;
        c4.b.e0(p6);
        if (v1_0 == null) {
            h7.l v6_3 = this.zzb;
            com.google.android.recaptcha.internal.zzsc v1_1 = this.zzc;
            long v2 = this.zzd;
            this.zza = 1;
            if (com.google.android.recaptcha.internal.zzdt.zzk(v6_3, v1_1, v2, this) == v0) {
                return v0;
            }
        }
        return h7.l.a;
    }
}
