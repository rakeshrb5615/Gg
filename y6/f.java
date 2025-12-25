package y6;
public final class f implements java.lang.reflect.GenericArrayType, java.io.Serializable {
    public final reflect.Type a;

    public f(reflect.Type p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.a = y6.i.a(p1);
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof reflect.GenericArrayType)) || (!y6.i.d(this, ((reflect.GenericArrayType) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final reflect.Type getGenericComponentType()
    {
        return this.a;
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(y6.i.k(this.a));
        v0_1.append("[]");
        return v0_1.toString();
    }
}
