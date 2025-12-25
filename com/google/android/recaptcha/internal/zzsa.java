package com.google.android.recaptcha.internal;
public final class zzsa extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsa zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private com.google.android.recaptcha.internal.zzle zze;

    static zzsa()
    {
        com.google.android.recaptcha.internal.zzsa v0_1 = new com.google.android.recaptcha.internal.zzsa();
        com.google.android.recaptcha.internal.zzsa.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsa, v0_1);
        return;
    }

    private zzsa()
    {
        this.zze = com.google.android.recaptcha.internal.zzle.zzb;
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsa zzf()
    {
        return com.google.android.recaptcha.internal.zzsa.zzb;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsa.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[] {"zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsa();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzrz(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsa.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzsa.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzsa.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsa.zzb);
                                        com.google.android.recaptcha.internal.zzsa.zzd = v1_11;
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
