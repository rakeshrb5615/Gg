package com.google.android.gms.internal.measurement;
public final class zzgp extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgp zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static zzgp()
    {
        com.google.android.gms.internal.measurement.zzgp v0_1 = new com.google.android.gms.internal.measurement.zzgp();
        com.google.android.gms.internal.measurement.zzgp.zzi = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgp, v0_1);
        return;
    }

    private zzgp()
    {
        this.zzd = 14;
        this.zze = 11;
        this.zzf = 60;
        this.zzg = 13;
        this.zzh = 11;
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgp zza()
    {
        return com.google.android.gms.internal.measurement.zzgp.zzi;
    }

    public final Object zzl(int p7, Object p8, Object p9)
    {
        com.google.android.gms.internal.measurement.zzgp v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                String v2 = "zze";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgp.zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004", new Object[] {"zzb", "zzh"}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgp();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgo(0);
                    } else {
                        if (v7_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgp.zzi;
                        }
                    }
                }
            }
        }
    }
}
