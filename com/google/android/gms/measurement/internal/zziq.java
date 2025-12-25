package com.google.android.gms.measurement.internal;
final class zziq implements java.util.concurrent.Callable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzb;

    public zziq(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final bridge synthetic Object call()
    {
        android.os.Bundle v0_0 = this.zzb;
        v0_0.zzL().zzZ();
        return new com.google.android.gms.measurement.internal.zzao(v0_0.zzL().zzy(this.zza.zza));
    }
}
