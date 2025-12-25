package com.google.android.gms.internal.measurement;
public final class zzhg extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhg zzh;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzii zze;
    private com.google.android.gms.internal.measurement.zzii zzf;
    private boolean zzg;

    static zzhg()
    {
        com.google.android.gms.internal.measurement.zzhg v0_1 = new com.google.android.gms.internal.measurement.zzhg();
        com.google.android.gms.internal.measurement.zzhg.zzh = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhg, v0_1);
        return;
    }

    private zzhg()
    {
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhf zzh()
    {
        return ((com.google.android.gms.internal.measurement.zzhf) com.google.android.gms.internal.measurement.zzhg.zzh.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhg zzn()
    {
        return com.google.android.gms.internal.measurement.zzhg.zzh;
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

    public final com.google.android.gms.internal.measurement.zzii zzc()
    {
        com.google.android.gms.internal.measurement.zzii v0 = this.zze;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzii.zzj();
        }
        return v0;
    }

    public final boolean zzd()
    {
        if ((this.zzb & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzii zze()
    {
        com.google.android.gms.internal.measurement.zzii v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzii.zzj();
        }
        return v0;
    }

    public final boolean zzf()
    {
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzg()
    {
        return this.zzg;
    }

    public final synthetic void zzi(int p2)
    {
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzj(com.google.android.gms.internal.measurement.zzii p1)
    {
        p1.getClass();
        this.zze = p1;
        this.zzb = (this.zzb | 2);
        return;
    }

    public final synthetic void zzk(com.google.android.gms.internal.measurement.zzii p1)
    {
        this.zzf = p1;
        this.zzb = (this.zzb | 4);
        return;
    }

    public final Object zzl(int p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzhg v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhg.zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", new Object[] {"zzb", "zzd", "zze", "zzf", "zzg"}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhg();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhf(0);
                    } else {
                        if (v3_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhg.zzh;
                        }
                    }
                }
            }
        }
    }

    public final synthetic void zzm(boolean p2)
    {
        this.zzb = (this.zzb | 8);
        this.zzg = p2;
        return;
    }
}
