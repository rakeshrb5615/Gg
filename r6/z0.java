package r6;
public final enum class z0 extends java.lang.Enum {
    public static final enum r6.z0 a;
    public static final enum r6.z0 b;
    public static final synthetic r6.z0[] c;

    static z0()
    {
        r6.z0[] v0_2 = new r6.z0("GENERAL", 0);
        r6.z0.a = v0_2;
        r6.z0 v1_2 = new r6.z0("FALLBACK", 1);
        r6.z0.b = v1_2;
        r6.z0[] v0_1 = new r6.z0[] {v0_2, v1_2});
        r6.z0.c = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static r6.z0 valueOf(String p1)
    {
        return ((r6.z0) Enum.valueOf(r6.z0, p1));
    }

    public static r6.z0[] values()
    {
        return ((r6.z0[]) r6.z0.c.clone());
    }
}
