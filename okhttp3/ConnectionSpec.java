package okhttp3;
public final class ConnectionSpec {
    public static final java.util.List e;
    public static final java.util.List f;
    public static final okhttp3.ConnectionSpec g;
    public static final okhttp3.ConnectionSpec h;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static ConnectionSpec()
    {
        new okhttp3.ConnectionSpec$Companion(0);
        okhttp3.TlsVersion v2_2 = okhttp3.CipherSuite.r;
        int v4 = okhttp3.CipherSuite.t;
        okhttp3.TlsVersion v6 = okhttp3.CipherSuite.n;
        okhttp3.CipherSuite v8 = okhttp3.CipherSuite.o;
        okhttp3.ConnectionSpec v0_2 = i7.h.V(new okhttp3.CipherSuite[] {v2_2, okhttp3.CipherSuite.p}));
        okhttp3.ConnectionSpec.e = v0_2;
        okhttp3.CipherSuite v12 = okhttp3.CipherSuite.k;
        okhttp3.CipherSuite v14 = okhttp3.CipherSuite.i;
        okhttp3.CipherSuite v16 = okhttp3.CipherSuite.g;
        okhttp3.TlsVersion v2_1 = i7.h.V(new okhttp3.CipherSuite[] {v2_2, okhttp3.CipherSuite.e}));
        okhttp3.ConnectionSpec.f = v2_1;
        okhttp3.ConnectionSpec$Builder v3_1 = new okhttp3.ConnectionSpec$Builder(1);
        okhttp3.TlsVersion v5_0 = new okhttp3.CipherSuite[0];
        okhttp3.ConnectionSpec v0_4 = ((okhttp3.CipherSuite[]) v0_2.toArray(v5_0));
        v3_1.c(((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(v0_4, v0_4.length)));
        okhttp3.ConnectionSpec v0_7 = okhttp3.TlsVersion.c;
        okhttp3.TlsVersion v5_2 = okhttp3.TlsVersion.d;
        v3_1.e(new okhttp3.TlsVersion[] {v0_7, v5_2}));
        v3_1.d = 1;
        v3_1.a();
        okhttp3.ConnectionSpec$Builder v3_3 = new okhttp3.ConnectionSpec$Builder(1);
        okhttp3.TlsVersion v6_1 = new okhttp3.CipherSuite[0];
        okhttp3.TlsVersion v6_3 = ((okhttp3.CipherSuite[]) v2_1.toArray(v6_1));
        v3_3.c(((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(v6_3, v6_3.length)));
        v3_3.e(new okhttp3.TlsVersion[] {v0_7, v5_2}));
        v3_3.d = 1;
        okhttp3.ConnectionSpec.g = v3_3.a();
        okhttp3.ConnectionSpec$Builder v3_6 = new okhttp3.ConnectionSpec$Builder(1);
        okhttp3.TlsVersion v6_7 = new okhttp3.CipherSuite[0];
        okhttp3.TlsVersion v2_4 = ((okhttp3.CipherSuite[]) v2_1.toArray(v6_7));
        v3_6.c(((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(v2_4, v2_4.length)));
        v3_6.e(new okhttp3.TlsVersion[] {v0_7, v5_2, okhttp3.TlsVersion.e, okhttp3.TlsVersion.f}));
        v3_6.d = 1;
        v3_6.a();
        okhttp3.ConnectionSpec.h = new okhttp3.ConnectionSpec$Builder(0).a();
        return;
    }

    public ConnectionSpec(boolean p1, boolean p2, String[] p3, String[] p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final void a(javax.net.ssl.SSLSocket p12, boolean p13)
    {
        java.util.ArrayList v0_0 = p12.getEnabledCipherSuites();
        kotlin.jvm.internal.j.b(v0_0);
        int v1_0 = this.c;
        if (v1_0 != 0) {
            okhttp3.CipherSuite.b.getClass();
            v0_0 = okhttp3.internal._UtilCommonKt.i(v1_0, v0_0, okhttp3.CipherSuite.c);
        }
        String[] v3_0;
        String[] v2_0 = this.d;
        if (v2_0 == null) {
            v3_0 = p12.getEnabledProtocols();
        } else {
            String[] v3_1 = p12.getEnabledProtocols();
            kotlin.jvm.internal.j.d(v3_1, "getEnabledProtocols(...)");
            v3_0 = okhttp3.internal._UtilCommonKt.i(v3_1, v2_0, k7.a.b);
        }
        int v4_2 = p12.getSupportedCipherSuites();
        kotlin.jvm.internal.j.b(v4_2);
        okhttp3.CipherSuite.b.getClass();
        okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1 v5_1 = okhttp3.CipherSuite.c;
        kotlin.jvm.internal.j.e(v5_1, "comparator");
        int v7 = 0;
        while (v7 < v4_2.length) {
            if (v5_1.compare(v4_2[v7], "TLS_FALLBACK_SCSV") != 0) {
                v7++;
            }
            if ((p13 != null) && (v7 != -1)) {
                String[] v13_1 = v4_2[v7];
                kotlin.jvm.internal.j.d(v13_1, "get(...)");
                kotlin.jvm.internal.j.e(v0_0, "<this>");
                java.util.ArrayList v0_1 = java.util.Arrays.copyOf(v0_0, (v0_0.length + 1));
                kotlin.jvm.internal.j.d(v0_1, "copyOf(...)");
                v0_0 = ((String[]) v0_1);
                v0_0[(v0_0.length - 1)] = v13_1;
            }
            String[] v13_3 = new okhttp3.ConnectionSpec$Builder();
            v13_3.a = this.a;
            v13_3.b = v1_0;
            v13_3.c = v2_0;
            v13_3.d = this.b;
            v13_3.b(((String[]) java.util.Arrays.copyOf(v0_0, v0_0.length)));
            v13_3.d(((String[]) java.util.Arrays.copyOf(v3_0, v3_0.length)));
            String[] v13_4 = v13_3.a();
            if (v13_4.c() != null) {
                p12.setEnabledProtocols(v13_4.d);
            }
            if (v13_4.b() != null) {
                p12.setEnabledCipherSuites(v13_4.c);
            }
            return;
        }
        v7 = -1;
    }

    public final java.util.ArrayList b()
    {
        int v0_0 = this.c;
        if (v0_0 == 0) {
            return 0;
        } else {
            java.util.ArrayList v1_1 = new java.util.ArrayList(v0_0.length);
            int v2_1 = v0_0.length;
            int v3 = 0;
            while (v3 < v2_1) {
                v1_1.add(okhttp3.CipherSuite.b.b(v0_0[v3]));
                v3++;
            }
            return v1_1;
        }
    }

    public final java.util.ArrayList c()
    {
        int v0_0 = this.d;
        if (v0_0 == 0) {
            return 0;
        } else {
            java.util.ArrayList v1_1 = new java.util.ArrayList(v0_0.length);
            int v2_1 = v0_0.length;
            int v3 = 0;
            while (v3 < v2_1) {
                okhttp3.TlsVersion v4_0 = v0_0[v3];
                okhttp3.TlsVersion.b.getClass();
                v1_1.add(okhttp3.TlsVersion$Companion.a(v4_0));
                v3++;
            }
            return v1_1;
        }
    }

    public final boolean equals(Object p3)
    {
        if ((p3 instanceof okhttp3.ConnectionSpec)) {
            if (p3 != this) {
                String[] v1_1 = this.a;
                if ((v1_1 != ((okhttp3.ConnectionSpec) p3).a) || ((v1_1 != null) && ((!java.util.Arrays.equals(this.c, ((okhttp3.ConnectionSpec) p3).c)) || ((!java.util.Arrays.equals(this.d, ((okhttp3.ConnectionSpec) p3).d)) || (this.b != ((okhttp3.ConnectionSpec) p3).b))))) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public final int hashCode()
    {
        if (!this.a) {
            return 17;
        } else {
            String[] v1_2;
            int v0_1 = 0;
            String[] v1_1 = this.c;
            if (v1_1 == null) {
                v1_2 = 0;
            } else {
                v1_2 = java.util.Arrays.hashCode(v1_1);
            }
            int v2_2 = ((527 + v1_2) * 31);
            String[] v1_0 = this.d;
            if (v1_0 != null) {
                v0_1 = java.util.Arrays.hashCode(v1_0);
            }
            return (((v2_2 + v0_1) * 31) + (this.b ^ 1));
        }
    }

    public final String toString()
    {
        if (this.a) {
            String v0_4 = new StringBuilder("ConnectionSpec(cipherSuites=");
            v0_4.append(java.util.Objects.toString(this.b(), "[all enabled]"));
            v0_4.append(", tlsVersions=");
            v0_4.append(java.util.Objects.toString(this.c(), "[all enabled]"));
            v0_4.append(", supportsTlsExtensions=");
            v0_4.append(this.b);
            v0_4.append(41);
            return v0_4.toString();
        } else {
            return "ConnectionSpec()";
        }
    }
}
