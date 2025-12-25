package com.google.android.gms.internal.measurement;
final class zzeh extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic com.google.android.gms.internal.measurement.zzco zza;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzb;

    public zzeh(com.google.android.gms.internal.measurement.zzfb p1, com.google.android.gms.internal.measurement.zzco p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).getSessionId(this.zza);
        return;
    }

    public final void zzb()
    {
        this.zza.zzb(0);
        return;
    }
}
