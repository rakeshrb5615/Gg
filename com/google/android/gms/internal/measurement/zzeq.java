package com.google.android.gms.internal.measurement;
abstract class zzeq implements java.lang.Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzk;

    public zzeq(com.google.android.gms.internal.measurement.zzfb p3, boolean p4)
    {
        java.util.Objects.requireNonNull(p3);
        this.zzk = p3;
        this.zzh = p3.zza.currentTimeMillis();
        this.zzi = p3.zza.elapsedRealtime();
        this.zzj = p4;
        return;
    }

    public final void run()
    {
        if (!this.zzk.zzP()) {
            try {
                this.zza();
                return;
            } catch (Exception v0_2) {
                this.zzk.zzN(v0_2, 0, this.zzj);
                this.zzb();
                return;
            }
        } else {
            this.zzb();
            return;
        }
    }

    public abstract void zza();

    public void zzb()
    {
        return;
    }
}
