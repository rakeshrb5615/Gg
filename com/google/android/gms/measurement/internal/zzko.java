package com.google.android.gms.measurement.internal;
final class zzko implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzko(com.google.android.gms.measurement.internal.zzlj p1, java.util.concurrent.atomic.AtomicReference p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        Throwable v1_0 = this.zzb;
        this.zza.set(v1_0.zzu.zzc().zzk(v1_0.zzu.zzv().zzj(), com.google.android.gms.measurement.internal.zzfy.zzab));
        this.zza.notify();
        return;
    }
}
