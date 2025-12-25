package k6;
public final enum class c extends java.lang.Enum implements w5.c {
    public static final enum k6.c b;
    public static final synthetic k6.c[] c;
    public final int a;

    static c()
    {
        k6.c[] v0_2 = new k6.c("UNKNOWN_OS", 0, 0);
        k6.c v1_2 = new k6.c("ANDROID", 1, 1);
        k6.c.b = v1_2;
        k6.c.c = new k6.c[] {v0_2, v1_2, new k6.c("IOS", 2, 2), new k6.c("WEB", 3, 3)});
        return;
    }

    public c(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static k6.c valueOf(String p1)
    {
        return ((k6.c) Enum.valueOf(k6.c, p1));
    }

    public static k6.c[] values()
    {
        return ((k6.c[]) k6.c.c.clone());
    }

    public final int a()
    {
        return this.a;
    }
}
