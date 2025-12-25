package com.google.android.recaptcha.internal;
public final class zzsg extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsg zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;

    static zzsg()
    {
        com.google.android.recaptcha.internal.zzsg v0_1 = new com.google.android.recaptcha.internal.zzsg();
        com.google.android.recaptcha.internal.zzsg.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsg, v0_1);
        return;
    }

    private zzsg()
    {
        this.zzf = "";
        return;
    }

    public static com.google.android.recaptcha.internal.zzsf zzf()
    {
        return ((com.google.android.recaptcha.internal.zzsf) com.google.android.recaptcha.internal.zzsg.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsg zzg()
    {
        return com.google.android.recaptcha.internal.zzsg.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzsg p1, String p2)
    {
        p1.zze = (p1.zze | 1);
        p1.zzf = p2;
        return;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsg.zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1208\u0000", new Object[] {"zze", "zzf"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsg();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzsf(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsg.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzsg.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzsg.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsg.zzb);
                                        com.google.android.recaptcha.internal.zzsg.zzd = v1_11;
                                    }
                                    return v1_11;
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
