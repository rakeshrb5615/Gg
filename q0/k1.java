package q0;
public class k1 extends q0.j1 {
    public h0.b n;

    public k1(q0.s1 p1, android.view.WindowInsets p2)
    {
        super(p1, p2);
        super.n = 0;
        return;
    }

    public q0.s1 b()
    {
        return q0.s1.g(0, this.c.consumeStableInsets());
    }

    public q0.s1 c()
    {
        return q0.s1.g(0, this.c.consumeSystemWindowInsets());
    }

    public final h0.b h()
    {
        if (this.n == null) {
            h0.b v0_4 = this.c;
            this.n = h0.b.b(v0_4.getStableInsetLeft(), v0_4.getStableInsetTop(), v0_4.getStableInsetRight(), v0_4.getStableInsetBottom());
        }
        return this.n;
    }

    public boolean m()
    {
        return this.c.isConsumed();
    }

    public void q(h0.b p1)
    {
        this.n = p1;
        return;
    }
}
