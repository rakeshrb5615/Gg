package c;
public final synthetic class b implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic c.n b;

    public synthetic b(c.n p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                this.b.invalidateMenu();
                return;
            default:
                c.n.e(this.b);
                return;
        }
    }
}
