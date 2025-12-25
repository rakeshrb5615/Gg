package com.google.android.gms.internal.measurement;
public final class zzgn extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzgn zzd;
    private com.google.android.gms.internal.measurement.zzmo zzb;

    static zzgn()
    {
        com.google.android.gms.internal.measurement.zzgn v0_1 = new com.google.android.gms.internal.measurement.zzgn();
        com.google.android.gms.internal.measurement.zzgn.zzd = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzgn, v0_1);
        return;
    }

    private zzgn()
    {
        this.zzb = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzgn zza()
    {
        return com.google.android.gms.internal.measurement.zzgn.zzd;
    }

    public final Object zzl(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zzgn v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzgn.zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] {"zzb"}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzgn();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzgm(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzgn.zzd;
                        }
                    }
                }
            }
        }
    }
}
