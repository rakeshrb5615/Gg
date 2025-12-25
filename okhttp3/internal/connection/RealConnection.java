package okhttp3.internal.connection;
public final class RealConnection extends okhttp3.internal.http2.Http2Connection$Listener implements okhttp3.Connection, okhttp3.internal.http.ExchangeCodec$Carrier, okhttp3.internal.concurrent.Lockable {
    public final okhttp3.internal.concurrent.TaskRunner b;
    public final okhttp3.Route c;
    public final java.net.Socket d;
    public final java.net.Socket e;
    public final okhttp3.Handshake f;
    public final okhttp3.Protocol m;
    public final okhttp3.internal.connection.BufferedSocket n;
    public final okhttp3.internal.connection.ConnectionListener o;
    public okhttp3.internal.http2.Http2Connection p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final java.util.ArrayList w;
    public long x;

    static RealConnection()
    {
        new okhttp3.internal.connection.RealConnection$Companion(0);
        return;
    }

    public RealConnection(okhttp3.internal.concurrent.TaskRunner p2, okhttp3.internal.connection.RealConnectionPool p3, okhttp3.Route p4, java.net.Socket p5, java.net.Socket p6, okhttp3.Handshake p7, okhttp3.Protocol p8, okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1 p9, okhttp3.internal.connection.ConnectionListener p10)
    {
        kotlin.jvm.internal.j.e(p2, "taskRunner");
        kotlin.jvm.internal.j.e(p3, "connectionPool");
        kotlin.jvm.internal.j.e(p4, "route");
        kotlin.jvm.internal.j.e(p5, "rawSocket");
        kotlin.jvm.internal.j.e(p6, "javaNetSocket");
        kotlin.jvm.internal.j.e(p8, "protocol");
        kotlin.jvm.internal.j.e(p9, "socket");
        kotlin.jvm.internal.j.e(p10, "connectionListener");
        this.b = p2;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        this.m = p8;
        this.n = p9;
        this.o = p10;
        this.v = 1;
        this.w = new java.util.ArrayList();
        this.x = 9223372036854775807;
        return;
    }

    public static void d(okhttp3.OkHttpClient p3, okhttp3.Route p4, java.io.IOException p5)
    {
        kotlin.jvm.internal.j.e(p4, "failedRoute");
        kotlin.jvm.internal.j.e(p5, "failure");
        if (p4.b.type() != java.net.Proxy$Type.DIRECT) {
            java.net.URI v0_6 = p4.a;
            v0_6.g.connectFailed(v0_6.h.h(), p4.b.address(), p5);
        }
        p3.y.a.add(p4);
        return;
    }

    public final void a(okhttp3.internal.http2.Http2Connection p1, okhttp3.internal.http2.Settings p2)
    {
        kotlin.jvm.internal.j.e(p2, "settings");
        try {
            int v1_3;
            if ((p2.a & 8) == 0) {
                v1_3 = 2147483647;
            } else {
                v1_3 = p2.b[3];
            }
        } catch (int v1_5) {
            throw v1_5;
        }
        this.v = v1_3;
        return;
    }

    public final void b(okhttp3.internal.connection.RealCall p5, java.io.IOException p6)
    {
        int v2 = 0;
        if (!(p6 instanceof okhttp3.internal.http2.StreamResetException)) {
            okhttp3.Route v0_9;
            if (this.p == null) {
                v0_9 = 0;
            } else {
                v0_9 = 1;
            }
            if ((v0_9 == null) || ((p6 instanceof okhttp3.internal.http2.ConnectionShutdownException))) {
                v2 = (this.q ^ 1);
                this.q = 1;
                if (this.t == 0) {
                    if (p6 != null) {
                        okhttp3.internal.connection.RealConnection.d(p5.a, this.c, p6);
                    }
                    this.s = (this.s + 1);
                }
            }
        } else {
            if (((okhttp3.internal.http2.StreamResetException) p6).a != okhttp3.internal.http2.ErrorCode.m) {
                if ((((okhttp3.internal.http2.StreamResetException) p6).a != okhttp3.internal.http2.ErrorCode.n) || (!p5.w)) {
                    v2 = (this.q ^ 1);
                    this.q = 1;
                    this.s = (this.s + 1);
                }
            } else {
                int v5_9 = (this.u + 1);
                this.u = v5_9;
                if (v5_9 > 1) {
                    v2 = (this.q ^ 1);
                    this.q = 1;
                    this.s = (this.s + 1);
                }
            }
        }
        if (v2 != 0) {
            this.o.getClass();
        }
        return;
    }

    public final void c(okhttp3.internal.http2.Http2Stream p3)
    {
        p3.e(okhttp3.internal.http2.ErrorCode.m, 0);
        return;
    }

    public final void cancel()
    {
        okhttp3.internal._UtilJvmKt.b(this.d);
        return;
    }

    public final boolean e(okhttp3.Address p11, java.util.List p12)
    {
        okhttp3.Handshake v1_0 = p11.h;
        try {
            if ((this.w.size() < this.v) && (!this.q)) {
                okhttp3.internal.tls.OkHostnameVerifier v2_0 = this.c;
                okhttp3.Address v5 = v2_0.a;
                if (v2_0.a.a(p11)) {
                    String v6 = v1_0.d;
                    if (!kotlin.jvm.internal.j.a(v1_0.d, v5.h.d)) {
                        if ((this.p != null) && ((p12) && (!p12.isEmpty()))) {
                            boolean v12_2 = p12.iterator();
                            while (v12_2.hasNext()) {
                                String v3_8 = ((okhttp3.Route) v12_2.next());
                                java.net.Proxy$Type v9 = java.net.Proxy$Type.DIRECT;
                                if ((v3_8.b.type() == v9) && ((v2_0.b.type() == v9) && (kotlin.jvm.internal.j.a(v2_0.c, v3_8.c)))) {
                                    okhttp3.internal.tls.OkHostnameVerifier v2_3 = okhttp3.internal.tls.OkHostnameVerifier.a;
                                    if (p11.d != v2_3) {
                                        break;
                                    }
                                    boolean v12_4 = v5.h;
                                    if (v1_0.e != v12_4.e) {
                                        break;
                                    }
                                    okhttp3.Handshake v1_2 = this.f;
                                    if (!kotlin.jvm.internal.j.a(v6, v12_4.d)) {
                                        if ((this.r) || (v1_2 == null)) {
                                            break;
                                        }
                                        boolean v12_8 = v1_2.a();
                                        if (v12_8.isEmpty()) {
                                            break;
                                        }
                                        boolean v12_9 = v12_8.get(0);
                                        kotlin.jvm.internal.j.c(v12_9, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        boolean v12_10 = ((java.security.cert.X509Certificate) v12_9);
                                        v2_3.getClass();
                                        if (!okhttp3.internal.tls.OkHostnameVerifier.c(v6, v12_10)) {
                                            break;
                                        }
                                    }
                                    String v11_2 = p11.e;
                                    kotlin.jvm.internal.j.b(v11_2);
                                    kotlin.jvm.internal.j.b(v1_2);
                                    boolean v12_12 = v1_2.a();
                                    kotlin.jvm.internal.j.e(v6, "hostname");
                                    kotlin.jvm.internal.j.e(v12_12, "peerCertificates");
                                    String v11_4 = v11_2.a.iterator();
                                    if (v11_4.hasNext()) {
                                        ((okhttp3.CertificatePinner$Pin) v11_4.next()).getClass();
                                        b8.p.p0(0, "**.");
                                        throw 0;
                                    } else {
                                        return 1;
                                    }
                                }
                            }
                        }
                    } else {
                        return 1;
                    }
                }
            }
        } catch (javax.net.ssl.SSLPeerUnverifiedException) {
        }
        return 0;
    }

    public final okhttp3.Route f()
    {
        return this.c;
    }

    public final boolean g(boolean p10)
    {
        Throwable v0_0 = System.nanoTime();
        int v3 = 0;
        if ((!this.d.isClosed()) && ((!this.e.isClosed()) && ((!this.e.isInputShutdown()) && (!this.e.isOutputShutdown())))) {
            okhttp3.internal.http2.Http2Connection v2_5 = this.p;
            if (v2_5 == null) {
                try {
                    if (((v0_0 - this.x) < 10000000000) || (p10 == null)) {
                        return 1;
                    } else {
                        java.net.Socket v10_2 = this.e;
                        Throwable v0_4 = this.n.a();
                        kotlin.jvm.internal.j.e(v10_2, "<this>");
                        kotlin.jvm.internal.j.e(v0_4, "source");
                        try {
                            int v1_2 = v10_2.getSoTimeout();
                        } catch (java.net.SocketTimeoutException) {
                            v3 = 1;
                            return v3;
                        } catch (java.io.IOException) {
                            return v3;
                        }
                        v10_2.setSoTimeout(1);
                        Throwable v0_6 = (v0_4.h() ^ 1);
                        v10_2.setSoTimeout(v1_2);
                        return v0_6;
                    }
                } catch (java.net.Socket v10_1) {
                    throw v10_1;
                }
            } else {
                try {
                    if (!v2_5.f) {
                        if ((v2_5.t >= v2_5.s) || (v0_0 < v2_5.u)) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } catch (java.net.Socket v10_5) {
                    throw v10_5;
                }
            }
        } else {
            return 0;
        }
    }

    public final void h()
    {
        try {
            this.q = 1;
            this.o.getClass();
            return;
        } catch (Throwable v0_2) {
            throw v0_2;
        }
    }

    public final void i()
    {
        this.x = System.nanoTime();
        okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_7 = this.m;
        if ((v0_7 != okhttp3.Protocol.f) && (v0_7 != okhttp3.Protocol.m)) {
            return;
        } else {
            okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_6;
            this.e.setSoTimeout(0);
            okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_3 = this.o;
            if (!(v0_3 instanceof okhttp3.internal.http2.FlowControlListener)) {
                v0_6 = 0;
            } else {
                v0_6 = ((okhttp3.internal.http2.FlowControlListener) v0_3);
            }
            if (v0_6 == null) {
                v0_6 = okhttp3.internal.http2.FlowControlListener$None.a;
            }
            String v2_10;
            String v2_7 = new okhttp3.internal.http2.Http2Connection$Builder(this.b);
            int v3_3 = this.n;
            int v4_8 = this.c.a.h.d;
            kotlin.jvm.internal.j.e(v3_3, "socket");
            kotlin.jvm.internal.j.e(v4_8, "peerName");
            v2_7.b = v3_3;
            int v3_5 = new StringBuilder();
            v3_5.append(okhttp3.internal._UtilJvmKt.b);
            v3_5.append(32);
            v3_5.append(v4_8);
            int v3_6 = v3_5.toString();
            kotlin.jvm.internal.j.e(v3_6, "<set-?>");
            v2_7.c = v3_6;
            v2_7.d = this;
            kotlin.jvm.internal.j.e(v0_6, "flowControlListener");
            v2_7.f = v0_6;
            okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_9 = new okhttp3.internal.http2.Http2Connection(v2_7);
            this.p = v0_9;
            okhttp3.internal.http2.Http2Connection.F.getClass();
            String v2_9 = okhttp3.internal.http2.Http2Connection.G;
            if ((v2_9.a & 8) == 0) {
                v2_10 = 2147483647;
            } else {
                v2_10 = v2_9.b[3];
            }
            this.v = v2_10;
            String v2_12 = v0_9.C;
            if (v2_12.d) {
                throw new java.io.IOException("closed");
            } else {
                int v4_11 = okhttp3.internal.http2.Http2Writer.f;
                if (v4_11.isLoggable(java.util.logging.Level.FINE)) {
                    int v5_8 = new StringBuilder(">> CONNECTION ");
                    v5_8.append(okhttp3.internal.http2.Http2.b.e());
                    int v5_9 = new Object[0];
                    v4_11.fine(okhttp3.internal._UtilJvmKt.c(v5_8.toString(), v5_9));
                }
                v2_12.a.j(okhttp3.internal.http2.Http2.b);
                v2_12.a.flush();
                String v2_13 = v0_9.C;
                int v3_18 = v0_9.w;
                v2_13.getClass();
                kotlin.jvm.internal.j.e(v3_18, "settings");
                if (v2_13.d) {
                    throw new java.io.IOException("closed");
                } else {
                    v2_13.i(0, (Integer.bitCount(v3_18.a) * 6), 4, 0);
                    int v4_3 = 0;
                    while (v4_3 < 10) {
                        x8.h v6_2 = 1;
                        if (((1 << v4_3) & v3_18.a) == 0) {
                            v6_2 = 0;
                        } else {
                        }
                        if (v6_2 != null) {
                            v2_13.a.writeShort(v4_3);
                            v2_13.a.writeInt(v3_18.b[v4_3]);
                        }
                        v4_3++;
                    }
                    v2_13.a.flush();
                    String v2_1 = v0_9.w.a();
                    if (v2_1 != 65535) {
                        v0_9.C.A(0, ((long) (v2_1 - 65535)));
                    }
                    okhttp3.internal.concurrent.TaskQueue.b(v0_9.m.d(), v0_9.c, v0_9.D, 6);
                    return;
                }
            }
        }
    }

    public final String toString()
    {
        int v1_4;
        String v0_1 = new StringBuilder("Connection{");
        int v1_5 = this.c;
        v0_1.append(v1_5.a.h.d);
        v0_1.append(58);
        v0_1.append(v1_5.a.h.e);
        v0_1.append(", proxy=");
        v0_1.append(v1_5.b);
        v0_1.append(" hostAddress=");
        v0_1.append(v1_5.c);
        v0_1.append(" cipherSuite=");
        int v1_3 = this.f;
        if (v1_3 == 0) {
            v1_4 = "none";
        } else {
            v1_4 = v1_3.b;
            if (v1_4 == 0) {
            }
        }
        v0_1.append(v1_4);
        v0_1.append(" protocol=");
        v0_1.append(this.m);
        v0_1.append(125);
        return v0_1.toString();
    }
}
