package d4;
public final class b implements d4.c {
    public static final Object c;
    public volatile d4.c a;
    public volatile Object b;

    static b()
    {
        d4.b.c = new Object();
        return;
    }

    public static d4.c a(d4.c p2)
    {
        if (!(p2 instanceof d4.b)) {
            d4.b v0_2 = new d4.b();
            v0_2.b = d4.b.c;
            v0_2.a = p2;
            return v0_2;
        } else {
            return p2;
        }
    }

    public final Object zza()
    {
        Object v1_0 = this.b;
        IllegalStateException v2_1 = d4.b.c;
        if (v1_0 != v2_1) {
            return v1_0;
        } else {
            Object v1_1 = this.b;
            if (v1_1 == v2_1) {
                v1_1 = this.a.zza();
                Object v3 = this.b;
                if (v3 != v2_1) {
                    if (v3 != v1_1) {
                        StringBuilder v4_1 = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                        v4_1.append(v3);
                        v4_1.append(" & ");
                        v4_1.append(v1_1);
                        v4_1.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(v4_1.toString());
                    } else {
                    }
                }
                this.b = v1_1;
                this.a = 0;
            }
            return v1_1;
        }
    }
}
