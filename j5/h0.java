package j5;
public final class h0 extends j5.r1 {
    public final String a;
    public final byte[] b;

    public h0(String p1, byte[] p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if (((p6 instanceof j5.r1)) && (this.a.equals(((j5.h0) ((j5.r1) p6)).a))) {
                boolean v6_1;
                if (!(((j5.r1) p6) instanceof j5.h0)) {
                    v6_1 = ((j5.h0) ((j5.r1) p6)).b;
                } else {
                    v6_1 = ((j5.h0) ((j5.r1) p6)).b;
                }
                if (java.util.Arrays.equals(this.b, v6_1)) {
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
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.b));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("File{filename=");
        v0_2.append(this.a);
        v0_2.append(", contents=");
        v0_2.append(java.util.Arrays.toString(this.b));
        v0_2.append("}");
        return v0_2.toString();
    }
}
