package com.google.android.gms.internal.measurement;
public final class zzgv extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgv zzi;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private String zzh;

    static zzgv()
    {
        com.google.android.gms.internal.measurement.zzgv v0_1 = new com.google.android.gms.internal.measurement.zzgv();
        com.google.android.gms.internal.measurement.zzgv.zzi = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgv, v0_1);
        return;
    }

    private zzgv()
    {
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzgv zze()
    {
        return com.google.android.gms.internal.measurement.zzgv.zzi;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgv zzf()
    {
        return com.google.android.gms.internal.measurement.zzgv.zzi;
    }

    public final String zza()
    {
        return this.zzd;
    }

    public final String zzb()
    {
        return this.zze;
    }

    public final int zzc()
    {
        return this.zzg;
    }

    public final String zzd()
    {
        return this.zzh;
    }

    public final Object zzl(int p7, Object p8, Object p9)
    {
        com.google.android.gms.internal.measurement.zzgv v7_1 = (p7 - 1);
        if (v7_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v7_1 == 2) {
                String v2 = "zze";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgv.zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u1008\u0004", new Object[] {"zzb", "zzh"}));
            } else {
                if (v7_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgv();
                } else {
                    if (v7_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgu(0);
                    } else {
                        if (v7_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgv.zzi;
                        }
                    }
                }
            }
        }
    }
}
