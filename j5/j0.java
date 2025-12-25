package j5;
public final class j0 extends j5.m2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final j5.u1 g;
    public final j5.l2 h;
    public final j5.k2 i;
    public final j5.v1 j;
    public final java.util.List k;
    public final int l;

    public j0(String p1, String p2, String p3, long p4, Long p6, boolean p7, j5.u1 p8, j5.l2 p9, j5.k2 p10, j5.v1 p11, java.util.List p12, int p13)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p6;
        this.f = p7;
        this.g = p8;
        this.h = p9;
        this.i = p10;
        this.j = p11;
        this.k = p12;
        this.l = p13;
        return;
    }

    public final j5.i0 a()
    {
        j5.i0 v0_1 = new j5.i0();
        v0_1.a = this.a;
        v0_1.b = this.b;
        v0_1.c = this.c;
        v0_1.d = this.d;
        v0_1.e = this.e;
        v0_1.f = this.f;
        v0_1.g = this.g;
        v0_1.h = this.h;
        v0_1.i = this.i;
        v0_1.j = this.j;
        v0_1.k = this.k;
        v0_1.l = this.l;
        v0_1.m = 7;
        return v0_1;
    }

    public final boolean equals(Object p12)
    {
        if (p12 != this) {
            if ((p12 instanceof j5.m2)) {
                int v1_2 = ((j5.j0) ((j5.m2) p12)).k;
                java.util.List v3_2 = ((j5.j0) ((j5.m2) p12)).j;
                j5.v1 v4_2 = ((j5.j0) ((j5.m2) p12)).i;
                j5.k2 v5_0 = ((j5.j0) ((j5.m2) p12)).h;
                j5.l2 v6_0 = ((j5.j0) ((j5.m2) p12)).e;
                j5.u1 v7_0 = ((j5.j0) ((j5.m2) p12)).c;
                if ((this.a.equals(((j5.j0) ((j5.m2) p12)).a)) && (this.b.equals(((j5.j0) ((j5.m2) p12)).b))) {
                    String v8_4 = this.c;
                    if (v8_4 != null) {
                        if (!v8_4.equals(v7_0)) {
                            return 0;
                        }
                    } else {
                        if (v7_0 != null) {
                            return 0;
                        }
                    }
                    if (this.d == ((j5.j0) ((j5.m2) p12)).d) {
                        j5.u1 v7_4 = this.e;
                        if (v7_4 != null) {
                            if (!v7_4.equals(v6_0)) {
                                return 0;
                            }
                        } else {
                            if (v6_0 != null) {
                                return 0;
                            }
                        }
                        if ((this.f == ((j5.j0) ((j5.m2) p12)).f) && (this.g.equals(((j5.j0) ((j5.m2) p12)).g))) {
                            j5.l2 v6_5 = this.h;
                            if (v6_5 != null) {
                                if (!v6_5.equals(v5_0)) {
                                    return 0;
                                }
                            } else {
                                if (v5_0 != null) {
                                    return 0;
                                }
                            }
                            j5.k2 v5_2 = this.i;
                            if (v5_2 != null) {
                                if (!v5_2.equals(v4_2)) {
                                    return 0;
                                }
                            } else {
                                if (v4_2 != null) {
                                    return 0;
                                }
                            }
                            j5.v1 v4_1 = this.j;
                            if (v4_1 != null) {
                                if (!v4_1.equals(v3_2)) {
                                    return 0;
                                }
                            } else {
                                if (v3_2 != null) {
                                    return 0;
                                }
                            }
                            java.util.List v3_1 = this.k;
                            if (v3_1 != null) {
                                if (!v3_1.equals(v1_2)) {
                                    return 0;
                                }
                            } else {
                                if (v1_2 != 0) {
                                    return 0;
                                }
                            }
                            if (this.l == ((j5.j0) ((j5.m2) p12)).l) {
                                return 1;
                            }
                        }
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
        java.util.List v3_1;
        int v0_1 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
        int v2_0 = 0;
        java.util.List v3_0 = this.c;
        if (v3_0 != null) {
            v3_1 = v3_0.hashCode();
        } else {
            v3_1 = 0;
        }
        java.util.List v3_6;
        long v4 = this.d;
        int v0_6 = ((((v0_1 ^ v3_1) * 1000003) ^ ((int) ((v4 >> 32) ^ v4))) * 1000003);
        java.util.List v3_5 = this.e;
        if (v3_5 != null) {
            v3_6 = v3_5.hashCode();
        } else {
            v3_6 = 0;
        }
        java.util.List v3_8;
        if (!this.f) {
            v3_8 = 1237;
        } else {
            v3_8 = 1231;
        }
        java.util.List v3_12;
        int v0_13 = ((((((v0_6 ^ v3_6) * 1000003) ^ v3_8) * 1000003) ^ this.g.hashCode()) * 1000003);
        java.util.List v3_11 = this.h;
        if (v3_11 != null) {
            v3_12 = v3_11.hashCode();
        } else {
            v3_12 = 0;
        }
        java.util.List v3_14;
        int v0_16 = ((v0_13 ^ v3_12) * 1000003);
        java.util.List v3_13 = this.i;
        if (v3_13 != null) {
            v3_14 = v3_13.hashCode();
        } else {
            v3_14 = 0;
        }
        java.util.List v3_16;
        int v0_18 = ((v0_16 ^ v3_14) * 1000003);
        java.util.List v3_15 = this.j;
        if (v3_15 != null) {
            v3_16 = v3_15.hashCode();
        } else {
            v3_16 = 0;
        }
        int v0_20 = ((v0_18 ^ v3_16) * 1000003);
        java.util.List v3_17 = this.k;
        if (v3_17 != null) {
            v2_0 = v3_17.hashCode();
        }
        return (((v0_20 ^ v2_0) * 1000003) ^ this.l);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Session{generator=");
        v0_1.append(this.a);
        v0_1.append(", identifier=");
        v0_1.append(this.b);
        v0_1.append(", appQualitySessionId=");
        v0_1.append(this.c);
        v0_1.append(", startedAt=");
        v0_1.append(this.d);
        v0_1.append(", endedAt=");
        v0_1.append(this.e);
        v0_1.append(", crashed=");
        v0_1.append(this.f);
        v0_1.append(", app=");
        v0_1.append(this.g);
        v0_1.append(", user=");
        v0_1.append(this.h);
        v0_1.append(", os=");
        v0_1.append(this.i);
        v0_1.append(", device=");
        v0_1.append(this.j);
        v0_1.append(", events=");
        v0_1.append(this.k);
        v0_1.append(", generatorType=");
        v0_1.append(this.l);
        v0_1.append("}");
        return v0_1.toString();
    }
}
