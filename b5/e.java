package b5;
public final synthetic class e implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic b5.g b;
    public final synthetic Runnable c;
    public final synthetic l6.c d;

    public synthetic e(b5.g p1, Runnable p2, l6.c p3, int p4)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                this.b.a.execute(new b5.c(this.c, this.d, 0));
                return;
            case 1:
                this.b.a.execute(new b5.c(this.c, this.d, 2));
                return;
            default:
                this.b.a.execute(new b5.c(this.c, this.d, 1));
                return;
        }
    }
}
