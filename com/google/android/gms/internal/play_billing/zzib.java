package com.google.android.gms.internal.play_billing;
public final class zzib extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzib zzb;
    private int zzd;
    private int zze;
    private Object zzf;
    private int zzg;
    private int zzh;

    static zzib()
    {
        com.google.android.gms.internal.play_billing.zzib v0_1 = new com.google.android.gms.internal.play_billing.zzib();
        com.google.android.gms.internal.play_billing.zzib.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzib, v0_1);
        return;
    }

    private zzib()
    {
        this.zze = 0;
        return;
    }

    public static synthetic void zzB(com.google.android.gms.internal.play_billing.zzib p0, com.google.android.gms.internal.play_billing.zzil p1)
    {
        p0.zzh = p1.zza();
        p0.zzd = (p0.zzd | 2);
        return;
    }

    public static synthetic void zzC(com.google.android.gms.internal.play_billing.zzib p0, com.google.android.gms.internal.play_billing.zziz p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 2;
        return;
    }

    public static synthetic void zzD(com.google.android.gms.internal.play_billing.zzib p0, com.google.android.gms.internal.play_billing.zzjf p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 4;
        return;
    }

    public static synthetic void zzE(com.google.android.gms.internal.play_billing.zzib p0, com.google.android.gms.internal.play_billing.zzjv p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 3;
        return;
    }

    public static synthetic void zzF(com.google.android.gms.internal.play_billing.zzib p0, int p1)
    {
        p0.zzg = (p1 - 1);
        p0.zzd = (p0.zzd | 1);
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzhz zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zzhz) com.google.android.gms.internal.play_billing.zzib.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzib zzd()
    {
        return com.google.android.gms.internal.play_billing.zzib.zzb;
    }

    public final com.google.android.gms.internal.play_billing.zzjf zzA()
    {
        if (this.zze != 4) {
            return com.google.android.gms.internal.play_billing.zzjf.zzd();
        } else {
            return ((com.google.android.gms.internal.play_billing.zzjf) this.zzf);
        }
    }

    public final Object zzb(int p11, Object p12, Object p13)
    {
        com.google.android.gms.internal.play_billing.zzib v11_1 = (p11 - 1);
        if (v11_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v11_1 == 2) {
                String v8 = "zzh";
                String v2 = "zzd";
                Class v5 = com.google.android.gms.internal.play_billing.zziz;
                Class v7 = com.google.android.gms.internal.play_billing.zzjf;
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzib.zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u180c\u0001", new Object[] {"zzf", com.google.android.gms.internal.play_billing.zzik.zza}));
            } else {
                if (v11_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzib();
                } else {
                    if (v11_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzhz(0);
                    } else {
                        if (v11_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzib.zzb;
                        }
                    }
                }
            }
        }
    }
}
