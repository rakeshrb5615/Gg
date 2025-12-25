package j5;
public final class j1 extends j5.l2 {
    public final String a;

    public j1(String p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if (!(p2 instanceof j5.l2)) {
                return 0;
            } else {
                return this.a.equals(((j5.j1) ((j5.l2) p2)).a);
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.a.hashCode() ^ 1000003);
    }

    public final String toString()
    {
        return v1.a.n(new StringBuilder("User{identifier="), this.a, "}");
    }
}
