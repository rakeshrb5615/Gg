package com.google.android.recaptcha.internal;
public final class zzfj {
    private final h7.d zza;

    public zzfj()
    {
        this.zza = a.a.F(com.google.android.recaptcha.internal.zzfi.zza);
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzex zza(com.google.android.recaptcha.internal.zzfj p0)
    {
        return ((com.google.android.recaptcha.internal.zzex) p0.zza.getValue());
    }

    public static Object zzc(com.google.android.recaptcha.internal.zzfj p4, com.google.android.recaptcha.internal.zzbr p5, com.google.android.recaptcha.internal.zzsp p6, l7.c p7)
    {
        com.google.android.recaptcha.internal.zzfg v0_2;
        if (!(p7 instanceof com.google.android.recaptcha.internal.zzfg)) {
            v0_2 = new com.google.android.recaptcha.internal.zzfg(p4, p7);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzfg) p7);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzfg) p7).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzfg) p7).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzfh v7_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        if (v2_0 == 0) {
            c4.b.e0(v7_1);
            com.google.android.recaptcha.internal.zzfh v7_3 = new com.google.android.recaptcha.internal.zzfh(p4, p5, p6, 0);
            v0_2.zzc = 1;
            IllegalStateException v4_1 = d8.f0.e(v7_3, v0_2);
            if (v4_1 != v1_1) {
                return v4_1;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(v7_1);
                return v7_1;
            }
        }
    }

    public final Object zzb(com.google.android.recaptcha.internal.zzbr p1, com.google.android.recaptcha.internal.zzsp p2, l7.c p3)
    {
        return com.google.android.recaptcha.internal.zzfj.zzc(this, p1, p2, p3);
    }
}
