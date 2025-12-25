package c8;
public final enum class c extends java.lang.Enum {
    public static final enum c8.c b;
    public static final enum c8.c c;
    public static final enum c8.c d;
    public static final enum c8.c e;
    public static final enum c8.c f;
    public static final enum c8.c m;
    public static final synthetic c8.c[] n;
    public final java.util.concurrent.TimeUnit a;

    static c()
    {
        c8.c[] v0_1 = new c8.c("NANOSECONDS", 0, java.util.concurrent.TimeUnit.NANOSECONDS);
        c8.c.b = v0_1;
        new c8.c("MICROSECONDS", 1, java.util.concurrent.TimeUnit.MICROSECONDS);
        c8.c.c = new c8.c("MILLISECONDS", 2, java.util.concurrent.TimeUnit.MILLISECONDS);
        c8.c.d = new c8.c("SECONDS", 3, java.util.concurrent.TimeUnit.SECONDS);
        c8.c.e = new c8.c("MINUTES", 4, java.util.concurrent.TimeUnit.MINUTES);
        c8.c.f = new c8.c("HOURS", 5, java.util.concurrent.TimeUnit.HOURS);
        c8.c v6_4 = new c8.c("DAYS", 6, java.util.concurrent.TimeUnit.DAYS);
        c8.c.m = v6_4;
        c8.c[] v0_2 = new c8.c[] {v0_1, v6_4});
        c8.c.n = v0_2;
        c4.b.x(v0_2);
        return;
    }

    public c(String p1, int p2, java.util.concurrent.TimeUnit p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static c8.c valueOf(String p1)
    {
        return ((c8.c) Enum.valueOf(c8.c, p1));
    }

    public static c8.c[] values()
    {
        return ((c8.c[]) c8.c.n.clone());
    }
}
