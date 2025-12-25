package m8;
public final class i extends i8.r {
    public final synthetic java.util.concurrent.atomic.AtomicReferenceArray e;

    public i(long p1, m8.i p3, int p4)
    {
        super(p1, p3, p4);
        super.e = new java.util.concurrent.atomic.AtomicReferenceArray(m8.h.f);
        return;
    }

    public final int g()
    {
        return m8.h.f;
    }

    public final void h(int p2, l7.h p3)
    {
        this.e.set(p2, m8.h.e);
        this.i();
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("SemaphoreSegment[id=");
        v0_2.append(this.c);
        v0_2.append(", hashCode=");
        v0_2.append(this.hashCode());
        v0_2.append(93);
        return v0_2.toString();
    }
}
