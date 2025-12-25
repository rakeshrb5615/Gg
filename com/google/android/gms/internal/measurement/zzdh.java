package com.google.android.gms.internal.measurement;
final class zzdh extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic Object zzc;
    final synthetic boolean zzd;
    final synthetic com.google.android.gms.internal.measurement.zzfb zze;

    public zzdh(com.google.android.gms.internal.measurement.zzfb p1, String p2, String p3, Object p4, boolean p5)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze.zzQ())).setUserProperty(this.zza, this.zzb, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzd, this.zzh);
        return;
    }
}
