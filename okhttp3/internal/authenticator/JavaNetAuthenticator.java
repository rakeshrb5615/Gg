package okhttp3.internal.authenticator;
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    public final okhttp3.Dns b;

    public JavaNetAuthenticator()
    {
        this(0);
        return;
    }

    public JavaNetAuthenticator(int p2)
    {
        p2 = okhttp3.Dns.a;
        kotlin.jvm.internal.j.e(p2, "defaultDns");
        this.b = p2;
        return;
    }

    public static java.net.InetAddress b(java.net.Proxy p2, okhttp3.HttpUrl p3, okhttp3.Dns p4)
    {
        int v0_2;
        int v0_0 = p2.type();
        if (v0_0 != 0) {
            v0_2 = okhttp3.internal.authenticator.JavaNetAuthenticator$WhenMappings.a[v0_0.ordinal()];
        } else {
            v0_2 = -1;
        }
        if (v0_2 != 1) {
            java.util.NoSuchElementException v2_1 = p2.address();
            kotlin.jvm.internal.j.c(v2_1, "null cannot be cast to non-null type java.net.InetSocketAddress");
            java.util.NoSuchElementException v2_3 = ((java.net.InetSocketAddress) v2_1).getAddress();
            kotlin.jvm.internal.j.d(v2_3, "getAddress(...)");
            return v2_3;
        } else {
            java.util.NoSuchElementException v2_5 = p4.a(p3.d);
            if (v2_5.isEmpty()) {
                throw new java.util.NoSuchElementException("List is empty.");
            } else {
                return ((java.net.InetAddress) v2_5.get(0));
            }
        }
    }

    public final okhttp3.Request a(okhttp3.Route p21, okhttp3.Response p22)
    {
        okhttp3.Request v0_0;
        okhttp3.Request v0_5;
        okhttp3.Request v3_0 = p22.f;
        okhttp3.Request v0_10 = p22.d;
        StringBuilder v5_3 = 0;
        if (v0_10 == 401) {
            v0_0 = "WWW-Authenticate";
            x8.j v4_0 = v0_0;
            okhttp3.internal.authenticator.JavaNetAuthenticator v7_1 = new java.util.ArrayList();
            java.net.PasswordAuthentication v8_4 = v3_0.size();
            java.net.InetAddress v9_2 = 0;
            while (v9_2 < v8_4) {
                if (v4_0.equalsIgnoreCase(v3_0.c(v9_2))) {
                    okhttp3.Request v0_9 = new x8.g();
                    v0_9.S(v3_0.e(v9_2));
                    try {
                        okhttp3.internal.http.HttpHeaders.b(v0_9, v7_1);
                    } catch (okhttp3.Request v0_11) {
                        okhttp3.internal.platform.Platform.a.getClass();
                        okhttp3.internal.platform.Platform.b.j(5, "Unable to parse challenge", v0_11);
                    }
                }
                v9_2++;
            }
            v0_5 = v7_1;
        } else {
            if (v0_10 == 407) {
                v0_0 = "Proxy-Authenticate";
            } else {
                v0_5 = i7.n.a;
            }
        }
        okhttp3.Request v3_1 = p22.a;
        x8.j v4_8 = v3_1.a;
        if (p22.d == 407) {
            v5_3 = 1;
        }
        okhttp3.Request$Builder v2_11;
        if (p21 == null) {
            v2_11 = java.net.Proxy.NO_PROXY;
        } else {
            v2_11 = p21.b;
        }
        okhttp3.Request v0_12 = v0_5.iterator();
        while (v0_12.hasNext()) {
            int v6_3 = ((okhttp3.Challenge) v0_12.next());
            if ("Basic".equalsIgnoreCase(v6_3.a)) {
                java.net.PasswordAuthentication v8_6;
                if (p21 == null) {
                    v8_6 = this.b;
                } else {
                    okhttp3.internal.authenticator.JavaNetAuthenticator v7_5 = p21.a.a;
                    if (v7_5 != null) {
                        v8_6 = v7_5;
                    }
                }
                java.net.PasswordAuthentication v8_3;
                if (v5_3 == null) {
                    String v10_6 = v4_8.d;
                    kotlin.jvm.internal.j.b(v2_11);
                    try {
                        v8_3 = java.net.Authenticator.requestPasswordAuthentication(v10_6, okhttp3.internal.authenticator.JavaNetAuthenticator.b(v2_11, v4_8, v8_6), v4_8.e, v4_8.a, ((String) v6_3.b.get("realm")), v6_3.a, new java.net.URL(v4_8.i), java.net.Authenticator$RequestorType.SERVER);
                    } catch (okhttp3.Request v0_14) {
                        throw new RuntimeException(v0_14);
                    }
                } else {
                    String v10_0 = v2_11.address();
                    kotlin.jvm.internal.j.c(v10_0, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    String v10_1 = ((java.net.InetSocketAddress) v10_0);
                    try {
                        v8_3 = java.net.Authenticator.requestPasswordAuthentication(v10_1.getHostName(), okhttp3.internal.authenticator.JavaNetAuthenticator.b(v2_11, v4_8, v8_6), v10_1.getPort(), v4_8.a, ((String) v6_3.b.get("realm")), v6_3.a, new java.net.URL(v4_8.i), java.net.Authenticator$RequestorType.PROXY);
                    } catch (okhttp3.Request v0_1) {
                        throw new RuntimeException(v0_1);
                    }
                }
                if (v8_3 != null) {
                    okhttp3.Request v0_2;
                    if (v5_3 == null) {
                        v0_2 = "Authorization";
                    } else {
                        v0_2 = "Proxy-Authorization";
                    }
                    okhttp3.Request$Builder v2_6;
                    String v1_3 = v8_3.getUserName();
                    kotlin.jvm.internal.j.d(v1_3, "getUserName(...)");
                    okhttp3.Request$Builder v2_2 = v8_3.getPassword();
                    kotlin.jvm.internal.j.d(v2_2, "getPassword(...)");
                    x8.j v4_3 = new String(v2_2);
                    okhttp3.Request$Builder v2_5 = ((String) v6_3.b.get("charset"));
                    try {
                        if (v2_5 == null) {
                            v2_6 = b8.a.d;
                        } else {
                            v2_6 = java.nio.charset.Charset.forName(v2_5);
                            kotlin.jvm.internal.j.d(v2_6, "forName(...)");
                        }
                    } catch (Exception) {
                    }
                    kotlin.jvm.internal.j.e(v2_6, "charset");
                    StringBuilder v5_2 = new StringBuilder();
                    v5_2.append(v1_3);
                    v5_2.append(58);
                    v5_2.append(v4_3);
                    String v1_5 = v5_2.toString();
                    kotlin.jvm.internal.j.e(v1_5, "<this>");
                    String v1_6 = v1_5.getBytes(v2_6);
                    kotlin.jvm.internal.j.d(v1_6, "getBytes(...)");
                    String v1_8 = "Basic ".concat(new x8.j(v1_6).a());
                    okhttp3.Request$Builder v2_9 = v3_1.a();
                    v2_9.a(v0_2, v1_8);
                    return new okhttp3.Request(v2_9);
                }
            }
        }
        return 0;
    }
}
