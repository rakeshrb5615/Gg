package com.google.android.gms.measurement.internal;
final synthetic class zzhs implements java.util.concurrent.Callable {
    private final synthetic com.google.android.gms.measurement.internal.zzht zza;
    private final synthetic String zzb;

    public synthetic zzhs(com.google.android.gms.measurement.internal.zzht p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic Object call()
    {
        return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new com.google.android.gms.measurement.internal.zzho(this.zza, this.zzb));
    }
}
