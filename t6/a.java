package t6;
public final class a implements t6.c {
    public static final Object c;
    public volatile t6.b a;
    public volatile Object b;

    static a()
    {
        t6.a.c = new Object();
        return;
    }

    public static t6.c a(t6.b p2)
    {
        if (!(p2 instanceof t6.a)) {
            t6.a v0_2 = new t6.a();
            v0_2.b = t6.a.c;
            v0_2.a = p2;
            return v0_2;
        } else {
            return p2;
        }
    }

    public final Object get()
    {
        String v0_0 = this.b;
        IllegalStateException v1_0 = t6.a.c;
        if (v0_0 != v1_0) {
            return v0_0;
        } else {
            String v0_4 = this.b;
            if (v0_4 == v1_0) {
                v0_4 = this.a.get();
                String v2_1 = this.b;
                if (v2_1 != v1_0) {
                    if (v2_1 != v0_4) {
                        StringBuilder v3_1 = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                        v3_1.append(v2_1);
                        v3_1.append(" & ");
                        v3_1.append(v0_4);
                        v3_1.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(v3_1.toString());
                    } else {
                    }
                }
                this.b = v0_4;
                this.a = 0;
            }
            return v0_4;
        }
    }
}
