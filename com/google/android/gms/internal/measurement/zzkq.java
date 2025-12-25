package com.google.android.gms.internal.measurement;
public final enum class zzkq extends java.lang.Enum implements com.google.android.gms.internal.measurement.zzmj {
    public static final enum com.google.android.gms.internal.measurement.zzkq zza;
    public static final enum com.google.android.gms.internal.measurement.zzkq zzb;
    public static final enum com.google.android.gms.internal.measurement.zzkq zzc;
    public static final enum com.google.android.gms.internal.measurement.zzkq zzd;
    public static final enum com.google.android.gms.internal.measurement.zzkq zze;
    private static final synthetic com.google.android.gms.internal.measurement.zzkq[] zzg;
    private final int zzf;

    static zzkq()
    {
        com.google.android.gms.internal.measurement.zzkq[] v0_2 = new com.google.android.gms.internal.measurement.zzkq("PURPOSE_RESTRICTION_NOT_ALLOWED", 0, 0);
        com.google.android.gms.internal.measurement.zzkq.zza = v0_2;
        com.google.android.gms.internal.measurement.zzkq v1_2 = new com.google.android.gms.internal.measurement.zzkq("PURPOSE_RESTRICTION_REQUIRE_CONSENT", 1, 1);
        com.google.android.gms.internal.measurement.zzkq.zzb = v1_2;
        com.google.android.gms.internal.measurement.zzkq v2_1 = new com.google.android.gms.internal.measurement.zzkq("PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST", 2, 2);
        com.google.android.gms.internal.measurement.zzkq.zzc = v2_1;
        com.google.android.gms.internal.measurement.zzkq v3_2 = new com.google.android.gms.internal.measurement.zzkq("PURPOSE_RESTRICTION_UNDEFINED", 3, 3);
        com.google.android.gms.internal.measurement.zzkq.zzd = v3_2;
        com.google.android.gms.internal.measurement.zzkq v4_3 = new com.google.android.gms.internal.measurement.zzkq("UNRECOGNIZED", 4, -1);
        com.google.android.gms.internal.measurement.zzkq.zze = v4_3;
        com.google.android.gms.internal.measurement.zzkq.zzg = new com.google.android.gms.internal.measurement.zzkq[] {v0_2, v1_2, v2_1, v3_2, v4_3});
        return;
    }

    private zzkq(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzf = p3;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzkq[] values()
    {
        return ((com.google.android.gms.internal.measurement.zzkq[]) com.google.android.gms.internal.measurement.zzkq.zzg.clone());
    }

    public final String toString()
    {
        return Integer.toString(this.zzf);
    }

    public final int zza()
    {
        if (this == com.google.android.gms.internal.measurement.zzkq.zze) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzf;
        }
    }
}
