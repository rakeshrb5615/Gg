package com.google.android.gms.common.internal;
final class zzi {
    static final java.util.concurrent.ExecutorService zza;

    static zzi()
    {
        com.google.android.gms.internal.common.zzf.zza();
        java.util.concurrent.ExecutorService v0_0 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("CallbackExecutor"));
        v0_0.allowCoreThreadTimeOut(1);
        com.google.android.gms.common.internal.zzi.zza = java.util.concurrent.Executors.unconfigurableExecutorService(v0_0);
        return;
    }
}
