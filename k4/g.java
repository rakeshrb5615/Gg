package k4;
public final class g implements k4.j {
    public static final Object c;
    public volatile k4.j a;
    public volatile Object b;

    static g()
    {
        k4.g.c = new Object();
        return;
    }

    public static k4.g b(k4.h p2)
    {
        if (!(p2 instanceof k4.g)) {
            k4.g v0_2 = new k4.g();
            v0_2.b = k4.g.c;
            v0_2.a = p2;
            return v0_2;
        } else {
            return ((k4.g) p2);
        }
    }

    public final Object a()
    {
        Object v1_0 = this.b;
        IllegalStateException v2_1 = k4.g.c;
        if (v1_0 != v2_1) {
            return v1_0;
        } else {
            Object v1_1 = this.b;
            if (v1_1 == v2_1) {
                v1_1 = this.a.a();
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
