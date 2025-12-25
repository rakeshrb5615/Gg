package u8;
public abstract class a {
    public static final int a;

    static a()
    {
        try {
            int v0_4 = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(v0_4, "getProperty(...)");
            int v0_1 = b8.p.q0(v0_4);
        } catch (int v0_5) {
            v0_1 = c4.b.p(v0_5);
        }
        if ((v0_1 instanceof h7.g)) {
            v0_1 = 0;
        }
        int v0_3;
        int v0_2 = ((Integer) v0_1);
        if (v0_2 == 0) {
            v0_3 = 2097152;
        } else {
            v0_3 = v0_2.intValue();
        }
        u8.a.a = v0_3;
        return;
    }
}
