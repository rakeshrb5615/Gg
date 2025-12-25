package com.google.android.recaptcha.internal;
public final class zzsp extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsp zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private com.google.android.recaptcha.internal.zzsi zzm;

    static zzsp()
    {
        com.google.android.recaptcha.internal.zzsp v0_1 = new com.google.android.recaptcha.internal.zzsp();
        com.google.android.recaptcha.internal.zzsp.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsp, v0_1);
        return;
    }

    private zzsp()
    {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
        return;
    }

    public static synthetic void zzM(com.google.android.recaptcha.internal.zzsp p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 4);
        p1.zzh = p2;
        return;
    }

    public static com.google.android.recaptcha.internal.zzso zzf()
    {
        return ((com.google.android.recaptcha.internal.zzso) com.google.android.recaptcha.internal.zzsp.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsp zzg()
    {
        return com.google.android.recaptcha.internal.zzsp.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzsp p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 8);
        p1.zzi = p2;
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzsp p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 2);
        p1.zzg = p2;
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzsp p1, String p2)
    {
        p2.getClass();
        p1.zze = (p1.zze | 1);
        p1.zzf = p2;
        return;
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zzsp p0, com.google.android.recaptcha.internal.zzsi p1)
    {
        p1.getClass();
        p0.zzm = p1;
        p0.zze = (p0.zze | 128);
        return;
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
                String v6 = "zzk";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsp.zzb, "\u0000\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u1208\u0000\u0002\u1208\u0001\u0003\u1208\u0002\u0004\u1208\u0003\u0005\u1208\u0004\u0006\u1208\u0005\u0007\u1208\u0006\u0008\u1009\u0007", new Object[] {"zze", "zzm"}));
            } else {
                if (v10_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsp();
                } else {
                    if (v10_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzso(0);
                    } else {
                        if (v10_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsp.zzb;
                        } else {
                            if (v10_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v10_11 = com.google.android.recaptcha.internal.zzsp.zzd;
                                if (v10_11 != null) {
                                    return v10_11;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v10_12 = com.google.android.recaptcha.internal.zzsp.zzd;
                                    if (v10_12 == null) {
                                        v10_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsp.zzb);
                                        com.google.android.recaptcha.internal.zzsp.zzd = v10_12;
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
}
