package com.google.android.gms.measurement.internal;
final class zzmy implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzgb zza;
    final synthetic com.google.android.gms.measurement.internal.zznf zzb;

    public zzmy(com.google.android.gms.measurement.internal.zznf p1, com.google.android.gms.measurement.internal.zzgb p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zznf v0 = this.zzb;
        v0.zzd(0);
        Throwable v1_2 = v0.zza;
        if (!v1_2.zzh()) {
            v1_2.zzu.zzaV().zzk().zza("Connected to service");
            v1_2.zzL(this.zza);
        }
        return;
    }
}
