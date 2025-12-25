package com.google.android.recaptcha.internal;
public final class zzmc extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzmc zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh;
    private int zzi;

    static zzmc()
    {
        com.google.android.recaptcha.internal.zzmc v0_1 = new com.google.android.recaptcha.internal.zzmc();
        com.google.android.recaptcha.internal.zzmc.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzmc, v0_1);
        return;
    }

    private zzmc()
    {
        this.zzh = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzmc zzf()
    {
        return com.google.android.recaptcha.internal.zzmc.zzb;
    }

    public final Object zzh(int p9, Object p10, Object p11)
    {
        com.google.android.recaptcha.internal.zzmy v9_1 = (p9 - 1);
        if (v9_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v9_1 == 2) {
                com.google.android.recaptcha.internal.zznh v2 = com.google.android.recaptcha.internal.zzlp.zza;
                String v5 = "zzh";
                com.google.android.recaptcha.internal.zznh v4 = v2;
                return new com.google.android.recaptcha.internal.zzou(com.google.android.recaptcha.internal.zzmc.zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u1008\u0002\u0004\u180c\u0003", new Object[] {"zze", v2}));
            } else {
                if (v9_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzmc();
                } else {
                    if (v9_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzmb(0);
                    } else {
                        if (v9_1 == 5) {
                            return com.google.android.recaptcha.internal.zzmc.zzb;
                        } else {
                            if (v9_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v9_10 = com.google.android.recaptcha.internal.zzmc.zzd;
                                if (v9_10 != null) {
                                    return v9_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v9_11 = com.google.android.recaptcha.internal.zzmc.zzd;
                                    if (v9_11 == null) {
                                        v9_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzmc.zzb);
                                        com.google.android.recaptcha.internal.zzmc.zzd = v9_11;
                                    }
                                    return v9_11;
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
