package b5;
public final synthetic class d implements b5.h {
    public final synthetic int a;
    public final synthetic b5.g b;
    public final synthetic Runnable c;
    public final synthetic long d;
    public final synthetic long e;
    public final synthetic java.util.concurrent.TimeUnit f;

    public synthetic d(b5.g p1, Runnable p2, long p3, long p5, java.util.concurrent.TimeUnit p7, int p8)
    {
        this.a = p8;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p5;
        this.f = p7;
        return;
    }

    public final java.util.concurrent.ScheduledFuture a(l6.c p9)
    {
        switch (this.a) {
            case 0:
                b5.g v0_2 = this.b;
                return v0_2.b.scheduleAtFixedRate(new b5.e(v0_2, this.c, p9, 0), this.d, this.e, this.f);
            default:
                b5.g v0_1 = this.b;
                return v0_1.b.scheduleWithFixedDelay(new b5.e(v0_1, this.c, p9, 2), this.d, this.e, this.f);
        }
    }
}
