package com.google.android.recaptcha.internal;
public final class zzrc extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzrc zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private int zzf;
    private Object zzg;
    private int zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private com.google.android.recaptcha.internal.zzml zzo;
    private int zzp;
    private com.google.android.recaptcha.internal.zzqq zzq;
    private com.google.android.recaptcha.internal.zzro zzr;
    private String zzs;
    private com.google.android.recaptcha.internal.zzpj zzt;
    private com.google.android.recaptcha.internal.zzml zzu;
    private com.google.android.recaptcha.internal.zzni zzv;
    private int zzw;

    static zzrc()
    {
        com.google.android.recaptcha.internal.zzrc v0_1 = new com.google.android.recaptcha.internal.zzrc();
        com.google.android.recaptcha.internal.zzrc.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzrc, v0_1);
        return;
    }

    private zzrc()
    {
        this.zzf = 0;
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
        this.zzm = "";
        this.zzs = "";
        this.zzv = com.google.android.recaptcha.internal.zznd.zzy();
        return;
    }

    public static synthetic void zzO(com.google.android.recaptcha.internal.zzrc p1, int p2)
    {
        int v2_0 = p1.zzv;
        if (!v2_0.zzc()) {
            p1.zzv = com.google.android.recaptcha.internal.zznd.zzz(v2_0);
        }
        p1.zzv.zzh(0);
        return;
    }

    public static synthetic void zzP(com.google.android.recaptcha.internal.zzrc p0, String p1)
    {
        p1.getClass();
        p0.zzj = p1;
        return;
    }

    public static synthetic void zzQ(com.google.android.recaptcha.internal.zzrc p0, long p1)
    {
        p0.zzn = p1;
        return;
    }

    public static synthetic void zzR(com.google.android.recaptcha.internal.zzrc p0, com.google.android.recaptcha.internal.zzqq p1)
    {
        p0.zzq = p1;
        p0.zze = (p0.zze | 2);
        return;
    }

    public static synthetic void zzS(com.google.android.recaptcha.internal.zzrc p0, String p1)
    {
        p1.getClass();
        p0.zzk = p1;
        return;
    }

    public static synthetic void zzT(com.google.android.recaptcha.internal.zzrc p0, com.google.android.recaptcha.internal.zzro p1)
    {
        p1.getClass();
        p0.zzr = p1;
        p0.zze = (p0.zze | 4);
        return;
    }

    public static synthetic void zzU(com.google.android.recaptcha.internal.zzrc p1, int p2)
    {
        p1.zze = (p1.zze | 32);
        p1.zzw = p2;
        return;
    }

    public static synthetic void zzV(com.google.android.recaptcha.internal.zzrc p0, String p1)
    {
        p0.zzs = p1;
        return;
    }

    public static synthetic void zzW(com.google.android.recaptcha.internal.zzrc p0, String p1)
    {
        p0.zzl = p1;
        return;
    }

    public static synthetic void zzaa(com.google.android.recaptcha.internal.zzrc p0, int p1)
    {
        p0.zzh = (p1 - 2);
        return;
    }

    public static synthetic void zzab(com.google.android.recaptcha.internal.zzrc p1, int p2)
    {
        if (p2 == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        } else {
            p1.zzi = (p2 - 2);
            return;
        }
    }

    public static synthetic void zzac(com.google.android.recaptcha.internal.zzrc p0, int p1)
    {
        p0.zzp = (p1 - 2);
        return;
    }

    public static com.google.android.recaptcha.internal.zzra zzi()
    {
        return ((com.google.android.recaptcha.internal.zzra) com.google.android.recaptcha.internal.zzrc.zzb.zzq());
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzrc zzj()
    {
        return com.google.android.recaptcha.internal.zzrc.zzb;
    }

    public static com.google.android.recaptcha.internal.zzrc zzk()
    {
        return com.google.android.recaptcha.internal.zzrc.zzb;
    }

    public static com.google.android.recaptcha.internal.zzrc zzl(byte[] p1)
    {
        return ((com.google.android.recaptcha.internal.zzrc) com.google.android.recaptcha.internal.zznd.zzx(com.google.android.recaptcha.internal.zzrc.zzb, p1));
    }

    public final String zzM()
    {
        return this.zzk;
    }

    public final String zzN()
    {
        return this.zzl;
    }

    public final boolean zzX()
    {
        if ((this.zze & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzY()
    {
        int v0_1;
        switch (this.zzh) {
            case 0:
                v0_1 = 2;
                break;
            case 1:
                v0_1 = 3;
                break;
            case 2:
                v0_1 = 4;
                break;
            case 3:
                v0_1 = 5;
                break;
            case 4:
                v0_1 = 6;
                break;
            case 5:
                v0_1 = 7;
                break;
            case 6:
                v0_1 = 8;
                break;
            case 7:
                v0_1 = 9;
                break;
            case 8:
                v0_1 = 10;
                break;
            case 9:
                v0_1 = 11;
                break;
            case 10:
                v0_1 = 12;
                break;
            case 11:
                v0_1 = 13;
                break;
            case 12:
                v0_1 = 14;
                break;
            case 13:
                v0_1 = 15;
                break;
            case 14:
                v0_1 = 16;
                break;
            case 15:
                v0_1 = 17;
                break;
            case 16:
                v0_1 = 18;
                break;
            case 17:
                v0_1 = 19;
                break;
            case 18:
                v0_1 = 20;
                break;
            case 19:
                v0_1 = 21;
                break;
            case 20:
                v0_1 = 22;
                break;
            case 21:
                v0_1 = 23;
                break;
            case 22:
                v0_1 = 24;
                break;
            case 23:
                v0_1 = 25;
                break;
            case 24:
                v0_1 = 26;
                break;
            case 25:
                v0_1 = 27;
                break;
            case 26:
                v0_1 = 28;
                break;
            case 27:
                v0_1 = 29;
                break;
            case 28:
                v0_1 = 30;
                break;
            case 29:
                v0_1 = 31;
                break;
            case 30:
                v0_1 = 32;
                break;
            case 31:
                v0_1 = 33;
                break;
            case 32:
                v0_1 = 34;
                break;
            case 33:
                v0_1 = 35;
                break;
            case 34:
                v0_1 = 36;
                break;
            case 35:
                v0_1 = 37;
                break;
            case 36:
                v0_1 = 38;
                break;
            case 37:
                v0_1 = 39;
                break;
            case 38:
                v0_1 = 40;
                break;
            case 39:
                v0_1 = 41;
                break;
            case 40:
                v0_1 = 42;
                break;
            default:
                v0_1 = 0;
        }
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final int zzZ()
    {
        int v0 = this.zzp;
        int v1 = 2;
        if (v0 != 0) {
            if (v0 == 1) {
                v1 = 3;
            } else {
                if (v0 == 2) {
                    v1 = 4;
                } else {
                    v1 = 0;
                }
            }
        }
        if (v1 != 0) {
            return v1;
        } else {
            return 1;
        }
    }

    public final long zzf()
    {
        return this.zzn;
    }

    public final com.google.android.recaptcha.internal.zzqq zzg()
    {
        com.google.android.recaptcha.internal.zzqq v0 = this.zzq;
        if (v0 == null) {
            v0 = com.google.android.recaptcha.internal.zzqq.zzj();
        }
        return v0;
    }

    public final Object zzh(int p23, Object p24, Object p25)
    {
        com.google.android.recaptcha.internal.zzmy v0_0 = (p23 - 1);
        if (v0_0 == null) {
            return Byte.valueOf(1);
        } else {
            if (v0_0 == 2) {
                String v4 = "zze";
                String v6 = "zzk";
                String v8 = "zzp";
                String v10 = "zzr";
                String v12 = "zzl";
                String v14 = "zzo";
                String v16 = "zzu";
                Class v18 = com.google.android.recaptcha.internal.zzqg;
                String v20 = "zzw";
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzrc.zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\u000c\u0002\u0208\u0003\u0003\u0004\u000c\u0005\u1009\u0001\u0006\u1009\u0002\u0007\u0208\u0008\u0208\t\u0208\n\u1009\u0000\u000b\u1009\u0003\r\u1009\u0004\u000e\u0208\u000f<\u0000\u0011\'\u0012\u1004\u0005\u0013\u000c", new Object[] {"zzg", "zzi"}));
            } else {
                if (v0_0 == 3) {
                    return new com.google.android.recaptcha.internal.zzrc();
                } else {
                    if (v0_0 == 4) {
                        return new com.google.android.recaptcha.internal.zzra(0);
                    } else {
                        if (v0_0 == 5) {
                            return com.google.android.recaptcha.internal.zzrc.zzb;
                        } else {
                            if (v0_0 == 6) {
                                com.google.android.recaptcha.internal.zzmy v0_10 = com.google.android.recaptcha.internal.zzrc.zzd;
                                if (v0_10 != null) {
                                    return v0_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v0_11 = com.google.android.recaptcha.internal.zzrc.zzd;
                                    if (v0_11 == null) {
                                        v0_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzrc.zzb);
                                        com.google.android.recaptcha.internal.zzrc.zzd = v0_11;
                                    }
                                    return v0_11;
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
