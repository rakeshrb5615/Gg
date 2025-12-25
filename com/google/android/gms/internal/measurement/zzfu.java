package com.google.android.gms.internal.measurement;
public final class zzfu extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzfu zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static zzfu()
    {
        com.google.android.gms.internal.measurement.zzfu v0_1 = new com.google.android.gms.internal.measurement.zzfu();
        com.google.android.gms.internal.measurement.zzfu.zzg = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzfu, v0_1);
        return;
    }

    private zzfu()
    {
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzfu zza()
    {
        return com.google.android.gms.internal.measurement.zzfu.zzg;
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
        int v0_1 = com.google.android.gms.internal.measurement.zzfy.zza(this.zze);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final int zzd()
    {
        int v0_1 = com.google.android.gms.internal.measurement.zzge.zza(this.zzf);
        if (v0_1 == 0) {
            v0_1 = 1;
        }
        return v0_1;
    }

    public final Object zzl(int p8, Object p9, Object p10)
    {
        com.google.android.gms.internal.measurement.zzfu v8_1 = (p8 - 1);
        if (v8_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v8_1 == 2) {
                com.google.android.gms.internal.measurement.zzmk v4 = com.google.android.gms.internal.measurement.zzfx.zza;
                String v3 = "zze";
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzfu.zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzgd.zza}));
            } else {
                if (v8_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzfu();
                } else {
                    if (v8_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzft(0);
                    } else {
                        if (v8_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzfu.zzg;
                        }
                    }
                }
            }
        }
    }
}
