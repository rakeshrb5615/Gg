package com.google.android.gms.internal.measurement;
final class zzez extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic android.app.Activity zza;
    final synthetic com.google.android.gms.internal.measurement.zzfa zzb;

    public zzez(com.google.android.gms.internal.measurement.zzfa p1, android.app.Activity p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p1.zza, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zza.zzQ())).onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(this.zza), this.zzi);
        return;
    }
}
