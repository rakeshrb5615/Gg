package q2;
public final enum class j0 extends java.lang.Enum {
    public static final enum q2.j0 a;
    public static final synthetic q2.j0[] b;

    static j0()
    {
        int v0_1 = new q2.j0("DEFAULT", 0);
        q2.j0.a = v0_1;
        q2.j0 v1_2 = new q2.j0("UNMETERED_ONLY", 1);
        q2.j0 v2_0 = new q2.j0("UNMETERED_OR_DAILY", 2);
        q2.j0 v3_2 = new q2.j0("FAST_IF_RADIO_AWAKE", 3);
        q2.j0 v4_2 = new q2.j0("NEVER", 4);
        q2.j0 v5_2 = new q2.j0("UNRECOGNIZED", 5);
        q2.j0.b = new q2.j0[] {v0_1, v5_2});
        android.util.SparseArray v11_3 = new android.util.SparseArray();
        v11_3.put(0, v0_1);
        v11_3.put(1, v1_2);
        v11_3.put(2, v2_0);
        v11_3.put(3, v3_2);
        v11_3.put(4, v4_2);
        v11_3.put(-1, v5_2);
        return;
    }

    public static q2.j0 valueOf(String p1)
    {
        return ((q2.j0) Enum.valueOf(q2.j0, p1));
    }

    public static q2.j0[] values()
    {
        return ((q2.j0[]) q2.j0.b.clone());
    }
}
