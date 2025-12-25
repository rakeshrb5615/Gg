package okhttp3.internal;
public final class UnreadableResponseBody extends okhttp3.ResponseBody implements x8.h0 {
    public final okhttp3.MediaType d;
    public final long e;

    public UnreadableResponseBody(okhttp3.MediaType p1, long p2)
    {
        this.d = p1;
        this.e = p2;
        return;
    }

    public final x8.j0 b()
    {
        return x8.j0.d;
    }

    public final long c()
    {
        return this.e;
    }

    public final void close()
    {
        return;
    }

    public final okhttp3.MediaType f()
    {
        return this.d;
    }

    public final x8.i i()
    {
        return x8.b.c(this);
    }

    public final long t(x8.g p1, long p2)
    {
        kotlin.jvm.internal.j.e(p1, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }
}
