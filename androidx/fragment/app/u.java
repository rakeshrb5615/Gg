package androidx.fragment.app;
public final class u extends e.c {
    public final synthetic java.util.concurrent.atomic.AtomicReference a;

    public u(java.util.concurrent.atomic.AtomicReference p1)
    {
        this.a = p1;
        return;
    }

    public final void a(Object p2)
    {
        String v0_2 = ((e.c) this.a.get());
        if (v0_2 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        } else {
            v0_2.a(p2);
            return;
        }
    }
}
