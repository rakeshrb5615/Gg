package o1;
public abstract class b {
    public final java.util.LinkedHashMap a;

    public b()
    {
        this.a = new java.util.LinkedHashMap();
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof o1.b)) || (!kotlin.jvm.internal.j.a(this.a, ((o1.b) p2).a))) {
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
        String v0_1 = new StringBuilder("CreationExtras(extras=");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
