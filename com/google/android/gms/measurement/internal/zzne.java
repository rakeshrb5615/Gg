package com.google.android.gms.measurement.internal;
final class zzne implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.ConnectionResult zza;
    final synthetic com.google.android.gms.measurement.internal.zznf zzb;

    public zzne(com.google.android.gms.measurement.internal.zznf p1, com.google.android.gms.common.ConnectionResult p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        java.util.concurrent.ScheduledExecutorService v0_1 = this.zzb.zza;
        v0_1.zzaa(0);
        if (this.zza.getErrorCode() != 7777) {
            v0_1.zzX();
            return;
        } else {
            if (v0_1.zzab() == null) {
                v0_1.zzac(java.util.concurrent.Executors.newScheduledThreadPool(1));
            }
            v0_1.zzab().schedule(new com.google.android.gms.measurement.internal.zznc(this), ((Long) com.google.android.gms.measurement.internal.zzfy.zzZ.zzb(0)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return;
        }
    }
}
