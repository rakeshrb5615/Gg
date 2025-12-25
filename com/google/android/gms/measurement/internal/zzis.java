package com.google.android.gms.measurement.internal;
final class zzis implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzbg zza;
    final synthetic String zzb;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzc;

    public zzis(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzbg p2, String p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzpg v0_0 = this.zzc;
        v0_0.zzL().zzZ();
        v0_0.zzL().zzD(this.zza, this.zzb);
        return;
    }
}
