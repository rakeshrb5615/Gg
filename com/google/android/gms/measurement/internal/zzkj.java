package com.google.android.gms.measurement.internal;
final class zzkj implements java.lang.Runnable {
    final synthetic android.os.Bundle zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzkj(com.google.android.gms.measurement.internal.zzlj p1, android.os.Bundle p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzlj v3 = this.zzb;
        v3.zzg();
        v3.zzb();
        com.google.android.gms.measurement.internal.zzah v4_0 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_0);
        String vtmp3 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_0.getString("name"));
        if (v3.zzu.zzB()) {
            try {
                v3.zzu.zzt().zzp(new com.google.android.gms.measurement.internal.zzah(v4_0.getString("app_id"), "", new com.google.android.gms.measurement.internal.zzpl(vtmp3, 0, 0, ""), v4_0.getLong("creation_timestamp"), v4_0.getBoolean("active"), v4_0.getString("trigger_event_name"), 0, v4_0.getLong("trigger_timeout"), 0, v4_0.getLong("time_to_live"), v3.zzu.zzk().zzac(v4_0.getString("app_id"), v4_0.getString("expired_event_name"), v4_0.getBundle("expired_event_params"), "", v4_0.getLong("creation_timestamp"), 1, 1)));
            } catch (IllegalArgumentException) {
            }
            return;
        } else {
            v3.zzu.zzaV().zzk().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
    }
}
