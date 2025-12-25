package okhttp3.internal.http2;
public final class Http2Reader$Companion {

    private Http2Reader$Companion()
    {
        return;
    }

    public synthetic Http2Reader$Companion(int p1)
    {
        return;
    }

    public static int a(int p2, int p3, int p4)
    {
        if ((p3 & 8) != 0) {
            p2--;
        }
        if (p4 > p2) {
            throw new java.io.IOException(v1.a.i("PROTOCOL_ERROR padding ", p4, p2, " > remaining length "));
        } else {
            return (p2 - p4);
        }
    }
}
