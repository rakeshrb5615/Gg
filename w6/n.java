package w6;
public final class n extends w6.o implements java.lang.Iterable {
    public final java.util.ArrayList a;

    public n()
    {
        this.a = new java.util.ArrayList();
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((p2 != this) && ((!(p2 instanceof w6.n)) || (!((w6.n) p2).a.equals(this.a)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final java.util.Iterator iterator()
    {
        return this.a.iterator();
    }
}
