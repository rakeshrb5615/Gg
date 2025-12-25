package com.google.android.gms.measurement.internal;
final enum class zzam extends java.lang.Enum {
    public static final enum com.google.android.gms.measurement.internal.zzam zza;
    public static final enum com.google.android.gms.measurement.internal.zzam zzb;
    public static final enum com.google.android.gms.measurement.internal.zzam zzc;
    public static final enum com.google.android.gms.measurement.internal.zzam zzd;
    public static final enum com.google.android.gms.measurement.internal.zzam zze;
    public static final enum com.google.android.gms.measurement.internal.zzam zzf;
    public static final enum com.google.android.gms.measurement.internal.zzam zzg;
    public static final enum com.google.android.gms.measurement.internal.zzam zzh;
    public static final enum com.google.android.gms.measurement.internal.zzam zzi;
    public static final enum com.google.android.gms.measurement.internal.zzam zzj;
    private static final synthetic com.google.android.gms.measurement.internal.zzam[] zzl;
    private final char zzk;

    static zzam()
    {
        com.google.android.gms.measurement.internal.zzam[] v0_1 = new com.google.android.gms.measurement.internal.zzam("UNSET", 0, 48);
        com.google.android.gms.measurement.internal.zzam.zza = v0_1;
        com.google.android.gms.measurement.internal.zzam.zzb = new com.google.android.gms.measurement.internal.zzam("REMOTE_DEFAULT", 1, 49);
        com.google.android.gms.measurement.internal.zzam.zzc = new com.google.android.gms.measurement.internal.zzam("REMOTE_DELEGATION", 2, 50);
        com.google.android.gms.measurement.internal.zzam.zzd = new com.google.android.gms.measurement.internal.zzam("MANIFEST", 3, 51);
        com.google.android.gms.measurement.internal.zzam.zze = new com.google.android.gms.measurement.internal.zzam("INITIALIZATION", 4, 52);
        com.google.android.gms.measurement.internal.zzam.zzf = new com.google.android.gms.measurement.internal.zzam("API", 5, 53);
        com.google.android.gms.measurement.internal.zzam.zzg = new com.google.android.gms.measurement.internal.zzam("CHILD_ACCOUNT", 6, 54);
        com.google.android.gms.measurement.internal.zzam.zzh = new com.google.android.gms.measurement.internal.zzam("TCF", 7, 55);
        com.google.android.gms.measurement.internal.zzam.zzi = new com.google.android.gms.measurement.internal.zzam("REMOTE_ENFORCED_DEFAULT", 8, 56);
        com.google.android.gms.measurement.internal.zzam v9_4 = new com.google.android.gms.measurement.internal.zzam("FAILSAFE", 9, 57);
        com.google.android.gms.measurement.internal.zzam.zzj = v9_4;
        com.google.android.gms.measurement.internal.zzam.zzl = new com.google.android.gms.measurement.internal.zzam[] {v0_1, v9_4});
        return;
    }

    private zzam(String p1, int p2, char p3)
    {
        super(p1, p2);
        super.zzk = p3;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzam[] values()
    {
        return ((com.google.android.gms.measurement.internal.zzam[]) com.google.android.gms.measurement.internal.zzam.zzl.clone());
    }

    public static com.google.android.gms.measurement.internal.zzam zza(char p5)
    {
        com.google.android.gms.measurement.internal.zzam[] v0 = com.google.android.gms.measurement.internal.zzam.values();
        int v2 = 0;
        while (v2 < v0.length) {
            com.google.android.gms.measurement.internal.zzam v3 = v0[v2];
            if (v3.zzk != p5) {
                v2++;
            } else {
                return v3;
            }
        }
        return com.google.android.gms.measurement.internal.zzam.zza;
    }

    public final synthetic char zzb()
    {
        return this.zzk;
    }
}
