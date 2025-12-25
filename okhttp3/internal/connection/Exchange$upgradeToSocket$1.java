package okhttp3.internal.connection;
public final class Exchange$upgradeToSocket$1 implements x8.g0 {
    public final okhttp3.internal.connection.Exchange$RequestBodySink a;
    public final okhttp3.internal.connection.Exchange$ResponseBodySource b;
    public final synthetic okhttp3.internal.connection.Exchange c;

    public Exchange$upgradeToSocket$1(okhttp3.internal.connection.Exchange p14)
    {
        this.c = p14;
        okhttp3.internal.http.ExchangeCodec v6 = p14.d;
        this.a = new okhttp3.internal.connection.Exchange$RequestBodySink(p14, v6.e().b(), -1, 1);
        this.b = new okhttp3.internal.connection.Exchange$ResponseBodySource(p14, v6.e().a(), -1, 1);
        return;
    }

    public final x8.h0 a()
    {
        return this.b;
    }

    public final x8.f0 b()
    {
        return this.a;
    }

    public final void cancel()
    {
        this.c.d.cancel();
        return;
    }
}
