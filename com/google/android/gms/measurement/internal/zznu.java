package com.google.android.gms.measurement.internal;
final class zznu implements java.lang.Runnable {
    final synthetic long zza;
    final synthetic com.google.android.gms.measurement.internal.zzoc zzb;

    public zznu(com.google.android.gms.measurement.internal.zzoc p1, long p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zzk(this.zza);
        return;
    }
}
