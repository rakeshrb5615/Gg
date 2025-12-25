package com.google.android.gms.measurement.internal;
final class zzly implements java.lang.Runnable {
    final synthetic long zza;
    final synthetic com.google.android.gms.measurement.internal.zzmb zzb;

    public zzly(com.google.android.gms.measurement.internal.zzmb p1, long p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzmb v0 = this.zzb;
        v0.zzu.zzw().zzc(this.zza);
        v0.zza = 0;
        return;
    }
}
