package com.google.android.gms.common.providers;
final class zza implements com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory {

    public zza()
    {
        return;
    }

    public final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor()
    {
        com.google.android.gms.internal.common.zzf.zza();
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1));
    }
}
