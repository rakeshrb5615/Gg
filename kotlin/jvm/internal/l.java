package kotlin.jvm.internal;
public final class l implements kotlin.jvm.internal.d {
    public final Class a;

    public l(Class p2)
    {
        kotlin.jvm.internal.j.e(p2, "jClass");
        this.a = p2;
        return;
    }

    public final Class a()
    {
        return this.a;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof kotlin.jvm.internal.l)) || (!kotlin.jvm.internal.j.a(this.a, ((kotlin.jvm.internal.l) p2).a))) {
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
        String v0_1 = new StringBuilder();
        v0_1.append(this.a.toString());
        v0_1.append(" (Kotlin reflection is not available)");
        return v0_1.toString();
    }
}
