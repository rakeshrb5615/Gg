package com.google.android.gms.measurement.internal;
final synthetic class zziy implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zzjd zza;
    private final synthetic com.google.android.gms.measurement.internal.zzr zzb;
    private final synthetic android.os.Bundle zzc;
    private final synthetic com.google.android.gms.measurement.internal.zzge zzd;
    private final synthetic String zze;

    public synthetic zziy(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzr p2, android.os.Bundle p3, com.google.android.gms.measurement.internal.zzge p4, String p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        return;
    }

    public final synthetic void run()
    {
        this.zza.zzH(this.zzb, this.zzc, this.zzd, this.zze);
        return;
    }
}
