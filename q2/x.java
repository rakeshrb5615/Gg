package q2;
public final enum class x extends java.lang.Enum {
    public static final enum q2.x a;
    public static final synthetic q2.x[] b;

    static x()
    {
        q2.x[] v0_2 = new q2.x("UNKNOWN", 0);
        q2.x v1_2 = new q2.x("ANDROID_FIREBASE", 1);
        q2.x.a = v1_2;
        q2.x.b = new q2.x[] {v0_2, v1_2});
        return;
    }

    public static q2.x valueOf(String p1)
    {
        return ((q2.x) Enum.valueOf(q2.x, p1));
    }

    public static q2.x[] values()
    {
        return ((q2.x[]) q2.x.b.clone());
    }
}
