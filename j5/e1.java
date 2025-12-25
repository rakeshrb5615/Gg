package j5;
public final class e1 extends j5.h2 {
    public final j5.g2 a;
    public final String b;
    public final String c;
    public final long d;

    public e1(j5.f1 p1, String p2, String p3, long p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof j5.h2)) || ((!this.a.equals(((j5.e1) ((j5.h2) p8)).a)) || ((!this.b.equals(((j5.e1) ((j5.h2) p8)).b)) || ((!this.c.equals(((j5.e1) ((j5.h2) p8)).c)) || (this.d != ((j5.e1) ((j5.h2) p8)).d))))) {
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
        long v2_2 = this.d;
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) ((v2_2 >> 32) ^ v2_2)));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        v0_1.append(this.a);
        v0_1.append(", parameterKey=");
        v0_1.append(this.b);
        v0_1.append(", parameterValue=");
        v0_1.append(this.c);
        v0_1.append(", templateVersion=");
        v0_1.append(this.d);
        v0_1.append("}");
        return v0_1.toString();
    }
}
