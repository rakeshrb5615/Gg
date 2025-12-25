package com.google.android.recaptcha.internal;
public final class zzcb {
    private Object zza;
    private final m8.a zzb;

    public zzcb(Object p1)
    {
        this.zza = p1;
        this.zzb = m8.d.a();
        return;
    }

    public final Object zza(Object p5, l7.c p6)
    {
        Object v0_3;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzby)) {
            v0_3 = new com.google.android.recaptcha.internal.zzby(this, p6);
        } else {
            v0_3 = ((com.google.android.recaptcha.internal.zzby) p6);
            int v1_3 = ((com.google.android.recaptcha.internal.zzby) p6).zzd;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzby) p6).zzd = (v1_3 - -2147483648);
            }
        }
        Object v0_4;
        m8.c v6_3;
        m8.c v6_1 = v0_3.zzb;
        int v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzje v2_0 = v0_3.zzd;
        if (v2_0 == null) {
            c4.b.e0(v6_1);
            m8.c v6_2 = this.zzb;
            v0_3.zze = this;
            v0_3.zzf = ((com.google.android.recaptcha.internal.zzje) p5);
            v0_3.zza = v6_2;
            v0_3.zzd = 1;
            v6_3 = ((m8.c) v6_2);
            if (v6_3.d(v0_3) == v1_1) {
                return v1_1;
            } else {
                v0_4 = this;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                Throwable v5_4 = ((m8.a) v0_3.zza);
                int v1_2 = v0_3.zzf;
                v0_4 = v0_3.zze;
                c4.b.e0(v6_1);
                v6_3 = v5_4;
                p5 = v1_2;
            }
        }
        try {
            Throwable v5_6 = Boolean.valueOf(kotlin.jvm.internal.j.a(v0_4.zza, p5));
            m8.c v6_5 = ((m8.c) v6_3);
            v6_5.f(0);
            return v5_6;
        } catch (Throwable v5_7) {
            ((m8.c) v6_5).f(0);
            throw v5_7;
        }
    }

    public final Object zzb(Object[] p5, l7.c p6)
    {
        Object v0_3;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzbz)) {
            v0_3 = new com.google.android.recaptcha.internal.zzbz(this, p6);
        } else {
            v0_3 = ((com.google.android.recaptcha.internal.zzbz) p6);
            int v1_3 = ((com.google.android.recaptcha.internal.zzbz) p6).zzd;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzbz) p6).zzd = (v1_3 - -2147483648);
            }
        }
        Object v0_4;
        m8.c v6_3;
        m8.c v6_1 = v0_3.zzb;
        int v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzje[] v2_0 = v0_3.zzd;
        if (v2_0 == null) {
            c4.b.e0(v6_1);
            m8.c v6_2 = this.zzb;
            v0_3.zze = this;
            v0_3.zzf = ((com.google.android.recaptcha.internal.zzje[]) p5);
            v0_3.zza = v6_2;
            v0_3.zzd = 1;
            v6_3 = ((m8.c) v6_2);
            if (v6_3.d(v0_3) == v1_1) {
                return v1_1;
            } else {
                v0_4 = this;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                Throwable v5_4 = ((m8.a) v0_3.zza);
                int v1_2 = v0_3.zzf;
                v0_4 = v0_3.zze;
                c4.b.e0(v6_1);
                v6_3 = v5_4;
                p5 = v1_2;
            }
        }
        try {
            Throwable v5_6 = Boolean.valueOf(i7.h.W(p5, v0_4.zza));
            m8.c v6_5 = ((m8.c) v6_3);
            v6_5.f(0);
            return v5_6;
        } catch (Throwable v5_7) {
            ((m8.c) v6_5).f(0);
            throw v5_7;
        }
    }

    public final Object zzc(Object p5, l7.c p6)
    {
        com.google.android.recaptcha.internal.zzcb v0_3;
        if (!(p6 instanceof com.google.android.recaptcha.internal.zzca)) {
            v0_3 = new com.google.android.recaptcha.internal.zzca(this, p6);
        } else {
            v0_3 = ((com.google.android.recaptcha.internal.zzca) p6);
            int v1_3 = ((com.google.android.recaptcha.internal.zzca) p6).zzd;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzca) p6).zzd = (v1_3 - -2147483648);
            }
        }
        m8.c v6_3;
        com.google.android.recaptcha.internal.zzcb v0_4;
        m8.c v6_1 = v0_3.zzb;
        int v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzje v2_0 = v0_3.zzd;
        if (v2_0 == null) {
            c4.b.e0(v6_1);
            m8.c v6_2 = this.zzb;
            v0_3.zze = this;
            v0_3.zzf = ((com.google.android.recaptcha.internal.zzje) p5);
            v0_3.zza = v6_2;
            v0_3.zzd = 1;
            v6_3 = ((m8.c) v6_2);
            if (v6_3.d(v0_3) == v1_1) {
                return v1_1;
            } else {
                v0_4 = this;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                Throwable v5_4 = ((m8.a) v0_3.zza);
                int v1_2 = v0_3.zzf;
                v0_4 = v0_3.zze;
                c4.b.e0(v6_1);
                v6_3 = v5_4;
                p5 = v1_2;
            }
        }
        try {
            v0_4.zza = p5;
            m8.c v6_5 = ((m8.c) v6_3);
            v6_5.f(0);
            return h7.l.a;
        } catch (Throwable v5_6) {
            ((m8.c) v6_5).f(0);
            throw v5_6;
        }
    }
}
