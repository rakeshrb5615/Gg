package e1;
public final class e {
    public final String a;

    public e(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        this.a = p2;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (!(p2 instanceof e1.e)) {
            return 0;
        } else {
            return kotlin.jvm.internal.j.a(this.a, ((e1.e) p2).a);
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final String toString()
    {
        return this.a;
    }
}
