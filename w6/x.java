package w6;
public abstract enum class x extends java.lang.Enum {
    public static final enum w6.t a;
    public static final enum w6.u b;
    public static final synthetic w6.x[] c;

    static x()
    {
        int v0_1 = new w6.t();
        w6.x.a = v0_1;
        w6.u v1_1 = new w6.u();
        w6.x.b = v1_1;
        w6.v v2_1 = new w6.v();
        w6.w v3_1 = new w6.w();
        w6.x[] v4_1 = new w6.x[4];
        v4_1[0] = v0_1;
        v4_1[1] = v1_1;
        v4_1[2] = v2_1;
        v4_1[3] = v3_1;
        w6.x.c = v4_1;
        return;
    }

    public static w6.x valueOf(String p1)
    {
        return ((w6.x) Enum.valueOf(w6.x, p1));
    }

    public static w6.x[] values()
    {
        return ((w6.x[]) w6.x.c.clone());
    }

    public abstract Number a();
}
