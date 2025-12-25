package androidx.lifecycle;
public final enum class o extends java.lang.Enum {
    public static final enum androidx.lifecycle.o a;
    public static final enum androidx.lifecycle.o b;
    public static final enum androidx.lifecycle.o c;
    public static final enum androidx.lifecycle.o d;
    public static final enum androidx.lifecycle.o e;
    public static final synthetic androidx.lifecycle.o[] f;

    static o()
    {
        androidx.lifecycle.o[] v0_2 = new androidx.lifecycle.o("DESTROYED", 0);
        androidx.lifecycle.o.a = v0_2;
        androidx.lifecycle.o v1_2 = new androidx.lifecycle.o("INITIALIZED", 1);
        androidx.lifecycle.o.b = v1_2;
        androidx.lifecycle.o v2_1 = new androidx.lifecycle.o("CREATED", 2);
        androidx.lifecycle.o.c = v2_1;
        androidx.lifecycle.o v3_2 = new androidx.lifecycle.o("STARTED", 3);
        androidx.lifecycle.o.d = v3_2;
        androidx.lifecycle.o v4_3 = new androidx.lifecycle.o("RESUMED", 4);
        androidx.lifecycle.o.e = v4_3;
        androidx.lifecycle.o[] v0_1 = new androidx.lifecycle.o[] {v0_2, v1_2, v2_1, v3_2, v4_3});
        androidx.lifecycle.o.f = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static androidx.lifecycle.o valueOf(String p1)
    {
        return ((androidx.lifecycle.o) Enum.valueOf(androidx.lifecycle.o, p1));
    }

    public static androidx.lifecycle.o[] values()
    {
        return ((androidx.lifecycle.o[]) androidx.lifecycle.o.f.clone());
    }
}
