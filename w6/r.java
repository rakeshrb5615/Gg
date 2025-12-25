package w6;
public final class r extends w6.o {
    public final y6.o a;

    public r()
    {
        this.a = new y6.o(0);
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((p2 != this) && ((!(p2 instanceof w6.r)) || (!((w6.r) p2).a.equals(this.a)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }
}
