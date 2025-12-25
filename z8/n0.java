package z8;
public final class n0 {
    public static final char[] l;
    public static final java.util.regex.Pattern m;
    public final String a;
    public final okhttp3.HttpUrl b;
    public String c;
    public okhttp3.HttpUrl$Builder d;
    public final okhttp3.Request$Builder e;
    public final okhttp3.Headers$Builder f;
    public okhttp3.MediaType g;
    public final boolean h;
    public final okhttp3.MultipartBody$Builder i;
    public final okhttp3.FormBody$Builder j;
    public okhttp3.RequestBody k;

    static n0()
    {
        java.util.regex.Pattern v0_1 = new char[16];
        v0_1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        z8.n0.l = v0_1;
        z8.n0.m = java.util.regex.Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
        return;
    }

    public n0(String p1, okhttp3.HttpUrl p2, String p3, okhttp3.Headers p4, okhttp3.MediaType p5, boolean p6, boolean p7, boolean p8)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.e = new okhttp3.Request$Builder();
        this.g = p5;
        this.h = p6;
        if (p4 == null) {
            this.f = new okhttp3.Headers$Builder();
        } else {
            this.f = p4.d();
        }
        if (!p7) {
            if (!p8) {
                return;
            } else {
                String v1_5 = new okhttp3.MultipartBody$Builder();
                this.i = v1_5;
                IllegalArgumentException v2_1 = okhttp3.MultipartBody.g;
                kotlin.jvm.internal.j.e(v2_1, "type");
                if (!v2_1.b.equals("multipart")) {
                    String v1_7 = new StringBuilder("multipart != ");
                    v1_7.append(v2_1);
                    throw new IllegalArgumentException(v1_7.toString().toString());
                } else {
                    v1_5.b = v2_1;
                    return;
                }
            }
        } else {
            this.j = new okhttp3.FormBody$Builder();
            return;
        }
    }

    public final void a(String p12, String p13, boolean p14)
    {
        int v1_0 = this.j;
        if (p14 == null) {
            v1_0.getClass();
            kotlin.jvm.internal.j.e(p12, "name");
            v1_0.a.add(okhttp3.internal.url._UrlKt.b(p12, 0, 0, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~", 0, 0, 0, 0, 91));
            v1_0.b.add(okhttp3.internal.url._UrlKt.b(p13, 0, 0, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~", 0, 0, 0, 0, 91));
            return;
        } else {
            v1_0.getClass();
            kotlin.jvm.internal.j.e(p12, "name");
            v1_0.a.add(okhttp3.internal.url._UrlKt.b(p12, 0, 0, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~", 1, 0, 1, 0, 83));
            v1_0.b.add(okhttp3.internal.url._UrlKt.b(p13, 0, 0, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~", 1, 0, 1, 0, 83));
            return;
        }
    }

    public final void b(String p2, String p3, boolean p4)
    {
        if (!"Content-Type".equalsIgnoreCase(p2)) {
            String v0_3 = this.f;
            if (p4 == null) {
                v0_3.a(p2, p3);
                return;
            } else {
                v0_3.getClass();
                kotlin.jvm.internal.j.e(p2, "name");
                kotlin.jvm.internal.j.e(p3, "value");
                okhttp3.internal._HeadersCommonKt.b(p2);
                v0_3.b(p2, p3);
                return;
            }
        } else {
            try {
                okhttp3.MediaType.e.getClass();
                this.g = okhttp3.MediaType$Companion.a(p3);
                return;
            } catch (IllegalArgumentException v2_3) {
                throw new IllegalArgumentException(g2.g.l("Malformed content type: ", p3), v2_3);
            }
        }
    }

    public final void c(okhttp3.Headers p3, okhttp3.RequestBody p4)
    {
        okhttp3.MultipartBody$Builder v0 = this.i;
        v0.getClass();
        kotlin.jvm.internal.j.e(p4, "body");
        okhttp3.MultipartBody$Part.c.getClass();
        if (p3.b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else {
            if (p3.b("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            } else {
                v0.c.add(new okhttp3.MultipartBody$Part(p3, p4));
                return;
            }
        }
    }

    public final void d(String p6, String p7, boolean p8)
    {
        int v0_0 = this.c;
        String v1 = 0;
        if (v0_0 != 0) {
            java.util.ArrayList v2_2 = this.b;
            int v0_2 = v2_2.f(v0_0);
            this.d = v0_2;
            if (v0_2 == 0) {
                String v7_1 = new StringBuilder("Malformed URL. Base: ");
                v7_1.append(v2_2);
                v7_1.append(", Relative: ");
                v7_1.append(this.c);
                throw new IllegalArgumentException(v7_1.toString());
            } else {
                this.c = 0;
            }
        }
        if (p8 == null) {
            okhttp3.HttpUrl$Builder v8_4 = this.d;
            v8_4.getClass();
            kotlin.jvm.internal.j.e(p6, "name");
            if (v8_4.g == null) {
                v8_4.g = new java.util.ArrayList();
            }
            java.util.ArrayList v2_5 = v8_4.g;
            kotlin.jvm.internal.j.b(v2_5);
            v2_5.add(okhttp3.internal.url._UrlKt.a(p6, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", 91));
            java.util.ArrayList v6_3 = v8_4.g;
            kotlin.jvm.internal.j.b(v6_3);
            if (p7 != null) {
                v1 = okhttp3.internal.url._UrlKt.a(p7, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", 91);
            }
            v6_3.add(v1);
            return;
        } else {
            okhttp3.HttpUrl$Builder v8_5 = this.d;
            v8_5.getClass();
            kotlin.jvm.internal.j.e(p6, "encodedName");
            if (v8_5.g == null) {
                v8_5.g = new java.util.ArrayList();
            }
            java.util.ArrayList v2_10 = v8_5.g;
            kotlin.jvm.internal.j.b(v2_10);
            v2_10.add(okhttp3.internal.url._UrlKt.a(p6, 0, 0, " \"\'<>#&=", 83));
            java.util.ArrayList v6_5 = v8_5.g;
            kotlin.jvm.internal.j.b(v6_5);
            if (p7 != null) {
                v1 = okhttp3.internal.url._UrlKt.a(p7, 0, 0, " \"\'<>#&=", 83);
            }
            v6_5.add(v1);
            return;
        }
    }
}
