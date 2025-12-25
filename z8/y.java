package z8;
public final class y extends okhttp3.ResponseBody {
    public final okhttp3.MediaType d;
    public final long e;

    public y(okhttp3.MediaType p1, long p2)
    {
        this.d = p1;
        this.e = p2;
        return;
    }

    public final long c()
    {
        return this.e;
    }

    public final okhttp3.MediaType f()
    {
        return this.d;
    }

    public final x8.i i()
    {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
