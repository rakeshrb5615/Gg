package com.google.android.gms.measurement.internal;
final class zzna implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzgb zza;
    final synthetic com.google.android.gms.measurement.internal.zznf zzb;

    public zzna(com.google.android.gms.measurement.internal.zznf p1, com.google.android.gms.measurement.internal.zzgb p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zznl v0_0 = this.zzb;
        v0_0.zzd(0);
        int v1_5 = v0_0.zza;
        if (!v1_5.zzh()) {
            v1_5.zzu.zzaV().zzj().zza("Connected to remote service");
            v1_5.zzL(this.zza);
        }
        com.google.android.gms.measurement.internal.zznl v0_2 = this.zzb.zza;
        if (v0_2.zzab() != null) {
            v0_2.zzab().shutdownNow();
            v0_2.zzac(0);
        }
        return;
    }
}
