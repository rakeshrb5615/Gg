package com.google.android.recaptcha.internal;
public final class zzff {
    private final h7.d zza;
    private final h7.d zzb;
    private final h7.d zzc;

    public zzff()
    {
        this.zza = a.a.F(com.google.android.recaptcha.internal.zzfc.zza);
        this.zzb = a.a.F(com.google.android.recaptcha.internal.zzfd.zza);
        this.zzc = a.a.F(com.google.android.recaptcha.internal.zzfe.zza);
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzey zza(com.google.android.recaptcha.internal.zzff p0)
    {
        return p0.zzg();
    }

    public static final synthetic com.google.android.recaptcha.internal.zzfk zzb(com.google.android.recaptcha.internal.zzff p0)
    {
        return ((com.google.android.recaptcha.internal.zzfk) p0.zza.getValue());
    }

    public static synthetic Object zze(com.google.android.recaptcha.internal.zzff p7, com.google.android.recaptcha.internal.zzsc p8, com.google.android.recaptcha.internal.zzek p9, l7.c p10)
    {
        try {
            com.google.android.recaptcha.internal.zzbd v10_0 = p8.zzl();
            com.google.android.recaptcha.internal.zzbb v0_0 = p8.zzM();
            com.google.android.recaptcha.internal.zzba v1_5 = p7.zzf();
            String v2_0 = 0;
        } catch (String v7_5) {
            if (!(v7_5 instanceof com.google.android.recaptcha.internal.zzbd)) {
                throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzL, v7_5.getMessage());
            } else {
                throw v7_5;
            }
            com.google.android.recaptcha.internal.zzen v9_1.zza();
            return b8.p.n0(p8.zzk(), "JAVASCRIPT_TAG", v2_0);
        }
        if ((v1_5 != null) && (v1_5.zzd(v0_0) == 1)) {
            com.google.android.recaptcha.internal.zzba v1_1 = p9.zzf(25);
            try {
                String v3_2 = p7.zzf().zza(v0_0);
            } catch (String v3_3) {
                v1_1.zzb(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzk, com.google.android.recaptcha.internal.zzba.zzR, v3_3.getMessage()));
                v1_1.zzb(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzk, com.google.android.recaptcha.internal.zzba.zzS, 0));
            }
            if (v3_2 == null) {
            } else {
                v1_1.zza();
                v2_0 = v3_2;
            }
        }
        if (v2_0 == null) {
            com.google.android.recaptcha.internal.zzba v1_2 = p7.zzf();
            if (v1_2 != null) {
                v1_2.zzb();
            }
            com.google.android.recaptcha.internal.zzba v1_4 = p9.zzf(23);
            v2_0 = p7.zzg().zzb(v10_0);
            v1_4.zza();
            v9_1 = p9.zzf(24);
            String v7_2 = p7.zzf();
            if (v7_2 != null) {
                v7_2.zzc(v0_0, v2_0);
            }
        }
        return b8.p.n0(p8.zzk(), "JAVASCRIPT_TAG", v2_0);
    }

    private final com.google.android.recaptcha.internal.zzaq zzf()
    {
        return ((com.google.android.recaptcha.internal.zzaq) this.zzb.getValue());
    }

    private final com.google.android.recaptcha.internal.zzey zzg()
    {
        return ((com.google.android.recaptcha.internal.zzey) this.zzc.getValue());
    }

    public final Object zzc(String p3, com.google.android.recaptcha.internal.zzto p4, l7.c p5)
    {
        return d8.f0.e(new com.google.android.recaptcha.internal.zzfb(this, p3, p4, 0), p5);
    }

    public final Object zzd(com.google.android.recaptcha.internal.zzsc p1, com.google.android.recaptcha.internal.zzek p2, l7.c p3)
    {
        return com.google.android.recaptcha.internal.zzff.zze(this, p1, p2, p3);
    }
}
