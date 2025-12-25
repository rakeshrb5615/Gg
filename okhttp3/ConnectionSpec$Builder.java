package okhttp3;
public final class ConnectionSpec$Builder {
    public boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public ConnectionSpec$Builder(boolean p1)
    {
        this.a = p1;
        return;
    }

    public final okhttp3.ConnectionSpec a()
    {
        return new okhttp3.ConnectionSpec(this.a, this.d, this.b, this.c);
    }

    public final varargs void b(String[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        } else {
            if (p2.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            } else {
                IllegalArgumentException v2_3 = java.util.Arrays.copyOf(p2, p2.length);
                kotlin.jvm.internal.j.d(v2_3, "copyOf(...)");
                this.b = ((String[]) v2_3);
                return;
            }
        }
    }

    public final varargs void c(okhttp3.CipherSuite[] p6)
    {
        kotlin.jvm.internal.j.e(p6, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        } else {
            int v0_1 = new java.util.ArrayList(p6.length);
            int v1_0 = p6.length;
            int v3 = 0;
            while (v3 < v1_0) {
                v0_1.add(p6[v3].a);
                v3++;
            }
            String[] v6_1 = new String[0];
            String[] v6_3 = ((String[]) v0_1.toArray(v6_1));
            this.b(((String[]) java.util.Arrays.copyOf(v6_3, v6_3.length)));
            return;
        }
    }

    public final varargs void d(String[] p2)
    {
        kotlin.jvm.internal.j.e(p2, "tlsVersions");
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        } else {
            if (p2.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            } else {
                IllegalArgumentException v2_3 = java.util.Arrays.copyOf(p2, p2.length);
                kotlin.jvm.internal.j.d(v2_3, "copyOf(...)");
                this.c = ((String[]) v2_3);
                return;
            }
        }
    }

    public final varargs void e(okhttp3.TlsVersion[] p6)
    {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        } else {
            int v0_4 = new java.util.ArrayList(p6.length);
            int v1_1 = p6.length;
            int v3 = 0;
            while (v3 < v1_1) {
                v0_4.add(p6[v3].a);
                v3++;
            }
            String[] v6_1 = new String[0];
            String[] v6_3 = ((String[]) v0_4.toArray(v6_1));
            this.d(((String[]) java.util.Arrays.copyOf(v6_3, v6_3.length)));
            return;
        }
    }
}
