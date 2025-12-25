package com.google.android.recaptcha.internal;
public final class zzrv extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzrv zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private com.google.android.recaptcha.internal.zzrt zzf;
    private com.google.android.recaptcha.internal.zzrt zzg;

    static zzrv()
    {
        com.google.android.recaptcha.internal.zzrv v0_1 = new com.google.android.recaptcha.internal.zzrv();
        com.google.android.recaptcha.internal.zzrv.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzrv, v0_1);
        return;
    }

    private zzrv()
    {
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzrv zzi()
    {
        return com.google.android.recaptcha.internal.zzrv.zzb;
    }

    public static com.google.android.recaptcha.internal.zzrv zzj(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zzrv) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zzrv.zzb, p1));
    }

    public final com.google.android.recaptcha.internal.zzrt zzf()
    {
        com.google.android.recaptcha.internal.zzrt v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.recaptcha.internal.zzrt.zzg();
        }
        return v0;
    }

    public final com.google.android.recaptcha.internal.zzrt zzg()
    {
        com.google.android.recaptcha.internal.zzrt v0 = this.zzg;
        if (v0 == null) {
            v0 = com.google.android.recaptcha.internal.zzrt.zzg();
        }
        return v0;
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzrv.zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] {"zze", "zzf", "zzg"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzrv();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzru(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzrv.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzrv.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzrv.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzrv.zzb);
                                        com.google.android.recaptcha.internal.zzrv.zzd = v1_11;
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
