package z8;
public final class x extends okhttp3.ResponseBody {
    public final okhttp3.ResponseBody d;
    public final x8.b0 e;
    public java.io.IOException f;

    public x(okhttp3.ResponseBody p2)
    {
        this.d = p2;
        this.e = x8.b.c(new z8.w(this, p2.i()));
        return;
    }

    public final long c()
    {
        return this.d.c();
    }

    public final void close()
    {
        this.d.close();
        return;
    }

    public final okhttp3.MediaType f()
    {
        return this.d.f();
    }

    public final x8.i i()
    {
        return this.e;
    }
}
