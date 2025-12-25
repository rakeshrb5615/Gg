package com.google.android.gms.internal.measurement;
public final class zzgj extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgj zzh;
    private int zzb;
    private String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static zzgj()
    {
        com.google.android.gms.internal.measurement.zzgj v0_1 = new com.google.android.gms.internal.measurement.zzgj();
        com.google.android.gms.internal.measurement.zzgj.zzh = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgj, v0_1);
        return;
    }

    private zzgj()
    {
        this.zzd = "";
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgj zzi()
    {
        return com.google.android.gms.internal.measurement.zzgj.zzh;
    }

    public final String zza()
    {
        return this.zzd;
    }

    public final boolean zzb()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzc()
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

    public final boolean zze()
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

    public final int zzg()
    {
        return this.zzg;
    }

    public final synthetic void zzh(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final Object zzl(int p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzgj v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgj.zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] {"zzb", "zzd", "zze", "zzf", "zzg"}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgj();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgi(0);
                    } else {
                        if (v3_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgj.zzh;
                        }
                    }
                }
            }
        }
    }
}
