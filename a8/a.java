package a8;
public final class a implements a8.f {
    public final java.util.concurrent.atomic.AtomicReference a;

    public a(a8.f p2)
    {
        this.a = new java.util.concurrent.atomic.AtomicReference(p2);
        return;
    }

    public final java.util.Iterator iterator()
    {
        IllegalStateException v0_3 = ((a8.f) this.a.getAndSet(0));
        if (v0_3 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        } else {
            return v0_3.iterator();
        }
    }
}
