package com.google.android.gms.measurement.internal;
final class zzlw implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzlu zza;
    final synthetic com.google.android.gms.measurement.internal.zzlu zzb;
    final synthetic long zzc;
    final synthetic boolean zzd;
    final synthetic com.google.android.gms.measurement.internal.zzmb zze;

    public zzlw(com.google.android.gms.measurement.internal.zzmb p1, com.google.android.gms.measurement.internal.zzlu p2, com.google.android.gms.measurement.internal.zzlu p3, long p4, boolean p6)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p6;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final void run()
    {
        this.zze.zzu(this.zza, this.zzb, this.zzc, this.zzd, 0);
        return;
    }
}
