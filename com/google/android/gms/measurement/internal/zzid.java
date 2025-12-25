package com.google.android.gms.measurement.internal;
final class zzid implements java.util.concurrent.Callable {
    final synthetic String zza;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzb;

    public zzid(com.google.android.gms.measurement.internal.zzjd p1, String p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final bridge synthetic Object call()
    {
        java.util.List v0_0 = this.zzb;
        v0_0.zzL().zzZ();
        return v0_0.zzL().zzj().zzn(this.zza);
    }
}
