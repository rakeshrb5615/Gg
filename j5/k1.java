package j5;
public final class k1 {
    public final j5.l1 a;
    public final j5.n1 b;
    public final j5.m1 c;

    public k1(j5.l1 p1, j5.n1 p2, j5.m1 p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof j5.k1)) || ((!this.a.equals(((j5.k1) p5).a)) || ((!this.b.equals(((j5.k1) p5).b)) || (!this.c.equals(((j5.k1) p5).c))))) {
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
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("StaticSessionData{appData=");
        v0_2.append(this.a);
        v0_2.append(", osData=");
        v0_2.append(this.b);
        v0_2.append(", deviceData=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
