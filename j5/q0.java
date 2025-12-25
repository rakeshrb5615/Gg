package j5;
public final class q0 extends j5.d2 {
    public final j5.r0 a;
    public final java.util.List b;
    public final java.util.List c;
    public final Boolean d;
    public final j5.c2 e;
    public final java.util.List f;
    public final int g;

    public q0(j5.r0 p1, java.util.List p2, java.util.List p3, Boolean p4, j5.c2 p5, java.util.List p6, int p7)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((p8 instanceof j5.d2)) {
                int v0_3 = ((j5.q0) ((j5.d2) p8)).f;
                java.util.List v1_2 = ((j5.q0) ((j5.d2) p8)).e;
                j5.c2 v2_2 = ((j5.q0) ((j5.d2) p8)).d;
                Boolean v3_2 = ((j5.q0) ((j5.d2) p8)).c;
                java.util.List v4_2 = ((j5.q0) ((j5.d2) p8)).b;
                if (this.a.equals(((j5.q0) ((j5.d2) p8)).a)) {
                    java.util.List v5_2 = this.b;
                    if (v5_2 != null) {
                        if (!v5_2.equals(v4_2)) {
                            return 0;
                        }
                    } else {
                        if (v4_2 != null) {
                            return 0;
                        }
                    }
                    java.util.List v4_1 = this.c;
                    if (v4_1 != null) {
                        if (!v4_1.equals(v3_2)) {
                            return 0;
                        }
                    } else {
                        if (v3_2 != null) {
                            return 0;
                        }
                    }
                    Boolean v3_1 = this.d;
                    if (v3_1 != null) {
                        if (!v3_1.equals(v2_2)) {
                            return 0;
                        }
                    } else {
                        if (v2_2 != null) {
                            return 0;
                        }
                    }
                    j5.c2 v2_1 = this.e;
                    if (v2_1 != null) {
                        if (!v2_1.equals(v1_2)) {
                            return 0;
                        }
                    } else {
                        if (v1_2 != null) {
                            return 0;
                        }
                    }
                    java.util.List v1_1 = this.f;
                    if (v1_1 != null) {
                        if (!v1_1.equals(v0_3)) {
                            return 0;
                        }
                    } else {
                        if (v0_3 != 0) {
                            return 0;
                        }
                    }
                    if (this.g == ((j5.q0) ((j5.d2) p8)).g) {
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
        java.util.List v3_0;
        int v0_14 = ((this.a.hashCode() ^ 1000003) * 1000003);
        int v2 = 0;
        java.util.List v3_8 = this.b;
        if (v3_8 != null) {
            v3_0 = v3_8.hashCode();
        } else {
            v3_0 = 0;
        }
        java.util.List v3_2;
        int v0_2 = ((v0_14 ^ v3_0) * 1000003);
        java.util.List v3_1 = this.c;
        if (v3_1 != null) {
            v3_2 = v3_1.hashCode();
        } else {
            v3_2 = 0;
        }
        java.util.List v3_4;
        int v0_5 = ((v0_2 ^ v3_2) * 1000003);
        java.util.List v3_3 = this.d;
        if (v3_3 != null) {
            v3_4 = v3_3.hashCode();
        } else {
            v3_4 = 0;
        }
        java.util.List v3_6;
        int v0_7 = ((v0_5 ^ v3_4) * 1000003);
        java.util.List v3_5 = this.e;
        if (v3_5 != null) {
            v3_6 = v3_5.hashCode();
        } else {
            v3_6 = 0;
        }
        int v0_9 = ((v0_7 ^ v3_6) * 1000003);
        java.util.List v3_7 = this.f;
        if (v3_7 != null) {
            v2 = v3_7.hashCode();
        }
        return (((v0_9 ^ v2) * 1000003) ^ this.g);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Application{execution=");
        v0_1.append(this.a);
        v0_1.append(", customAttributes=");
        v0_1.append(this.b);
        v0_1.append(", internalKeys=");
        v0_1.append(this.c);
        v0_1.append(", background=");
        v0_1.append(this.d);
        v0_1.append(", currentProcessDetails=");
        v0_1.append(this.e);
        v0_1.append(", appProcessDetails=");
        v0_1.append(this.f);
        v0_1.append(", uiOrientation=");
        v0_1.append(this.g);
        v0_1.append("}");
        return v0_1.toString();
    }
}
