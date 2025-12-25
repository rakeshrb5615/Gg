package com.google.android.gms.tasks;
final class zzad implements com.google.android.gms.tasks.zzae {
    private final java.util.concurrent.CountDownLatch zza;

    private zzad()
    {
        this.zza = new java.util.concurrent.CountDownLatch(1);
        return;
    }

    public synthetic zzad(com.google.android.gms.tasks.zzac p2)
    {
        this.zza = new java.util.concurrent.CountDownLatch(1);
        return;
    }

    public final void onCanceled()
    {
        this.zza.countDown();
        return;
    }

    public final void onFailure(Exception p1)
    {
        this.zza.countDown();
        return;
    }

    public final void onSuccess(Object p1)
    {
        this.zza.countDown();
        return;
    }

    public final void zza()
    {
        this.zza.await();
        return;
    }

    public final boolean zzb(long p2, java.util.concurrent.TimeUnit p4)
    {
        return this.zza.await(p2, p4);
    }
}
