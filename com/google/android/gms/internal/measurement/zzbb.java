package com.google.android.gms.internal.measurement;
public final class zzbb extends com.google.android.gms.internal.measurement.zzav {

    public zzbb()
    {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzb);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzV);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzY);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p6, com.google.android.gms.internal.measurement.zzg p7, java.util.List p8)
    {
        boolean v0_3 = com.google.android.gms.internal.measurement.zzh.zze(p6).ordinal();
        if (v0_3 == 1) {
            com.google.android.gms.internal.measurement.zzao v6_3 = p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzb, 2, p8, 0)));
            if (v6_3.zze().booleanValue()) {
                v6_3 = p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1)));
            }
            return v6_3;
        } else {
            if (v0_3 == 47) {
                return new com.google.android.gms.internal.measurement.zzaf(Boolean.valueOf((p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzV, 1, p8, 0))).zze().booleanValue() ^ 1)));
            } else {
                if (v0_3 == 50) {
                    com.google.android.gms.internal.measurement.zzao v6_17 = p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzY, 2, p8, 0)));
                    if (!v6_17.zze().booleanValue()) {
                        v6_17 = p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1)));
                    }
                    return v6_17;
                } else {
                    return this.zzb(p6);
                }
            }
        }
    }
}
