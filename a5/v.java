package a5;
public final class v implements c6.b {
    public static final a5.t c;
    public static final a5.g d;
    public c6.a a;
    public volatile c6.b b;

    static v()
    {
        a5.v.c = new a5.t(0);
        a5.v.d = new a5.g(1);
        return;
    }

    public v(a5.t p1, c6.b p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void a(c6.a p5)
    {
        c6.b v0_0 = this.b;
        int v1_0 = a5.v.d;
        if (v0_0 == v1_0) {
            int v1_1;
            c6.b v0_1 = this.b;
            if (v0_1 == v1_0) {
                this.a = new a5.u(0, this.a, p5);
                v1_1 = 0;
            } else {
                v1_1 = v0_1;
            }
            if (v1_1 != 0) {
                p5.a(v0_1);
            }
            return;
        } else {
            p5.a(v0_0);
            return;
        }
    }

    public final Object get()
    {
        return this.b.get();
    }
}
