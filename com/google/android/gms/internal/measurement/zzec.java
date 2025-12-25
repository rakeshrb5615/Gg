package com.google.android.gms.internal.measurement;
final class zzec extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic String zza;
    final synthetic Object zzb;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzc;

    public zzec(com.google.android.gms.internal.measurement.zzfb p1, boolean p2, int p3, String p4, Object p5, Object p6, Object p7)
    {
        this.zza = p4;
        this.zzb = p5;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        super(p1, 0);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzQ())).logHealthData(5, this.zza, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), com.google.android.gms.dynamic.ObjectWrapper.wrap(0), com.google.android.gms.dynamic.ObjectWrapper.wrap(0));
        return;
    }
}
