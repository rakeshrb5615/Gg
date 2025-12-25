package com.google.android.gms.measurement.internal;
final class zzpa implements java.lang.Runnable {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic android.os.Bundle zzc;
    final synthetic com.google.android.gms.measurement.internal.zzpb zzd;

    public zzpa(com.google.android.gms.measurement.internal.zzpb p1, String p2, String p3, android.os.Bundle p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzpg v0_1 = this.zzd.zza;
        String v2_1 = this.zza;
        v0_1.zzD(((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1.zzt().zzac(v2_1, this.zzb, this.zzc, "auto", v0_1.zzaZ().currentTimeMillis(), 0, 1))), v2_1);
        return;
    }
}
