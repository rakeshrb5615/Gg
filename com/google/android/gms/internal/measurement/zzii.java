package com.google.android.gms.internal.measurement;
public final class zzii extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzii zzg;
    private com.google.android.gms.internal.measurement.zzmn zzb;
    private com.google.android.gms.internal.measurement.zzmn zzd;
    private com.google.android.gms.internal.measurement.zzmo zze;
    private com.google.android.gms.internal.measurement.zzmo zzf;

    static zzii()
    {
        com.google.android.gms.internal.measurement.zzii v0_1 = new com.google.android.gms.internal.measurement.zzii();
        com.google.android.gms.internal.measurement.zzii.zzg = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzii, v0_1);
        return;
    }

    private zzii()
    {
        this.zzb = com.google.android.gms.internal.measurement.zzmf.zzct();
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzct();
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzih zzi()
    {
        return ((com.google.android.gms.internal.measurement.zzih) com.google.android.gms.internal.measurement.zzii.zzg.zzck());
    }

    public static com.google.android.gms.internal.measurement.zzii zzj()
    {
        return com.google.android.gms.internal.measurement.zzii.zzg;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzii zzt()
    {
        return com.google.android.gms.internal.measurement.zzii.zzg;
    }

    public final java.util.List zza()
    {
        return this.zzb;
    }

    public final int zzb()
    {
        return this.zzb.size();
    }

    public final java.util.List zzc()
    {
        return this.zzd;
    }

    public final int zzd()
    {
        return this.zzd.size();
    }

    public final java.util.List zze()
    {
        return this.zze;
    }

    public final int zzf()
    {
        return this.zze.size();
    }

    public final java.util.List zzg()
    {
        return this.zzf;
    }

    public final int zzh()
    {
        return this.zzf.size();
    }

    public final synthetic void zzk(Iterable p3)
    {
        com.google.android.gms.internal.measurement.zzmn v0_0 = this.zzb;
        if (!v0_0.zza()) {
            this.zzb = com.google.android.gms.internal.measurement.zzmf.zzcu(v0_0);
        }
        com.google.android.gms.internal.measurement.zzks.zzce(p3, this.zzb);
        return;
    }

    public final Object zzl(int p7, Object p8, Object p9)
    {
        com.google.android.gms.internal.measurement.zzii v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                String v2 = "zze";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzii.zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzik}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzii();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzih(0);
                    } else {
                        if (v7_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzii.zzg;
                        }
                    }
                }
            }
        }
    }

    public final synthetic void zzm()
    {
        this.zzb = com.google.android.gms.internal.measurement.zzmf.zzct();
        return;
    }

    public final synthetic void zzn(Iterable p3)
    {
        com.google.android.gms.internal.measurement.zzmn v0_0 = this.zzd;
        if (!v0_0.zza()) {
            this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcu(v0_0);
        }
        com.google.android.gms.internal.measurement.zzks.zzce(p3, this.zzd);
        return;
    }

    public final synthetic void zzo()
    {
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzct();
        return;
    }

    public final synthetic void zzp(Iterable p3)
    {
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zze;
        if (!v0_0.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        com.google.android.gms.internal.measurement.zzks.zzce(p3, this.zze);
        return;
    }

    public final synthetic void zzq()
    {
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public final synthetic void zzr(Iterable p3)
    {
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zzf;
        if (!v0_0.zza()) {
            this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        com.google.android.gms.internal.measurement.zzks.zzce(p3, this.zzf);
        return;
    }

    public final synthetic void zzs()
    {
        this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }
}
