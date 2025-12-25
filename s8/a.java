package s8;
public final class a implements o8.a {
    public static final s8.a a;
    public static final s8.n b;

    static a()
    {
        s8.a.a = new s8.a();
        s8.a.b = new s8.n("kotlin.Boolean", q8.b.f);
        return;
    }

    public final void b(u8.i p2, Object p3)
    {
        String v3_4 = ((Boolean) p3).booleanValue();
        if (!p2.b) {
            ((h.f) ((i2.m) p2.c).b).i(String.valueOf(v3_4));
        } else {
            p2.j(String.valueOf(v3_4));
        }
        return;
    }

    public final Object c(n.p p12)
    {
        kotlin.jvm.internal.j.e(p12, "decoder");
        Boolean v12_2 = ((a2.d) p12.d);
        String v0_1 = v12_2.x();
        int v1_5 = ((String) v12_2.f);
        if (v0_1 == v1_5.length()) {
            a2.d.n(v12_2, "EOF", 0, 6);
            throw 0;
        } else {
            int v2_1;
            if (v1_5.charAt(v0_1) != 34) {
                v2_1 = 0;
            } else {
                v0_1++;
                v2_1 = 1;
            }
            String v0_2 = v12_2.w(v0_1);
            if ((v0_2 >= v1_5.length()) || (v0_2 == -1)) {
                a2.d.n(v12_2, "EOF", 0, 6);
                throw 0;
            } else {
                String v0_6;
                int v9_2 = (v0_2 + 1);
                String v0_4 = (v1_5.charAt(v0_2) | 32);
                if (v0_4 == 102) {
                    v12_2.e(v9_2, "alse");
                    v0_6 = 0;
                } else {
                    if (v0_4 != 116) {
                        String v0_8 = new StringBuilder("Expected valid boolean literal prefix, but had \'");
                        v0_8.append(v12_2.j());
                        v0_8.append(39);
                        a2.d.n(v12_2, v0_8.toString(), 0, 6);
                        throw 0;
                    } else {
                        v12_2.e(v9_2, "rue");
                        v0_6 = 1;
                    }
                }
                if (v2_1 != 0) {
                    if (v12_2.b == v1_5.length()) {
                        a2.d.n(v12_2, "EOF", 0, 6);
                        throw 0;
                    } else {
                        if (v1_5.charAt(v12_2.b) != 34) {
                            a2.d.n(v12_2, "Expected closing quotation mark", 0, 6);
                            throw 0;
                        } else {
                            v12_2.b = (v12_2.b + 1);
                        }
                    }
                }
                return Boolean.valueOf(v0_6);
            }
        }
    }

    public final q8.d d()
    {
        return s8.a.b;
    }
}
