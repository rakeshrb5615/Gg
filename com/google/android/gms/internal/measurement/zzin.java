package com.google.android.gms.internal.measurement;
public final enum class zzin extends java.lang.Enum implements com.google.android.gms.internal.measurement.zzmj {
    public static final enum com.google.android.gms.internal.measurement.zzin zza;
    public static final enum com.google.android.gms.internal.measurement.zzin zzb;
    public static final enum com.google.android.gms.internal.measurement.zzin zzc;
    public static final enum com.google.android.gms.internal.measurement.zzin zzd;
    public static final enum com.google.android.gms.internal.measurement.zzin zze;
    public static final enum com.google.android.gms.internal.measurement.zzin zzf;
    public static final enum com.google.android.gms.internal.measurement.zzin zzg;
    public static final enum com.google.android.gms.internal.measurement.zzin zzh;
    public static final enum com.google.android.gms.internal.measurement.zzin zzi;
    public static final enum com.google.android.gms.internal.measurement.zzin zzj;
    public static final enum com.google.android.gms.internal.measurement.zzin zzk;
    public static final enum com.google.android.gms.internal.measurement.zzin zzl;
    private static final synthetic com.google.android.gms.internal.measurement.zzin[] zzn;
    private final int zzm;

    static zzin()
    {
        com.google.android.gms.internal.measurement.zzin[] v0_1 = new com.google.android.gms.internal.measurement.zzin("CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN", 0, 0);
        com.google.android.gms.internal.measurement.zzin.zza = v0_1;
        com.google.android.gms.internal.measurement.zzin.zzb = new com.google.android.gms.internal.measurement.zzin("CLIENT_UPLOAD_ELIGIBLE", 1, 1);
        com.google.android.gms.internal.measurement.zzin.zzc = new com.google.android.gms.internal.measurement.zzin("MEASUREMENT_SERVICE_NOT_ENABLED", 2, 2);
        com.google.android.gms.internal.measurement.zzin.zzd = new com.google.android.gms.internal.measurement.zzin("ANDROID_TOO_OLD", 3, 3);
        com.google.android.gms.internal.measurement.zzin.zze = new com.google.android.gms.internal.measurement.zzin("NON_PLAY_MODE", 4, 4);
        com.google.android.gms.internal.measurement.zzin.zzf = new com.google.android.gms.internal.measurement.zzin("SDK_TOO_OLD", 5, 5);
        com.google.android.gms.internal.measurement.zzin.zzg = new com.google.android.gms.internal.measurement.zzin("MISSING_JOB_SCHEDULER", 6, 6);
        com.google.android.gms.internal.measurement.zzin.zzh = new com.google.android.gms.internal.measurement.zzin("NOT_ENABLED_IN_MANIFEST", 7, 7);
        com.google.android.gms.internal.measurement.zzin.zzi = new com.google.android.gms.internal.measurement.zzin("CLIENT_FLAG_OFF", 8, 8);
        com.google.android.gms.internal.measurement.zzin.zzj = new com.google.android.gms.internal.measurement.zzin("SERVICE_FLAG_OFF", 9, 20);
        com.google.android.gms.internal.measurement.zzin.zzk = new com.google.android.gms.internal.measurement.zzin("PINNED_TO_SERVICE_UPLOAD", 10, 21);
        com.google.android.gms.internal.measurement.zzin v11_3 = new com.google.android.gms.internal.measurement.zzin("MISSING_SGTM_SERVER_URL", 11, 22);
        com.google.android.gms.internal.measurement.zzin.zzl = v11_3;
        com.google.android.gms.internal.measurement.zzin.zzn = new com.google.android.gms.internal.measurement.zzin[] {v0_1, v11_3});
        return;
    }

    private zzin(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzm = p3;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzin[] values()
    {
        return ((com.google.android.gms.internal.measurement.zzin[]) com.google.android.gms.internal.measurement.zzin.zzn.clone());
    }

    public static com.google.android.gms.internal.measurement.zzin zzb(int p0)
    {
        switch (p0) {
            case 0:
                return com.google.android.gms.internal.measurement.zzin.zza;
            case 1:
                return com.google.android.gms.internal.measurement.zzin.zzb;
            case 2:
                return com.google.android.gms.internal.measurement.zzin.zzc;
            case 3:
                return com.google.android.gms.internal.measurement.zzin.zzd;
            case 4:
                return com.google.android.gms.internal.measurement.zzin.zze;
            case 5:
                return com.google.android.gms.internal.measurement.zzin.zzf;
            case 6:
                return com.google.android.gms.internal.measurement.zzin.zzg;
            case 7:
                return com.google.android.gms.internal.measurement.zzin.zzh;
            case 8:
                return com.google.android.gms.internal.measurement.zzin.zzi;
            default:
                switch (p0) {
                    case 20:
                        return com.google.android.gms.internal.measurement.zzin.zzj;
                    case 21:
                        return com.google.android.gms.internal.measurement.zzin.zzk;
                    case 22:
                        return com.google.android.gms.internal.measurement.zzin.zzl;
                    default:
                        return 0;
                }
        }
    }

    public final String toString()
    {
        return Integer.toString(this.zzm);
    }

    public final int zza()
    {
        return this.zzm;
    }
}
