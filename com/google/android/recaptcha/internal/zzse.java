package com.google.android.recaptcha.internal;
public final class zzse extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzse zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private com.google.android.recaptcha.internal.zzle zze;
    private String zzf;
    private long zzg;
    private com.google.android.recaptcha.internal.zzle zzh;
    private String zzi;
    private String zzj;

    static zzse()
    {
        com.google.android.recaptcha.internal.zzse v0_1 = new com.google.android.recaptcha.internal.zzse();
        com.google.android.recaptcha.internal.zzse.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzse, v0_1);
        return;
    }

    private zzse()
    {
        com.google.android.recaptcha.internal.zzle v0 = com.google.android.recaptcha.internal.zzle.zzb;
        this.zze = v0;
        this.zzf = "";
        this.zzh = v0;
        this.zzi = "";
        this.zzj = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzse zzj()
    {
        return com.google.android.recaptcha.internal.zzse.zzb;
    }

    public static com.google.android.recaptcha.internal.zzse zzk()
    {
        return com.google.android.recaptcha.internal.zzse.zzb;
    }

    public final long zzf()
    {
        return this.zzg;
    }

    public final com.google.android.recaptcha.internal.zzle zzg()
    {
        return this.zzh;
    }

    public final Object zzh(int p7, Object p8, Object p9)
    {
        com.google.android.recaptcha.internal.zzmy v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzse.zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\u0208\u0003\u0002\u0004\n\u0005\u0208\u0006\u0208", new Object[] {"zze", "zzj"}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzse();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzsd(0);
                    } else {
                        if (v7_1 == 5) {
                            return com.google.android.recaptcha.internal.zzse.zzb;
                        } else {
                            if (v7_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v7_10 = com.google.android.recaptcha.internal.zzse.zzd;
                                if (v7_10 != null) {
                                    return v7_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v7_12 = com.google.android.recaptcha.internal.zzse.zzd;
                                    if (v7_12 == null) {
                                        v7_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzse.zzb);
                                        com.google.android.recaptcha.internal.zzse.zzd = v7_12;
                                    }
                                    return v7_12;
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

    public final com.google.android.recaptcha.internal.zzle zzi()
    {
        return this.zze;
    }

    public final String zzl()
    {
        return this.zzf;
    }
}
