package j5;
public final class b0 extends j5.n2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final j5.m2 k;
    public final j5.s1 l;
    public final j5.p1 m;

    public b0(String p1, String p2, int p3, String p4, String p5, String p6, String p7, String p8, String p9, j5.m2 p10, j5.s1 p11, j5.p1 p12)
    {
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
        this.h = p7;
        this.i = p8;
        this.j = p9;
        this.k = p10;
        this.l = p11;
        this.m = p12;
        return;
    }

    public final j5.a0 a()
    {
        j5.a0 v0_1 = new j5.a0();
        v0_1.a = this.b;
        v0_1.b = this.c;
        v0_1.c = this.d;
        v0_1.d = this.e;
        v0_1.e = this.f;
        v0_1.f = this.g;
        v0_1.g = this.h;
        v0_1.h = this.i;
        v0_1.i = this.j;
        v0_1.j = this.k;
        v0_1.k = this.l;
        v0_1.l = this.m;
        v0_1.m = 1;
        return v0_1;
    }

    public final boolean equals(Object p11)
    {
        if (p11 != this) {
            if ((p11 instanceof j5.n2)) {
                j5.p1 v1_1 = ((j5.b0) ((j5.n2) p11)).m;
                j5.s1 v3 = ((j5.b0) ((j5.n2) p11)).l;
                j5.m2 v4 = ((j5.b0) ((j5.n2) p11)).k;
                String v5_0 = ((j5.b0) ((j5.n2) p11)).h;
                String v6_0 = ((j5.b0) ((j5.n2) p11)).g;
                String v7_0 = ((j5.b0) ((j5.n2) p11)).f;
                if ((this.b.equals(((j5.b0) ((j5.n2) p11)).b)) && ((this.c.equals(((j5.b0) ((j5.n2) p11)).c)) && ((this.d == ((j5.b0) ((j5.n2) p11)).d) && (this.e.equals(((j5.b0) ((j5.n2) p11)).e))))) {
                    String v8_7 = this.f;
                    if (v8_7 != null) {
                        if (!v8_7.equals(v7_0)) {
                            return 0;
                        }
                    } else {
                        if (v7_0 != null) {
                            return 0;
                        }
                    }
                    String v7_2 = this.g;
                    if (v7_2 != null) {
                        if (!v7_2.equals(v6_0)) {
                            return 0;
                        }
                    } else {
                        if (v6_0 != null) {
                            return 0;
                        }
                    }
                    String v6_2 = this.h;
                    if (v6_2 != null) {
                        if (!v6_2.equals(v5_0)) {
                            return 0;
                        }
                    } else {
                        if (v5_0 != null) {
                            return 0;
                        }
                    }
                    if ((this.i.equals(((j5.b0) ((j5.n2) p11)).i)) && (this.j.equals(((j5.b0) ((j5.n2) p11)).j))) {
                        boolean v11_4 = this.k;
                        if (v11_4) {
                            if (!v11_4.equals(v4)) {
                                return 0;
                            }
                        } else {
                            if (v4 != null) {
                                return 0;
                            }
                        }
                        boolean v11_7 = this.l;
                        if (v11_7) {
                            if (!v11_7.equals(v3)) {
                                return 0;
                            }
                        } else {
                            if (v3 != null) {
                                return 0;
                            }
                        }
                        boolean v11_9 = this.m;
                        if (v11_9) {
                            if (!v11_9.equals(v1_1)) {
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
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v3_1;
        j5.p1 v1_0 = 1000003;
        int v0_5 = ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * v1_0) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003);
        int v2_3 = 0;
        int v3_0 = this.f;
        if (v3_0 != 0) {
            v3_1 = v3_0.hashCode();
        } else {
            v3_1 = 0;
        }
        int v3_3;
        int v0_8 = ((v0_5 ^ v3_1) * 1000003);
        int v3_2 = this.g;
        if (v3_2 != 0) {
            v3_3 = v3_2.hashCode();
        } else {
            v3_3 = 0;
        }
        int v3_5;
        int v0_10 = ((v0_8 ^ v3_3) * 1000003);
        int v3_4 = this.h;
        if (v3_4 != 0) {
            v3_5 = v3_4.hashCode();
        } else {
            v3_5 = 0;
        }
        int v3_11;
        int v0_18 = ((((((v0_10 ^ v3_5) * 1000003) ^ this.i.hashCode()) * v1_0) ^ this.j.hashCode()) * v1_0);
        int v3_10 = this.k;
        if (v3_10 != 0) {
            v3_11 = v3_10.hashCode();
        } else {
            v3_11 = 0;
        }
        int v3_13;
        int v0_20 = ((v0_18 ^ v3_11) * 1000003);
        int v3_12 = this.l;
        if (v3_12 != 0) {
            v3_13 = v3_12.hashCode();
        } else {
            v3_13 = 0;
        }
        int v0_22 = ((v0_20 ^ v3_13) * 1000003);
        j5.p1 v1_1 = this.m;
        if (v1_1 != null) {
            v2_3 = v1_1.hashCode();
        }
        return (v0_22 ^ v2_3);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("CrashlyticsReport{sdkVersion=");
        v0_1.append(this.b);
        v0_1.append(", gmpAppId=");
        v0_1.append(this.c);
        v0_1.append(", platform=");
        v0_1.append(this.d);
        v0_1.append(", installationUuid=");
        v0_1.append(this.e);
        v0_1.append(", firebaseInstallationId=");
        v0_1.append(this.f);
        v0_1.append(", firebaseAuthenticationToken=");
        v0_1.append(this.g);
        v0_1.append(", appQualitySessionId=");
        v0_1.append(this.h);
        v0_1.append(", buildVersion=");
        v0_1.append(this.i);
        v0_1.append(", displayVersion=");
        v0_1.append(this.j);
        v0_1.append(", session=");
        v0_1.append(this.k);
        v0_1.append(", ndkPayload=");
        v0_1.append(this.l);
        v0_1.append(", appExitInfo=");
        v0_1.append(this.m);
        v0_1.append("}");
        return v0_1.toString();
    }
}
