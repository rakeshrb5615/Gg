package r2;
public final class m {
    public final o2.c a;
    public final byte[] b;

    public m(o2.c p1, byte[] p2)
    {
        if (p1 == null) {
            throw new NullPointerException("encoding is null");
        } else {
            if (p2 == null) {
                throw new NullPointerException("bytes is null");
            } else {
                this.a = p1;
                this.b = p2;
                return;
            }
        }
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof r2.m)) {
                if (this.a.equals(((r2.m) p4).a)) {
                    return java.util.Arrays.equals(this.b, ((r2.m) p4).b);
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
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
        String v0_1 = new StringBuilder("EncodedPayload{encoding=");
        v0_1.append(this.a);
        v0_1.append(", bytes=[...]}");
        return v0_1.toString();
    }
}
