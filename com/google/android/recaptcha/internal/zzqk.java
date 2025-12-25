package com.google.android.recaptcha.internal;
public final class zzqk extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzqk zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private com.google.android.recaptcha.internal.zzni zzk;

    static zzqk()
    {
        com.google.android.recaptcha.internal.zzqk v0_1 = new com.google.android.recaptcha.internal.zzqk();
        com.google.android.recaptcha.internal.zzqk.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzqk, v0_1);
        return;
    }

    private zzqk()
    {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = com.google.android.recaptcha.internal.zznd.zzy();
        return;
    }

    public static synthetic void zzM(com.google.android.recaptcha.internal.zzqk p0, String p1)
    {
        p1.getClass();
        p0.zzf = p1;
        return;
    }

    public static synthetic void zzN(com.google.android.recaptcha.internal.zzqk p0, String p1)
    {
        p1.getClass();
        p0.zzi = p1;
        return;
    }

    public static synthetic void zzO(com.google.android.recaptcha.internal.zzqk p0, String p1)
    {
        p0.zzg = "18.6.1";
        return;
    }

    public static com.google.android.recaptcha.internal.zzqh zzf()
    {
        return ((com.google.android.recaptcha.internal.zzqh) com.google.android.recaptcha.internal.zzqk.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzqk zzg()
    {
        return com.google.android.recaptcha.internal.zzqk.zzb;
    }

    public static synthetic void zzi(com.google.android.recaptcha.internal.zzqk p2, Iterable p3)
    {
        int v0_0 = p2.zzk;
        if (!v0_0.zzc()) {
            p2.zzk = com.google.android.recaptcha.internal.zznd.zzz(v0_0);
        }
        java.util.Iterator v3_1 = p3.iterator();
        while (v3_1.hasNext()) {
            p2.zzk.zzh(((com.google.android.recaptcha.internal.zzqi) v3_1.next()).zza());
        }
        return;
    }

    public static synthetic void zzj(com.google.android.recaptcha.internal.zzqk p0, int p1)
    {
        p0.zze = p1;
        return;
    }

    public static synthetic void zzk(com.google.android.recaptcha.internal.zzqk p0, String p1)
    {
        p1.getClass();
        p0.zzj = p1;
        return;
    }

    public static synthetic void zzl(com.google.android.recaptcha.internal.zzqk p0, String p1)
    {
        p1.getClass();
        p0.zzh = p1;
        return;
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
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzqk.zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007,", new Object[] {"zze", "zzk"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzqk();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzqh(0);
                    } else {
                        if (v8_1 == 5) {
                            return com.google.android.recaptcha.internal.zzqk.zzb;
                        } else {
                            if (v8_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v8_10 = com.google.android.recaptcha.internal.zzqk.zzd;
                                if (v8_10 != null) {
                                    return v8_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v8_12 = com.google.android.recaptcha.internal.zzqk.zzd;
                                    if (v8_12 == null) {
                                        v8_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzqk.zzb);
                                        com.google.android.recaptcha.internal.zzqk.zzd = v8_12;
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
