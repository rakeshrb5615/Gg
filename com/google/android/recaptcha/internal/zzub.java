package com.google.android.recaptcha.internal;
public final class zzub extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzub zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private com.google.android.recaptcha.internal.zzni zzg;
    private com.google.android.recaptcha.internal.zznj zzh;
    private com.google.android.recaptcha.internal.zztl zzi;

    static zzub()
    {
        com.google.android.recaptcha.internal.zzub v0_1 = new com.google.android.recaptcha.internal.zzub();
        com.google.android.recaptcha.internal.zzub.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzub, v0_1);
        return;
    }

    private zzub()
    {
        this.zzf = "";
        this.zzg = com.google.android.recaptcha.internal.zznd.zzy();
        this.zzh = com.google.android.recaptcha.internal.zznd.zzA();
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzub zzg()
    {
        return com.google.android.recaptcha.internal.zzub.zzb;
    }

    public static com.google.android.recaptcha.internal.zzub zzi(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zzub) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zzub.zzb, p1));
    }

    public final com.google.android.recaptcha.internal.zztl zzf()
    {
        com.google.android.recaptcha.internal.zztl v0 = this.zzi;
        if (v0 == null) {
            v0 = com.google.android.recaptcha.internal.zztl.zzg();
        }
        return v0;
    }

    public final Object zzh(int p3, Object p4, Object p5)
    {
        com.google.android.recaptcha.internal.zzmy v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzub.zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0208\u0002\'\u0003%\u0004\u1009\u0000", new Object[] {"zze", "zzf", "zzg", "zzh", "zzi"}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzub();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzua(0);
                    } else {
                        if (v3_1 == 5) {
                            return com.google.android.recaptcha.internal.zzub.zzb;
                        } else {
                            if (v3_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v3_10 = com.google.android.recaptcha.internal.zzub.zzd;
                                if (v3_10 != null) {
                                    return v3_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v3_12 = com.google.android.recaptcha.internal.zzub.zzd;
                                    if (v3_12 == null) {
                                        v3_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzub.zzb);
                                        com.google.android.recaptcha.internal.zzub.zzd = v3_12;
                                    }
                                    return v3_12;
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

    public final String zzj()
    {
        return this.zzf;
    }

    public final java.util.List zzk()
    {
        return this.zzh;
    }
}
