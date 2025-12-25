package com.google.android.recaptcha.internal;
public final class zztx extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zztx zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private Object zzf;

    static zztx()
    {
        com.google.android.recaptcha.internal.zztx v0_1 = new com.google.android.recaptcha.internal.zztx();
        com.google.android.recaptcha.internal.zztx.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zztx, v0_1);
        return;
    }

    private zztx()
    {
        this.zze = 0;
        return;
    }

    public static synthetic void zzM(com.google.android.recaptcha.internal.zztx p0, com.google.android.recaptcha.internal.zzrr p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 2;
        return;
    }

    public static com.google.android.recaptcha.internal.zztw zzi()
    {
        return ((com.google.android.recaptcha.internal.zztw) com.google.android.recaptcha.internal.zztx.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zztx zzj()
    {
        return com.google.android.recaptcha.internal.zztx.zzb;
    }

    public static com.google.android.recaptcha.internal.zztx zzk(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zztx) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zztx.zzb, p1));
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zztx p0, com.google.android.recaptcha.internal.zzrc p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 1;
        return;
    }

    public final int zzN()
    {
        int v0_0 = this.zze;
        if (v0_0 == 0) {
            return 3;
        } else {
            int v1 = 1;
            if (v0_0 != 1) {
                v1 = 2;
                if (v0_0 != 2) {
                    return 0;
                }
            }
            return v1;
        }
    }

    public final com.google.android.recaptcha.internal.zzrc zzf()
    {
        if (this.zze != 1) {
            return com.google.android.recaptcha.internal.zzrc.zzk();
        } else {
            return ((com.google.android.recaptcha.internal.zzrc) this.zzf);
        }
    }

    public final com.google.android.recaptcha.internal.zzrr zzg()
    {
        if (this.zze != 2) {
            return com.google.android.recaptcha.internal.zzrr.zzg();
        } else {
            return ((com.google.android.recaptcha.internal.zzrr) this.zzf);
        }
    }

    public final Object zzh(int p2, Object p3, Object p4)
    {
        com.google.android.recaptcha.internal.zzmy v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zztx.zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[] {"zzf", "zze", com.google.android.recaptcha.internal.zzrc, com.google.android.recaptcha.internal.zzrr}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.recaptcha.internal.zztx();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.recaptcha.internal.zztw(0);
                    } else {
                        if (v2_1 == 5) {
                            return com.google.android.recaptcha.internal.zztx.zzb;
                        } else {
                            if (v2_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v2_10 = com.google.android.recaptcha.internal.zztx.zzd;
                                if (v2_10 != null) {
                                    return v2_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v2_12 = com.google.android.recaptcha.internal.zztx.zzd;
                                    if (v2_12 == null) {
                                        v2_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zztx.zzb);
                                        com.google.android.recaptcha.internal.zztx.zzd = v2_12;
                                    }
                                    return v2_12;
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
