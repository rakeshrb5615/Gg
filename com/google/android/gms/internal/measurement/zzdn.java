package com.google.android.gms.internal.measurement;
final class zzdn extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic Boolean zza;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzb;

    public zzdn(com.google.android.gms.internal.measurement.zzfb p1, Boolean p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        return;
    }
}
