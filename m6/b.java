package m6;
public final class b {
    public final r4.c a;
    public final java.util.concurrent.Executor b;
    public final n6.d c;
    public final n6.d d;
    public final n6.i e;
    public final n6.j f;
    public final n6.n g;
    public final n0.a h;
    public final j6.s i;

    public b(r4.c p1, java.util.concurrent.Executor p2, n6.d p3, n6.d p4, n6.d p5, n6.i p6, n6.j p7, n6.n p8, n0.a p9, j6.s p10)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p6;
        this.f = p7;
        this.g = p8;
        this.h = p9;
        this.i = p10;
        return;
    }

    public static java.util.ArrayList c(org.json.JSONArray p7)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = 0;
        while (v1 < p7.length()) {
            java.util.HashMap v2_2 = new java.util.HashMap();
            org.json.JSONObject v3 = p7.getJSONObject(v1);
            java.util.Iterator v4 = v3.keys();
            while (v4.hasNext()) {
                String v5_2 = ((String) v4.next());
                v2_2.put(v5_2, v3.getString(v5_2));
            }
            v0_1.add(v2_2);
            v1++;
        }
        return v0_1;
    }

    public final String a(String p4)
    {
        String v0_0 = this.f;
        n6.f v1_0 = v0_0.c;
        String v2 = n6.j.b(v1_0, p4);
        if (v2 == null) {
            String v0_2 = n6.j.b(v0_0.d, p4);
            if (v0_2 == null) {
                n6.j.c(p4, "String");
                return "";
            } else {
                return v0_2;
            }
        } else {
            v0_0.a(p4, v1_0.c());
            return v2;
        }
    }

    public final void b(boolean p5)
    {
        n0.a v0 = this.h;
        try {
            long v1_1 = ((n6.l) v0.c);
        } catch (n6.l v5_8) {
            throw v5_8;
        }
        v1_1.e = p5;
        n6.c v3 = v1_1.g;
        if (v3 != null) {
            v3.j = p5;
        }
        if (p5 != null) {
            long v1_3 = v1_1.f;
            if (v1_3 != 0) {
                v1_3.disconnect();
            }
        }
        if (p5 == null) {
            if (!((java.util.LinkedHashSet) v0.b).isEmpty()) {
                ((n6.l) v0.c).e(0);
            }
        }
        return;
    }
}
