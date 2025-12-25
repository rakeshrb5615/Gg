package com.google.android.gms.measurement.internal;
final class zzkf implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic boolean zzb;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzc;

    public zzkf(com.google.android.gms.measurement.internal.zzlj p1, java.util.concurrent.atomic.AtomicReference p2, boolean p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        this.zzc.zzu.zzt().zzv(this.zza, this.zzb);
        return;
    }
}
