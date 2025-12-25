package com.google.android.gms.internal.measurement;
public final enum class zzkp extends java.lang.Enum implements com.google.android.gms.internal.measurement.zzmj {
    public static final enum com.google.android.gms.internal.measurement.zzkp zza;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzb;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzc;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzd;
    public static final enum com.google.android.gms.internal.measurement.zzkp zze;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzf;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzg;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzh;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzi;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzj;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzk;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzl;
    public static final enum com.google.android.gms.internal.measurement.zzkp zzm;
    private static final synthetic com.google.android.gms.internal.measurement.zzkp[] zzo;
    private final int zzn;

    static zzkp()
    {
        com.google.android.gms.internal.measurement.zzkp[] v0_1 = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_UNKNOWN", 0, 0);
        com.google.android.gms.internal.measurement.zzkp.zza = v0_1;
        com.google.android.gms.internal.measurement.zzkp.zzb = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE", 1, 1);
        com.google.android.gms.internal.measurement.zzkp.zzc = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_SELECT_BASIC_ADS", 2, 2);
        com.google.android.gms.internal.measurement.zzkp.zzd = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE", 3, 3);
        com.google.android.gms.internal.measurement.zzkp.zze = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS", 4, 4);
        com.google.android.gms.internal.measurement.zzkp.zzf = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE", 5, 5);
        com.google.android.gms.internal.measurement.zzkp.zzg = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT", 6, 6);
        com.google.android.gms.internal.measurement.zzkp.zzh = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE", 7, 7);
        com.google.android.gms.internal.measurement.zzkp.zzi = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE", 8, 8);
        com.google.android.gms.internal.measurement.zzkp.zzj = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS", 9, 9);
        com.google.android.gms.internal.measurement.zzkp.zzk = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS", 10, 10);
        com.google.android.gms.internal.measurement.zzkp.zzl = new com.google.android.gms.internal.measurement.zzkp("IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT", 11, 11);
        com.google.android.gms.internal.measurement.zzkp v12_3 = new com.google.android.gms.internal.measurement.zzkp("UNRECOGNIZED", 12, -1);
        com.google.android.gms.internal.measurement.zzkp.zzm = v12_3;
        com.google.android.gms.internal.measurement.zzkp.zzo = new com.google.android.gms.internal.measurement.zzkp[] {v0_1, v12_3});
        return;
    }

    private zzkp(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzn = p3;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzkp[] values()
    {
        return ((com.google.android.gms.internal.measurement.zzkp[]) com.google.android.gms.internal.measurement.zzkp.zzo.clone());
    }

    public final String toString()
    {
        return Integer.toString(this.zzn);
    }

    public final int zza()
    {
        if (this == com.google.android.gms.internal.measurement.zzkp.zzm) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzn;
        }
    }
}
