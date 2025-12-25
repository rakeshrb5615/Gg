package com.google.android.gms.measurement.internal;
abstract class zzay {
    private static volatile android.os.Handler zzb;
    private final com.google.android.gms.measurement.internal.zzjg zza;
    private final Runnable zzc;
    private volatile long zzd;

    public zzay(com.google.android.gms.measurement.internal.zzjg p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zza = p2;
        this.zzc = new com.google.android.gms.measurement.internal.zzax(this, p2);
        return;
    }

    private final android.os.Handler zzf()
    {
        if (com.google.android.gms.measurement.internal.zzay.zzb == null) {
            if (com.google.android.gms.measurement.internal.zzay.zzb == null) {
                com.google.android.gms.measurement.internal.zzay.zzb = new com.google.android.gms.internal.measurement.zzcn(this.zza.zzaY().getMainLooper());
            }
            return com.google.android.gms.measurement.internal.zzay.zzb;
        } else {
            return com.google.android.gms.measurement.internal.zzay.zzb;
        }
    }

    public abstract void zza();

    public final void zzb(long p4)
    {
        this.zzd();
        if (p4 >= 0) {
            com.google.android.gms.measurement.internal.zzgs v0_4 = this.zza;
            this.zzd = v0_4.zzaZ().currentTimeMillis();
            if (!this.zzf().postDelayed(this.zzc, p4)) {
                v0_4.zzaV().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(p4));
            }
        }
        return;
    }

    public final boolean zzc()
    {
        if (this.zzd == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzd()
    {
        this.zzd = 0;
        this.zzf().removeCallbacks(this.zzc);
        return;
    }

    public final synthetic void zze(long p1)
    {
        this.zzd = 0;
        return;
    }
}
