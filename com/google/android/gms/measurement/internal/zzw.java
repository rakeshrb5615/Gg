package com.google.android.gms.measurement.internal;
public final class zzw extends android.content.BroadcastReceiver {
    private final com.google.android.gms.measurement.internal.zzic zza;

    public zzw(com.google.android.gms.measurement.internal.zzic p1)
    {
        this.zza = p1;
        return;
    }

    public final void onReceive(android.content.Context p3, android.content.Intent p4)
    {
        if (p4 != null) {
            com.google.android.gms.measurement.internal.zzhz v3_2 = p4.getAction();
            if (v3_2 != null) {
                com.google.android.gms.measurement.internal.zzhz v4_10 = v3_2.hashCode();
                if (v4_10 == -1928239649) {
                    if (v3_2.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                        com.google.android.gms.measurement.internal.zzhz v3_1 = this.zza;
                        com.google.android.gms.internal.measurement.zzqp.zza();
                        if (v3_1.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaQ)) {
                            v3_1.zzaV().zzk().zza("App receiver notified triggers are available");
                            v3_1.zzaW().zzj(new com.google.android.gms.measurement.internal.zzu(v3_1));
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    if ((v4_10 == 1279883384) && (v3_2.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE"))) {
                        com.google.android.gms.measurement.internal.zzhz v3_4 = this.zza;
                        v3_4.zzaV().zzk().zza("[sgtm] App Receiver notified batches are available");
                        v3_4.zzaW().zzj(new com.google.android.gms.measurement.internal.zzt(this));
                        return;
                    }
                }
                v1.a.v(this.zza, "App receiver called with unknown action");
                return;
            } else {
                v1.a.v(this.zza, "App receiver called with null action");
                return;
            }
        } else {
            v1.a.v(this.zza, "App receiver called with null intent");
            return;
        }
    }

    public final synthetic void zza()
    {
        this.zza.zzx().zzh(((Long) com.google.android.gms.measurement.internal.zzfy.zzC.zzb(0)).longValue());
        return;
    }
}
