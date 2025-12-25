package okhttp3;
public final class Protocol$Companion {

    private Protocol$Companion()
    {
        return;
    }

    public synthetic Protocol$Companion(int p1)
    {
        return;
    }

    public static okhttp3.Protocol a(String p2)
    {
        if (!p2.equals("http/1.0")) {
            if (!p2.equals("http/1.1")) {
                if (!p2.equals("h2_prior_knowledge")) {
                    if (!p2.equals("h2")) {
                        if (!p2.equals("spdy/3.1")) {
                            if (!p2.equals("quic")) {
                                if (!b8.p.p0(p2, "h3")) {
                                    throw new java.io.IOException("Unexpected protocol: ".concat(p2));
                                } else {
                                    return okhttp3.Protocol.o;
                                }
                            } else {
                                return okhttp3.Protocol.n;
                            }
                        } else {
                            return okhttp3.Protocol.e;
                        }
                    } else {
                        return okhttp3.Protocol.f;
                    }
                } else {
                    return okhttp3.Protocol.m;
                }
            } else {
                return okhttp3.Protocol.d;
            }
        } else {
            return okhttp3.Protocol.c;
        }
    }
}
