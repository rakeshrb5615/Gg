package com.google.android.gms.measurement.internal;
final class zzmg implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic boolean zzb;
    final synthetic com.google.android.gms.measurement.internal.zzpl zzc;
    final synthetic com.google.android.gms.measurement.internal.zznl zzd;

    public zzmg(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzr p2, boolean p3, com.google.android.gms.measurement.internal.zzpl p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzic v0_0 = this.zzd;
        String v1_1 = v0_0.zzZ();
        if (v1_1 != null) {
            com.google.android.gms.measurement.internal.zzpl v3_1;
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
            v1.a.s(v0_0.zzu, "Discarding data. Failed to set user property");
            return;
        }
    }
}
