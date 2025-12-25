package t8;
public final class b {
    public static final t8.b d;
    public final t8.d a;
    public final c5.c b;
    public final j6.o c;

    static b()
    {
        t8.b.d = new t8.b();
        return;
    }

    public b()
    {
        j6.o v0_1 = new t8.d();
        this.a = v0_1;
        this.b = v8.a.a;
        this.c = new j6.o(17);
        return;
    }

    public final Object a(o8.a p7, String p8)
    {
        kotlin.jvm.internal.j.e(p7, "deserializer");
        this.a.getClass();
        a2.d v0_3 = new a2.d(p8);
        int v7_1 = new n.p(this, u8.k.c, v0_3, p7.d()).k(p7);
        int v1_2 = ((String) v0_3.f);
        int v2_0 = v0_3.b;
        while(true) {
            byte v4_0 = 10;
            if ((v2_0 == -1) || (v2_0 >= v1_2.length())) {
                break;
            }
            int v3_2 = (v2_0 + 1);
            int v2_1 = v1_2.charAt(v2_0);
            if ((v2_1 != 32) && ((v2_1 != 10) && ((v2_1 != 13) && (v2_1 != 9)))) {
                v0_3.b = v3_2;
                v4_0 = u8.g.b(v2_1);
            } else {
                v2_0 = v3_2;
            }
            if (v4_0 != 10) {
                int v7_3 = new StringBuilder("Expected EOF after parsing, but had ");
                v7_3.append(p8.charAt((v0_3.b - 1)));
                v7_3.append(" instead");
                a2.d.n(v0_3, v7_3.toString(), 0, 6);
                throw 0;
            } else {
                return v7_1;
            }
        }
        v0_3.b = v1_2.length();
    }

    public final String b(o8.a p6, Object p7)
    {
        kotlin.jvm.internal.j.e(p6, "serializer");
        h.f v0_2 = new h.f(6, 0);
        u8.i v1_4 = u8.b.c;
        try {
            u8.k v2_0;
            u8.k v2_5 = ((i7.g) v1_4.b);
            i2.m v4_0 = 0;
        } catch (Throwable v6_1) {
            throw v6_1;
        }
        if (!v2_5.isEmpty()) {
            v2_0 = v2_5.removeLast();
        } else {
            v2_0 = 0;
        }
        u8.k v2_1 = ((char[]) v2_0);
        if (v2_1 != null) {
            v1_4.a = (v1_4.a - v2_1.length);
            v4_0 = v2_1;
        }
        if (v4_0 == null) {
            v4_0 = new char[128];
        }
        v0_2.c = v4_0;
        try {
            u8.i[] v3_5 = new u8.i[u8.k.n.b()];
            this.a.getClass();
            new u8.i(new i2.m(v0_2), this, u8.k.c, v3_5).i(p6, p7);
            Throwable v6_2 = v0_2.toString();
            v0_2.f();
            return v6_2;
        } catch (Throwable v6_3) {
            v0_2.f();
            throw v6_3;
        }
    }
}
