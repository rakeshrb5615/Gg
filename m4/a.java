package m4;
public abstract class a extends java.util.AbstractCollection implements java.io.Serializable {
    public static final Object[] a;

    static a()
    {
        Object[] v0_1 = new Object[0];
        m4.a.a = v0_1;
        return;
    }

    public abstract int a();

    public final boolean add(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection p1)
    {
        throw new UnsupportedOperationException();
    }

    public Object[] b()
    {
        return 0;
    }

    public int c()
    {
        throw new UnsupportedOperationException();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains();

    public int d()
    {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(java.util.Collection p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(java.util.Collection p1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray()
    {
        return this.toArray(m4.a.a);
    }

    public final Object[] toArray(Object[] p4)
    {
        p4.getClass();
        int v0_0 = this.size();
        if (p4.length >= v0_0) {
            if (p4.length > v0_0) {
                p4[v0_0] = 0;
            }
        } else {
            int v1_0 = this.b();
            if (v1_0 == 0) {
                if (p4.length != 0) {
                    p4 = java.util.Arrays.copyOf(p4, 0);
                }
                p4 = java.util.Arrays.copyOf(p4, v0_0);
            } else {
                return java.util.Arrays.copyOfRange(v1_0, this.d(), this.c(), p4.getClass());
            }
        }
        this.a(p4);
        return p4;
    }
}
