package okhttp3;
public final class Cookie {
    public static final okhttp3.Cookie$Companion k;
    public static final java.util.regex.Pattern l;
    public static final java.util.regex.Pattern m;
    public static final java.util.regex.Pattern n;
    public static final java.util.regex.Pattern o;
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    static Cookie()
    {
        okhttp3.Cookie.k = new okhttp3.Cookie$Companion(0);
        okhttp3.Cookie.l = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");
        okhttp3.Cookie.m = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        okhttp3.Cookie.n = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");
        okhttp3.Cookie.o = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
        return;
    }

    public Cookie(String p1, String p2, long p3, String p5, String p6, boolean p7, boolean p8, boolean p9, boolean p10, String p11)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        this.g = p8;
        this.h = p9;
        this.i = p10;
        this.j = p11;
        return;
    }

    public final boolean equals(Object p5)
    {
        if ((!(p5 instanceof okhttp3.Cookie)) || ((!kotlin.jvm.internal.j.a(((okhttp3.Cookie) p5).a, this.a)) || ((!kotlin.jvm.internal.j.a(((okhttp3.Cookie) p5).b, this.b)) || ((((okhttp3.Cookie) p5).c != this.c) || ((!kotlin.jvm.internal.j.a(((okhttp3.Cookie) p5).d, this.d)) || ((!kotlin.jvm.internal.j.a(((okhttp3.Cookie) p5).e, this.e)) || ((((okhttp3.Cookie) p5).f != this.f) || ((((okhttp3.Cookie) p5).g != this.g) || ((((okhttp3.Cookie) p5).h != this.h) || ((((okhttp3.Cookie) p5).i != this.i) || (!kotlin.jvm.internal.j.a(((okhttp3.Cookie) p5).j, this.j)))))))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_13;
        int v0_18 = ((Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.g) + ((Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.c) + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        int v1_12 = this.j;
        if (v1_12 == 0) {
            v1_13 = 0;
        } else {
            v1_13 = v1_12.hashCode();
        }
        return (v0_18 + v1_13);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append(61);
        v0_1.append(this.b);
        if (this.h) {
            long v3 = this.c;
            if (v3 != -9223372036854775808) {
                v0_1.append("; expires=");
                String v1_6 = ((java.text.DateFormat) okhttp3.internal.http.DateFormattingKt.a.get()).format(new java.util.Date(v3));
                kotlin.jvm.internal.j.d(v1_6, "format(...)");
                v0_1.append(v1_6);
            } else {
                v0_1.append("; max-age=0");
            }
        }
        if (!this.i) {
            v0_1.append("; domain=");
            v0_1.append(this.d);
        }
        v0_1.append("; path=");
        v0_1.append(this.e);
        if (this.f) {
            v0_1.append("; secure");
        }
        if (this.g) {
            v0_1.append("; httponly");
        }
        String v1_18 = this.j;
        if (v1_18 != null) {
            v0_1.append("; samesite=");
            v0_1.append(v1_18);
        }
        String v0_2 = v0_1.toString();
        kotlin.jvm.internal.j.d(v0_2, "toString(...)");
        return v0_2;
    }
}
