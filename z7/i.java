package z7;
public final enum class i extends java.lang.Enum {
    public static final synthetic z7.i[] a;

    static i()
    {
        z7.i[] v0_1 = new z7.i[] {new z7.i("PUBLIC", 0), new z7.i("PROTECTED", 1), new z7.i("INTERNAL", 2), new z7.i("PRIVATE", 3)});
        z7.i.a = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static z7.i valueOf(String p1)
    {
        return ((z7.i) Enum.valueOf(z7.i, p1));
    }

    public static z7.i[] values()
    {
        return ((z7.i[]) z7.i.a.clone());
    }
}
