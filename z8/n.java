package z8;
public final class n implements z8.d {
    public final java.util.concurrent.Executor a;
    public final z8.d b;

    public n(java.util.concurrent.Executor p1, z8.d p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final okhttp3.Request c()
    {
        return this.b.c();
    }

    public final void cancel()
    {
        this.b.cancel();
        return;
    }

    public final bridge synthetic Object clone()
    {
        return this.clone();
    }

    public final z8.d clone()
    {
        return new z8.n(this.a, this.b.clone());
    }

    public final void f(z8.g p4)
    {
        this.b.f(new n0.a(this, p4, 17, 0));
        return;
    }

    public final boolean isCanceled()
    {
        return this.b.isCanceled();
    }
}
