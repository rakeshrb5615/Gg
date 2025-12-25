package com.google.android.gms.measurement.internal;
final class zzoy extends com.google.android.gms.measurement.internal.zzay {
    final synthetic com.google.android.gms.measurement.internal.zzpg zza;

    public zzoy(com.google.android.gms.measurement.internal.zzpg p1, com.google.android.gms.measurement.internal.zzjg p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(p2);
        return;
    }

    public final void zza()
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zza;
        v0.zzaW().zzg();
        android.content.Context v1_4 = ((String) v0.zzay().pollFirst());
        if (v1_4 != null) {
            v0.zzaz(v0.zzaZ().elapsedRealtime());
            v0.zzaV().zzk().zzb("Sending trigger URI notification to app", v1_4);
            android.content.Intent v2_5 = new android.content.Intent();
            v2_5.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            v2_5.setPackage(v1_4);
            com.google.android.gms.measurement.internal.zzpg.zzaw(v0.zzaY(), v2_5);
        }
        v0.zzav();
        return;
    }
}
