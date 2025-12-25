package b5;
public final class i extends t.h implements java.util.concurrent.ScheduledFuture {
    public final java.util.concurrent.ScheduledFuture n;

    public i(b5.h p3)
    {
        this.n = p3.a(new l6.c(this, 8));
        return;
    }

    public final void c()
    {
        int v1_3;
        int v1_0 = this.a;
        if ((!(v1_0 instanceof t.a)) || (!((t.a) v1_0).a)) {
            v1_3 = 0;
        } else {
            v1_3 = 1;
        }
        this.n.cancel(v1_3);
        return;
    }

    public final int compareTo(Object p2)
    {
        return this.n.compareTo(((java.util.concurrent.Delayed) p2));
    }

    public final long getDelay(java.util.concurrent.TimeUnit p3)
    {
        return this.n.getDelay(p3);
    }
}
