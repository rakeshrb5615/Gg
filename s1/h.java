package s1;
public final class h extends a.a {
    public final s1.b b;

    public h(s1.b p2)
    {
        kotlin.jvm.internal.j.e(p2, "latestEvent");
        this.b = p2;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((this == p3) || ((p3) && ((s1.h == p3.getClass()) && (kotlin.jvm.internal.j.a(this.b, ((s1.h) p3).b))))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return (this.b.hashCode() - 31);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("InProgress(latestEvent=");
        v0_1.append(this.b);
        v0_1.append(", direction=-1)");
        return v0_1.toString();
    }
}
