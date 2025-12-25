package i7;
public final class p implements java.util.Set, java.io.Serializable, v7.a {
    public static final i7.p a;

    static p()
    {
        i7.p.a = new i7.p();
        return;
    }

    public final bridge synthetic boolean add(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(java.util.Collection p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear()
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object p1)
    {
        return 0;
    }

    public final boolean containsAll(java.util.Collection p2)
    {
        kotlin.jvm.internal.j.e(p2, "elements");
        return p2.isEmpty();
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof java.util.Set)) || (!((java.util.Set) p2).isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return 0;
    }

    public final boolean isEmpty()
    {
        return 1;
    }

    public final java.util.Iterator iterator()
    {
        return i7.m.a;
    }

    public final boolean remove(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(java.util.Collection p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(java.util.Collection p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final bridge int size()
    {
        return 0;
    }

    public final Object[] toArray()
    {
        return kotlin.jvm.internal.j.j(this);
    }

    public final Object[] toArray(Object[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "array");
        return kotlin.jvm.internal.j.k(this, p2);
    }

    public final String toString()
    {
        return "[]";
    }
}
