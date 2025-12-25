package com.google.android.gms.measurement.internal;
public final enum class zzlr extends java.lang.Enum {
    public static final enum com.google.android.gms.measurement.internal.zzlr zza;
    public static final enum com.google.android.gms.measurement.internal.zzlr zzb;
    public static final enum com.google.android.gms.measurement.internal.zzlr zzc;
    public static final enum com.google.android.gms.measurement.internal.zzlr zzd;
    private static final synthetic com.google.android.gms.measurement.internal.zzlr[] zzf;
    private final int zze;

    static zzlr()
    {
        com.google.android.gms.measurement.internal.zzlr[] v0_2 = new com.google.android.gms.measurement.internal.zzlr("UNKNOWN", 0, 0);
        com.google.android.gms.measurement.internal.zzlr.zza = v0_2;
        com.google.android.gms.measurement.internal.zzlr v1_2 = new com.google.android.gms.measurement.internal.zzlr("SUCCESS", 1, 1);
        com.google.android.gms.measurement.internal.zzlr.zzb = v1_2;
        com.google.android.gms.measurement.internal.zzlr v2_1 = new com.google.android.gms.measurement.internal.zzlr("FAILURE", 2, 2);
        com.google.android.gms.measurement.internal.zzlr.zzc = v2_1;
        com.google.android.gms.measurement.internal.zzlr v3_2 = new com.google.android.gms.measurement.internal.zzlr("BACKOFF", 3, 3);
        com.google.android.gms.measurement.internal.zzlr.zzd = v3_2;
        com.google.android.gms.measurement.internal.zzlr.zzf = new com.google.android.gms.measurement.internal.zzlr[] {v0_2, v1_2, v2_1, v3_2});
        return;
    }

    private zzlr(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zze = p3;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzlr[] values()
    {
        return ((com.google.android.gms.measurement.internal.zzlr[]) com.google.android.gms.measurement.internal.zzlr.zzf.clone());
    }

    public final int zza()
    {
        return this.zze;
    }
}
