package com.google.android.recaptcha.internal;
public final class zzqt extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzqt zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    static zzqt()
    {
        com.google.android.recaptcha.internal.zzqt v0_1 = new com.google.android.recaptcha.internal.zzqt();
        com.google.android.recaptcha.internal.zzqt.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzqt, v0_1);
        return;
    }

    private zzqt()
    {
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzqt zzf()
    {
        return com.google.android.recaptcha.internal.zzqt.zzb;
    }

    public final Object zzh(int p7, Object p8, Object p9)
    {
        com.google.android.recaptcha.internal.zzmy v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzqt.zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208", new Object[] {"zze", "zzj"}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzqt();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzqr(0);
                    } else {
                        if (v7_1 == 5) {
                            return com.google.android.recaptcha.internal.zzqt.zzb;
                        } else {
                            if (v7_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v7_10 = com.google.android.recaptcha.internal.zzqt.zzd;
                                if (v7_10 != null) {
                                    return v7_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v7_12 = com.google.android.recaptcha.internal.zzqt.zzd;
                                    if (v7_12 == null) {
                                        v7_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzqt.zzb);
                                        com.google.android.recaptcha.internal.zzqt.zzd = v7_12;
                                    }
                                    return v7_12;
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
