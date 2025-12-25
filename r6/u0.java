package r6;
public final class u0 implements t6.b {
    public final synthetic int a;
    public final g7.a b;
    public final t6.c c;

    public synthetic u0(t6.c p1, t6.c p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final Object get()
    {
        switch (this.a) {
            case 0:
                return new r6.t0(((r6.g1) this.b.get()), ((r6.h1) this.c.get()));
            default:
                return new u6.k(((u6.p) this.b.get()), ((u6.p) this.c.get()));
        }
    }
}
