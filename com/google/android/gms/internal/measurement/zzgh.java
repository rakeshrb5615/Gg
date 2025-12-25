package com.google.android.gms.internal.measurement;
public final class zzgh extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgh zzg;
    private int zzb;
    private String zzd;
    private com.google.android.gms.internal.measurement.zzmo zze;
    private boolean zzf;

    static zzgh()
    {
        com.google.android.gms.internal.measurement.zzgh v0_1 = new com.google.android.gms.internal.measurement.zzgh();
        com.google.android.gms.internal.measurement.zzgh.zzg = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgh, v0_1);
        return;
    }

    private zzgh()
    {
        this.zzd = "";
        this.zze = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgh zzb()
    {
        return com.google.android.gms.internal.measurement.zzgh.zzg;
    }

    public final String zza()
    {
        return this.zzd;
    }

    public final Object zzl(int p3, Object p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzgh v3_1 = (p3 - 1);
        if (v3_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v3_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgh.zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1007\u0001", new Object[] {"zzb", "zzd", "zze", com.google.android.gms.internal.measurement.zzgr, "zzf"}));
            } else {
                if (v3_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgh();
                } else {
                    if (v3_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgg(0);
                    } else {
                        if (v3_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgh.zzg;
                        }
                    }
                }
            }
        }
    }
}
