package okhttp3.internal.concurrent;
final class TaskQueue$AwaitIdleTask extends okhttp3.internal.concurrent.Task {
    public final java.util.concurrent.CountDownLatch e;

    public TaskQueue$AwaitIdleTask()
    {
        super(v1.a.n(new StringBuilder(), okhttp3.internal._UtilJvmKt.b, " awaitIdle"), 0);
        super.e = new java.util.concurrent.CountDownLatch(1);
        return;
    }

    public final long a()
    {
        this.e.countDown();
        return -1;
    }
}
