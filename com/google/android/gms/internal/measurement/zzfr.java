package com.google.android.gms.internal.measurement;
public final class zzfr extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzfr zzh;
    private int zzb;
    private int zzd;
    private String zze;
    private boolean zzf;
    private com.google.android.gms.internal.measurement.zzmo zzg;

    static zzfr()
    {
        com.google.android.gms.internal.measurement.zzfr v0_1 = new com.google.android.gms.internal.measurement.zzfr();
        com.google.android.gms.internal.measurement.zzfr.zzh = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzfr, v0_1);
        return;
    }

    private zzfr()
    {
        this.zze = "";
        this.zzg = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzfr zzh()
    {
        return com.google.android.gms.internal.measurement.zzfr.zzh;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzfr zzi()
    {
        return com.google.android.gms.internal.measurement.zzfr.zzh;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzb()
    {
        if ((this.zzb & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
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

    public final boolean zze()
    {
        return this.zzf;
    }

    public final java.util.List zzf()
    {
        return this.zzg;
    }

    public final int zzg()
    {
        return this.zzg.size();
    }

    public final int zzj()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzfq.zza(this.zzd);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final Object zzl(int p7, Object p8, Object p9)
    {
        com.google.android.gms.internal.measurement.zzfr v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                String v4 = "zzf";
                String v3 = "zze";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzfr.zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[] {"zzb", "zzg"}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzfr();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfo(0);
                    } else {
                        if (v7_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzfr.zzh;
                        }
                    }
                }
            }
        }
    }
}
