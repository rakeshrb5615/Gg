package com.google.android.gms.measurement.internal;
final class zzku implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzjl zza;
    final synthetic long zzb;
    final synthetic boolean zzc;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzd;

    public zzku(com.google.android.gms.measurement.internal.zzlj p1, com.google.android.gms.measurement.internal.zzjl p2, long p3, boolean p5)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p5;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzlj v0 = this.zzd;
        com.google.android.gms.measurement.internal.zzjl v1 = this.zza;
        v0.zzA(v1);
        v0.zzak(v1, this.zzb, 1, this.zzc);
        return;
    }
}
