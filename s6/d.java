package s6;
public final enum class d extends java.lang.Enum {
    public static final enum s6.d a;
    public static final enum s6.d b;
    public static final synthetic s6.d[] c;

    static d()
    {
        s6.d[] v0_2 = new s6.d("CRASHLYTICS", 0);
        s6.d.a = v0_2;
        s6.d v1_2 = new s6.d("PERFORMANCE", 1);
        s6.d.b = v1_2;
        s6.d[] v0_1 = new s6.d[] {v0_2, v1_2, new s6.d("MATT_SAYS_HI", 2)});
        s6.d.c = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static s6.d valueOf(String p1)
    {
        return ((s6.d) Enum.valueOf(s6.d, p1));
    }

    public static s6.d[] values()
    {
        return ((s6.d[]) s6.d.c.clone());
    }
}
