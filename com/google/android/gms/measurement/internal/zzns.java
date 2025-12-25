package com.google.android.gms.measurement.internal;
final synthetic class zzns implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zznt zza;
    private final synthetic int zzb;
    private final synthetic com.google.android.gms.measurement.internal.zzgu zzc;
    private final synthetic android.content.Intent zzd;

    public synthetic zzns(com.google.android.gms.measurement.internal.zznt p1, int p2, com.google.android.gms.measurement.internal.zzgu p3, android.content.Intent p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final synthetic void run()
    {
        this.zza.zzf(this.zzb, this.zzc, this.zzd);
        return;
    }
}
