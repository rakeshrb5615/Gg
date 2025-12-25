package a5;
public final class l {
    public final a5.x a;
    public final boolean b;

    public l(a5.x p1, boolean p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((!(p4 instanceof a5.l)) || ((!((a5.l) p4).a.equals(this.a)) || (((a5.l) p4).b != this.b))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode());
    }
}
