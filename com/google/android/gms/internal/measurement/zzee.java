package com.google.android.gms.internal.measurement;
final class zzee extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic android.os.Bundle zza;
    final synthetic com.google.android.gms.internal.measurement.zzco zzb;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzc;

    public zzee(com.google.android.gms.internal.measurement.zzfb p1, android.os.Bundle p2, com.google.android.gms.internal.measurement.zzco p3)
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
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzQ())).performAction(this.zza, this.zzb, this.zzh);
        return;
    }

    public final void zzb()
    {
        this.zzb.zzb(0);
        return;
    }
}
