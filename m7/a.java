package m7;
public final enum class a extends java.lang.Enum {
    public static final enum m7.a a;
    public static final synthetic m7.a[] b;

    static a()
    {
        m7.a[] v0_2 = new m7.a("COROUTINE_SUSPENDED", 0);
        m7.a.a = v0_2;
        m7.a[] v0_1 = new m7.a[] {v0_2, new m7.a("UNDECIDED", 1), new m7.a("RESUMED", 2)});
        m7.a.b = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static m7.a valueOf(String p1)
    {
        return ((m7.a) Enum.valueOf(m7.a, p1));
    }

    public static m7.a[] values()
    {
        return ((m7.a[]) m7.a.b.clone());
    }
}
