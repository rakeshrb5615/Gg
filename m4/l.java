package m4;
public final class l extends m4.g {
    public final transient m4.f d;
    public final transient m4.m e;

    public l(m4.f p1, m4.m p2)
    {
        this.d = p1;
        this.e = p2;
        return;
    }

    public final int a(Object[] p2)
    {
        return this.e.a(p2);
    }

    public final boolean contains(Object p2)
    {
        if (this.d.get(p2) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final m4.d e()
    {
        throw 0;
    }

    public final m4.s i()
    {
        return this.e.f(0);
    }

    public final bridge synthetic java.util.Iterator iterator()
    {
        return this.i();
    }

    public final int size()
    {
        return ((m4.n) this.d).f;
    }
}
