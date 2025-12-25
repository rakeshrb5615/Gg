package com.google.android.gms.measurement.internal;
final synthetic class zzla implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zzlj zza;
    private final synthetic java.util.concurrent.atomic.AtomicReference zzb;

    public synthetic zzla(com.google.android.gms.measurement.internal.zzlj p1, java.util.concurrent.atomic.AtomicReference p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void run()
    {
        com.google.android.gms.measurement.internal.zznl v0_0 = this.zza;
        v0_0.zzu.zzt().zzw(this.zzb, v0_0.zzu.zzd().zzi.zza());
        return;
    }
}
