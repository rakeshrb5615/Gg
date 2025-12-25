package j5;
public final class i1 extends j5.k2 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public i1(String p1, String p2, int p3, boolean p4)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        this.d = p4;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof j5.k2)) || ((this.a != ((j5.i1) ((j5.k2) p5)).a) || ((!this.b.equals(((j5.i1) ((j5.k2) p5)).b)) || ((!this.c.equals(((j5.i1) ((j5.k2) p5)).c)) || (this.d != ((j5.i1) ((j5.k2) p5)).d))))) {
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
        int v1_2;
        int v0_1 = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode());
        if (!this.d) {
            v1_2 = 1237;
        } else {
            v1_2 = 1231;
        }
        return ((v0_1 * 1000003) ^ v1_2);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("OperatingSystem{platform=");
        v0_1.append(this.a);
        v0_1.append(", version=");
        v0_1.append(this.b);
        v0_1.append(", buildVersion=");
        v0_1.append(this.c);
        v0_1.append(", jailbroken=");
        v0_1.append(this.d);
        v0_1.append("}");
        return v0_1.toString();
    }
}
