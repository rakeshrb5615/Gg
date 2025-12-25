package com.google.android.recaptcha.internal;
final class zzea extends n7.i implements u7.l {
    Object zza;
    int zzb;
    final synthetic com.google.android.recaptcha.internal.zzec zzc;
    final synthetic long zzd;
    final synthetic d8.t zze;

    public zzea(com.google.android.recaptcha.internal.zzec p1, long p2, d8.t p4, l7.c p5)
    {
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p4;
        super(1, p5);
        return;
    }

    public final l7.c create(l7.c p7)
    {
        return new com.google.android.recaptcha.internal.zzea(this.zzc, this.zzd, this.zze, p7);
    }

    public final bridge synthetic Object invoke(Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzea) this.create(((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        com.google.android.recaptcha.internal.zzec v1_4;
        com.google.android.recaptcha.internal.zzec v0_2;
        com.google.android.recaptcha.internal.zzec v0_0 = m7.a.a;
        com.google.android.recaptcha.internal.zzec v1_0 = this.zzb;
        try {
            if (v1_0 == null) {
                c4.b.e0(p8);
                Object v8_1 = com.google.android.recaptcha.internal.zzec.zzd(this.zzc).zzf(41);
                try {
                    com.google.android.recaptcha.internal.zzec v1_2 = com.google.android.recaptcha.internal.zzec.zzc(this.zzc);
                    long v3_0 = this.zzd;
                    this.zza = v8_1;
                    this.zzb = 1;
                    com.google.android.recaptcha.internal.zzec v1_3 = v1_2.zzo(v3_0, this);
                } catch (com.google.android.recaptcha.internal.zzec v0_1) {
                    v0_2 = v8_1;
                    Object v8_2 = v0_1;
                }
                if (v1_3 == v0_0) {
                    return v0_0;
                } else {
                    v1_4 = v8_1;
                    p8 = v1_3;
                    com.google.android.recaptcha.internal.zzec.zzh(this.zzc, ((com.google.android.recaptcha.internal.zzsc) p8));
                    com.google.android.recaptcha.internal.zzdt v2_3 = com.google.android.recaptcha.internal.zzec.zzc(this.zzc);
                    long v3_1 = this.zzd;
                    this.zza = v1_4;
                    this.zzb = 2;
                    if (v2_3.zzn(((com.google.android.recaptcha.internal.zzsc) p8), v3_1, this) != v0_0) {
                        v0_2 = v1_4;
                        v0_2.zza();
                        com.google.android.recaptcha.internal.zzec.zzj(this.zzc, com.google.android.recaptcha.internal.zzcm.zzb());
                        return Boolean.valueOf(((d8.u) this.zze).A(h7.l.a));
                    }
                }
            } else {
                if (v1_0 == 1) {
                    v1_4 = ((com.google.android.recaptcha.internal.zzen) this.zza);
                    c4.b.e0(p8);
                } else {
                    v0_2 = ((com.google.android.recaptcha.internal.zzen) this.zza);
                    c4.b.e0(p8);
                    v0_2.zza();
                    com.google.android.recaptcha.internal.zzec.zzj(this.zzc, com.google.android.recaptcha.internal.zzcm.zzb());
                    return Boolean.valueOf(((d8.u) this.zze).A(h7.l.a));
                }
            }
        } catch (Object v8_2) {
        } catch (Object v8_2) {
            v0_2 = v1_4;
        }
        com.google.android.recaptcha.internal.zzec.zzi(this.zzc, v8_2);
        v0_2.zzb(v8_2);
        throw v8_2;
    }
}
