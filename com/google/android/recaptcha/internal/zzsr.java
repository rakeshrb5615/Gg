package com.google.android.recaptcha.internal;
public final class zzsr extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsr zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private long zzg;
    private int zzh;
    private com.google.android.recaptcha.internal.zznk zzi;
    private com.google.android.recaptcha.internal.zzle zzj;
    private String zzk;
    private String zzl;

    static zzsr()
    {
        com.google.android.recaptcha.internal.zzsr v0_1 = new com.google.android.recaptcha.internal.zzsr();
        com.google.android.recaptcha.internal.zzsr.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsr, v0_1);
        return;
    }

    private zzsr()
    {
        this.zzf = "";
        this.zzi = com.google.android.recaptcha.internal.zznd.zzB();
        this.zzj = com.google.android.recaptcha.internal.zzle.zzb;
        this.zzk = "";
        this.zzl = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsr zzg()
    {
        return com.google.android.recaptcha.internal.zzsr.zzb;
    }

    public static com.google.android.recaptcha.internal.zzsr zzi()
    {
        return com.google.android.recaptcha.internal.zzsr.zzb;
    }

    public final com.google.android.recaptcha.internal.zzle zzf()
    {
        return this.zzj;
    }

    public final Object zzh(int p10, Object p11, Object p12)
    {
        com.google.android.recaptcha.internal.zzmy v10_1 = (p10 - 1);
        if (v10_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v10_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                String v6 = "zzj";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsr.zzb, "\u0000\u0007\u0000\u0001\u0001\u0008\u0007\u0000\u0001\u0000\u0001\u1208\u0000\u0002\u1002\u0001\u0004\u100c\u0002\u0005\u001b\u0006\u100a\u0003\u0007\u1208\u0004\u0008\u1208\u0005", new Object[] {"zze", "zzl"}));
            } else {
                if (v10_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsr();
                } else {
                    if (v10_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzsq(0);
                    } else {
                        if (v10_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsr.zzb;
                        } else {
                            if (v10_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v10_11 = com.google.android.recaptcha.internal.zzsr.zzd;
                                if (v10_11 != null) {
                                    return v10_11;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v10_12 = com.google.android.recaptcha.internal.zzsr.zzd;
                                    if (v10_12 == null) {
                                        v10_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsr.zzb);
                                        com.google.android.recaptcha.internal.zzsr.zzd = v10_12;
                                    }
                                    return v10_12;
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
        return this.zzi;
    }
}
