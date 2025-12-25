package com.google.android.gms.tasks;
final class zzc implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.Task zza;
    final synthetic com.google.android.gms.tasks.zzd zzb;

    public zzc(com.google.android.gms.tasks.zzd p1, com.google.android.gms.tasks.Task p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void run()
    {
        if (!this.zza.isCanceled()) {
            try {
                com.google.android.gms.tasks.zzd.zzb(this.zzb).zzb(com.google.android.gms.tasks.zzd.zza(this.zzb).then(this.zza));
                return;
            } catch (Exception v0_3) {
                if (!(v0_3.getCause() instanceof Exception)) {
                    com.google.android.gms.tasks.zzd.zzb(this.zzb).zza(v0_3);
                    return;
                } else {
                    com.google.android.gms.tasks.zzd.zzb(this.zzb).zza(((Exception) v0_3.getCause()));
                    return;
                }
            } catch (Exception v0_1) {
                com.google.android.gms.tasks.zzd.zzb(this.zzb).zza(v0_1);
                return;
            }
        } else {
            com.google.android.gms.tasks.zzd.zzb(this.zzb).zzc();
            return;
        }
    }
}
