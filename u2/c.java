package u2;
public final enum class c extends java.lang.Enum implements w5.c {
    public static final enum u2.c b;
    public static final enum u2.c c;
    public static final enum u2.c d;
    public static final enum u2.c e;
    public static final enum u2.c f;
    public static final enum u2.c m;
    public static final enum u2.c n;
    public static final synthetic u2.c[] o;
    public final int a;

    static c()
    {
        u2.c[] v0_1 = new u2.c("REASON_UNKNOWN", 0, 0);
        u2.c.b = v0_1;
        u2.c.c = new u2.c("MESSAGE_TOO_OLD", 1, 1);
        u2.c.d = new u2.c("CACHE_FULL", 2, 2);
        u2.c.e = new u2.c("PAYLOAD_TOO_BIG", 3, 3);
        u2.c.f = new u2.c("MAX_RETRIES_REACHED", 4, 4);
        u2.c.m = new u2.c("INVALID_PAYLOD", 5, 5);
        u2.c v6_3 = new u2.c("SERVER_ERROR", 6, 6);
        u2.c.n = v6_3;
        u2.c.o = new u2.c[] {v0_1, v6_3});
        return;
    }

    public c(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static u2.c valueOf(String p1)
    {
        return ((u2.c) Enum.valueOf(u2.c, p1));
    }

    public static u2.c[] values()
    {
        return ((u2.c[]) u2.c.o.clone());
    }

    public final int a()
    {
        return this.a;
    }
}
