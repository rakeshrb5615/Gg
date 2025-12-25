package u6;
public final synthetic class l implements g8.d {
    public final synthetic java.util.concurrent.atomic.AtomicReference a;

    public l(java.util.concurrent.atomic.AtomicReference p1)
    {
        this.a = p1;
        return;
    }

    public final Object a(Object p1, l7.c p2)
    {
        this.a.set(((u6.h) p1));
        return h7.l.a;
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof g8.d)) || (!(p3 instanceof u6.l))) {
            return 0;
        } else {
            return new kotlin.jvm.internal.a(this.a).equals(new kotlin.jvm.internal.a(((u6.l) p3).a));
        }
    }

    public final int hashCode()
    {
        int v0_3;
        int v0_0 = this.a;
        if (v0_0 == 0) {
            v0_3 = 0;
        } else {
            v0_3 = v0_0.hashCode();
        }
        return (((((((((((java.util.concurrent.atomic.AtomicReference.hashCode() + (v0_3 * 31)) * 31) + 113762) * 31) + -869290769) * 31) + 1237) * 31) + 2) * 31) + 2);
    }
}
