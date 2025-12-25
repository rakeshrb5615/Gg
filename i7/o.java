package i7;
public final class o implements java.util.Map, java.io.Serializable, v7.a {
    public static final i7.o a;

    static o()
    {
        i7.o.a = new i7.o();
        return;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object p1)
    {
        return 0;
    }

    public final boolean containsValue(Object p1)
    {
        return 0;
    }

    public final bridge java.util.Set entrySet()
    {
        return i7.p.a;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof java.util.Map)) || (!((java.util.Map) p2).isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final bridge synthetic Object get(Object p1)
    {
        return 0;
    }

    public final int hashCode()
    {
        return 0;
    }

    public final boolean isEmpty()
    {
        return 1;
    }

    public final bridge java.util.Set keySet()
    {
        return i7.p.a;
    }

    public final bridge synthetic Object put(Object p1, Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(java.util.Map p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object p1, Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final bridge int size()
    {
        return 0;
    }

    public final String toString()
    {
        return "{}";
    }

    public final bridge java.util.Collection values()
    {
        return i7.n.a;
    }
}
