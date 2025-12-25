package q6;
public final class d {
    public final java.util.HashSet a;

    public d(java.util.HashSet p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if (!(p2 instanceof q6.d)) {
                return 0;
            } else {
                return this.a.equals(((q6.d) p2).a);
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
