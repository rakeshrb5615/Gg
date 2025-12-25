package k8;
public final enum class b extends java.lang.Enum {
    public static final enum k8.b a;
    public static final enum k8.b b;
    public static final enum k8.b c;
    public static final enum k8.b d;
    public static final enum k8.b e;
    public static final synthetic k8.b[] f;

    static b()
    {
        k8.b[] v0_2 = new k8.b("CPU_ACQUIRED", 0);
        k8.b.a = v0_2;
        k8.b v1_2 = new k8.b("BLOCKING", 1);
        k8.b.b = v1_2;
        k8.b v2_1 = new k8.b("PARKING", 2);
        k8.b.c = v2_1;
        k8.b v3_2 = new k8.b("DORMANT", 3);
        k8.b.d = v3_2;
        k8.b v4_3 = new k8.b("TERMINATED", 4);
        k8.b.e = v4_3;
        k8.b[] v0_1 = new k8.b[] {v0_2, v1_2, v2_1, v3_2, v4_3});
        k8.b.f = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static k8.b valueOf(String p1)
    {
        return ((k8.b) Enum.valueOf(k8.b, p1));
    }

    public static k8.b[] values()
    {
        return ((k8.b[]) k8.b.f.clone());
    }
}
