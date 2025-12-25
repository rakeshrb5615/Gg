package com.google.android.gms.internal.measurement;
public final class zzfw extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzfw zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static zzfw()
    {
        com.google.android.gms.internal.measurement.zzfw v0_1 = new com.google.android.gms.internal.measurement.zzfw();
        com.google.android.gms.internal.measurement.zzfw.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzfw, v0_1);
        return;
    }

    private zzfw()
    {
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzfw zza()
    {
        return com.google.android.gms.internal.measurement.zzfw.zzf;
    }

    public final int zzb()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzga.zza(this.zzd);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final int zzc()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzga.zza(this.zze);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final Object zzl(int p2, Object p3, Object p4)
    {
        com.google.android.gms.internal.measurement.zzfw v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzfw.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[] {"zzb", "zzd", com.google.android.gms.internal.measurement.zzfz.zza, "zze", com.google.android.gms.internal.measurement.zzfz.zza}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzfw();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzfv(0);
                    } else {
                        if (v2_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzfw.zzf;
                        }
                    }
                }
            }
        }
    }
}
