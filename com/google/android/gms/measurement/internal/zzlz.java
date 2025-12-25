package com.google.android.gms.measurement.internal;
final class zzlz implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzlu zza;
    final synthetic long zzb;
    final synthetic com.google.android.gms.measurement.internal.zzmb zzc;

    public zzlz(com.google.android.gms.measurement.internal.zzmb p1, com.google.android.gms.measurement.internal.zzlu p2, long p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zznl v0_0 = this.zzc;
        v0_0.zzv(this.zza, 0, this.zzb);
        v0_0.zza = 0;
        v0_0.zzu.zzt().zzG(0);
        return;
    }
}
