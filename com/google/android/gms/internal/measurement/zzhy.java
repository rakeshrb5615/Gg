package com.google.android.gms.internal.measurement;
public final class zzhy extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzhy zzg;
    private int zzb;
    private String zzd;
    private String zze;
    private com.google.android.gms.internal.measurement.zzhc zzf;

    static zzhy()
    {
        com.google.android.gms.internal.measurement.zzhy v0_1 = new com.google.android.gms.internal.measurement.zzhy();
        com.google.android.gms.internal.measurement.zzhy.zzg = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzhy, v0_1);
        return;
    }

    private zzhy()
    {
        this.zzd = "";
        this.zze = "";
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzhy zza()
    {
        return com.google.android.gms.internal.measurement.zzhy.zzg;
    }

    public final Object zzl(int p2, Object p3, Object p4)
    {
        com.google.android.gms.internal.measurement.zzhy v2_1 = (p2 - 1);
        if (v2_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v2_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzhy.zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] {"zzb", "zzd", "zze", "zzf"}));
            } else {
                if (v2_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzhy();
                } else {
                    if (v2_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhx(0);
                    } else {
                        if (v2_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzhy.zzg;
                        }
                    }
                }
            }
        }
    }
}
