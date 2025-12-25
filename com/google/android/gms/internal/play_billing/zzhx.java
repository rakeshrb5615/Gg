package com.google.android.gms.internal.play_billing;
public final class zzhx extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzhx zzb;
    private int zzd;
    private int zze;
    private Object zzf;
    private int zzg;
    private com.google.android.gms.internal.play_billing.zzig zzh;
    private int zzi;

    static zzhx()
    {
        com.google.android.gms.internal.play_billing.zzhx v0_1 = new com.google.android.gms.internal.play_billing.zzhx();
        com.google.android.gms.internal.play_billing.zzhx.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzhx, v0_1);
        return;
    }

    private zzhx()
    {
        this.zze = 0;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzhx zzA(byte[] p1, com.google.android.gms.internal.play_billing.zzeu p2)
    {
        return ((com.google.android.gms.internal.play_billing.zzhx) com.google.android.gms.internal.play_billing.zzfi.zzp(com.google.android.gms.internal.play_billing.zzhx.zzb, p1, p2));
    }

    public static synthetic void zzC(com.google.android.gms.internal.play_billing.zzhx p0, com.google.android.gms.internal.play_billing.zzil p1)
    {
        p0.zzi = p1.zza();
        p0.zzd = (p0.zzd | 4);
        return;
    }

    public static synthetic void zzD(com.google.android.gms.internal.play_billing.zzhx p0, com.google.android.gms.internal.play_billing.zzig p1)
    {
        p1.getClass();
        p0.zzh = p1;
        p0.zzd = (p0.zzd | 2);
        return;
    }

    public static synthetic void zzE(com.google.android.gms.internal.play_billing.zzhx p0, com.google.android.gms.internal.play_billing.zziz p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 4;
        return;
    }

    public static synthetic void zzF(com.google.android.gms.internal.play_billing.zzhx p0, com.google.android.gms.internal.play_billing.zzjf p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 7;
        return;
    }

    public static synthetic void zzG(com.google.android.gms.internal.play_billing.zzhx p0, com.google.android.gms.internal.play_billing.zzjv p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 6;
        return;
    }

    public static synthetic void zzH(com.google.android.gms.internal.play_billing.zzhx p0, int p1)
    {
        p0.zzg = (p1 - 1);
        p0.zzd = (p0.zzd | 1);
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzhv zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zzhv) com.google.android.gms.internal.play_billing.zzhx.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzhx zzd()
    {
        return com.google.android.gms.internal.play_billing.zzhx.zzb;
    }

    public final com.google.android.gms.internal.play_billing.zzjf zzB()
    {
        if (this.zze != 7) {
            return com.google.android.gms.internal.play_billing.zzjf.zzd();
        } else {
            return ((com.google.android.gms.internal.play_billing.zzjf) this.zzf);
        }
    }

    public final Object zzb(int p12, Object p13, Object p14)
    {
        com.google.android.gms.internal.play_billing.zzhx v12_1 = (p12 - 1);
        if (v12_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v12_1 == 2) {
                com.google.android.gms.internal.play_billing.zzfl v8 = com.google.android.gms.internal.play_billing.zzik.zza;
                String v2 = "zzd";
                String v5 = "zzh";
                String v7 = "zzi";
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzhx.zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0004<\u0000\u0005\u180c\u0002\u0006<\u0000\u0007<\u0000", new Object[] {"zzf", com.google.android.gms.internal.play_billing.zzjf}));
            } else {
                if (v12_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzhx();
                } else {
                    if (v12_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzhv(0);
                    } else {
                        if (v12_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzhx.zzb;
                        }
                    }
                }
            }
        }
    }
}
