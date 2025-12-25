package com.google.android.gms.measurement.internal;
public final class zzfx {
    private static final Object zze;
    private final String zza;
    private final com.google.android.gms.measurement.internal.zzbn zzb;
    private final Object zzc;
    private final Object zzd;
    private volatile Object zzf;
    private volatile Object zzg;

    static zzfx()
    {
        com.google.android.gms.measurement.internal.zzfx.zze = new Object();
        return;
    }

    public synthetic zzfx(String p1, Object p2, Object p3, com.google.android.gms.measurement.internal.zzbn p4, byte[] p5)
    {
        this.zzd = new Object();
        this.zzf = 0;
        this.zzg = 0;
        this.zza = p1;
        this.zzc = p2;
        this.zzb = p4;
        return;
    }

    public final String zza()
    {
        return this.zza;
    }

    public final Object zzb(Object p4)
    {
        if (p4 == null) {
            if (com.google.android.gms.measurement.internal.zzfr.zza != null) {
                if (!com.google.android.gms.measurement.internal.zzae.zza()) {
                    try {
                        Throwable v4_2 = com.google.android.gms.measurement.internal.zzfy.zzb().iterator();
                    } catch (IllegalStateException) {
                        Throwable v4_7 = this.zzb;
                        try {
                            if (v4_7 != null) {
                                Throwable v4_8 = v4_7.zza();
                            } else {
                                v4_8 = this.zzc;
                            }
                        } catch (IllegalStateException) {
                        }
                        return v4_8;
                    }
                    while (v4_2.hasNext()) {
                        String v0_2 = ((com.google.android.gms.measurement.internal.zzfx) v4_2.next());
                        if (com.google.android.gms.measurement.internal.zzae.zza()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        } else {
                            Object v1_1 = 0;
                            Object v2 = v0_2.zzb;
                            if (v2 == null) {
                                v0_2.zzg = v1_1;
                            } else {
                                v1_1 = v2.zza();
                            }
                        }
                    }
                } else {
                    String v0_5;
                    if (this.zzg != null) {
                        v0_5 = this.zzg;
                    } else {
                        v0_5 = this.zzc;
                    }
                    return v0_5;
                }
            } else {
                return this.zzc;
            }
        } else {
            return p4;
        }
    }
}
