package com.google.android.recaptcha.internal;
public final class zzsc extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzsc zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private com.google.android.recaptcha.internal.zznj zzl;
    private com.google.android.recaptcha.internal.zzle zzm;
    private String zzn;
    private com.google.android.recaptcha.internal.zzse zzo;
    private com.google.android.recaptcha.internal.zzsa zzp;

    static zzsc()
    {
        com.google.android.recaptcha.internal.zzsc v0_1 = new com.google.android.recaptcha.internal.zzsc();
        com.google.android.recaptcha.internal.zzsc.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzsc, v0_1);
        return;
    }

    private zzsc()
    {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = com.google.android.recaptcha.internal.zznd.zzA();
        this.zzm = com.google.android.recaptcha.internal.zzle.zzb;
        this.zzn = "";
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzsc zzg()
    {
        return com.google.android.recaptcha.internal.zzsc.zzb;
    }

    public static com.google.android.recaptcha.internal.zzsc zzi()
    {
        return com.google.android.recaptcha.internal.zzsc.zzb;
    }

    public final String zzM()
    {
        return this.zzh;
    }

    public final String zzN()
    {
        return this.zzj;
    }

    public final String zzO()
    {
        return this.zzk;
    }

    public final java.util.List zzP()
    {
        return this.zzl;
    }

    public final boolean zzQ()
    {
        if ((this.zze & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzR()
    {
        if ((this.zze & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzS()
    {
        if ((this.zze & 256) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzT()
    {
        if ((this.zze & 64) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.recaptcha.internal.zzle zzf()
    {
        return this.zzm;
    }

    public final Object zzh(int p13, Object p14, Object p15)
    {
        com.google.android.recaptcha.internal.zzmy v13_1 = (p13 - 1);
        if (v13_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v13_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                String v6 = "zzk";
                String v8 = "zzm";
                String v10 = "zzo";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzsc.zzb, "\u0000\u000b\u0000\u0001\u0001\u000c\u000b\u0000\u0001\u0000\u0001\u1208\u0000\u0002\u1208\u0001\u0003\u1208\u0002\u0004\u1208\u0003\u0005\u1208\u0004\u0006\u1208\u0005\u0007%\u0008\u100a\u0006\t\u1208\u0007\u000b\u1009\u0008\u000c\u1009\t", new Object[] {"zze", "zzp"}));
            } else {
                if (v13_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzsc();
                } else {
                    if (v13_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzsb(0);
                    } else {
                        if (v13_1 == 5) {
                            return com.google.android.recaptcha.internal.zzsc.zzb;
                        } else {
                            if (v13_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v13_11 = com.google.android.recaptcha.internal.zzsc.zzd;
                                if (v13_11 != null) {
                                    return v13_11;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v13_12 = com.google.android.recaptcha.internal.zzsc.zzd;
                                    if (v13_12 == null) {
                                        v13_12 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzsc.zzb);
                                        com.google.android.recaptcha.internal.zzsc.zzd = v13_12;
                                    }
                                    return v13_12;
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

    public final com.google.android.recaptcha.internal.zzse zzj()
    {
        com.google.android.recaptcha.internal.zzse v0 = this.zzo;
        if (v0 == null) {
            v0 = com.google.android.recaptcha.internal.zzse.zzk();
        }
        return v0;
    }

    public final String zzk()
    {
        return this.zzg;
    }

    public final String zzl()
    {
        return this.zzi;
    }
}
