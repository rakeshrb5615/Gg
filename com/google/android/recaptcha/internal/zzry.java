package com.google.android.recaptcha.internal;
public final class zzry extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzry zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;

    static zzry()
    {
        com.google.android.recaptcha.internal.zzry v0_1 = new com.google.android.recaptcha.internal.zzry();
        com.google.android.recaptcha.internal.zzry.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzry, v0_1);
        return;
    }

    private zzry()
    {
        this.zzf = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzry zzf()
    {
        return com.google.android.recaptcha.internal.zzry.zzb;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzry.zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1208\u0000", new Object[] {"zze", "zzf"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzry();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzrx(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzry.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzry.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzry.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzry.zzb);
                                        com.google.android.recaptcha.internal.zzry.zzd = v1_11;
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
