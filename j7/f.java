package j7;
public final class f implements java.util.Map, java.io.Serializable, v7.b {
    public static final j7.f t;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int m;
    public int n;
    public int o;
    public j7.g p;
    public j7.h q;
    public j7.g r;
    public boolean s;

    static f()
    {
        j7.f v0_1 = new j7.f(0);
        v0_1.s = 1;
        j7.f.t = v0_1;
        return;
    }

    public f(int p5)
    {
        if (p5 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        } else {
            int v0_4 = new Object[p5];
            int[] v1 = new int[p5];
            if (p5 < 1) {
                p5 = 1;
            }
            int v5_3 = Integer.highestOneBit((p5 * 3));
            int[] v3 = new int[v5_3];
            this.a = v0_4;
            this.b = 0;
            this.c = v1;
            this.d = v3;
            this.e = 2;
            this.f = 0;
            this.m = (Integer.numberOfLeadingZeros(v5_3) + 1);
            return;
        }
    }

    public final int b(Object p8)
    {
        this.c();
        while(true) {
            int v0_0 = this.j(p8);
            int v1_2 = (this.e * 2);
            int v2_3 = (this.d.length / 2);
            if (v1_2 > v2_3) {
                v1_2 = v2_3;
            }
            int v2_0 = 0;
            while(true) {
                int v3_0 = this.d;
                Object[] v4_0 = v3_0[v0_0];
                if (v4_0 <= null) {
                    break;
                }
                if (!kotlin.jvm.internal.j.a(this.a[(v4_0 - 1)], p8)) {
                    v2_0++;
                    if (v2_0 <= v1_2) {
                        if (v0_0 != 0) {
                            v0_0--;
                        } else {
                            v0_0 = (this.d.length - 1);
                        }
                    } else {
                        this.k((this.d.length * 2));
                    }
                } else {
                    return (- v4_0);
                }
            }
            int v1_1 = this.f;
            Object[] v4_1 = this.a;
            if (v1_1 < v4_1.length) {
                break;
            }
            this.g(1);
        }
        int v6_2 = (v1_1 + 1);
        this.f = v6_2;
        v4_1[v1_1] = p8;
        this.c[v1_1] = v0_0;
        v3_0[v0_0] = v6_2;
        this.o = (this.o + 1);
        this.n = (this.n + 1);
        if (v2_0 > this.e) {
            this.e = v2_0;
        }
        return v1_1;
    }

    public final void c()
    {
        if (this.s) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        this.c();
        int v0_3 = (this.f - 1);
        if (v0_3 >= 0) {
            int v2_2 = 0;
            while(true) {
                int[] v3 = this.c;
                int v4_1 = v3[v2_2];
                if (v4_1 >= 0) {
                    this.d[v4_1] = 0;
                    v3[v2_2] = -1;
                }
                if (v2_2 == v0_3) {
                    break;
                }
                v2_2++;
            }
        }
        j5.t1.O(this.a, 0, this.f);
        int v0_2 = this.b;
        if (v0_2 != 0) {
            j5.t1.O(v0_2, 0, this.f);
        }
        this.o = 0;
        this.f = 0;
        this.n = (this.n + 1);
        return;
    }

    public final boolean containsKey(Object p1)
    {
        if (this.h(p1) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean containsValue(Object p1)
    {
        if (this.i(p1) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(boolean p8)
    {
        Object[] v0 = this.b;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int[] v3_2 = this.f;
            if (v1 >= v3_2) {
                break;
            }
            int[] v3_0 = this.c;
            int v4 = v3_0[v1];
            if (v4 >= 0) {
                int v5_0 = this.a;
                v5_0[v2] = v5_0[v1];
                if (v0 != null) {
                    v0[v2] = v0[v1];
                }
                if (p8 != 0) {
                    v3_0[v2] = v4;
                    this.d[v4] = (v2 + 1);
                }
                v2++;
            }
            v1++;
        }
        j5.t1.O(this.a, v2, v3_2);
        if (v0 != null) {
            j5.t1.O(v0, v2, this.f);
        }
        this.f = v2;
        return;
    }

    public final boolean e(java.util.Collection p3)
    {
        kotlin.jvm.internal.j.e(p3, "m");
        int v3_1 = p3.iterator();
        while (v3_1.hasNext()) {
            boolean v0_1 = v3_1.next();
            try {
                if (v0_1) {
                    if (!this.f(((java.util.Map$Entry) v0_1))) {
                    }
                }
                return 0;
            } catch (ClassCastException) {
                return 0;
            }
        }
        return 1;
    }

    public final java.util.Set entrySet()
    {
        j7.g v0_0 = this.r;
        if (v0_0 == null) {
            v0_0 = new j7.g(this, 0);
            this.r = v0_0;
        }
        return v0_0;
    }

    public final boolean equals(Object p3)
    {
        if ((p3 != this) && ((!(p3 instanceof java.util.Map)) || ((this.o != ((java.util.Map) p3).size()) || (!this.e(((java.util.Map) p3).entrySet()))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean f(java.util.Map$Entry p3)
    {
        kotlin.jvm.internal.j.e(p3, "entry");
        Object v0_2 = this.h(p3.getKey());
        if (v0_2 >= null) {
            Object[] v1 = this.b;
            kotlin.jvm.internal.j.b(v1);
            return kotlin.jvm.internal.j.a(v1[v0_2], p3.getValue());
        } else {
            return 0;
        }
    }

    public final void g(int p6)
    {
        int v0_0 = this.a;
        int v2_1 = this.f;
        String v1_6 = (v0_0.length - v2_1);
        int v3_2 = (v2_1 - this.o);
        int v4_0 = 1;
        if ((v1_6 >= p6) || (((v1_6 + v3_2) < p6) || (v3_2 < (v0_0.length / 4)))) {
            int v2_0 = (v2_1 + p6);
            if (v2_0 < 0) {
                throw new OutOfMemoryError();
            } else {
                if (v2_0 > v0_0.length) {
                    int v6_4 = v0_0.length;
                    int v6_5 = (v6_4 + (v6_4 >> 1));
                    if ((v6_5 - v2_0) < 0) {
                        v6_5 = v2_0;
                    }
                    if ((v6_5 - 2147483639) > 0) {
                        if (v2_0 <= 2147483639) {
                            v6_5 = 2147483639;
                        } else {
                            v6_5 = 2147483647;
                        }
                    }
                    int v0_3;
                    int v0_1 = java.util.Arrays.copyOf(v0_0, v6_5);
                    kotlin.jvm.internal.j.d(v0_1, "copyOf(...)");
                    this.a = v0_1;
                    int v0_2 = this.b;
                    if (v0_2 == 0) {
                        v0_3 = 0;
                    } else {
                        v0_3 = java.util.Arrays.copyOf(v0_2, v6_5);
                        kotlin.jvm.internal.j.d(v0_3, "copyOf(...)");
                    }
                    this.b = v0_3;
                    int v0_5 = java.util.Arrays.copyOf(this.c, v6_5);
                    kotlin.jvm.internal.j.d(v0_5, "copyOf(...)");
                    this.c = v0_5;
                    if (v6_5 >= 1) {
                        v4_0 = v6_5;
                    }
                    int v6_6 = Integer.highestOneBit((v4_0 * 3));
                    if (v6_6 > this.d.length) {
                        this.k(v6_6);
                    }
                }
                return;
            }
        } else {
            this.d(1);
            return;
        }
    }

    public final Object get(Object p2)
    {
        Object v2_1 = this.h(p2);
        if (v2_1 >= null) {
            Object[] v0 = this.b;
            kotlin.jvm.internal.j.b(v0);
            return v0[v2_1];
        } else {
            return 0;
        }
    }

    public final int h(Object p6)
    {
        int v0_0 = this.j(p6);
        int v1 = this.e;
        while(true) {
            int v2_2 = this.d[v0_0];
            if (v2_2 != 0) {
                if (v2_2 > 0) {
                    int v2_3 = (v2_2 - 1);
                    if (kotlin.jvm.internal.j.a(this.a[v2_3], p6)) {
                        return v2_3;
                    }
                }
                v1 += -1;
                if (v1 < 0) {
                    break;
                }
                if (v0_0 != 0) {
                    v0_0--;
                } else {
                    v0_0 = (this.d.length - 1);
                }
            } else {
                return -1;
            }
        }
        return -1;
    }

    public final int hashCode()
    {
        java.util.NoSuchElementException v0_3 = new j7.d(this, 0);
        int v2 = 0;
        while (v0_3.hasNext()) {
            int v3_4 = v0_3.a;
            int v4_0 = ((j7.f) v0_3.d);
            if (v3_4 >= v4_0.f) {
                throw new java.util.NoSuchElementException();
            } else {
                int v3_1;
                v0_3.a = (v3_4 + 1);
                v0_3.b = v3_4;
                int v3_0 = v4_0.a[v3_4];
                if (v3_0 == 0) {
                    v3_1 = 0;
                } else {
                    v3_1 = v3_0.hashCode();
                }
                int v4_3;
                int v4_1 = v4_0.b;
                kotlin.jvm.internal.j.b(v4_1);
                int v4_2 = v4_1[v0_3.b];
                if (v4_2 == 0) {
                    v4_3 = 0;
                } else {
                    v4_3 = v4_2.hashCode();
                }
                int v3_2 = (v3_1 ^ v4_3);
                v0_3.f();
                v2 += v3_2;
            }
        }
        return v2;
    }

    public final int i(Object p3)
    {
        int v0 = this.f;
        do {
            v0 += -1;
            if (v0 < 0) {
                return -1;
            } else {
                if (this.c[v0] >= 0) {
                    boolean v1_5 = this.b;
                    kotlin.jvm.internal.j.b(v1_5);
                }
            }
        } while(!kotlin.jvm.internal.j.a(v1_5[v0], p3));
        return v0;
    }

    public final boolean isEmpty()
    {
        if (this.o != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int j(Object p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = p2.hashCode();
        }
        return ((v2_1 * -1640531527) >> this.m);
    }

    public final void k(int p6)
    {
        this.n = (this.n + 1);
        int v2 = 0;
        if (this.f > this.o) {
            this.d(0);
        }
        int v0_8 = new int[p6];
        this.d = v0_8;
        this.m = (Integer.numberOfLeadingZeros(p6) + 1);
        while (v2 < this.f) {
            IllegalStateException v6_4 = (v2 + 1);
            int v0_4 = this.j(this.a[v2]);
            int v1_0 = this.e;
            while(true) {
                int[] v3 = this.d;
                if (v3[v0_4] != 0) {
                    v1_0--;
                    if (v1_0 < 0) {
                        break;
                    }
                    if (v0_4 != 0) {
                        v0_4--;
                    } else {
                        v0_4 = (v3.length - 1);
                    }
                } else {
                    v3[v0_4] = v6_4;
                    this.c[v2] = v0_4;
                    v2 = v6_4;
                }
            }
            throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        }
        return;
    }

    public final java.util.Set keySet()
    {
        j7.g v0_0 = this.p;
        if (v0_0 == null) {
            v0_0 = new j7.g(this, 1);
            this.p = v0_0;
        }
        return v0_0;
    }

    public final void l(int p12)
    {
        int[] v0_0 = this.a;
        kotlin.jvm.internal.j.e(v0_0, "<this>");
        v0_0[p12] = 0;
        int[] v0_4 = this.b;
        if (v0_4 != null) {
            v0_4[p12] = 0;
        }
        int[] v0_1 = this.c[p12];
        int[] v1_2 = (this.e * 2);
        int v2_2 = (this.d.length / 2);
        if (v1_2 > v2_2) {
            v1_2 = v2_2;
        }
        int v3 = v1_2;
        int[] v4_0 = 0;
        int[] v1_3 = v0_1;
        do {
            if (v0_1 != null) {
                v0_1--;
            } else {
                v0_1 = (this.d.length - 1);
            }
            v4_0++;
            if (v4_0 <= this.e) {
                int v5_2 = this.d;
                int v7 = v5_2[v0_1];
                if (v7 != 0) {
                    if (v7 >= 0) {
                        int v8 = (v7 - 1);
                        int[] v9 = this.d;
                        if (((this.j(this.a[v8]) - v0_1) & (v9.length - 1)) >= v4_0) {
                            v9[v1_3] = v7;
                            this.c[v8] = v1_3;
                            v1_3 = v0_1;
                            v4_0 = 0;
                        }
                    } else {
                        v5_2[v1_3] = -1;
                    }
                    v3 += -1;
                } else {
                    v5_2[v1_3] = 0;
                }
            } else {
                this.d[v1_3] = 0;
            }
            this.c[p12] = -1;
            this.o = (this.o + -1);
            this.n = (this.n + 1);
            return;
        } while(v3 >= 0);
        this.d[v1_3] = -1;
        this.c[p12] = -1;
        this.o = (this.o + -1);
        this.n = (this.n + 1);
        return;
    }

    public final Object put(Object p3, Object p4)
    {
        this.c();
        int v3_5 = this.b(p3);
        Object[] v0_0 = this.b;
        if (v0_0 == null) {
            Object[] v0_2 = this.a.length;
            if (v0_2 < null) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            } else {
                v0_0 = new Object[v0_2];
                this.b = v0_0;
            }
        }
        if (v3_5 >= 0) {
            v0_0[v3_5] = p4;
            return 0;
        } else {
            int v3_4 = ((- v3_5) - 1);
            Object v1 = v0_0[v3_4];
            v0_0[v3_4] = p4;
            return v1;
        }
    }

    public final void putAll(java.util.Map p6)
    {
        kotlin.jvm.internal.j.e(p6, "from");
        this.c();
        IllegalArgumentException v6_4 = p6.entrySet();
        if (!v6_4.isEmpty()) {
            this.g(v6_4.size());
            IllegalArgumentException v6_1 = v6_4.iterator();
            while (v6_1.hasNext()) {
                Object v0_3 = ((java.util.Map$Entry) v6_1.next());
                int v1_1 = this.b(v0_3.getKey());
                Object[] v2_0 = this.b;
                if (v2_0 == null) {
                    Object[] v2_2 = this.a.length;
                    if (v2_2 < null) {
                        throw new IllegalArgumentException("capacity must be non-negative.");
                    } else {
                        v2_0 = new Object[v2_2];
                        this.b = v2_0;
                    }
                }
                if (v1_1 < 0) {
                    int v1_3 = ((- v1_1) - 1);
                    if (!kotlin.jvm.internal.j.a(v0_3.getValue(), v2_0[v1_3])) {
                        v2_0[v1_3] = v0_3.getValue();
                    }
                } else {
                    v2_0[v1_1] = v0_3.getValue();
                }
            }
        }
        return;
    }

    public final Object remove(Object p2)
    {
        this.c();
        int v2_1 = this.h(p2);
        if (v2_1 >= 0) {
            Object v0_0 = this.b;
            kotlin.jvm.internal.j.b(v0_0);
            Object v0_1 = v0_0[v2_1];
            this.l(v2_1);
            return v0_1;
        } else {
            return 0;
        }
    }

    public final int size()
    {
        return this.o;
    }

    public final String toString()
    {
        java.util.NoSuchElementException v0_4 = new StringBuilder(((this.o * 3) + 2));
        v0_4.append("{");
        int v2 = 0;
        String v1_7 = new j7.d(this, 0);
        while (v1_7.hasNext()) {
            if (v2 > 0) {
                v0_4.append(", ");
            }
            Object v3_2 = v1_7.a;
            j7.f v4_1 = ((j7.f) v1_7.d);
            if (v3_2 >= v4_1.f) {
                throw new java.util.NoSuchElementException();
            } else {
                v1_7.a = (v3_2 + 1);
                v1_7.b = v3_2;
                Object v3_3 = v4_1.a[v3_2];
                if (v3_3 != v4_1) {
                    v0_4.append(v3_3);
                } else {
                    v0_4.append("(this Map)");
                }
                v0_4.append(61);
                Object v3_5 = v4_1.b;
                kotlin.jvm.internal.j.b(v3_5);
                Object v3_6 = v3_5[v1_7.b];
                if (v3_6 != v4_1) {
                    v0_4.append(v3_6);
                } else {
                    v0_4.append("(this Map)");
                }
                v1_7.f();
                v2++;
            }
        }
        v0_4.append("}");
        java.util.NoSuchElementException v0_1 = v0_4.toString();
        kotlin.jvm.internal.j.d(v0_1, "toString(...)");
        return v0_1;
    }

    public final java.util.Collection values()
    {
        j7.h v0_0 = this.q;
        if (v0_0 == null) {
            v0_0 = new j7.h(this);
            this.q = v0_0;
        }
        return v0_0;
    }
}
