package okhttp3.internal.http;
public final class StatusLine$Companion {

    private StatusLine$Companion()
    {
        return;
    }

    public synthetic StatusLine$Companion(int p1)
    {
        return;
    }

    public static okhttp3.internal.http.StatusLine a(String p9)
    {
        java.net.ProtocolException v0_7;
        int v4_0;
        kotlin.jvm.internal.j.e(p9, "statusLine");
        if (!b8.p.p0(p9, "HTTP/1.")) {
            if (!b8.p.p0(p9, "ICY ")) {
                if (!b8.p.p0(p9, "SOURCETABLE ")) {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(p9));
                } else {
                    v0_7 = okhttp3.Protocol.d;
                    v4_0 = 12;
                }
            } else {
                v0_7 = okhttp3.Protocol.c;
                v4_0 = 4;
            }
        } else {
            v4_0 = 9;
            if ((p9.length() < 9) || (p9.charAt(8) != 32)) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(p9));
            } else {
                java.net.ProtocolException v0_16 = (p9.charAt(7) - 48);
                if (v0_16 == null) {
                    v0_7 = okhttp3.Protocol.c;
                } else {
                    if (v0_16 != 1) {
                        throw new java.net.ProtocolException("Unexpected status line: ".concat(p9));
                    } else {
                        v0_7 = okhttp3.Protocol.d;
                    }
                }
            }
        }
        char v6_0 = (v4_0 + 3);
        if (p9.length() < v6_0) {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(p9));
        } else {
            int v5_2 = p9.substring(v4_0, v6_0);
            kotlin.jvm.internal.j.d(v5_2, "substring(...)");
            int v5_3 = b8.p.q0(v5_2);
            if (v5_3 == 0) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(p9));
            } else {
                String v9_6;
                int v5_4 = v5_3.intValue();
                if (p9.length() <= v6_0) {
                    v9_6 = "";
                } else {
                    if (p9.charAt(v6_0) != 32) {
                        throw new java.net.ProtocolException("Unexpected status line: ".concat(p9));
                    } else {
                        v9_6 = p9.substring((v4_0 + 4));
                        kotlin.jvm.internal.j.d(v9_6, "substring(...)");
                    }
                }
                return new okhttp3.internal.http.StatusLine(v0_7, v5_4, v9_6);
            }
        }
    }
}
