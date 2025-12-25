package com.google.android.gms.measurement.internal;
final class zzha implements java.lang.Runnable {
    final synthetic boolean zza;
    final synthetic com.google.android.gms.measurement.internal.zzhb zzb;

    public zzha(com.google.android.gms.measurement.internal.zzhb p1, boolean p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zzc().zzas(this.zza);
        return;
    }
}
