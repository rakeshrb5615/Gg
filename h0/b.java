package h0;
public final class b {
    public static final h0.b e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static b()
    {
        h0.b.e = new h0.b(0, 0, 0, 0);
        return;
    }

    public b(int p1, int p2, int p3, int p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public static h0.b a(h0.b p4, h0.b p5)
    {
        return h0.b.b(Math.max(p4.a, p5.a), Math.max(p4.b, p5.b), Math.max(p4.c, p5.c), Math.max(p4.d, p5.d));
    }

    public static h0.b b(int p1, int p2, int p3, int p4)
    {
        if ((p1 != null) || ((p2 != 0) || ((p3 != 0) || (p4 != 0)))) {
            return new h0.b(p1, p2, p3, p4);
        } else {
            return h0.b.e;
        }
    }

    public static h0.b c(android.graphics.Insets p3)
    {
        return h0.b.b(l4.h.a(p3), l4.h.c(p3), l4.h.d(p3), l4.h.f(p3));
    }

    public final android.graphics.Insets d()
    {
        return f2.b0.i(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 != 0) && (h0.b == p5.getClass())) {
                if (this.d == ((h0.b) p5).d) {
                    if (this.a == ((h0.b) p5).a) {
                        if (this.c == ((h0.b) p5).c) {
                            if (this.b == ((h0.b) p5).b) {
                                return 1;
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Insets{left=");
        v0_1.append(this.a);
        v0_1.append(", top=");
        v0_1.append(this.b);
        v0_1.append(", right=");
        v0_1.append(this.c);
        v0_1.append(", bottom=");
        v0_1.append(this.d);
        v0_1.append(125);
        return v0_1.toString();
    }
}
