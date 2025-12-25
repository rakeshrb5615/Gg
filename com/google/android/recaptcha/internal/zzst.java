package com.google.android.recaptcha.internal;
public final class zzst extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzst zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private String zzg;

    static zzst()
    {
        com.google.android.recaptcha.internal.zzst v0_1 = new com.google.android.recaptcha.internal.zzst();
        com.google.android.recaptcha.internal.zzst.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzst, v0_1);
        return;
    }

    private zzst()
    {
        this.zzf = "";
        this.zzg = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzst zzf()
    {
        return com.google.android.recaptcha.internal.zzst.zzb;
    }

    public final String zzg()
    {
        return this.zzf;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzst.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1208\u0000\u0002\u1208\u0001", new Object[] {"zze", "zzf", "zzg"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzst();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzss(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzst.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzst.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzst.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzst.zzb);
                                        com.google.android.recaptcha.internal.zzst.zzd = v1_11;
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

    public final String zzi()
    {
        return this.zzg;
    }
}
