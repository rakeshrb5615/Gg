package com.google.android.gms.measurement.internal;
final class zzia implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzjs zza;
    final synthetic com.google.android.gms.measurement.internal.zzic zzb;

    public zzia(com.google.android.gms.measurement.internal.zzic p1, com.google.android.gms.measurement.internal.zzjs p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzic v0 = this.zzb;
        com.google.android.gms.internal.measurement.zzdd v1_0 = this.zza;
        v0.zzK(v1_0);
        v0.zza(v1_0.zzd);
        return;
    }
}
