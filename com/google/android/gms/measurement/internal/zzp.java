package com.google.android.gms.measurement.internal;
final class zzp implements com.google.android.gms.measurement.internal.zzjp {
    public final com.google.android.gms.internal.measurement.zzda zza;
    final synthetic com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    public zzp(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService p1, com.google.android.gms.internal.measurement.zzda p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void interceptEvent(String p7, String p8, android.os.Bundle p9, long p10)
    {
        try {
            this.zza.zze(p7, p8, p9, p10);
            return;
        } catch (android.os.RemoteException v0_1) {
            com.google.android.gms.measurement.internal.zzgs v8_1 = this.zzb.zza;
            if (v8_1 != null) {
                v8_1.zzaV().zze().zzb("Event interceptor threw exception", v0_1);
            }
            return;
        }
    }
}
