package h;
public final class n implements java.util.concurrent.Executor {
    public final Object a;
    public final java.util.ArrayDeque b;
    public final h.o c;
    public Runnable d;

    public n(h.o p2)
    {
        this.a = new Object();
        this.b = new java.util.ArrayDeque();
        this.c = p2;
        return;
    }

    public final void a()
    {
        Throwable v1_3 = ((Runnable) this.b.poll());
        this.d = v1_3;
        if (v1_3 != null) {
            this.c.execute(v1_3);
        }
        return;
    }

    public final void execute(Runnable p5)
    {
        this.b.add(new a5.i(7, this, p5));
        if (this.d == null) {
            this.a();
        }
        return;
    }
}
