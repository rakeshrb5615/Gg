package com.google.android.gms.measurement.internal;
final class zzmf extends com.google.android.gms.measurement.internal.zzgg {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic com.google.android.gms.measurement.internal.zznl zzb;

    public zzmf(com.google.android.gms.measurement.internal.zznl p1, java.util.concurrent.atomic.AtomicReference p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void zze(com.google.android.gms.measurement.internal.zzoq p5)
    {
        java.util.concurrent.atomic.AtomicReference v0 = this.zza;
        try {
            this.zzb.zzu.zzaV().zzk().zzb("[sgtm] Got upload batches from service. count", Integer.valueOf(p5.zza.size()));
            v0.set(p5);
            v0.notifyAll();
            return;
        } catch (Throwable v5_1) {
            throw v5_1;
        }
    }
}
