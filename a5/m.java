package a5;
public final class m {
    public final a5.x a;
    public final int b;
    public final int c;

    public m(int p1, int p2, Class p3)
    {
        this(a5.x.a(p3), p1, p2);
        return;
    }

    public m(a5.x p2, int p3, int p4)
    {
        q4.b.f(p2, "Null dependency anInterface.");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public static a5.m a(Class p3)
    {
        return new a5.m(0, 1, p3);
    }

    public static a5.m b(a5.x p3)
    {
        return new a5.m(p3, 1, 0);
    }

    public static a5.m c(Class p3)
    {
        return new a5.m(1, 0, p3);
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof a5.m)) || ((!this.a.equals(((a5.m) p3).a)) || ((this.b != ((a5.m) p3).b) || (this.c != ((a5.m) p3).c)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_0 = 1000003;
        return (((((this.a.hashCode() ^ 1000003) * v1_0) ^ this.b) * v1_0) ^ this.c);
    }

    public final String toString()
    {
        String v1_1;
        AssertionError v0_1 = new StringBuilder("Dependency{anInterface=");
        v0_1.append(this.a);
        v0_1.append(", type=");
        String v1_8 = this.b;
        if (v1_8 != 1) {
            if (v1_8 != null) {
                v1_1 = "set";
            } else {
                v1_1 = "optional";
            }
        } else {
            v1_1 = "required";
        }
        String v1_4;
        v0_1.append(v1_1);
        v0_1.append(", injection=");
        String v1_3 = this.c;
        if (v1_3 == null) {
            v1_4 = "direct";
        } else {
            if (v1_3 == 1) {
                v1_4 = "provider";
            } else {
                if (v1_3 != 2) {
                    throw new AssertionError(g2.g.c(v1_3, "Unsupported injection: "));
                } else {
                    v1_4 = "deferred";
                }
            }
        }
        return v1.a.n(v0_1, v1_4, "}");
    }
}
