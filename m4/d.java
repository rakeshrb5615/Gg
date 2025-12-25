package m4;
public abstract class d extends m4.a implements java.util.List, java.util.RandomAccess {
    public static final m4.b b;

    static d()
    {
        m4.d.b = new m4.b(m4.i.e, 0);
        return;
    }

    public static m4.i e(int p1, Object[] p2)
    {
        if (p1 != null) {
            return new m4.i(p2, p1);
        } else {
            return m4.i.e;
        }
    }

    public int a(Object[] p4)
    {
        int v0 = this.size();
        int v1 = 0;
        while (v1 < v0) {
            p4[v1] = this.get(v1);
            v1++;
        }
        return v0;
    }

    public final void add(int p1, Object p2)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int p1, java.util.Collection p2)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object p1)
    {
        if (this.indexOf(p1) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof java.util.List)) {
                java.util.Iterator v1_2 = this.size();
                if (v1_2 == ((java.util.List) p7).size()) {
                    if (!(((java.util.List) p7) instanceof java.util.RandomAccess)) {
                        java.util.Iterator v1_0 = this.iterator();
                        int v7_1 = ((java.util.List) p7).iterator();
                        while (v1_0.hasNext()) {
                            if ((!v7_1.hasNext()) || (!q4.b.p(v1_0.next(), v7_1.next()))) {
                            }
                        }
                        return (v7_1.hasNext() ^ 1);
                    } else {
                        boolean v3_5 = 0;
                        while (v3_5 < v1_2) {
                            if (q4.b.p(this.get(v3_5), ((java.util.List) p7).get(v3_5))) {
                                v3_5++;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final m4.b f(int p2)
    {
        a.a.h(p2, this.size());
        if (!this.isEmpty()) {
            return new m4.b(this, p2);
        } else {
            return m4.d.b;
        }
    }

    public m4.d g(int p2, int p3)
    {
        a.a.i(p2, p3, this.size());
        int v3_1 = (p3 - p2);
        if (v3_1 != this.size()) {
            if (v3_1 != 0) {
                return new m4.c(this, p2, v3_1);
            } else {
                return m4.i.e;
            }
        } else {
            return this;
        }
    }

    public final int hashCode()
    {
        int v1_1 = 1;
        int v2 = 0;
        while (v2 < this.size()) {
            v1_1 = (~ (~ (this.get(v2).hashCode() + (v1_1 * 31))));
            v2++;
        }
        return v1_1;
    }

    public final int indexOf(Object p5)
    {
        if (p5 != null) {
            int v1 = this.size();
            int v2 = 0;
            while (v2 < v1) {
                if (!p5.equals(this.get(v2))) {
                    v2++;
                } else {
                    return v2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public java.util.Iterator iterator()
    {
        return this.f(0);
    }

    public final int lastIndexOf(Object p4)
    {
        if (p4 != null) {
            int v1_0 = (this.size() - 1);
            while (v1_0 >= 0) {
                if (!p4.equals(this.get(v1_0))) {
                    v1_0--;
                } else {
                    return v1_0;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public java.util.ListIterator listIterator()
    {
        return this.f(0);
    }

    public bridge synthetic java.util.ListIterator listIterator(int p1)
    {
        return this.f(p1);
    }

    public final Object remove(int p1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int p1, Object p2)
    {
        throw new UnsupportedOperationException();
    }

    public bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.g(p1, p2);
    }
}
