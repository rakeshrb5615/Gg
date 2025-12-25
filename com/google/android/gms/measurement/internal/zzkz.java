package com.google.android.gms.measurement.internal;
final synthetic class zzkz implements com.google.android.gms.measurement.internal.zzll {
    private final synthetic com.google.android.gms.measurement.internal.zzlj zza;
    private final synthetic java.util.concurrent.atomic.AtomicReference zzb;
    private final synthetic com.google.android.gms.measurement.internal.zzom zzc;

    public synthetic zzkz(com.google.android.gms.measurement.internal.zzlj p1, java.util.concurrent.atomic.AtomicReference p2, com.google.android.gms.measurement.internal.zzom p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final synthetic void zza(String p7, int p8, Throwable p9, byte[] p10, java.util.Map p11)
    {
        com.google.android.gms.measurement.internal.zzlr v8_3;
        Throwable v7_0 = this.zza;
        v7_0.zzg();
        Long v10_0 = this.zzc;
        if ((p8 == 200) || (p8 == 204)) {
            if (p9 != null) {
                v7_0.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(v10_0.zza), Integer.valueOf(p8), p9);
                if (!java.util.Arrays.asList(((String) com.google.android.gms.measurement.internal.zzfy.zzt.zzb(0)).split(",")).contains(String.valueOf(p8))) {
                    v8_3 = com.google.android.gms.measurement.internal.zzlr.zzc;
                } else {
                    v8_3 = com.google.android.gms.measurement.internal.zzlr.zzd;
                }
            } else {
                v7_0.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(v10_0.zza));
                v8_3 = com.google.android.gms.measurement.internal.zzlr.zzb;
            }
        } else {
            if (p8 != 304) {
            } else {
                p8 = 304;
            }
        }
        java.util.concurrent.atomic.AtomicReference v9_7 = this.zzb;
        long v1_1 = v10_0.zza;
        v7_0.zzu.zzt().zzy(new com.google.android.gms.measurement.internal.zzaf(v1_1, v8_3.zza(), v10_0.zzf));
        v7_0.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(v1_1), v8_3);
        try {
            v9_7.set(v8_3);
            v9_7.notifyAll();
            return;
        } catch (Throwable v0_5) {
            throw v0_5;
        }
    }
}
