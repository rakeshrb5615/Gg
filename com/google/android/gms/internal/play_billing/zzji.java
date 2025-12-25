package com.google.android.gms.internal.play_billing;
public final class zzji extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzji zzb;
    private int zzd;
    private int zze;
    private Object zzf;
    private com.google.android.gms.internal.play_billing.zzis zzg;
    private com.google.android.gms.internal.play_billing.zziv zzh;

    static zzji()
    {
        com.google.android.gms.internal.play_billing.zzji v0_1 = new com.google.android.gms.internal.play_billing.zzji();
        com.google.android.gms.internal.play_billing.zzji.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzji, v0_1);
        return;
    }

    private zzji()
    {
        this.zze = 0;
        return;
    }

    public static synthetic void zzA(com.google.android.gms.internal.play_billing.zzji p0, com.google.android.gms.internal.play_billing.zzhx p1)
    {
        p0.zzf = p1;
        p0.zze = 2;
        return;
    }

    public static synthetic void zzB(com.google.android.gms.internal.play_billing.zzji p0, com.google.android.gms.internal.play_billing.zzib p1)
    {
        p0.zzf = p1;
        p0.zze = 3;
        return;
    }

    public static synthetic void zzC(com.google.android.gms.internal.play_billing.zzji p0, com.google.android.gms.internal.play_billing.zzij p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 7;
        return;
    }

    public static synthetic void zzD(com.google.android.gms.internal.play_billing.zzji p0, com.google.android.gms.internal.play_billing.zzis p1)
    {
        p1.getClass();
        p0.zzg = p1;
        p0.zzd = (p0.zzd | 1);
        return;
    }

    public static synthetic void zzE(com.google.android.gms.internal.play_billing.zzji p0, com.google.android.gms.internal.play_billing.zzjo p1)
    {
        p1.getClass();
        p0.zzf = p1;
        p0.zze = 8;
        return;
    }

    public static synthetic void zzF(com.google.android.gms.internal.play_billing.zzji p0, com.google.android.gms.internal.play_billing.zzjs p1)
    {
        p0.zzf = p1;
        p0.zze = 4;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzjg zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zzjg) com.google.android.gms.internal.play_billing.zzji.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzji zzd()
    {
        return com.google.android.gms.internal.play_billing.zzji.zzb;
    }

    public final Object zzb(int p12, Object p13, Object p14)
    {
        com.google.android.gms.internal.play_billing.zzji v12_1 = (p12 - 1);
        if (v12_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v12_1 == 2) {
                String v2 = "zzd";
                Class v4 = com.google.android.gms.internal.play_billing.zzhx;
                Class v6 = com.google.android.gms.internal.play_billing.zzjs;
                String v8 = "zzh";
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzji.zzb, "\u0004\u0008\u0001\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u1009\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u1009\u0001\u0007<\u0000\u0008<\u0000", new Object[] {"zzf", com.google.android.gms.internal.play_billing.zzjo}));
            } else {
                if (v12_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzji();
                } else {
                    if (v12_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzjg(0);
                    } else {
                        if (v12_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzji.zzb;
                        }
                    }
                }
            }
        }
    }
}
