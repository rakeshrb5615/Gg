package com.google.android.gms.measurement.internal;
final class zzi implements java.lang.Runnable {
    final synthetic com.google.android.gms.internal.measurement.zzcu zza;
    final synthetic com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    public zzi(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService p1, com.google.android.gms.internal.measurement.zzcu p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zza.zzt().zzD(this.zza);
        return;
    }
}
