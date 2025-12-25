package m4;
public final class c extends m4.d {
    public final transient int c;
    public final transient int d;
    public final synthetic m4.d e;

    public c(m4.d p1, int p2, int p3)
    {
        this.e = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public final Object[] b()
    {
        return this.e.b();
    }

    public final int c()
    {
        return ((this.e.d() + this.c) + this.d);
    }

    public final int d()
    {
        return (this.e.d() + this.c);
    }

    public final m4.d g(int p2, int p3)
    {
        a.a.i(p2, p3, this.d);
        m4.d v0_1 = this.c;
        return this.e.g((p2 + v0_1), (p3 + v0_1));
    }

    public final Object get(int p2)
    {
        a.a.f(p2, this.d);
        return this.e.get((p2 + this.c));
    }

    public final java.util.Iterator iterator()
    {
        return this.f(0);
    }

    public final java.util.ListIterator listIterator()
    {
        return this.f(0);
    }

    public final bridge synthetic java.util.ListIterator listIterator(int p1)
    {
        return this.f(p1);
    }

    public final int size()
    {
        return this.d;
    }

    public final bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.g(p1, p2);
    }
}
