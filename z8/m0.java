package z8;
public final class m0 extends okhttp3.RequestBody {
    public final okhttp3.RequestBody b;
    public final okhttp3.MediaType c;

    public m0(okhttp3.RequestBody p1, okhttp3.MediaType p2)
    {
        this.b = p1;
        this.c = p2;
        return;
    }

    public final long a()
    {
        return this.b.a();
    }

    public final okhttp3.MediaType b()
    {
        return this.c;
    }

    public final void d(x8.h p2)
    {
        this.b.d(p2);
        return;
    }
}
