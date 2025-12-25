package com.google.android.recaptcha.internal;
public final class zztq extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zztq zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private String zze;
    private String zzf;

    static zztq()
    {
        com.google.android.recaptcha.internal.zztq v0_1 = new com.google.android.recaptcha.internal.zztq();
        com.google.android.recaptcha.internal.zztq.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zztq, v0_1);
        return;
    }

    private zztq()
    {
        this.zze = "";
        this.zzf = "";
        return;
    }

    public static com.google.android.recaptcha.internal.zztp zzf()
    {
        return ((com.google.android.recaptcha.internal.zztp) com.google.android.recaptcha.internal.zztq.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zztq zzg()
    {
        return com.google.android.recaptcha.internal.zztq.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zztq p0, String p1)
    {
        p1.getClass();
        p0.zze = p1;
        return;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zztq.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] {"zze", "zzf"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zztq();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zztp(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zztq.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zztq.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zztq.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zztq.zzb);
                                        com.google.android.recaptcha.internal.zztq.zzd = v1_11;
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
