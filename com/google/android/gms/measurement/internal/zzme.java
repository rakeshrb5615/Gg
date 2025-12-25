package com.google.android.gms.measurement.internal;
final class zzme extends com.google.android.gms.measurement.internal.zzgd {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;

    public zzme(com.google.android.gms.measurement.internal.zznl p1, java.util.concurrent.atomic.AtomicReference p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final void zze(java.util.List p2)
    {
        java.util.concurrent.atomic.AtomicReference v0 = this.zza;
        try {
            v0.set(p2);
            v0.notifyAll();
            return;
        } catch (Throwable v2_1) {
            throw v2_1;
        }
    }
}
