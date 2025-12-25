package com.google.android.gms.internal.measurement;
final class zzey extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic android.app.Activity zza;
    final synthetic com.google.android.gms.internal.measurement.zzco zzb;
    final synthetic com.google.android.gms.internal.measurement.zzfa zzc;

    public zzey(com.google.android.gms.internal.measurement.zzfa p1, android.app.Activity p2, com.google.android.gms.internal.measurement.zzco p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        super(p1.zza, 1);
        return;
    }

    public final void zza()
    {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zza.zzQ())).onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(this.zza), this.zzb, this.zzi);
        return;
    }
}
