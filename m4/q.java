package m4;
public final class q extends java.util.AbstractSet {
    public final synthetic java.util.Set a;
    public final synthetic java.util.Set b;

    public q(java.util.Set p1, java.util.Set p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean add(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection p1)
    {
        throw new UnsupportedOperationException();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object p2)
    {
        if ((!this.a.contains(p2)) && (!this.b.contains(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isEmpty()
    {
        if ((!this.a.isEmpty()) || (!this.b.isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Iterator iterator()
    {
        return new m4.p(this);
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

    public final int size()
    {
        java.util.Set v0 = this.a;
        int v1 = v0.size();
        java.util.Iterator v2_1 = this.b.iterator();
        while (v2_1.hasNext()) {
            if (!v0.contains(v2_1.next())) {
                v1++;
            }
        }
        return v1;
    }
}
