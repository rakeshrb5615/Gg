package d8;
public class w {
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater b;
    private volatile synthetic int _handled$volatile;
    public final Throwable a;

    static w()
    {
        d8.w.b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(d8.w, "_handled$volatile");
        return;
    }

    public w(boolean p1, Throwable p2)
    {
        this.a = p2;
        this._handled$volatile = p1;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.getClass().getSimpleName());
        v0_1.append(91);
        v0_1.append(this.a);
        v0_1.append(93);
        return v0_1.toString();
    }
}
