package com.google.android.gms.measurement.internal;
final enum class zzoe extends java.lang.Enum {
    public static final enum com.google.android.gms.measurement.internal.zzoe zza;
    public static final enum com.google.android.gms.measurement.internal.zzoe zzb;
    public static final enum com.google.android.gms.measurement.internal.zzoe zzc;
    public static final enum com.google.android.gms.measurement.internal.zzoe zzd;
    private static final synthetic com.google.android.gms.measurement.internal.zzoe[] zze;

    static zzoe()
    {
        com.google.android.gms.measurement.internal.zzoe[] v0_2 = new com.google.android.gms.measurement.internal.zzoe("CONSENT", 0);
        com.google.android.gms.measurement.internal.zzoe.zza = v0_2;
        com.google.android.gms.measurement.internal.zzoe v1_2 = new com.google.android.gms.measurement.internal.zzoe("LEGITIMATE_INTEREST", 1);
        com.google.android.gms.measurement.internal.zzoe.zzb = v1_2;
        com.google.android.gms.measurement.internal.zzoe v2_1 = new com.google.android.gms.measurement.internal.zzoe("FLEXIBLE_CONSENT", 2);
        com.google.android.gms.measurement.internal.zzoe.zzc = v2_1;
        com.google.android.gms.measurement.internal.zzoe v3_2 = new com.google.android.gms.measurement.internal.zzoe("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        com.google.android.gms.measurement.internal.zzoe.zzd = v3_2;
        com.google.android.gms.measurement.internal.zzoe.zze = new com.google.android.gms.measurement.internal.zzoe[] {v0_2, v1_2, v2_1, v3_2});
        return;
    }

    private zzoe(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static com.google.android.gms.measurement.internal.zzoe[] values()
    {
        return ((com.google.android.gms.measurement.internal.zzoe[]) com.google.android.gms.measurement.internal.zzoe.zze.clone());
    }
}
