package c;
public final synthetic class d implements androidx.lifecycle.s {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic d(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void c(androidx.lifecycle.u p3, androidx.lifecycle.n p4)
    {
        switch (this.a) {
            case 0:
                c.n.b(((c.v) this.b), ((c.n) this.c), p3, p4);
                return;
            default:
                q0.o v3_2 = ((q0.o) this.b);
                c.v v0_2 = ((q0.p) this.c);
                v3_2.getClass();
                if (p4 == androidx.lifecycle.n.ON_DESTROY) {
                    v3_2.b(v0_2);
                }
                return;
        }
    }
}
