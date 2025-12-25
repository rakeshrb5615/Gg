package com.google.android.gms.measurement.internal;
final class zzii implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzah zza;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzb;

    public zzii(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzah p2)
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
        com.google.android.gms.measurement.internal.zzah v1_1 = this.zza;
        if (v1_1.zzc.zza() != null) {
            v0_0.zzL().zzaj(v1_1);
            return;
        } else {
            v0_0.zzL().zzal(v1_1);
            return;
        }
    }
}
