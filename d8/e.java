package d8;
public final class e {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater b;
    public final d8.i0[] a;
    private volatile synthetic int notCompletedCount$volatile;

    static e()
    {
        d8.e.b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.e, "notCompletedCount$volatile");
        return;
    }

    public e(d8.i0[] p1)
    {
        this.a = p1;
        this.notCompletedCount$volatile = p1.length;
        return;
    }
}
