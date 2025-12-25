package com.google.android.gms.measurement.internal;
final class zzkk implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzd;

    public zzkk(com.google.android.gms.measurement.internal.zzlj p1, java.util.concurrent.atomic.AtomicReference p2, String p3, String p4, String p5)
    {
        this.zza = p2;
        this.zzb = p4;
        this.zzc = p5;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        this.zzd.zzu.zzt().zzq(this.zza, 0, this.zzb, this.zzc);
        return;
    }
}
