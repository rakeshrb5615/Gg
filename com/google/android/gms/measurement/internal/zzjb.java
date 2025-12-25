package com.google.android.gms.measurement.internal;
final synthetic class zzjb implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zzjd zza;
    private final synthetic android.os.Bundle zzb;
    private final synthetic String zzc;
    private final synthetic com.google.android.gms.measurement.internal.zzr zzd;

    public synthetic zzjb(com.google.android.gms.measurement.internal.zzjd p1, android.os.Bundle p2, String p3, com.google.android.gms.measurement.internal.zzr p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final synthetic void run()
    {
        this.zza.zzK(this.zzb, this.zzc, this.zzd);
        return;
    }
}
