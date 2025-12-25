package n0;
public final class b {
    public String a;
    public String b;
    public java.util.List c;

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof n0.b)) {
                if ((!java.util.Objects.equals(this.a, ((n0.b) p5).a)) || ((!java.util.Objects.equals(this.b, ((n0.b) p5).b)) || (!java.util.Objects.equals(this.c, ((n0.b) p5).c)))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {this.a, this.b, this.c}));
    }
}
