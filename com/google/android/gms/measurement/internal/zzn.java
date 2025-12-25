package com.google.android.gms.measurement.internal;
final class zzn implements java.lang.Runnable {
    final synthetic com.google.android.gms.internal.measurement.zzcu zza;
    final synthetic com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    public zzn(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService p1, com.google.android.gms.internal.measurement.zzcu p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        boolean v0_0 = this.zzb;
        v0_0.zza.zzk().zzap(this.zza, v0_0.zza.zzA());
        return;
    }
}
