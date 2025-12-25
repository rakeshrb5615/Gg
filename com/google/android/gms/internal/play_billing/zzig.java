package com.google.android.gms.internal.play_billing;
public final class zzig extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzig zzb;
    private int zzd;
    private int zze;
    private String zzf;
    private int zzg;
    private String zzh;
    private int zzi;

    static zzig()
    {
        com.google.android.gms.internal.play_billing.zzig v0_1 = new com.google.android.gms.internal.play_billing.zzig();
        com.google.android.gms.internal.play_billing.zzig.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzig, v0_1);
        return;
    }

    private zzig()
    {
        this.zzf = "";
        this.zzh = "";
        return;
    }

    public static synthetic void zzA(com.google.android.gms.internal.play_billing.zzig p1, String p2)
    {
        p1.zzd = (p1.zzd | 8);
        p1.zzh = p2;
        return;
    }

    public static synthetic void zzB(com.google.android.gms.internal.play_billing.zzig p1, String p2)
    {
        p2.getClass();
        p1.zzd = (p1.zzd | 2);
        p1.zzf = p2;
        return;
    }

    public static synthetic void zzC(com.google.android.gms.internal.play_billing.zzig p1, int p2)
    {
        p1.zzd = (p1.zzd | 16);
        p1.zzi = p2;
        return;
    }

    public static synthetic void zzD(com.google.android.gms.internal.play_billing.zzig p0, com.google.android.gms.internal.play_billing.zzie p1)
    {
        p0.zzg = p1.zza();
        p0.zzd = (p0.zzd | 4);
        return;
    }

    public static synthetic void zzE(com.google.android.gms.internal.play_billing.zzig p1, int p2)
    {
        p1.zzd = (p1.zzd | 1);
        p1.zze = p2;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzic zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zzic) com.google.android.gms.internal.play_billing.zzig.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzig zzd()
    {
        return com.google.android.gms.internal.play_billing.zzig.zzb;
    }

    public final Object zzb(int p8, Object p9, Object p10)
    {
        com.google.android.gms.internal.play_billing.zzig v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                String v5 = "zzh";
                String v2 = "zzf";
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzig.zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0004\u180c\u0002\u0005\u1008\u0003\u0007\u1004\u0004", new Object[] {"zzd", "zzi"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzig();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zzic(0);
                    } else {
                        if (v8_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzig.zzb;
                        }
                    }
                }
            }
        }
    }
}
