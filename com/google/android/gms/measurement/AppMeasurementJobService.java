package com.google.android.gms.measurement;
public final class AppMeasurementJobService extends android.app.job.JobService implements com.google.android.gms.measurement.internal.zznp {
    private com.google.android.gms.measurement.internal.zznt zza;

    public AppMeasurementJobService()
    {
        return;
    }

    private final com.google.android.gms.measurement.internal.zznt zzd()
    {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zznt(this);
        }
        return this.zza;
    }

    public void onCreate()
    {
        super.onCreate();
        this.zzd().zza();
        return;
    }

    public void onDestroy()
    {
        this.zzd().zzb();
        super.onDestroy();
        return;
    }

    public void onRebind(android.content.Intent p1)
    {
        this.zzd();
        com.google.android.gms.measurement.internal.zznt.zzi(p1);
        return;
    }

    public boolean onStartJob(android.app.job.JobParameters p2)
    {
        this.zzd().zze(p2);
        return 1;
    }

    public boolean onStopJob(android.app.job.JobParameters p1)
    {
        return 0;
    }

    public boolean onUnbind(android.content.Intent p1)
    {
        this.zzd();
        com.google.android.gms.measurement.internal.zznt.zzj(p1);
        return 1;
    }

    public final boolean zza(int p1)
    {
        throw new UnsupportedOperationException();
    }

    public final void zzb(android.app.job.JobParameters p1, boolean p2)
    {
        this.jobFinished(p1, 0);
        return;
    }

    public final void zzc(android.content.Intent p1)
    {
        return;
    }
}
