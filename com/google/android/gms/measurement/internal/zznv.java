package com.google.android.gms.measurement.internal;
final class zznv implements java.lang.Runnable {
    final synthetic long zza;
    final synthetic com.google.android.gms.measurement.internal.zzoc zzb;

    public zznv(com.google.android.gms.measurement.internal.zzoc p1, long p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zzl(this.zza);
        return;
    }
}
