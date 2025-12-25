package okhttp3.internal.tls;
public final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    public static final okhttp3.internal.tls.OkHostnameVerifier a;

    static OkHostnameVerifier()
    {
        okhttp3.internal.tls.OkHostnameVerifier.a = new okhttp3.internal.tls.OkHostnameVerifier();
        return;
    }

    private OkHostnameVerifier()
    {
        return;
    }

    public static java.util.List a(java.security.cert.X509Certificate p4, int p5)
    {
        try {
            java.util.Iterator v4_1 = p4.getSubjectAlternativeNames();
        } catch (java.security.cert.CertificateParsingException) {
            return i7.n.a;
        }
        if (v4_1 != null) {
            java.util.ArrayList v0_1 = new java.util.ArrayList();
            java.util.Iterator v4_3 = v4_1.iterator();
            while (v4_3.hasNext()) {
                String v1_1 = ((java.util.List) v4_3.next());
                if (v1_1 != null) {
                    if (v1_1.size() >= 2) {
                        if (kotlin.jvm.internal.j.a(v1_1.get(0), Integer.valueOf(p5))) {
                            String v1_2 = v1_1.get(1);
                            if (v1_2 != null) {
                                v0_1.add(((String) v1_2));
                            } else {
                            }
                        }
                    } else {
                    }
                }
            }
            return v0_1;
        } else {
            return i7.n.a;
        }
    }

    public static boolean b(String p13)
    {
        IllegalArgumentException v0_0 = p13.length();
        int v1 = p13.length();
        if (v1 < 0) {
            throw new IllegalArgumentException(v1.a.j("endIndex < beginIndex: ", v1, " < 0").toString());
        } else {
            if (v1 > p13.length()) {
                IllegalArgumentException v0_3 = v1.a.p("endIndex > string.length: ", v1, " > ");
                v0_3.append(p13.length());
                throw new IllegalArgumentException(v0_3.toString().toString());
            } else {
                long v3 = 0;
                int v5 = 0;
                while (v5 < v1) {
                    long v6_0 = p13.charAt(v5);
                    if (v6_0 >= 128) {
                        long v6_4;
                        if (v6_0 >= 2048) {
                            if ((v6_0 >= 55296) && (v6_0 <= 57343)) {
                                String v11;
                                int v10 = (v5 + 1);
                                if (v10 >= v1) {
                                    v11 = 0;
                                } else {
                                    v11 = p13.charAt(v10);
                                }
                                if ((v6_0 <= 56319) && ((v11 >= 56320) && (v11 <= 57343))) {
                                    v3 += ((long) 4);
                                    v5 += 2;
                                } else {
                                    v3++;
                                    v5 = v10;
                                }
                            } else {
                                v6_4 = 3;
                            }
                        } else {
                            v6_4 = 2;
                        }
                        v3 += ((long) v6_4);
                    } else {
                        v3++;
                    }
                    v5++;
                }
                if (v0_0 != ((int) v3)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }

    public static boolean c(String p11, java.security.cert.X509Certificate p12)
    {
        kotlin.jvm.internal.j.e(p11, "host");
        int v0_17 = okhttp3.internal._HostnamesCommonKt.a;
        v0_17.getClass();
        if (!v0_17.a.matcher(p11).matches()) {
            if (okhttp3.internal.tls.OkHostnameVerifier.b(p11)) {
                int v0_14 = java.util.Locale.US;
                kotlin.jvm.internal.j.d(v0_14, "US");
                p11 = p11.toLowerCase(v0_14);
                kotlin.jvm.internal.j.d(p11, "toLowerCase(...)");
            }
            java.util.Iterator v12_3 = okhttp3.internal.tls.OkHostnameVerifier.a(p12, 2);
            if (!v12_3.isEmpty()) {
                java.util.Iterator v12_4 = v12_3.iterator();
                while (v12_4.hasNext()) {
                    int v0_5;
                    int v0_20 = ((String) v12_4.next());
                    okhttp3.internal.tls.OkHostnameVerifier.a.getClass();
                    if ((p11.length() != 0) && ((!b8.p.p0(p11, ".")) && ((!b8.p.l0(p11, "..", 0)) && ((v0_20 != 0) && ((v0_20.length() != 0) && ((!b8.p.p0(v0_20, ".")) && (!b8.p.l0(v0_20, "..", 0)))))))) {
                        String v6_4;
                        if (b8.p.l0(p11, ".", 0)) {
                            v6_4 = p11;
                        } else {
                            v6_4 = p11.concat(".");
                        }
                        if (!b8.p.l0(v0_20, ".", 0)) {
                            v0_20 = v0_20.concat(".");
                        }
                        if (okhttp3.internal.tls.OkHostnameVerifier.b(v0_20)) {
                            int v5_9 = java.util.Locale.US;
                            kotlin.jvm.internal.j.d(v5_9, "US");
                            v0_20 = v0_20.toLowerCase(v5_9);
                            kotlin.jvm.internal.j.d(v0_20, "toLowerCase(...)");
                        }
                        if (b8.i.s0(v0_20, "*")) {
                            if ((b8.p.p0(v0_20, "*.")) && ((b8.i.v0(v0_20, 42, 1, 4) == -1) && ((v6_4.length() >= v0_20.length()) && (!"*.".equals(v0_20))))) {
                                int v0_1 = v0_20.substring(1);
                                kotlin.jvm.internal.j.d(v0_1, "substring(...)");
                                if (b8.p.l0(v6_4, v0_1, 0)) {
                                    int v5_3 = (v6_4.length() - v0_1.length());
                                    if ((v5_3 <= 0) || (b8.i.z0(v6_4, 46, (v5_3 - 1), 4) == -1)) {
                                        v0_5 = 1;
                                    } else {
                                        v0_5 = 0;
                                    }
                                }
                            }
                        } else {
                            v0_5 = kotlin.jvm.internal.j.a(v6_4, v0_20);
                        }
                    }
                    if (v0_5 != 0) {
                        return 1;
                    }
                }
            }
        } else {
            String v11_1 = okhttp3.internal._HostnamesCommonKt.b(p11);
            java.util.Iterator v12_1 = okhttp3.internal.tls.OkHostnameVerifier.a(p12, 7);
            if (!v12_1.isEmpty()) {
                java.util.Iterator v12_2 = v12_1.iterator();
                while (v12_2.hasNext()) {
                    if (kotlin.jvm.internal.j.a(v11_1, okhttp3.internal._HostnamesCommonKt.b(((String) v12_2.next())))) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean verify(String p3, javax.net.ssl.SSLSession p4)
    {
        kotlin.jvm.internal.j.e(p3, "host");
        kotlin.jvm.internal.j.e(p4, "session");
        try {
            if (okhttp3.internal.tls.OkHostnameVerifier.b(p3)) {
                java.security.cert.X509Certificate v4_1 = p4.getPeerCertificates()[0];
                kotlin.jvm.internal.j.c(v4_1, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return okhttp3.internal.tls.OkHostnameVerifier.c(p3, ((java.security.cert.X509Certificate) v4_1));
            } else {
                return 0;
            }
        } catch (javax.net.ssl.SSLException) {
            return 0;
        }
    }
}
