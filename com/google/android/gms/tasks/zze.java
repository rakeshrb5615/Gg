package com.google.android.gms.tasks;
final class zze implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.Task zza;
    final synthetic com.google.android.gms.tasks.zzf zzb;

    public zze(com.google.android.gms.tasks.zzf p1, com.google.android.gms.tasks.Task p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void run()
    {
        try {
            Exception v0_7 = ((com.google.android.gms.tasks.Task) com.google.android.gms.tasks.zzf.zza(this.zzb).then(this.zza));
        } catch (Exception v0_1) {
            if (!(v0_1.getCause() instanceof Exception)) {
                com.google.android.gms.tasks.zzf.zzb(this.zzb).zza(v0_1);
                return;
            } else {
                com.google.android.gms.tasks.zzf.zzb(this.zzb).zza(((Exception) v0_1.getCause()));
                return;
            }
        } catch (Exception v0_8) {
            com.google.android.gms.tasks.zzf.zzb(this.zzb).zza(v0_8);
            return;
        }
        if (v0_7 != null) {
            java.util.concurrent.Executor v2_0 = com.google.android.gms.tasks.TaskExecutors.zza;
            v0_7.addOnSuccessListener(v2_0, this.zzb);
            v0_7.addOnFailureListener(v2_0, this.zzb);
            v0_7.addOnCanceledListener(v2_0, this.zzb);
            return;
        } else {
            this.zzb.onFailure(new NullPointerException("Continuation returned null"));
            return;
        }
    }
}
