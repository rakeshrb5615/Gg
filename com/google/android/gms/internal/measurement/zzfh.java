package com.google.android.gms.internal.measurement;
public final class zzfh extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzfh zzh;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzfr zzd;
    private com.google.android.gms.internal.measurement.zzfl zze;
    private boolean zzf;
    private String zzg;

    static zzfh()
    {
        com.google.android.gms.internal.measurement.zzfh v0_1 = new com.google.android.gms.internal.measurement.zzfh();
        com.google.android.gms.internal.measurement.zzfh.zzh = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzfh, v0_1);
        return;
    }

    private zzfh()
    {
        this.zzg = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzfh zzi()
    {
        return com.google.android.gms.internal.measurement.zzfh.zzh;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzfh zzk()
    {
        return com.google.android.gms.internal.measurement.zzfh.zzh;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzfr zzb()
    {
        com.google.android.gms.internal.measurement.zzfr v0 = this.zzd;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzfr.zzh();
        }
        return v0;
    }

    public final boolean zzc()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzfl zzd()
    {
        com.google.android.gms.internal.measurement.zzfl v0 = this.zze;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzfl.zzj();
        }
        return v0;
    }

    public final boolean zze()
    {
        if ((this.zzb & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzf()
    {
        return this.zzf;
    }

    public final boolean zzg()
    {
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzh()
    {
        return this.zzg;
    }

    public final synthetic void zzj(String p2)
    {
        this.zzb = (this.zzb | 8);
        this.zzg = p2;
        return;
    }

    public final Object zzl(int p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzfh v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzfh.zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] {"zzb", "zzd", "zze", "zzf", "zzg"}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzfh();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfg(0);
                    } else {
                        if (v3_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzfh.zzh;
                        }
                    }
                }
            }
        }
    }
}
