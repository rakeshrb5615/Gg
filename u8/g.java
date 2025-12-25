package u8;
public abstract class g {
    public static final u8.h a;

    static g()
    {
        u8.g.a = new u8.h();
        return;
    }

    public static final q8.d a(q8.d p2, c5.c p3)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        kotlin.jvm.internal.j.e(p3, "module");
        if (!kotlin.jvm.internal.j.a(p2.c(), q8.e.f)) {
            if (p2.isInline()) {
                p2 = u8.g.a(p2.i(0), p3);
            }
            return p2;
        } else {
            j5.t1.s(p2);
            return p2;
        }
    }

    public static final byte b(char p1)
    {
        if (p1 >= 126) {
            return 0;
        } else {
            return u8.c.b[p1];
        }
    }

    public static final void c(a2.d p2, String p3)
    {
        p2.m("Trailing comma before the end of JSON ".concat(p3), (p2.b - 1), "Trailing commas are non-complaint JSON and not allowed by default. Use \'allowTrailingCommas = true\' in \'Json {}\' builder to support them.");
        throw 0;
    }

    public static final CharSequence d(CharSequence p5, int p6)
    {
        kotlin.jvm.internal.j.e(p5, "<this>");
        if (p5.length() >= 200) {
            String v1_0 = ".....";
            if (p6 != -1) {
                int v3_0;
                int v0_1 = (p6 - 30);
                int v6_1 = (p6 + 30);
                if (v0_1 > 0) {
                    v3_0 = ".....";
                } else {
                    v3_0 = "";
                }
                if (v6_1 >= p5.length()) {
                    v1_0 = "";
                }
                StringBuilder v2_1 = u.e.b(v3_0);
                if (v0_1 < 0) {
                    v0_1 = 0;
                }
                int v3_1 = p5.length();
                if (v6_1 > v3_1) {
                    v6_1 = v3_1;
                }
                v2_1.append(p5.subSequence(v0_1, v6_1).toString());
                v2_1.append(v1_0);
                return v2_1.toString();
            } else {
                int v6_3 = (p5.length() - 60);
                if (v6_3 > 0) {
                    int v0_4 = new StringBuilder(".....");
                    v0_4.append(p5.subSequence(v6_3, p5.length()).toString());
                    return v0_4.toString();
                }
            }
        }
        return p5;
    }

    public static final void e(q8.d p1, t8.b p2)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        kotlin.jvm.internal.j.e(p2, "json");
        if (kotlin.jvm.internal.j.a(p1.c(), q8.f.f)) {
            p2.a.getClass();
        }
        return;
    }

    public static final u8.k f(q8.d p2, t8.b p3)
    {
        kotlin.jvm.internal.j.e(p2, "desc");
        StringBuilder v0_6 = p2.c();
        if (!(v0_6 instanceof q8.a)) {
            if (!kotlin.jvm.internal.j.a(v0_6, q8.f.g)) {
                if (!kotlin.jvm.internal.j.a(v0_6, q8.f.h)) {
                    return u8.k.c;
                } else {
                    String v2_3 = u8.g.a(p2.i(0), p3.b);
                    StringBuilder v0_4 = v2_3.c();
                    if ((!(v0_4 instanceof q8.c)) && (!kotlin.jvm.internal.j.a(v0_4, q8.e.g))) {
                        p3.a.getClass();
                        StringBuilder v0_8 = new StringBuilder("Value of type \'");
                        v0_8.append(v2_3.b());
                        v0_8.append("\' can\'t be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is \'");
                        v0_8.append(v2_3.c());
                        v0_8.append("\'.\nUse \'allowStructuredMapKeys = true\' in \'Json {}\' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
                        throw new u8.d(v0_8.toString());
                    } else {
                        return u8.k.e;
                    }
                }
            } else {
                return u8.k.d;
            }
        } else {
            return u8.k.f;
        }
    }
}
