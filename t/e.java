package t;
public final class e extends q4.b {
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater g;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater i;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater j;

    public e(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p6)
    {
        super(27);
        super.f = p2;
        super.g = p3;
        super.h = p4;
        super.i = p5;
        super.j = p6;
        return;
    }

    public final void M(t.g p2, t.g p3)
    {
        this.g.lazySet(p2, p3);
        return;
    }

    public final void N(t.g p2, Thread p3)
    {
        this.f.lazySet(p2, p3);
        return;
    }

    public final boolean b(t.h p3, t.d p4, t.d p5)
    {
        do {
            Object v0_0 = this.i;
            if (!v0_0.compareAndSet(p3, p4, p5)) {
            } else {
                return 1;
            }
        } while(v0_0.get(p3) == p4);
        return 0;
    }

    public final boolean c(t.h p3, Object p4, Object p5)
    {
        do {
            Object v0_0 = this.j;
            if (!v0_0.compareAndSet(p3, p4, p5)) {
            } else {
                return 1;
            }
        } while(v0_0.get(p3) == p4);
        return 0;
    }

    public final boolean d(t.h p3, t.g p4, t.g p5)
    {
        do {
            Object v0_0 = this.h;
            if (!v0_0.compareAndSet(p3, p4, p5)) {
            } else {
                return 1;
            }
        } while(v0_0.get(p3) == p4);
        return 0;
    }
}
