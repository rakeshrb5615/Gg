package u8;
public final enum class k extends java.lang.Enum {
    public static final enum u8.k c;
    public static final enum u8.k d;
    public static final enum u8.k e;
    public static final enum u8.k f;
    public static final synthetic u8.k[] m;
    public static final synthetic o7.b n;
    public final char a;
    public final char b;

    static k()
    {
        o7.b v0_3 = new u8.k("OBJ", 0, 123, 125);
        u8.k.c = v0_3;
        u8.k v1_1 = new u8.k("LIST", 1, 91, 93);
        u8.k.d = v1_1;
        u8.k v2_1 = new u8.k("MAP", 2, 123, 125);
        u8.k.e = v2_1;
        u8.k v3_1 = new u8.k("POLY_OBJ", 3, 91, 93);
        u8.k.f = v3_1;
        o7.b v0_1 = new u8.k[] {v0_3, v1_1, v2_1, v3_1});
        u8.k.m = v0_1;
        u8.k.n = c4.b.x(v0_1);
        return;
    }

    public k(String p1, int p2, char p3, char p4)
    {
        super(p1, p2);
        super.a = p3;
        super.b = p4;
        return;
    }

    public static u8.k valueOf(String p1)
    {
        return ((u8.k) Enum.valueOf(u8.k, p1));
    }

    public static u8.k[] values()
    {
        return ((u8.k[]) u8.k.m.clone());
    }
}
