package com.google.android.gms.measurement.internal;
final class zzir implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzbg zza;
    final synthetic com.google.android.gms.measurement.internal.zzr zzb;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzc;

    public zzir(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzbg p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzr v1 = this.zzb;
        com.google.android.gms.measurement.internal.zzjd v2 = this.zzc;
        v2.zzb(v2.zzc(this.zza, v1), v1);
        return;
    }
}
