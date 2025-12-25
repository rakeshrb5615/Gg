package h8;
public final class k implements l7.c, n7.d {
    public final l7.c a;
    public final l7.h b;

    public k(l7.c p1, l7.h p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final n7.d getCallerFrame()
    {
        int v0_0 = this.a;
        if (!(v0_0 instanceof n7.d)) {
            return 0;
        } else {
            return ((n7.d) v0_0);
        }
    }

    public final l7.h getContext()
    {
        return this.b;
    }

    public final void resumeWith(Object p2)
    {
        this.a.resumeWith(p2);
        return;
    }
}
