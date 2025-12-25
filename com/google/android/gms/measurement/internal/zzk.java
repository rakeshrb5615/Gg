package com.google.android.gms.measurement.internal;
final class zzk implements java.lang.Runnable {
    final synthetic com.google.android.gms.internal.measurement.zzcu zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic boolean zzd;
    final synthetic com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zze;

    public zzk(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService p1, com.google.android.gms.internal.measurement.zzcu p2, String p3, String p4, boolean p5)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final void run()
    {
        this.zze.zza.zzt().zzu(this.zza, this.zzb, this.zzc, this.zzd);
        return;
    }
}
