package x2;
public final enum class d extends java.lang.Enum {
    public static final enum x2.d a;
    public static final enum x2.d b;
    public static final enum x2.d c;
    public static final synthetic x2.d[] d;

    static d()
    {
        x2.d[] v0_2 = new x2.d("NETWORK_UNMETERED", 0);
        x2.d.a = v0_2;
        x2.d v1_2 = new x2.d("DEVICE_IDLE", 1);
        x2.d.b = v1_2;
        x2.d v2_1 = new x2.d("DEVICE_CHARGING", 2);
        x2.d.c = v2_1;
        x2.d.d = new x2.d[] {v0_2, v1_2, v2_1});
        return;
    }

    public static x2.d valueOf(String p1)
    {
        return ((x2.d) Enum.valueOf(x2.d, p1));
    }

    public static x2.d[] values()
    {
        return ((x2.d[]) x2.d.d.clone());
    }
}
