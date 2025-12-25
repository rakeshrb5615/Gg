package com.google.android.gms.cloudmessaging;
public final synthetic class zzf implements com.google.android.gms.tasks.OnCompleteListener {
    public final synthetic java.util.concurrent.CountDownLatch zza;

    public synthetic zzf(java.util.concurrent.CountDownLatch p1)
    {
        this.zza = p1;
        return;
    }

    public final void onComplete(com.google.android.gms.tasks.Task p1)
    {
        this.zza.countDown();
        return;
    }
}
