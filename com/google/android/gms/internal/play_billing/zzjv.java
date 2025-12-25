package com.google.android.gms.internal.play_billing;
public final class zzjv extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjv zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static zzjv()
    {
        com.google.android.gms.internal.play_billing.zzjv v0_1 = new com.google.android.gms.internal.play_billing.zzjv();
        com.google.android.gms.internal.play_billing.zzjv.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjv, v0_1);
        return;
    }

    private zzjv()
    {
        return;
    }

    public static synthetic void zzA(com.google.android.gms.internal.play_billing.zzjv p1, boolean p2)
    {
        p1.zzd = (p1.zzd | 8);
        p1.zzh = p2;
        return;
    }

    public static synthetic void zzB(com.google.android.gms.internal.play_billing.zzjv p1, int p2)
    {
        p1.zzd = (p1.zzd | 16);
        p1.zzi = p2;
        return;
    }

    public static synthetic void zzC(com.google.android.gms.internal.play_billing.zzjv p1, long p2)
    {
        p1.zzd = (p1.zzd | 4);
        p1.zzg = p2;
        return;
    }

    public static synthetic void zzD(com.google.android.gms.internal.play_billing.zzjv p0, boolean p1)
    {
        p0.zzd = (p0.zzd | 2);
        p0.zzf = 1;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzjt zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zzjt) com.google.android.gms.internal.play_billing.zzjv.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzjv zzd()
    {
        return com.google.android.gms.internal.play_billing.zzjv.zzb;
    }

    public final Object zzb(int p7, Object p8, Object p9)
    {
        com.google.android.gms.internal.play_billing.zzjv v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                String v2 = "zzf";
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzjv.zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001\u0003\u1002\u0002\u0004\u1007\u0003\u0005\u1004\u0004", new Object[] {"zzd", "zzi"}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzjv();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzjt(0);
                    } else {
                        if (v7_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzjv.zzb;
                        }
                    }
                }
            }
        }
    }
}
