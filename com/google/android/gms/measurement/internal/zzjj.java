package com.google.android.gms.measurement.internal;
public final enum class zzjj extends java.lang.Enum {
    public static final enum com.google.android.gms.measurement.internal.zzjj zza;
    public static final enum com.google.android.gms.measurement.internal.zzjj zzb;
    private static final synthetic com.google.android.gms.measurement.internal.zzjj[] zzd;
    private final com.google.android.gms.measurement.internal.zzjk[] zzc;

    static zzjj()
    {
        com.google.android.gms.measurement.internal.zzjj[] v0_2 = new com.google.android.gms.measurement.internal.zzjj("STORAGE", 0, new com.google.android.gms.measurement.internal.zzjk[] {com.google.android.gms.measurement.internal.zzjk.zza, com.google.android.gms.measurement.internal.zzjk.zzb}));
        com.google.android.gms.measurement.internal.zzjj.zza = v0_2;
        com.google.android.gms.measurement.internal.zzjj v1_1 = new com.google.android.gms.measurement.internal.zzjj("DMA", 1, new com.google.android.gms.measurement.internal.zzjk[] {com.google.android.gms.measurement.internal.zzjk.zzc}));
        com.google.android.gms.measurement.internal.zzjj.zzb = v1_1;
        com.google.android.gms.measurement.internal.zzjj.zzd = new com.google.android.gms.measurement.internal.zzjj[] {v0_2, v1_1});
        return;
    }

    private varargs zzjj(String p1, int p2, com.google.android.gms.measurement.internal.zzjk[] p3)
    {
        super(p1, p2);
        super.zzc = p3;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzjj[] values()
    {
        return ((com.google.android.gms.measurement.internal.zzjj[]) com.google.android.gms.measurement.internal.zzjj.zzd.clone());
    }

    public final com.google.android.gms.measurement.internal.zzjk[] zza()
    {
        return this.zzc;
    }

    public final synthetic com.google.android.gms.measurement.internal.zzjk[] zzb()
    {
        return this.zzc;
    }
}
