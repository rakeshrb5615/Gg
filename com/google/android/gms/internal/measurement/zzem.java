package com.google.android.gms.internal.measurement;
final class zzem extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic android.content.Intent zza;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzb;

    public zzem(com.google.android.gms.internal.measurement.zzfb p1, android.content.Intent p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).setSgtmDebugInfo(this.zza);
        return;
    }
}
