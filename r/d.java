package r;
public final class d implements java.util.Collection {
    public final synthetic r.e a;

    public d(r.e p1)
    {
        this.a = p1;
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
        this.a.clear();
        return;
    }

    public final boolean contains(Object p2)
    {
        if (this.a.b(p2) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean containsAll(java.util.Collection p2)
    {
        int v2_1 = p2.iterator();
        while (v2_1.hasNext()) {
            if (!this.contains(v2_1.next())) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean isEmpty()
    {
        return this.a.isEmpty();
    }

    public final java.util.Iterator iterator()
    {
        return new r.a(this.a, 1);
    }

    public final boolean remove(Object p2)
    {
        r.e v0 = this.a;
        int v2_1 = v0.b(p2);
        if (v2_1 < 0) {
            return 0;
        } else {
            v0.h(v2_1);
            return 1;
        }
    }

    public final boolean removeAll(java.util.Collection p7)
    {
        r.e v0 = this.a;
        int v1 = v0.c;
        int v2 = 0;
        int v3 = 0;
        while (v2 < v1) {
            if (p7.contains(v0.j(v2))) {
                v0.h(v2);
                v2--;
                v1--;
                v3 = 1;
            }
            v2++;
        }
        return v3;
    }

    public final boolean retainAll(java.util.Collection p7)
    {
        r.e v0 = this.a;
        int v1 = v0.c;
        int v2 = 0;
        int v3 = 0;
        while (v2 < v1) {
            if (!p7.contains(v0.j(v2))) {
                v0.h(v2);
                v2--;
                v1--;
                v3 = 1;
            }
            v2++;
        }
        return v3;
    }

    public final int size()
    {
        return this.a.c;
    }

    public final Object[] toArray()
    {
        r.e v0 = this.a;
        int v1 = v0.c;
        Object[] v2 = new Object[v1];
        int v3 = 0;
        while (v3 < v1) {
            v2[v3] = v0.j(v3);
            v3++;
        }
        return v2;
    }

    public final Object[] toArray(Object[] p5)
    {
        int v0_0 = this.a;
        int v1 = v0_0.c;
        if (p5.length < v1) {
            p5 = ((Object[]) reflect.Array.newInstance(p5.getClass().getComponentType(), v1));
        }
        int v2_0 = 0;
        while (v2_0 < v1) {
            p5[v2_0] = v0_0.j(v2_0);
            v2_0++;
        }
        if (p5.length > v1) {
            p5[v1] = 0;
        }
        return p5;
    }
}
