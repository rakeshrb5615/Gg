package com.google.android.gms.measurement.internal;
final class zzm implements java.lang.Runnable {
    final synthetic com.google.android.gms.internal.measurement.zzcu zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzd;

    public zzm(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService p1, com.google.android.gms.internal.measurement.zzcu p2, String p3, String p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        this.zzd.zza.zzt().zzs(this.zza, this.zzb, this.zzc);
        return;
    }
}
