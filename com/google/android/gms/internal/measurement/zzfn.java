package com.google.android.gms.internal.measurement;
public final class zzfn extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzfn zzj;
    private int zzb;
    private int zzd;
    private String zze;
    private com.google.android.gms.internal.measurement.zzfh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static zzfn()
    {
        com.google.android.gms.internal.measurement.zzfn v0_1 = new com.google.android.gms.internal.measurement.zzfn();
        com.google.android.gms.internal.measurement.zzfn.zzj = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzfn, v0_1);
        return;
    }

    private zzfn()
    {
        this.zze = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzfm zzi()
    {
        return ((com.google.android.gms.internal.measurement.zzfm) com.google.android.gms.internal.measurement.zzfn.zzj.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzfn zzk()
    {
        return com.google.android.gms.internal.measurement.zzfn.zzj;
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

    public final String zzc()
    {
        return this.zze;
    }

    public final com.google.android.gms.internal.measurement.zzfh zzd()
    {
        com.google.android.gms.internal.measurement.zzfh v0 = this.zzf;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zzfh.zzi();
        }
        return v0;
    }

    public final boolean zze()
    {
        return this.zzg;
    }

    public final boolean zzf()
    {
        return this.zzh;
    }

    public final boolean zzg()
    {
        if ((this.zzb & 32) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzh()
    {
        return this.zzi;
    }

    public final synthetic void zzj(String p2)
    {
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final Object zzl(int p8, Object p9, Object p10)
    {
        com.google.android.gms.internal.measurement.zzfn v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                String v2 = "zze";
                String v4 = "zzg";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzfn.zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] {"zzb", "zzi"}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzfn();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfm(0);
                    } else {
                        if (v8_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzfn.zzj;
                        }
                    }
                }
            }
        }
    }
}
