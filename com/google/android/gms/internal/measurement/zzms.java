package com.google.android.gms.internal.measurement;
public final enum class zzms extends java.lang.Enum {
    public static final enum com.google.android.gms.internal.measurement.zzms zza;
    public static final enum com.google.android.gms.internal.measurement.zzms zzb;
    public static final enum com.google.android.gms.internal.measurement.zzms zzc;
    public static final enum com.google.android.gms.internal.measurement.zzms zzd;
    public static final enum com.google.android.gms.internal.measurement.zzms zze;
    public static final enum com.google.android.gms.internal.measurement.zzms zzf;
    public static final enum com.google.android.gms.internal.measurement.zzms zzg;
    public static final enum com.google.android.gms.internal.measurement.zzms zzh;
    public static final enum com.google.android.gms.internal.measurement.zzms zzi;
    public static final enum com.google.android.gms.internal.measurement.zzms zzj;
    private static final synthetic com.google.android.gms.internal.measurement.zzms[] zzl;
    private final Class zzk;

    static zzms()
    {
        com.google.android.gms.internal.measurement.zzms[] v0_1 = new com.google.android.gms.internal.measurement.zzms("VOID", 0, Void, Void, 0);
        com.google.android.gms.internal.measurement.zzms.zza = v0_1;
        com.google.android.gms.internal.measurement.zzms v4_0 = Integer.TYPE;
        com.google.android.gms.internal.measurement.zzms.zzb = new com.google.android.gms.internal.measurement.zzms("INT", 1, v4_0, Integer, Integer.valueOf(0));
        com.google.android.gms.internal.measurement.zzms v2_2 = new com.google.android.gms.internal.measurement.zzms;
        v2_2("LONG", 2, Long.TYPE, Long, Long.valueOf(0));
        com.google.android.gms.internal.measurement.zzms.zzc = v2_2;
        com.google.android.gms.internal.measurement.zzms v3_1 = new com.google.android.gms.internal.measurement.zzms;
        v3_1("FLOAT", 3, Float.TYPE, Float, Float.valueOf(0));
        com.google.android.gms.internal.measurement.zzms.zzd = v3_1;
        com.google.android.gms.internal.measurement.zzms.zze = new com.google.android.gms.internal.measurement.zzms("DOUBLE", 4, Double.TYPE, Double, Double.valueOf(0));
        com.google.android.gms.internal.measurement.zzms v6_6 = new com.google.android.gms.internal.measurement.zzms("BOOLEAN", 5, Boolean.TYPE, Boolean, Boolean.FALSE);
        com.google.android.gms.internal.measurement.zzms.zzf = v6_6;
        com.google.android.gms.internal.measurement.zzms v13 = new com.google.android.gms.internal.measurement.zzms("STRING", 6, String, String, "");
        com.google.android.gms.internal.measurement.zzms.zzg = v13;
        com.google.android.gms.internal.measurement.zzms.zzh = new com.google.android.gms.internal.measurement.zzms("BYTE_STRING", 7, com.google.android.gms.internal.measurement.zzlh, com.google.android.gms.internal.measurement.zzlh, com.google.android.gms.internal.measurement.zzlh.zzb);
        com.google.android.gms.internal.measurement.zzms.zzi = new com.google.android.gms.internal.measurement.zzms("ENUM", 8, v4_0, Integer, 0);
        com.google.android.gms.internal.measurement.zzms v9_7 = new com.google.android.gms.internal.measurement.zzms;
        v9_7("MESSAGE", 9, Object, Object, 0);
        com.google.android.gms.internal.measurement.zzms.zzj = v9_7;
        com.google.android.gms.internal.measurement.zzms v5 = v6_6;
        com.google.android.gms.internal.measurement.zzms v6 = v13;
        com.google.android.gms.internal.measurement.zzms.zzl = new com.google.android.gms.internal.measurement.zzms[] {v0_1, v9_7});
        return;
    }

    private zzms(String p1, int p2, Class p3, Class p4, Object p5)
    {
        super(p1, p2);
        super.zzk = p4;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzms[] values()
    {
        return ((com.google.android.gms.internal.measurement.zzms[]) com.google.android.gms.internal.measurement.zzms.zzl.clone());
    }

    public final Class zza()
    {
        return this.zzk;
    }
}
