package a5;
public final class x {
    public final Class a;
    public final Class b;

    public x(Class p1, Class p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static a5.x a(Class p2)
    {
        return new a5.x(a5.w, p2);
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4) && (a5.x == p4.getClass())) {
                if (this.b.equals(((a5.x) p4).b)) {
                    return this.a.equals(((a5.x) p4).a);
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
        return (this.a.hashCode() + (this.b.hashCode() * 31));
    }

    public final String toString()
    {
        String v1_0 = this.b;
        String v2_1 = this.a;
        if (v2_1 != a5.w) {
            String v0_4 = new StringBuilder("@");
            v0_4.append(v2_1.getName());
            v0_4.append(" ");
            v0_4.append(v1_0.getName());
            return v0_4.toString();
        } else {
            return v1_0.getName();
        }
    }
}
