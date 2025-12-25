package i7;
public final class f implements java.util.Collection, v7.a {
    public final Object[] a;
    public final boolean b;

    public f(Object[] p2, boolean p3)
    {
        kotlin.jvm.internal.j.e(p2, "values");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final boolean add(Object p2)
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

    public final boolean contains(Object p2)
    {
        return i7.h.W(this.a, p2);
    }

    public final boolean containsAll(java.util.Collection p4)
    {
        kotlin.jvm.internal.j.e(p4, "elements");
        if (!p4.isEmpty()) {
            int v4_2 = p4.iterator();
            while (v4_2.hasNext()) {
                if (!i7.h.W(this.a, v4_2.next())) {
                    return 0;
                }
            }
            return 1;
        } else {
            return 1;
        }
    }

    public final boolean isEmpty()
    {
        if (this.a.length != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Iterator iterator()
    {
        Object[] v1 = this.a;
        kotlin.jvm.internal.j.e(v1, "array");
        return new a8.b(v1);
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

    public final int size()
    {
        return this.a.length;
    }

    public final Object[] toArray()
    {
        String v1_0 = this.a;
        kotlin.jvm.internal.j.e(v1_0, "<this>");
        if ((!this.b) || (!v1_0.getClass().equals(Object[]))) {
            Object[] v0_2 = java.util.Arrays.copyOf(v1_0, v1_0.length, Object[]);
            kotlin.jvm.internal.j.d(v0_2, "copyOf(...)");
            return v0_2;
        } else {
            return v1_0;
        }
    }

    public final Object[] toArray(Object[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "array");
        return kotlin.jvm.internal.j.k(this, p2);
    }
}
