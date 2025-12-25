package okhttp3.internal.http2;
public final class Header {
    public static final x8.j d;
    public static final x8.j e;
    public static final x8.j f;
    public static final x8.j g;
    public static final x8.j h;
    public static final x8.j i;
    public final x8.j a;
    public final x8.j b;
    public final int c;

    static Header()
    {
        new okhttp3.internal.http2.Header$Companion(0);
        okhttp3.internal.http2.Header.d = v3.f.i(":");
        okhttp3.internal.http2.Header.e = v3.f.i(":status");
        okhttp3.internal.http2.Header.f = v3.f.i(":method");
        okhttp3.internal.http2.Header.g = v3.f.i(":path");
        okhttp3.internal.http2.Header.h = v3.f.i(":scheme");
        okhttp3.internal.http2.Header.i = v3.f.i(":authority");
        return;
    }

    public Header(String p2, String p3)
    {
        this(v3.f.i(p2), v3.f.i(p3));
        return;
    }

    public Header(x8.j p2, String p3)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        kotlin.jvm.internal.j.e(p3, "value");
        this(p2, v3.f.i(p3));
        return;
    }

    public Header(x8.j p2, x8.j p3)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        kotlin.jvm.internal.j.e(p3, "value");
        this.a = p2;
        this.b = p3;
        this.c = (p3.d() + (p2.d() + 32));
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof okhttp3.internal.http2.Header)) {
                if (kotlin.jvm.internal.j.a(this.a, ((okhttp3.internal.http2.Header) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((okhttp3.internal.http2.Header) p5).b)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.b.hashCode() + (this.a.hashCode() * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a.r());
        v0_1.append(": ");
        v0_1.append(this.b.r());
        return v0_1.toString();
    }
}
