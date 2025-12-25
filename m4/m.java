package m4;
public final class m extends m4.d {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public m(Object[] p1, int p2, int p3)
    {
        this.c = p1;
        this.d = p2;
        this.e = p3;
        return;
    }

    public final Object get(int p2)
    {
        a.a.f(p2, this.e);
        Object v2_3 = this.c[((p2 * 2) + this.d)];
        java.util.Objects.requireNonNull(v2_3);
        return v2_3;
    }

    public final int size()
    {
        return this.e;
    }
}
