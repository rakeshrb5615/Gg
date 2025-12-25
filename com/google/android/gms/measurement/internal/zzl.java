package com.google.android.gms.measurement.internal;
final class zzl implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzp zza;
    final synthetic com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    public zzl(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService p1, com.google.android.gms.measurement.internal.zzp p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zza.zzj().zzV(this.zza);
        return;
    }
}
