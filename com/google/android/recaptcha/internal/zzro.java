package com.google.android.recaptcha.internal;
public final class zzro extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzro zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private com.google.android.recaptcha.internal.zzqt zzg;
    private com.google.android.recaptcha.internal.zzqk zzh;
    private com.google.android.recaptcha.internal.zzqw zzi;
    private String zzj;
    private String zzk;

    static zzro()
    {
        com.google.android.recaptcha.internal.zzro v0_1 = new com.google.android.recaptcha.internal.zzro();
        com.google.android.recaptcha.internal.zzro.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzro, v0_1);
        return;
    }

    private zzro()
    {
        this.zzf = "";
        this.zzj = "";
        this.zzk = "";
        return;
    }

    public static com.google.android.recaptcha.internal.zzrm zzf()
    {
        return ((com.google.android.recaptcha.internal.zzrm) com.google.android.recaptcha.internal.zzro.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzro zzg()
    {
        return com.google.android.recaptcha.internal.zzro.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzro p0, com.google.android.recaptcha.internal.zzqk p1)
    {
        p1.getClass();
        p0.zzh = p1;
        p0.zze = (p0.zze | 2);
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzro p0, String p1)
    {
        p1.getClass();
        p0.zzk = p1;
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzro p0, String p1)
    {
        p1.getClass();
        p0.zzj = p1;
        return;
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zzro p0, String p1)
    {
        p1.getClass();
        p0.zzf = p1;
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
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzro.zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000\u0003\u1009\u0001\u0004\u1009\u0002\u0005\u0208\u0006\u0208", new Object[] {"zze", "zzk"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzro();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzrm(0);
                    } else {
                        if (v8_1 == 5) {
                            return com.google.android.recaptcha.internal.zzro.zzb;
                        } else {
                            if (v8_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v8_10 = com.google.android.recaptcha.internal.zzro.zzd;
                                if (v8_10 != null) {
                                    return v8_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v8_12 = com.google.android.recaptcha.internal.zzro.zzd;
                                    if (v8_12 == null) {
                                        v8_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzro.zzb);
                                        com.google.android.recaptcha.internal.zzro.zzd = v8_12;
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
