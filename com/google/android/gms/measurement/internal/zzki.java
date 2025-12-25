package com.google.android.gms.measurement.internal;
final class zzki implements java.lang.Runnable {
    final synthetic android.os.Bundle zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzki(com.google.android.gms.measurement.internal.zzlj p1, android.os.Bundle p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        String v2_1 = this.zzb;
        v2_1.zzg();
        v2_1.zzb();
        android.os.Bundle v3 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v3);
        com.google.android.gms.measurement.internal.zzbg v6_5 = v3.getString("name");
        long v11_0 = v3.getString("origin");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_5);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v11_0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v3.get("value"));
        if (v2_1.zzu.zzB()) {
            try {
                String v4_2 = v2_1.zzu;
                v2_1.zzu.zzt().zzp(new com.google.android.gms.measurement.internal.zzah(v3.getString("app_id"), v11_0, new com.google.android.gms.measurement.internal.zzpl(v6_5, v3.getLong("triggered_timestamp"), v3.get("value"), v11_0), v3.getLong("creation_timestamp"), 0, v3.getString("trigger_event_name"), v4_2.zzk().zzac(v3.getString("app_id"), v3.getString("timed_out_event_name"), v3.getBundle("timed_out_event_params"), v11_0, 0, 1, 1), v3.getLong("trigger_timeout"), v4_2.zzk().zzac(v3.getString("app_id"), v3.getString("triggered_event_name"), v3.getBundle("triggered_event_params"), v11_0, 0, 1, 1), v3.getLong("time_to_live"), v4_2.zzk().zzac(v3.getString("app_id"), v3.getString("expired_event_name"), v3.getBundle("expired_event_params"), v11_0, 0, 1, 1)));
            } catch (IllegalArgumentException) {
            }
            return;
        } else {
            v2_1.zzu.zzaV().zzk().zza("Conditional property not set since app measurement is disabled");
            return;
        }
    }
}
