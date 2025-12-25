package com.google.android.gms.measurement.internal;
final class zzka implements java.lang.Runnable {
    final synthetic long zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzka(com.google.android.gms.measurement.internal.zzlj p1, long p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzgs v0_1 = this.zzb.zzu;
        Long v2_1 = this.zza;
        v0_1.zzd().zzf.zzb(v2_1);
        v0_1.zzaV().zzj().zzb("Session timeout duration set", Long.valueOf(v2_1));
        return;
    }
}
