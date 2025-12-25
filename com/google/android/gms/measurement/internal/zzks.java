package com.google.android.gms.measurement.internal;
final class zzks implements java.lang.Runnable {
    final synthetic Boolean zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzks(com.google.android.gms.measurement.internal.zzlj p1, Boolean p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zzaj(this.zza, 1);
        return;
    }
}
