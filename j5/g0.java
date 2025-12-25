package j5;
public final class g0 extends j5.s1 {
    public final java.util.List a;
    public final String b;

    public g0(java.util.List p1, String p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof j5.s1)) {
                String v1_1 = ((j5.g0) ((j5.s1) p5)).b;
                if (this.a.equals(((j5.g0) ((j5.s1) p5)).a)) {
                    boolean v5_2 = this.b;
                    if (v5_2) {
                        if (!v5_2.equals(v1_1)) {
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
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_0;
        int v0_4 = ((this.a.hashCode() ^ 1000003) * 1000003);
        int v1_2 = this.b;
        if (v1_2 != 0) {
            v1_0 = v1_2.hashCode();
        } else {
            v1_0 = 0;
        }
        return (v0_4 ^ v1_0);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("FilesPayload{files=");
        v0_2.append(this.a);
        v0_2.append(", orgId=");
        return v1.a.n(v0_2, this.b, "}");
    }
}
