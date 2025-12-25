package com.google.android.gms.internal.measurement;
public final class zzfd extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzfd zzi;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmo zze;
    private com.google.android.gms.internal.measurement.zzmo zzf;
    private boolean zzg;
    private boolean zzh;

    static zzfd()
    {
        com.google.android.gms.internal.measurement.zzfd v0_1 = new com.google.android.gms.internal.measurement.zzfd();
        com.google.android.gms.internal.measurement.zzfd.zzi = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzfd, v0_1);
        return;
    }

    private zzfd()
    {
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzfd zzk()
    {
        return com.google.android.gms.internal.measurement.zzfd.zzi;
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

    public final com.google.android.gms.internal.measurement.zzfn zze(int p2)
    {
        return ((com.google.android.gms.internal.measurement.zzfn) this.zze.get(p2));
    }

    public final java.util.List zzf()
    {
        return this.zzf;
    }

    public final int zzg()
    {
        return this.zzf.size();
    }

    public final com.google.android.gms.internal.measurement.zzff zzh(int p2)
    {
        return ((com.google.android.gms.internal.measurement.zzff) this.zzf.get(p2));
    }

    public final synthetic void zzi(int p3, com.google.android.gms.internal.measurement.zzfn p4)
    {
        p4.getClass();
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zze;
        if (!v0_0.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        this.zze.set(p3, p4);
        return;
    }

    public final synthetic void zzj(int p3, com.google.android.gms.internal.measurement.zzff p4)
    {
        p4.getClass();
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zzf;
        if (!v0_0.zza()) {
            this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        this.zzf.set(p3, p4);
        return;
    }

    public final Object zzl(int p9, Object p10, Object p11)
    {
        com.google.android.gms.internal.measurement.zzfd v9_1 = (p9 - 1);
        if (v9_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v9_1 == 2) {
                String v2 = "zze";
                String v4 = "zzf";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzfd.zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", new Object[] {"zzb", "zzh"}));
            } else {
                if (v9_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzfd();
                } else {
                    if (v9_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfc(0);
                    } else {
                        if (v9_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzfd.zzi;
                        }
                    }
                }
            }
        }
    }
}
