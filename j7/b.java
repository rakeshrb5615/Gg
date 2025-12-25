package j7;
public final class b extends i7.e implements java.util.RandomAccess, java.io.Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final j7.b d;
    public final j7.c e;

    public b(Object[] p2, int p3, int p4, j7.b p5, j7.c p6)
    {
        kotlin.jvm.internal.j.e(p2, "backing");
        kotlin.jvm.internal.j.e(p6, "root");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.modCount = j7.c.d(p6);
        return;
    }

    public static final synthetic int d(j7.b p0)
    {
        return p0.modCount;
    }

    public final void add(int p4, Object p5)
    {
        this.h();
        this.g();
        int v0_2 = this.c;
        if ((p4 < null) || (p4 > v0_2)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p4, v0_2, ", size: "));
        } else {
            this.f((this.b + p4), p5);
            return;
        }
    }

    public final boolean add(Object p3)
    {
        this.h();
        this.g();
        this.f((this.b + this.c), p3);
        return 1;
    }

    public final boolean addAll(int p4, java.util.Collection p5)
    {
        kotlin.jvm.internal.j.e(p5, "elements");
        this.h();
        this.g();
        int v0_2 = this.c;
        if ((p4 < 0) || (p4 > v0_2)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p4, v0_2, ", size: "));
        } else {
            int v0_1 = p5.size();
            this.e((this.b + p4), p5, v0_1);
            if (v0_1 <= 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final boolean addAll(java.util.Collection p4)
    {
        kotlin.jvm.internal.j.e(p4, "elements");
        this.h();
        this.g();
        int v0_1 = p4.size();
        this.e((this.b + this.c), p4, v0_1);
        if (v0_1 <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int b()
    {
        this.g();
        return this.c;
    }

    public final Object c(int p5)
    {
        this.h();
        this.g();
        int v0_2 = this.c;
        if ((p5 < null) || (p5 >= v0_2)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_2, ", size: "));
        } else {
            return this.i((this.b + p5));
        }
    }

    public final void clear()
    {
        this.h();
        this.g();
        this.j(this.b, this.c);
        return;
    }

    public final void e(int p3, java.util.Collection p4, int p5)
    {
        this.modCount = (this.modCount + 1);
        j7.c v0_2 = this.e;
        j7.c v1 = this.d;
        if (v1 == null) {
            v0_2.e(p3, p4, p5);
        } else {
            v1.e(p3, p4, p5);
        }
        this.a = v0_2.a;
        this.c = (this.c + p5);
        return;
    }

    public final boolean equals(Object p7)
    {
        this.g();
        if (p7 != this) {
            if ((p7 instanceof java.util.List)) {
                int v2 = this.c;
                if (v2 == ((java.util.List) p7).size()) {
                    int v3_0 = 0;
                    while (v3_0 < v2) {
                        if (kotlin.jvm.internal.j.a(this.a[(this.b + v3_0)], ((java.util.List) p7).get(v3_0))) {
                            v3_0++;
                        }
                    }
                    return 1;
                }
            }
            return 0;
        }
        return 1;
    }

    public final void f(int p3, Object p4)
    {
        this.modCount = (this.modCount + 1);
        j7.c v0_2 = this.e;
        j7.c v1 = this.d;
        if (v1 == null) {
            v0_2.f(p3, p4);
        } else {
            v1.f(p3, p4);
        }
        this.a = v0_2.a;
        this.c = (this.c + 1);
        return;
    }

    public final void g()
    {
        if (j7.c.d(this.e) != this.modCount) {
            throw new java.util.ConcurrentModificationException();
        } else {
            return;
        }
    }

    public final Object get(int p5)
    {
        this.g();
        Object[] v0_0 = this.c;
        if ((p5 < null) || (p5 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_0, ", size: "));
        } else {
            return this.a[(this.b + p5)];
        }
    }

    public final void h()
    {
        if (this.e.c) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final int hashCode()
    {
        this.g();
        Object[] v0 = this.a;
        int v1 = this.c;
        int v2_1 = 1;
        int v4 = 0;
        while (v4 < v1) {
            int v5_1;
            int v5_0 = v0[(this.b + v4)];
            int v2_0 = (v2_1 * 31);
            if (v5_0 == 0) {
                v5_1 = 0;
            } else {
                v5_1 = v5_0.hashCode();
            }
            v2_1 = (v2_0 + v5_1);
            v4++;
        }
        return v2_1;
    }

    public final Object i(int p2)
    {
        Object v2_1;
        this.modCount = (this.modCount + 1);
        int v0_4 = this.d;
        if (v0_4 == 0) {
            v2_1 = this.e.i(p2);
        } else {
            v2_1 = v0_4.i(p2);
        }
        this.c = (this.c - 1);
        return v2_1;
    }

    public final int indexOf(Object p4)
    {
        this.g();
        int v0 = 0;
        while (v0 < this.c) {
            if (!kotlin.jvm.internal.j.a(this.a[(this.b + v0)], p4)) {
                v0++;
            } else {
                return v0;
            }
        }
        return -1;
    }

    public final boolean isEmpty()
    {
        this.g();
        if (this.c != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Iterator iterator()
    {
        return this.listIterator(0);
    }

    public final void j(int p2, int p3)
    {
        if (p3 > 0) {
            this.modCount = (this.modCount + 1);
        }
        j7.c v0_2 = this.d;
        if (v0_2 == null) {
            this.e.j(p2, p3);
        } else {
            v0_2.j(p2, p3);
        }
        this.c = (this.c - p3);
        return;
    }

    public final int k(int p2, int p3, java.util.Collection p4, boolean p5)
    {
        int v2_1;
        j7.c v0_0 = this.d;
        if (v0_0 == null) {
            v2_1 = this.e.k(p2, p3, p4, p5);
        } else {
            v2_1 = v0_0.k(p2, p3, p4, p5);
        }
        if (v2_1 > 0) {
            this.modCount = (this.modCount + 1);
        }
        this.c = (this.c - v2_1);
        return v2_1;
    }

    public final int lastIndexOf(Object p4)
    {
        this.g();
        int v0_1 = (this.c - 1);
        while (v0_1 >= 0) {
            if (!kotlin.jvm.internal.j.a(this.a[(this.b + v0_1)], p4)) {
                v0_1--;
            } else {
                return v0_1;
            }
        }
        return -1;
    }

    public final java.util.ListIterator listIterator()
    {
        return this.listIterator(0);
    }

    public final java.util.ListIterator listIterator(int p5)
    {
        this.g();
        j7.a v0_0 = this.c;
        if ((p5 < null) || (p5 > v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_0, ", size: "));
        } else {
            return new j7.a(this, p5);
        }
    }

    public final boolean remove(Object p1)
    {
        this.h();
        this.g();
        int v1_1 = this.indexOf(p1);
        if (v1_1 >= 0) {
            this.c(v1_1);
        }
        if (v1_1 < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean removeAll(java.util.Collection p4)
    {
        kotlin.jvm.internal.j.e(p4, "elements");
        this.h();
        this.g();
        if (this.k(this.b, this.c, p4, 0) <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean retainAll(java.util.Collection p4)
    {
        kotlin.jvm.internal.j.e(p4, "elements");
        this.h();
        this.g();
        if (this.k(this.b, this.c, p4, 1) <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object set(int p4, Object p5)
    {
        this.h();
        this.g();
        Object[] v0_1 = this.c;
        if ((p4 < null) || (p4 >= v0_1)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p4, v0_1, ", size: "));
        } else {
            Object[] v0_0 = this.a;
            int v1_0 = this.b;
            Object v2_1 = v0_0[(v1_0 + p4)];
            v0_0[(v1_0 + p4)] = p5;
            return v2_1;
        }
    }

    public final java.util.List subList(int p8, int p9)
    {
        j5.t1.e(p8, p9, this.c);
        return new j7.b(this.a, (this.b + p8), (p9 - p8), this, this.e);
    }

    public final Object[] toArray()
    {
        this.g();
        int v2 = this.b;
        return i7.h.c0(this.a, v2, (this.c + v2));
    }

    public final Object[] toArray(Object[] p5)
    {
        kotlin.jvm.internal.j.e(p5, "array");
        this.g();
        int v1_3 = this.c;
        int v2 = this.b;
        if (p5.length >= v1_3) {
            i7.h.Z(this.a, 0, p5, v2, (v1_3 + v2));
            int v0_1 = this.c;
            if (v0_1 < p5.length) {
                p5[v0_1] = 0;
            }
            return p5;
        } else {
            Object[] v5_2 = java.util.Arrays.copyOfRange(this.a, v2, (v1_3 + v2), p5.getClass());
            kotlin.jvm.internal.j.d(v5_2, "copyOfRange(...)");
            return v5_2;
        }
    }

    public final String toString()
    {
        this.g();
        return j5.t1.a(this.a, this.b, this.c, this);
    }
}
