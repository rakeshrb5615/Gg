package com.google.android.gms.tasks;
public final synthetic class zzx implements java.lang.Runnable {
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public synthetic zzx(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final void run()
    {
        this.zza.trySetException(new java.util.concurrent.TimeoutException());
        return;
    }
}
