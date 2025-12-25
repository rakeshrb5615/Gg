package d8;
public final class d1 extends d8.i1 {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater f;
    private volatile synthetic int _invoked$volatile;
    public final u7.l e;

    static d1()
    {
        d8.d1.f = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.d1, "_invoked$volatile");
        return;
    }

    public d1(u7.l p1)
    {
        this.e = p1;
        this._invoked$volatile = 0;
        return;
    }

    public final boolean j()
    {
        return 1;
    }

    public final void k(Throwable p4)
    {
        if (d8.d1.f.compareAndSet(this, 0, 1)) {
            this.e.invoke(p4);
        }
        return;
    }
}
