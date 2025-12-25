package com.google.android.gms.internal.measurement;
public final class zzje extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzje zzj;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmo zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;

    static zzje()
    {
        com.google.android.gms.internal.measurement.zzje v0_1 = new com.google.android.gms.internal.measurement.zzje();
        com.google.android.gms.internal.measurement.zzje.zzj = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzje, v0_1);
        return;
    }

    private zzje()
    {
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzf = "";
        this.zzg = "";
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzje zzi()
    {
        return com.google.android.gms.internal.measurement.zzje.zzj;
    }

    public final java.util.List zza()
    {
        return this.zze;
    }

    public final String zzb()
    {
        return this.zzf;
    }

    public final boolean zzc()
    {
        if ((this.zzb & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzd()
    {
        return this.zzg;
    }

    public final boolean zze()
    {
        if ((this.zzb & 8) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzf()
    {
        return this.zzh;
    }

    public final boolean zzg()
    {
        if ((this.zzb & 16) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final double zzh()
    {
        return this.zzi;
    }

    public final int zzj()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzjd.zza(this.zzd);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final Object zzl(int p10, Object p11, Object p12)
    {
        com.google.android.gms.internal.measurement.zzje v10_1 = (p10 - 1);
        if (v10_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v10_1 == 2) {
                String v7 = "zzh";
                String v3 = "zze";
                String v5 = "zzf";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzje.zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004", new Object[] {"zzb", "zzi"}));
            } else {
                if (v10_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzje();
                } else {
                    if (v10_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzjb(0);
                    } else {
                        if (v10_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzje.zzj;
                        }
                    }
                }
            }
        }
    }
}
