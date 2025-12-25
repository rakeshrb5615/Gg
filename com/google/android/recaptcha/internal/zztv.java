package com.google.android.recaptcha.internal;
public final enum class zztv extends java.lang.Enum implements com.google.android.recaptcha.internal.zznf {
    public static final enum com.google.android.recaptcha.internal.zztv zza;
    public static final enum com.google.android.recaptcha.internal.zztv zzb;
    public static final enum com.google.android.recaptcha.internal.zztv zzc;
    public static final enum com.google.android.recaptcha.internal.zztv zzd;
    public static final enum com.google.android.recaptcha.internal.zztv zze;
    public static final enum com.google.android.recaptcha.internal.zztv zzf;
    public static final enum com.google.android.recaptcha.internal.zztv zzg;
    public static final enum com.google.android.recaptcha.internal.zztv zzh;
    public static final enum com.google.android.recaptcha.internal.zztv zzi;
    public static final enum com.google.android.recaptcha.internal.zztv zzj;
    public static final enum com.google.android.recaptcha.internal.zztv zzk;
    private static final synthetic com.google.android.recaptcha.internal.zztv[] zzl;
    private final int zzm;

    static zztv()
    {
        com.google.android.recaptcha.internal.zztv[] v0_1 = new com.google.android.recaptcha.internal.zztv("JS_CODE_UNSPECIFIED", 0, 0);
        com.google.android.recaptcha.internal.zztv.zza = v0_1;
        com.google.android.recaptcha.internal.zztv.zzb = new com.google.android.recaptcha.internal.zztv("JS_CODE_SUCCESS", 1, 1);
        com.google.android.recaptcha.internal.zztv.zzc = new com.google.android.recaptcha.internal.zztv("JS_NETWORK_ERROR", 2, 2);
        com.google.android.recaptcha.internal.zztv.zzd = new com.google.android.recaptcha.internal.zztv("JS_INTERNAL_ERROR", 3, 3);
        com.google.android.recaptcha.internal.zztv.zze = new com.google.android.recaptcha.internal.zztv("JS_INVALID_SITE_KEY", 4, 4);
        com.google.android.recaptcha.internal.zztv.zzf = new com.google.android.recaptcha.internal.zztv("JS_INVALID_SITE_KEY_TYPE", 5, 5);
        com.google.android.recaptcha.internal.zztv.zzg = new com.google.android.recaptcha.internal.zztv("JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED", 6, 6);
        com.google.android.recaptcha.internal.zztv.zzh = new com.google.android.recaptcha.internal.zztv("JS_INVALID_ACTION", 7, 7);
        com.google.android.recaptcha.internal.zztv.zzi = new com.google.android.recaptcha.internal.zztv("JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED", 8, 8);
        com.google.android.recaptcha.internal.zztv.zzj = new com.google.android.recaptcha.internal.zztv("JS_PROGRAM_ERROR", 9, 9);
        com.google.android.recaptcha.internal.zztv v10_3 = new com.google.android.recaptcha.internal.zztv("UNRECOGNIZED", 10, -1);
        com.google.android.recaptcha.internal.zztv.zzk = v10_3;
        com.google.android.recaptcha.internal.zztv.zzl = new com.google.android.recaptcha.internal.zztv[] {v0_1, v10_3});
        return;
    }

    private zztv(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzm = p3;
        return;
    }

    public static com.google.android.recaptcha.internal.zztv[] values()
    {
        return ((com.google.android.recaptcha.internal.zztv[]) com.google.android.recaptcha.internal.zztv.zzl.clone());
    }

    public static com.google.android.recaptcha.internal.zztv zzb(int p0)
    {
        switch (p0) {
            case 0:
                return com.google.android.recaptcha.internal.zztv.zza;
            case 1:
                return com.google.android.recaptcha.internal.zztv.zzb;
            case 2:
                return com.google.android.recaptcha.internal.zztv.zzc;
            case 3:
                return com.google.android.recaptcha.internal.zztv.zzd;
            case 4:
                return com.google.android.recaptcha.internal.zztv.zze;
            case 5:
                return com.google.android.recaptcha.internal.zztv.zzf;
            case 6:
                return com.google.android.recaptcha.internal.zztv.zzg;
            case 7:
                return com.google.android.recaptcha.internal.zztv.zzh;
            case 8:
                return com.google.android.recaptcha.internal.zztv.zzi;
            case 9:
                return com.google.android.recaptcha.internal.zztv.zzj;
            default:
                return 0;
        }
    }

    public final String toString()
    {
        return Integer.toString(this.zza());
    }

    public final int zza()
    {
        if (this == com.google.android.recaptcha.internal.zztv.zzk) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            return this.zzm;
        }
    }
}
