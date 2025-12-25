package j5;
public final class b1 extends j5.e2 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public b1(Double p1, int p2, boolean p3, int p4, long p5, long p7)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p7;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((p8 instanceof j5.e2)) {
                long v1_9 = this.a;
                if (v1_9 != 0) {
                    if (!v1_9.equals(((j5.b1) ((j5.e2) p8)).a)) {
                        return 0;
                    }
                } else {
                    if (((j5.b1) ((j5.e2) p8)).a != null) {
                        return 0;
                    }
                }
                if ((this.b == ((j5.b1) ((j5.e2) p8)).b) && ((this.c == ((j5.b1) ((j5.e2) p8)).c) && ((this.d == ((j5.b1) ((j5.e2) p8)).d) && ((this.e == ((j5.b1) ((j5.e2) p8)).e) && (this.f == ((j5.b1) ((j5.e2) p8)).f))))) {
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
        int v0_8;
        int v0_0 = this.a;
        if (v0_0 != 0) {
            v0_8 = v0_0.hashCode();
        } else {
            v0_8 = 0;
        }
        int v2_1;
        if (!this.c) {
            v2_1 = 1237;
        } else {
            v2_1 = 1231;
        }
        int v2_3 = this.e;
        int v1_0 = this.f;
        return (((((((((((v0_8 ^ 1000003) * 1000003) ^ this.b) * int v1_3) ^ v2_1) * 1000003) ^ this.d) * 1000003) ^ ((int) (v2_3 ^ (v2_3 >> 32)))) * 1000003) ^ ((int) (v1_0 ^ (v1_0 >> 32))));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Device{batteryLevel=");
        v0_1.append(this.a);
        v0_1.append(", batteryVelocity=");
        v0_1.append(this.b);
        v0_1.append(", proximityOn=");
        v0_1.append(this.c);
        v0_1.append(", orientation=");
        v0_1.append(this.d);
        v0_1.append(", ramUsed=");
        v0_1.append(this.e);
        v0_1.append(", diskUsed=");
        v0_1.append(this.f);
        v0_1.append("}");
        return v0_1.toString();
    }
}
