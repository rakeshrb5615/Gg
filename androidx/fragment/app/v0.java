package androidx.fragment.app;
public final class v0 {
    public static final r.j b;
    public final synthetic androidx.fragment.app.b1 a;

    static v0()
    {
        androidx.fragment.app.v0.b = new r.j(0);
        return;
    }

    public v0(androidx.fragment.app.b1 p1)
    {
        this.a = p1;
        return;
    }

    public static Class a(String p3, ClassLoader p4)
    {
        Class v0_0 = androidx.fragment.app.v0.b;
        r.j v1_1 = ((r.j) v0_0.get(p4));
        if (v1_1 == null) {
            v1_1 = new r.j(0);
            v0_0.put(p4, v1_1);
        }
        Class v0_2 = ((Class) v1_1.get(p3));
        if (v0_2 != null) {
            return v0_2;
        } else {
            Class v4_1 = Class.forName(p3, 0, p4);
            v1_1.put(p3, v4_1);
            return v4_1;
        }
    }

    public static Class b(String p3, ClassLoader p4)
    {
        try {
            String v3_2 = androidx.fragment.app.v0.a(p3, p4);
            return v3_2;
        } catch (ClassCastException v4_1) {
            throw new a5.o(v1.a.l("Unable to instantiate fragment ", v3_2, ": make sure class name exists"), v4_1);
        } catch (ClassCastException v4_2) {
            throw new a5.o(v1.a.l("Unable to instantiate fragment ", v3_2, ": make sure class is a valid subclass of Fragment"), v4_2);
        }
    }
}
