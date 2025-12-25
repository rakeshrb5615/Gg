package com.google.android.gms.measurement.internal;
final class zzjv implements java.util.concurrent.Executor {
    final synthetic com.google.android.gms.measurement.internal.zzlj zza;

    public zzjv(com.google.android.gms.measurement.internal.zzlj p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void execute(Runnable p2)
    {
        this.zza.zzu.zzaW().zzj(p2);
        return;
    }
}
