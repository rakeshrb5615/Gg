package com.google.android.gms.internal.measurement;
public final class zziu extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zziu zzj;
    private int zzb;
    private long zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private float zzh;
    private double zzi;

    static zziu()
    {
        com.google.android.gms.internal.measurement.zziu v0_1 = new com.google.android.gms.internal.measurement.zziu();
        com.google.android.gms.internal.measurement.zziu.zzj = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zziu, v0_1);
        return;
    }

    private zziu()
    {
        this.zze = "";
        this.zzf = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzit zzm()
    {
        return ((com.google.android.gms.internal.measurement.zzit) com.google.android.gms.internal.measurement.zziu.zzj.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zziu zzv()
    {
        return com.google.android.gms.internal.measurement.zziu.zzj;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzb()
    {
        return this.zzd;
    }

    public final String zzc()
    {
        return this.zze;
    }

    public final boolean zzd()
    {
        if ((this.zzb & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zze()
    {
        return this.zzf;
    }

    public final boolean zzf()
    {
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzg()
    {
        return this.zzg;
    }

    public final boolean zzh()
    {
        if ((this.zzb & 16) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final float zzi()
    {
        return this.zzh;
    }

    public final boolean zzj()
    {
        if ((this.zzb & 32) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final double zzk()
    {
        return this.zzi;
    }

    public final Object zzl(int p8, Object p9, Object p10)
    {
        com.google.android.gms.internal.measurement.zziu v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                String v2 = "zze";
                String v4 = "zzg";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zziu.zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005", new Object[] {"zzb", "zzi"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zziu();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzit(0);
                    } else {
                        if (v8_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zziu.zzj;
                        }
                    }
                }
            }
        }
    }

    public final synthetic void zzn(long p2)
    {
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzo(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final synthetic void zzp(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 4);
        this.zzf = p2;
        return;
    }

    public final synthetic void zzq()
    {
        this.zzb = (this.zzb & -5);
        this.zzf = com.google.android.gms.internal.measurement.zziu.zzj.zzf;
        return;
    }

    public final synthetic void zzr(long p2)
    {
        this.zzb = (this.zzb | 8);
        this.zzg = p2;
        return;
    }

    public final synthetic void zzs()
    {
        this.zzb = (this.zzb & -9);
        this.zzg = 0;
        return;
    }

    public final synthetic void zzt(double p2)
    {
        this.zzb = (this.zzb | 32);
        this.zzi = p2;
        return;
    }

    public final synthetic void zzu()
    {
        this.zzb = (this.zzb & -33);
        this.zzi = 0;
        return;
    }
}
