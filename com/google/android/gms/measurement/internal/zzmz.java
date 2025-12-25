package com.google.android.gms.measurement.internal;
final class zzmz implements java.lang.Runnable {
    final synthetic android.content.ComponentName zza;
    final synthetic com.google.android.gms.measurement.internal.zznf zzb;

    public zzmz(com.google.android.gms.measurement.internal.zznf p1, android.content.ComponentName p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        this.zzb.zza.zzW(this.zza);
        return;
    }
}
