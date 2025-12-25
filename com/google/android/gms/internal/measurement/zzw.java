package com.google.android.gms.internal.measurement;
public final class zzw extends com.google.android.gms.internal.measurement.zzai {
    final java.util.Map zza;
    private final com.google.android.gms.internal.measurement.zzj zzb;

    public zzw(com.google.android.gms.internal.measurement.zzj p2)
    {
        super("require");
        super.zza = new java.util.HashMap();
        super.zzb = p2;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p3, java.util.List p4)
    {
        com.google.android.gms.internal.measurement.zzh.zza("require", 1, p4);
        String v3_1 = p3.zza(((com.google.android.gms.internal.measurement.zzao) p4.get(0))).zzc();
        IllegalStateException v4_1 = this.zza;
        if (!v4_1.containsKey(v3_1)) {
            IllegalStateException v4_4;
            IllegalStateException v4_3 = this.zzb.zza;
            if (!v4_3.containsKey(v3_1)) {
                v4_4 = com.google.android.gms.internal.measurement.zzao.zzf;
            } else {
                try {
                    v4_4 = ((com.google.android.gms.internal.measurement.zzao) ((java.util.concurrent.Callable) v4_3.get(v3_1)).call());
                } catch (Exception) {
                    throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(v3_1)));
                }
            }
            if ((v4_4 instanceof com.google.android.gms.internal.measurement.zzai)) {
                this.zza.put(v3_1, ((com.google.android.gms.internal.measurement.zzai) v4_4));
            }
            return v4_4;
        } else {
            return ((com.google.android.gms.internal.measurement.zzao) v4_1.get(v3_1));
        }
    }
}
