package com.google.android.gms.internal.measurement;
public final class zzk extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzab zza;

    public zzk(com.google.android.gms.internal.measurement.zzab p2)
    {
        super("internal.eventLogger");
        super.zza = p2;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p5, java.util.List p6)
    {
        com.google.android.gms.internal.measurement.zzao v5_3;
        com.google.android.gms.internal.measurement.zzh.zza(this.zzd, 3, p6);
        String v0_1 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(0))).zzc();
        long v1_8 = ((long) com.google.android.gms.internal.measurement.zzh.zzi(p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(1))).zzd().doubleValue()));
        com.google.android.gms.internal.measurement.zzao v5_1 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(2)));
        if (!(v5_1 instanceof com.google.android.gms.internal.measurement.zzal)) {
            v5_3 = new java.util.HashMap();
        } else {
            v5_3 = com.google.android.gms.internal.measurement.zzh.zzk(((com.google.android.gms.internal.measurement.zzal) v5_1));
        }
        this.zza.zze(v0_1, v1_8, v5_3);
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }
}
