package m4;
public final class i extends m4.d {
    public static final m4.i e;
    public final transient Object[] c;
    public final transient int d;

    static i()
    {
        Object[] v2 = new Object[0];
        m4.i.e = new m4.i(v2, 0);
        return;
    }

    public i(Object[] p1, int p2)
    {
        this.c = p1;
        this.d = p2;
        return;
    }

    public final int a(Object[] p4)
    {
        int v2 = this.d;
        System.arraycopy(this.c, 0, p4, 0, v2);
        return v2;
    }

    public final Object[] b()
    {
        return this.c;
    }

    public final int c()
    {
        return this.d;
    }

    public final int d()
    {
        return 0;
    }

    public final Object get(int p2)
    {
        a.a.f(p2, this.d);
        Object v2_1 = this.c[p2];
        java.util.Objects.requireNonNull(v2_1);
        return v2_1;
    }

    public final int size()
    {
        return this.d;
    }
}
