package r2;
public final class j {
    public final String a;
    public final byte[] b;
    public final o2.d c;

    public j(String p1, byte[] p2, o2.d p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static b8.g a()
    {
        b8.g v0_1 = new b8.g(11);
        v0_1.d = o2.d.a;
        return v0_1;
    }

    public final r2.j b(o2.d p3)
    {
        String v0_0 = r2.j.a();
        v0_0.t(this.a);
        if (p3 == null) {
            throw new NullPointerException("Null priority");
        } else {
            v0_0.d = p3;
            v0_0.c = this.b;
            return v0_0.a();
        }
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof r2.j)) || ((!this.a.equals(((r2.j) p5).a)) || ((!java.util.Arrays.equals(this.b, ((r2.j) p5).b)) || (!this.c.equals(((r2.j) p5).c))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode());
    }

    public final String toString()
    {
        String v0_2;
        String v0_0 = this.b;
        if (v0_0 != null) {
            v0_2 = android.util.Base64.encodeToString(v0_0, 2);
        } else {
            v0_2 = "";
        }
        StringBuilder v1_2 = new StringBuilder("TransportContext(");
        v1_2.append(this.a);
        v1_2.append(", ");
        v1_2.append(this.c);
        v1_2.append(", ");
        return v1.a.n(v1_2, v0_2, ")");
    }
}
