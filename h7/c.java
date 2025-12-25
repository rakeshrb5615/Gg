package h7;
public final class c implements java.lang.Comparable {
    public static final h7.c b;
    public final int a;

    static c()
    {
        h7.c.b = new h7.c();
        return;
    }

    public c()
    {
        this.a = 131605;
        return;
    }

    public final int compareTo(Object p2)
    {
        kotlin.jvm.internal.j.e(((h7.c) p2), "other");
        return (this.a - ((h7.c) p2).a);
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            int v4_1;
            if (!(p4 instanceof h7.c)) {
                v4_1 = 0;
            } else {
                v4_1 = ((h7.c) p4);
            }
            if (v4_1 != 0) {
                if (this.a != v4_1.a) {
                    return 0;
                } else {
                    return 1;
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
        return this.a;
    }

    public final String toString()
    {
        return "2.2.21";
    }
}
