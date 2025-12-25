package com.google.android.gms.measurement.internal;
final synthetic class zzlm implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zzln zza;
    private final synthetic int zzb;
    private final synthetic Exception zzc;
    private final synthetic byte[] zzd;
    private final synthetic java.util.Map zze;

    public synthetic zzlm(com.google.android.gms.measurement.internal.zzln p1, int p2, Exception p3, byte[] p4, java.util.Map p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        return;
    }

    public final synthetic void run()
    {
        this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
        return;
    }
}
