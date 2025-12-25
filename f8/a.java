package f8;
public final enum class a extends java.lang.Enum {
    public static final enum f8.a a;
    public static final enum f8.a b;
    public static final enum f8.a c;
    public static final synthetic f8.a[] d;

    static a()
    {
        f8.a[] v0_2 = new f8.a("SUSPEND", 0);
        f8.a.a = v0_2;
        f8.a v1_2 = new f8.a("DROP_OLDEST", 1);
        f8.a.b = v1_2;
        f8.a v2_1 = new f8.a("DROP_LATEST", 2);
        f8.a.c = v2_1;
        f8.a[] v0_1 = new f8.a[] {v0_2, v1_2, v2_1});
        f8.a.d = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static f8.a valueOf(String p1)
    {
        return ((f8.a) Enum.valueOf(f8.a, p1));
    }

    public static f8.a[] values()
    {
        return ((f8.a[]) f8.a.d.clone());
    }
}
