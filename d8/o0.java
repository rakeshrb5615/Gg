package d8;
public final class o0 implements d8.p0 {
    public final java.util.concurrent.ScheduledFuture a;

    public o0(java.util.concurrent.ScheduledFuture p1)
    {
        this.a = p1;
        return;
    }

    public final void a()
    {
        this.a.cancel(0);
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("DisposableFutureHandle[");
        v0_1.append(this.a);
        v0_1.append(93);
        return v0_1.toString();
    }
}
