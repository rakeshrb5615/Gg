package com.google.android.recaptcha.internal;
public final class zzsx extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsx zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private com.google.android.recaptcha.internal.zzni zzh;
    private int zzi;
    private int zzj;

    static zzsx()
    {
        com.google.android.recaptcha.internal.zzsx v0_1 = new com.google.android.recaptcha.internal.zzsx();
        com.google.android.recaptcha.internal.zzsx.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsx, v0_1);
        return;
    }

    private zzsx()
    {
        this.zzf = "";
        this.zzg = "";
        this.zzh = com.google.android.recaptcha.internal.zznd.zzy();
        return;
    }

    public static com.google.android.recaptcha.internal.zzsv zzf()
    {
        return ((com.google.android.recaptcha.internal.zzsv) com.google.android.recaptcha.internal.zzsx.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsx zzg()
    {
        return com.google.android.recaptcha.internal.zzsx.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzsx p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 2);
        p1.zzg = p2;
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzsx p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 1);
        p1.zzf = p2;
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzsx p0, int p1)
    {
        p0.zzi = 2;
        p0.zze = (p0.zze | 4);
        return;
    }

    public final Object zzh(int p8, Object p9, Object p10)
    {
        com.google.android.recaptcha.internal.zzmy v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsx.zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\'\u0004\u180c\u0002\u0005\u1004\u0003", new Object[] {"zze", "zzj"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsx();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzsv(0);
                    } else {
                        if (v8_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsx.zzb;
                        } else {
                            if (v8_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v8_10 = com.google.android.recaptcha.internal.zzsx.zzd;
                                if (v8_10 != null) {
                                    return v8_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v8_12 = com.google.android.recaptcha.internal.zzsx.zzd;
                                    if (v8_12 == null) {
                                        v8_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsx.zzb);
                                        com.google.android.recaptcha.internal.zzsx.zzd = v8_12;
                                    }
                                    return v8_12;
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
