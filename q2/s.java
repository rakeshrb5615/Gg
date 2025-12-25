package q2;
public final class s extends q2.e0 {
    public final long a;
    public final Integer b;
    public final q2.a0 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final q2.i0 h;
    public final q2.b0 i;

    public s(long p1, Integer p3, q2.a0 p4, long p5, byte[] p7, String p8, long p9, q2.i0 p11, q2.b0 p12)
    {
        this.a = p1;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p7;
        this.f = p8;
        this.g = p9;
        this.h = p11;
        this.i = p12;
        return;
    }

    public final boolean equals(Object p13)
    {
        if (p13 != this) {
            if ((p13 instanceof q2.e0)) {
                q2.b0 v3 = ((q2.s) ((q2.e0) p13)).i;
                q2.i0 v4 = ((q2.s) ((q2.e0) p13)).h;
                long v5_0 = ((q2.s) ((q2.e0) p13)).f;
                byte[] v6_0 = ((q2.s) ((q2.e0) p13)).c;
                long v7_0 = ((q2.s) ((q2.e0) p13)).b;
                if (this.a == ((q2.s) ((q2.e0) p13)).a) {
                    long v8_2 = this.b;
                    if (v8_2 != 0) {
                        if (!v8_2.equals(v7_0)) {
                            return 0;
                        }
                    } else {
                        if (v7_0 != 0) {
                            return 0;
                        }
                    }
                    long v7_2 = this.c;
                    if (v7_2 != 0) {
                        if (!v7_2.equals(v6_0)) {
                            return 0;
                        }
                    } else {
                        if (v6_0 != null) {
                            return 0;
                        }
                    }
                    if (this.d == ((q2.s) ((q2.e0) p13)).d) {
                        boolean v13_1;
                        if (!(((q2.e0) p13) instanceof q2.s)) {
                            v13_1 = ((q2.s) ((q2.e0) p13)).e;
                        } else {
                            v13_1 = ((q2.s) ((q2.e0) p13)).e;
                        }
                        if (java.util.Arrays.equals(this.e, v13_1)) {
                            boolean v13_4 = this.f;
                            if (v13_4) {
                                if (!v13_4.equals(v5_0)) {
                                    return 0;
                                }
                            } else {
                                if (v5_0 != 0) {
                                    return 0;
                                }
                            }
                            if (this.g == ((q2.s) ((q2.e0) p13)).g) {
                                boolean v13_8 = this.h;
                                if (v13_8) {
                                    if (!v13_8.equals(v4)) {
                                        return 0;
                                    }
                                } else {
                                    if (v4 != null) {
                                        return 0;
                                    }
                                }
                                boolean v13_10 = this.i;
                                if (v13_10) {
                                    if (!v13_10.equals(v3)) {
                                        return 0;
                                    }
                                } else {
                                    if (v3 != null) {
                                        return 0;
                                    }
                                }
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
        long v4_0;
        int v0_0 = this.a;
        int v0_19 = ((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * 1000003);
        int v3_1 = 0;
        long v4_12 = this.b;
        if (v4_12 != 0) {
            v4_0 = v4_12.hashCode();
        } else {
            v4_0 = 0;
        }
        long v4_2;
        int v0_2 = ((v0_19 ^ v4_0) * 1000003);
        long v4_1 = this.c;
        if (v4_1 != 0) {
            v4_2 = v4_1.hashCode();
        } else {
            v4_2 = 0;
        }
        long v4_9;
        long v4_3 = this.d;
        int v0_9 = ((((((v0_2 ^ v4_2) * 1000003) ^ ((int) (v4_3 ^ (v4_3 >> 32)))) * 1000003) ^ java.util.Arrays.hashCode(this.e)) * 1000003);
        long v4_8 = this.f;
        if (v4_8 != 0) {
            v4_9 = v4_8.hashCode();
        } else {
            v4_9 = 0;
        }
        int v2_3;
        long v4_10 = this.g;
        int v0_14 = ((((v0_9 ^ v4_9) * 1000003) ^ ((int) (v4_10 ^ (v4_10 >> 32)))) * 1000003);
        int v2_2 = this.h;
        if (v2_2 != 0) {
            v2_3 = v2_2.hashCode();
        } else {
            v2_3 = 0;
        }
        int v0_16 = ((v0_14 ^ v2_3) * 1000003);
        q2.b0 v1_1 = this.i;
        if (v1_1 != null) {
            v3_1 = v1_1.hashCode();
        }
        return (v0_16 ^ v3_1);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("LogEvent{eventTimeMs=");
        v0_1.append(this.a);
        v0_1.append(", eventCode=");
        v0_1.append(this.b);
        v0_1.append(", complianceData=");
        v0_1.append(this.c);
        v0_1.append(", eventUptimeMs=");
        v0_1.append(this.d);
        v0_1.append(", sourceExtension=");
        v0_1.append(java.util.Arrays.toString(this.e));
        v0_1.append(", sourceExtensionJsonProto3=");
        v0_1.append(this.f);
        v0_1.append(", timezoneOffsetSeconds=");
        v0_1.append(this.g);
        v0_1.append(", networkConnectionInfo=");
        v0_1.append(this.h);
        v0_1.append(", experimentIds=");
        v0_1.append(this.i);
        v0_1.append("}");
        return v0_1.toString();
    }
}
