package t;
public final class k implements p4.b {
    public final ref.WeakReference a;
    public final t.j b;

    public k(t.i p2)
    {
        this.b = new t.j(this);
        this.a = new ref.WeakReference(p2);
        return;
    }

    public final void a(b5.l p2, java.util.concurrent.Executor p3)
    {
        this.b.a(p2, p3);
        return;
    }

    public final boolean cancel(boolean p3)
    {
        t.l v0_3 = ((t.i) this.a.get());
        boolean v3_1 = this.b.cancel(p3);
        if ((v3_1) && (v0_3 != null)) {
            v0_3.a = 0;
            v0_3.b = 0;
            v0_3.c.j(0);
        }
        return v3_1;
    }

    public final Object get()
    {
        return this.b.get();
    }

    public final Object get(long p2, java.util.concurrent.TimeUnit p4)
    {
        return this.b.get(p2, p4);
    }

    public final boolean isCancelled()
    {
        return (this.b.a instanceof t.a);
    }

    public final boolean isDone()
    {
        return this.b.isDone();
    }

    public final String toString()
    {
        return this.b.toString();
    }
}
