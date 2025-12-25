package l4;
public final class j implements l4.f, java.io.Serializable {
    public final Object a;

    public j(Object p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (!(p2 instanceof l4.j)) {
            return 0;
        } else {
            return q4.b.p(this.a, ((l4.j) p2).a);
        }
    }

    public final Object get()
    {
        return this.a;
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {this.a}));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Suppliers.ofInstance(");
        v0_1.append(this.a);
        v0_1.append(")");
        return v0_1.toString();
    }
}
