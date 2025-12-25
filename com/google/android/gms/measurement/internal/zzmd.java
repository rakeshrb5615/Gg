package com.google.android.gms.measurement.internal;
final class zzmd implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic com.google.android.gms.measurement.internal.zzr zzb;
    final synthetic boolean zzc;
    final synthetic com.google.android.gms.measurement.internal.zznl zzd;

    public zzmd(com.google.android.gms.measurement.internal.zznl p1, java.util.concurrent.atomic.AtomicReference p2, com.google.android.gms.measurement.internal.zzr p3, boolean p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        java.util.concurrent.atomic.AtomicReference v0 = this.zza;
        try {
            Throwable v1_0 = this.zzd;
            java.util.concurrent.atomic.AtomicReference v2_5 = v1_0.zzZ();
        } catch (Throwable v1_5) {
            this.zzd.zzu.zzaV().zzb().zzb("Failed to get all user properties; remote exception", v1_5);
            Throwable v1_1 = this.zza;
            v1_1.notify();
            return;
        } catch (Throwable v1_6) {
            this.zza.notify();
            throw v1_6;
        } catch (Throwable v1_7) {
            throw v1_7;
        }
        if (v2_5 != null) {
            String v3_1 = this.zzb;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_1);
            v0.set(v2_5.zzj(v3_1, this.zzc));
            v1_0.zzV();
            v1_1 = this.zza;
            v1_1.notify();
            return;
        } else {
            v1_0.zzu.zzaV().zzb().zza("Failed to get all user properties; not connected to service");
            v0.notify();
            return;
        }
    }
}
