package com.google.android.gms.internal.measurement;
public final class zzho extends com.google.android.gms.internal.measurement.zzmf implements com.google.android.gms.internal.measurement.zznn {
    private static final com.google.android.gms.internal.measurement.zzho zzd;
    private com.google.android.gms.internal.measurement.zzmo zzb;

    static zzho()
    {
        com.google.android.gms.internal.measurement.zzho v0_1 = new com.google.android.gms.internal.measurement.zzho();
        com.google.android.gms.internal.measurement.zzho.zzd = v0_1;
        com.google.android.gms.internal.measurement.zzmf.zzcp(com.google.android.gms.internal.measurement.zzho, v0_1);
        return;
    }

    private zzho()
    {
        this.zzb = com.google.android.gms.internal.measurement.zzmf.zzcv();
        return;
    }

    public static com.google.android.gms.internal.measurement.zzhh zzb()
    {
        return ((com.google.android.gms.internal.measurement.zzhh) com.google.android.gms.internal.measurement.zzho.zzd.zzck());
    }

    public static com.google.android.gms.internal.measurement.zzho zzc()
    {
        return com.google.android.gms.internal.measurement.zzho.zzd;
    }

    public static synthetic com.google.android.gms.internal.measurement.zzho zze()
    {
        return com.google.android.gms.internal.measurement.zzho.zzd;
    }

    public final java.util.List zza()
    {
        return this.zzb;
    }

    public final synthetic void zzd(Iterable p3)
    {
        com.google.android.gms.internal.measurement.zzmo v0_0 = this.zzb;
        if (!v0_0.zza()) {
            this.zzb = com.google.android.gms.internal.measurement.zzmf.zzcw(v0_0);
        }
        com.google.android.gms.internal.measurement.zzks.zzce(p3, this.zzb);
        return;
    }

    public final Object zzl(int p1, Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zzho v1_1 = (p1 - 1);
        if (v1_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.internal.measurement.zzmf.zzcq(com.google.android.gms.internal.measurement.zzho.zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] {"zzb", com.google.android.gms.internal.measurement.zzhl}));
            } else {
                if (v1_1 == 3) {
                    return new com.google.android.gms.internal.measurement.zzho();
                } else {
                    if (v1_1 == 4) {
                        return new com.google.android.gms.internal.measurement.zzhh(0);
                    } else {
                        if (v1_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.measurement.zzho.zzd;
                        }
                    }
                }
            }
        }
    }
}
