package com.google.android.gms.measurement.internal;
public final class zznt {
    private final android.content.Context zza;

    public zznt(android.content.Context p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zza = p1;
        return;
    }

    public static final void zzi(android.content.Intent p2)
    {
        if (p2 != null) {
            android.util.Log.v("FA", "onRebind called. action: ".concat(String.valueOf(p2.getAction())));
            return;
        } else {
            android.util.Log.e("FA", "onRebind called with null intent");
            return;
        }
    }

    public static final boolean zzj(android.content.Intent p3)
    {
        if (p3 != null) {
            android.util.Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(p3.getAction())));
            return 1;
        } else {
            android.util.Log.e("FA", "onUnbind called with null intent");
            return 1;
        }
    }

    private final void zzk(com.google.android.gms.measurement.internal.zzpg p3, Runnable p4)
    {
        p3.zzaW().zzj(new com.google.android.gms.measurement.internal.zzno(this, p3, p4));
        return;
    }

    public final void zza()
    {
        android.util.Log.v("FA", this.zza.getClass().getSimpleName().concat(" is starting up."));
        return;
    }

    public final void zzb()
    {
        android.util.Log.v("FA", this.zza.getClass().getSimpleName().concat(" is shutting down."));
        return;
    }

    public final int zzc(android.content.Intent p7, int p8, int p9)
    {
        if (p7 != null) {
            android.content.Context v0 = this.zza;
            com.google.android.gms.measurement.internal.zzns v1_6 = com.google.android.gms.measurement.internal.zzic.zzy(v0, 0, 0);
            com.google.android.gms.measurement.internal.zzgu v2 = v1_6.zzaV();
            String v3 = p7.getAction();
            v1_6.zzaU();
            v2.zzk().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(p9), v3);
            if ("com.google.android.gms.measurement.UPLOAD".equals(v3)) {
                this.zzk(com.google.android.gms.measurement.internal.zzpg.zza(v0), new com.google.android.gms.measurement.internal.zzns(this, p9, v2, p7));
            }
            return 2;
        } else {
            android.util.Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
    }

    public final android.os.IBinder zzd(android.content.Intent p4)
    {
        if (p4 != null) {
            String v4_6 = p4.getAction();
            if (!"com.google.android.gms.measurement.START".equals(v4_6)) {
                android.util.Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(v4_6)));
                return 0;
            } else {
                return new com.google.android.gms.measurement.internal.zzjd(com.google.android.gms.measurement.internal.zzpg.zza(this.zza), 0);
            }
        } else {
            android.util.Log.e("FA", "onBind called with null intent");
            return 0;
        }
    }

    public final boolean zze(android.app.job.JobParameters p7)
    {
        com.google.android.gms.internal.measurement.zzfb v0_3 = p7.getExtras().getString("action");
        android.util.Log.v("FA", "onStartJob received action: ".concat(String.valueOf(v0_3)));
        if (java.util.Objects.equals(v0_3, "com.google.android.gms.measurement.UPLOAD")) {
            com.google.android.gms.measurement.internal.zznr v1_4 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_3));
            com.google.android.gms.measurement.internal.zzpg v2_1 = com.google.android.gms.measurement.internal.zzpg.zza(this.zza);
            com.google.android.gms.measurement.internal.zzgu v3_0 = v2_1.zzaV();
            v2_1.zzaU();
            v3_0.zzk().zzb("Local AppMeasurementJobService called. action", v1_4);
            this.zzk(v2_1, new com.google.android.gms.measurement.internal.zznq(this, v3_0, p7));
        }
        if (java.util.Objects.equals(v0_3, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_3);
            com.google.android.gms.internal.measurement.zzfb.zza(this.zza, 0).zzw(new com.google.android.gms.measurement.internal.zznr(this, p7));
        }
        return 1;
    }

    public final synthetic void zzf(int p4, com.google.android.gms.measurement.internal.zzgu p5, android.content.Intent p6)
    {
        android.content.Context v0 = this.zza;
        com.google.android.gms.measurement.internal.zznp v1_1 = ((com.google.android.gms.measurement.internal.zznp) v0);
        if (v1_1.zza(p4)) {
            p5.zzk().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(p4));
            com.google.android.gms.measurement.internal.zzic.zzy(v0, 0, 0).zzaV().zzk().zza("Completed wakeful intent.");
            v1_1.zzc(p6);
        }
        return;
    }

    public final synthetic void zzg(com.google.android.gms.measurement.internal.zzgu p2, android.app.job.JobParameters p3)
    {
        p2.zzk().zza("AppMeasurementJobService processed last upload request.");
        ((com.google.android.gms.measurement.internal.zznp) this.zza).zzb(p3, 0);
        return;
    }

    public final synthetic void zzh(android.app.job.JobParameters p3)
    {
        android.util.Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((com.google.android.gms.measurement.internal.zznp) this.zza).zzb(p3, 0);
        return;
    }
}
