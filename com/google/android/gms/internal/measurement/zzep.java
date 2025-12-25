package com.google.android.gms.internal.measurement;
final class zzep extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic Long zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic android.os.Bundle zzd;
    final synthetic boolean zze;
    final synthetic boolean zzf;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzg;

    public zzep(com.google.android.gms.internal.measurement.zzfb p1, Long p2, String p3, String p4, android.os.Bundle p5, boolean p6, boolean p7)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        java.util.Objects.requireNonNull(p1);
        this.zzg = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        Object v0_2;
        Object v0_0 = this.zza;
        if (v0_0 != null) {
            v0_2 = v0_0.longValue();
        } else {
            v0_2 = this.zzh;
        }
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzg.zzQ())).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, v0_2);
        return;
    }
}
