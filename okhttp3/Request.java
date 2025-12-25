package okhttp3;
public final class Request {
    public final okhttp3.HttpUrl a;
    public final String b;
    public final okhttp3.Headers c;
    public final okhttp3.RequestBody d;
    public final okhttp3.internal.Tags e;
    public okhttp3.CacheControl f;

    public Request(okhttp3.Request$Builder p2)
    {
        kotlin.jvm.internal.j.e(p2, "builder");
        String v0_5 = p2.a;
        if (v0_5 == null) {
            throw new IllegalStateException("url == null");
        } else {
            this.a = v0_5;
            this.b = p2.b;
            this.c = p2.c.c();
            this.d = p2.d;
            this.e = p2.e;
            return;
        }
    }

    public final okhttp3.Request$Builder a()
    {
        okhttp3.Request$Builder v0_1 = new okhttp3.Request$Builder();
        v0_1.a = this.a;
        v0_1.b = this.b;
        v0_1.d = this.d;
        v0_1.e = this.e;
        v0_1.c = this.c.d();
        return v0_1;
    }

    public final String toString()
    {
        int v0_1 = new StringBuilder(32);
        v0_1.append("Request{method=");
        v0_1.append(this.b);
        v0_1.append(", url=");
        v0_1.append(this.a);
        int v1_1 = this.c;
        if (v1_1.size() != 0) {
            v0_1.append(", headers=[");
            int v1_2 = v1_1.iterator();
            int v2_2 = 0;
            while (v1_2.hasNext()) {
                String v3_1 = v1_2.next();
                int v4 = (v2_2 + 1);
                if (v2_2 < 0) {
                    a.a.V();
                    throw 0;
                } else {
                    String v3_2 = ((h7.f) v3_1);
                    String v5_1 = ((String) v3_2.a);
                    String v3_4 = ((String) v3_2.b);
                    if (v2_2 > 0) {
                        v0_1.append(", ");
                    }
                    v0_1.append(v5_1);
                    v0_1.append(58);
                    if (okhttp3.internal._UtilCommonKt.j(v5_1)) {
                        v3_4 = "\u2588\u2588";
                    }
                    v0_1.append(v3_4);
                    v2_2 = v4;
                }
            }
            v0_1.append(93);
        }
        int v2_3 = this.e;
        if (!kotlin.jvm.internal.j.a(v2_3, okhttp3.internal.EmptyTags.a)) {
            v0_1.append(", tags=");
            v0_1.append(v2_3);
        }
        v0_1.append(125);
        return v0_1.toString();
    }
}
