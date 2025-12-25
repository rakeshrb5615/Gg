package com.google.android.recaptcha.internal;
public final class zztu extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zztu zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static zztu()
    {
        com.google.android.recaptcha.internal.zztu v0_1 = new com.google.android.recaptcha.internal.zztu();
        com.google.android.recaptcha.internal.zztu.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zztu, v0_1);
        return;
    }

    private zztu()
    {
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zztu zzf()
    {
        return com.google.android.recaptcha.internal.zztu.zzb;
    }

    public static com.google.android.recaptcha.internal.zztu zzg(java.io.InputStream p1)
    {
        return ((com.google.android.recaptcha.internal.zztu) com.google.android.recaptcha.internal.zznd.zzw(com.google.android.recaptcha.internal.zztu.zzb, p1));
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zztu.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] {"zze", "zzf", "zzg"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zztu();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zztt(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zztu.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zztu.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zztu.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zztu.zzb);
                                        com.google.android.recaptcha.internal.zztu.zzd = v1_11;
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
        com.google.android.recaptcha.internal.zztv v0_1 = com.google.android.recaptcha.internal.zztv.zzb(this.zzg);
        if (v0_1 == null) {
            v0_1 = com.google.android.recaptcha.internal.zztv.zzk;
        }
        return v0_1;
    }
}
