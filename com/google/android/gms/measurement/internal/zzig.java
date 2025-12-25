package com.google.android.gms.measurement.internal;
final class zzig implements java.lang.Runnable {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic long zzd;
    final synthetic com.google.android.gms.measurement.internal.zzjd zze;

    public zzig(com.google.android.gms.measurement.internal.zzjd p1, String p2, String p3, String p4, long p5)
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
        com.google.android.gms.measurement.internal.zzpg v0_0 = this.zza;
        if (v0_0 != null) {
            this.zze.zzL().zzat(this.zzb, new com.google.android.gms.measurement.internal.zzlu(this.zzc, v0_0, this.zzd));
            return;
        } else {
            this.zze.zzL().zzat(this.zzb, 0);
            return;
        }
    }
}
