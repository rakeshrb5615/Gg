package com.google.android.gms.internal.measurement;
final class zzm extends com.google.android.gms.internal.measurement.zzai {
    final synthetic com.google.android.gms.internal.measurement.zzo zza;

    public zzm(com.google.android.gms.internal.measurement.zzn p1, String p2, com.google.android.gms.internal.measurement.zzo p3)
    {
        this.zza = p3;
        java.util.Objects.requireNonNull(p1);
        super("getValue");
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p3, java.util.List p4)
    {
        com.google.android.gms.internal.measurement.zzh.zza("getValue", 2, p4);
        com.google.android.gms.internal.measurement.zzo v0_5 = p3.zza(((com.google.android.gms.internal.measurement.zzao) p4.get(0)));
        com.google.android.gms.internal.measurement.zzas v3_1 = p3.zza(((com.google.android.gms.internal.measurement.zzao) p4.get(1)));
        String v4_4 = this.zza.zza(v0_5.zzc());
        if (v4_4 != null) {
            v3_1 = new com.google.android.gms.internal.measurement.zzas(v4_4);
        }
        return v3_1;
    }
}
