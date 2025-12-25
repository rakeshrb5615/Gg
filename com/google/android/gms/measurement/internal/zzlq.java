package com.google.android.gms.measurement.internal;
public final class zzlq extends com.google.android.gms.measurement.internal.zzg {
    private android.app.job.JobScheduler zza;

    public zzlq(com.google.android.gms.measurement.internal.zzic p1)
    {
        super(p1);
        return;
    }

    public final boolean zze()
    {
        return 1;
    }

    public final void zzf()
    {
        this.zza = ((android.app.job.JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler"));
        return;
    }

    public final void zzh(long p8)
    {
        this.zzb();
        this.zzg();
        String v0_1 = this.zza;
        if ((v0_1 != null) && (v0_1.getPendingJob(this.zzi()) != null)) {
            this.zzu.zzaV().zzk().zza("[sgtm] There\'s an existing pending job, skip this schedule.");
            return;
        } else {
            String v0_0 = this.zzj();
            if (v0_0 != com.google.android.gms.internal.measurement.zzin.zzb) {
                this.zzu.zzaV().zzk().zzb("[sgtm] Not eligible for Scion upload", v0_0.name());
                return;
            } else {
                String v8_11;
                String v0_3 = this.zzu;
                v0_3.zzaV().zzk().zzb("[sgtm] Scheduling Scion upload, millis", Long.valueOf(p8));
                android.os.PersistableBundle v1_4 = new android.os.PersistableBundle();
                v1_4.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
                String v8_10 = ((android.app.job.JobScheduler) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza)).schedule(new android.app.job.JobInfo$Builder(this.zzi(), new android.content.ComponentName(v0_3.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(p8).setOverrideDeadline((p8 + p8)).setExtras(v1_4).build());
                String v9_6 = v0_3.zzaV().zzk();
                if (v8_10 != 1) {
                    v8_11 = "FAILURE";
                } else {
                    v8_11 = "SUCCESS";
                }
                v9_6.zzb("[sgtm] Scion upload job scheduled with result", v8_11);
                return;
            }
        }
    }

    public final int zzi()
    {
        return "measurement-client".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode();
    }

    public final com.google.android.gms.internal.measurement.zzin zzj()
    {
        this.zzb();
        this.zzg();
        if (this.zza == null) {
            return com.google.android.gms.internal.measurement.zzin.zzg;
        } else {
            com.google.android.gms.internal.measurement.zzin v0_11 = this.zzu;
            if (!v0_11.zzc().zzx()) {
                return com.google.android.gms.internal.measurement.zzin.zzh;
            } else {
                com.google.android.gms.measurement.internal.zzic v1_1 = this.zzu;
                if (v1_1.zzv().zzn() < 119000) {
                    return com.google.android.gms.internal.measurement.zzin.zzf;
                } else {
                    if (com.google.android.gms.measurement.internal.zzpp.zzR(v0_11.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
                        if (v1_1.zzt().zzK()) {
                            return com.google.android.gms.internal.measurement.zzin.zzb;
                        } else {
                            return com.google.android.gms.internal.measurement.zzin.zze;
                        }
                    } else {
                        return com.google.android.gms.internal.measurement.zzin.zzc;
                    }
                }
            }
        }
    }
}
