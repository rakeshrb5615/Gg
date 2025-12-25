package com.google.android.gms.measurement.internal;
final class zzoz implements java.util.concurrent.Callable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.measurement.internal.zzpg zzb;

    public zzoz(com.google.android.gms.measurement.internal.zzpg p1, com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final bridge synthetic Object call()
    {
        String v0_0 = this.zza;
        com.google.android.gms.measurement.internal.zzpg v2 = this.zzb;
        com.google.android.gms.measurement.internal.zzjk v3 = com.google.android.gms.measurement.internal.zzjk.zzb;
        if ((v2.zzB(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_0.zza))).zzo(v3)) && (com.google.android.gms.measurement.internal.zzjl.zzf(v0_0.zzs, 100).zzo(v3))) {
            return v2.zzao(v0_0).zzd();
        } else {
            v2.zzaV().zzk().zza("Analytics storage consent denied. Returning null app instance id");
            return 0;
        }
    }
}
