package m4;
public final class k extends m4.g {
    public final transient m4.f d;
    public final transient Object[] e;
    public final transient int f;

    public k(m4.f p1, Object[] p2, int p3)
    {
        this.d = p1;
        this.e = p2;
        this.f = p3;
        return;
    }

    public final int a(Object[] p2)
    {
        return this.e().a(p2);
    }

    public final boolean contains(Object p4)
    {
        if ((p4 instanceof java.util.Map$Entry)) {
            Object v0_2 = ((java.util.Map$Entry) p4).getKey();
            int v4_4 = ((java.util.Map$Entry) p4).getValue();
            if ((v4_4 != 0) && (v4_4.equals(this.d.get(v0_2)))) {
                return 1;
            }
        }
        return 0;
    }

    public final m4.d h()
    {
        return new m4.j(this);
    }

    public final m4.s i()
    {
        return this.e().f(0);
    }

    public final bridge synthetic java.util.Iterator iterator()
    {
        return this.i();
    }

    public final int size()
    {
        return this.f;
    }
}
