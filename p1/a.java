package p1;
public final class a {
    public final a6.e a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashSet c;
    public volatile boolean d;

    public a()
    {
        this.a = new a6.e();
        this.b = new java.util.LinkedHashMap();
        this.c = new java.util.LinkedHashSet();
        return;
    }

    public static void a(AutoCloseable p1)
    {
        if (p1 == null) {
            return;
        } else {
            try {
                g2.g.k(p1);
                return;
            } catch (Exception v1_1) {
                throw new RuntimeException(v1_1);
            }
        }
    }
}
