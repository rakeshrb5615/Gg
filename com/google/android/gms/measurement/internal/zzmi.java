package com.google.android.gms.measurement.internal;
final class zzmi implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic com.google.android.gms.measurement.internal.zzr zzb;
    final synthetic com.google.android.gms.measurement.internal.zznl zzc;

    public zzmi(com.google.android.gms.measurement.internal.zznl p1, java.util.concurrent.atomic.AtomicReference p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        java.util.concurrent.atomic.AtomicReference v0 = this.zza;
        try {
            java.util.concurrent.atomic.AtomicReference v1_0 = this.zzc;
            com.google.android.gms.measurement.internal.zzhg v2_0 = v1_0.zzu;
        } catch (java.util.concurrent.atomic.AtomicReference v1_8) {
            this.zzc.zzu.zzaV().zzb().zzb("Failed to get app instance id", v1_8);
            java.util.concurrent.atomic.AtomicReference v1_1 = this.zza;
            v1_1.notify();
            return;
        } catch (java.util.concurrent.atomic.AtomicReference v1_9) {
            this.zza.notify();
            throw v1_9;
        } catch (java.util.concurrent.atomic.AtomicReference v1_10) {
            throw v1_10;
        }
        if (v2_0.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
            String v3_0 = v1_0.zzZ();
            if (v3_0 != null) {
                com.google.android.gms.measurement.internal.zzlj v4_0 = this.zzb;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_0);
                v0.set(v3_0.zzm(v4_0));
                String v3_3 = ((String) v0.get());
                if (v3_3 != null) {
                    v1_0.zzu.zzj().zzR(v3_3);
                    v2_0.zzd().zze.zzb(v3_3);
                }
                v1_0.zzV();
                v1_1 = this.zza;
                v1_1.notify();
                return;
            } else {
                v2_0.zzaV().zzb().zza("Failed to get app instance id");
            }
        } else {
            v2_0.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
            v1_0.zzu.zzj().zzR(0);
            v2_0.zzd().zze.zzb(0);
            v0.set(0);
        }
        v0.notify();
        return;
    }
}
