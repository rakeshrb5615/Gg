package com.google.android.gms.internal.stats;
public final class zzh {
    private static final com.google.android.gms.internal.stats.zze zza;
    private static volatile com.google.android.gms.internal.stats.zze zzb;

    static zzh()
    {
        com.google.android.gms.internal.stats.zzg v0_1 = new com.google.android.gms.internal.stats.zzg(0);
        com.google.android.gms.internal.stats.zzh.zza = v0_1;
        com.google.android.gms.internal.stats.zzh.zzb = v0_1;
        return;
    }

    public static com.google.android.gms.internal.stats.zze zza()
    {
        return com.google.android.gms.internal.stats.zzh.zzb;
    }
}
