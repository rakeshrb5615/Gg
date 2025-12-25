package com.google.android.gms.measurement.internal;
final synthetic class zznq implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zznt zza;
    private final synthetic com.google.android.gms.measurement.internal.zzgu zzb;
    private final synthetic android.app.job.JobParameters zzc;

    public synthetic zznq(com.google.android.gms.measurement.internal.zznt p1, com.google.android.gms.measurement.internal.zzgu p2, android.app.job.JobParameters p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final synthetic void run()
    {
        this.zza.zzg(this.zzb, this.zzc);
        return;
    }
}
