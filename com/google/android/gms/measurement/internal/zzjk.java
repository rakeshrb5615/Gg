package com.google.android.gms.measurement.internal;
public final enum class zzjk extends java.lang.Enum {
    public static final enum com.google.android.gms.measurement.internal.zzjk zza;
    public static final enum com.google.android.gms.measurement.internal.zzjk zzb;
    public static final enum com.google.android.gms.measurement.internal.zzjk zzc;
    public static final enum com.google.android.gms.measurement.internal.zzjk zzd;
    private static final synthetic com.google.android.gms.measurement.internal.zzjk[] zzf;
    public final String zze;

    static zzjk()
    {
        com.google.android.gms.measurement.internal.zzjk[] v0_2 = new com.google.android.gms.measurement.internal.zzjk("AD_STORAGE", 0, "ad_storage");
        com.google.android.gms.measurement.internal.zzjk.zza = v0_2;
        com.google.android.gms.measurement.internal.zzjk v1_1 = new com.google.android.gms.measurement.internal.zzjk("ANALYTICS_STORAGE", 1, "analytics_storage");
        com.google.android.gms.measurement.internal.zzjk.zzb = v1_1;
        com.google.android.gms.measurement.internal.zzjk v2_1 = new com.google.android.gms.measurement.internal.zzjk("AD_USER_DATA", 2, "ad_user_data");
        com.google.android.gms.measurement.internal.zzjk.zzc = v2_1;
        com.google.android.gms.measurement.internal.zzjk v3_2 = new com.google.android.gms.measurement.internal.zzjk("AD_PERSONALIZATION", 3, "ad_personalization");
        com.google.android.gms.measurement.internal.zzjk.zzd = v3_2;
        com.google.android.gms.measurement.internal.zzjk.zzf = new com.google.android.gms.measurement.internal.zzjk[] {v0_2, v1_1, v2_1, v3_2});
        return;
    }

    private zzjk(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zze = p3;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzjk[] values()
    {
        return ((com.google.android.gms.measurement.internal.zzjk[]) com.google.android.gms.measurement.internal.zzjk.zzf.clone());
    }
}
