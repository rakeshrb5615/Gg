package r;
public class j {
    public int[] a;
    public Object[] b;
    public int c;

    public j(int p2)
    {
        int[] v0;
        if (p2 != null) {
            v0 = new int[p2];
        } else {
            v0 = s.a.a;
        }
        Object[] v2_2;
        this.a = v0;
        if (p2 != null) {
            v2_2 = new Object[(p2 << 1)];
        } else {
            v2_2 = s.a.b;
        }
        this.b = v2_2;
        return;
    }

    public final int b(Object p6)
    {
        int v0_1 = (this.c * 2);
        Object[] v1 = this.b;
        if (p6 != 0) {
            int v3_0 = 1;
            while (v3_0 < v0_1) {
                if (!p6.equals(v1[v3_0])) {
                    v3_0 += 2;
                } else {
                    return (v3_0 >> 1);
                }
            }
        } else {
            int v6_2 = 1;
            while (v6_2 < v0_1) {
                if (v1[v6_2] != null) {
                    v6_2 += 2;
                } else {
                    return (v6_2 >> 1);
                }
            }
        }
        return -1;
    }

    public final void c(int p4)
    {
        int v0 = this.c;
        Object[] v1_0 = this.a;
        if (v1_0.length < p4) {
            Object[] v1_1 = java.util.Arrays.copyOf(v1_0, p4);
            kotlin.jvm.internal.j.d(v1_1, "copyOf(...)");
            this.a = v1_1;
            java.util.ConcurrentModificationException v4_2 = java.util.Arrays.copyOf(this.b, (p4 * 2));
            kotlin.jvm.internal.j.d(v4_2, "copyOf(...)");
            this.b = v4_2;
        }
        if (this.c != v0) {
            throw new java.util.ConcurrentModificationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        if (this.c > 0) {
            this.a = s.a.a;
            this.b = s.a.b;
            this.c = 0;
        }
        if (this.c > 0) {
            throw new java.util.ConcurrentModificationException();
        } else {
            return;
        }
    }

    public boolean containsKey(Object p1)
    {
        if (this.e(p1) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean containsValue(Object p1)
    {
        if (this.b(p1) < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int d(int p6, Object p7)
    {
        boolean v0_0 = this.c;
        if (v0_0) {
            int v1_2 = s.a.a(v0_0, p6, this.a);
            if ((v1_2 >= 0) && (!kotlin.jvm.internal.j.a(p7, this.b[(v1_2 << 1)]))) {
                int v2_1 = (v1_2 + 1);
                while ((v2_1 < v0_0) && (this.a[v2_1] == p6)) {
                    if (!kotlin.jvm.internal.j.a(p7, this.b[(v2_1 << 1)])) {
                        v2_1++;
                    } else {
                        return v2_1;
                    }
                }
                int v1_0 = (v1_2 - 1);
                while ((v1_0 >= 0) && (this.a[v1_0] == p6)) {
                    if (!kotlin.jvm.internal.j.a(p7, this.b[(v1_0 << 1)])) {
                        v1_0--;
                    } else {
                        return v1_0;
                    }
                }
                return (~ v2_1);
            } else {
                return v1_2;
            }
        } else {
            return -1;
        }
    }

    public final int e(Object p2)
    {
        if (p2 != 0) {
            return this.d(p2.hashCode(), p2);
        } else {
            return this.f();
        }
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            try {
                if (!(p8 instanceof r.j)) {
                    if (!(p8 instanceof java.util.Map)) {
                        return 0;
                    } else {
                        if (this.c == ((java.util.Map) p8).size()) {
                            int v2_0 = this.c;
                            int v3_1 = 0;
                            while (v3_1 < v2_0) {
                                boolean v4_0 = this.g(v3_1);
                                java.util.Map v5_0 = this.j(v3_1);
                                Object v6_2 = ((java.util.Map) p8).get(v4_0);
                                if (v5_0 != null) {
                                    if (!v5_0.equals(v6_2)) {
                                        return 0;
                                    }
                                } else {
                                    if ((v6_2 != null) || (!((java.util.Map) p8).containsKey(v4_0))) {
                                        return 0;
                                    }
                                }
                                v3_1++;
                            }
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                } else {
                    int v2_2 = this.c;
                    if (v2_2 == ((r.j) p8).c) {
                        int v3_5 = 0;
                        while (v3_5 < v2_2) {
                            boolean v4_3 = this.g(v3_5);
                            java.util.Map v5_3 = this.j(v3_5);
                            Object v6_3 = ((r.j) p8).get(v4_3);
                            if (v5_3 != null) {
                                if (!v5_3.equals(v6_3)) {
                                    return 0;
                                }
                            } else {
                                if ((v6_3 != null) || (!((r.j) p8).containsKey(v4_3))) {
                                    return 0;
                                }
                            }
                            v3_5++;
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

    public final int f()
    {
        Object v0_0 = this.c;
        if (v0_0 != null) {
            int v1_2 = s.a.a(v0_0, 0, this.a);
            if ((v1_2 >= 0) && (this.b[(v1_2 << 1)] != null)) {
                int v2_0 = (v1_2 + 1);
                while ((v2_0 < v0_0) && (this.a[v2_0] == 0)) {
                    if (this.b[(v2_0 << 1)] != null) {
                        v2_0++;
                    } else {
                        return v2_0;
                    }
                }
                int v1_0 = (v1_2 - 1);
                while ((v1_0 >= 0) && (this.a[v1_0] == 0)) {
                    if (this.b[(v1_0 << 1)] != null) {
                        v1_0--;
                    } else {
                        return v1_0;
                    }
                }
                return (~ v2_0);
            } else {
                return v1_2;
            }
        } else {
            return -1;
        }
    }

    public final Object g(int p4)
    {
        StringBuilder v0_0 = 0;
        if ((p4 >= 0) && (p4 < this.c)) {
            v0_0 = 1;
        }
        if (v0_0 == null) {
            StringBuilder v0_3 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
            v0_3.append(p4);
            s.a.c(v0_3.toString());
            throw 0;
        } else {
            return this.b[(p4 << 1)];
        }
    }

    public Object get(Object p2)
    {
        int v2_1 = this.e(p2);
        if (v2_1 < 0) {
            return 0;
        } else {
            return this.b[((v2_1 << 1) + 1)];
        }
    }

    public final Object getOrDefault(Object p1, Object p2)
    {
        Object v1_1 = this.e(p1);
        if (v1_1 < null) {
            return p2;
        } else {
            return this.b[((v1_1 << 1) + 1)];
        }
    }

    public final Object h(int p11)
    {
        if (p11 >= null) {
            StringBuilder v1_0 = this.c;
            if (p11 < v1_0) {
                int v2_0 = this.b;
                int v3 = (p11 << 1);
                Object v4_1 = v2_0[(v3 + 1)];
                if (v1_0 > 1) {
                    int v6 = (v1_0 - 1);
                    int v7_0 = this.a;
                    int v9_0 = 8;
                    if ((v7_0.length <= 8) || (v1_0 >= (v7_0.length / 3))) {
                        if (p11 < v6) {
                            int v2_1 = (p11 + 1);
                            i7.h.X(p11, v2_1, v1_0, v7_0, v7_0);
                            i7.h.Z(this.b, v3, this.b, (v2_1 << 1), (v1_0 << 1));
                        }
                        Object[] v11_2 = this.b;
                        int v2_3 = (v6 << 1);
                        v11_2[v2_3] = 0;
                        v11_2[(v2_3 + 1)] = 0;
                    } else {
                        if (v1_0 > 8) {
                            v9_0 = (v1_0 + (v1_0 >> 1));
                        }
                        int v0_2 = java.util.Arrays.copyOf(v7_0, v9_0);
                        kotlin.jvm.internal.j.d(v0_2, "copyOf(...)");
                        this.a = v0_2;
                        int v0_4 = java.util.Arrays.copyOf(this.b, (v9_0 << 1));
                        kotlin.jvm.internal.j.d(v0_4, "copyOf(...)");
                        this.b = v0_4;
                        if (v1_0 != this.c) {
                            throw new java.util.ConcurrentModificationException();
                        } else {
                            if (p11 > null) {
                                i7.h.X(0, 0, p11, v7_0, this.a);
                                i7.h.Z(v2_0, 0, this.b, 0, v3);
                            }
                            if (p11 < v6) {
                                int v8_5 = (p11 + 1);
                                i7.h.X(p11, v8_5, v1_0, v7_0, this.a);
                                i7.h.Z(v2_0, v3, this.b, (v8_5 << 1), (v1_0 << 1));
                            }
                        }
                    }
                    if (v1_0 != this.c) {
                        throw new java.util.ConcurrentModificationException();
                    } else {
                        this.c = v6;
                        return v4_1;
                    }
                } else {
                    this.clear();
                    return v4_1;
                }
            }
        }
        StringBuilder v1_2 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        v1_2.append(p11);
        s.a.c(v1_2.toString());
        throw 0;
    }

    public final int hashCode()
    {
        int[] v0 = this.a;
        Object[] v1 = this.b;
        int v2 = this.c;
        int v4 = 1;
        int v5 = 0;
        int v6 = 0;
        while (v5 < v2) {
            int v7_0;
            int v7_2 = v1[v4];
            int v8 = v0[v5];
            if (v7_2 == 0) {
                v7_0 = 0;
            } else {
                v7_0 = v7_2.hashCode();
            }
            v6 += (v7_0 ^ v8);
            v5++;
            v4 += 2;
        }
        return v6;
    }

    public final Object i(int p4, Object p5)
    {
        String v0_0 = 0;
        if ((p4 >= 0) && (p4 < this.c)) {
            v0_0 = 1;
        }
        if (v0_0 == null) {
            StringBuilder v5_2 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
            v5_2.append(p4);
            s.a.c(v5_2.toString());
            throw 0;
        } else {
            int v4_4 = ((p4 << 1) + 1);
            String v0_1 = this.b;
            Object v1_1 = v0_1[v4_4];
            v0_1[v4_4] = p5;
            return v1_1;
        }
    }

    public final boolean isEmpty()
    {
        if (this.c > 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object j(int p4)
    {
        StringBuilder v0_0 = 0;
        if ((p4 >= 0) && (p4 < this.c)) {
            v0_0 = 1;
        }
        if (v0_0 == null) {
            StringBuilder v0_3 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
            v0_3.append(p4);
            s.a.c(v0_3.toString());
            throw 0;
        } else {
            return this.b[((p4 << 1) + 1)];
        }
    }

    public final Object put(Object p8, Object p9)
    {
        int v1_0;
        Object[] v0_0 = this.c;
        if (p8 == 0) {
            v1_0 = 0;
        } else {
            v1_0 = p8.hashCode();
        }
        int v2_1;
        if (p8 == 0) {
            v2_1 = this.f();
        } else {
            v2_1 = this.d(v1_0, p8);
        }
        if (v2_1 < 0) {
            int v2_0 = (~ v2_1);
            int v3_0 = this.a;
            if (v0_0 >= v3_0.length) {
                int v4_1 = 8;
                if (v0_0 < 8) {
                    if (v0_0 < 4) {
                        v4_1 = 4;
                    }
                } else {
                    v4_1 = ((v0_0 >> 1) + v0_0);
                }
                int v3_1 = java.util.Arrays.copyOf(v3_0, v4_1);
                kotlin.jvm.internal.j.d(v3_1, "copyOf(...)");
                this.a = v3_1;
                int v3_3 = java.util.Arrays.copyOf(this.b, (v4_1 << 1));
                kotlin.jvm.internal.j.d(v3_3, "copyOf(...)");
                this.b = v3_3;
                if (v0_0 != this.c) {
                    throw new java.util.ConcurrentModificationException();
                }
            }
            if (v2_0 < v0_0) {
                int v4_4 = (v2_0 + 1);
                i7.h.X(v4_4, v2_0, v0_0, this.a, this.a);
                i7.h.Z(this.b, (v4_4 << 1), this.b, (v2_0 << 1), (this.c << 1));
            }
            int v3_7 = this.c;
            if (v0_0 == v3_7) {
                Object[] v0_1 = this.a;
                if (v2_0 < v0_1.length) {
                    v0_1[v2_0] = v1_0;
                    Object[] v0_2 = this.b;
                    int v1_1 = (v2_0 << 1);
                    v0_2[v1_1] = p8;
                    v0_2[(v1_1 + 1)] = p9;
                    this.c = (v3_7 + 1);
                    return 0;
                }
            }
            throw new java.util.ConcurrentModificationException();
        } else {
            int v8_7 = ((v2_1 << 1) + 1);
            Object[] v0_3 = this.b;
            int v1_3 = v0_3[v8_7];
            v0_3[v8_7] = p9;
            return v1_3;
        }
    }

    public final Object putIfAbsent(Object p2, Object p3)
    {
        Object v0 = this.get(p2);
        if (v0 != null) {
            return v0;
        } else {
            return this.put(p2, p3);
        }
    }

    public Object remove(Object p1)
    {
        int v1_1 = this.e(p1);
        if (v1_1 < 0) {
            return 0;
        } else {
            return this.h(v1_1);
        }
    }

    public final boolean remove(Object p2, Object p3)
    {
        int v2_1 = this.e(p2);
        if ((v2_1 < 0) || (!kotlin.jvm.internal.j.a(p3, this.j(v2_1)))) {
            return 0;
        } else {
            this.h(v2_1);
            return 1;
        }
    }

    public final Object replace(Object p1, Object p2)
    {
        int v1_1 = this.e(p1);
        if (v1_1 < 0) {
            return 0;
        } else {
            return this.i(v1_1, p2);
        }
    }

    public final boolean replace(Object p2, Object p3, Object p4)
    {
        int v2_1 = this.e(p2);
        if ((v2_1 < 0) || (!kotlin.jvm.internal.j.a(p3, this.j(v2_1)))) {
            return 0;
        } else {
            this.i(v2_1, p4);
            return 1;
        }
    }

    public final int size()
    {
        return this.c;
    }

    public final String toString()
    {
        if (!this.isEmpty()) {
            String v1_2 = new StringBuilder((this.c * 28));
            v1_2.append(123);
            String v0_7 = this.c;
            int v2 = 0;
            while (v2 < v0_7) {
                if (v2 > 0) {
                    v1_2.append(", ");
                }
                Object v3_1 = this.g(v2);
                if (v3_1 == v1_2) {
                    v1_2.append("(this Map)");
                } else {
                    v1_2.append(v3_1);
                }
                v1_2.append(61);
                Object v3_3 = this.j(v2);
                if (v3_3 == v1_2) {
                    v1_2.append("(this Map)");
                } else {
                    v1_2.append(v3_3);
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
