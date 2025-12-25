package com.google.android.recaptcha.internal;
final class zzfs extends n7.i implements u7.p {
    Object zza;
    Object zzb;
    int zzc;
    final synthetic com.google.android.recaptcha.internal.zzgd zzd;
    final synthetic com.google.android.recaptcha.internal.zzft zze;
    final synthetic String zzf;

    public zzfs(com.google.android.recaptcha.internal.zzgd p1, com.google.android.recaptcha.internal.zzft p2, String p3, l7.c p4)
    {
        this.zzd = p1;
        this.zze = p2;
        this.zzf = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzfs(this.zzd, this.zze, this.zzf, p5);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzfs) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p7)
    {
        com.google.android.recaptcha.internal.zzft v1_7;
        com.google.android.recaptcha.internal.zzgd v2_1;
        m7.a v0 = m7.a.a;
        com.google.android.recaptcha.internal.zzft v1_0 = this.zzc;
        try {
            if (v1_0 == null) {
                c4.b.e0(p7);
                this.zzd.zza = new com.google.android.recaptcha.internal.zzbn();
                Object v7_2 = com.google.android.recaptcha.internal.zzub.zzi(com.google.android.recaptcha.internal.zzkh.zzh().zzj(this.zzf));
                v7_2.zzf();
                com.google.android.recaptcha.internal.zzft v1_4 = com.google.android.recaptcha.internal.zzft.zzb(this.zze).zza(v7_2);
                int v3_0 = com.google.android.recaptcha.internal.zzjh.zzb();
                com.google.android.recaptcha.internal.zzft v4 = this.zze;
                com.google.android.recaptcha.internal.zzft v1_5 = v1_4.zzi();
                com.google.android.recaptcha.internal.zzgd v5 = this.zzd;
                this.zza = v7_2;
                this.zzb = v3_0;
                this.zzc = 1;
                if (com.google.android.recaptcha.internal.zzft.zzc(v4, v1_5, v5, this) == v0) {
                    return v0;
                } else {
                    v2_1 = v7_2;
                    v1_7 = v3_0;
                    v1_7.zzf();
                    new Long(v1_7.zza(java.util.concurrent.TimeUnit.MICROSECONDS));
                    v2_1.zzf();
                }
            } else {
                if (v1_0 == 1) {
                    v1_7 = ((com.google.android.recaptcha.internal.zzjh) this.zzb);
                    v2_1 = ((com.google.android.recaptcha.internal.zzub) this.zza);
                    c4.b.e0(p7);
                } else {
                    c4.b.e0(p7);
                }
            }
        } catch (Object v7_3) {
            com.google.android.recaptcha.internal.zzft v1_9 = this.zze;
            com.google.android.recaptcha.internal.zzgd v2_3 = this.zzd;
            this.zza = 0;
            this.zzb = 0;
            this.zzc = 2;
            if (com.google.android.recaptcha.internal.zzft.zzd(v1_9, v7_3, v2_3, this) == v0) {
                return v0;
            }
        }
        return h7.l.a;
    }
}
