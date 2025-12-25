package com.google.android.gms.tasks;
final class zzo implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.Task zza;
    final synthetic com.google.android.gms.tasks.zzp zzb;

    public zzo(com.google.android.gms.tasks.zzp p1, com.google.android.gms.tasks.Task p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void run()
    {
        try {
            Exception v0_7 = com.google.android.gms.tasks.zzp.zza(this.zzb).then(this.zza.getResult());
        } catch (Exception v0_2) {
            if (!(v0_2.getCause() instanceof Exception)) {
                this.zzb.onFailure(v0_2);
                return;
            } else {
                this.zzb.onFailure(((Exception) v0_2.getCause()));
                return;
            }
        } catch (com.google.android.gms.tasks.RuntimeExecutionException) {
            this.zzb.onCanceled();
            return;
        } catch (Exception v0_8) {
            this.zzb.onFailure(v0_8);
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
