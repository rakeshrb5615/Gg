package m4;
public final class r extends m4.g {
    public final transient Object d;

    public r(Object p1)
    {
        this.d = p1;
        return;
    }

    public final int a(Object[] p3)
    {
        p3[0] = this.d;
        return 1;
    }

    public final boolean contains(Object p2)
    {
        return this.d.equals(p2);
    }

    public final int hashCode()
    {
        return this.d.hashCode();
    }

    public final java.util.Iterator iterator()
    {
        return new m4.h(this.d);
    }

    public final int size()
    {
        return 1;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("[");
        v0_2.append(this.d.toString());
        v0_2.append(93);
        return v0_2.toString();
    }
}
