package com.google.android.gms.measurement;
public final class AppMeasurementService extends android.app.Service implements com.google.android.gms.measurement.internal.zznp {
    private com.google.android.gms.measurement.internal.zznt zza;

    public AppMeasurementService()
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

    public android.os.IBinder onBind(android.content.Intent p2)
    {
        return this.zzd().zzd(p2);
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

    public int onStartCommand(android.content.Intent p2, int p3, int p4)
    {
        this.zzd().zzc(p2, p3, p4);
        return 2;
    }

    public boolean onUnbind(android.content.Intent p1)
    {
        this.zzd();
        com.google.android.gms.measurement.internal.zznt.zzj(p1);
        return 1;
    }

    public final boolean zza(int p1)
    {
        return this.stopSelfResult(p1);
    }

    public final void zzb(android.app.job.JobParameters p1, boolean p2)
    {
        throw new UnsupportedOperationException();
    }

    public final void zzc(android.content.Intent p1)
    {
        m1.a.completeWakefulIntent(p1);
        return;
    }
}
