package com.google.android.recaptcha.internal;
final class zzdg extends n7.i implements u7.p {
    Object zza;
    int zzb;
    final synthetic com.google.android.recaptcha.internal.zzdt zzc;
    final synthetic String zzd;
    final synthetic long zze;
    final synthetic com.google.android.recaptcha.internal.zzsp zzf;

    public zzdg(com.google.android.recaptcha.internal.zzdt p1, String p2, long p3, com.google.android.recaptcha.internal.zzsp p5, l7.c p6)
    {
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p3;
        this.zzf = p5;
        super(2, p6);
        return;
    }

    public final l7.c create(Object p8, l7.c p9)
    {
        return new com.google.android.recaptcha.internal.zzdg(this.zzc, this.zzd, this.zze, this.zzf, p9);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzdg) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p9)
    {
        com.google.android.recaptcha.internal.zzbd v0_2;
        com.google.android.recaptcha.internal.zzbd v0_0 = m7.a.a;
        try {
            if (this.zzb == 0) {
                c4.b.e0(p9);
                com.google.android.recaptcha.internal.zzsr v9_1 = com.google.android.recaptcha.internal.zzdt.zzf(this.zzc, this.zzd).zzf(28);
                try {
                    com.google.android.recaptcha.internal.zzdt v1_1 = this.zze;
                    com.google.android.recaptcha.internal.zzbb v3_1 = new com.google.android.recaptcha.internal.zzdf(this.zzc, this.zzf, v9_1, 0);
                    this.zza = v9_1;
                    this.zzb = 1;
                    com.google.android.recaptcha.internal.zzdt v1_2 = d8.f0.y(v1_1, v3_1, this);
                } catch (com.google.android.recaptcha.internal.zzbd v0_4) {
                    v0_2 = v9_1;
                    com.google.android.recaptcha.internal.zzsr v9_4 = v0_4;
                } catch (com.google.android.recaptcha.internal.zzbd v0_3) {
                    v0_2 = v9_1;
                    com.google.android.recaptcha.internal.zzsr v9_3 = v0_3;
                    com.google.android.recaptcha.internal.zzsr v9_8 = com.google.android.recaptcha.internal.zzdt.zzb(this.zzc, v9_3, v9_3);
                    v0_2.zzb(v9_8);
                    throw v9_8;
                } catch (com.google.android.recaptcha.internal.zzbd v0_1) {
                    v0_2 = v9_1;
                    com.google.android.recaptcha.internal.zzsr v9_2 = v0_1;
                    com.google.android.recaptcha.internal.zzsr v9_7 = com.google.android.recaptcha.internal.zzdt.zzb(this.zzc, v9_2, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzZ, v9_2.getMessage()));
                    v0_2.zzb(v9_7);
                    throw v9_7;
                }
                if (v1_2 == v0_0) {
                    return v0_0;
                } else {
                    v0_2 = v9_1;
                    p9 = v1_2;
                    return ((com.google.android.recaptcha.internal.zzsr) p9);
                }
            } else {
                v0_2 = ((com.google.android.recaptcha.internal.zzen) this.zza);
                c4.b.e0(p9);
                return ((com.google.android.recaptcha.internal.zzsr) p9);
            }
        } catch (com.google.android.recaptcha.internal.zzsr v9_4) {
        } catch (com.google.android.recaptcha.internal.zzsr v9_3) {
        } catch (com.google.android.recaptcha.internal.zzsr v9_2) {
        }
        com.google.android.recaptcha.internal.zzsr v9_10 = com.google.android.recaptcha.internal.zzdt.zzb(this.zzc, v9_4, new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzb, v9_4.getMessage()));
        v0_2.zzb(v9_10);
        throw v9_10;
    }
}
