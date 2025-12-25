package com.google.android.gms.measurement.internal;
final class zzih implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzah zza;
    final synthetic com.google.android.gms.measurement.internal.zzr zzb;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzc;

    public zzih(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzah p2, com.google.android.gms.measurement.internal.zzr p3)
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
        com.google.android.gms.measurement.internal.zzah v1_1 = this.zza;
        if (v1_1.zzc.zza() != null) {
            v0_0.zzL().zzak(v1_1, this.zzb);
            return;
        } else {
            v0_0.zzL().zzam(v1_1, this.zzb);
            return;
        }
    }
}
