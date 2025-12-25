package q2;
public final class r extends q2.d0 {
    public final q2.q a;

    public r(q2.q p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if (!(p2 instanceof q2.d0)) {
                return 0;
            } else {
                return this.a.equals(((q2.r) ((q2.d0) p2)).a);
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
        String v0_1 = new StringBuilder("ExternalPrivacyContext{prequest=");
        v0_1.append(this.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
