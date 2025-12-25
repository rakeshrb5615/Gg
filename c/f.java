package c;
public final synthetic class f implements b2.d {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic f(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final android.os.Bundle a()
    {
        switch (this.a) {
            case 0:
                return c.n.a(((c.n) this.b));
            default:
                h7.f[] v0_15 = ((a2.b) this.b);
                int v1_3 = i7.r.r0(((java.util.LinkedHashMap) v0_15.e)).entrySet().iterator();
                while (v1_3.hasNext()) {
                    int v2_9 = ((java.util.Map$Entry) v1_3.next());
                    v0_15.m(((g8.y) ((g8.u) v2_9.getValue())).b(), ((String) v2_9.getKey()));
                }
                int v1_8 = i7.r.r0(((java.util.LinkedHashMap) v0_15.c)).entrySet().iterator();
                while (v1_8.hasNext()) {
                    int v2_4 = ((java.util.Map$Entry) v1_8.next());
                    v0_15.m(((b2.d) v2_4.getValue()).a(), ((String) v2_4.getKey()));
                }
                h7.f[] v0_10;
                h7.f[] v0_4 = ((java.util.LinkedHashMap) v0_15.b);
                if (!v0_4.isEmpty()) {
                    int v1_11 = new java.util.ArrayList(v0_4.size());
                    h7.f[] v0_6 = v0_4.entrySet().iterator();
                    while (v0_6.hasNext()) {
                        Object v3_3 = ((java.util.Map$Entry) v0_6.next());
                        v1_11.add(new h7.f(((String) v3_3.getKey()), v3_3.getValue()));
                    }
                    h7.f[] v0_7 = new h7.f[0];
                    v0_10 = ((h7.f[]) v1_11.toArray(v0_7));
                } else {
                    v0_10 = new h7.f[0];
                }
                return c4.b.f(((h7.f[]) java.util.Arrays.copyOf(v0_10, v0_10.length)));
        }
    }
}
