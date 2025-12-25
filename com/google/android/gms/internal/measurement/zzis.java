package com.google.android.gms.internal.measurement;
public final class zzis extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzis zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static zzis()
    {
        com.google.android.gms.internal.measurement.zzis v0_1 = new com.google.android.gms.internal.measurement.zzis();
        com.google.android.gms.internal.measurement.zzis.zzg = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzis, v0_1);
        return;
    }

    private zzis()
    {
        return;
    }

    public static com.google.android.gms.internal.measurement.zzil zzb()
    {
        return ((com.google.android.gms.internal.measurement.zzil) com.google.android.gms.internal.measurement.zzis.zzg.zzck());
    }

    public static com.google.android.gms.internal.measurement.zzis zzc()
    {
        return com.google.android.gms.internal.measurement.zzis.zzg;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzis zze()
    {
        return com.google.android.gms.internal.measurement.zzis.zzg;
    }

    public final com.google.android.gms.internal.measurement.zzin zza()
    {
        com.google.android.gms.internal.measurement.zzin v0_1 = com.google.android.gms.internal.measurement.zzin.zzb(this.zze);
        if (v0_1 == null) {
            v0_1 = com.google.android.gms.internal.measurement.zzin.zza;
        }
        return v0_1;
    }

    public final synthetic void zzd(com.google.android.gms.internal.measurement.zzin p1)
    {
        this.zze = p1.zza();
        this.zzb = (this.zzb | 2);
        return;
    }

    public final int zzf()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzir.zza(this.zzd);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final int zzg()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzip.zza(this.zzf);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final synthetic void zzh(int p1)
    {
        this.zzd = (p1 - 1);
        this.zzb = (this.zzb | 1);
        return;
    }

    public final synthetic void zzi(int p1)
    {
        this.zzf = (p1 - 1);
        this.zzb = (this.zzb | 4);
        return;
    }

    public final Object zzl(int p8, Object p9, Object p10)
    {
        com.google.android.gms.internal.measurement.zzis v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                com.google.android.gms.internal.measurement.zzmk v4 = com.google.android.gms.internal.measurement.zzim.zza;
                String v3 = "zze";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzis.zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzio.zza}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzis();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzil(0);
                    } else {
                        if (v8_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzis.zzg;
                        }
                    }
                }
            }
        }
    }
}
