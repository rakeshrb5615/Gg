package com.google.android.gms.measurement.internal;
final class zzmu implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic boolean zzb;
    final synthetic com.google.android.gms.measurement.internal.zzah zzc;
    final synthetic com.google.android.gms.measurement.internal.zznl zzd;

    public zzmu(com.google.android.gms.measurement.internal.zznl p1, boolean p2, com.google.android.gms.measurement.internal.zzr p3, boolean p4, com.google.android.gms.measurement.internal.zzah p5, com.google.android.gms.measurement.internal.zzah p6)
    {
        this.zza = p3;
        this.zzb = p4;
        this.zzc = p5;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzic v0_0 = this.zzd;
        String v1_1 = v0_0.zzZ();
        if (v1_1 != null) {
            com.google.android.gms.measurement.internal.zzah v3_1;
            com.google.android.gms.measurement.internal.zzr v2 = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v2);
            if (!this.zzb) {
                v3_1 = this.zzc;
            } else {
                v3_1 = 0;
            }
            v0_0.zzm(v1_1, v3_1, v2);
            v0_0.zzV();
            return;
        } else {
            v1.a.s(v0_0.zzu, "Discarding data. Failed to send conditional user property to service");
            return;
        }
    }
}
