package com.google.android.recaptcha.internal;
public final class zzrr extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzrr zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh;
    private String zzi;
    private com.google.android.recaptcha.internal.zzml zzj;
    private com.google.android.recaptcha.internal.zzpj zzk;
    private int zzl;
    private com.google.android.recaptcha.internal.zzqz zzm;
    private com.google.android.recaptcha.internal.zznk zzn;

    static zzrr()
    {
        com.google.android.recaptcha.internal.zzrr v0_1 = new com.google.android.recaptcha.internal.zzrr();
        com.google.android.recaptcha.internal.zzrr.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzrr, v0_1);
        return;
    }

    private zzrr()
    {
        this.zzh = "";
        this.zzi = "";
        this.zzn = com.google.android.recaptcha.internal.zznd.zzB();
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzrr zzf()
    {
        return com.google.android.recaptcha.internal.zzrr.zzb;
    }

    public static com.google.android.recaptcha.internal.zzrr zzg()
    {
        return com.google.android.recaptcha.internal.zzrr.zzb;
    }

    public static com.google.android.recaptcha.internal.zzrr zzi(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zzrr) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zzrr.zzb, p1));
    }

    public final Object zzh(int p12, Object p13, Object p14)
    {
        com.google.android.recaptcha.internal.zzmy v12_1 = (p12 - 1);
        if (v12_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v12_1 == 2) {
                String v2 = "zzj";
                String v4 = "zzl";
                Class v6 = com.google.android.recaptcha.internal.zzri;
                String v8 = "zzh";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzrr.zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003\u1009\u0000\u0004\u1009\u0001\u0005\u000c\u0007\u001b\u0008\u000c\t\u0208\n\u0208\u000b\u1009\u0002", new Object[] {"zze", "zzm"}));
            } else {
                if (v12_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzrr();
                } else {
                    if (v12_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzrp(0);
                    } else {
                        if (v12_1 == 5) {
                            return com.google.android.recaptcha.internal.zzrr.zzb;
                        } else {
                            if (v12_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v12_11 = com.google.android.recaptcha.internal.zzrr.zzd;
                                if (v12_11 != null) {
                                    return v12_11;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v12_12 = com.google.android.recaptcha.internal.zzrr.zzd;
                                    if (v12_12 == null) {
                                        v12_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzrr.zzb);
                                        com.google.android.recaptcha.internal.zzrr.zzd = v12_12;
                                    }
                                    return v12_12;
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
