package com.google.android.gms.measurement.internal;
final class zzkl implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic boolean zzd;
    final synthetic com.google.android.gms.measurement.internal.zzlj zze;

    public zzkl(com.google.android.gms.measurement.internal.zzlj p1, java.util.concurrent.atomic.AtomicReference p2, String p3, String p4, String p5, boolean p6)
    {
        this.zza = p2;
        this.zzb = p4;
        this.zzc = p5;
        this.zzd = p6;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final void run()
    {
        this.zze.zzu.zzt().zzt(this.zza, 0, this.zzb, this.zzc, this.zzd);
        return;
    }
}
