package j5;
public final class t0 extends j5.x1 {
    public final String a;
    public final String b;
    public final java.util.List c;
    public final j5.x1 d;
    public final int e;

    public t0(String p1, String p2, java.util.List p3, j5.x1 p4, int p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof j5.x1)) {
                int v1_3 = ((j5.t0) ((j5.x1) p7)).d;
                j5.x1 v3_4 = ((j5.t0) ((j5.x1) p7)).b;
                if (this.a.equals(((j5.t0) ((j5.x1) p7)).a)) {
                    java.util.List v4_1 = this.b;
                    if (v4_1 != null) {
                        if (!v4_1.equals(v3_4)) {
                            return 0;
                        }
                    } else {
                        if (v3_4 != null) {
                            return 0;
                        }
                    }
                    if (this.c.equals(((j5.t0) ((j5.x1) p7)).c)) {
                        j5.x1 v3_3 = this.d;
                        if (v3_3 != null) {
                            if (!v3_3.equals(v1_3)) {
                                return 0;
                            }
                        } else {
                            if (v1_3 != 0) {
                                return 0;
                            }
                        }
                        if (this.e == ((j5.t0) ((j5.x1) p7)).e) {
                            return 1;
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
        j5.x1 v3_0;
        int v0_10 = ((this.a.hashCode() ^ 1000003) * 1000003);
        int v2 = 0;
        j5.x1 v3_4 = this.b;
        if (v3_4 != null) {
            v3_0 = v3_4.hashCode();
        } else {
            v3_0 = 0;
        }
        int v0_4 = ((((v0_10 ^ v3_0) * 1000003) ^ this.c.hashCode()) * 1000003);
        j5.x1 v3_3 = this.d;
        if (v3_3 != null) {
            v2 = v3_3.hashCode();
        }
        return (((v0_4 ^ v2) * 1000003) ^ this.e);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Exception{type=");
        v0_1.append(this.a);
        v0_1.append(", reason=");
        v0_1.append(this.b);
        v0_1.append(", frames=");
        v0_1.append(this.c);
        v0_1.append(", causedBy=");
        v0_1.append(this.d);
        v0_1.append(", overflowCount=");
        v0_1.append(this.e);
        v0_1.append("}");
        return v0_1.toString();
    }
}
