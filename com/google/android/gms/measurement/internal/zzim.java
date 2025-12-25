package com.google.android.gms.measurement.internal;
final class zzim implements java.util.concurrent.Callable {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzd;

    public zzim(com.google.android.gms.measurement.internal.zzjd p1, String p2, String p3, String p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final bridge synthetic Object call()
    {
        java.util.List v0_0 = this.zzd;
        v0_0.zzL().zzZ();
        return v0_0.zzL().zzj().zzs(this.zza, this.zzb, this.zzc);
    }
}
