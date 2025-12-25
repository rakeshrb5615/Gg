package com.google.android.gms.internal.measurement;
public final class zzhl extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhl zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static zzhl()
    {
        com.google.android.gms.internal.measurement.zzhl v0_1 = new com.google.android.gms.internal.measurement.zzhl();
        com.google.android.gms.internal.measurement.zzhl.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhl, v0_1);
        return;
    }

    private zzhl()
    {
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhk zza()
    {
        return ((com.google.android.gms.internal.measurement.zzhk) com.google.android.gms.internal.measurement.zzhl.zzf.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhl zzb()
    {
        return com.google.android.gms.internal.measurement.zzhl.zzf;
    }

    public final int zzc()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzhj.zza(this.zzd);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final int zzd()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzhn.zza(this.zze);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final synthetic void zze(int p1)
    {
        this.zzd = (p1 - 1);
        this.zzb = (this.zzb | 1);
        return;
    }

    public final synthetic void zzf(int p1)
    {
        this.zze = (p1 - 1);
        this.zzb = (this.zzb | 2);
        return;
    }

    public final Object zzl(int p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzhl v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhl.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[] {"zzb", "zzd", com.google.android.gms.internal.measurement.zzhi.zza, "zze", com.google.android.gms.internal.measurement.zzhm.zza}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhl();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhk(0);
                    } else {
                        if (v3_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhl.zzf;
                        }
                    }
                }
            }
        }
    }
}
