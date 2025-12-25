package com.google.android.gms.measurement.internal;
public final class zzok extends com.google.android.gms.measurement.internal.zzos {
    private final android.app.AlarmManager zza;
    private com.google.android.gms.measurement.internal.zzay zzb;
    private Integer zzc;

    public zzok(com.google.android.gms.measurement.internal.zzpg p2)
    {
        super(p2);
        super.zza = ((android.app.AlarmManager) super.zzu.zzaY().getSystemService("alarm"));
        return;
    }

    private final com.google.android.gms.measurement.internal.zzay zzf()
    {
        if (this.zzb == null) {
            this.zzb = new com.google.android.gms.measurement.internal.zzoj(this, this.zzg.zzag());
        }
        return this.zzb;
    }

    private final void zzh()
    {
        android.app.job.JobScheduler v0_3 = ((android.app.job.JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler"));
        if (v0_3 != null) {
            v0_3.cancel(this.zzi());
        }
        return;
    }

    private final int zzi()
    {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final android.app.PendingIntent zzj()
    {
        android.app.PendingIntent v0_2 = this.zzu.zzaY();
        return android.app.PendingIntent.getBroadcast(v0_2, 0, new android.content.Intent().setClassName(v0_2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcg.zza);
    }

    public final boolean zzbb()
    {
        int v0_0 = this.zza;
        if (v0_0 != 0) {
            v0_0.cancel(this.zzj());
        }
        this.zzh();
        return 0;
    }

    public final void zzc(long p7)
    {
        this.zzaw();
        android.content.Context v0_0 = this.zzu;
        v0_0.zzaU();
        com.google.android.gms.measurement.internal.zzay v1_7 = v0_0.zzaY();
        if (!com.google.android.gms.measurement.internal.zzpp.zzau(v1_7)) {
            v0_0.zzaV().zzj().zza("Receiver not registered/enabled");
        }
        if (!com.google.android.gms.measurement.internal.zzpp.zzQ(v1_7, 0)) {
            v0_0.zzaV().zzj().zza("Service not registered/enabled");
        }
        this.zzd();
        v0_0.zzaV().zzk().zzb("Scheduling upload, millis", Long.valueOf(p7));
        v0_0.zzaZ().elapsedRealtime();
        v0_0.zzc();
        if ((p7 < Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzL.zzb(0)).longValue())) && (!this.zzf().zzc())) {
            this.zzf().zzb(p7);
        }
        v0_0.zzaU();
        android.content.Context v0_1 = v0_0.zzaY();
        com.google.android.gms.measurement.internal.zzay v1_17 = new android.content.ComponentName(v0_1, "com.google.android.gms.measurement.AppMeasurementJobService");
        int v2_7 = this.zzi();
        android.os.PersistableBundle v3_4 = new android.os.PersistableBundle();
        v3_4.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzch.zza(v0_1, new android.app.job.JobInfo$Builder(v2_7, v1_17).setMinimumLatency(p7).setOverrideDeadline((p7 + p7)).setExtras(v3_4).build(), "com.google.android.gms", "UploadAlarm");
        return;
    }

    public final void zzd()
    {
        this.zzaw();
        this.zzu.zzaV().zzk().zza("Unscheduling upload");
        com.google.android.gms.measurement.internal.zzay v0_4 = this.zza;
        if (v0_4 != null) {
            v0_4.cancel(this.zzj());
        }
        this.zzf().zzd();
        this.zzh();
        return;
    }
}
