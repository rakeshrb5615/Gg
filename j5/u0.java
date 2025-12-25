package j5;
public final class u0 extends j5.y1 {
    public final String a;
    public final String b;
    public final long c;

    public u0(String p1, String p2, long p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof j5.y1)) || ((!this.a.equals(((j5.u0) ((j5.y1) p8)).a)) || ((!this.b.equals(((j5.u0) ((j5.y1) p8)).b)) || (this.c != ((j5.u0) ((j5.y1) p8)).c)))) {
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
        long v2_0 = this.c;
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) ((v2_0 >> 32) ^ v2_0)));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("Signal{name=");
        v0_2.append(this.a);
        v0_2.append(", code=");
        v0_2.append(this.b);
        v0_2.append(", address=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
