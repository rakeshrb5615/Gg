package q2;
public final class m extends q2.w {
    public final java.util.ArrayList a;

    public m(java.util.ArrayList p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if (!(p2 instanceof q2.w)) {
                return 0;
            } else {
                return this.a.equals(((q2.m) ((q2.w) p2)).a);
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
        String v0_1 = new StringBuilder("BatchedLogRequest{logRequests=");
        v0_1.append(this.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
