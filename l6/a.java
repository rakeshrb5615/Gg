package l6;
public final class a {
    public final String a;
    public final String b;

    public a(String p1, String p2)
    {
        this.a = p1;
        if (p2 == null) {
            throw new NullPointerException("Null version");
        } else {
            this.b = p2;
            return;
        }
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof l6.a)) || ((!this.a.equals(((l6.a) p5).a)) || (!this.b.equals(((l6.a) p5).b)))) {
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
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("LibraryVersion{libraryName=");
        v0_2.append(this.a);
        v0_2.append(", version=");
        return v1.a.n(v0_2, this.b, "}");
    }
}
