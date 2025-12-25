package com.google.android.gms.cloudmessaging;
public final synthetic class zzac implements java.lang.Runnable {
    public final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public synthetic zzac(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final void run()
    {
        if (this.zza.trySetException(new java.io.IOException("TIMEOUT"))) {
            android.util.Log.w("Rpc", "No response");
        }
        return;
    }
}
