package p0;
public final class b {
    public final Object a;
    public final Object b;

    public b(Object p1, Object p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof p0.b)) {
            if ((!java.util.Objects.equals(((p0.b) p4).a, this.a)) || (!java.util.Objects.equals(((p0.b) p4).b, this.b))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        Object v2 = this.b;
        if (v2 != null) {
            v0_0 = v2.hashCode();
        }
        return (v0_0 ^ v1_1);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("Pair{");
        v0_2.append(this.a);
        v0_2.append(" ");
        v0_2.append(this.b);
        v0_2.append("}");
        return v0_2.toString();
    }
}
