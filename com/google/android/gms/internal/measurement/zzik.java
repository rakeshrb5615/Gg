package com.google.android.gms.internal.measurement;
public final class zzik extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzik zzf;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmn zze;

    static zzik()
    {
        com.google.android.gms.internal.measurement.zzik v0_1 = new com.google.android.gms.internal.measurement.zzik();
        com.google.android.gms.internal.measurement.zzik.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzik, v0_1);
        return;
    }

    private zzik()
    {
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzct();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzij zzf()
    {
        return ((com.google.android.gms.internal.measurement.zzij) com.google.android.gms.internal.measurement.zzik.zzf.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzik zzi()
    {
        return com.google.android.gms.internal.measurement.zzik.zzf;
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

    public final java.util.List zzc()
    {
        return this.zze;
    }

    public final int zzd()
    {
        return this.zze.size();
    }

    public final long zze(int p3)
    {
        return this.zze.zzc(p3);
    }

    public final synthetic void zzg(int p2)
    {
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzh(Iterable p3)
    {
        com.google.android.gms.internal.measurement.zzmn v0_0 = this.zze;
        if (!v0_0.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzmf.zzcu(v0_0);
        }
        com.google.android.gms.internal.measurement.zzks.zzce(p3, this.zze);
        return;
    }

    public final Object zzl(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zzik v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzik.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", new Object[] {"zzb", "zzd", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzik();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzij(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzik.zzf;
                        }
                    }
                }
            }
        }
    }
}
