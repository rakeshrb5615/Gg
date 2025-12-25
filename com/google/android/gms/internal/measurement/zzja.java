package com.google.android.gms.internal.measurement;
public final class zzja extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzja zzf;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzmo zzd;
    private com.google.android.gms.internal.measurement.zziw zze;

    static zzja()
    {
        com.google.android.gms.internal.measurement.zzja v0_1 = new com.google.android.gms.internal.measurement.zzja();
        com.google.android.gms.internal.measurement.zzja.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzja, v0_1);
        return;
    }

    private zzja()
    {
        this.zzd = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzja zzc()
    {
        return com.google.android.gms.internal.measurement.zzja.zzf;
    }

    public final java.util.List zza()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.measurement.zziw zzb()
    {
        com.google.android.gms.internal.measurement.zziw v0 = this.zze;
        if (v0 == null) {
            v0 = com.google.android.gms.internal.measurement.zziw.zzc();
        }
        return v0;
    }

    public final Object zzl(int p2, Object p3, Object p4)
    {
        com.google.android.gms.internal.measurement.zzja v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzja.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] {"zzb", "zzd", com.google.android.gms.internal.measurement.zzje, "zze"}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzja();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zziz(0);
                    } else {
                        if (v2_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzja.zzf;
                        }
                    }
                }
            }
        }
    }
}
