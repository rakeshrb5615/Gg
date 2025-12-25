package com.google.android.recaptcha.internal;
public final class zzmf extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzmf zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private boolean zzg;
    private byte zzh;

    static zzmf()
    {
        com.google.android.recaptcha.internal.zzmf v0_1 = new com.google.android.recaptcha.internal.zzmf();
        com.google.android.recaptcha.internal.zzmf.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzmf, v0_1);
        return;
    }

    private zzmf()
    {
        this.zzh = 2;
        this.zzf = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzmf zzf()
    {
        return com.google.android.recaptcha.internal.zzmf.zzb;
    }

    public final Object zzh(int p2, Object p3, Object p4)
    {
        com.google.android.recaptcha.internal.zzmy v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(this.zzh);
        } else {
            if (v2_1 == 2) {
                return new com.google.android.recaptcha.internal.zzou(com.google.android.recaptcha.internal.zzmf.zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1507\u0001", new Object[] {"zze", "zzf", "zzg"}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzmf();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzme(0);
                    } else {
                        if (v2_1 == 5) {
                            return com.google.android.recaptcha.internal.zzmf.zzb;
                        } else {
                            if (v2_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v2_9 = com.google.android.recaptcha.internal.zzmf.zzd;
                                if (v2_9 != null) {
                                    return v2_9;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v2_10 = com.google.android.recaptcha.internal.zzmf.zzd;
                                    if (v2_10 == null) {
                                        v2_10 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzmf.zzb);
                                        com.google.android.recaptcha.internal.zzmf.zzd = v2_10;
                                    }
                                    return v2_10;
                                }
                            } else {
                                com.google.android.recaptcha.internal.zzmy v2_14;
                                if (p3 != null) {
                                    v2_14 = 1;
                                } else {
                                    v2_14 = 0;
                                }
                                this.zzh = v2_14;
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
