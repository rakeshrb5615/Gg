package com.google.android.gms.measurement.internal;
final class zznx implements java.lang.Runnable {
    final long zza;
    final long zzb;
    final synthetic com.google.android.gms.measurement.internal.zzny zzc;

    public zznx(com.google.android.gms.measurement.internal.zzny p1, long p2, long p4)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        this.zza = p2;
        this.zzb = p4;
        return;
    }

    public final void run()
    {
        this.zzc.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zznw(this));
        return;
    }
}
