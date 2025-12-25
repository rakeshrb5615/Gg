package androidx.loader.content;
public final class a implements java.lang.Runnable {
    public static final java.util.concurrent.ThreadPoolExecutor o;
    public static androidx.loader.content.j p;
    public final androidx.loader.content.g a;
    public final androidx.loader.content.h b;
    public volatile int c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final java.util.concurrent.CountDownLatch f;
    public boolean m;
    public final synthetic androidx.loader.content.b n;

    static a()
    {
        androidx.loader.content.a.o = new java.util.concurrent.ThreadPoolExecutor(5, 128, 1, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(10), new androidx.loader.content.f(0));
        return;
    }

    public a(androidx.loader.content.b p3)
    {
        this.n = p3;
        this.c = 1;
        this.d = new java.util.concurrent.atomic.AtomicBoolean();
        this.e = new java.util.concurrent.atomic.AtomicBoolean();
        java.util.concurrent.CountDownLatch v0_1 = new androidx.loader.content.g(this);
        this.a = v0_1;
        this.b = new androidx.loader.content.h(this, v0_1);
        this.f = new java.util.concurrent.CountDownLatch(1);
        return;
    }

    public final void a(Object p4)
    {
        if (androidx.loader.content.a.p == null) {
            androidx.loader.content.a.p = new androidx.loader.content.j(android.os.Looper.getMainLooper());
        }
        androidx.loader.content.a.p.obtainMessage(1, new androidx.loader.content.i(this, new Object[] {p4}))).sendToTarget();
        return;
    }

    public final void run()
    {
        this.m = 0;
        this.n.executePendingTask();
        return;
    }
}
