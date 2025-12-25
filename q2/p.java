package q2;
public final class p extends q2.b0 {
    public final byte[] a;
    public final byte[] b;

    public p(byte[] p1, byte[] p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if ((p6 instanceof q2.b0)) {
                boolean v3_0;
                byte[] v1_2 = (((q2.b0) p6) instanceof q2.p);
                if (v1_2 == null) {
                    v3_0 = ((q2.p) ((q2.b0) p6)).a;
                } else {
                    v3_0 = ((q2.p) ((q2.b0) p6)).a;
                }
                if (java.util.Arrays.equals(this.a, v3_0)) {
                    boolean v6_2;
                    if (v1_2 == null) {
                        v6_2 = ((q2.p) ((q2.b0) p6)).b;
                    } else {
                        v6_2 = ((q2.p) ((q2.b0) p6)).b;
                    }
                    if (java.util.Arrays.equals(this.b, v6_2)) {
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
        return (((java.util.Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.b));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("ExperimentIds{clearBlob=");
        v0_2.append(java.util.Arrays.toString(this.a));
        v0_2.append(", encryptedBlob=");
        v0_2.append(java.util.Arrays.toString(this.b));
        v0_2.append("}");
        return v0_2.toString();
    }
}
