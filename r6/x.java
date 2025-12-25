package r6;
public final enum class x extends java.lang.Enum implements v5.f {
    public static final enum r6.x b;
    public static final synthetic r6.x[] c;
    public final int a;

    static x()
    {
        r6.x[] v0_2 = new r6.x("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        r6.x v1_2 = new r6.x("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        r6.x v2_0 = new r6.x("LOG_ENVIRONMENT_STAGING", 2, 2);
        r6.x v3_1 = new r6.x("LOG_ENVIRONMENT_PROD", 3, 3);
        r6.x.b = v3_1;
        r6.x[] v0_1 = new r6.x[] {v0_2, v1_2, v2_0, v3_1});
        r6.x.c = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public x(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static r6.x valueOf(String p1)
    {
        return ((r6.x) Enum.valueOf(r6.x, p1));
    }

    public static r6.x[] values()
    {
        return ((r6.x[]) r6.x.c.clone());
    }

    public final int a()
    {
        return this.a;
    }
}
