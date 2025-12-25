package com.google.android.gms.measurement.internal;
final class zzkh implements java.lang.Runnable {
    final synthetic long zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzkh(com.google.android.gms.measurement.internal.zzlj p1, long p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zznl v0_0 = this.zzb;
        v0_0.zzg();
        v0_0.zzb();
        java.util.concurrent.atomic.AtomicReference v1_1 = v0_0.zzu;
        v1_1.zzaV().zzj().zza("Resetting analytics data (FE)");
        com.google.android.gms.measurement.internal.zzic v2_0 = v0_0.zzu;
        int v3_0 = v2_0.zzh();
        v3_0.zzg();
        v3_0.zzb.zzc();
        v2_0.zzv().zzi();
        int v3_5 = (v0_0.zzu.zzB() ^ 1);
        java.util.concurrent.atomic.AtomicReference v1_0 = v1_1.zzd();
        v1_0.zzc.zzb(this.zza);
        com.google.android.gms.measurement.internal.zzhe v4_1 = v1_0.zzu;
        if (!android.text.TextUtils.isEmpty(v4_1.zzd().zzq.zza())) {
            v1_0.zzq.zzb(0);
        }
        v1_0.zzk.zzb(0);
        v1_0.zzl.zzb(0);
        if (!v4_1.zzc().zzt()) {
            v1_0.zzn(v3_5);
        }
        v1_0.zzr.zzb(0);
        v1_0.zzs.zzb(0);
        v1_0.zzt.zzb(0);
        v2_0.zzt().zzB();
        v2_0.zzh().zza.zza();
        v0_0.zzc = v3_5;
        v2_0.zzt().zzC(new java.util.concurrent.atomic.AtomicReference());
        return;
    }
}
