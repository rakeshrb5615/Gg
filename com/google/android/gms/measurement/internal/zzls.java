package com.google.android.gms.measurement.internal;
public final enum class zzls extends java.lang.Enum {
    public static final enum com.google.android.gms.measurement.internal.zzls zza;
    public static final enum com.google.android.gms.measurement.internal.zzls zzb;
    public static final enum com.google.android.gms.measurement.internal.zzls zzc;
    public static final enum com.google.android.gms.measurement.internal.zzls zzd;
    public static final enum com.google.android.gms.measurement.internal.zzls zze;
    public static final enum com.google.android.gms.measurement.internal.zzls zzf;
    private static final synthetic com.google.android.gms.measurement.internal.zzls[] zzh;
    private final int zzg;

    static zzls()
    {
        com.google.android.gms.measurement.internal.zzls[] v0_1 = new com.google.android.gms.measurement.internal.zzls("GOOGLE_ANALYTICS", 0, 0);
        com.google.android.gms.measurement.internal.zzls.zza = v0_1;
        com.google.android.gms.measurement.internal.zzls.zzb = new com.google.android.gms.measurement.internal.zzls("GOOGLE_SIGNAL", 1, 1);
        com.google.android.gms.measurement.internal.zzls.zzc = new com.google.android.gms.measurement.internal.zzls("SGTM", 2, 2);
        com.google.android.gms.measurement.internal.zzls.zzd = new com.google.android.gms.measurement.internal.zzls("SGTM_CLIENT", 3, 3);
        com.google.android.gms.measurement.internal.zzls.zze = new com.google.android.gms.measurement.internal.zzls("GOOGLE_SIGNAL_PENDING", 4, 4);
        com.google.android.gms.measurement.internal.zzls v5_3 = new com.google.android.gms.measurement.internal.zzls("UNKNOWN", 5, 99);
        com.google.android.gms.measurement.internal.zzls.zzf = v5_3;
        com.google.android.gms.measurement.internal.zzls.zzh = new com.google.android.gms.measurement.internal.zzls[] {v0_1, v5_3});
        return;
    }

    private zzls(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzg = p3;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzls[] values()
    {
        return ((com.google.android.gms.measurement.internal.zzls[]) com.google.android.gms.measurement.internal.zzls.zzh.clone());
    }

    public static com.google.android.gms.measurement.internal.zzls zzb(int p5)
    {
        com.google.android.gms.measurement.internal.zzls[] v0 = com.google.android.gms.measurement.internal.zzls.values();
        int v2 = 0;
        while (v2 < v0.length) {
            com.google.android.gms.measurement.internal.zzls v3 = v0[v2];
            if (v3.zzg != p5) {
                v2++;
            } else {
                return v3;
            }
        }
        return com.google.android.gms.measurement.internal.zzls.zzf;
    }

    public final int zza()
    {
        return this.zzg;
    }
}
