package com.google.android.recaptcha.internal;
public final class zzti extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzti zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private com.google.android.recaptcha.internal.zznk zze;
    private int zzf;

    static zzti()
    {
        com.google.android.recaptcha.internal.zzti v0_1 = new com.google.android.recaptcha.internal.zzti();
        com.google.android.recaptcha.internal.zzti.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzti, v0_1);
        return;
    }

    private zzti()
    {
        this.zze = com.google.android.recaptcha.internal.zznd.zzB();
        return;
    }

    public static com.google.android.recaptcha.internal.zztf zzf()
    {
        return ((com.google.android.recaptcha.internal.zztf) com.google.android.recaptcha.internal.zzti.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzti zzg()
    {
        return com.google.android.recaptcha.internal.zzti.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzti p0, Iterable p1)
    {
        com.google.android.recaptcha.internal.zzko.zzc(p1, p0.zzl().zze);
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzti p0, com.google.android.recaptcha.internal.zzth p1)
    {
        p1.getClass();
        p0.zzl().zze.add(p1);
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzti p0, int p1)
    {
        p0.zzf = p1;
        return;
    }

    private final void zzl()
    {
        com.google.android.recaptcha.internal.zznk v0_0 = this.zze;
        if (!v0_0.zzc()) {
            this.zze = com.google.android.recaptcha.internal.zznd.zzC(v0_0);
        }
        return;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzti.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[] {"zze", com.google.android.recaptcha.internal.zzth, "zzf"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzti();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zztf(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzti.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzti.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzti.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzti.zzb);
                                        com.google.android.recaptcha.internal.zzti.zzd = v1_11;
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
