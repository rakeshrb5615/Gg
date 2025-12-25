package okhttp3.internal.connection;
public final class BufferedSocketKt$asBufferedSocket$1 implements okhttp3.internal.connection.BufferedSocket {
    public final j6.s a;
    public final x8.b0 b;
    public final x8.a0 c;

    public BufferedSocketKt$asBufferedSocket$1(j6.s p2)
    {
        this.a = p2;
        this.b = x8.b.c(((y8.e) p2.d));
        this.c = x8.b.b(((y8.d) p2.e));
        return;
    }

    public final x8.h0 a()
    {
        return this.b;
    }

    public final x8.i a()
    {
        return this.b;
    }

    public final x8.f0 b()
    {
        return this.c;
    }

    public final x8.h b()
    {
        return this.c;
    }

    public final void cancel()
    {
        this.a.cancel();
        return;
    }
}
