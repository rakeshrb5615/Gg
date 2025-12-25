package com.google.android.gms.internal.measurement;
public final class zzhu extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhu zzf;
    private int zzb;
    private String zzd;
    private long zze;

    static zzhu()
    {
        com.google.android.gms.internal.measurement.zzhu v0_1 = new com.google.android.gms.internal.measurement.zzhu();
        com.google.android.gms.internal.measurement.zzhu.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhu, v0_1);
        return;
    }

    private zzhu()
    {
        this.zzd = "";
        return;
    }

    public static com.google.android.gms.internal.measurement.zzht zza()
    {
        return ((com.google.android.gms.internal.measurement.zzht) com.google.android.gms.internal.measurement.zzhu.zzf.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhu zzd()
    {
        return com.google.android.gms.internal.measurement.zzhu.zzf;
    }

    public final synthetic void zzb(String p2)
    {
        p2.getClass();
        this.zzb = (this.zzb | 1);
        this.zzd = p2;
        return;
    }

    public final synthetic void zzc(long p2)
    {
        this.zzb = (this.zzb | 2);
        this.zze = p2;
        return;
    }

    public final Object zzl(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zzhu v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhu.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] {"zzb", "zzd", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhu();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzht(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhu.zzf;
                        }
                    }
                }
            }
        }
    }
}
