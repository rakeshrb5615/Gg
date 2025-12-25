package com.google.android.gms.measurement.internal;
final class zzip implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzb;

    public zzip(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzr p2)
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
        com.google.android.gms.measurement.internal.zzpg v0_1 = v0_0.zzL();
        v0_1.zzaW().zzg();
        v0_1.zzu();
        com.google.android.gms.measurement.internal.zzr v1_0 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_0.zza);
        v0_1.zzv(v1_0);
        v0_1.zzw(v1_0);
        return;
    }
}
