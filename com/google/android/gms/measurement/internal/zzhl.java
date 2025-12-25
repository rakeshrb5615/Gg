package com.google.android.gms.measurement.internal;
public final class zzhl {
    private final com.google.android.gms.measurement.internal.zzhl$zza zza;

    public zzhl(com.google.android.gms.measurement.internal.zzhl$zza p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zza = p1;
        return;
    }

    public final void zza(android.content.Context p4, android.content.Intent p5)
    {
        com.google.android.gms.measurement.internal.zzhl$zza v0_3 = com.google.android.gms.measurement.internal.zzic.zzy(p4, 0, 0);
        String v1_1 = v0_3.zzaV();
        if (p5 != null) {
            v0_3.zzaU();
            String v5_6 = p5.getAction();
            v1_1.zzk().zzb("Local receiver got", v5_6);
            if (!"com.google.android.gms.measurement.UPLOAD".equals(v5_6)) {
                if ("com.android.vending.INSTALL_REFERRER".equals(v5_6)) {
                    v1_1.zze().zza("Install Referrer Broadcasts are deprecated");
                }
                return;
            } else {
                String v5_4 = new android.content.Intent().setClassName(p4, "com.google.android.gms.measurement.AppMeasurementService");
                v5_4.setAction("com.google.android.gms.measurement.UPLOAD");
                v1_1.zzk().zza("Starting wakeful intent.");
                this.zza.doStartService(p4, v5_4);
                return;
            }
        } else {
            v1_1.zze().zza("Receiver called with null intent");
            return;
        }
    }
}
