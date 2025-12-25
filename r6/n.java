package r6;
public final enum class n extends java.lang.Enum implements v5.f {
    public static final enum r6.n b;
    public static final synthetic r6.n[] c;
    public final int a;

    static n()
    {
        r6.n[] v0_2 = new r6.n("EVENT_TYPE_UNKNOWN", 0, 0);
        r6.n v1_2 = new r6.n("SESSION_START", 1, 1);
        r6.n.b = v1_2;
        r6.n[] v0_1 = new r6.n[] {v0_2, v1_2});
        r6.n.c = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public n(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static r6.n valueOf(String p1)
    {
        return ((r6.n) Enum.valueOf(r6.n, p1));
    }

    public static r6.n[] values()
    {
        return ((r6.n[]) r6.n.c.clone());
    }

    public final int a()
    {
        return this.a;
    }
}
