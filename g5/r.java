package g5;
public final synthetic class r implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic long c;
    public final synthetic Object d;

    public synthetic r(g5.s p1, long p2, String p4, int p5)
    {
        this.a = p5;
        this.b = p1;
        this.c = p2;
        this.d = p4;
        return;
    }

    public synthetic r(i2.e p2, android.view.View p3, long p4)
    {
        this.a = 2;
        this.b = p2;
        this.d = p3;
        this.c = p4;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                long v2_3 = ((g5.s) this.b);
                v2_3.o.b.a(new g5.r(v2_3, this.c, ((String) this.d), 1));
                return;
            case 1:
                i5.c v0_15 = ((g5.s) this.b).g;
                long v2_4 = v0_15.n;
                if ((v2_4 == 0) || (!v2_4.e.get())) {
                    ((i5.c) v0_15.i.b).g(this.c, ((String) this.d));
                }
                return;
            default:
                String v1_3 = ((android.view.View) this.d);
                ((i2.e) this.b).run();
                v1_3.animate().alpha(1065353216).setDuration(this.c).start();
                return;
        }
    }
}
