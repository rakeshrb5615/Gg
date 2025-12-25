package com.google.android.gms.measurement.internal;
final synthetic class zzni implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zznl zza;
    private final synthetic java.util.concurrent.atomic.AtomicReference zzb;
    private final synthetic com.google.android.gms.measurement.internal.zzr zzc;
    private final synthetic com.google.android.gms.measurement.internal.zzoo zzd;

    public synthetic zzni(com.google.android.gms.measurement.internal.zznl p1, java.util.concurrent.atomic.AtomicReference p2, com.google.android.gms.measurement.internal.zzr p3, com.google.android.gms.measurement.internal.zzoo p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final synthetic void run()
    {
        this.zza.zzT(this.zzb, this.zzc, this.zzd);
        return;
    }
}
