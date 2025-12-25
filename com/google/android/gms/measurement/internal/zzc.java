package com.google.android.gms.measurement.internal;
final class zzc implements java.lang.Runnable {
    final synthetic long zza;
    final synthetic com.google.android.gms.measurement.internal.zzd zzb;

    public zzc(com.google.android.gms.measurement.internal.zzd p1, long p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zzf(this.zza);
        return;
    }
}
