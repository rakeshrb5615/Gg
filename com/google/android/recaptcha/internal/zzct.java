package com.google.android.recaptcha.internal;
final class zzct extends n7.i implements u7.p {
    Object zza;
    int zzb;
    synthetic Object zzc;
    final synthetic com.google.android.recaptcha.internal.zzcv zzd;
    final synthetic String zze;
    final synthetic long zzf;
    final synthetic com.google.android.recaptcha.internal.zzcn zzg;
    final synthetic com.google.android.recaptcha.internal.zzch zzh;
    final synthetic com.google.android.recaptcha.internal.zzbi zzi;

    public zzct(com.google.android.recaptcha.internal.zzcv p1, String p2, long p3, com.google.android.recaptcha.internal.zzcn p5, com.google.android.recaptcha.internal.zzbi p6, com.google.android.recaptcha.internal.zzch p7, l7.c p8)
    {
        this.zzd = p1;
        this.zze = p2;
        this.zzf = p3;
        this.zzg = p5;
        this.zzi = p6;
        this.zzh = p7;
        super(2, p8);
        return;
    }

    public final l7.c create(Object p10, l7.c p11)
    {
        com.google.android.recaptcha.internal.zzct v0_1 = new com.google.android.recaptcha.internal.zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, p11);
        v0_1.zzc = p10;
        return v0_1;
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzct) this.create(((com.google.android.recaptcha.internal.zzek) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        com.google.android.recaptcha.internal.zzcn v0_1;
        com.google.android.recaptcha.internal.zzek v1_2;
        com.google.android.recaptcha.internal.zzcn v0_0 = m7.a.a;
        if (this.zzb == 0) {
            c4.b.e0(p6);
            v1_2 = ((com.google.android.recaptcha.internal.zzek) this.zzc);
            com.google.android.recaptcha.internal.zzcn v6_1 = com.google.android.recaptcha.internal.zzcv.zza(this.zzd, this.zze);
            if (v6_1 == null) {
                com.google.android.recaptcha.internal.zzcv.zzc(this.zzd, this.zzf);
                com.google.android.recaptcha.internal.zzcn v6_3 = this.zzg;
                if (v6_3 == null) {
                    v6_3 = com.google.android.recaptcha.internal.zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, v1_2);
                }
                Object v2_2 = this.zzf;
                this.zzc = v1_2;
                this.zza = v6_3;
                this.zzb = 1;
                if (v6_3.zzb(v2_2, this) != v0_0) {
                    v0_1 = v6_3;
                } else {
                    return v0_0;
                }
            } else {
                return v6_1;
            }
        } else {
            v0_1 = ((com.google.android.recaptcha.internal.zzcn) this.zza);
            v1_2 = ((com.google.android.recaptcha.internal.zzek) this.zzc);
            c4.b.e0(p6);
        }
        com.google.android.recaptcha.internal.zzbi v3_2 = new com.google.android.recaptcha.internal.zzdc(v0_1, this.zze, this.zzi, v1_2);
        com.google.android.recaptcha.internal.zzcv.zzb(this.zzd, v3_2);
        return v3_2;
    }
}
