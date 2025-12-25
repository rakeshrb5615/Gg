package r6;
public final class n0 {
    public final r6.v0 a;
    public final r6.b b;

    public n0(r6.v0 p2, r6.b p3)
    {
        this.a = p2;
        this.b = p3;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((this == p3) || (((p3 instanceof r6.n0)) && ((this.a.equals(((r6.n0) p3).a)) && (this.b.equals(((r6.n0) p3).b))))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return (this.b.hashCode() + ((this.a.hashCode() + (r6.n.b.hashCode() * 31)) * 31));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("SessionEvent(eventType=");
        v0_2.append(r6.n.b);
        v0_2.append(", sessionData=");
        v0_2.append(this.a);
        v0_2.append(", applicationInfo=");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
