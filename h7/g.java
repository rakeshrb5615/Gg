package h7;
public final class g implements java.io.Serializable {
    public final Throwable a;

    public g(Throwable p2)
    {
        kotlin.jvm.internal.j.e(p2, "exception");
        this.a = p2;
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof h7.g)) || (!kotlin.jvm.internal.j.a(this.a, ((h7.g) p2).a))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Failure(");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
