package com.google.android.gms.internal.measurement;
public final class zzgf extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgf zzi;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzmo zzd;
    private com.google.android.gms.internal.measurement.zzmo zze;
    private com.google.android.gms.internal.measurement.zzmo zzf;
    private boolean zzg;
    private com.google.android.gms.internal.measurement.zzmo zzh;

    static zzgf()
    {
        com.google.android.gms.internal.measurement.zzgf v0_1 = new com.google.android.gms.internal.measurement.zzgf();
        com.google.android.gms.internal.measurement.zzgf.zzi = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgf, v0_1);
        return;
    }

    private zzgf()
    {
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzf = com.google.android.gms.internal.measurement.zzmf.zzcv();
        this.zzh = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzgf zzg()
    {
        return com.google.android.gms.internal.measurement.zzgf.zzi;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgf zzh()
    {
        return com.google.android.gms.internal.measurement.zzgf.zzi;
    }

    public final java.util.List zza()
    {
        return this.zzd;
    }

    public final java.util.List zzb()
    {
        return this.zze;
    }

    public final java.util.List zzc()
    {
        return this.zzf;
    }

    public final boolean zzd()
    {
        if ((this.zzb & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zze()
    {
        return this.zzg;
    }

    public final java.util.List zzf()
    {
        return this.zzh;
    }

    public final Object zzl(int p11, Object p12, Object p13)
    {
        com.google.android.gms.internal.measurement.zzgf v11_1 = (p11 - 1);
        if (v11_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v11_1 == 2) {
                Class v2 = com.google.android.gms.internal.measurement.zzfu;
                Class v4 = com.google.android.gms.internal.measurement.zzfw;
                Class v6 = com.google.android.gms.internal.measurement.zzgc;
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgf.zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u1007\u0000\u0005\u001b", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzfu}));
            } else {
                if (v11_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgf();
                } else {
                    if (v11_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfs(0);
                    } else {
                        if (v11_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgf.zzi;
                        }
                    }
                }
            }
        }
    }
}
