package com.google.android.gms.internal.measurement;
public final class zzhe extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhe zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static zzhe()
    {
        com.google.android.gms.internal.measurement.zzhe v0_1 = new com.google.android.gms.internal.measurement.zzhe();
        com.google.android.gms.internal.measurement.zzhe.zzk = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhe, v0_1);
        return;
    }

    private zzhe()
    {
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhd zzh()
    {
        return ((com.google.android.gms.internal.measurement.zzhd) com.google.android.gms.internal.measurement.zzhe.zzk.zzck());
    }

    public static com.google.android.gms.internal.measurement.zzhe zzi()
    {
        return com.google.android.gms.internal.measurement.zzhe.zzk;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhe zzr()
    {
        return com.google.android.gms.internal.measurement.zzhe.zzk;
    }

    public final boolean zza()
    {
        return this.zzd;
    }

    public final boolean zzb()
    {
        return this.zze;
    }

    public final boolean zzc()
    {
        return this.zzf;
    }

    public final boolean zzd()
    {
        return this.zzg;
    }

    public final boolean zze()
    {
        return this.zzh;
    }

    public final boolean zzf()
    {
        return this.zzi;
    }

    public final boolean zzg()
    {
        return this.zzj;
    }

    public final synthetic void zzj(boolean p2)
    {
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzk(boolean p2)
    {
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final Object zzl(int p9, Object p10, Object p11)
    {
        com.google.android.gms.internal.measurement.zzhe v9_1 = (p9 - 1);
        if (v9_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v9_1 == 2) {
                String v2 = "zze";
                String v4 = "zzg";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhe.zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006", new Object[] {"zzb", "zzj"}));
            } else {
                if (v9_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhe();
                } else {
                    if (v9_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhd(0);
                    } else {
                        if (v9_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhe.zzk;
                        }
                    }
                }
            }
        }
    }

    public final synthetic void zzm(boolean p2)
    {
        this.zzb = (this.zzb | 4);
        this.zzf = p2;
        return;
    }

    public final synthetic void zzn(boolean p2)
    {
        this.zzb = (this.zzb | 8);
        this.zzg = p2;
        return;
    }

    public final synthetic void zzo(boolean p2)
    {
        this.zzb = (this.zzb | 16);
        this.zzh = p2;
        return;
    }

    public final synthetic void zzp(boolean p2)
    {
        this.zzb = (this.zzb | 32);
        this.zzi = p2;
        return;
    }

    public final synthetic void zzq(boolean p2)
    {
        this.zzb = (this.zzb | 64);
        this.zzj = p2;
        return;
    }
}
