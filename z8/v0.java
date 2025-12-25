package z8;
public final class v0 implements z8.u0 {
    public static final z8.v0 a;

    static v0()
    {
        z8.v0.a = new z8.v0();
        return;
    }

    public final Class annotationType()
    {
        return z8.u0;
    }

    public final boolean equals(Object p1)
    {
        return (p1 instanceof z8.u0);
    }

    public final int hashCode()
    {
        return 0;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("@");
        v0_2.append(z8.u0.getName());
        v0_2.append("()");
        return v0_2.toString();
    }
}
