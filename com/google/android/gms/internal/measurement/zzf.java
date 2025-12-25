package com.google.android.gms.internal.measurement;
public final class zzf {
    final com.google.android.gms.internal.measurement.zzaw zza;
    final com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzg zzc;
    final com.google.android.gms.internal.measurement.zzj zzd;

    public zzf()
    {
        com.google.android.gms.internal.measurement.zzah v0_3 = new com.google.android.gms.internal.measurement.zzaw();
        this.zza = v0_3;
        com.google.android.gms.internal.measurement.zzg v1_1 = new com.google.android.gms.internal.measurement.zzg(0, v0_3);
        this.zzc = v1_1;
        this.zzb = v1_1.zzc();
        com.google.android.gms.internal.measurement.zzah v0_2 = new com.google.android.gms.internal.measurement.zzj();
        this.zzd = v0_2;
        v1_1.zze("require", new com.google.android.gms.internal.measurement.zzw(v0_2));
        v0_2.zza("internal.platform", com.google.android.gms.internal.measurement.zze.zza);
        v1_1.zze("runtime.counter", new com.google.android.gms.internal.measurement.zzah(Double.valueOf(0)));
        return;
    }

    public final varargs com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p5, com.google.android.gms.internal.measurement.zzje[] p6)
    {
        com.google.android.gms.internal.measurement.zzao v0_0 = com.google.android.gms.internal.measurement.zzao.zzf;
        int v1 = p6.length;
        int v2 = 0;
        while (v2 < v1) {
            v0_0 = com.google.android.gms.internal.measurement.zzi.zzb(p6[v2]);
            com.google.android.gms.internal.measurement.zzh.zzl(this.zzc);
            if (((v0_0 instanceof com.google.android.gms.internal.measurement.zzap)) || ((v0_0 instanceof com.google.android.gms.internal.measurement.zzan))) {
                v0_0 = this.zza.zzb(p5, v0_0);
            }
            v2++;
        }
        return v0_0;
    }
}
