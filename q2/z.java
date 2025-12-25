package q2;
public final enum class z extends java.lang.Enum {
    public static final enum q2.z a;
    public static final synthetic q2.z[] b;

    static z()
    {
        int v0_2 = new q2.z("NOT_SET", 0);
        q2.z v1_2 = new q2.z("EVENT_OVERRIDE", 1);
        q2.z.a = v1_2;
        q2.z.b = new q2.z[] {v0_2, v1_2});
        android.util.SparseArray v3_2 = new android.util.SparseArray();
        v3_2.put(0, v0_2);
        v3_2.put(5, v1_2);
        return;
    }

    public static q2.z valueOf(String p1)
    {
        return ((q2.z) Enum.valueOf(q2.z, p1));
    }

    public static q2.z[] values()
    {
        return ((q2.z[]) q2.z.b.clone());
    }
}
