package j5;
public final class g1 extends j5.i2 {
    public final java.util.List a;

    public g1(java.util.List p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if (!(p2 instanceof j5.i2)) {
                return 0;
            } else {
                return this.a.equals(((j5.g1) ((j5.i2) p2)).a);
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.a.hashCode() ^ 1000003);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("RolloutsState{rolloutAssignments=");
        v0_1.append(this.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
