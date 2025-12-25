package o2;
public final class c {
    public final String a;

    public c(String p2)
    {
        if (p2 == null) {
            throw new NullPointerException("name is null");
        } else {
            this.a = p2;
            return;
        }
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof o2.c)) {
                return this.a.equals(((o2.c) p2).a);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.a.hashCode() ^ 1000003);
    }

    public final String toString()
    {
        return v1.a.n(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
