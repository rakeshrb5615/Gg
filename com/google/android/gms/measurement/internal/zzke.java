package com.google.android.gms.measurement.internal;
final class zzke implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzke(com.google.android.gms.measurement.internal.zzlj p1, java.util.concurrent.atomic.AtomicReference p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        Throwable v1_0 = this.zzb;
        this.zza.set(Boolean.valueOf(v1_0.zzu.zzc().zzp(v1_0.zzu.zzv().zzj(), com.google.android.gms.measurement.internal.zzfy.zzaa)));
        this.zza.notify();
        return;
    }
}
