package j5;
public final class e0 extends j5.o1 {
    public final String a;
    public final String b;
    public final String c;

    public e0(String p1, String p2, String p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof j5.o1)) || ((!this.a.equals(((j5.e0) ((j5.o1) p5)).a)) || ((!this.b.equals(((j5.e0) ((j5.o1) p5)).b)) || (!this.c.equals(((j5.e0) ((j5.o1) p5)).c))))) {
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
        String v0_2 = new StringBuilder("BuildIdMappingForArch{arch=");
        v0_2.append(this.a);
        v0_2.append(", libraryName=");
        v0_2.append(this.b);
        v0_2.append(", buildId=");
        return v1.a.n(v0_2, this.c, "}");
    }
}
