package z8;
public final class w0 implements java.lang.reflect.GenericArrayType {
    public final reflect.Type a;

    public w0(reflect.Type p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof reflect.GenericArrayType)) || (!z8.z0.e(this, ((reflect.GenericArrayType) p2)))) {
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
        v0_1.append(z8.z0.s(this.a));
        v0_1.append("[]");
        return v0_1.toString();
    }
}
