package q2;
public final class n extends q2.y {
    public final q2.l a;

    public n(q2.l p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((p2 != this) && ((!(p2 instanceof q2.y)) || ((!q2.x.a.equals(q2.x.a)) || (!this.a.equals(((q2.n) ((q2.y) p2)).a))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((q2.x.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("ClientInfo{clientType=");
        v0_2.append(q2.x.a);
        v0_2.append(", androidClientInfo=");
        v0_2.append(this.a);
        v0_2.append("}");
        return v0_2.toString();
    }
}
