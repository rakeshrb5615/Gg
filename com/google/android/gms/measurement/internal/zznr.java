package com.google.android.gms.measurement.internal;
final synthetic class zznr implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zznt zza;
    private final synthetic android.app.job.JobParameters zzb;

    public synthetic zznr(com.google.android.gms.measurement.internal.zznt p1, android.app.job.JobParameters p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void run()
    {
        this.zza.zzh(this.zzb);
        return;
    }
}
