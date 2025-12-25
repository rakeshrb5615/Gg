package com.google.android.gms.internal.measurement;
public final class zzgt extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgt zzf;
    private int zzb;
    private String zzd;
    private String zze;

    static zzgt()
    {
        com.google.android.gms.internal.measurement.zzgt v0_1 = new com.google.android.gms.internal.measurement.zzgt();
        com.google.android.gms.internal.measurement.zzgt.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgt, v0_1);
        return;
    }

    private zzgt()
    {
        this.zzd = "";
        this.zze = "";
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgt zzc()
    {
        return com.google.android.gms.internal.measurement.zzgt.zzf;
    }

    public final String zza()
    {
        return this.zzd;
    }

    public final String zzb()
    {
        return this.zze;
    }

    public final Object zzl(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zzgt v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgt.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] {"zzb", "zzd", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgt();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgs(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgt.zzf;
                        }
                    }
                }
            }
        }
    }
}
