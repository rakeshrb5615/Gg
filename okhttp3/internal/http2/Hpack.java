package okhttp3.internal.http2;
public final class Hpack {
    public static final okhttp3.internal.http2.Hpack a;
    public static final okhttp3.internal.http2.Header[] b;
    public static final java.util.Map c;

    static Hpack()
    {
        okhttp3.internal.http2.Hpack.a = new okhttp3.internal.http2.Hpack();
        String v1_61 = new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.i, "");
        int v3_7 = okhttp3.internal.http2.Header.f;
        new okhttp3.internal.http2.Header(v3_7, "GET");
        int v3_0 = new okhttp3.internal.http2.Header(v3_7, "POST");
        Integer v5_1 = okhttp3.internal.http2.Header.g;
        new okhttp3.internal.http2.Header(v5_1, "/");
        new okhttp3.internal.http2.Header(v5_1, "/index.html");
        okhttp3.internal.http2.Header v7_1 = okhttp3.internal.http2.Header.h;
        new okhttp3.internal.http2.Header(v7_1, "http");
        new okhttp3.internal.http2.Header(v7_1, "https");
        okhttp3.internal.http2.Header v9_1 = okhttp3.internal.http2.Header.e;
        new okhttp3.internal.http2.Header(v9_1, "200");
        new okhttp3.internal.http2.Header(v9_1, "204");
        new okhttp3.internal.http2.Header(v9_1, "206");
        new okhttp3.internal.http2.Header(v9_1, "304");
        new okhttp3.internal.http2.Header(v9_1, "400");
        new okhttp3.internal.http2.Header(v9_1, "404");
        new okhttp3.internal.http2.Header(v9_1, "500");
        okhttp3.internal.http2.Header v15 = new okhttp3.internal.http2.Header("accept-charset", "");
        okhttp3.internal.http2.Header v17 = v1_61;
        okhttp3.internal.http2.Header v18 = v3_0;
        java.util.Map v0_65 = new okhttp3.internal.http2.Header("accept-encoding", "gzip, deflate");
        new okhttp3.internal.http2.Header("accept-language", "");
        okhttp3.internal.http2.Header v19 = v0_65;
        new okhttp3.internal.http2.Header("accept-ranges", "");
        new okhttp3.internal.http2.Header("age", "");
        new okhttp3.internal.http2.Header("cache-control", "");
        new okhttp3.internal.http2.Header("content-language", "");
        new okhttp3.internal.http2.Header("content-range", "");
        new okhttp3.internal.http2.Header("date", "");
        new okhttp3.internal.http2.Header("expires", "");
        new okhttp3.internal.http2.Header("if-match", "");
        new okhttp3.internal.http2.Header("if-range", "");
        new okhttp3.internal.http2.Header("link", "");
        new okhttp3.internal.http2.Header("proxy-authenticate", "");
        new okhttp3.internal.http2.Header("referer", "");
        new okhttp3.internal.http2.Header("server", "");
        new okhttp3.internal.http2.Header("transfer-encoding", "");
        new okhttp3.internal.http2.Header("via", "");
        int v3 = v18;
        okhttp3.internal.http2.Header v16 = v19;
        v19 = new okhttp3.internal.http2.Header("accept", "");
        okhttp3.internal.http2.Header v20 = new okhttp3.internal.http2.Header("access-control-allow-origin", "");
        okhttp3.internal.http2.Header v22 = new okhttp3.internal.http2.Header("allow", "");
        okhttp3.internal.http2.Header v23 = new okhttp3.internal.http2.Header("authorization", "");
        okhttp3.internal.http2.Header v25 = new okhttp3.internal.http2.Header("content-disposition", "");
        okhttp3.internal.http2.Header v26 = new okhttp3.internal.http2.Header("content-encoding", "");
        okhttp3.internal.http2.Header v28 = new okhttp3.internal.http2.Header("content-length", "");
        okhttp3.internal.http2.Header v29 = new okhttp3.internal.http2.Header("content-location", "");
        okhttp3.internal.http2.Header v31 = new okhttp3.internal.http2.Header("content-type", "");
        okhttp3.internal.http2.Header v32 = new okhttp3.internal.http2.Header("cookie", "");
        okhttp3.internal.http2.Header v34 = new okhttp3.internal.http2.Header("etag", "");
        okhttp3.internal.http2.Header v35 = new okhttp3.internal.http2.Header("expect", "");
        okhttp3.internal.http2.Header v37 = new okhttp3.internal.http2.Header("from", "");
        okhttp3.internal.http2.Header v38 = new okhttp3.internal.http2.Header("host", "");
        okhttp3.internal.http2.Header v40 = new okhttp3.internal.http2.Header("if-modified-since", "");
        okhttp3.internal.http2.Header v41 = new okhttp3.internal.http2.Header("if-none-match", "");
        okhttp3.internal.http2.Header v43 = new okhttp3.internal.http2.Header("if-unmodified-since", "");
        okhttp3.internal.http2.Header v44 = new okhttp3.internal.http2.Header("last-modified", "");
        okhttp3.internal.http2.Header v46 = new okhttp3.internal.http2.Header("location", "");
        okhttp3.internal.http2.Header v47 = new okhttp3.internal.http2.Header("max-forwards", "");
        okhttp3.internal.http2.Header v49 = new okhttp3.internal.http2.Header("proxy-authorization", "");
        okhttp3.internal.http2.Header v50 = new okhttp3.internal.http2.Header("range", "");
        okhttp3.internal.http2.Header v52 = new okhttp3.internal.http2.Header("refresh", "");
        okhttp3.internal.http2.Header v53 = new okhttp3.internal.http2.Header("retry-after", "");
        okhttp3.internal.http2.Header v55 = new okhttp3.internal.http2.Header("set-cookie", "");
        okhttp3.internal.http2.Header v56 = new okhttp3.internal.http2.Header("strict-transport-security", "");
        okhttp3.internal.http2.Header v58 = new okhttp3.internal.http2.Header("user-agent", "");
        okhttp3.internal.http2.Header v59 = new okhttp3.internal.http2.Header("vary", "");
        java.util.Map v0_59 = new okhttp3.internal.http2.Header[] {v17, new okhttp3.internal.http2.Header("www-authenticate", "")});
        okhttp3.internal.http2.Hpack.b = v0_59;
        String v1_59 = new java.util.LinkedHashMap(v0_59.length, 1065353216);
        int v2_1 = v0_59.length;
        int v3_2 = 0;
        while (v3_2 < v2_1) {
            if (!v1_59.containsKey(v0_59[v3_2].a)) {
                v1_59.put(v0_59[v3_2].a, Integer.valueOf(v3_2));
            }
            v3_2++;
        }
        java.util.Map v0_60 = java.util.Collections.unmodifiableMap(v1_59);
        kotlin.jvm.internal.j.d(v0_60, "unmodifiableMap(...)");
        okhttp3.internal.http2.Hpack.c = v0_60;
        return;
    }

    private Hpack()
    {
        return;
    }

    public static void a(x8.j p4)
    {
        kotlin.jvm.internal.j.e(p4, "name");
        java.io.IOException v0_3 = p4.d();
        String v1_1 = 0;
        while (v1_1 < v0_3) {
            byte v2 = p4.i(v1_1);
            if ((65 <= v2) && (v2 < 91)) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(p4.r()));
            } else {
                v1_1++;
            }
        }
        return;
    }
}
