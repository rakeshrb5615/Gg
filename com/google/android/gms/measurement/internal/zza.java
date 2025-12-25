package com.google.android.gms.measurement.internal;
final class zza implements java.lang.Runnable {
    final synthetic String zza;
    final synthetic long zzb;
    final synthetic com.google.android.gms.measurement.internal.zzd zzc;

    public zza(com.google.android.gms.measurement.internal.zzd p1, String p2, long p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        this.zzc.zzd(this.zza, this.zzb);
        return;
    }
}
