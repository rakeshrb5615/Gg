package com.google.android.recaptcha.internal;
public final class zzma extends com.google.android.recaptcha.internal.zzna implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzma zzd;
    private static volatile com.google.android.recaptcha.internal.zzoq zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private byte zzm;

    static zzma()
    {
        com.google.android.recaptcha.internal.zzma v0_1 = new com.google.android.recaptcha.internal.zzma();
        com.google.android.recaptcha.internal.zzma.zzd = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzma, v0_1);
        return;
    }

    private zzma()
    {
        this.zzm = 2;
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzma zzf()
    {
        return com.google.android.recaptcha.internal.zzma.zzd;
    }

    public final Object zzh(int p14, Object p15, Object p16)
    {
        com.google.android.recaptcha.internal.zzmy v14_1 = (p14 - 1);
        if (v14_1 == null) {
            return Byte.valueOf(this.zzm);
        } else {
            if (v14_1 == 2) {
                String v2 = com.google.android.recaptcha.internal.zzlv.zza;
                com.google.android.recaptcha.internal.zznh v4 = com.google.android.recaptcha.internal.zzlu.zza;
                com.google.android.recaptcha.internal.zznh v6 = com.google.android.recaptcha.internal.zzly.zza;
                com.google.android.recaptcha.internal.zznh v8 = com.google.android.recaptcha.internal.zzlz.zza;
                com.google.android.recaptcha.internal.zznh v10 = com.google.android.recaptcha.internal.zzlx.zza;
                return new com.google.android.recaptcha.internal.zzou(com.google.android.recaptcha.internal.zzma.zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002\u0004\u180c\u0003\u0005\u180c\u0004\u0006\u180c\u0005", new Object[] {"zzf", com.google.android.recaptcha.internal.zzlw.zza}));
            } else {
                if (v14_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzma();
                } else {
                    if (v14_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzlt(0);
                    } else {
                        if (v14_1 == 5) {
                            return com.google.android.recaptcha.internal.zzma.zzd;
                        } else {
                            if (v14_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v14_10 = com.google.android.recaptcha.internal.zzma.zze;
                                if (v14_10 != null) {
                                    return v14_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v14_11 = com.google.android.recaptcha.internal.zzma.zze;
                                    if (v14_11 == null) {
                                        v14_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzma.zzd);
                                        com.google.android.recaptcha.internal.zzma.zze = v14_11;
                                    }
                                    return v14_11;
                                }
                            } else {
                                com.google.android.recaptcha.internal.zzmy v14_14;
                                if (p15 != null) {
                                    v14_14 = 1;
                                } else {
                                    v14_14 = 0;
                                }
                                this.zzm = v14_14;
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
