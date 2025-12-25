package q2;
public final class t extends q2.f0 {
    public final long a;
    public final long b;
    public final q2.n c;
    public final Integer d;
    public final String e;
    public final java.util.ArrayList f;

    public t(long p2, long p4, q2.n p6, Integer p7, String p8, java.util.ArrayList p9)
    {
        this.a = p2;
        this.b = p4;
        this.c = p6;
        this.d = p7;
        this.e = p8;
        this.f = p9;
        return;
    }

    public final boolean equals(Object p10)
    {
        if (p10 != this) {
            if ((p10 instanceof q2.f0)) {
                String v2 = ((q2.t) ((q2.f0) p10)).e;
                Integer v3 = ((q2.t) ((q2.f0) p10)).d;
                if ((this.a == ((q2.t) ((q2.f0) p10)).a) && ((this.b == ((q2.t) ((q2.f0) p10)).b) && (this.c.equals(((q2.t) ((q2.f0) p10)).c)))) {
                    boolean v10_4 = this.d;
                    if (v10_4) {
                        if (!v10_4.equals(v3)) {
                            return 0;
                        }
                    } else {
                        if (v3 != null) {
                            return 0;
                        }
                    }
                    boolean v10_6 = this.e;
                    if (v10_6) {
                        if (!v10_6.equals(v2)) {
                            return 0;
                        }
                    } else {
                        if (v2 != null) {
                            return 0;
                        }
                    }
                    if ((this.f.equals(((q2.t) ((q2.f0) p10)).f)) && (q2.j0.a.equals(q2.j0.a))) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final int hashCode()
    {
        String v3_2;
        int v0_0 = this.a;
        String v3_4 = this.b;
        int v0_4 = ((((((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * 1000003) ^ ((int) ((v3_4 >> 32) ^ v3_4))) * 1000003) ^ this.c.hashCode()) * 1000003);
        int v2_5 = 0;
        String v3_1 = this.d;
        if (v3_1 != null) {
            v3_2 = v3_1.hashCode();
        } else {
            v3_2 = 0;
        }
        int v0_6 = ((v0_4 ^ v3_2) * 1000003);
        String v3_3 = this.e;
        if (v3_3 != null) {
            v2_5 = v3_3.hashCode();
        }
        return (((((v0_6 ^ v2_5) * 1000003) ^ this.f.hashCode()) * 1000003) ^ q2.j0.a.hashCode());
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("LogRequest{requestTimeMs=");
        v0_1.append(this.a);
        v0_1.append(", requestUptimeMs=");
        v0_1.append(this.b);
        v0_1.append(", clientInfo=");
        v0_1.append(this.c);
        v0_1.append(", logSource=");
        v0_1.append(this.d);
        v0_1.append(", logSourceName=");
        v0_1.append(this.e);
        v0_1.append(", logEvents=");
        v0_1.append(this.f);
        v0_1.append(", qosTier=");
        v0_1.append(q2.j0.a);
        v0_1.append("}");
        return v0_1.toString();
    }
}
