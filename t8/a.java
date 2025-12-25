package t8;
public final enum class a extends java.lang.Enum {
    public static final enum t8.a a;
    public static final synthetic t8.a[] b;

    static a()
    {
        t8.a[] v0_2 = new t8.a("NONE", 0);
        t8.a v1_2 = new t8.a("ALL_JSON_OBJECTS", 1);
        t8.a v2_0 = new t8.a("POLYMORPHIC", 2);
        t8.a.a = v2_0;
        t8.a[] v0_1 = new t8.a[] {v0_2, v1_2, v2_0});
        t8.a.b = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static t8.a valueOf(String p1)
    {
        return ((t8.a) Enum.valueOf(t8.a, p1));
    }

    public static t8.a[] values()
    {
        return ((t8.a[]) t8.a.b.clone());
    }
}
