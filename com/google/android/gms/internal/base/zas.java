package com.google.android.gms.internal.base;
final class zas implements com.google.android.gms.internal.base.zaq {

    private zas()
    {
        return;
    }

    public synthetic zas(com.google.android.gms.internal.base.zar p1)
    {
        return;
    }

    public final java.util.concurrent.ExecutorService zaa(java.util.concurrent.ThreadFactory p1, int p2)
    {
        return this.zac(1, p1, 1);
    }

    public final java.util.concurrent.ExecutorService zab(int p2, int p3)
    {
        return this.zac(4, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }

    public final java.util.concurrent.ExecutorService zac(int p9, java.util.concurrent.ThreadFactory p10, int p11)
    {
        java.util.concurrent.ThreadPoolExecutor v0_1 = new java.util.concurrent.ThreadPoolExecutor(p9, p9, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), p10);
        v0_1.allowCoreThreadTimeOut(1);
        return java.util.concurrent.Executors.unconfigurableExecutorService(v0_1);
    }
}
