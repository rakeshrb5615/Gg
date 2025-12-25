package com.google.android.recaptcha.internal;
public final class zzqq extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzqq zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private String zzh;
    private String zzi;
    private int zzj;
    private int zzk;

    static zzqq()
    {
        com.google.android.recaptcha.internal.zzqq v0_1 = new com.google.android.recaptcha.internal.zzqq();
        com.google.android.recaptcha.internal.zzqq.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzqq, v0_1);
        return;
    }

    private zzqq()
    {
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        return;
    }

    public static synthetic void zzM(com.google.android.recaptcha.internal.zzqq p0, String p1)
    {
        p0.zzi = p1;
        return;
    }

    public static synthetic void zzN(com.google.android.recaptcha.internal.zzqq p0, int p1)
    {
        p0.zzk = p1;
        return;
    }

    public static synthetic void zzO(com.google.android.recaptcha.internal.zzqq p0, String p1)
    {
        p1.getClass();
        p0.zze = p1;
        return;
    }

    public static com.google.android.recaptcha.internal.zzqo zzg()
    {
        return ((com.google.android.recaptcha.internal.zzqo) com.google.android.recaptcha.internal.zzqq.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzqq zzi()
    {
        return com.google.android.recaptcha.internal.zzqq.zzb;
    }

    public static com.google.android.recaptcha.internal.zzqq zzj()
    {
        return com.google.android.recaptcha.internal.zzqq.zzb;
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zzqq p0, int p1)
    {
        p0.zzg = p1;
        return;
    }

    public final int zzf()
    {
        return this.zzg;
    }

    public final Object zzh(int p8, Object p9, Object p10)
    {
        com.google.android.recaptcha.internal.zzmy v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                String v2 = "zzi";
                String v4 = "zzf";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzqq.zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0004", new Object[] {"zze", "zzk"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzqq();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzqo(0);
                    } else {
                        if (v8_1 == 5) {
                            return com.google.android.recaptcha.internal.zzqq.zzb;
                        } else {
                            if (v8_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v8_10 = com.google.android.recaptcha.internal.zzqq.zzd;
                                if (v8_10 != null) {
                                    return v8_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v8_12 = com.google.android.recaptcha.internal.zzqq.zzd;
                                    if (v8_12 == null) {
                                        v8_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzqq.zzb);
                                        com.google.android.recaptcha.internal.zzqq.zzd = v8_12;
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

    public final String zzk()
    {
        return this.zze;
    }
}
