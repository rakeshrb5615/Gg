package k6;
public final enum class a extends java.lang.Enum implements w5.c {
    public static final enum k6.a b;
    public static final synthetic k6.a[] c;
    public final int a;

    static a()
    {
        k6.a[] v0_2 = new k6.a("UNKNOWN_EVENT", 0, 0);
        k6.a v1_2 = new k6.a("MESSAGE_DELIVERED", 1, 1);
        k6.a.b = v1_2;
        k6.a.c = new k6.a[] {v0_2, v1_2, new k6.a("MESSAGE_OPEN", 2, 2)});
        return;
    }

    public a(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static k6.a valueOf(String p1)
    {
        return ((k6.a) Enum.valueOf(k6.a, p1));
    }

    public static k6.a[] values()
    {
        return ((k6.a[]) k6.a.c.clone());
    }

    public final int a()
    {
        return this.a;
    }
}
