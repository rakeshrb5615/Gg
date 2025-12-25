package l6;
public final class b {
    public final String a;
    public final l6.c b;

    public b(java.util.Set p1, l6.c p2)
    {
        this.a = l6.b.b(p1);
        this.b = p2;
        return;
    }

    public static String b(java.util.Set p3)
    {
        StringBuilder v0_1 = new StringBuilder();
        String v3_1 = p3.iterator();
        while (v3_1.hasNext()) {
            int v1_1 = ((l6.a) v3_1.next());
            v0_1.append(v1_1.a);
            v0_1.append(47);
            v0_1.append(v1_1.b);
            if (v3_1.hasNext()) {
                v0_1.append(32);
            }
        }
        return v0_1.toString();
    }

    public final String a()
    {
        String v0_0 = this.a;
        Throwable v1_0 = this.b;
        if (!java.util.Collections.unmodifiableSet(((java.util.HashSet) v1_0.b)).isEmpty()) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append(v0_0);
            v2_1.append(32);
            v2_1.append(l6.b.b(java.util.Collections.unmodifiableSet(((java.util.HashSet) v1_0.b))));
            return v2_1.toString();
        } else {
            return v0_0;
        }
    }
}
