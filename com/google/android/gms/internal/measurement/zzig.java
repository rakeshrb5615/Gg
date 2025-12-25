package com.google.android.gms.internal.measurement;
public final class zzig extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzig zzf;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmo zze;

    static zzig()
    {
        com.google.android.gms.internal.measurement.zzig v0_1 = new com.google.android.gms.internal.measurement.zzig();
        com.google.android.gms.internal.measurement.zzig.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzig, v0_1);
        return;
    }

    private zzig()
    {
        this.zzd = 1;
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzie zza()
    {
        return ((com.google.android.gms.internal.measurement.zzie) com.google.android.gms.internal.measurement.zzig.zzf.zzck());
    }

    public static synthetic com.google.android.gms.internal.measurement.zzig zzc()
    {
        return com.google.android.gms.internal.measurement.zzig.zzf;
    }

    public final synthetic void zzb(com.google.android.gms.internal.measurement.zzhu p3)
    {
        p3.getClass();
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zze;
        if (!v0_0.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        this.zze.add(p3);
        return;
    }

    public final Object zzl(int p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzig v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzig.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b", new Object[] {"zzb", "zzd", com.google.android.gms.internal.measurement.zzif.zza, "zze", com.google.android.gms.internal.measurement.zzhu}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzig();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzie(0);
                    } else {
                        if (v3_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzig.zzf;
                        }
                    }
                }
            }
        }
    }
}
