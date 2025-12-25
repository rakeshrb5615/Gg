package w5;
public final enum class d extends java.lang.Enum {
    public static final enum w5.d a;
    public static final synthetic w5.d[] b;

    static d()
    {
        w5.d[] v0_2 = new w5.d("DEFAULT", 0);
        w5.d.a = v0_2;
        w5.d.b = new w5.d[] {v0_2, new w5.d("SIGNED", 1), new w5.d("FIXED", 2)});
        return;
    }

    public static w5.d valueOf(String p1)
    {
        return ((w5.d) Enum.valueOf(w5.d, p1));
    }

    public static w5.d[] values()
    {
        return ((w5.d[]) w5.d.b.clone());
    }
}
