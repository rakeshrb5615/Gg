package p;
public final class c implements java.util.Map$Entry {
    public final Object a;
    public final Object b;
    public p.c c;
    public p.c d;

    public c(Object p1, Object p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof p.c)) {
                if ((!this.a.equals(((p.c) p5).a)) || (!this.b.equals(((p.c) p5).b))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final Object getKey()
    {
        return this.a;
    }

    public final Object getValue()
    {
        return this.b;
    }

    public final int hashCode()
    {
        return (this.a.hashCode() ^ this.b.hashCode());
    }

    public final Object setValue(Object p2)
    {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append("=");
        v0_1.append(this.b);
        return v0_1.toString();
    }
}
