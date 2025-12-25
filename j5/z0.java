package j5;
public final class z0 extends j5.c2 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public z0(String p1, int p2, int p3, boolean p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof j5.c2)) || ((!this.a.equals(((j5.z0) ((j5.c2) p5)).a)) || ((this.b != ((j5.z0) ((j5.c2) p5)).b) || ((this.c != ((j5.z0) ((j5.c2) p5)).c) || (this.d != ((j5.z0) ((j5.c2) p5)).d))))) {
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
        int v1_1;
        int v1_2 = 1000003;
        int v0_5 = (this.a.hashCode() ^ 1000003);
        if (!this.d) {
            v1_1 = 1237;
        } else {
            v1_1 = 1231;
        }
        return ((((((v0_5 * v1_2) ^ this.b) * v1_2) ^ this.c) * v1_2) ^ v1_1);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("ProcessDetails{processName=");
        v0_1.append(this.a);
        v0_1.append(", pid=");
        v0_1.append(this.b);
        v0_1.append(", importance=");
        v0_1.append(this.c);
        v0_1.append(", defaultProcess=");
        v0_1.append(this.d);
        v0_1.append("}");
        return v0_1.toString();
    }
}
