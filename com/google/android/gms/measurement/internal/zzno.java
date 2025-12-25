package com.google.android.gms.measurement.internal;
final class zzno implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzpg zza;
    final synthetic Runnable zzb;

    public zzno(com.google.android.gms.measurement.internal.zznt p1, com.google.android.gms.measurement.internal.zzpg p2, Runnable p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zza;
        v0.zzZ();
        v0.zzY(this.zzb);
        v0.zzM();
        return;
    }
}
