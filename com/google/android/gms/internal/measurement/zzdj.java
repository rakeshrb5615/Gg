package com.google.android.gms.internal.measurement;
final class zzdj extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic android.os.Bundle zzc;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzd;

    public zzdj(com.google.android.gms.internal.measurement.zzfb p1, String p2, String p3, android.os.Bundle p4)
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
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd.zzQ())).clearConditionalUserProperty(this.zza, this.zzb, this.zzc);
        return;
    }
}
