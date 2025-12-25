package r;
public final class f implements java.util.Collection, java.util.Set, v7.a {
    public int[] a;
    public Object[] b;
    public int c;

    public f(int p2)
    {
        this.a = s.a.a;
        this.b = s.a.b;
        if (p2 > 0) {
            r.h.a(this, p2);
        }
        return;
    }

    public final boolean add(Object p10)
    {
        int v2_1;
        int v3_0;
        Object[] v0_0 = this.c;
        if (p10 != 0) {
            int v2_3 = p10.hashCode();
            v3_0 = v2_3;
            v2_1 = r.h.b(this, p10, v2_3);
        } else {
            v2_1 = r.h.b(this, 0, 0);
            v3_0 = 0;
        }
        if (v2_1 < 0) {
            int v2_2 = (~ v2_1);
            Object[] v4_0 = this.a;
            if (v0_0 >= v4_0.length) {
                int v5_1 = 8;
                if (v0_0 < 8) {
                    if (v0_0 < 4) {
                        v5_1 = 4;
                    }
                } else {
                    v5_1 = ((v0_0 >> 1) + v0_0);
                }
                Object[] v6_1 = this.b;
                int v7_0 = new int[v5_1];
                this.a = v7_0;
                int v5_3 = new Object[v5_1];
                this.b = v5_3;
                if (v0_0 != this.c) {
                    throw new java.util.ConcurrentModificationException();
                } else {
                    if (v7_0.length != 0) {
                        i7.h.X(0, 0, v4_0.length, v4_0, v7_0);
                        i7.h.a0(v6_1, 0, this.b, v6_1.length, 6);
                    }
                }
            }
            if (v2_2 < v0_0) {
                Object[] v4_2 = (v2_2 + 1);
                i7.h.X(v4_2, v2_2, v0_0, this.a, this.a);
                i7.h.Z(this.b, v4_2, this.b, v2_2, v0_0);
            }
            int v1_3 = this.c;
            if (v0_0 == v1_3) {
                Object[] v0_1 = this.a;
                if (v2_2 < v0_1.length) {
                    v0_1[v2_2] = v3_0;
                    this.b[v2_2] = p10;
                    this.c = (v1_3 + 1);
                    return 1;
                }
            }
            throw new java.util.ConcurrentModificationException();
        } else {
            return 0;
        }
    }

    public final boolean addAll(java.util.Collection p7)
    {
        kotlin.jvm.internal.j.e(p7, "elements");
        Object[] v1_4 = (p7.size() + this.c);
        boolean v0_5 = this.c;
        int v2_1 = this.a;
        int v4 = 0;
        if (v2_1.length < v1_4) {
            Object[] v3_0 = this.b;
            int v5_0 = new int[v1_4];
            this.a = v5_0;
            Object[] v1_0 = new Object[v1_4];
            this.b = v1_0;
            if (v0_5) {
                i7.h.X(0, 0, v0_5, v2_1, v5_0);
                i7.h.a0(v3_0, 0, this.b, this.c, 6);
            }
        }
        if (this.c != v0_5) {
            throw new java.util.ConcurrentModificationException();
        } else {
            java.util.ConcurrentModificationException v7_3 = p7.iterator();
            while (v7_3.hasNext()) {
                v4 |= this.add(v7_3.next());
            }
            return v4;
        }
    }

    public final Object b(int p9)
    {
        int v0 = this.c;
        int v1_0 = this.b;
        Object v2 = v1_0[p9];
        if (v0 > 1) {
            int v3_1 = (v0 - 1);
            Object[] v4_2 = this.a;
            int v6_0 = 8;
            if ((v4_2.length <= 8) || (v0 >= (v4_2.length / 3))) {
                if (p9 < v3_1) {
                    int v1_1 = (p9 + 1);
                    i7.h.X(p9, v1_1, v0, v4_2, v4_2);
                    i7.h.Z(this.b, p9, this.b, v1_1, v0);
                }
                this.b[v3_1] = 0;
            } else {
                if (v0 > 8) {
                    v6_0 = (v0 + (v0 >> 1));
                }
                int[] v5_3 = new int[v6_0];
                this.a = v5_3;
                int v6_1 = new Object[v6_0];
                this.b = v6_1;
                if (p9 > null) {
                    i7.h.X(0, 0, p9, v4_2, v5_3);
                    i7.h.a0(v1_0, 0, this.b, p9, 6);
                }
                if (p9 < v3_1) {
                    int v6_3 = (p9 + 1);
                    i7.h.X(p9, v6_3, v0, v4_2, this.a);
                    i7.h.Z(v1_0, p9, this.b, v6_3, v0);
                }
            }
            if (v0 != this.c) {
                throw new java.util.ConcurrentModificationException();
            } else {
                this.c = v3_1;
                return v2;
            }
        } else {
            this.clear();
            return v2;
        }
    }

    public final void clear()
    {
        if (this.c != 0) {
            this.a = s.a.a;
            this.b = s.a.b;
            this.c = 0;
        }
        if (this.c != 0) {
            throw new java.util.ConcurrentModificationException();
        } else {
            return;
        }
    }

    public final boolean contains(Object p3)
    {
        int v3_2;
        if (p3 != 0) {
            v3_2 = r.h.b(this, p3, p3.hashCode());
        } else {
            v3_2 = r.h.b(this, 0, 0);
        }
        if (v3_2 < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean containsAll(java.util.Collection p2)
    {
        kotlin.jvm.internal.j.e(p2, "elements");
        int v2_2 = p2.iterator();
        while (v2_2.hasNext()) {
            if (!this.contains(v2_2.next())) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            try {
                if (!(p7 instanceof java.util.Set)) {
                    return 0;
                } else {
                    if (this.c == ((java.util.Set) p7).size()) {
                        int v3_0 = 0;
                        while (v3_0 < this.c) {
                            if (((java.util.Set) p7).contains(this.b[v3_0])) {
                                v3_0++;
                            } else {
                                return 0;
                            }
                        }
                        return 1;
                    } else {
                        return 0;
                    }
                }
            } catch (ClassCastException) {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v2 = 0;
        int v3 = 0;
        while (v2 < this.c) {
            v3 += this.a[v2];
            v2++;
        }
        return v3;
    }

    public final boolean isEmpty()
    {
        if (this.c > 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Iterator iterator()
    {
        return new r.a(this);
    }

    public final boolean remove(Object p3)
    {
        int v3_2;
        if (p3 != 0) {
            v3_2 = r.h.b(this, p3, p3.hashCode());
        } else {
            v3_2 = r.h.b(this, 0, 0);
        }
        if (v3_2 < 0) {
            return 0;
        } else {
            this.b(v3_2);
            return 1;
        }
    }

    public final boolean removeAll(java.util.Collection p3)
    {
        kotlin.jvm.internal.j.e(p3, "elements");
        java.util.Iterator v3_1 = p3.iterator();
        int v0_1 = 0;
        while (v3_1.hasNext()) {
            v0_1 |= this.remove(v3_1.next());
        }
        return v0_1;
    }

    public final boolean retainAll(java.util.Collection p5)
    {
        kotlin.jvm.internal.j.e(p5, "elements");
        int v0_1 = (this.c - 1);
        int v2 = 0;
        while (-1 < v0_1) {
            if (!i7.i.Z(p5, this.b[v0_1])) {
                this.b(v0_1);
                v2 = 1;
            }
            v0_1--;
        }
        return v2;
    }

    public final int size()
    {
        return this.c;
    }

    public final Object[] toArray()
    {
        return i7.h.c0(this.b, 0, this.c);
    }

    public final Object[] toArray(Object[] p4)
    {
        kotlin.jvm.internal.j.e(p4, "array");
        Object[] v0_2 = this.c;
        if (p4.length >= v0_2) {
            if (p4.length > v0_2) {
                p4[v0_2] = 0;
            }
        } else {
            p4 = ((Object[]) reflect.Array.newInstance(p4.getClass().getComponentType(), v0_2));
        }
        i7.h.Z(this.b, 0, p4, 0, this.c);
        return p4;
    }

    public final String toString()
    {
        if (!this.isEmpty()) {
            String v1_2 = new StringBuilder((this.c * 14));
            v1_2.append(123);
            String v0_7 = this.c;
            int v2 = 0;
            while (v2 < v0_7) {
                if (v2 > 0) {
                    v1_2.append(", ");
                }
                String v3_2 = this.b[v2];
                if (v3_2 == this) {
                    v1_2.append("(this Set)");
                } else {
                    v1_2.append(v3_2);
                }
                v2++;
            }
            v1_2.append(125);
            String v0_2 = v1_2.toString();
            kotlin.jvm.internal.j.d(v0_2, "toString(...)");
            return v0_2;
        } else {
            return "{}";
        }
    }
}
