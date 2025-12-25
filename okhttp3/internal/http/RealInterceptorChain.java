package okhttp3.internal.http;
public final class RealInterceptorChain implements okhttp3.Interceptor$Chain {
    public final okhttp3.internal.connection.RealCall a;
    public final java.util.ArrayList b;
    public final int c;
    public final okhttp3.internal.connection.Exchange d;
    public final okhttp3.Request e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RealInterceptorChain(okhttp3.internal.connection.RealCall p1, java.util.ArrayList p2, int p3, okhttp3.internal.connection.Exchange p4, okhttp3.Request p5, int p6, int p7, int p8)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        return;
    }

    public static okhttp3.internal.http.RealInterceptorChain a(okhttp3.internal.http.RealInterceptorChain p9, int p10, okhttp3.internal.connection.Exchange p11, okhttp3.Request p12, int p13)
    {
        if ((p13 & 1) != 0) {
            p10 = p9.c;
        }
        if ((p13 & 2) != 0) {
            p11 = p9.d;
        }
        if ((p13 & 4) != 0) {
            p12 = p9.e;
        }
        return new okhttp3.internal.http.RealInterceptorChain(p9.a, p9.b, p10, p11, p12, p9.f, p9.g, p9.h);
    }

    public final okhttp3.Response b(okhttp3.Request p10)
    {
        kotlin.jvm.internal.j.e(p10, "request");
        IllegalStateException v0_1 = this.b;
        int v2_2 = this.c;
        if (v2_2 >= v0_1.size()) {
            throw new IllegalStateException("Check failed.");
        } else {
            this.i = (this.i + 1);
            okhttp3.internal.connection.Exchange v4 = this.d;
            if (v4 != null) {
                if (!v4.c.b().c(p10.a)) {
                    String v10_2 = new StringBuilder("network interceptor ");
                    v10_2.append(v0_1.get((v2_2 - 1)));
                    v10_2.append(" must retain the same host and port");
                    throw new IllegalStateException(v10_2.toString().toString());
                } else {
                    if (this.i != 1) {
                        String v10_6 = new StringBuilder("network interceptor ");
                        v10_6.append(v0_1.get((v2_2 - 1)));
                        v10_6.append(" must call proceed() exactly once");
                        throw new IllegalStateException(v10_6.toString().toString());
                    }
                }
            }
            int v6_4 = (v2_2 + 1);
            String v10_9 = okhttp3.internal.http.RealInterceptorChain.a(this, v6_4, 0, p10, 58);
            int v2_4 = ((okhttp3.Interceptor) v0_1.get(v2_2));
            okhttp3.Response v7_2 = v2_4.a(v10_9);
            if (v7_2 == null) {
                IllegalStateException v0_10 = new StringBuilder("interceptor ");
                v0_10.append(v2_4);
                v0_10.append(" returned null");
                throw new NullPointerException(v0_10.toString());
            } else {
                if ((v4 != null) && ((v6_4 < v0_1.size()) && (v10_9.i != 1))) {
                    String v10_15 = new StringBuilder("network interceptor ");
                    v10_15.append(v2_4);
                    v10_15.append(" must call proceed() exactly once");
                    throw new IllegalStateException(v10_15.toString().toString());
                } else {
                    return v7_2;
                }
            }
        }
    }
}
