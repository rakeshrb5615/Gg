package k6;
public final enum class b extends java.lang.Enum implements w5.c {
    public static final enum k6.b b;
    public static final enum k6.b c;
    public static final synthetic k6.b[] d;
    public final int a;

    static b()
    {
        k6.b[] v0_2 = new k6.b("UNKNOWN", 0, 0);
        k6.b v1_2 = new k6.b("DATA_MESSAGE", 1, 1);
        k6.b.b = v1_2;
        k6.b v2_0 = new k6.b("TOPIC", 2, 2);
        k6.b v3_2 = new k6.b("DISPLAY_NOTIFICATION", 3, 3);
        k6.b.c = v3_2;
        k6.b.d = new k6.b[] {v0_2, v1_2, v2_0, v3_2});
        return;
    }

    public b(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static k6.b valueOf(String p1)
    {
        return ((k6.b) Enum.valueOf(k6.b, p1));
    }

    public static k6.b[] values()
    {
        return ((k6.b[]) k6.b.d.clone());
    }

    public final int a()
    {
        return this.a;
    }
}
