package com.google.android.gms.internal.measurement;
final class zzeb extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic boolean zzc;
    final synthetic com.google.android.gms.internal.measurement.zzco zzd;
    final synthetic com.google.android.gms.internal.measurement.zzfb zze;

    public zzeb(com.google.android.gms.internal.measurement.zzfb p1, String p2, String p3, boolean p4, com.google.android.gms.internal.measurement.zzco p5)
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
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze.zzQ())).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
        return;
    }

    public final void zzb()
    {
        this.zzd.zzb(0);
        return;
    }
}
