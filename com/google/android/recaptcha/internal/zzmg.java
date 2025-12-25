package com.google.android.recaptcha.internal;
public final class zzmg extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzmg zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private com.google.android.recaptcha.internal.zznk zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private double zzj;
    private com.google.android.recaptcha.internal.zzle zzk;
    private String zzl;
    private byte zzm;

    static zzmg()
    {
        com.google.android.recaptcha.internal.zzmg v0_1 = new com.google.android.recaptcha.internal.zzmg();
        com.google.android.recaptcha.internal.zzmg.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzmg, v0_1);
        return;
    }

    private zzmg()
    {
        this.zzm = 2;
        this.zzf = com.google.android.recaptcha.internal.zzot.zze();
        this.zzg = "";
        this.zzk = com.google.android.recaptcha.internal.zzle.zzb;
        this.zzl = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzmg zzf()
    {
        return com.google.android.recaptcha.internal.zzmg.zzb;
    }

    public final Object zzh(int p10, Object p11, Object p12)
    {
        com.google.android.recaptcha.internal.zzmy v10_1 = (p10 - 1);
        if (v10_1 == null) {
            return Byte.valueOf(this.zzm);
        } else {
            if (v10_1 == 2) {
                Class v2 = com.google.android.recaptcha.internal.zzmf;
                String v4 = "zzh";
                String v6 = "zzj";
                return new com.google.android.recaptcha.internal.zzou(com.google.android.recaptcha.internal.zzmg.zzb, "\u0001\u0007\u0000\u0001\u0002\u0008\u0007\u0000\u0001\u0001\u0002\u041b\u0003\u1008\u0000\u0004\u1003\u0001\u0005\u1002\u0002\u0006\u1000\u0003\u0007\u100a\u0004\u0008\u1008\u0005", new Object[] {"zze", "zzl"}));
            } else {
                if (v10_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzmg();
                } else {
                    if (v10_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzmd(0);
                    } else {
                        if (v10_1 == 5) {
                            return com.google.android.recaptcha.internal.zzmg.zzb;
                        } else {
                            if (v10_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v10_10 = com.google.android.recaptcha.internal.zzmg.zzd;
                                if (v10_10 != null) {
                                    return v10_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v10_11 = com.google.android.recaptcha.internal.zzmg.zzd;
                                    if (v10_11 == null) {
                                        v10_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzmg.zzb);
                                        com.google.android.recaptcha.internal.zzmg.zzd = v10_11;
                                    }
                                    return v10_11;
                                }
                            } else {
                                com.google.android.recaptcha.internal.zzmy v10_14;
                                if (p11 != null) {
                                    v10_14 = 1;
                                } else {
                                    v10_14 = 0;
                                }
                                this.zzm = v10_14;
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
