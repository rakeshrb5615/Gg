package com.google.android.gms.measurement.internal;
final class zzlv implements java.lang.Runnable {
    final synthetic android.os.Bundle zza;
    final synthetic com.google.android.gms.measurement.internal.zzlu zzb;
    final synthetic com.google.android.gms.measurement.internal.zzlu zzc;
    final synthetic long zzd;
    final synthetic com.google.android.gms.measurement.internal.zzmb zze;

    public zzlv(com.google.android.gms.measurement.internal.zzmb p1, android.os.Bundle p2, com.google.android.gms.measurement.internal.zzlu p3, com.google.android.gms.measurement.internal.zzlu p4, long p5)
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
        this.zze.zzt(this.zza, this.zzb, this.zzc, this.zzd);
        return;
    }
}
