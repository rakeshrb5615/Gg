package com.google.android.recaptcha.internal;
public final class zzft implements com.google.android.recaptcha.internal.zzfo {
    private final d8.c0 zza;
    private final com.google.android.recaptcha.internal.zzgf zzb;
    private final com.google.android.recaptcha.internal.zzhx zzc;
    private final java.util.Map zzd;

    public zzft(d8.c0 p1, com.google.android.recaptcha.internal.zzgf p2, com.google.android.recaptcha.internal.zzhx p3, java.util.Map p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzhx zzb(com.google.android.recaptcha.internal.zzft p0)
    {
        return p0.zzc;
    }

    public static final synthetic Object zzc(com.google.android.recaptcha.internal.zzft p0, java.util.List p1, com.google.android.recaptcha.internal.zzgd p2, l7.c p3)
    {
        return p0.zzg(p1, p2, p3);
    }

    public static final synthetic Object zzd(com.google.android.recaptcha.internal.zzft p0, Exception p1, com.google.android.recaptcha.internal.zzgd p2, l7.c p3)
    {
        return p0.zzh(p1, p2, p3);
    }

    public static final varargs synthetic void zze(com.google.android.recaptcha.internal.zzft p1, String p2, String[] p3)
    {
        p1.zzb.zzd().zzb(p2, ((String[]) java.util.Arrays.copyOf(p3, 2)));
        return;
    }

    public static final synthetic void zzf(com.google.android.recaptcha.internal.zzft p5, com.google.android.recaptcha.internal.zzuf p6, com.google.android.recaptcha.internal.zzgd p7)
    {
        long v0_0 = com.google.android.recaptcha.internal.zzjh.zzb();
        int v1 = p7.zza();
        IllegalArgumentException v5_2 = ((com.google.android.recaptcha.internal.zzgx) p5.zzd.get(Integer.valueOf(p6.zzf())));
        if (v5_2 == null) {
            throw new com.google.android.recaptcha.internal.zzce(5, 2, 0);
        } else {
            int v4_1 = new com.google.android.recaptcha.internal.zzue[0];
            com.google.android.recaptcha.internal.zzue[] v3_2 = ((com.google.android.recaptcha.internal.zzue[]) p6.zzj().toArray(v4_1));
            v5_2.zza(p6.zzg(), p7, ((com.google.android.recaptcha.internal.zzue[]) java.util.Arrays.copyOf(v3_2, v3_2.length)));
            if (v1 == p7.zza()) {
                p7.zzg((p7.zza() + 1));
            }
            v0_0.zzf();
            long v0_2 = v0_0.zza(java.util.concurrent.TimeUnit.MICROSECONDS);
            IllegalArgumentException v5_9 = p6.zzk();
            if (v5_9 == 1) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            } else {
                com.google.android.recaptcha.internal.zzbk.zza((v5_9 - 2), v0_2);
                return;
            }
        }
    }

    private final Object zzg(java.util.List p3, com.google.android.recaptcha.internal.zzgd p4, l7.c p5)
    {
        h7.l v3_1 = d8.f0.e(new com.google.android.recaptcha.internal.zzfq(p4, p3, this, 0), p5);
        if (v3_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v3_1;
        }
    }

    private final Object zzh(Exception p3, com.google.android.recaptcha.internal.zzgd p4, l7.c p5)
    {
        h7.l v3_1 = d8.f0.e(new com.google.android.recaptcha.internal.zzfr(p3, p4, this, 0), p5);
        if (v3_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v3_1;
        }
    }

    public final void zza(String p4)
    {
        d8.f0.p(this.zza, new com.google.android.recaptcha.internal.zzfs(new com.google.android.recaptcha.internal.zzgd(this.zzb), this, p4, 0));
        return;
    }
}
