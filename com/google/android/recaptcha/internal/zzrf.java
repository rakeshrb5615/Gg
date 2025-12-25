package com.google.android.recaptcha.internal;
public final class zzrf extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzrf zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private com.google.android.recaptcha.internal.zznk zzf;
    private com.google.android.recaptcha.internal.zznk zzg;
    private com.google.android.recaptcha.internal.zzqn zzh;

    static zzrf()
    {
        com.google.android.recaptcha.internal.zzrf v0_1 = new com.google.android.recaptcha.internal.zzrf();
        com.google.android.recaptcha.internal.zzrf.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzrf, v0_1);
        return;
    }

    private zzrf()
    {
        this.zzf = com.google.android.recaptcha.internal.zznd.zzB();
        this.zzg = com.google.android.recaptcha.internal.zznd.zzB();
        return;
    }

    public static synthetic void zzM(com.google.android.recaptcha.internal.zzrf p2, com.google.android.recaptcha.internal.zzrc p3)
    {
        p3.getClass();
        com.google.android.recaptcha.internal.zznk v0_0 = p2.zzf;
        if (!v0_0.zzc()) {
            p2.zzf = com.google.android.recaptcha.internal.zznd.zzC(v0_0);
        }
        p2.zzf.add(p3);
        return;
    }

    public static synthetic void zzN(com.google.android.recaptcha.internal.zzrf p2, com.google.android.recaptcha.internal.zzrr p3)
    {
        p3.getClass();
        com.google.android.recaptcha.internal.zznk v0_0 = p2.zzg;
        if (!v0_0.zzc()) {
            p2.zzg = com.google.android.recaptcha.internal.zznd.zzC(v0_0);
        }
        p2.zzg.add(p3);
        return;
    }

    public static com.google.android.recaptcha.internal.zzrd zzi()
    {
        return ((com.google.android.recaptcha.internal.zzrd) com.google.android.recaptcha.internal.zzrf.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzrf zzj()
    {
        return com.google.android.recaptcha.internal.zzrf.zzb;
    }

    public static com.google.android.recaptcha.internal.zzrf zzk(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zzrf) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zzrf.zzb, p1));
    }

    public final int zzf()
    {
        return this.zzf.size();
    }

    public final int zzg()
    {
        return this.zzg.size();
    }

    public final Object zzh(int p7, Object p8, Object p9)
    {
        com.google.android.recaptcha.internal.zzmy v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                Class v2 = com.google.android.recaptcha.internal.zzrc;
                Class v4 = com.google.android.recaptcha.internal.zzrr;
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzrf.zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1009\u0000", new Object[] {"zze", "zzh"}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzrf();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzrd(0);
                    } else {
                        if (v7_1 == 5) {
                            return com.google.android.recaptcha.internal.zzrf.zzb;
                        } else {
                            if (v7_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v7_10 = com.google.android.recaptcha.internal.zzrf.zzd;
                                if (v7_10 != null) {
                                    return v7_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v7_12 = com.google.android.recaptcha.internal.zzrf.zzd;
                                    if (v7_12 == null) {
                                        v7_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzrf.zzb);
                                        com.google.android.recaptcha.internal.zzrf.zzd = v7_12;
                                    }
                                    return v7_12;
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

    public final java.util.List zzl()
    {
        return this.zzf;
    }
}
