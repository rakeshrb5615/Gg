package x8;
public final class k0 extends x8.m {
    public static final x8.y f;
    public final x8.y c;
    public final x8.m d;
    public final java.util.LinkedHashMap e;

    static k0()
    {
        x8.k0.f = a6.e.d("/");
        return;
    }

    public k0(x8.y p1, x8.m p2, java.util.LinkedHashMap p3)
    {
        this.c = p1;
        this.d = p2;
        this.e = p3;
        return;
    }

    public final x8.u c(x8.y p2)
    {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public final x8.h0 f(x8.y p9)
    {
        kotlin.jvm.internal.j.e(p9, "file");
        y8.g v0_4 = x8.k0.f;
        v0_4.getClass();
        y8.g v0_1 = ((y8.j) this.e.get(y8.c.b(v0_4, p9, 1)));
        if (v0_1 == null) {
            int v1_1 = new StringBuilder("no such file: ");
            v1_1.append(p9);
            throw new java.io.FileNotFoundException(v1_1.toString());
        } else {
            String v2_1 = v0_1.f;
            y8.g v9_3 = this.d.c(this.c);
            try {
                int v5_2 = x8.b.c(v9_3.c(v0_1.h));
            } catch (int v5_3) {
                if (v9_3 != null) {
                    try {
                        v9_3.close();
                    } catch (y8.g v9_4) {
                        q4.b.a(v5_3, v9_4);
                    }
                }
                y8.g v9_5 = v5_3;
                v5_2 = 0;
                if (v9_5 != null) {
                    throw v9_5;
                } else {
                    y8.g v9_10;
                    kotlin.jvm.internal.j.e(v5_2, "<this>");
                    y8.b.f(v5_2, 0);
                    if (v0_1.g != 0) {
                        v9_10 = new y8.g(new x8.s(x8.b.c(new y8.g(v5_2, v0_1.e, 1)), new java.util.zip.Inflater(1)), v2_1, 0);
                    } else {
                        v9_10 = new y8.g(v5_2, v2_1, 1);
                    }
                    return v9_10;
                }
            }
            try {
                v9_3.close();
                v9_5 = 0;
            } catch (y8.g v9_5) {
            }
        }
    }
}
