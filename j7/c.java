package j7;
public final class c extends i7.e implements java.util.RandomAccess, java.io.Serializable {
    public static final j7.c d;
    public Object[] a;
    public int b;
    public boolean c;

    static c()
    {
        j7.c v0_1 = new j7.c(0);
        v0_1.c = 1;
        j7.c.d = v0_1;
        return;
    }

    public c(int p2)
    {
        if (p2 < null) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        } else {
            IllegalArgumentException v2_3 = new Object[p2];
            this.a = v2_3;
            return;
        }
    }

    public static final synthetic int d(j7.c p0)
    {
        return p0.modCount;
    }

    public final void add(int p4, Object p5)
    {
        this.g();
        Object[] v0_0 = this.b;
        if ((p4 < null) || (p4 > v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p4, v0_0, ", size: "));
        } else {
            this.modCount = (this.modCount + 1);
            this.h(p4, 1);
            this.a[p4] = p5;
            return;
        }
    }

    public final boolean add(Object p4)
    {
        this.g();
        int v0 = this.b;
        this.modCount = (this.modCount + 1);
        this.h(v0, 1);
        this.a[v0] = p4;
        return 1;
    }

    public final boolean addAll(int p4, java.util.Collection p5)
    {
        kotlin.jvm.internal.j.e(p5, "elements");
        this.g();
        int v0_2 = this.b;
        if ((p4 < 0) || (p4 > v0_2)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p4, v0_2, ", size: "));
        } else {
            int v0_1 = p5.size();
            this.e(p4, p5, v0_1);
            if (v0_1 <= 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final boolean addAll(java.util.Collection p3)
    {
        kotlin.jvm.internal.j.e(p3, "elements");
        this.g();
        int v0_1 = p3.size();
        this.e(this.b, p3, v0_1);
        if (v0_1 <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int b()
    {
        return this.b;
    }

    public final Object c(int p5)
    {
        this.g();
        int v0 = this.b;
        if ((p5 < null) || (p5 >= v0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0, ", size: "));
        } else {
            return this.i(p5);
        }
    }

    public final void clear()
    {
        this.g();
        this.j(0, this.b);
        return;
    }

    public final void e(int p5, java.util.Collection p6, int p7)
    {
        this.modCount = (this.modCount + 1);
        this.h(p5, p7);
        java.util.Iterator v6_1 = p6.iterator();
        int v0_2 = 0;
        while (v0_2 < p7) {
            this.a[(p5 + v0_2)] = v6_1.next();
            v0_2++;
        }
        return;
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof java.util.List)) {
                int v2 = this.b;
                if (v2 == ((java.util.List) p7).size()) {
                    int v3_0 = 0;
                    while (v3_0 < v2) {
                        if (kotlin.jvm.internal.j.a(this.a[v3_0], ((java.util.List) p7).get(v3_0))) {
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
        this.h(p3, 1);
        this.a[p3] = p4;
        return;
    }

    public final void g()
    {
        if (this.c) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final Object get(int p5)
    {
        Object[] v0_0 = this.b;
        if ((p5 < null) || (p5 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_0, ", size: "));
        } else {
            return this.a[p5];
        }
    }

    public final void h(int p6, int p7)
    {
        Object[] v0_1 = (this.b + p7);
        if (v0_1 < null) {
            throw new OutOfMemoryError();
        } else {
            String v1_2 = this.a;
            if (v0_1 > v1_2.length) {
                int v2_3 = v1_2.length;
                int v2_0 = (v2_3 + (v2_3 >> 1));
                if ((v2_0 - v0_1) < 0) {
                    v2_0 = v0_1;
                }
                if ((v2_0 - 2147483639) > 0) {
                    if (v0_1 <= 2147483639) {
                        v2_0 = 2147483639;
                    } else {
                        v2_0 = 2147483647;
                    }
                }
                Object[] v0_2 = java.util.Arrays.copyOf(v1_2, v2_0);
                kotlin.jvm.internal.j.d(v0_2, "copyOf(...)");
                this.a = v0_2;
            }
            i7.h.Z(this.a, (p6 + p7), this.a, p6, this.b);
            this.b = (this.b + p7);
            return;
        }
    }

    public final int hashCode()
    {
        Object[] v0 = this.a;
        int v1 = this.b;
        int v2_0 = 1;
        int v4 = 0;
        while (v4 < v1) {
            int v5_0;
            int v5_1 = v0[v4];
            int v2_1 = (v2_0 * 31);
            if (v5_1 == 0) {
                v5_0 = 0;
            } else {
                v5_0 = v5_1.hashCode();
            }
            v2_0 = (v2_1 + v5_0);
            v4++;
        }
        return v2_0;
    }

    public final Object i(int p5)
    {
        this.modCount = (this.modCount + 1);
        int v0_3 = this.a;
        Object v1 = v0_3[p5];
        i7.h.Z(v0_3, p5, v0_3, (p5 + 1), this.b);
        int v5_3 = this.a;
        int v0_2 = (this.b - 1);
        kotlin.jvm.internal.j.e(v5_3, "<this>");
        v5_3[v0_2] = 0;
        this.b = (this.b - 1);
        return v1;
    }

    public final int indexOf(Object p3)
    {
        int v0 = 0;
        while (v0 < this.b) {
            if (!kotlin.jvm.internal.j.a(this.a[v0], p3)) {
                v0++;
            } else {
                return v0;
            }
        }
        return -1;
    }

    public final boolean isEmpty()
    {
        if (this.b != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Iterator iterator()
    {
        return this.listIterator(0);
    }

    public final void j(int p4, int p5)
    {
        if (p5 > 0) {
            this.modCount = (this.modCount + 1);
        }
        i7.h.Z(this.a, p4, this.a, (p4 + p5), this.b);
        int v0_3 = this.b;
        j5.t1.O(this.a, (v0_3 - p5), v0_3);
        this.b = (this.b - p5);
        return;
    }

    public final int k(int p6, int p7, java.util.Collection p8, boolean p9)
    {
        int v0_0 = 0;
        int v1_0 = 0;
        while (v0_0 < p7) {
            Object v3_0 = (p6 + v0_0);
            if (p8.contains(this.a[v3_0]) != p9) {
                v0_0++;
            } else {
                Object[] v2_3 = this.a;
                int v4 = (v1_0 + 1);
                v0_0++;
                v2_3[(v1_0 + p6)] = v2_3[v3_0];
                v1_0 = v4;
            }
        }
        int v8_1 = (p7 - v1_0);
        i7.h.Z(this.a, (p6 + v1_0), this.a, (p7 + p6), this.b);
        int v7_1 = this.b;
        j5.t1.O(this.a, (v7_1 - v8_1), v7_1);
        if (v8_1 > 0) {
            this.modCount = (this.modCount + 1);
        }
        this.b = (this.b - v8_1);
        return v8_1;
    }

    public final int lastIndexOf(Object p3)
    {
        int v0_1 = (this.b - 1);
        while (v0_1 >= 0) {
            if (!kotlin.jvm.internal.j.a(this.a[v0_1], p3)) {
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
        j7.a v0_0 = this.b;
        if ((p5 < null) || (p5 > v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p5, v0_0, ", size: "));
        } else {
            return new j7.a(this, p5);
        }
    }

    public final boolean remove(Object p1)
    {
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

    public final boolean removeAll(java.util.Collection p3)
    {
        kotlin.jvm.internal.j.e(p3, "elements");
        this.g();
        if (this.k(0, this.b, p3, 0) <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean retainAll(java.util.Collection p4)
    {
        kotlin.jvm.internal.j.e(p4, "elements");
        this.g();
        if (this.k(0, this.b, p4, 1) <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object set(int p4, Object p5)
    {
        this.g();
        Object[] v0_0 = this.b;
        if ((p4 < null) || (p4 >= v0_0)) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", p4, v0_0, ", size: "));
        } else {
            Object[] v0_1 = this.a;
            Object v1_0 = v0_1[p4];
            v0_1[p4] = p5;
            return v1_0;
        }
    }

    public final java.util.List subList(int p8, int p9)
    {
        j5.t1.e(p8, p9, this.b);
        return new j7.b(this.a, p8, (p9 - p8), 0, this);
    }

    public final Object[] toArray()
    {
        return i7.h.c0(this.a, 0, this.b);
    }

    public final Object[] toArray(Object[] p4)
    {
        kotlin.jvm.internal.j.e(p4, "array");
        int v1_1 = this.b;
        if (p4.length >= v1_1) {
            i7.h.Z(this.a, 0, p4, 0, v1_1);
            int v0_5 = this.b;
            if (v0_5 < p4.length) {
                p4[v0_5] = 0;
            }
            return p4;
        } else {
            Object[] v4_2 = java.util.Arrays.copyOfRange(this.a, 0, v1_1, p4.getClass());
            kotlin.jvm.internal.j.d(v4_2, "copyOfRange(...)");
            return v4_2;
        }
    }

    public final String toString()
    {
        return j5.t1.a(this.a, 0, this.b, this);
    }
}
