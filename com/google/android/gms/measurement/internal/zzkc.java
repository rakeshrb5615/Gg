package com.google.android.gms.measurement.internal;
final class zzkc implements java.lang.Runnable {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic long zzc;
    final synthetic android.os.Bundle zzd;
    final synthetic boolean zze;
    final synthetic boolean zzf;
    final synthetic boolean zzg;
    final synthetic String zzh;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzi;

    public zzkc(com.google.android.gms.measurement.internal.zzlj p1, String p2, String p3, long p4, android.os.Bundle p6, boolean p7, boolean p8, boolean p9, String p10)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p6;
        this.zze = p7;
        this.zzf = p8;
        this.zzg = p9;
        this.zzh = p10;
        java.util.Objects.requireNonNull(p1);
        this.zzi = p1;
        return;
    }

    public final void run()
    {
        this.zzi.zzH(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
        return;
    }
}
