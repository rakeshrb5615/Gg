package s6;
public final class c {
    public static final s6.c a;
    public static final java.util.Map b;

    static c()
    {
        s6.c.a = new s6.c();
        s6.c.b = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
        return;
    }

    public static s6.a a(s6.d p3)
    {
        StringBuilder v1_0 = s6.c.b;
        kotlin.jvm.internal.j.d(v1_0, "dependencies");
        IllegalStateException v0_3 = v1_0.get(p3);
        if (v0_3 == null) {
            StringBuilder v1_2 = new StringBuilder("Cannot get dependency ");
            v1_2.append(p3);
            v1_2.append(". Dependencies should be added at class load time.");
            throw new IllegalStateException(v1_2.toString());
        } else {
            return ((s6.a) v0_3);
        }
    }

    public final Object b(n7.c p11)
    {
        IllegalStateException v0_2;
        if (!(p11 instanceof s6.b)) {
            v0_2 = new s6.b(this, p11);
        } else {
            v0_2 = ((s6.b) p11);
            String v1_2 = ((s6.b) p11).o;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((s6.b) p11).o = (v1_2 - -2147483648);
            }
        }
        java.util.Iterator v7;
        s6.d v6_0;
        java.util.Map v4_2;
        java.util.Map v8_0;
        m8.c v5_0;
        String v2_4;
        Object v11_1 = v0_2.m;
        String v1_1 = m7.a.a;
        String v2_0 = v0_2.o;
        if (v2_0 == null) {
            c4.b.e0(v11_1);
            String v2_1 = s6.c.b;
            kotlin.jvm.internal.j.d(v2_1, "dependencies");
            v4_2 = new java.util.LinkedHashMap(i7.r.l0(v2_1.size()));
            v7 = v2_1.entrySet().iterator();
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v2_4 = v0_2.f;
                v4_2 = ((java.util.Map) v0_2.e);
                v5_0 = v0_2.d;
                v6_0 = v0_2.c;
                v7 = v0_2.b;
                v8_0 = ((java.util.Map) v0_2.a);
                c4.b.e0(v11_1);
                try {
                    kotlin.jvm.internal.j.e(v6_0, "subscriberName");
                    g5.k v9_2 = s6.c.a(v6_0).b;
                } catch (IllegalStateException v0_6) {
                    v5_0.f(0);
                    throw v0_6;
                }
                if (v9_2 == null) {
                    String v1_4 = new StringBuilder("Subscriber ");
                    v1_4.append(v6_0);
                    v1_4.append(" has not been registered.");
                    throw new IllegalStateException(v1_4.toString());
                } else {
                    v5_0.f(0);
                    v4_2.put(v2_4, v9_2);
                    v4_2 = v8_0;
                }
            }
        }
        if (!v7.hasNext()) {
            return v4_2;
        } else {
            Object v11_10 = ((java.util.Map$Entry) v7.next());
            v2_4 = v11_10.getKey();
            v6_0 = ((s6.d) v11_10.getKey());
            v5_0 = ((s6.a) v11_10.getValue()).a;
            Object v11_14 = ((java.util.Map) v4_2);
            v0_2.a = v11_14;
            v0_2.b = v7;
            v0_2.c = v6_0;
            v0_2.d = v5_0;
            v0_2.e = v11_14;
            v0_2.f = v2_4;
            v0_2.o = 1;
            if (v5_0.d(v0_2) != v1_1) {
                v8_0 = v4_2;
            } else {
                return v1_1;
            }
        }
    }
}
