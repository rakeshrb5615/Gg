package com.google.android.gms.measurement.internal;
final class zzmh implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.measurement.internal.zznl zzb;

    public zzmh(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zznl v0_0 = this.zzb;
        com.google.android.gms.measurement.internal.zzgs v1_2 = v0_0.zzZ();
        if (v1_2 != null) {
            try {
                com.google.android.gms.measurement.internal.zznl v0_3 = this.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_3);
                v1_2.zzt(v0_3);
            } catch (com.google.android.gms.measurement.internal.zznl v0_4) {
                this.zzb.zzu.zzaV().zzb().zzb("Failed to reset data on the service: remote exception", v0_4);
            }
            this.zzb.zzV();
            return;
        } else {
            v1.a.s(v0_0.zzu, "Failed to reset data on the service: not connected to service");
            return;
        }
    }
}
