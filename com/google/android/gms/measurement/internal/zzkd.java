package com.google.android.gms.measurement.internal;
final class zzkd implements java.lang.Runnable {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic Object zzc;
    final synthetic long zzd;
    final synthetic com.google.android.gms.measurement.internal.zzlj zze;

    public zzkd(com.google.android.gms.measurement.internal.zzlj p1, String p2, String p3, Object p4, long p5)
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
        this.zze.zzN(this.zza, this.zzb, this.zzc, this.zzd);
        return;
    }
}
