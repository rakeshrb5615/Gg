package com.google.android.gms.internal.measurement;
final class zzdq extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic long zza;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzb;

    public zzdq(com.google.android.gms.internal.measurement.zzfb p1, long p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).setSessionTimeoutDuration(this.zza);
        return;
    }
}
