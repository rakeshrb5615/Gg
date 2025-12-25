package i2;
public final synthetic class m0 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic i2.n0 b;

    public synthetic m0(i2.n0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                i2.m0 v0_2 = this.b;
                v0_2.b.K1 = 1;
                v0_2.d.postDelayed(v0_2.e, ((long) 1181376512));
                return;
            default:
                i2.n0.a(this.b);
                return;
        }
    }
}
