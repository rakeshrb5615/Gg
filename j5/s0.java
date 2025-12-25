package j5;
public final class s0 extends j5.w1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public s0(long p1, long p3, String p5, String p6)
    {
        this.a = p1;
        this.b = p3;
        this.c = p5;
        this.d = p6;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((p8 instanceof j5.w1)) {
                String v1_1 = ((j5.s0) ((j5.w1) p8)).d;
                if ((this.a == ((j5.s0) ((j5.w1) p8)).a) && ((this.b == ((j5.s0) ((j5.w1) p8)).b) && (this.c.equals(((j5.s0) ((j5.w1) p8)).c)))) {
                    boolean v8_3 = this.d;
                    if (v8_3) {
                        if (!v8_3.equals(v1_1)) {
                            return 0;
                        }
                    } else {
                        if (v1_1 != null) {
                            return 0;
                        }
                    }
                    return 1;
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_0 = this.a;
        long v3_1 = this.b;
        int v0_4 = ((((((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * 1000003) ^ ((int) ((v3_1 >> 32) ^ v3_1))) * 1000003) ^ this.c.hashCode()) * 1000003);
        int v1_0 = this.d;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        return (v0_4 ^ v1_1);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("BinaryImage{baseAddress=");
        v0_2.append(this.a);
        v0_2.append(", size=");
        v0_2.append(this.b);
        v0_2.append(", name=");
        v0_2.append(this.c);
        v0_2.append(", uuid=");
        return v1.a.n(v0_2, this.d, "}");
    }
}
