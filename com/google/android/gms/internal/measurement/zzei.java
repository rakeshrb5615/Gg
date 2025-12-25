package com.google.android.gms.internal.measurement;
final class zzei extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic com.google.android.gms.internal.measurement.zzco zza;
    final synthetic int zzb;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzc;

    public zzei(com.google.android.gms.internal.measurement.zzfb p1, com.google.android.gms.internal.measurement.zzco p2, int p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzQ())).getTestFlag(this.zza, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zza.zzb(0);
        return;
    }
}
