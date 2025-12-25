package com.google.android.gms.internal.measurement;
public final class zzgc extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgc zzf;
    private int zzb;
    private String zzd;
    private String zze;

    static zzgc()
    {
        com.google.android.gms.internal.measurement.zzgc v0_1 = new com.google.android.gms.internal.measurement.zzgc();
        com.google.android.gms.internal.measurement.zzgc.zzf = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgc, v0_1);
        return;
    }

    private zzgc()
    {
        this.zzd = "";
        this.zze = "";
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgc zzb()
    {
        return com.google.android.gms.internal.measurement.zzgc.zzf;
    }

    public final String zza()
    {
        return this.zzd;
    }

    public final Object zzl(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zzgc v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgc.zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] {"zzb", "zzd", "zze"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgc();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgb(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgc.zzf;
                        }
                    }
                }
            }
        }
    }
}
