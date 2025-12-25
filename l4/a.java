package l4;
public final class a extends l4.d {
    public static final l4.a a;

    static a()
    {
        l4.a.a = new l4.a();
        return;
    }

    public final Object a()
    {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean b()
    {
        return 0;
    }

    public final boolean equals(Object p1)
    {
        if (p1 != this) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return 2040732332;
    }

    public final String toString()
    {
        return "Optional.absent()";
    }
}
