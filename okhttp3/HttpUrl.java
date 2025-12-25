package okhttp3;
public final class HttpUrl {
    public static final okhttp3.HttpUrl$Companion j;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final java.util.ArrayList f;
    public final java.util.List g;
    public final String h;
    public final String i;

    static HttpUrl()
    {
        okhttp3.HttpUrl.j = new okhttp3.HttpUrl$Companion(0);
        return;
    }

    public HttpUrl(String p1, String p2, String p3, String p4, int p5, java.util.ArrayList p6, java.util.ArrayList p7, String p8, String p9)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        return;
    }

    public final String a()
    {
        if (this.c.length() != 0) {
            String v2 = this.i;
            String v0_4 = v2.substring((b8.i.v0(v2, 58, (this.a.length() + 3), 4) + 1), b8.i.v0(v2, 64, 0, 6));
            kotlin.jvm.internal.j.d(v0_4, "substring(...)");
            return v0_4;
        } else {
            return "";
        }
    }

    public final String b()
    {
        String v2 = this.i;
        String v0_4 = b8.i.v0(v2, 47, (this.a.length() + 3), 4);
        String v0_1 = v2.substring(v0_4, okhttp3.internal._UtilCommonKt.d(v2, v0_4, v2.length(), "?#"));
        kotlin.jvm.internal.j.d(v0_1, "substring(...)");
        return v0_1;
    }

    public final java.util.ArrayList c()
    {
        String v2 = this.i;
        int v0_4 = b8.i.v0(v2, 47, (this.a.length() + 3), 4);
        int v1_0 = okhttp3.internal._UtilCommonKt.d(v2, v0_4, v2.length(), "?#");
        java.util.ArrayList v4_2 = new java.util.ArrayList();
        while (v0_4 < v1_0) {
            int v0_1 = (v0_4 + 1);
            int v5 = okhttp3.internal._UtilCommonKt.c(v2, 47, v0_1, v1_0);
            int v0_3 = v2.substring(v0_1, v5);
            kotlin.jvm.internal.j.d(v0_3, "substring(...)");
            v4_2.add(v0_3);
            v0_4 = v5;
        }
        return v4_2;
    }

    public final String d()
    {
        if (this.g != null) {
            String v2 = this.i;
            String v0_5 = (b8.i.v0(v2, 63, 0, 6) + 1);
            String v0_1 = v2.substring(v0_5, okhttp3.internal._UtilCommonKt.c(v2, 35, v0_5, v2.length()));
            kotlin.jvm.internal.j.d(v0_1, "substring(...)");
            return v0_1;
        } else {
            return 0;
        }
    }

    public final String e()
    {
        if (this.b.length() != 0) {
            String v0_6 = (this.a.length() + 3);
            String v2 = this.i;
            String v0_1 = v2.substring(v0_6, okhttp3.internal._UtilCommonKt.d(v2, v0_6, v2.length(), ":@"));
            kotlin.jvm.internal.j.d(v0_1, "substring(...)");
            return v0_1;
        } else {
            return "";
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof okhttp3.HttpUrl)) || (!kotlin.jvm.internal.j.a(((okhttp3.HttpUrl) p2).i, this.i))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final okhttp3.HttpUrl$Builder f(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "link");
        try {
            okhttp3.HttpUrl$Builder v0_2 = new okhttp3.HttpUrl$Builder();
            v0_2.b(this, p2);
            return v0_2;
        } catch (IllegalArgumentException) {
            return 0;
        }
    }

    public final String g()
    {
        String v0_3 = this.f("/...");
        kotlin.jvm.internal.j.b(v0_3);
        v0_3.b = okhttp3.internal.url._UrlKt.a("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", 123);
        v0_3.c = okhttp3.internal.url._UrlKt.a("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", 123);
        return v0_3.a().i;
    }

    public final java.net.URI h()
    {
        RuntimeException v0_1 = new okhttp3.HttpUrl$Builder();
        java.net.URISyntaxException v1_1 = this.a;
        v0_1.a = v1_1;
        v0_1.b = this.e();
        v0_1.c = this.a();
        v0_1.d = this.d;
        okhttp3.HttpUrl.j.getClass();
        java.util.regex.Pattern v2_2 = this.e;
        if (v2_2 == okhttp3.HttpUrl$Companion.a(v1_1)) {
            v2_2 = -1;
        }
        java.util.regex.Pattern v2_5;
        v0_1.e = v2_2;
        java.net.URISyntaxException v1_2 = v0_1.f;
        v1_2.clear();
        v1_2.addAll(this.c());
        java.util.regex.Pattern v2_4 = this.d();
        String v3_0 = 0;
        if (v2_4 == null) {
            v2_5 = 0;
        } else {
            v2_5 = okhttp3.HttpUrl$Builder.c(okhttp3.internal.url._UrlKt.a(v2_4, 0, 0, " \"\'<>#", 83));
        }
        java.util.regex.Pattern v2_11;
        v0_1.g = v2_5;
        if (this.h != null) {
            String v6_1 = this.i;
            v2_11 = v6_1.substring((b8.i.v0(v6_1, 35, 0, 6) + 1));
            kotlin.jvm.internal.j.d(v2_11, "substring(...)");
        } else {
            v2_11 = 0;
        }
        java.util.regex.Pattern v2_14;
        v0_1.h = v2_11;
        java.util.regex.Pattern v2_13 = v0_1.d;
        if (v2_13 == null) {
            v2_14 = 0;
        } else {
            int v9_3 = java.util.regex.Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.j.d(v9_3, "compile(...)");
            v2_14 = v9_3.matcher(v2_13).replaceAll("");
            kotlin.jvm.internal.j.d(v2_14, "replaceAll(...)");
        }
        v0_1.d = v2_14;
        java.util.regex.Pattern v2_16 = v1_2.size();
        int v9_1 = 0;
        while (v9_1 < v2_16) {
            v1_2.set(v9_1, okhttp3.internal.url._UrlKt.a(((String) v1_2.get(v9_1)), 0, 0, "[]", 99));
            v9_1++;
        }
        java.net.URISyntaxException v1_3 = v0_1.g;
        if (v1_3 != null) {
            java.util.regex.Pattern v2_17 = v1_3.size();
            int v9_0 = 0;
            while (v9_0 < v2_17) {
                String v10_2;
                String v10_1 = ((String) v1_3.get(v9_0));
                if (v10_1 == null) {
                    v10_2 = 0;
                } else {
                    v10_2 = okhttp3.internal.url._UrlKt.a(v10_1, 0, 0, "\\^`{|}", 67);
                }
                v1_3.set(v9_0, v10_2);
                v9_0++;
            }
        }
        java.net.URISyntaxException v1_4 = v0_1.h;
        if (v1_4 != null) {
            v3_0 = okhttp3.internal.url._UrlKt.a(v1_4, 0, 0, " \"#<>\\^`{|}", 35);
        }
        v0_1.h = v3_0;
        RuntimeException v0_5 = v0_1.toString();
        try {
            return new java.net.URI(v0_5);
        } catch (java.net.URISyntaxException v1_7) {
            try {
                java.util.regex.Pattern v2_21 = java.util.regex.Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.j.d(v2_21, "compile(...)");
                kotlin.jvm.internal.j.e(v0_5, "input");
                RuntimeException v0_7 = v2_21.matcher(v0_5).replaceAll("");
                kotlin.jvm.internal.j.d(v0_7, "replaceAll(...)");
                RuntimeException v0_2 = java.net.URI.create(v0_7);
                kotlin.jvm.internal.j.b(v0_2);
                return v0_2;
            } catch (Exception) {
                throw new RuntimeException(v1_7);
            }
        }
    }

    public final int hashCode()
    {
        return this.i.hashCode();
    }

    public final String toString()
    {
        return this.i;
    }
}
