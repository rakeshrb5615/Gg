package com.google.android.recaptcha.internal;
public final class zzls extends com.google.android.recaptcha.internal.zzna implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzls zzd;
    private static volatile com.google.android.recaptcha.internal.zzoq zze;
    private int zzf;
    private boolean zzg;
    private com.google.android.recaptcha.internal.zzma zzh;
    private boolean zzi;
    private com.google.android.recaptcha.internal.zzmc zzj;
    private com.google.android.recaptcha.internal.zznk zzk;
    private byte zzl;

    static zzls()
    {
        com.google.android.recaptcha.internal.zzls v0_1 = new com.google.android.recaptcha.internal.zzls();
        com.google.android.recaptcha.internal.zzls.zzd = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzls, v0_1);
        return;
    }

    private zzls()
    {
        this.zzl = 2;
        this.zzk = com.google.android.recaptcha.internal.zzot.zze();
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzls zzf()
    {
        return com.google.android.recaptcha.internal.zzls.zzd;
    }

    public static com.google.android.recaptcha.internal.zzls zzg()
    {
        return com.google.android.recaptcha.internal.zzls.zzd;
    }

    public final Object zzh(int p8, Object p9, Object p10)
    {
        com.google.android.recaptcha.internal.zzmy v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(this.zzl);
        } else {
            if (v8_1 == 2) {
                String v2 = "zzh";
                String v4 = "zzj";
                return new com.google.android.recaptcha.internal.zzou(com.google.android.recaptcha.internal.zzls.zzd, "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0001\u0002\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1009\u0003\u03e7\u041b", new Object[] {"zzf", com.google.android.recaptcha.internal.zzmg}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzls();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzlr(0);
                    } else {
                        if (v8_1 == 5) {
                            return com.google.android.recaptcha.internal.zzls.zzd;
                        } else {
                            if (v8_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v8_9 = com.google.android.recaptcha.internal.zzls.zze;
                                if (v8_9 != null) {
                                    return v8_9;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v8_11 = com.google.android.recaptcha.internal.zzls.zze;
                                    if (v8_11 == null) {
                                        v8_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzls.zzd);
                                        com.google.android.recaptcha.internal.zzls.zze = v8_11;
                                    }
                                    return v8_11;
                                }
                            } else {
                                com.google.android.recaptcha.internal.zzmy v8_14;
                                if (p9 != null) {
                                    v8_14 = 1;
                                } else {
                                    v8_14 = 0;
                                }
                                this.zzl = v8_14;
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
