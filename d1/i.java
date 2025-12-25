package d1;
public final class i extends n7.i implements u7.q {
    public synthetic c1.f a;
    public synthetic e1.b b;

    public final Object b(Object p3, Object p4, Object p5)
    {
        d1.i v0_1 = new d1.i(3, ((l7.c) p5));
        v0_1.a = ((c1.f) p3);
        v0_1.b = ((e1.b) p4);
        return v0_1.invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p9)
    {
        c4.b.e0(p9);
        java.util.LinkedHashMap v9_1 = this.a;
        e1.b v0_0 = this.b;
        java.util.Set v1_13 = v0_0.a().keySet();
        e1.e v2_0 = new java.util.ArrayList(i7.j.X(v1_13, 10));
        java.util.Set v1_0 = v1_13.iterator();
        while (v1_0.hasNext()) {
            v2_0.add(((e1.e) v1_0.next()).a);
        }
        java.util.Set v1_2 = v9_1.a.getAll();
        kotlin.jvm.internal.j.d(v1_2, "prefs.all");
        boolean v3_24 = new java.util.LinkedHashMap();
        java.util.Set v1_4 = v1_2.entrySet().iterator();
        while(true) {
            Object v5_0 = 1;
            if (!v1_4.hasNext()) {
                break;
            }
            String v4_6 = ((java.util.Map$Entry) v1_4.next());
            boolean v6_1 = v4_6.getKey();
            java.util.Set v7 = v9_1.b;
            if (v7 != null) {
                v5_0 = v7.contains(((String) v6_1));
            }
            if (v5_0 != null) {
                v3_24.put(v4_6.getKey(), v4_6.getValue());
            }
        }
        java.util.LinkedHashMap v9_3 = new java.util.LinkedHashMap(i7.r.l0(v3_24.size()));
        java.util.Set v1_8 = v3_24.entrySet().iterator();
        while (v1_8.hasNext()) {
            boolean v3_15 = ((java.util.Map$Entry) v1_8.next());
            String v4_4 = v3_15.getKey();
            boolean v3_16 = v3_15.getValue();
            if ((v3_16 instanceof java.util.Set)) {
                v3_16 = i7.i.n0(((Iterable) v3_16));
            }
            v9_3.put(v4_4, v3_16);
        }
        java.util.Set v1_10 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap v9_5 = v9_3.entrySet().iterator();
        while (v9_5.hasNext()) {
            boolean v3_12 = ((java.util.Map$Entry) v9_5.next());
            if (!v2_0.contains(((String) v3_12.getKey()))) {
                v1_10.put(v3_12.getKey(), v3_12.getValue());
            }
        }
        java.util.LinkedHashMap v9_7 = new e1.b(i7.r.s0(v0_0.a()), 0);
        e1.b v0_4 = v1_10.entrySet().iterator();
        while (v0_4.hasNext()) {
            java.util.Set v1_15 = ((java.util.Map$Entry) v0_4.next());
            e1.e v2_4 = ((String) v1_15.getKey());
            java.util.Set v1_16 = v1_15.getValue();
            if (!(v1_16 instanceof Boolean)) {
                if (!(v1_16 instanceof Float)) {
                    if (!(v1_16 instanceof Integer)) {
                        if (!(v1_16 instanceof Long)) {
                            if (!(v1_16 instanceof String)) {
                                if ((v1_16 instanceof java.util.Set)) {
                                    v9_7.e(c4.b.c0(v2_4), ((java.util.Set) v1_16));
                                }
                            } else {
                                kotlin.jvm.internal.j.e(v2_4, "name");
                                v9_7.e(new e1.e(v2_4), v1_16);
                            }
                        } else {
                            kotlin.jvm.internal.j.e(v2_4, "name");
                            v9_7.e(new e1.e(v2_4), v1_16);
                        }
                    } else {
                        kotlin.jvm.internal.j.e(v2_4, "name");
                        v9_7.e(new e1.e(v2_4), v1_16);
                    }
                } else {
                    kotlin.jvm.internal.j.e(v2_4, "name");
                    v9_7.e(new e1.e(v2_4), v1_16);
                }
            } else {
                kotlin.jvm.internal.j.e(v2_4, "name");
                v9_7.e(new e1.e(v2_4), v1_16);
            }
        }
        return new e1.b(i7.r.s0(v9_7.a()), 1);
    }
}
