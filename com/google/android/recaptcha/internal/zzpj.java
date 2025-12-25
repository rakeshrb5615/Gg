package com.google.android.recaptcha.internal;
public final class zzpj extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzpj zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private long zze;
    private int zzf;

    static zzpj()
    {
        com.google.android.recaptcha.internal.zzpj v0_1 = new com.google.android.recaptcha.internal.zzpj();
        com.google.android.recaptcha.internal.zzpj.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzpj, v0_1);
        return;
    }

    private zzpj()
    {
        return;
    }

    public static com.google.android.recaptcha.internal.zzph zzi()
    {
        return ((com.google.android.recaptcha.internal.zzph) com.google.android.recaptcha.internal.zzpj.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzpj zzj()
    {
        return com.google.android.recaptcha.internal.zzpj.zzb;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzpj p0, int p1)
    {
        p0.zzf = p1;
        return;
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zzpj p0, long p1)
    {
        p0.zze = p1;
        return;
    }

    public final int zzf()
    {
        return this.zzf;
    }

    public final long zzg()
    {
        return this.zze;
    }

    public final Object zzh(int p2, Object p3, Object p4)
    {
        com.google.android.recaptcha.internal.zzmy v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return new com.google.android.recaptcha.internal.zzou(com.google.android.recaptcha.internal.zzpj.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[] {"zze", "zzf"}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzpj();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzph(0);
                    } else {
                        if (v2_1 == 5) {
                            return com.google.android.recaptcha.internal.zzpj.zzb;
                        } else {
                            if (v2_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v2_9 = com.google.android.recaptcha.internal.zzpj.zzd;
                                if (v2_9 != null) {
                                    return v2_9;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v2_10 = com.google.android.recaptcha.internal.zzpj.zzd;
                                    if (v2_10 == null) {
                                        v2_10 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzpj.zzb);
                                        com.google.android.recaptcha.internal.zzpj.zzd = v2_10;
                                    }
                                    return v2_10;
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
