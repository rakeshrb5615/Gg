package j5;
public final class v0 extends j5.a2 {
    public final String a;
    public final int b;
    public final java.util.List c;

    public v0(String p1, int p2, java.util.List p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof j5.a2)) || ((!this.a.equals(((j5.v0) ((j5.a2) p5)).a)) || ((this.b != ((j5.v0) ((j5.a2) p5)).b) || (!this.c.equals(((j5.v0) ((j5.a2) p5)).c))))) {
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
        int v1_1 = 1000003;
        return (((((this.a.hashCode() ^ 1000003) * v1_1) ^ this.b) * v1_1) ^ this.c.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("Thread{name=");
        v0_2.append(this.a);
        v0_2.append(", importance=");
        v0_2.append(this.b);
        v0_2.append(", frames=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
