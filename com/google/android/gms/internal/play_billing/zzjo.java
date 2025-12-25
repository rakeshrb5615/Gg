package com.google.android.gms.internal.play_billing;
public final class zzjo extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzjo zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.zzig zze;
    private long zzf;

    static zzjo()
    {
        com.google.android.gms.internal.play_billing.zzjo v0_1 = new com.google.android.gms.internal.play_billing.zzjo();
        com.google.android.gms.internal.play_billing.zzjo.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzjo, v0_1);
        return;
    }

    private zzjo()
    {
        return;
    }

    public static synthetic void zzA(com.google.android.gms.internal.play_billing.zzjo p0, com.google.android.gms.internal.play_billing.zzig p1)
    {
        p1.getClass();
        p0.zze = p1;
        p0.zzd = (p0.zzd | 1);
        return;
    }

    public static synthetic void zzB(com.google.android.gms.internal.play_billing.zzjo p1, long p2)
    {
        p1.zzd = (p1.zzd | 2);
        p1.zzf = p2;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzjm zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zzjm) com.google.android.gms.internal.play_billing.zzjo.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzjo zzd()
    {
        return com.google.android.gms.internal.play_billing.zzjo.zzb;
    }

    public final Object zzb(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.play_billing.zzjo v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzjo.zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001", new Object[] {"zzd", "zze", "zzf"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzjo();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzjm(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzjo.zzb;
                        }
                    }
                }
            }
        }
    }
}
