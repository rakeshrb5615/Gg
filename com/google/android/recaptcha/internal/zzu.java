package com.google.android.recaptcha.internal;
final class zzu extends n7.i implements u7.p {
    Object zza;
    Object zzb;
    int zzc;
    final synthetic com.google.android.recaptcha.internal.zzsc zzd;
    final synthetic com.google.android.recaptcha.internal.zzv zze;

    public zzu(com.google.android.recaptcha.internal.zzsc p1, com.google.android.recaptcha.internal.zzv p2, l7.c p3)
    {
        this.zzd = p1;
        this.zze = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzu(this.zzd, this.zze, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzu) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p5)
    {
        java.util.Iterator v1_2;
        com.google.android.recaptcha.internal.zzba v2_0;
        h7.h v0_0 = m7.a.a;
        if (this.zzc == 0) {
            c4.b.e0(p5);
            if (this.zzd.zzS()) {
                v2_0 = this.zzd.zzj();
                if (v2_0.zzi().zzd() == 0) {
                    return new h7.h(c4.b.p(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzab, 0)));
                } else {
                    com.google.android.recaptcha.internal.zzv.zzp(this.zze, v2_0.zzi());
                    v1_2 = com.google.android.recaptcha.internal.zzv.zzn(this.zze).iterator();
                }
            } else {
                return new h7.h(c4.b.p(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzab, 0)));
            }
        } else {
            v1_2 = ((java.util.Iterator) this.zzb);
            v2_0 = ((com.google.android.recaptcha.internal.zzse) this.zza);
            c4.b.e0(p5);
        }
        while (v1_2.hasNext()) {
            h7.g v5_17 = ((com.google.android.recaptcha.internal.zzy) v1_2.next());
            this.zza = v2_0;
            this.zzb = v1_2;
            this.zzc = 1;
            if (v5_17.zzd(v2_0, this) == v0_0) {
                return v0_0;
            }
        }
        return new h7.h(h7.l.a);
    }
}
