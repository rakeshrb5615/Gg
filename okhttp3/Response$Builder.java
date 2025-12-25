package okhttp3;
public class Response$Builder {
    public okhttp3.Request a;
    public okhttp3.Protocol b;
    public int c;
    public String d;
    public okhttp3.Handshake e;
    public okhttp3.Headers$Builder f;
    public okhttp3.ResponseBody g;
    public x8.g0 h;
    public okhttp3.Response i;
    public okhttp3.Response j;
    public okhttp3.Response k;
    public long l;
    public long m;
    public okhttp3.internal.connection.Exchange n;
    public okhttp3.TrailersSource o;

    public Response$Builder()
    {
        this.c = -1;
        this.g = okhttp3.ResponseBody.c;
        this.o = okhttp3.TrailersSource.a;
        this.f = new okhttp3.Headers$Builder();
        return;
    }

    public static void b(String p1, okhttp3.Response p2)
    {
        if (p2 != null) {
            if (p2.o != null) {
                throw new IllegalArgumentException(p1.concat(".networkResponse != null").toString());
            } else {
                if (p2.p != null) {
                    throw new IllegalArgumentException(p1.concat(".cacheResponse != null").toString());
                } else {
                    if (p2.q != null) {
                        throw new IllegalArgumentException(p1.concat(".priorResponse != null").toString());
                    }
                }
            }
        }
        return;
    }

    public final okhttp3.Response a()
    {
        int v5 = this.c;
        if (v5 < 0) {
            IllegalStateException v1_11 = new StringBuilder("code < 0: ");
            v1_11.append(this.c);
            throw new IllegalStateException(v1_11.toString().toString());
        } else {
            String v2_2 = this.a;
            if (v2_2 == null) {
                throw new IllegalStateException("request == null");
            } else {
                okhttp3.Protocol v3 = this.b;
                if (v3 == null) {
                    throw new IllegalStateException("protocol == null");
                } else {
                    String v4 = this.d;
                    if (v4 == null) {
                        throw new IllegalStateException("message == null");
                    } else {
                        return new okhttp3.Response(v2_2, v3, v4, v5, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                    }
                }
            }
        }
    }
}
