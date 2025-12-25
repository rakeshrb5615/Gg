package f6;
public final class b {
    public final String a;
    public final long b;
    public final int c;

    public b(String p1, long p2, int p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p4;
        return;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if ((p6 instanceof f6.b)) {
                int v0_1 = ((f6.b) p6).c;
                long v1_1 = ((f6.b) p6).a;
                String v2 = this.a;
                if (v2 != null) {
                    if (!v2.equals(v1_1)) {
                        return 0;
                    }
                } else {
                    if (v1_1 != 0) {
                        return 0;
                    }
                }
                if (this.b == ((f6.b) p6).b) {
                    boolean v6_2 = this.c;
                    if (v6_2) {
                        if (u.e.a(v6_2, v0_1)) {
                            return 1;
                        }
                    } else {
                        if (v0_1 == 0) {
                            return 1;
                        }
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final int hashCode()
    {
        int v1_3;
        int v0_0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_3 = v1_0.hashCode();
        } else {
            v1_3 = 0;
        }
        long v4 = this.b;
        int v1_2 = ((((v1_3 ^ 1000003) * 1000003) ^ ((int) ((v4 >> 32) ^ v4))) * 1000003);
        int v2_0 = this.c;
        if (v2_0 != 0) {
            v0_0 = u.e.c(v2_0);
        }
        return (v0_0 ^ v1_2);
    }

    public final String toString()
    {
        String v1_2;
        String v0_1 = new StringBuilder("TokenResult{token=");
        v0_1.append(this.a);
        v0_1.append(", tokenExpirationTimestamp=");
        v0_1.append(this.b);
        v0_1.append(", responseCode=");
        int v2 = this.c;
        if (v2 == 1) {
            v1_2 = "OK";
        } else {
            if (v2 == 2) {
                v1_2 = "BAD_CONFIG";
            } else {
                if (v2 == 3) {
                    v1_2 = "AUTH_ERROR";
                } else {
                    v1_2 = "null";
                }
            }
        }
        v0_1.append(v1_2);
        v0_1.append("}");
        return v0_1.toString();
    }
}
