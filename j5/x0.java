package j5;
public final class x0 extends j5.z1 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public x0(long p1, String p3, String p4, long p5, int p7)
    {
        this.a = p1;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p7;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((p8 instanceof j5.z1)) {
                int v1_4 = ((j5.x0) ((j5.z1) p8)).c;
                if ((this.a == ((j5.x0) ((j5.z1) p8)).a) && (this.b.equals(((j5.x0) ((j5.z1) p8)).b))) {
                    long v3_3 = this.c;
                    if (v3_3 != 0) {
                        if (!v3_3.equals(v1_4)) {
                            return 0;
                        }
                    } else {
                        if (v1_4 != 0) {
                            return 0;
                        }
                    }
                    if ((this.d == ((j5.x0) ((j5.z1) p8)).d) && (this.e == ((j5.x0) ((j5.z1) p8)).e)) {
                        return 1;
                    }
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        long v3_2;
        int v0_0 = this.a;
        int v0_2 = ((((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
        long v3_1 = this.c;
        if (v3_1 != 0) {
            v3_2 = v3_1.hashCode();
        } else {
            v3_2 = 0;
        }
        long v3_4 = this.d;
        return (((((v0_2 ^ v3_2) * 1000003) ^ ((int) ((v3_4 >> 32) ^ v3_4))) * 1000003) ^ this.e);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Frame{pc=");
        v0_1.append(this.a);
        v0_1.append(", symbol=");
        v0_1.append(this.b);
        v0_1.append(", file=");
        v0_1.append(this.c);
        v0_1.append(", offset=");
        v0_1.append(this.d);
        v0_1.append(", importance=");
        v0_1.append(this.e);
        v0_1.append("}");
        return v0_1.toString();
    }
}
