package com.google.android.recaptcha.internal;
public final class zzbq {
    public static final com.google.android.recaptcha.internal.zzbq zza;

    static zzbq()
    {
        com.google.android.recaptcha.internal.zzbq.zza = new com.google.android.recaptcha.internal.zzbq();
        return;
    }

    private zzbq()
    {
        return;
    }

    public final Object zza(u7.l p18, long p19, long p21, double p23, u7.l p25, l7.c p26)
    {
        String v1_1;
        if (!(p26 instanceof com.google.android.recaptcha.internal.zzbp)) {
            v1_1 = new com.google.android.recaptcha.internal.zzbp(this, p26);
        } else {
            v1_1 = ((com.google.android.recaptcha.internal.zzbp) p26);
            com.google.android.recaptcha.internal.zzbq v2_2 = ((com.google.android.recaptcha.internal.zzbp) p26).zzh;
            if ((v2_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzbp) p26).zzh = (v2_2 - -2147483648);
            }
        }
        u7.l v13_0;
        long v7_0;
        u7.l v4_1;
        long v11_0;
        String v1_2;
        double v9_0;
        Object v0_1 = v1_1.zzf;
        m7.a v3_0 = m7.a.a;
        u7.l v4_0 = v1_1.zzh;
        if (v4_0 == null) {
            c4.b.e0(v0_1);
            v7_0 = p19;
            v9_0 = p21;
            v11_0 = p23;
            v4_1 = p25;
            v13_0 = v1_1;
            v1_2 = p18;
            try {
                v13_0.zza = v1_2;
                v13_0.zzb = v4_1;
                v13_0.zzc = v9_0;
                v13_0.zze = v11_0;
                v13_0.zzd = v7_0;
                v13_0.zzh = 1;
                Object v0_5 = v4_1.invoke(v13_0);
            } catch (Object v0_2) {
                u7.l v13_2 = v1_2;
                v1_1 = v13_0;
                long v11_1 = v9_0;
                double v9_1 = v11_0;
                if (!((Boolean) v13_2.invoke(v0_2)).booleanValue()) {
                    throw v0_2;
                } else {
                    v7_0 = ((long) (((double) v7_0) * v9_1));
                    if (v7_0 > v11_1) {
                        v7_0 = v11_1;
                    }
                    v1_1.zza = v13_2;
                    v1_1.zzb = v4_1;
                    v1_1.zzc = v11_1;
                    v1_1.zze = v9_1;
                    v1_1.zzd = v7_0;
                    v1_1.zzh = 2;
                    if (d8.f0.f(v7_0, v1_1) != v3_0) {
                        v13_0 = v1_1;
                        v1_2 = v13_2;
                        v11_0 = v9_1;
                        v9_0 = v11_1;
                    }
                }
            }
            if (v0_5 != v3_0) {
                return v0_5;
            }
        } else {
            if (v4_0 == 1) {
                v7_0 = v1_1.zzd;
                v9_1 = v1_1.zze;
                v11_1 = v1_1.zzc;
                v4_1 = ((u7.l) v1_1.zzb);
                v13_2 = ((u7.l) v1_1.zza);
                try {
                    c4.b.e0(v0_1);
                    return v0_1;
                } catch (Object v0_2) {
                }
            } else {
                if (v4_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v7_0 = v1_1.zzd;
                    v9_1 = v1_1.zze;
                    v11_1 = v1_1.zzc;
                    v4_1 = ((u7.l) v1_1.zzb);
                    v13_2 = ((u7.l) v1_1.zza);
                    c4.b.e0(v0_1);
                }
            }
        }
        return v3_0;
    }
}
