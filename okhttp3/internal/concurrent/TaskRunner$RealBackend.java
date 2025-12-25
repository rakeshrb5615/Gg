package okhttp3.internal.concurrent;
public final class TaskRunner$RealBackend implements okhttp3.internal.concurrent.TaskRunner$Backend {
    public final java.util.concurrent.ThreadPoolExecutor a;

    public TaskRunner$RealBackend(okhttp3.internal.b p9)
    {
        this.a = new java.util.concurrent.ThreadPoolExecutor(0, 2147483647, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), p9);
        return;
    }
}
