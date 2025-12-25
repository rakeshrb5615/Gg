package com.google.android.gms.internal.measurement;
public final class zzhq extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhq zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static zzhq()
    {
        com.google.android.gms.internal.measurement.zzhq v0_1 = new com.google.android.gms.internal.measurement.zzhq();
        com.google.android.gms.internal.measurement.zzhq.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhq, v0_1);
        return;
    }

    private zzhq()
    {
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhp zze()
    {
        return ((com.google.android.gms.internal.measurement.zzhp) com.google.android.gms.internal.measurement.zzhq.zzf.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhq zzh()
    {
        return com.google.android.gms.internal.measurement.zzhq.zzf;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzb()
    {
        return this.zzd;
    }

    public final boolean zzc()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzd()
    {
        return this.zze;
    }

    public final synthetic void zzf(int p2)
    {
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzg(long p2)
    {
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final Object zzl(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zzhq v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhq.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[] {"zzb", "zzd", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhq();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhp(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhq.zzf;
                        }
                    }
                }
            }
        }
    }
}
