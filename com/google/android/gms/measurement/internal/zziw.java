package com.google.android.gms.measurement.internal;
final class zziw implements java.util.concurrent.Callable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic android.os.Bundle zzb;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzc;

    public zziw(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzr p2, android.os.Bundle p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final bridge synthetic Object call()
    {
        java.util.List v0_0 = this.zzc;
        v0_0.zzL().zzZ();
        return v0_0.zzL().zzaq(this.zza, this.zzb);
    }
}
