package com.google.android.gms.measurement.internal;
final class zzow implements com.google.android.gms.measurement.internal.zzgw {
    final synthetic String zza;
    final synthetic java.util.List zzb;
    final synthetic com.google.android.gms.measurement.internal.zzpg zzc;

    public zzow(com.google.android.gms.measurement.internal.zzpg p1, String p2, java.util.List p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void zza(String p8, int p9, Throwable p10, byte[] p11, java.util.Map p12)
    {
        this.zzc.zzV(1, p9, p10, p11, this.zza, this.zzb);
        return;
    }
}
