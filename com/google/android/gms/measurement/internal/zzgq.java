package com.google.android.gms.measurement.internal;
public final class zzgq {
    private static com.google.android.gms.measurement.internal.zzgq zza;
    private final com.google.android.gms.measurement.internal.zzic zzb;
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zzc;
    private final java.util.concurrent.atomic.AtomicLong zzd;

    private zzgq(android.content.Context p4, com.google.android.gms.measurement.internal.zzic p5)
    {
        this.zzd = new java.util.concurrent.atomic.AtomicLong(-1);
        this.zzc = com.google.android.gms.common.internal.TelemetryLogging.getClient(p4, com.google.android.gms.common.internal.TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzb = p5;
        return;
    }

    public static com.google.android.gms.measurement.internal.zzgq zza(com.google.android.gms.measurement.internal.zzic p2)
    {
        if (com.google.android.gms.measurement.internal.zzgq.zza == null) {
            com.google.android.gms.measurement.internal.zzgq.zza = new com.google.android.gms.measurement.internal.zzgq(p2.zzaY(), p2);
        }
        return com.google.android.gms.measurement.internal.zzgq.zza;
    }

    public final declared_synchronized void zzb(int p18, int p19, long p20, long p22, int p24)
    {
        long v2 = this.zzb.zzaZ().elapsedRealtime();
        com.google.android.gms.tasks.Task v0_6 = this.zzd;
        if (v0_6.get() != -1) {
            if ((v2 - v0_6.get()) <= 1800000) {
                return;
            }
        } else {
        }
        this.zzc.log(new com.google.android.gms.common.internal.TelemetryData(0, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation[] {new com.google.android.gms.common.internal.MethodInvocation(36301, p19, 0, p20, p22, 0, 0, 0, p24)})))).addOnFailureListener(new com.google.android.gms.measurement.internal.zzgp(this, v2));
        return;
    }

    public final synthetic void zzc(long p1, Exception p3)
    {
        this.zzd.set(p1);
        return;
    }
}
