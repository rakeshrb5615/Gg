package com.google.android.gms.measurement.internal;
final class zzog {
    private final com.google.android.gms.common.util.Clock zza;
    private long zzb;

    public zzog(com.google.android.gms.common.util.Clock p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zza = p1;
        return;
    }

    public final void zza()
    {
        this.zzb = this.zza.elapsedRealtime();
        return;
    }

    public final void zzb()
    {
        this.zzb = 0;
        return;
    }

    public final boolean zzc(long p5)
    {
        if (this.zzb != 0) {
            if ((this.zza.elapsedRealtime() - this.zzb) < 3600000) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
