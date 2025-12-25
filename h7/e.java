package h7;
public final enum class e extends java.lang.Enum {
    public static final synthetic h7.e[] a;

    static e()
    {
        h7.e[] v0_1 = new h7.e[] {new h7.e("SYNCHRONIZED", 0), new h7.e("PUBLICATION", 1), new h7.e("NONE", 2)});
        h7.e.a = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static h7.e valueOf(String p1)
    {
        return ((h7.e) Enum.valueOf(h7.e, p1));
    }

    public static h7.e[] values()
    {
        return ((h7.e[]) h7.e.a.clone());
    }
}
