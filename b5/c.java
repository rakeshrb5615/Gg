package b5;
public final synthetic class c implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Runnable b;
    public final synthetic l6.c c;

    public synthetic c(Runnable p1, l6.c p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Exception v0_2) {
                    ((b5.i) this.c.b).k(v0_2);
                    throw v0_2;
                }
            case 1:
                try {
                    this.b.run();
                } catch (Exception v0_7) {
                    ((b5.i) this.c.b).k(v0_7);
                }
                return;
            default:
                b5.i v1_5 = ((b5.i) this.c.b);
                try {
                    this.b.run();
                    v1_5.j(0);
                } catch (Exception v0_6) {
                    v1_5.k(v0_6);
                }
                return;
        }
    }
}
