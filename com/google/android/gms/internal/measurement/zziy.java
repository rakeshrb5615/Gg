package com.google.android.gms.internal.measurement;
public final class zziy extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zziy zzf;
    private int zzb;
    private String zzd;
    private com.google.android.gms.internal.measurement.zzmo zze;

    static zziy()
    {
        com.google.android.gms.internal.measurement.zziy v0_1 = new com.google.android.gms.internal.measurement.zziy();
        com.google.android.gms.internal.measurement.zziy.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zziy, v0_1);
        return;
    }

    private zziy()
    {
        this.zzd = "";
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zziy zzc()
    {
        return com.google.android.gms.internal.measurement.zziy.zzf;
    }

    public final String zza()
    {
        return this.zzd;
    }

    public final java.util.List zzb()
    {
        return this.zze;
    }

    public final Object zzl(int p2, Object p3, Object p4)
    {
        com.google.android.gms.internal.measurement.zziy v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zziy.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] {"zzb", "zzd", "zze", com.google.android.gms.internal.measurement.zzje}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zziy();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzix(0);
                    } else {
                        if (v2_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zziy.zzf;
                        }
                    }
                }
            }
        }
    }
}
