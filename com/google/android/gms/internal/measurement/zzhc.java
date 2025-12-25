package com.google.android.gms.internal.measurement;
public final class zzhc extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhc zzk;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    static zzhc()
    {
        com.google.android.gms.internal.measurement.zzhc v0_1 = new com.google.android.gms.internal.measurement.zzhc();
        com.google.android.gms.internal.measurement.zzhc.zzk = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhc, v0_1);
        return;
    }

    private zzhc()
    {
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhc zza()
    {
        return com.google.android.gms.internal.measurement.zzhc.zzk;
    }

    public final Object zzl(int p9, Object p10, Object p11)
    {
        com.google.android.gms.internal.measurement.zzhc v9_1 = (p9 - 1);
        if (v9_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v9_1 == 2) {
                String v2 = "zze";
                String v4 = "zzg";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhc.zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006", new Object[] {"zzb", "zzj"}));
            } else {
                if (v9_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhc();
                } else {
                    if (v9_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhb(0);
                    } else {
                        if (v9_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhc.zzk;
                        }
                    }
                }
            }
        }
    }
}
