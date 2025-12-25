package b5;
public final class k implements java.lang.Runnable {
    public final synthetic int a;
    public final Runnable b;

    public synthetic k(Runnable p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                this.b.run();
                return;
            default:
                this.b.run();
                return;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 0:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
