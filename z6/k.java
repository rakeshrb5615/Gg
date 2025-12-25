package z6;
public final class k implements w6.a0 {
    public static final z6.j c;
    public final y6.c a;
    public final java.util.concurrent.ConcurrentHashMap b;

    static k()
    {
        z6.k.c = new z6.j(0);
        new z6.j(0);
        return;
    }

    public k(y6.c p1)
    {
        this.a = p1;
        this.b = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public final w6.z a(w6.m p8, d7.a p9)
    {
        x6.a v5_1 = ((x6.a) p9.a.getAnnotation(x6.a));
        if (v5_1 != null) {
            return this.b(this.a, p8, p9, v5_1, 1);
        } else {
            return 0;
        }
    }

    public final w6.z b(y6.c p3, w6.m p4, d7.a p5, x6.a p6, boolean p7)
    {
        w6.a0 v3_9;
        w6.a0 v3_11 = p3.b(new d7.a(p6.value()), 1).c();
        StringBuilder v6_1 = p6.nullSafe();
        if (!(v3_11 instanceof w6.z)) {
            if (!(v3_11 instanceof w6.a0)) {
                StringBuilder v6_3 = new StringBuilder("Invalid attempt to bind an instance of ");
                v6_3.append(v3_11.getClass().getName());
                v6_3.append(" as a @JsonAdapter for ");
                v6_3.append(y6.i.k(p5.b));
                v6_3.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(v6_3.toString());
            } else {
                w6.a0 v3_8 = ((w6.a0) v3_11);
                if (p7 != null) {
                    w6.a0 v7_4 = ((w6.a0) this.b.putIfAbsent(p5.a, v3_8));
                    if (v7_4 != null) {
                        v3_8 = v7_4;
                    }
                }
                v3_9 = v3_8.a(p4, p5);
            }
        } else {
            v3_9 = ((w6.z) v3_11);
        }
        if ((v3_9 != null) && (v6_1 != null)) {
            v3_9 = v3_9.a();
        }
        return v3_9;
    }
}
