package f2;
public final class d extends f2.t {
    public boolean a;
    public final android.view.ViewGroup b;

    public d(android.view.ViewGroup p2)
    {
        this.a = 0;
        this.b = p2;
        return;
    }

    public final void b()
    {
        c4.b.d0(this.b, 0);
        return;
    }

    public final void c(f2.s p2)
    {
        c4.b.d0(this.b, 0);
        this.a = 1;
        return;
    }

    public final void d()
    {
        c4.b.d0(this.b, 1);
        return;
    }

    public final void f(f2.s p3)
    {
        if (!this.a) {
            c4.b.d0(this.b, 0);
        }
        p3.A(this);
        return;
    }
}
