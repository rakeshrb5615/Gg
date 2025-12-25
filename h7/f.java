package h7;
public final class f implements java.io.Serializable {
    public final Object a;
    public final Object b;

    public f(Object p1, Object p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof h7.f)) {
                if (kotlin.jvm.internal.j.a(this.a, ((h7.f) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((h7.f) p5).b)) {
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
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_2;
        int v0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_2 = v1_0.hashCode();
        } else {
            v1_2 = 0;
        }
        int v1_3 = (v1_2 * 31);
        Object v2 = this.b;
        if (v2 != null) {
            v0 = v2.hashCode();
        }
        return (v1_3 + v0);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("(");
        v0_2.append(this.a);
        v0_2.append(", ");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
