package com.google.android.gms.measurement.internal;
final class zznz extends com.google.android.gms.measurement.internal.zzay {
    final synthetic com.google.android.gms.measurement.internal.zzoa zza;

    public zznz(com.google.android.gms.measurement.internal.zzoa p1, com.google.android.gms.measurement.internal.zzjg p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(p2);
        return;
    }

    public final void zza()
    {
        com.google.android.gms.measurement.internal.zzd v0_0 = this.zza;
        long v1_0 = v0_0.zzc;
        v1_0.zzg();
        com.google.android.gms.measurement.internal.zzic v2 = v1_0.zzu;
        v0_0.zzd(0, 0, v2.zzaZ().elapsedRealtime());
        v1_0.zzu.zzw().zzc(v2.zzaZ().elapsedRealtime());
        return;
    }
}
