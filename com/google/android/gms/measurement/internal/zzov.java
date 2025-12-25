package com.google.android.gms.measurement.internal;
final class zzov implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzph zza;
    final synthetic com.google.android.gms.measurement.internal.zzpg zzb;

    public zzov(com.google.android.gms.measurement.internal.zzpg p1, com.google.android.gms.measurement.internal.zzph p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zzb;
        v0.zzau(this.zza);
        v0.zzc();
        return;
    }
}
