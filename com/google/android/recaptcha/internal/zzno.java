package com.google.android.recaptcha.internal;
public final enum class zzno extends java.lang.Enum {
    public static final enum com.google.android.recaptcha.internal.zzno zza;
    public static final enum com.google.android.recaptcha.internal.zzno zzb;
    public static final enum com.google.android.recaptcha.internal.zzno zzc;
    public static final enum com.google.android.recaptcha.internal.zzno zzd;
    public static final enum com.google.android.recaptcha.internal.zzno zze;
    public static final enum com.google.android.recaptcha.internal.zzno zzf;
    public static final enum com.google.android.recaptcha.internal.zzno zzg;
    public static final enum com.google.android.recaptcha.internal.zzno zzh;
    public static final enum com.google.android.recaptcha.internal.zzno zzi;
    public static final enum com.google.android.recaptcha.internal.zzno zzj;
    private static final synthetic com.google.android.recaptcha.internal.zzno[] zzk;
    private final Class zzl;

    static zzno()
    {
        com.google.android.recaptcha.internal.zzno[] v0_1 = new com.google.android.recaptcha.internal.zzno("VOID", 0, Void, Void, 0);
        com.google.android.recaptcha.internal.zzno.zza = v0_1;
        com.google.android.recaptcha.internal.zzno v4_0 = Integer.TYPE;
        com.google.android.recaptcha.internal.zzno.zzb = new com.google.android.recaptcha.internal.zzno("INT", 1, v4_0, Integer, Integer.valueOf(0));
        com.google.android.recaptcha.internal.zzno v2_2 = new com.google.android.recaptcha.internal.zzno;
        v2_2("LONG", 2, Long.TYPE, Long, Long.valueOf(0));
        com.google.android.recaptcha.internal.zzno.zzc = v2_2;
        com.google.android.recaptcha.internal.zzno v3_1 = new com.google.android.recaptcha.internal.zzno;
        v3_1("FLOAT", 3, Float.TYPE, Float, Float.valueOf(0));
        com.google.android.recaptcha.internal.zzno.zzd = v3_1;
        com.google.android.recaptcha.internal.zzno.zze = new com.google.android.recaptcha.internal.zzno("DOUBLE", 4, Double.TYPE, Double, Double.valueOf(0));
        com.google.android.recaptcha.internal.zzno v6_6 = new com.google.android.recaptcha.internal.zzno("BOOLEAN", 5, Boolean.TYPE, Boolean, Boolean.FALSE);
        com.google.android.recaptcha.internal.zzno.zzf = v6_6;
        com.google.android.recaptcha.internal.zzno v13 = new com.google.android.recaptcha.internal.zzno("STRING", 6, String, String, "");
        com.google.android.recaptcha.internal.zzno.zzg = v13;
        com.google.android.recaptcha.internal.zzno.zzh = new com.google.android.recaptcha.internal.zzno("BYTE_STRING", 7, com.google.android.recaptcha.internal.zzle, com.google.android.recaptcha.internal.zzle, com.google.android.recaptcha.internal.zzle.zzb);
        com.google.android.recaptcha.internal.zzno.zzi = new com.google.android.recaptcha.internal.zzno("ENUM", 8, v4_0, Integer, 0);
        com.google.android.recaptcha.internal.zzno v9_7 = new com.google.android.recaptcha.internal.zzno;
        v9_7("MESSAGE", 9, Object, Object, 0);
        com.google.android.recaptcha.internal.zzno.zzj = v9_7;
        com.google.android.recaptcha.internal.zzno v5 = v6_6;
        com.google.android.recaptcha.internal.zzno v6 = v13;
        com.google.android.recaptcha.internal.zzno.zzk = new com.google.android.recaptcha.internal.zzno[] {v0_1, v9_7});
        return;
    }

    private zzno(String p1, int p2, Class p3, Class p4, Object p5)
    {
        super(p1, p2);
        super.zzl = p4;
        return;
    }

    public static com.google.android.recaptcha.internal.zzno[] values()
    {
        return ((com.google.android.recaptcha.internal.zzno[]) com.google.android.recaptcha.internal.zzno.zzk.clone());
    }

    public final Class zza()
    {
        return this.zzl;
    }
}
