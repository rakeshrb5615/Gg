package r6;
public final enum class j extends java.lang.Enum implements v5.f {
    public static final enum r6.j b;
    public static final enum r6.j c;
    public static final enum r6.j d;
    public static final synthetic r6.j[] e;
    public final int a;

    static j()
    {
        r6.j[] v0_2 = new r6.j("COLLECTION_UNKNOWN", 0, 0);
        r6.j.b = new r6.j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        r6.j.c = new r6.j("COLLECTION_ENABLED", 2, 2);
        r6.j.d = new r6.j("COLLECTION_DISABLED", 3, 3);
        new r6.j("COLLECTION_DISABLED_REMOTE", 4, 4);
        r6.j[] v0_1 = new r6.j[] {v0_2, new r6.j("COLLECTION_SAMPLED", 5, 5)});
        r6.j.e = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public j(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static r6.j valueOf(String p1)
    {
        return ((r6.j) Enum.valueOf(r6.j, p1));
    }

    public static r6.j[] values()
    {
        return ((r6.j[]) r6.j.e.clone());
    }

    public final int a()
    {
        return this.a;
    }
}
