package q2;
public final class o extends q2.a0 {
    public final q2.r a;

    public o(q2.r p2)
    {
        this.a = p2;
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((p2 != this) && ((!(p2 instanceof q2.a0)) || ((!this.a.equals(((q2.o) ((q2.a0) p2)).a)) || (!q2.z.a.equals(q2.z.a))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ q2.z.a.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("ComplianceData{privacyContext=");
        v0_2.append(this.a);
        v0_2.append(", productIdOrigin=");
        v0_2.append(q2.z.a);
        v0_2.append("}");
        return v0_2.toString();
    }
}
