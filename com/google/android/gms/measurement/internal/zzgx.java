package com.google.android.gms.measurement.internal;
final class zzgx implements java.lang.Runnable {
    private final com.google.android.gms.measurement.internal.zzgw zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final java.util.Map zzf;

    public synthetic zzgx(String p1, com.google.android.gms.measurement.internal.zzgw p2, int p3, Throwable p4, byte[] p5, java.util.Map p6, byte[] p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p1;
        this.zzf = p6;
        return;
    }

    public final void run()
    {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
        return;
    }
}
