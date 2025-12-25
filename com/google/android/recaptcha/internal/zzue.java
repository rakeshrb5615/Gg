package com.google.android.recaptcha.internal;
public final class zzue extends com.google.android.recaptcha.internal.zznd implements com.google.android.recaptcha.internal.zzoj {
    private static final com.google.android.recaptcha.internal.zzue zzb;
    private static volatile com.google.android.recaptcha.internal.zzoq zzd;
    private int zze;
    private Object zzf;

    static zzue()
    {
        com.google.android.recaptcha.internal.zzue v0_1 = new com.google.android.recaptcha.internal.zzue();
        com.google.android.recaptcha.internal.zzue.zzb = v0_1;
        com.google.android.recaptcha.internal.zznd.zzI(com.google.android.recaptcha.internal.zzue, v0_1);
        return;
    }

    private zzue()
    {
        this.zze = 0;
        return;
    }

    public static bridge synthetic com.google.android.recaptcha.internal.zzue zzN()
    {
        return com.google.android.recaptcha.internal.zzue.zzb;
    }

    public final com.google.android.recaptcha.internal.zzle zzM()
    {
        if (this.zze != 3) {
            return com.google.android.recaptcha.internal.zzle.zzb;
        } else {
            return ((com.google.android.recaptcha.internal.zzle) this.zzf);
        }
    }

    public final String zzO()
    {
        if (this.zze != 4) {
            return "";
        } else {
            return ((String) this.zzf);
        }
    }

    public final String zzP()
    {
        if (this.zze != 12) {
            return "";
        } else {
            return ((String) this.zzf);
        }
    }

    public final boolean zzQ()
    {
        if (this.zze != 2) {
            return 0;
        } else {
            return ((Boolean) this.zzf).booleanValue();
        }
    }

    public final boolean zzR()
    {
        if (this.zze != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzS()
    {
        switch (this.zze) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public final double zzf()
    {
        if (this.zze != 11) {
            return 0;
        } else {
            return ((Double) this.zzf).doubleValue();
        }
    }

    public final float zzg()
    {
        if (this.zze != 10) {
            return 0;
        } else {
            return ((Float) this.zzf).floatValue();
        }
    }

    public final Object zzh(int p1, Object p2, Object p3)
    {
        com.google.android.recaptcha.internal.zzmy v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.recaptcha.internal.zznd.zzF(com.google.android.recaptcha.internal.zzue.zzb, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004\u023b\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\u0008C\u0000\t6\u0000\n4\u0000\u000b3\u0000\u000c\u023b\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[] {"zzf", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.recaptcha.internal.zzue();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.recaptcha.internal.zzud(0);
                    } else {
                        if (v1_1 == 5) {
                            return com.google.android.recaptcha.internal.zzue.zzb;
                        } else {
                            if (v1_1 == 6) {
                                com.google.android.recaptcha.internal.zzmy v1_10 = com.google.android.recaptcha.internal.zzue.zzd;
                                if (v1_10 != null) {
                                    return v1_10;
                                } else {
                                    com.google.android.recaptcha.internal.zzmy v1_11 = com.google.android.recaptcha.internal.zzue.zzd;
                                    if (v1_11 == null) {
                                        v1_11 = new com.google.android.recaptcha.internal.zzmy(com.google.android.recaptcha.internal.zzue.zzb);
                                        com.google.android.recaptcha.internal.zzue.zzd = v1_11;
                                    }
                                    return v1_11;
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

    public final int zzi()
    {
        if (this.zze != 1) {
            return 0;
        } else {
            return ((Integer) this.zzf).intValue();
        }
    }

    public final int zzj()
    {
        if (this.zze != 5) {
            return 0;
        } else {
            return ((Integer) this.zzf).intValue();
        }
    }

    public final int zzk()
    {
        if (this.zze != 6) {
            return 0;
        } else {
            return ((Integer) this.zzf).intValue();
        }
    }

    public final long zzl()
    {
        if (this.zze != 8) {
            return 0;
        } else {
            return ((Long) this.zzf).longValue();
        }
    }
}
