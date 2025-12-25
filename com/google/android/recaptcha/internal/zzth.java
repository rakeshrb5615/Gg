package com.google.android.recaptcha.internal;
public final class zzth extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzth zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private Object zzf;

    static zzth()
    {
        com.google.android.recaptcha.internal.zzth v0_1 = new com.google.android.recaptcha.internal.zzth();
        com.google.android.recaptcha.internal.zzth.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzth, v0_1);
        return;
    }

    private zzth()
    {
        this.zze = 0;
        return;
    }

    public static synthetic void zzM(com.google.android.recaptcha.internal.zzth p1, float p2)
    {
        p1.zze = 9;
        p1.zzf = Float.valueOf(p2);
        return;
    }

    public static synthetic void zzN(com.google.android.recaptcha.internal.zzth p1, int p2)
    {
        p1.zze = 4;
        p1.zzf = Integer.valueOf(p2);
        return;
    }

    public static synthetic void zzO(com.google.android.recaptcha.internal.zzth p1, int p2)
    {
        p1.zze = 5;
        p1.zzf = Integer.valueOf(p2);
        return;
    }

    public static synthetic void zzP(com.google.android.recaptcha.internal.zzth p1, long p2)
    {
        p1.zze = 7;
        p1.zzf = Long.valueOf(p2);
        return;
    }

    public static synthetic void zzQ(com.google.android.recaptcha.internal.zzth p1, String p2)
    {
        p2.getClass();
        p1.zze = 11;
        p1.zzf = p2;
        return;
    }

    public static com.google.android.recaptcha.internal.zztg zzf()
    {
        return ((com.google.android.recaptcha.internal.zztg) com.google.android.recaptcha.internal.zzth.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzth zzg()
    {
        return com.google.android.recaptcha.internal.zzth.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzth p1, boolean p2)
    {
        p1.zze = 1;
        p1.zzf = Boolean.valueOf(p2);
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzth p1, com.google.android.recaptcha.internal.zzle p2)
    {
        p1.zze = 2;
        p1.zzf = p2;
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzth p1, String p2)
    {
        p2.getClass();
        p1.zze = 3;
        p1.zzf = p2;
        return;
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zzth p1, double p2)
    {
        p1.zze = 10;
        p1.zzf = Double.valueOf(p2);
        return;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzth.zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003\u023b\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\u00086\u0000\t4\u0000\n3\u0000\u000b\u023b\u0000", new Object[] {"zzf", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzth();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zztg(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzth.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzth.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzth.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzth.zzb);
                                        com.google.android.recaptcha.internal.zzth.zzd = v1_11;
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
