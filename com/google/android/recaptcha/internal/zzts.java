package com.google.android.recaptcha.internal;
public final class zzts extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzts zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;

    static zzts()
    {
        com.google.android.recaptcha.internal.zzts v0_1 = new com.google.android.recaptcha.internal.zzts();
        com.google.android.recaptcha.internal.zzts.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzts, v0_1);
        return;
    }

    private zzts()
    {
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzts zzf()
    {
        return com.google.android.recaptcha.internal.zzts.zzb;
    }

    public static com.google.android.recaptcha.internal.zzts zzg(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zzts) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zzts.zzb, p1));
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzts.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000c", new Object[] {"zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzts();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zztr(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzts.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzts.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzts.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzts.zzb);
                                        com.google.android.recaptcha.internal.zzts.zzd = v1_11;
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

    public final com.google.android.recaptcha.internal.zztv zzi()
    {
        com.google.android.recaptcha.internal.zztv v0_1 = com.google.android.recaptcha.internal.zztv.zzb(this.zze);
        if (v0_1 == null) {
            v0_1 = com.google.android.recaptcha.internal.zztv.zzk;
        }
        return v0_1;
    }
}
