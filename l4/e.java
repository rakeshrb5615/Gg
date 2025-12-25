package l4;
public final class e extends l4.d {
    public final Object a;

    public e(Object p1)
    {
        this.a = p1;
        return;
    }

    public final Object a()
    {
        return this.a;
    }

    public final boolean b()
    {
        return 1;
    }

    public final boolean equals(Object p2)
    {
        if (!(p2 instanceof l4.e)) {
            return 0;
        } else {
            return this.a.equals(((l4.e) p2).a);
        }
    }

    public final int hashCode()
    {
        return (this.a.hashCode() + 1502476572);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Optional.of(");
        v0_1.append(this.a);
        v0_1.append(")");
        return v0_1.toString();
    }
}
