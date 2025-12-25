package q2;
public final class q extends q2.c0 {
    public final Integer a;

    public q(Integer p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p4)
    {
        if (p4 != this) {
            if (!(p4 instanceof q2.c0)) {
                return 0;
            } else {
                Integer v1_1 = this.a;
                if (v1_1 != null) {
                    return v1_1.equals(((q2.q) ((q2.c0) p4)).a);
                } else {
                    if (((q2.q) ((q2.c0) p4)).a != null) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_1;
        int v0_0 = this.a;
        if (v0_0 != 0) {
            v0_1 = v0_0.hashCode();
        } else {
            v0_1 = 0;
        }
        return (v0_1 ^ 1000003);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("ExternalPRequestContext{originAssociatedProductId=");
        v0_1.append(this.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
