package o2;
public final enum class d extends java.lang.Enum {
    public static final enum o2.d a;
    public static final enum o2.d b;
    public static final enum o2.d c;
    public static final synthetic o2.d[] d;

    static d()
    {
        o2.d[] v0_2 = new o2.d("DEFAULT", 0);
        o2.d.a = v0_2;
        o2.d v1_2 = new o2.d("VERY_LOW", 1);
        o2.d.b = v1_2;
        o2.d v2_1 = new o2.d("HIGHEST", 2);
        o2.d.c = v2_1;
        o2.d.d = new o2.d[] {v0_2, v1_2, v2_1});
        return;
    }

    public static o2.d valueOf(String p1)
    {
        return ((o2.d) Enum.valueOf(o2.d, p1));
    }

    public static o2.d[] values()
    {
        return ((o2.d[]) o2.d.d.clone());
    }
}
