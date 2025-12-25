package d8;
public final enum class d0 extends java.lang.Enum {
    public static final enum d8.d0 a;
    public static final enum d8.d0 b;
    public static final synthetic d8.d0[] c;

    static d0()
    {
        d8.d0[] v0_2 = new d8.d0("DEFAULT", 0);
        d8.d0.a = v0_2;
        d8.d0 v1_2 = new d8.d0("LAZY", 1);
        d8.d0 v2_0 = new d8.d0("ATOMIC", 2);
        d8.d0.b = v2_0;
        d8.d0[] v0_1 = new d8.d0[] {v0_2, v1_2, v2_0, new d8.d0("UNDISPATCHED", 3)});
        d8.d0.c = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static d8.d0 valueOf(String p1)
    {
        return ((d8.d0) Enum.valueOf(d8.d0, p1));
    }

    public static d8.d0[] values()
    {
        return ((d8.d0[]) d8.d0.c.clone());
    }
}
