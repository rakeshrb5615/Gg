package j5;
public final class r0 extends j5.b2 {
    public final java.util.List a;
    public final j5.x1 b;
    public final j5.p1 c;
    public final j5.u0 d;
    public final java.util.List e;

    public r0(java.util.List p1, j5.t0 p2, j5.p1 p3, j5.u0 p4, java.util.List p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final boolean equals(Object p3)
    {
        if (p3 != this) {
            if ((p3 instanceof j5.b2)) {
                java.util.List v0_15 = this.a;
                if (v0_15 != null) {
                    if (!v0_15.equals(((j5.r0) ((j5.b2) p3)).a)) {
                        return 0;
                    }
                } else {
                    if (((j5.r0) ((j5.b2) p3)).a != null) {
                        return 0;
                    }
                }
                java.util.List v0_5 = this.b;
                if (v0_5 != null) {
                    if (!v0_5.equals(((j5.r0) ((j5.b2) p3)).b)) {
                        return 0;
                    }
                } else {
                    if (((j5.r0) ((j5.b2) p3)).b != null) {
                        return 0;
                    }
                }
                java.util.List v0_10 = this.c;
                if (v0_10 != null) {
                    if (!v0_10.equals(((j5.r0) ((j5.b2) p3)).c)) {
                        return 0;
                    }
                } else {
                    if (((j5.r0) ((j5.b2) p3)).c != null) {
                        return 0;
                    }
                }
                if ((this.d.equals(((j5.r0) ((j5.b2) p3)).d)) && (this.e.equals(((j5.r0) ((j5.b2) p3)).e))) {
                    return 1;
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
        j5.p1 v3_0;
        int v1_9 = ((v1_7 ^ 1000003) * 1000003);
        j5.p1 v3_2 = this.b;
        if (v3_2 != null) {
            v3_0 = v3_2.hashCode();
        } else {
            v3_0 = 0;
        }
        int v1_2 = ((v1_9 ^ v3_0) * 1000003);
        j5.p1 v3_1 = this.c;
        if (v3_1 != null) {
            v0_0 = v3_1.hashCode();
        }
        return (((((v0_0 ^ v1_2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode());
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Execution{threads=");
        v0_1.append(this.a);
        v0_1.append(", exception=");
        v0_1.append(this.b);
        v0_1.append(", appExitInfo=");
        v0_1.append(this.c);
        v0_1.append(", signal=");
        v0_1.append(this.d);
        v0_1.append(", binaries=");
        v0_1.append(this.e);
        v0_1.append("}");
        return v0_1.toString();
    }
}
