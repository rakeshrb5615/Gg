package com.google.android.gms.internal.measurement;
final class zzdk extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic com.google.android.gms.internal.measurement.zzco zzc;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzd;

    public zzdk(com.google.android.gms.internal.measurement.zzfb p1, String p2, String p3, com.google.android.gms.internal.measurement.zzco p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd.zzQ())).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
        return;
    }

    public final void zzb()
    {
        this.zzc.zzb(0);
        return;
    }
}
