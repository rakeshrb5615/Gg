package com.google.android.gms.internal.measurement;
final class zzds extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic String zza;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzb;

    public zzds(com.google.android.gms.internal.measurement.zzfb p1, String p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).beginAdUnitExposure(this.zza, this.zzi);
        return;
    }
}
