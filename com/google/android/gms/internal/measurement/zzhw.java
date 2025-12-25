package com.google.android.gms.internal.measurement;
public final class zzhw extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhw zzj;
    private int zzb;
    private String zzd;
    private String zze;
    private long zzf;
    private float zzg;
    private double zzh;
    private com.google.android.gms.internal.measurement.zzmo zzi;

    static zzhw()
    {
        com.google.android.gms.internal.measurement.zzhw v0_1 = new com.google.android.gms.internal.measurement.zzhw();
        com.google.android.gms.internal.measurement.zzhw.zzj = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhw, v0_1);
        return;
    }

    private zzhw()
    {
        this.zzd = "";
        this.zze = "";
        this.zzi = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhv zzn()
    {
        return ((com.google.android.gms.internal.measurement.zzhv) com.google.android.gms.internal.measurement.zzhw.zzj.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhw zzy()
    {
        return com.google.android.gms.internal.measurement.zzhw.zzj;
    }

    private final void zzz()
    {
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zzi;
        if (!v0_0.zza()) {
            this.zzi = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        return;
    }

    public final boolean zza()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String zzb()
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

    public final String zzd()
    {
        return this.zze;
    }

    public final boolean zze()
    {
        if ((this.zzb & 4) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzf()
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

    public final float zzh()
    {
        return this.zzg;
    }

    public final boolean zzi()
    {
        if ((this.zzb & 16) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final double zzj()
    {
        return this.zzh;
    }

    public final java.util.List zzk()
    {
        return this.zzi;
    }

    public final Object zzl(int p9, Object p10, Object p11)
    {
        com.google.android.gms.internal.measurement.zzhw v9_1 = (p9 - 1);
        if (v9_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v9_1 == 2) {
                String v2 = "zze";
                String v4 = "zzg";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhw.zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzhw}));
            } else {
                if (v9_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhw();
                } else {
                    if (v9_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhv(0);
                    } else {
                        if (v9_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhw.zzj;
                        }
                    }
                }
            }
        }
    }

    public final int zzm()
    {
        return this.zzi.size();
    }

    public final synthetic void zzo(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzp(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final synthetic void zzq()
    {
        this.zzb = (this.zzb & -3);
        this.zze = com.google.android.gms.internal.measurement.zzhw.zzj.zze;
        return;
    }

    public final synthetic void zzr(long p2)
    {
        this.zzb = (this.zzb | 4);
        this.zzf = p2;
        return;
    }

    public final synthetic void zzs()
    {
        this.zzb = (this.zzb & -5);
        this.zzf = 0;
        return;
    }

    public final synthetic void zzt(double p2)
    {
        this.zzb = (this.zzb | 16);
        this.zzh = p2;
        return;
    }

    public final synthetic void zzu()
    {
        this.zzb = (this.zzb & -17);
        this.zzh = 0;
        return;
    }

    public final synthetic void zzv(com.google.android.gms.internal.measurement.zzhw p2)
    {
        p2.getClass();
        this.zzz();
        this.zzi.add(p2);
        return;
    }

    public final synthetic void zzw(Iterable p2)
    {
        this.zzz();
        com.google.android.gms.internal.measurement.zzks.zzce(p2, this.zzi);
        return;
    }

    public final synthetic void zzx()
    {
        this.zzi = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }
}
