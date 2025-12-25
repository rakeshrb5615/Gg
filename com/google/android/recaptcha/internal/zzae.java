package com.google.android.recaptcha.internal;
public final class zzae implements com.google.android.recaptcha.internal.zzy {
    private final com.google.android.recaptcha.internal.zzek zza;
    private final android.content.Context zzb;
    private final com.google.android.recaptcha.internal.zzan zzc;
    private boolean zzd;
    private String zze;
    private final com.google.android.recaptcha.internal.zzbs zzf;

    public zzae(com.google.android.recaptcha.internal.zzek p1, android.content.Context p2, d8.c0 p3, com.google.android.recaptcha.internal.zzan p4, com.google.android.recaptcha.internal.zzbs p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p4;
        this.zzf = p5;
        this.zzd = 1;
        this.zze = "";
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzan zzg(com.google.android.recaptcha.internal.zzae p0)
    {
        return p0.zzc;
    }

    public static final synthetic String zzh(com.google.android.recaptcha.internal.zzae p0)
    {
        return p0.zze;
    }

    private static final String zzi(com.google.android.recaptcha.internal.zzle p3)
    {
        com.google.android.recaptcha.internal.zzkh v0_0 = com.google.android.recaptcha.internal.zzkh.zzg();
        String v3_6 = p3.zzl();
        String v3_2 = com.google.android.recaptcha.internal.zzjz.zza().zza(v0_0.zzi(v3_6, 0, v3_6.length), java.nio.charset.StandardCharsets.UTF_8).zzd();
        String v3_3 = com.google.android.recaptcha.internal.zzle.zzk(v3_2, 0, v3_2.length);
        com.google.android.recaptcha.internal.zzkh v0_2 = com.google.android.recaptcha.internal.zzkh.zzh();
        String v3_4 = v3_3.zzl();
        return v0_2.zzi(v3_4, 0, v3_4.length);
    }

    public final int zza()
    {
        return 2;
    }

    public final com.google.android.recaptcha.internal.zzek zzb()
    {
        return this.zza;
    }

    public final Object zzc(String p3, l7.c p4)
    {
        return d8.f0.e(new com.google.android.recaptcha.internal.zzac(this, p3, 0), p4);
    }

    public final Object zzd(com.google.android.recaptcha.internal.zzse p12, l7.c p13)
    {
        com.google.android.recaptcha.internal.zzbb v0_2;
        if (!(p13 instanceof com.google.android.recaptcha.internal.zzad)) {
            v0_2 = new com.google.android.recaptcha.internal.zzad(this, p13);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzad) p13);
            com.google.android.recaptcha.internal.zzba v1_2 = ((com.google.android.recaptcha.internal.zzad) p13).zzd;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzad) p13).zzd = (v1_2 - -2147483648);
            }
        }
        Object v12_2;
        com.google.android.recaptcha.internal.zzae v2_7;
        Object v13_1 = v0_2.zzb;
        com.google.android.recaptcha.internal.zzba v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzae v2_0 = v0_2.zzd;
        h7.l v3_0 = h7.l.a;
        if (v2_0 == null) {
            c4.b.e0(v13_1);
            Object v13_2 = com.google.android.recaptcha.internal.zzz.zzc(this);
            if ((this.zzf.zza(this.zzb) == 3) && (p12.zzf() != 0)) {
                this.zze = com.google.android.recaptcha.internal.zzae.zzi(p12.zzg());
                com.google.android.recaptcha.internal.zzae v2_6 = this.zzc;
                long v7_3 = p12.zzf();
                v0_2.zza = this;
                v0_2.zze = v13_2;
                v0_2.zzd = 1;
                if (v2_6.zzd(v7_3, v0_2) == v1_1) {
                    return v1_1;
                } else {
                    v2_7 = this;
                    v12_2 = v13_2;
                    Object v13_3 = v2_7.zzc;
                    v0_2.zza = v12_2;
                    v0_2.zze = 0;
                    v0_2.zzd = 2;
                    if (v13_3.zze(v0_2) == v1_1) {
                        return v1_1;
                    }
                }
            } else {
                this.zzd = 0;
                v13_2.zzb(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzab, 0));
                return v3_0;
            }
        } else {
            if (v2_0 == 1) {
                v12_2 = v0_2.zze;
                v2_7 = ((com.google.android.recaptcha.internal.zzae) v0_2.zza);
                c4.b.e0(v13_1);
            } else {
                if (v2_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v12_2 = ((com.google.android.recaptcha.internal.zzen) v0_2.zza);
                    c4.b.e0(v13_1);
                }
            }
        }
        v12_2.zza();
        return v3_0;
    }

    public final void zze(com.google.android.recaptcha.internal.zzsr p1)
    {
        this.zze = com.google.android.recaptcha.internal.zzae.zzi(p1.zzf());
        return;
    }

    public final boolean zzf()
    {
        return this.zzd;
    }
}
