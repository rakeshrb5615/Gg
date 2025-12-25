package i2;
public final synthetic class l0 implements java.lang.Runnable {
    public final synthetic i2.n0 a;
    public final synthetic int b;
    public final synthetic int c;

    public synthetic l0(i2.n0 p1, int p2, int p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void run()
    {
        i2.n0 v0 = this.a;
        long v1_0 = v0.c;
        if (v1_0 != 0) {
            v1_0.onSurfaceChanged(0, this.b, this.c);
            v0.c0 = System.nanoTime();
        }
        return;
    }
}
