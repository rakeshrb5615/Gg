package g5;
public final class k {
    public final g5.v a;
    public final g5.j b;

    public k(g5.v p1, m5.c p2)
    {
        this.a = p1;
        this.b = new g5.j(p2);
        return;
    }

    public final void a(String p4)
    {
        g5.j v0 = this.b;
        if (!java.util.Objects.equals(v0.b, p4)) {
            g5.j.a(v0.a, p4, v0.c);
            v0.b = p4;
        }
        return;
    }
}
