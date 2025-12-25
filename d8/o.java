package d8;
public final class o extends d8.w {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater c;
    private volatile synthetic int _resumed$volatile;

    static o()
    {
        d8.o.c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.o, "_resumed$volatile");
        return;
    }

    public o(d8.n p3, Throwable p4, boolean p5)
    {
        if (p4 == null) {
            StringBuilder v0_1 = new StringBuilder("Continuation ");
            v0_1.append(p3);
            v0_1.append(" was cancelled normally");
            p4 = new java.util.concurrent.CancellationException(v0_1.toString());
        }
        super(p5, p4);
        super._resumed$volatile = 0;
        return;
    }
}
