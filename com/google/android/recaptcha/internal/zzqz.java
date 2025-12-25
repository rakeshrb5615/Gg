package com.google.android.recaptcha.internal;
public final class zzqz extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzqz zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private int zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private int zzk;

    static zzqz()
    {
        com.google.android.recaptcha.internal.zzqz v0_1 = new com.google.android.recaptcha.internal.zzqz();
        com.google.android.recaptcha.internal.zzqz.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzqz, v0_1);
        return;
    }

    private zzqz()
    {
        this.zzf = "";
        this.zzh = "";
        this.zzj = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzqz zzf()
    {
        return com.google.android.recaptcha.internal.zzqz.zzb;
    }

    public final Object zzh(int p8, Object p9, Object p10)
    {
        com.google.android.recaptcha.internal.zzmy v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzqz.zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0004\u0006\u0208\u0007\u0004", new Object[] {"zze", "zzk"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzqz();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzqx(0);
                    } else {
                        if (v8_1 == 5) {
                            return com.google.android.recaptcha.internal.zzqz.zzb;
                        } else {
                            if (v8_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v8_10 = com.google.android.recaptcha.internal.zzqz.zzd;
                                if (v8_10 != null) {
                                    return v8_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v8_12 = com.google.android.recaptcha.internal.zzqz.zzd;
                                    if (v8_12 == null) {
                                        v8_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzqz.zzb);
                                        com.google.android.recaptcha.internal.zzqz.zzd = v8_12;
                                    }
                                    return v8_12;
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
