package i7;
public abstract class a implements java.util.Collection, v7.a {

    public final boolean add(Object p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(java.util.Collection p2)
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    public final void clear()
    {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object p4)
    {
        if (!this.isEmpty()) {
            java.util.Iterator v0_1 = this.iterator();
            while (v0_1.hasNext()) {
                if (kotlin.jvm.internal.j.a(v0_1.next(), p4)) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final boolean containsAll(java.util.Collection p3)
    {
        kotlin.jvm.internal.j.e(p3, "elements");
        if (!p3.isEmpty()) {
            int v3_2 = p3.iterator();
            while (v3_2.hasNext()) {
                if (!this.contains(v3_2.next())) {
                    return 0;
                }
            }
            return 1;
        } else {
            return 1;
        }
    }

    public boolean isEmpty()
    {
        if (this.b() != 0) {
            return 0;
        } else {
            return 1;
        }
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
        return this.b();
    }

    public Object[] toArray()
    {
        return kotlin.jvm.internal.j.j(this);
    }

    public Object[] toArray(Object[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "array");
        return kotlin.jvm.internal.j.k(this, p2);
    }

    public final String toString()
    {
        return i7.i.c0(this, ", ", "[", "]", new a6.i(this, 3), 24);
    }
}
