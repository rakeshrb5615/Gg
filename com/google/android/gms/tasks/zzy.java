package com.google.android.gms.tasks;
public final synthetic class zzy implements com.google.android.gms.tasks.OnCompleteListener {
    public final synthetic com.google.android.gms.internal.tasks.zza zza;
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource zzb;
    public final synthetic com.google.android.gms.tasks.zzb zzc;

    public synthetic zzy(com.google.android.gms.internal.tasks.zza p1, com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.tasks.zzb p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void onComplete(com.google.android.gms.tasks.Task p3)
    {
        this.zza.removeCallbacksAndMessages(0);
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = this.zzb;
        if (!p3.isSuccessful()) {
            if (!p3.isCanceled()) {
                Exception v3_1 = p3.getException();
                v3_1.getClass();
                v0_1.trySetException(v3_1);
                return;
            } else {
                this.zzc.zza();
                return;
            }
        } else {
            v0_1.trySetResult(p3.getResult());
            return;
        }
    }
}
