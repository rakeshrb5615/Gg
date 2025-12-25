package okhttp3;
public final class Response implements java.io.Closeable {
    public final okhttp3.Request a;
    public final okhttp3.Protocol b;
    public final String c;
    public final int d;
    public final okhttp3.Handshake e;
    public final okhttp3.Headers f;
    public final okhttp3.ResponseBody m;
    public final x8.g0 n;
    public final okhttp3.Response o;
    public final okhttp3.Response p;
    public final okhttp3.Response q;
    public final long r;
    public final long s;
    public final okhttp3.internal.connection.Exchange t;
    public final okhttp3.TrailersSource u;
    public final boolean v;

    public Response(okhttp3.Request p3, okhttp3.Protocol p4, String p5, int p6, okhttp3.Handshake p7, okhttp3.Headers p8, okhttp3.ResponseBody p9, x8.g0 p10, okhttp3.Response p11, okhttp3.Response p12, okhttp3.Response p13, long p14, long p16, okhttp3.internal.connection.Exchange p18, okhttp3.TrailersSource p19)
    {
        kotlin.jvm.internal.j.e(p3, "request");
        kotlin.jvm.internal.j.e(p4, "protocol");
        kotlin.jvm.internal.j.e(p5, "message");
        kotlin.jvm.internal.j.e(p9, "body");
        kotlin.jvm.internal.j.e(p19, "trailersSource");
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
        this.e = p7;
        this.f = p8;
        this.m = p9;
        this.n = p10;
        this.o = p11;
        this.p = p12;
        this.q = p13;
        this.r = p14;
        this.s = p16;
        this.t = p18;
        this.u = p19;
        int v4_1 = 0;
        if ((200 <= p6) && (p6 < 300)) {
            v4_1 = 1;
        }
        this.v = v4_1;
        return;
    }

    public final okhttp3.Response$Builder c()
    {
        okhttp3.Response$Builder v0_1 = new okhttp3.Response$Builder();
        v0_1.c = -1;
        v0_1.g = okhttp3.ResponseBody.c;
        v0_1.o = okhttp3.TrailersSource.a;
        v0_1.a = this.a;
        v0_1.b = this.b;
        v0_1.c = this.d;
        v0_1.d = this.c;
        v0_1.e = this.e;
        v0_1.f = this.f.d();
        v0_1.g = this.m;
        v0_1.h = this.n;
        v0_1.i = this.o;
        v0_1.j = this.p;
        v0_1.k = this.q;
        v0_1.l = this.r;
        v0_1.m = this.s;
        v0_1.n = this.t;
        v0_1.o = this.u;
        return v0_1;
    }

    public final void close()
    {
        this.m.close();
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Response{protocol=");
        v0_1.append(this.b);
        v0_1.append(", code=");
        v0_1.append(this.d);
        v0_1.append(", message=");
        v0_1.append(this.c);
        v0_1.append(", url=");
        v0_1.append(this.a.a);
        v0_1.append(125);
        return v0_1.toString();
    }
}
