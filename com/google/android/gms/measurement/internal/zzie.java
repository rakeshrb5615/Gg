package com.google.android.gms.measurement.internal;
final class zzie implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzb;

    public zzie(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzpg v0_0 = this.zzb;
        v0_0.zzL().zzZ();
        v0_0.zzL().zzah(this.zza);
        return;
    }
}
