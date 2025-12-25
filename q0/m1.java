package q0;
public class m1 extends q0.l1 {
    public h0.b o;
    public h0.b p;
    public h0.b q;

    public m1(q0.s1 p1, android.view.WindowInsets p2)
    {
        super(p1, p2);
        super.o = 0;
        super.p = 0;
        super.q = 0;
        return;
    }

    public h0.b g()
    {
        if (this.p == null) {
            this.p = h0.b.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    public h0.b i()
    {
        if (this.o == null) {
            this.o = h0.b.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    public h0.b k()
    {
        if (this.q == null) {
            this.q = h0.b.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    public q0.s1 l(int p2, int p3, int p4, int p5)
    {
        return q0.s1.g(0, this.c.inset(p2, p3, p4, p5));
    }

    public void q(h0.b p1)
    {
        return;
    }
}
