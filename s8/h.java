package s8;
public final class h implements o8.a {
    public final o8.a a;
    public final s8.g b;

    public h(o8.a p3)
    {
        this.a = p3;
        this.b = new s8.g(s8.p.b, p3.d());
        return;
    }

    public final void b(u8.i p7, Object p8)
    {
        kotlin.jvm.internal.j.e(((java.util.Map) p8), "<this>");
        ((java.util.Map) p8).size();
        s8.g v1_1 = this.b;
        kotlin.jvm.internal.j.e(v1_1, "descriptor");
        u8.i v7_1 = p7.a(v1_1);
        kotlin.jvm.internal.j.e(((java.util.Map) p8), "<this>");
        java.util.Iterator v8_3 = ((java.util.Map) p8).entrySet().iterator();
        int v0_3 = 0;
        while (v8_3.hasNext()) {
            Object v2_2 = ((java.util.Map$Entry) v8_3.next());
            o8.a v3_0 = v2_2.getKey();
            Object v2_3 = v2_2.getValue();
            int v4 = (v0_3 + 1);
            v7_1.h(v1_1, v0_3, s8.p.a, v3_0);
            v0_3 += 2;
            v7_1.h(v1_1, v4, this.a, v2_3);
        }
        v7_1.l(v1_1);
        return;
    }

    public Object c(n.p p10)
    {
        kotlin.jvm.internal.j.e(p10, "decoder");
        kotlin.jvm.internal.j.e(p10, "decoder");
        IllegalArgumentException v0_6 = new java.util.LinkedHashMap();
        kotlin.jvm.internal.j.e(v0_6, "<this>");
        q8.d v1_0 = (v0_6.size() * 2);
        String v10_1 = p10.b(this.d());
        while(true) {
            Object v2_2 = v10_1.c(this.d());
            if (v2_2 == -1) {
                v10_1.n(this.d());
                kotlin.jvm.internal.j.e(v0_6, "<this>");
                return v0_6;
            } else {
                Object v2_3 = (v2_2 + v1_0);
                java.util.Map v3_2 = ((java.util.Map) v0_6);
                kotlin.jvm.internal.j.e(v3_2, "builder");
                s8.g v5 = this.b;
                Object v4_2 = v10_1.j(v5, v2_3, s8.p.a, 0);
                int v7 = v10_1.c(v5);
                if (v7 != (v2_3 + 1)) {
                    break;
                }
                Object v2_8;
                o8.a v8_1 = this.a;
                if ((!v3_2.containsKey(v4_2)) || ((v8_1.d().c() instanceof q8.c))) {
                    v2_8 = v10_1.j(v5, v7, v8_1, 0);
                } else {
                    v2_8 = v10_1.j(v5, v7, v8_1, i7.r.k0(v3_2, v4_2));
                }
                v3_2.put(v4_2, v2_8);
            }
        }
        throw new IllegalArgumentException(v1.a.i("Value must follow key in a map, index for key: ", v2_3, v7, ", returned index for value: ").toString());
    }

    public final q8.d d()
    {
        return this.b;
    }
}
