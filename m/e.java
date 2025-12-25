package m;
public final class e implements java.lang.Runnable {
    public final synthetic m.f a;
    public final synthetic m.o b;
    public final synthetic m.m c;
    public final synthetic j6.o d;

    public e(j6.o p1, m.f p2, m.o p3, m.m p4)
    {
        this.d = p1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public final void run()
    {
        m.o v0_3 = ((m.g) this.d.b);
        int v1_3 = this.a;
        if (v1_3 != 0) {
            v0_3.F = 1;
            v1_3.b.c(0);
            v0_3.F = 0;
        }
        m.o v0_2 = this.b;
        if ((v0_2.isEnabled()) && (v0_2.hasSubMenu())) {
            this.c.q(v0_2, 0, 4);
        }
        return;
    }
}
