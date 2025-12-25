package g5;
public abstract class z {
    public static final java.util.concurrent.ExecutorService a;

    static z()
    {
        java.util.concurrent.ExecutorService v0_1 = java.util.concurrent.Executors.unconfigurableExecutorService(new java.util.concurrent.ThreadPoolExecutor(1, 1, 0, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), new androidx.loader.content.f(new java.util.concurrent.atomic.AtomicLong(1)), new java.util.concurrent.ThreadPoolExecutor$DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new g5.w(v0_1), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        g5.z.a = v0_1;
        return;
    }

    public static void a(com.google.android.gms.tasks.Task p4)
    {
        IllegalStateException v0_1 = new java.util.concurrent.CountDownLatch(1);
        p4.continueWith(g5.z.a, new a5.a(v0_1, 5));
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            v0_1.await(4000, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            v0_1.await(3000, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (!p4.isSuccessful()) {
            if (p4.isCanceled()) {
                throw new java.util.concurrent.CancellationException("Task is already canceled");
            } else {
                if (!p4.isComplete()) {
                    throw new java.util.concurrent.TimeoutException();
                } else {
                    throw new IllegalStateException(p4.getException());
                }
            }
        } else {
            p4.getResult();
            return;
        }
    }
}
