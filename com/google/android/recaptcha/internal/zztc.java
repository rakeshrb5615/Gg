package com.google.android.recaptcha.internal;
public final class zztc extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zztc zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private String zze;
    private String zzf;
    private String zzg;

    static zztc()
    {
        com.google.android.recaptcha.internal.zztc v0_1 = new com.google.android.recaptcha.internal.zztc();
        com.google.android.recaptcha.internal.zztc.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zztc, v0_1);
        return;
    }

    private zztc()
    {
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zztc zzf()
    {
        return com.google.android.recaptcha.internal.zztc.zzb;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zztc.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[] {"zze", "zzf", "zzg"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zztc();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zztb(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zztc.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zztc.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zztc.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zztc.zzb);
                                        com.google.android.recaptcha.internal.zztc.zzd = v1_11;
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
