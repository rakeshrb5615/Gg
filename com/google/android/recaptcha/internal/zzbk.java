package com.google.android.recaptcha.internal;
public final class zzbk {
    public static final synthetic int zza;
    private static final java.util.concurrent.ConcurrentHashMap zzb;

    static zzbk()
    {
        com.google.android.recaptcha.internal.zzbk.zzb = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public static final void zza(int p4, long p5)
    {
        java.util.concurrent.ConcurrentHashMap v0 = com.google.android.recaptcha.internal.zzbk.zzb;
        Integer v4_1 = Integer.valueOf(p4);
        com.google.android.recaptcha.internal.zzbj v1_0 = v0.get(v4_1);
        if (v1_0 == null) {
            v1_0 = new com.google.android.recaptcha.internal.zzbj();
        }
        com.google.android.recaptcha.internal.zzbj v1_2 = ((com.google.android.recaptcha.internal.zzbj) v1_0);
        v1_2.zzg((v1_2.zzb() + 1));
        v1_2.zzf((v1_2.zzd() + p5));
        v1_2.zze(Math.max(p5, v1_2.zzc()));
        v0.put(v4_1, v1_2);
        return;
    }
}
