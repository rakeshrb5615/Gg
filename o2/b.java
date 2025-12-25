package o2;
public final class b {
    public final Integer a;

    public b(Integer p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p4)
    {
        if (p4 != this) {
            if (!(p4 instanceof o2.b)) {
                return 0;
            } else {
                boolean v4_3 = ((o2.b) p4).a;
                Integer v1_1 = this.a;
                if (v1_1 != null) {
                    return v1_1.equals(v4_3);
                } else {
                    if (v4_3) {
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
        String v0_1 = new StringBuilder("ProductData{productId=");
        v0_1.append(this.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
