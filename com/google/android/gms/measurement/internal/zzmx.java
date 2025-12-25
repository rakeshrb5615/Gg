package com.google.android.gms.measurement.internal;
final class zzmx implements java.lang.Runnable {
    final synthetic java.util.concurrent.atomic.AtomicReference zza;
    final synthetic String zzb;
    final synthetic String zzc;
    final synthetic com.google.android.gms.measurement.internal.zzr zzd;
    final synthetic boolean zze;
    final synthetic com.google.android.gms.measurement.internal.zznl zzf;

    public zzmx(com.google.android.gms.measurement.internal.zznl p1, java.util.concurrent.atomic.AtomicReference p2, String p3, String p4, String p5, com.google.android.gms.measurement.internal.zzr p6, boolean p7)
    {
        this.zza = p2;
        this.zzb = p4;
        this.zzc = p5;
        this.zzd = p6;
        this.zze = p7;
        java.util.Objects.requireNonNull(p1);
        this.zzf = p1;
        return;
    }

    public final void run()
    {
        java.util.concurrent.atomic.AtomicReference v0 = this.zza;
        try {
            java.util.concurrent.atomic.AtomicReference v2_0 = this.zzf;
            java.util.List v3_5 = v2_0.zzZ();
        } catch (java.util.concurrent.atomic.AtomicReference v2_5) {
            this.zzf.zzu.zzaV().zzb().zzd("(legacy) Failed to get user properties; remote exception", 0, this.zzb, v2_5);
            this.zza.set(java.util.Collections.EMPTY_LIST);
            java.util.concurrent.atomic.AtomicReference v1_1 = this.zza;
            v1_1.notify();
            return;
        } catch (java.util.concurrent.atomic.AtomicReference v1_3) {
            this.zza.notify();
            throw v1_3;
        } catch (java.util.concurrent.atomic.AtomicReference v1_4) {
            throw v1_4;
        }
        if (v3_5 != null) {
            if (!android.text.TextUtils.isEmpty(0)) {
                v0.set(v3_5.zzq(0, this.zzb, this.zzc, this.zze));
            } else {
                String v4_0 = this.zzd;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_0);
                v0.set(v3_5.zzp(this.zzb, this.zzc, this.zze, v4_0));
            }
            v2_0.zzV();
            v1_1 = this.zza;
            v1_1.notify();
            return;
        } else {
            v2_0.zzu.zzaV().zzb().zzd("(legacy) Failed to get user properties; not connected to service", 0, this.zzb, this.zzc);
            v0.set(java.util.Collections.EMPTY_LIST);
            v0.notify();
            return;
        }
    }
}
