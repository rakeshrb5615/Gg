package com.google.android.recaptcha.internal;
public final class zzsz extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsz zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private com.google.android.recaptcha.internal.zznk zzg;

    static zzsz()
    {
        com.google.android.recaptcha.internal.zzsz v0_1 = new com.google.android.recaptcha.internal.zzsz();
        com.google.android.recaptcha.internal.zzsz.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsz, v0_1);
        return;
    }

    private zzsz()
    {
        this.zzf = "";
        this.zzg = com.google.android.recaptcha.internal.zznd.zzB();
        return;
    }

    public static com.google.android.recaptcha.internal.zzsy zzf()
    {
        return ((com.google.android.recaptcha.internal.zzsy) com.google.android.recaptcha.internal.zzsz.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsz zzg()
    {
        return com.google.android.recaptcha.internal.zzsz.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzsz p0, Iterable p1)
    {
        com.google.android.recaptcha.internal.zzko.zzc(p1, p0.zzl().zzg);
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzsz p0, com.google.android.recaptcha.internal.zzsx p1)
    {
        p1.getClass();
        p0.zzl().zzg.add(p1);
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzsz p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 1);
        p1.zzf = p2;
        return;
    }

    private final void zzl()
    {
        com.google.android.recaptcha.internal.zznk v0_0 = this.zzg;
        if (!v0_0.zzc()) {
            this.zzg = com.google.android.recaptcha.internal.zznd.zzC(v0_0);
        }
        return;
    }

    public final Object zzh(int p2, Object p3, Object p4)
    {
        com.google.android.recaptcha.internal.zzmy v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsz.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000", new Object[] {"zze", "zzg", com.google.android.recaptcha.internal.zzsx, "zzf"}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsz();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzsy(0);
                    } else {
                        if (v2_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsz.zzb;
                        } else {
                            if (v2_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v2_10 = com.google.android.recaptcha.internal.zzsz.zzd;
                                if (v2_10 != null) {
                                    return v2_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v2_12 = com.google.android.recaptcha.internal.zzsz.zzd;
                                    if (v2_12 == null) {
                                        v2_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsz.zzb);
                                        com.google.android.recaptcha.internal.zzsz.zzd = v2_12;
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
