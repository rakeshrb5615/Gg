package com.google.android.recaptcha.internal;
public final class zzsi extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsi zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private com.google.android.recaptcha.internal.zzsm zzk;
    private com.google.android.recaptcha.internal.zzsg zzl;
    private com.google.android.recaptcha.internal.zzsk zzm;
    private com.google.android.recaptcha.internal.zzry zzn;

    static zzsi()
    {
        com.google.android.recaptcha.internal.zzsi v0_1 = new com.google.android.recaptcha.internal.zzsi();
        com.google.android.recaptcha.internal.zzsi.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsi, v0_1);
        return;
    }

    private zzsi()
    {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        return;
    }

    public static synthetic void zzN(com.google.android.recaptcha.internal.zzsi p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 1);
        p1.zzf = p2;
        return;
    }

    public static synthetic void zzO(com.google.android.recaptcha.internal.zzsi p0, com.google.android.recaptcha.internal.zzsg p1)
    {
        p1.getClass();
        p0.zzl = p1;
        p0.zze = (p0.zze | 64);
        return;
    }

    public static synthetic void zzP(com.google.android.recaptcha.internal.zzsi p0, com.google.android.recaptcha.internal.zzsm p1)
    {
        p1.getClass();
        p0.zzk = p1;
        p0.zze = (p0.zze | 32);
        return;
    }

    public static synthetic void zzQ(com.google.android.recaptcha.internal.zzsi p0, com.google.android.recaptcha.internal.zzsk p1)
    {
        p1.getClass();
        p0.zzm = p1;
        p0.zze = (p0.zze | 128);
        return;
    }

    public static com.google.android.recaptcha.internal.zzsh zzf()
    {
        return ((com.google.android.recaptcha.internal.zzsh) com.google.android.recaptcha.internal.zzsi.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsi zzg()
    {
        return com.google.android.recaptcha.internal.zzsi.zzb;
    }

    public static com.google.android.recaptcha.internal.zzsi zzi(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zzsi) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zzsi.zzb, p1));
    }

    public final String zzM()
    {
        return this.zzh;
    }

    public final Object zzh(int p11, Object p12, Object p13)
    {
        com.google.android.recaptcha.internal.zzmy v11_1 = (p11 - 1);
        if (v11_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v11_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                String v6 = "zzk";
                String v8 = "zzm";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsi.zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1208\u0000\u0002\u1208\u0001\u0003\u1208\u0002\u0004\u1208\u0003\u0005\u1208\u0004\u0006\u1009\u0005\u0007\u1009\u0006\u0008\u1009\u0007\t\u1009\u0008", new Object[] {"zze", "zzn"}));
            } else {
                if (v11_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsi();
                } else {
                    if (v11_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzsh(0);
                    } else {
                        if (v11_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsi.zzb;
                        } else {
                            if (v11_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v11_11 = com.google.android.recaptcha.internal.zzsi.zzd;
                                if (v11_11 != null) {
                                    return v11_11;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v11_12 = com.google.android.recaptcha.internal.zzsi.zzd;
                                    if (v11_12 == null) {
                                        v11_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsi.zzb);
                                        com.google.android.recaptcha.internal.zzsi.zzd = v11_12;
                                    }
                                    return v11_12;
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
        return this.zzi;
    }

    public final String zzk()
    {
        return this.zzf;
    }

    public final String zzl()
    {
        return this.zzg;
    }
}
