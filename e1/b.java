package e1;
public final class b {
    public final java.util.LinkedHashMap a;
    public final l6.c b;

    public b(java.util.LinkedHashMap p1, boolean p2)
    {
        this.a = p1;
        this.b = new l6.c(p2);
        return;
    }

    public synthetic b(boolean p2)
    {
        this(new java.util.LinkedHashMap(), p2);
        return;
    }

    public final java.util.Map a()
    {
        java.util.Map v0_3 = this.a.entrySet();
        Object v1_0 = i7.r.l0(i7.j.X(v0_3, 10));
        if (v1_0 < 16) {
            v1_0 = 16;
        }
        java.util.LinkedHashMap v2_1 = new java.util.LinkedHashMap(v1_0);
        java.util.Map v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            h7.f v4_2;
            Object v1_4 = ((java.util.Map$Entry) v0_1.next());
            Object v3_0 = v1_4.getValue();
            if (!(v3_0 instanceof byte[])) {
                v4_2 = new h7.f(v1_4.getKey(), v1_4.getValue());
            } else {
                Object v1_7 = v1_4.getKey();
                Object v3_2 = ((byte[]) v3_0);
                Object v3_3 = java.util.Arrays.copyOf(v3_2, v3_2.length);
                kotlin.jvm.internal.j.d(v3_3, "copyOf(this, size)");
                v4_2 = new h7.f(v1_7, v3_3);
            }
            v2_1.put(v4_2.a, v4_2.b);
        }
        java.util.Map v0_2 = java.util.Collections.unmodifiableMap(v2_1);
        kotlin.jvm.internal.j.d(v0_2, "unmodifiableMap(map)");
        return v0_2;
    }

    public final void b()
    {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.b.b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        } else {
            return;
        }
    }

    public final void c(e1.e p2)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        this.b();
        this.a.remove(p2);
        return;
    }

    public final void d(e1.e p2, Object p3)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        this.e(p2, p3);
        return;
    }

    public final void e(e1.e p3, Object p4)
    {
        kotlin.jvm.internal.j.e(p3, "key");
        this.b();
        if (p4 != null) {
            java.util.LinkedHashMap v1 = this.a;
            if (!(p4 instanceof java.util.Set)) {
                if (!(p4 instanceof byte[])) {
                    v1.put(p3, p4);
                    return;
                } else {
                    byte[] v4_2 = java.util.Arrays.copyOf(((byte[]) p4), ((byte[]) p4).length);
                    kotlin.jvm.internal.j.d(v4_2, "copyOf(this, size)");
                    v1.put(p3, v4_2);
                    return;
                }
            } else {
                byte[] v4_5 = java.util.Collections.unmodifiableSet(i7.i.n0(((java.util.Set) p4)));
                kotlin.jvm.internal.j.d(v4_5, "unmodifiableSet(set.toSet())");
                v1.put(p3, v4_5);
                return;
            }
        } else {
            this.c(p3);
            return;
        }
    }

    public final boolean equals(Object p7)
    {
        if ((p7 instanceof e1.b)) {
            java.util.Iterator v7_4 = ((e1.b) p7).a;
            java.util.LinkedHashMap v0_1 = this.a;
            if (v7_4 != v0_1) {
                if (v7_4.size() == v0_1.size()) {
                    if (!v7_4.isEmpty()) {
                        java.util.Iterator v7_2 = v7_4.entrySet().iterator();
                        while (v7_2.hasNext()) {
                            int v3_5;
                            int v3_3 = ((java.util.Map$Entry) v7_2.next());
                            byte[] v4_2 = v0_1.get(v3_3.getKey());
                            if (v4_2 == null) {
                                v3_5 = 0;
                            } else {
                                int v3_4 = v3_3.getValue();
                                if (!(v3_4 instanceof byte[])) {
                                    v3_5 = kotlin.jvm.internal.j.a(v3_4, v4_2);
                                } else {
                                    if ((!(v4_2 instanceof byte[])) || (!java.util.Arrays.equals(((byte[]) v3_4), ((byte[]) v4_2)))) {
                                    } else {
                                        v3_5 = 1;
                                    }
                                }
                            }
                            if (v3_5 == 0) {
                                return 0;
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public final int hashCode()
    {
        java.util.Iterator v0_2 = this.a.entrySet().iterator();
        int v1 = 0;
        while (v0_2.hasNext()) {
            int v2_3;
            int v2_2 = ((java.util.Map$Entry) v0_2.next()).getValue();
            if (!(v2_2 instanceof byte[])) {
                v2_3 = v2_2.hashCode();
            } else {
                v2_3 = java.util.Arrays.hashCode(((byte[]) v2_2));
            }
            v1 += v2_3;
        }
        return v1;
    }

    public final String toString()
    {
        return i7.i.c0(this.a.entrySet(), ",\n", "{\n", "\n}", e1.a.a, 24);
    }
}
