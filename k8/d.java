package k8;
public final class d extends d8.y0 implements java.util.concurrent.Executor {
    public static final k8.d c;
    public static final d8.a0 d;

    static d()
    {
        k8.d.c = new k8.d();
        int v1_1 = i8.t.a;
        if (64 >= v1_1) {
            v1_1 = 64;
        }
        k8.d.d = k8.l.c.x(i8.a.j(v1_1, 12, "kotlinx.coroutines.io.parallelism"));
        return;
    }

    public final void close()
    {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public final void execute(Runnable p2)
    {
        this.i(l7.i.a, p2);
        return;
    }

    public final void i(l7.h p2, Runnable p3)
    {
        k8.d.d.i(p2, p3);
        return;
    }

    public final String toString()
    {
        return "Dispatchers.IO";
    }
}
