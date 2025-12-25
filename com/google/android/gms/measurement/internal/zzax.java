package com.google.android.gms.measurement.internal;
final class zzax implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzjg zza;
    final synthetic com.google.android.gms.measurement.internal.zzay zzb;

    public zzax(com.google.android.gms.measurement.internal.zzay p1, com.google.android.gms.measurement.internal.zzjg p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzay v0_0 = this.zza;
        v0_0.zzaU();
        if (!com.google.android.gms.measurement.internal.zzae.zza()) {
            com.google.android.gms.measurement.internal.zzay v0_2 = this.zzb;
            boolean v1_1 = v0_2.zzc();
            v0_2.zze(0);
            if (v1_1) {
                v0_2.zza();
            }
            return;
        } else {
            v0_0.zzaW().zzj(this);
            return;
        }
    }
}
