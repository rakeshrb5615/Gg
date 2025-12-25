package g0;
public final class j {
    public final android.content.res.Resources a;
    public final android.content.res.Resources$Theme b;

    public j(android.content.res.Resources p1, android.content.res.Resources$Theme p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((!p5) || ((g0.j != p5.getClass()) || ((!this.a.equals(((g0.j) p5).a)) || (!java.util.Objects.equals(this.b, ((g0.j) p5).b))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {this.a, this.b}));
    }
}
