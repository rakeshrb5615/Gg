package q2;
public final class v extends q2.i0 {
    public final q2.h0 a;
    public final q2.g0 b;

    public v(q2.h0 p1, q2.g0 p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof q2.i0)) {
                q2.g0 v1_6 = this.a;
                if (v1_6 != null) {
                    if (!v1_6.equals(((q2.v) ((q2.i0) p5)).a)) {
                        return 0;
                    }
                } else {
                    if (((q2.v) ((q2.i0) p5)).a != null) {
                        return 0;
                    }
                }
                q2.g0 v1_4 = this.b;
                if (v1_4 != null) {
                    if (!v1_4.equals(((q2.v) ((q2.i0) p5)).b)) {
                        return 0;
                    }
                } else {
                    if (((q2.v) ((q2.i0) p5)).b != null) {
                        return 0;
                    }
                }
                return 1;
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        int v1_3 = ((v1_1 ^ 1000003) * 1000003);
        q2.g0 v2_1 = this.b;
        if (v2_1 != null) {
            v0_0 = v2_1.hashCode();
        }
        return (v0_0 ^ v1_3);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("NetworkConnectionInfo{networkType=");
        v0_2.append(this.a);
        v0_2.append(", mobileSubtype=");
        v0_2.append(this.b);
        v0_2.append("}");
        return v0_2.toString();
    }
}
