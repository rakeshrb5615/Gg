package okhttp3.internal.tls;
public final class BasicCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {
    public final okhttp3.internal.tls.TrustRootIndex b;

    static BasicCertificateChainCleaner()
    {
        new okhttp3.internal.tls.BasicCertificateChainCleaner$Companion(0);
        return;
    }

    public BasicCertificateChainCleaner(okhttp3.internal.tls.TrustRootIndex p2)
    {
        kotlin.jvm.internal.j.e(p2, "trustRootIndex");
        this.b = p2;
        return;
    }

    public static boolean b(java.security.cert.X509Certificate p2, java.security.cert.X509Certificate p3, int p4)
    {
        try {
            if ((kotlin.jvm.internal.j.a(p2.getIssuerDN(), p3.getSubjectDN())) && (p3.getBasicConstraints() >= p4)) {
                p2.verify(p3.getPublicKey());
                return 1;
            } else {
                return 0;
            }
        } catch (java.security.GeneralSecurityException) {
            return 0;
        }
    }

    public final java.util.List a(String p9, java.util.List p10)
    {
        kotlin.jvm.internal.j.e(p10, "chain");
        kotlin.jvm.internal.j.e(p9, "hostname");
        javax.net.ssl.SSLPeerUnverifiedException v9_5 = new java.util.ArrayDeque(p10);
        String v10_6 = new java.util.ArrayList();
        int v0_6 = v9_5.removeFirst();
        kotlin.jvm.internal.j.d(v0_6, "removeFirst(...)");
        v10_6.add(v0_6);
        int v0_1 = 0;
        int v1_1 = 0;
        while (v0_1 < 9) {
            java.security.cert.X509Certificate v2_3 = v10_6.get((v10_6.size() - 1));
            kotlin.jvm.internal.j.c(v2_3, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            java.security.cert.X509Certificate v2_4 = ((java.security.cert.X509Certificate) v2_3);
            java.util.Iterator v5_1 = this.b.a(v2_4);
            if (v5_1 == null) {
                java.util.Iterator v5_2 = v9_5.iterator();
                kotlin.jvm.internal.j.d(v5_2, "iterator(...)");
                while (v5_2.hasNext()) {
                    java.security.cert.X509Certificate v6_2 = v5_2.next();
                    kotlin.jvm.internal.j.c(v6_2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    java.security.cert.X509Certificate v6_3 = ((java.security.cert.X509Certificate) v6_2);
                    if (okhttp3.internal.tls.BasicCertificateChainCleaner.b(v2_4, v6_3, (v10_6.size() - 1))) {
                        v5_2.remove();
                        v10_6.add(v6_3);
                        v0_1++;
                    }
                }
                if (v1_1 == 0) {
                    String v10_3 = new StringBuilder("Failed to find a trusted cert that signed ");
                    v10_3.append(v2_4);
                    throw new javax.net.ssl.SSLPeerUnverifiedException(v10_3.toString());
                }
            } else {
                if ((v10_6.size() > 1) || (!v2_4.equals(v5_1))) {
                    v10_6.add(v5_1);
                }
                if (!okhttp3.internal.tls.BasicCertificateChainCleaner.b(v5_1, v5_1, (v10_6.size() - 2))) {
                    v1_1 = 1;
                }
            }
            return v10_6;
        }
        int v0_4 = new StringBuilder("Certificate chain too long: ");
        v0_4.append(v10_6);
        throw new javax.net.ssl.SSLPeerUnverifiedException(v0_4.toString());
    }

    public final boolean equals(Object p3)
    {
        if (p3 != this) {
            if ((!(p3 instanceof okhttp3.internal.tls.BasicCertificateChainCleaner)) || (!kotlin.jvm.internal.j.a(((okhttp3.internal.tls.BasicCertificateChainCleaner) p3).b, this.b))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.b.hashCode();
    }
}
