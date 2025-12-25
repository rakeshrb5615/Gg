package com.google.android.recaptcha.internal;
final class zzam extends n7.i implements u7.p {
    Object zza;
    int zzb;
    final synthetic com.google.android.recaptcha.internal.zzan zzc;
    final synthetic com.google.android.recaptcha.internal.zzen zzd;

    public zzam(com.google.android.recaptcha.internal.zzan p1, com.google.android.recaptcha.internal.zzen p2, l7.c p3)
    {
        this.zzc = p1;
        this.zzd = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzam(this.zzc, this.zzd, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzam) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p7)
    {
        com.google.android.recaptcha.internal.zzen v0_0 = m7.a.a;
        if (this.zzb == 0) {
            c4.b.e0(p7);
            String v7_6 = new kotlin.jvm.internal.r();
            try {
                com.google.android.recaptcha.internal.zzbd v1_1 = new com.google.android.recaptcha.internal.zzal(this.zzc, this.zzd, v7_6, 0);
                this.zza = v7_6;
                this.zzb = 1;
                String v7_1 = d8.f0.y(60000, v1_1, this);
            } catch (com.google.android.recaptcha.internal.zzen v0_1) {
                com.google.android.recaptcha.internal.zzen v0_2 = v7_1;
                String v7_2 = v0_1;
                d8.t vtmp2 = this.zzc.zzf();
                com.google.android.recaptcha.internal.zzen v0_5 = ((Throwable) v0_2.a);
                if (v0_5 == null) {
                    v0_5 = v7_2;
                }
                ((d8.u) vtmp2).O(v0_5);
                com.google.android.recaptcha.internal.zzan.zzh(this.zzc, com.google.android.recaptcha.internal.zzao.zza);
                this.zzd.zzb(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zza, v7_2.getMessage()));
            }
            if (v7_1 == v0_0) {
                return v0_0;
            }
        } else {
            v0_2 = ((kotlin.jvm.internal.r) this.zza);
            try {
                c4.b.e0(p7);
            } catch (String v7_2) {
            }
        }
        return h7.l.a;
    }
}
