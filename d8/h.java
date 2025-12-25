package d8;
public final class h extends d8.a {
    public final Thread d;
    public final d8.x0 e;

    public h(l7.h p2, Thread p3, d8.x0 p4)
    {
        super(p2, 1);
        super.d = p3;
        super.e = p4;
        return;
    }

    public final void f(Object p2)
    {
        Thread v0 = this.d;
        if (!kotlin.jvm.internal.j.a(Thread.currentThread(), v0)) {
            java.util.concurrent.locks.LockSupport.unpark(v0);
        }
        return;
    }
}
