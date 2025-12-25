package c;
public final class u implements androidx.lifecycle.s, java.lang.AutoCloseable {
    public final synthetic c.r a;
    public final synthetic androidx.fragment.app.t0 b;
    public final synthetic androidx.lifecycle.p c;

    public u(c.r p1, androidx.fragment.app.t0 p2, c.v p3, androidx.lifecycle.p p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p4;
        return;
    }

    public final void c(androidx.lifecycle.u p2, androidx.lifecycle.n p3)
    {
        if ((p3.a().compareTo(androidx.lifecycle.o.d) < 0) || (!this.b.b)) {
            androidx.lifecycle.p v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        c.r v0_0 = this.a;
        v0_0.b(v2_1);
        if (p3 == androidx.lifecycle.n.ON_DESTROY) {
            v0_0.a();
            this.c.b(this);
        }
        return;
    }

    public final void close()
    {
        this.c.b(this);
        return;
    }
}
