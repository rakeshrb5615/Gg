package f6;
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final f6.b d;
    public final int e;

    public a(String p1, String p2, String p3, f6.b p4, int p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if ((p6 instanceof f6.a)) {
                int v0_1 = ((f6.a) p6).e;
                f6.b v1 = ((f6.a) p6).d;
                String v2 = ((f6.a) p6).c;
                String v3 = ((f6.a) p6).b;
                boolean v6_13 = ((f6.a) p6).a;
                String v4 = this.a;
                if (v4 != null) {
                    if (!v4.equals(v6_13)) {
                        return 0;
                    }
                } else {
                    if (v6_13) {
                        return 0;
                    }
                }
                boolean v6_2 = this.b;
                if (v6_2) {
                    if (!v6_2.equals(v3)) {
                        return 0;
                    }
                } else {
                    if (v3 != null) {
                        return 0;
                    }
                }
                boolean v6_4 = this.c;
                if (v6_4) {
                    if (!v6_4.equals(v2)) {
                        return 0;
                    }
                } else {
                    if (v2 != null) {
                        return 0;
                    }
                }
                boolean v6_6 = this.d;
                if (v6_6) {
                    if (!v6_6.equals(v1)) {
                        return 0;
                    }
                } else {
                    if (v1 != null) {
                        return 0;
                    }
                }
                boolean v6_9 = this.e;
                if (v6_9) {
                    if (u.e.a(v6_9, v0_1)) {
                        return 1;
                    }
                } else {
                    if (v0_1 == 0) {
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
        int v1_7;
        int v0_0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_7 = v1_0.hashCode();
        } else {
            v1_7 = 0;
        }
        int v3_0;
        int v1_9 = ((v1_7 ^ 1000003) * 1000003);
        int v3_5 = this.b;
        if (v3_5 != 0) {
            v3_0 = v3_5.hashCode();
        } else {
            v3_0 = 0;
        }
        int v3_2;
        int v1_2 = ((v1_9 ^ v3_0) * 1000003);
        int v3_1 = this.c;
        if (v3_1 != 0) {
            v3_2 = v3_1.hashCode();
        } else {
            v3_2 = 0;
        }
        int v3_4;
        int v1_4 = ((v1_2 ^ v3_2) * 1000003);
        int v3_3 = this.d;
        if (v3_3 != 0) {
            v3_4 = v3_3.hashCode();
        } else {
            v3_4 = 0;
        }
        int v1_6 = ((v1_4 ^ v3_4) * 1000003);
        int v2_0 = this.e;
        if (v2_0 != 0) {
            v0_0 = u.e.c(v2_0);
        }
        return (v0_0 ^ v1_6);
    }

    public final String toString()
    {
        String v1_6;
        String v0_1 = new StringBuilder("InstallationResponse{uri=");
        v0_1.append(this.a);
        v0_1.append(", fid=");
        v0_1.append(this.b);
        v0_1.append(", refreshToken=");
        v0_1.append(this.c);
        v0_1.append(", authToken=");
        v0_1.append(this.d);
        v0_1.append(", responseCode=");
        int v2 = this.e;
        if (v2 == 1) {
            v1_6 = "OK";
        } else {
            if (v2 == 2) {
                v1_6 = "BAD_CONFIG";
            } else {
                v1_6 = "null";
            }
        }
        v0_1.append(v1_6);
        v0_1.append("}");
        return v0_1.toString();
    }
}
