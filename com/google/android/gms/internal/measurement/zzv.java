package com.google.android.gms.internal.measurement;
public final class zzv extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzz zza;

    public zzv(com.google.android.gms.internal.measurement.zzz p2)
    {
        super("internal.registerCallback");
        super.zza = p2;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p5, java.util.List p6)
    {
        com.google.android.gms.internal.measurement.zzh.zza(this.zzd, 3, p6);
        String v0_1 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(0))).zzc();
        com.google.android.gms.internal.measurement.zzan v1_4 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(1)));
        if (!(v1_4 instanceof com.google.android.gms.internal.measurement.zzan)) {
            throw new IllegalArgumentException("Invalid callback type");
        } else {
            com.google.android.gms.internal.measurement.zzao v5_3 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(2)));
            if (!(v5_3 instanceof com.google.android.gms.internal.measurement.zzal)) {
                throw new IllegalArgumentException("Invalid callback params");
            } else {
                com.google.android.gms.internal.measurement.zzao v5_6 = ((com.google.android.gms.internal.measurement.zzal) v5_3);
                if (!v5_6.zzj("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                } else {
                    com.google.android.gms.internal.measurement.zzao v5_9;
                    String v6_9 = v5_6.zzk("type").zzc();
                    if (!v5_6.zzj("priority")) {
                        v5_9 = 1000;
                    } else {
                        v5_9 = com.google.android.gms.internal.measurement.zzh.zzg(v5_6.zzk("priority").zzd().doubleValue());
                    }
                    this.zza.zza(v0_1, v5_9, ((com.google.android.gms.internal.measurement.zzan) v1_4), v6_9);
                    return com.google.android.gms.internal.measurement.zzao.zzf;
                }
            }
        }
    }
}
