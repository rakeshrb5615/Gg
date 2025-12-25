package com.google.android.gms.measurement.internal;
final class zzpe {
    private final com.google.android.gms.measurement.internal.zzpg zza;
    private int zzb;
    private long zzc;

    public zzpe(com.google.android.gms.measurement.internal.zzpg p3)
    {
        this.zza = p3;
        this.zzb = 1;
        this.zzc = this.zzd();
        return;
    }

    private final long zzd()
    {
        long v0_0 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_0);
        long v3 = ((Long) com.google.android.gms.measurement.internal.zzfy.zzu.zzb(0)).longValue();
        long v1_2 = ((Long) com.google.android.gms.measurement.internal.zzfy.zzv.zzb(0)).longValue();
        int v5_0 = 1;
        while (v5_0 < this.zzb) {
            v3 += v3;
            if (v3 >= v1_2) {
                break;
            }
            v5_0++;
        }
        return (Math.min(v3, v1_2) + v0_0.zzaZ().currentTimeMillis());
    }

    public final void zza()
    {
        this.zzb = (this.zzb + 1);
        this.zzc = this.zzd();
        return;
    }

    public final boolean zzb()
    {
        if (this.zza.zzaZ().currentTimeMillis() < this.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final synthetic long zzc()
    {
        return this.zzc;
    }
}
