package com.google.android.gms.measurement.internal;
final class zzkt implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzaz zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzkt(com.google.android.gms.measurement.internal.zzlj p1, com.google.android.gms.measurement.internal.zzaz p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zznl v0_0 = this.zzb;
        int v1_0 = v0_0.zzu;
        String v2_2 = v1_0.zzd();
        v2_2.zzg();
        com.google.android.gms.measurement.internal.zzaz v4 = this.zza;
        if (!com.google.android.gms.measurement.internal.zzjl.zzu(v4.zzb(), v2_2.zzj().zzb())) {
            v1_0.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(v4.zzb()));
            return;
        } else {
            String v2_3 = v2_2.zzd().edit();
            v2_3.putString("dma_consent_settings", v4.zze());
            v2_3.apply();
            v1_0.zzaV().zzk().zzb("Setting DMA consent(FE)", v4);
            com.google.android.gms.measurement.internal.zznl v0_3 = v0_0.zzu;
            if (!v0_3.zzt().zzP()) {
                v0_3.zzt().zzj(0);
                return;
            } else {
                v0_3.zzt().zzl();
                return;
            }
        }
    }
}
