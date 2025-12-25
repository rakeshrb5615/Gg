package com.google.android.gms.measurement.internal;
public final enum class zzji extends java.lang.Enum {
    public static final enum com.google.android.gms.measurement.internal.zzji zza;
    public static final enum com.google.android.gms.measurement.internal.zzji zzb;
    public static final enum com.google.android.gms.measurement.internal.zzji zzc;
    public static final enum com.google.android.gms.measurement.internal.zzji zzd;
    private static final synthetic com.google.android.gms.measurement.internal.zzji[] zzf;
    private final String zze;

    static zzji()
    {
        com.google.android.gms.measurement.internal.zzji[] v0_2 = new com.google.android.gms.measurement.internal.zzji("UNINITIALIZED", 0, "uninitialized");
        com.google.android.gms.measurement.internal.zzji.zza = v0_2;
        com.google.android.gms.measurement.internal.zzji v1_1 = new com.google.android.gms.measurement.internal.zzji("POLICY", 1, "eu_consent_policy");
        com.google.android.gms.measurement.internal.zzji.zzb = v1_1;
        com.google.android.gms.measurement.internal.zzji v2_1 = new com.google.android.gms.measurement.internal.zzji("DENIED", 2, "denied");
        com.google.android.gms.measurement.internal.zzji.zzc = v2_1;
        com.google.android.gms.measurement.internal.zzji v3_2 = new com.google.android.gms.measurement.internal.zzji("GRANTED", 3, "granted");
        com.google.android.gms.measurement.internal.zzji.zzd = v3_2;
        com.google.android.gms.measurement.internal.zzji.zzf = new com.google.android.gms.measurement.internal.zzji[] {v0_2, v1_1, v2_1, v3_2});
        return;
    }

    private zzji(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zze = p3;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzji[] values()
    {
        return ((com.google.android.gms.measurement.internal.zzji[]) com.google.android.gms.measurement.internal.zzji.zzf.clone());
    }

    public final String toString()
    {
        return this.zze;
    }
}
