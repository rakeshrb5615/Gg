package m4;
public final class o extends m4.g {
    public static final Object[] o;
    public static final m4.o p;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int m;
    public final transient int n;

    static o()
    {
        Object[] v2 = new Object[0];
        m4.o.o = v2;
        m4.o.p = new m4.o(v2, 0, v2, 0, 0);
        return;
    }

    public o(Object[] p1, int p2, Object[] p3, int p4, int p5)
    {
        this.d = p1;
        this.e = p2;
        this.f = p3;
        this.m = p4;
        this.n = p5;
        return;
    }

    public final int a(Object[] p4)
    {
        int v2 = this.n;
        System.arraycopy(this.d, 0, p4, 0, v2);
        return v2;
    }

    public final Object[] b()
    {
        return this.d;
    }

    public final int c()
    {
        return this.n;
    }

    public final boolean contains(Object p5)
    {
        if (p5 != 0) {
            Object[] v1 = this.f;
            if (v1.length != 0) {
                int v2_1 = a.a.U(p5.hashCode());
                while(true) {
                    int v2_0 = (v2_1 & this.m);
                    boolean v3_0 = v1[v2_0];
                    if (v3_0) {
                        if (v3_0.equals(p5)) {
                            break;
                        }
                        v2_1 = (v2_0 + 1);
                    } else {
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    public final int d()
    {
        return 0;
    }

    public final m4.d h()
    {
        return m4.d.e(this.n, this.d);
    }

    public final int hashCode()
    {
        return this.e;
    }

    public final java.util.Iterator iterator()
    {
        return this.e().f(0);
    }

    public final int size()
    {
        return this.n;
    }
}
