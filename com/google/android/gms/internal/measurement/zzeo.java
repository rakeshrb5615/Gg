package com.google.android.gms.internal.measurement;
final class zzeo extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic com.google.android.gms.internal.measurement.zzes zza;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzb;

    public zzeo(com.google.android.gms.internal.measurement.zzfb p1, com.google.android.gms.internal.measurement.zzes p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).unregisterOnMeasurementEventListener(this.zza);
        return;
    }
}
