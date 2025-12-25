package i7;
public final class n implements java.util.List, java.io.Serializable, java.util.RandomAccess, v7.a {
    public static final i7.n a;

    static n()
    {
        i7.n.a = new i7.n();
        return;
    }

    public final bridge synthetic void add(int p1, Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final bridge synthetic boolean add(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int p1, java.util.Collection p2)
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
        if ((!(p2 instanceof java.util.List)) || (!((java.util.List) p2).isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object get(int p4)
    {
        StringBuilder v1_1 = new StringBuilder("Empty list doesn\'t contain element at index ");
        v1_1.append(p4);
        v1_1.append(46);
        throw new IndexOutOfBoundsException(v1_1.toString());
    }

    public final int hashCode()
    {
        return 1;
    }

    public final int indexOf(Object p1)
    {
        return -1;
    }

    public final boolean isEmpty()
    {
        return 1;
    }

    public final java.util.Iterator iterator()
    {
        return i7.m.a;
    }

    public final int lastIndexOf(Object p1)
    {
        return -1;
    }

    public final java.util.ListIterator listIterator()
    {
        return i7.m.a;
    }

    public final java.util.ListIterator listIterator(int p3)
    {
        if (p3 != null) {
            throw new IndexOutOfBoundsException(g2.g.c(p3, "Index: "));
        } else {
            return i7.m.a;
        }
    }

    public final bridge synthetic Object remove(int p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public final bridge synthetic Object set(int p1, Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final bridge int size()
    {
        return 0;
    }

    public final java.util.List subList(int p4, int p5)
    {
        if ((p4 != null) || (p5 != 0)) {
            throw new IndexOutOfBoundsException(v1.a.i("fromIndex: ", p4, p5, ", toIndex: "));
        } else {
            return this;
        }
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
