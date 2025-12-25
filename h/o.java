package h;
public final class o implements java.util.concurrent.Executor {
    public static final synthetic h.o b;
    public final synthetic int a;

    public static synthetic o()
    {
        h.o.b = new h.o(1);
        return;
    }

    public synthetic o(int p1)
    {
        this.a = p1;
        return;
    }

    public final void execute(Runnable p2)
    {
        switch (this.a) {
            case 0:
                new Thread(p2).start();
                return;
            default:
                p2.run();
                return;
        }
    }
}
