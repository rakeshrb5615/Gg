package i7;
public abstract class r extends c4.b {

    public static Object k0(java.util.Map p2, Object p3)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        if (!(p2 instanceof i7.q)) {
            StringBuilder v0_4 = p2.get(p3);
            if ((v0_4 == null) && (!p2.containsKey(p3))) {
                StringBuilder v0_2 = new StringBuilder("Key ");
                v0_2.append(p3);
                v0_2.append(" is missing in the map.");
                throw new java.util.NoSuchElementException(v0_2.toString());
            } else {
                return v0_4;
            }
        } else {
            return ((i7.q) p2).a();
        }
    }

    public static int l0(int p1)
    {
        if (p1 >= 0) {
            if (p1 >= 3) {
                if (p1 >= 1073741824) {
                    return 2147483647;
                } else {
                    return ((int) ((((float) p1) / 1061158912) + 1065353216));
                }
            } else {
                return (p1 + 1);
            }
        } else {
            return p1;
        }
    }

    public static java.util.Map m0(h7.f p1)
    {
        kotlin.jvm.internal.j.e(p1, "pair");
        java.util.Map v1_2 = java.util.Collections.singletonMap(p1.a, p1.b);
        kotlin.jvm.internal.j.d(v1_2, "singletonMap(...)");
        return v1_2;
    }

    public static varargs java.util.Map n0(h7.f[] p2)
    {
        if (p2.length <= 0) {
            return i7.o.a;
        } else {
            java.util.LinkedHashMap v0_2 = new java.util.LinkedHashMap(i7.r.l0(p2.length));
            i7.r.p0(v0_2, p2);
            return v0_2;
        }
    }

    public static varargs java.util.LinkedHashMap o0(h7.f[] p2)
    {
        java.util.LinkedHashMap v0_1 = new java.util.LinkedHashMap(i7.r.l0(p2.length));
        i7.r.p0(v0_1, p2);
        return v0_1;
    }

    public static final void p0(java.util.LinkedHashMap p4, h7.f[] p5)
    {
        int v0 = p5.length;
        int v1 = 0;
        while (v1 < v0) {
            Object v2_0 = p5[v1];
            p4.put(v2_0.a, v2_0.b);
            v1++;
        }
        return;
    }

    public static java.util.Map q0(java.util.ArrayList p5)
    {
        int v0_0 = p5.size();
        if (v0_0 == 0) {
            return i7.o.a;
        } else {
            if (v0_0 == 1) {
                return i7.r.m0(((h7.f) p5.get(0)));
            } else {
                int v0_2 = new java.util.LinkedHashMap(i7.r.l0(p5.size()));
                int v1_2 = p5.size();
                int v2 = 0;
                while (v2 < v1_2) {
                    Object v3_0 = p5.get(v2);
                    v2++;
                    Object v3_1 = ((h7.f) v3_0);
                    v0_2.put(v3_1.a, v3_1.b);
                }
                return v0_2;
            }
        }
    }

    public static java.util.Map r0(java.util.Map p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        String v0_3 = p2.size();
        if (v0_3 == null) {
            return i7.o.a;
        } else {
            if (v0_3 == 1) {
                kotlin.jvm.internal.j.e(p2, "<this>");
                java.util.Map v2_4 = ((java.util.Map$Entry) p2.entrySet().iterator().next());
                java.util.Map v2_6 = java.util.Collections.singletonMap(v2_4.getKey(), v2_4.getValue());
                kotlin.jvm.internal.j.d(v2_6, "with(...)");
                return v2_6;
            } else {
                return i7.r.s0(p2);
            }
        }
    }

    public static java.util.LinkedHashMap s0(java.util.Map p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        return new java.util.LinkedHashMap(p1);
    }
}
