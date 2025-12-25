package b5;
public final class g implements java.util.concurrent.ScheduledExecutorService, java.lang.AutoCloseable {
    public final java.util.concurrent.ExecutorService a;
    public final java.util.concurrent.ScheduledExecutorService b;

    public g(java.util.concurrent.ExecutorService p1, java.util.concurrent.ScheduledExecutorService p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean awaitTermination(long p2, java.util.concurrent.TimeUnit p4)
    {
        return this.a.awaitTermination(p2, p4);
    }

    public final synthetic void close()
    {
        if ((this != java.util.concurrent.ForkJoinPool.commonPool()) && (!this.isTerminated())) {
            this.shutdown();
            throw 0;
        } else {
            return;
        }
    }

    public final void execute(Runnable p2)
    {
        this.a.execute(p2);
        return;
    }

    public final java.util.List invokeAll(java.util.Collection p2)
    {
        return this.a.invokeAll(p2);
    }

    public final java.util.List invokeAll(java.util.Collection p2, long p3, java.util.concurrent.TimeUnit p5)
    {
        return this.a.invokeAll(p2, p3, p5);
    }

    public final Object invokeAny(java.util.Collection p2)
    {
        return this.a.invokeAny(p2);
    }

    public final Object invokeAny(java.util.Collection p2, long p3, java.util.concurrent.TimeUnit p5)
    {
        return this.a.invokeAny(p2, p3, p5);
    }

    public final boolean isShutdown()
    {
        return this.a.isShutdown();
    }

    public final boolean isTerminated()
    {
        return this.a.isTerminated();
    }

    public final java.util.concurrent.ScheduledFuture schedule(Runnable p9, long p10, java.util.concurrent.TimeUnit p12)
    {
        return new b5.i(new b5.b(this, p9, p10, p12, 0));
    }

    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable p9, long p10, java.util.concurrent.TimeUnit p12)
    {
        return new b5.i(new b5.b(this, p9, p10, p12, 1));
    }

    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(Runnable p11, long p12, long p14, java.util.concurrent.TimeUnit p16)
    {
        return new b5.i(new b5.d(this, p11, p12, p14, p16, 0));
    }

    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(Runnable p11, long p12, long p14, java.util.concurrent.TimeUnit p16)
    {
        return new b5.i(new b5.d(this, p11, p12, p14, p16, 1));
    }

    public final void shutdown()
    {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final java.util.List shutdownNow()
    {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final java.util.concurrent.Future submit(Runnable p2)
    {
        return this.a.submit(p2);
    }

    public final java.util.concurrent.Future submit(Runnable p2, Object p3)
    {
        return this.a.submit(p2, p3);
    }

    public final java.util.concurrent.Future submit(java.util.concurrent.Callable p2)
    {
        return this.a.submit(p2);
    }
}
