package w6;
public final class m {
    public static final w6.i k;
    public static final w6.a l;
    public static final w6.t m;
    public static final w6.u n;
    public final ThreadLocal a;
    public final java.util.concurrent.ConcurrentHashMap b;
    public final y6.c c;
    public final z6.k d;
    public final java.util.List e;
    public final boolean f;
    public final w6.i g;
    public final java.util.List h;
    public final java.util.List i;
    public final java.util.List j;

    static m()
    {
        w6.m.k = w6.i.d;
        w6.m.l = w6.h.a;
        w6.m.m = w6.x.a;
        w6.m.n = w6.x.b;
        return;
    }

    public m()
    {
        z6.v v4_14;
        java.util.List v0_0 = y6.e.c;
        z6.k v1_28 = java.util.Collections.EMPTY_LIST;
        this.a = new ThreadLocal();
        this.b = new java.util.concurrent.ConcurrentHashMap();
        y6.c v2_1 = new y6.c();
        this.c = v2_1;
        this.f = 1;
        this.g = w6.m.k;
        this.h = v1_28;
        this.i = v1_28;
        this.j = v1_28;
        java.util.ArrayList v3_3 = new java.util.ArrayList();
        v3_3.add(z6.a1.A);
        w6.a v5_1 = w6.m.m;
        if (v5_1 != w6.x.a) {
            v4_14 = new z6.n(v5_1, 1);
        } else {
            v4_14 = z6.p.c;
        }
        z6.v v4_24;
        v3_3.add(v4_14);
        v3_3.add(v0_0);
        v3_3.addAll(v1_28);
        v3_3.add(z6.a1.p);
        v3_3.add(z6.a1.g);
        v3_3.add(z6.a1.d);
        v3_3.add(z6.a1.e);
        v3_3.add(z6.a1.f);
        z6.k v1_34 = z6.a1.k;
        v3_3.add(new z6.s0(Long.TYPE, Long, v1_34));
        v3_3.add(new z6.s0(Double.TYPE, Double, new w6.j(0)));
        v3_3.add(new z6.s0(Float.TYPE, Float, new w6.j(1)));
        w6.a v5_9 = w6.m.n;
        if (v5_9 != w6.x.b) {
            v4_24 = new z6.n(new z6.o(v5_9), 0);
        } else {
            v4_24 = z6.o.b;
        }
        v3_3.add(v4_24);
        v3_3.add(z6.a1.h);
        v3_3.add(z6.a1.i);
        v3_3.add(new z6.q0(java.util.concurrent.atomic.AtomicLong, new w6.k(v1_34, 0).a(), 0));
        v3_3.add(new z6.q0(java.util.concurrent.atomic.AtomicLongArray, new w6.k(v1_34, 1).a(), 0));
        v3_3.add(z6.a1.j);
        v3_3.add(z6.a1.l);
        v3_3.add(z6.a1.q);
        v3_3.add(z6.a1.r);
        v3_3.add(new z6.q0(java.math.BigDecimal, z6.a1.m, 0));
        v3_3.add(new z6.q0(java.math.BigInteger, z6.a1.n, 0));
        v3_3.add(new z6.q0(y6.k, z6.a1.o, 0));
        v3_3.add(z6.a1.s);
        v3_3.add(z6.a1.t);
        v3_3.add(z6.a1.v);
        v3_3.add(z6.a1.w);
        v3_3.add(z6.a1.y);
        v3_3.add(z6.a1.u);
        v3_3.add(z6.a1.b);
        v3_3.add(z6.g.c);
        v3_3.add(z6.a1.x);
        if (c7.e.a) {
            v3_3.add(c7.e.c);
            v3_3.add(c7.e.b);
            v3_3.add(c7.e.d);
        }
        v3_3.add(z6.b.c);
        v3_3.add(z6.a1.a);
        v3_3.add(new z6.d(v2_1, 0));
        v3_3.add(new z6.d(v2_1, 1));
        z6.k v1_27 = new z6.k(v2_1);
        this.d = v1_27;
        v3_3.add(v1_27);
        v3_3.add(z6.a1.B);
        v3_3.add(new z6.v(v2_1, w6.m.l, v0_0, v1_27));
        this.e = java.util.Collections.unmodifiableList(v3_3);
        return;
    }

    public static void a(double p2)
    {
        if ((Double.isNaN(p2)) || (Double.isInfinite(p2))) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(p2);
            v1_1.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            return;
        }
    }

    public final w6.z b(d7.a p9)
    {
        IllegalArgumentException v0_0 = this.b;
        StringBuilder v1_1 = ((w6.z) v0_0.get(p9));
        if (v1_1 == null) {
            int v3_2;
            StringBuilder v1_2 = this.a;
            String v2_1 = ((java.util.Map) v1_2.get());
            if (v2_1 != null) {
                int v3_1 = ((w6.z) v2_1.get(p9));
                if (v3_1 == 0) {
                    v3_2 = 0;
                } else {
                    return v3_1;
                }
            } else {
                v2_1 = new java.util.HashMap();
                v1_2.set(v2_1);
                v3_2 = 1;
            }
            w6.l v4_1 = new w6.l();
            v2_1.put(p9, v4_1);
            w6.z v5_1 = this.e.iterator();
            w6.z v6_0 = 0;
            while (v5_1.hasNext()) {
                v6_0 = ((w6.a0) v5_1.next()).a(this, p9);
                if (v6_0 != null) {
                    if (v4_1.a != null) {
                        throw new AssertionError("Delegate is already set");
                    } else {
                        v4_1.a = v6_0;
                        v2_1.put(p9, v6_0);
                        break;
                    }
                }
            }
            if (v3_2 != 0) {
                v1_2.remove();
            }
            if (v6_0 == null) {
                StringBuilder v1_4 = new StringBuilder("GSON (2.13.2) cannot handle ");
                v1_4.append(p9);
                throw new IllegalArgumentException(v1_4.toString());
            } else {
                if (v3_2 != 0) {
                    v0_0.putAll(v2_1);
                }
                return v6_0;
            }
        } else {
            return v1_1;
        }
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("{serializeNulls:false,factories:");
        v0_2.append(this.e);
        v0_2.append(",instanceCreators:");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
