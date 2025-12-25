package com.google.android.recaptcha.internal;
public final class zzrl extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzrl zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private com.google.android.recaptcha.internal.zzml zzf;
    private com.google.android.recaptcha.internal.zzpj zzg;
    private com.google.android.recaptcha.internal.zzml zzh;
    private com.google.android.recaptcha.internal.zzpj zzi;

    static zzrl()
    {
        com.google.android.recaptcha.internal.zzrl v0_1 = new com.google.android.recaptcha.internal.zzrl();
        com.google.android.recaptcha.internal.zzrl.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzrl, v0_1);
        return;
    }

    private zzrl()
    {
        return;
    }

    public static com.google.android.recaptcha.internal.zzrj zzf()
    {
        return ((com.google.android.recaptcha.internal.zzrj) com.google.android.recaptcha.internal.zzrl.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzrl zzg()
    {
        return com.google.android.recaptcha.internal.zzrl.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzrl p0, com.google.android.recaptcha.internal.zzpj p1)
    {
        p1.getClass();
        p0.zzi = p1;
        p0.zze = (p0.zze | 8);
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzrl p0, com.google.android.recaptcha.internal.zzml p1)
    {
        p1.getClass();
        p0.zzh = p1;
        p0.zze = (p0.zze | 4);
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzrl p0, com.google.android.recaptcha.internal.zzpj p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zze = (p0.zze | 2);
        return;
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zzrl p0, com.google.android.recaptcha.internal.zzml p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = (p0.zze | 1);
        return;
    }

    public final Object zzh(int p3, Object p4, Object p5)
    {
        com.google.android.recaptcha.internal.zzmy v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzrl.zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] {"zze", "zzf", "zzg", "zzh", "zzi"}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzrl();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzrj(0);
                    } else {
                        if (v3_1 == 5) {
                            return com.google.android.recaptcha.internal.zzrl.zzb;
                        } else {
                            if (v3_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v3_10 = com.google.android.recaptcha.internal.zzrl.zzd;
                                if (v3_10 != null) {
                                    return v3_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v3_12 = com.google.android.recaptcha.internal.zzrl.zzd;
                                    if (v3_12 == null) {
                                        v3_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzrl.zzb);
                                        com.google.android.recaptcha.internal.zzrl.zzd = v3_12;
                                    }
                                    return v3_12;
                                }
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
