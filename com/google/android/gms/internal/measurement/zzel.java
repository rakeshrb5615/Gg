package com.google.android.gms.internal.measurement;
final class zzel extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic com.google.android.gms.internal.measurement.zzer zza;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzb;

    public zzel(com.google.android.gms.internal.measurement.zzfb p1, com.google.android.gms.internal.measurement.zzer p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).setEventInterceptor(this.zza);
        return;
    }
}
