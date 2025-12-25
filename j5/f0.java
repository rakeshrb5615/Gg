package j5;
public final class f0 extends j5.q1 {
    public final String a;
    public final String b;

    public f0(String p1, String p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof j5.q1)) || ((!this.a.equals(((j5.f0) ((j5.q1) p5)).a)) || (!this.b.equals(((j5.f0) ((j5.q1) p5)).b)))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("CustomAttribute{key=");
        v0_2.append(this.a);
        v0_2.append(", value=");
        return v1.a.n(v0_2, this.b, "}");
    }
}
