package com.google.android.gms.measurement.internal;
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final synthetic com.google.android.gms.measurement.internal.zzht zza;

    public zzhn(com.google.android.gms.measurement.internal.zzht p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void zza(int p4, String p5, java.util.List p6, boolean p7, boolean p8)
    {
        com.google.android.gms.measurement.internal.zzgs v4_5;
        com.google.android.gms.measurement.internal.zzgs v4_1 = (p4 - 1);
        if (v4_1 == null) {
            v4_5 = this.zza.zzu.zzaV().zzj();
        } else {
            if (v4_1 == 1) {
                if (p7 == null) {
                    if (p8 != null) {
                        v4_5 = this.zza.zzu.zzaV().zzb();
                    } else {
                        v4_5 = this.zza.zzu.zzaV().zzd();
                    }
                } else {
                    v4_5 = this.zza.zzu.zzaV().zzc();
                }
            } else {
                if (v4_1 == 3) {
                    v4_5 = this.zza.zzu.zzaV().zzk();
                } else {
                    if (v4_1 == 4) {
                        if (p7 == null) {
                            if (p8 != null) {
                                v4_5 = this.zza.zzu.zzaV().zze();
                            } else {
                                v4_5 = this.zza.zzu.zzaV().zzh();
                            }
                        } else {
                            v4_5 = this.zza.zzu.zzaV().zzf();
                        }
                    } else {
                        v4_5 = this.zza.zzu.zzaV().zzi();
                    }
                }
            }
        }
        Object v7_1 = p6.size();
        if (v7_1 == 1) {
            v4_5.zzb(p5, p6.get(0));
            return;
        } else {
            if (v7_1 == 2) {
                v4_5.zzc(p5, p6.get(0), p6.get(1));
                return;
            } else {
                if (v7_1 == 3) {
                    v4_5.zzd(p5, p6.get(0), p6.get(1), p6.get(2));
                    return;
                } else {
                    v4_5.zza(p5);
                    return;
                }
            }
        }
    }
}
