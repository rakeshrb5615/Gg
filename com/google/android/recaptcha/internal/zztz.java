package com.google.android.recaptcha.internal;
public final class zztz extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zztz zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private com.google.android.recaptcha.internal.zznk zze;

    static zztz()
    {
        com.google.android.recaptcha.internal.zztz v0_1 = new com.google.android.recaptcha.internal.zztz();
        com.google.android.recaptcha.internal.zztz.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zztz, v0_1);
        return;
    }

    private zztz()
    {
        this.zze = com.google.android.recaptcha.internal.zznd.zzB();
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zztz zzf()
    {
        return com.google.android.recaptcha.internal.zztz.zzb;
    }

    public static com.google.android.recaptcha.internal.zztz zzg(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zztz) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zztz.zzb, p1));
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zztz.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] {"zze", com.google.android.recaptcha.internal.zzuf}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zztz();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzty(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zztz.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zztz.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zztz.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zztz.zzb);
                                        com.google.android.recaptcha.internal.zztz.zzd = v1_11;
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

    public final java.util.List zzi()
    {
        return this.zze;
    }
}
