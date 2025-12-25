package c7;
public final class d extends w6.z {
    public static final c7.c b;
    public final w6.z a;

    static d()
    {
        c7.d.b = new c7.c();
        return;
    }

    public d(w6.z p1)
    {
        this.a = p1;
        return;
    }

    public final Object b(e7.a p4)
    {
        int v4_2 = ((java.util.Date) this.a.b(p4));
        if (v4_2 == 0) {
            return 0;
        } else {
            return new java.sql.Timestamp(v4_2.getTime());
        }
    }

    public final void c(e7.b p2, Object p3)
    {
        this.a.c(p2, ((java.sql.Timestamp) p3));
        return;
    }
}
