package okhttp3.internal.http;
public final class StatusLine {
    public static final okhttp3.internal.http.StatusLine$Companion d;
    public final okhttp3.Protocol a;
    public final int b;
    public final String c;

    static StatusLine()
    {
        okhttp3.internal.http.StatusLine.d = new okhttp3.internal.http.StatusLine$Companion(0);
        return;
    }

    public StatusLine(okhttp3.Protocol p2, int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p2, "protocol");
        kotlin.jvm.internal.j.e(p4, "message");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        if (this.a != okhttp3.Protocol.c) {
            v0_1.append("HTTP/1.1");
        } else {
            v0_1.append("HTTP/1.0");
        }
        v0_1.append(32);
        v0_1.append(this.b);
        v0_1.append(32);
        v0_1.append(this.c);
        return v0_1.toString();
    }
}
