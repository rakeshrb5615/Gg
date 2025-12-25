package okhttp3.internal.connection;
public final class ConnectPlan implements okhttp3.internal.connection.RoutePlanner$Plan, okhttp3.internal.http.ExchangeCodec$Carrier {
    public static final synthetic int C;
    public okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1 A;
    public okhttp3.internal.connection.RealConnection B;
    public final okhttp3.internal.concurrent.TaskRunner a;
    public final okhttp3.internal.connection.RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean m;
    public final okhttp3.internal.connection.RealCall n;
    public final okhttp3.internal.connection.RealRoutePlanner o;
    public final okhttp3.Route p;
    public final java.util.List q;
    public final int r;
    public final okhttp3.Request s;
    public final int t;
    public final boolean u;
    public volatile boolean v;
    public java.net.Socket w;
    public java.net.Socket x;
    public okhttp3.Handshake y;
    public okhttp3.Protocol z;

    static ConnectPlan()
    {
        new okhttp3.internal.connection.ConnectPlan$Companion(0);
        return;
    }

    public ConnectPlan(okhttp3.internal.concurrent.TaskRunner p2, okhttp3.internal.connection.RealConnectionPool p3, int p4, int p5, int p6, int p7, boolean p8, okhttp3.internal.connection.RealCall p9, okhttp3.internal.connection.RealRoutePlanner p10, okhttp3.Route p11, java.util.List p12, int p13, okhttp3.Request p14, int p15, boolean p16)
    {
        kotlin.jvm.internal.j.e(p2, "taskRunner");
        kotlin.jvm.internal.j.e(p3, "connectionPool");
        kotlin.jvm.internal.j.e(p11, "route");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        this.m = p8;
        this.n = p9;
        this.o = p10;
        this.p = p11;
        this.q = p12;
        this.r = p13;
        this.s = p14;
        this.t = p15;
        this.u = p16;
        return;
    }

    public static okhttp3.internal.connection.ConnectPlan l(okhttp3.internal.connection.ConnectPlan p18, int p19, okhttp3.Request p20, int p21, boolean p22, int p23)
    {
        int v14;
        if ((p23 & 1) == 0) {
            v14 = p19;
        } else {
            v14 = p18.r;
        }
        okhttp3.Request v15;
        if ((p23 & 2) == 0) {
            v15 = p20;
        } else {
            v15 = p18.s;
        }
        int v16;
        if ((p23 & 4) == 0) {
            v16 = p21;
        } else {
            v16 = p18.t;
        }
        boolean v17;
        if ((p23 & 8) == 0) {
            v17 = p22;
        } else {
            v17 = p18.u;
        }
        return new okhttp3.internal.connection.ConnectPlan(p18.a, p18.b, p18.c, p18.d, p18.e, p18.f, p18.m, p18.n, p18.o, p18.p, p18.q, v14, v15, v16, v17);
    }

    public final okhttp3.internal.connection.RoutePlanner$Plan a()
    {
        return new okhttp3.internal.connection.ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final void b(okhttp3.internal.connection.RealCall p1, java.io.IOException p2)
    {
        return;
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult c()
    {
        boolean v2_0 = this.b;
        okhttp3.internal.connection.RealCall v3 = this.n;
        Throwable v0_8 = v3.d;
        java.util.concurrent.CopyOnWriteArrayList v4 = v3.y;
        java.net.Socket v9 = this.w;
        if (v9 == null) {
            throw new IllegalArgumentException("TCP not connected");
        } else {
            if (this.e()) {
                throw new IllegalStateException("already connected");
            } else {
                int v5_6 = this.p;
                java.net.Proxy v15 = v5_6.b;
                okhttp3.internal.connection.RealConnectionPool v7_1 = v5_6.c;
                int v5_7 = v5_6.a;
                okhttp3.internal.connection.ConnectPlan v6_2 = v5_6.a.j;
                v4.add(this);
                Throwable v16 = 0;
                okhttp3.internal.connection.ConnectPlan v8_0 = 0;
                try {
                    if (this.s == null) {
                        okhttp3.internal.connection.ConnectPlan v17;
                        if (v5_7.c == null) {
                            this.x = v9;
                            okhttp3.internal.connection.ConnectPlan v6_3 = okhttp3.Protocol.m;
                            if (!v5_7.i.contains(v6_3)) {
                                v6_3 = okhttp3.Protocol.d;
                            } else {
                            }
                            this.z = v6_3;
                            v17 = 0;
                        } else {
                            java.net.Socket v10_5 = this.A;
                            if (v10_5 == null) {
                                kotlin.jvm.internal.j.i("socket");
                                throw 0;
                            } else {
                                if (v10_5.b.b.h()) {
                                    java.net.Socket v10_9 = this.A;
                                    if (v10_9 == null) {
                                        kotlin.jvm.internal.j.i("socket");
                                        throw 0;
                                    } else {
                                        if (v10_9.c.b.h()) {
                                            v0_8.F(v3);
                                            int v5_11 = v5_7.h;
                                            int v5_13 = v5_7.c.createSocket(v9, v5_11.d, v5_11.e, 1);
                                            kotlin.jvm.internal.j.c(v5_13, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                            int v5_14 = ((javax.net.ssl.SSLSocket) v5_13);
                                            java.net.Socket v10_15 = this.n(v6_2, v5_14);
                                            int v13_6 = ((okhttp3.ConnectionSpec) v6_2.get(v10_15.t));
                                            okhttp3.internal.connection.ConnectPlan v6_4 = v10_15.m(v6_2, v5_14);
                                            try {
                                                v13_6.a(v5_14, v10_15.u);
                                                this.j(v5_14, v13_6);
                                                v0_8.E(v3, this.y);
                                                v17 = v6_4;
                                            } catch (Throwable v0_0) {
                                                boolean v22 = v2_0;
                                                boolean v2_1 = v7_1;
                                                int v20 = 0;
                                                v8_0 = v6_4;
                                                v3.d.h(v3, v2_1, v15, v0_0);
                                                v22.a.getClass();
                                                if (!this.m) {
                                                    v8_0 = v20;
                                                } else {
                                                    if (!(v0_0 instanceof java.net.ProtocolException)) {
                                                        if (!(v0_0 instanceof java.io.InterruptedIOException)) {
                                                            if ((v0_0 instanceof javax.net.ssl.SSLHandshakeException)) {
                                                                if ((v0_0.getCause() instanceof java.security.cert.CertificateException)) {
                                                                }
                                                            }
                                                            if (!(v0_0 instanceof javax.net.ssl.SSLPeerUnverifiedException)) {
                                                                if (!(v0_0 instanceof javax.net.ssl.SSLException)) {
                                                                } else {
                                                                }
                                                            } else {
                                                            }
                                                        } else {
                                                        }
                                                    } else {
                                                    }
                                                }
                                                boolean v2_15 = new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, v8_0, v0_0);
                                                v4.remove(this);
                                                if (v16 == null) {
                                                    Throwable v0_6 = this.x;
                                                    if (v0_6 != null) {
                                                        okhttp3.internal._UtilJvmKt.b(v0_6);
                                                    }
                                                    okhttp3.internal._UtilJvmKt.b(v9);
                                                }
                                                return v2_15;
                                            }
                                            try {
                                                okhttp3.internal.connection.ConnectPlan v6_0 = this.a;
                                                java.net.Socket v10_0 = v7_1;
                                                try {
                                                    okhttp3.internal.connection.RealConnectionPool v7_0 = this.b;
                                                    try {
                                                        okhttp3.internal.connection.ConnectPlan v8_1 = this.p;
                                                        okhttp3.internal.connection.ConnectionListener v14_0 = v10_0;
                                                        try {
                                                            java.net.Socket v10_1 = this.x;
                                                            kotlin.jvm.internal.j.b(v10_1);
                                                            okhttp3.Handshake v11_0 = this.y;
                                                            okhttp3.Protocol v12_0 = this.z;
                                                            kotlin.jvm.internal.j.b(v12_0);
                                                            v20 = 0;
                                                            try {
                                                                int v13_1 = this.A;
                                                            } catch (Throwable v0_0) {
                                                                v22 = v2_0;
                                                                v2_1 = v14_0;
                                                                v8_0 = v17;
                                                            }
                                                            if (v13_1 == 0) {
                                                                v22 = v2_0;
                                                                v2_1 = v14_0;
                                                                try {
                                                                    kotlin.jvm.internal.j.i("socket");
                                                                    v20 = 0;
                                                                    try {
                                                                        throw 0;
                                                                    } catch (Throwable v0_0) {
                                                                    }
                                                                } catch (Throwable v0_0) {
                                                                    v20 = 0;
                                                                }
                                                            } else {
                                                                boolean v21 = v14_0;
                                                                try {
                                                                    v22 = v2_0;
                                                                    v2_1 = v21;
                                                                    try {
                                                                        int v5_2 = new okhttp3.internal.connection.RealConnection(v6_0, v7_0, v8_1, v9, v10_1, v11_0, v12_0, v13_1, v2_0.a);
                                                                        this.B = v5_2;
                                                                        v5_2.i();
                                                                        v0_8.g(v3, v2_1, v15, this.z);
                                                                        try {
                                                                            Throwable v0_4 = new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, 0, 0, 6);
                                                                            v4.remove(this);
                                                                            return v0_4;
                                                                        } catch (Throwable v0_0) {
                                                                            v8_0 = v17;
                                                                            v16 = 1;
                                                                            v20 = 0;
                                                                        } catch (Throwable v0_5) {
                                                                            v16 = 1;
                                                                            v4.remove(this);
                                                                            if (v16 == null) {
                                                                                boolean v2_13 = this.x;
                                                                                if (v2_13) {
                                                                                    okhttp3.internal._UtilJvmKt.b(v2_13);
                                                                                }
                                                                                okhttp3.internal._UtilJvmKt.b(v9);
                                                                            }
                                                                            throw v0_5;
                                                                        }
                                                                    } catch (Throwable v0_0) {
                                                                        v8_0 = v17;
                                                                    }
                                                                    v0_4 = new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, 0, 0, 6);
                                                                    v4.remove(this);
                                                                    return v0_4;
                                                                } catch (Throwable v0_0) {
                                                                    v22 = v2_1;
                                                                    v2_1 = v21;
                                                                }
                                                            }
                                                        } catch (Throwable v0_0) {
                                                            v22 = v2_0;
                                                            v20 = 0;
                                                        }
                                                    } catch (Throwable v0_0) {
                                                        v22 = v2_0;
                                                        v2_1 = v10_0;
                                                        v20 = 0;
                                                    }
                                                } catch (Throwable v0_0) {
                                                    v22 = v2_0;
                                                    v20 = 0;
                                                    v2_1 = v10_0;
                                                }
                                            } catch (Throwable v0_0) {
                                                v22 = v2_0;
                                                v2_1 = v7_1;
                                                v20 = 0;
                                            }
                                        }
                                    }
                                }
                                throw new java.io.IOException("TLS tunnel buffered too many bytes!");
                            }
                        }
                    } else {
                        java.net.Socket v10_3 = this.k();
                        if ((v10_3.b == null) && (v10_3.c == null)) {
                        } else {
                            v4.remove(this);
                            Throwable v0_7 = this.x;
                            if (v0_7 != null) {
                                okhttp3.internal._UtilJvmKt.b(v0_7);
                            }
                            okhttp3.internal._UtilJvmKt.b(v9);
                            return v10_3;
                        }
                    }
                } catch (Throwable v0_0) {
                    v22 = v2_0;
                    v2_1 = v7_1;
                    v20 = 0;
                } catch (Throwable v0_5) {
                }
            }
        }
    }

    public final void cancel()
    {
        this.v = 1;
        java.net.Socket v0_1 = this.w;
        if (v0_1 != null) {
            okhttp3.internal._UtilJvmKt.b(v0_1);
        }
        return;
    }

    public final okhttp3.internal.connection.RealConnection d()
    {
        okhttp3.internal.connection.RealConnection v0_2 = this.n.a.y;
        Throwable v1_7 = this.p;
        kotlin.jvm.internal.j.e(v1_7, "route");
        v0_2.a.remove(v1_7);
        okhttp3.internal.connection.RealConnection v0_4 = this.B;
        kotlin.jvm.internal.j.b(v0_4);
        okhttp3.EventListener v2_0 = this.p;
        v0_4.o.getClass();
        kotlin.jvm.internal.j.e(v2_0, "route");
        Throwable v1_3 = this.o.f(this, this.q);
        if (v1_3 == null) {
            try {
                Throwable v1_5 = this.b;
                v1_5.getClass();
                v1_5.e.add(v0_4);
                v1_5.c.c(v1_5.d, 0);
                this.n.b(v0_4);
                Throwable v1_9 = this.n;
                v1_9.d.j(v1_9, v0_4);
                v0_4.o.getClass();
                return v0_4;
            } catch (Throwable v1_11) {
                throw v1_11;
            }
        } else {
            return v1_3.a;
        }
    }

    public final boolean e()
    {
        if (this.z == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final okhttp3.Route f()
    {
        return this.p;
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult g()
    {
        okhttp3.internal.connection.RoutePlanner$ConnectResult v0_0 = this.b;
        java.net.Socket v1_0 = this.p;
        okhttp3.internal.connection.RealCall v2 = this.n;
        java.util.concurrent.CopyOnWriteArrayList v3 = v2.y;
        if (this.w != null) {
            throw new IllegalStateException("TCP already connected");
        } else {
            v3.add(this);
            try {
                v2.d.i(v2, v1_0.c, v1_0.b);
                v0_0.a.getClass();
                this.i();
                java.io.IOException v6_3 = new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, 0, 0, 6);
                v3.remove(this);
                return v6_3;
            } catch (java.io.IOException v6_4) {
                if (v1_0.b.type() != java.net.Proxy$Type.DIRECT) {
                    okhttp3.EventListener v7_4 = v1_0.a;
                    v7_4.g.connectFailed(v7_4.h.h(), v1_0.b.address(), v6_4);
                }
                v2.d.h(v2, v1_0.c, v1_0.b, v6_4);
                v0_0.a.getClass();
                okhttp3.internal.connection.RoutePlanner$ConnectResult v0_4 = new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, 0, v6_4, 2);
                v3.remove(this);
                if (1 == 0) {
                    java.net.Socket v1_4 = this.w;
                    if (v1_4 != null) {
                        okhttp3.internal._UtilJvmKt.b(v1_4);
                    }
                }
                return v0_4;
            } catch (okhttp3.internal.connection.RoutePlanner$ConnectResult v0_1) {
                v3.remove(this);
                if (1 == 0) {
                    java.net.Socket v1_1 = this.w;
                    if (v1_1 != null) {
                        okhttp3.internal._UtilJvmKt.b(v1_1);
                    }
                }
                throw v0_1;
            }
        }
    }

    public final void h()
    {
        return;
    }

    public final void i()
    {
        NullPointerException v0_15;
        NullPointerException v0_9 = this.p.b.type();
        if (v0_9 != null) {
            v0_15 = okhttp3.internal.connection.ConnectPlan$WhenMappings.a[v0_9.ordinal()];
        } else {
            v0_15 = -1;
        }
        if ((v0_15 == 1) || (v0_15 == 2)) {
            NullPointerException v0_5 = this.p.a.b.createSocket();
            kotlin.jvm.internal.j.b(v0_5);
        } else {
            v0_5 = new java.net.Socket(this.p.b);
        }
        this.w = v0_5;
        if (this.v) {
            throw new java.io.IOException("canceled");
        } else {
            v0_5.setSoTimeout(this.f);
            try {
                okhttp3.internal.platform.Platform.a.getClass();
                okhttp3.internal.platform.Platform.b.f(v0_5, this.p.c, this.e);
                try {
                    this.A = new okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1(new j6.s(v0_5));
                    return;
                } catch (NullPointerException v0_13) {
                    if (kotlin.jvm.internal.j.a(v0_13.getMessage(), "throw with null exception")) {
                        throw new java.io.IOException(v0_13);
                    } else {
                        return;
                    }
                }
            } catch (NullPointerException v0_10) {
                String v2_3 = new StringBuilder("Failed to connect to ");
                v2_3.append(this.p.c);
                java.io.IOException v1_11 = new java.net.ConnectException(v2_3.toString());
                v1_11.initCause(v0_10);
                throw v1_11;
            }
            this.A = new okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1(new j6.s(v0_5));
            return;
        }
    }

    public final void j(javax.net.ssl.SSLSocket p14, okhttp3.ConnectionSpec p15)
    {
        String v2_4 = this.p.a;
        if (p15.b) {
            okhttp3.internal.platform.Platform.a.getClass();
            okhttp3.internal.platform.Platform.b.e(p14, v2_4.h.d, v2_4.i);
        }
        p14.startHandshake();
        javax.net.ssl.SSLPeerUnverifiedException v3_2 = p14.getSession();
        kotlin.jvm.internal.j.b(v3_2);
        okhttp3.Handshake.e.getClass();
        StringBuilder v4_4 = okhttp3.Handshake$Companion.a(v3_2);
        int v5_3 = v2_4.d;
        kotlin.jvm.internal.j.b(v5_3);
        if (v5_3.verify(v2_4.h.d, v3_2)) {
            okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1 v0_16 = v2_4.e;
            kotlin.jvm.internal.j.b(v0_16);
            this.y = new okhttp3.Handshake(v4_4.a, v4_4.b, v4_4.c, new okhttp3.internal.connection.a(v0_16, v4_4, v2_4));
            kotlin.jvm.internal.j.e(v2_4.h.d, "hostname");
            okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1 v0_18 = v0_16.a.iterator();
            String v2_6 = 0;
            if (v0_18.hasNext()) {
                ((okhttp3.CertificatePinner$Pin) v0_18.next()).getClass();
                b8.p.p0(0, "**.");
                throw 0;
            } else {
                if (p15.b) {
                    okhttp3.internal.platform.Platform.a.getClass();
                    v2_6 = okhttp3.internal.platform.Platform.b.g(p14);
                }
                okhttp3.Protocol v15_17;
                this.x = p14;
                this.A = new okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1(new j6.s(p14));
                if (v2_6 == null) {
                    v15_17 = okhttp3.Protocol.d;
                } else {
                    okhttp3.Protocol.b.getClass();
                    v15_17 = okhttp3.Protocol$Companion.a(v2_6);
                }
                this.z = v15_17;
                okhttp3.internal.platform.Platform.a.getClass();
                okhttp3.internal.platform.Platform.b.getClass();
                return;
            }
        } else {
            okhttp3.Protocol v15_19 = v4_4.a();
            if (v15_19.isEmpty()) {
                StringBuilder v1_14 = new StringBuilder("Hostname ");
                v1_14.append(v2_4.h.d);
                v1_14.append(" not verified (no certificates)");
                throw new javax.net.ssl.SSLPeerUnverifiedException(v1_14.toString());
            } else {
                okhttp3.Protocol v15_1 = v15_19.get(0);
                kotlin.jvm.internal.j.c(v15_1, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                okhttp3.Protocol v15_2 = ((java.security.cert.X509Certificate) v15_1);
                StringBuilder v4_2 = new StringBuilder("\n            |Hostname ");
                v4_2.append(v2_4.h.d);
                v4_2.append(" not verified:\n            |    certificate: ");
                okhttp3.CertificatePinner.c.getClass();
                StringBuilder v1_6 = new StringBuilder("sha256/");
                String v2_2 = v15_2.getPublicKey().getEncoded();
                kotlin.jvm.internal.j.d(v2_2, "getEncoded(...)");
                int v5_2 = v2_2.length;
                x8.b.e(((long) v2_2.length), ((long) 0), ((long) v5_2));
                v1_6.append(new x8.j(i7.h.b0(v2_2, 0, v5_2)).c("SHA-256").a());
                v4_2.append(v1_6.toString());
                v4_2.append("\n            |    DN: ");
                v4_2.append(v15_2.getSubjectDN().getName());
                v4_2.append("\n            |    subjectAltNames: ");
                okhttp3.internal.tls.OkHostnameVerifier.a.getClass();
                v4_2.append(i7.i.e0(okhttp3.internal.tls.OkHostnameVerifier.a(v15_2, 7), okhttp3.internal.tls.OkHostnameVerifier.a(v15_2, 2)));
                v4_2.append("\n            ");
                throw new javax.net.ssl.SSLPeerUnverifiedException(b8.j.k0(v4_2.toString()));
            }
        }
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult k()
    {
        java.net.ProtocolException v0_0 = this.s;
        kotlin.jvm.internal.j.b(v0_0);
        okhttp3.internal.connection.RoutePlanner$ConnectResult v1_11 = this.p;
        okhttp3.Request v3_1 = v1_11.b;
        okhttp3.Request v4_1 = v1_11.c;
        int v2_8 = v1_11.a.h;
        okhttp3.internal.connection.ConnectPlan v5_10 = new StringBuilder("CONNECT ");
        v5_10.append(okhttp3.internal._UtilJvmKt.h(v2_8, 1));
        v5_10.append(" HTTP/1.1");
        int v2_6 = v5_10.toString();
        while(true) {
            int v7_1 = this.A;
            if (v7_1 == 0) {
                kotlin.jvm.internal.j.i("socket");
                throw 0;
            } else {
                okhttp3.internal.connection.ConnectPlan v5_3 = new okhttp3.internal.http1.Http1ExchangeCodec(0, this, v7_1);
                int v7_2 = this.A;
                if (v7_2 == 0) {
                    kotlin.jvm.internal.j.i("socket");
                    throw 0;
                } else {
                    java.util.concurrent.TimeUnit v12 = java.util.concurrent.TimeUnit.MILLISECONDS;
                    v7_2.b.a.b().g(((long) this.c), v12);
                    int v7_6 = this.A;
                    if (v7_6 == 0) {
                        kotlin.jvm.internal.j.i("socket");
                        throw 0;
                    } else {
                        okhttp3.internal.connection.ConnectPlan v5_5;
                        v7_6.c.a.b().g(((long) this.d), v12);
                        v5_3.m(v0_0.c, v2_6);
                        v5_3.a();
                        int v7_12 = v5_3.j(0);
                        kotlin.jvm.internal.j.b(v7_12);
                        v7_12.a = v0_0;
                        java.net.ProtocolException v0_7 = v7_12.a();
                        int v7_13 = v0_7.d;
                        v5_3.l(v0_7);
                        if (v7_13 == 200) {
                            break;
                        }
                        if (v7_13 != 407) {
                            throw new java.io.IOException(g2.g.c(v7_13, "Unexpected response code for CONNECT: "));
                        } else {
                            v5_5 = v1_11.a.f.a(v1_11, v0_7);
                            if (v5_5 == null) {
                                throw new java.io.IOException("Failed to authenticate with proxy");
                            } else {
                                java.net.ProtocolException v0_13 = v0_7.f.b("Connection");
                                if (v0_13 == null) {
                                    v0_13 = 0;
                                }
                                if (!"close".equalsIgnoreCase(v0_13)) {
                                    v0_0 = v5_5;
                                }
                            }
                        }
                        if (v5_5 != null) {
                            java.net.ProtocolException v0_15 = this.w;
                            if (v0_15 != null) {
                                okhttp3.internal._UtilJvmKt.b(v0_15);
                            }
                            java.net.ProtocolException v0_1 = (this.r + 1);
                            int v2_0 = this.n;
                            if (v0_1 >= 21) {
                                java.net.ProtocolException v0_3 = new java.net.ProtocolException("Too many tunnel connections attempted: 21");
                                v2_0.d.h(v2_0, v4_1, v3_1, v0_3);
                                this.b.a.getClass();
                                return new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, 0, v0_3, 2);
                            } else {
                                v2_0.d.g(v2_0, v4_1, v3_1, 0);
                                return new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, okhttp3.internal.connection.ConnectPlan.l(this, v0_1, v5_5, 0, 0, 12), 0, 4);
                            }
                        } else {
                            return new okhttp3.internal.connection.RoutePlanner$ConnectResult(this, 0, 0, 6);
                        }
                    }
                }
            }
        }
        v5_5 = 0;
    }

    public final okhttp3.internal.connection.ConnectPlan m(java.util.List p10, javax.net.ssl.SSLSocket p11)
    {
        kotlin.jvm.internal.j.e(p10, "connectionSpecs");
        int v0_1 = this.t;
        boolean v1_3 = (v0_1 + 1);
        int v2 = p10.size();
        int v6 = v1_3;
        while (v6 < v2) {
            boolean v1_1 = ((okhttp3.ConnectionSpec) p10.get(v6));
            v1_1.getClass();
            if (v1_1.a) {
                okhttp3.internal.connection.ConnectPlan v3_1 = v1_1.d;
                if ((v3_1 == null) || (okhttp3.internal._UtilCommonKt.e(v3_1, p11.getEnabledProtocols(), k7.a.b))) {
                    boolean v1_2 = v1_1.c;
                    if (v1_2) {
                        okhttp3.internal.connection.ConnectPlan v3_3 = p11.getEnabledCipherSuites();
                        okhttp3.CipherSuite.b.getClass();
                        if (!okhttp3.internal._UtilCommonKt.e(v1_2, v3_3, okhttp3.CipherSuite.c)) {
                            v6++;
                        }
                    }
                    okhttp3.internal.connection.ConnectPlan v10_2;
                    if (v0_1 == -1) {
                        v10_2 = 0;
                    } else {
                        v10_2 = 1;
                    }
                    return okhttp3.internal.connection.ConnectPlan.l(this, 0, 0, v6, v10_2, 3);
                }
            }
        }
        return 0;
    }

    public final okhttp3.internal.connection.ConnectPlan n(java.util.List p4, javax.net.ssl.SSLSocket p5)
    {
        kotlin.jvm.internal.j.e(p4, "connectionSpecs");
        if (this.t == -1) {
            java.net.UnknownServiceException v0_3 = this.m(p4, p5);
            if (v0_3 == null) {
                StringBuilder v1_0 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
                v1_0.append(this.u);
                v1_0.append(", modes=");
                v1_0.append(p4);
                v1_0.append(", supported protocols=");
                String v4_2 = p5.getEnabledProtocols();
                kotlin.jvm.internal.j.b(v4_2);
                String v4_3 = java.util.Arrays.toString(v4_2);
                kotlin.jvm.internal.j.d(v4_3, "toString(...)");
                v1_0.append(v4_3);
                throw new java.net.UnknownServiceException(v1_0.toString());
            } else {
                return v0_3;
            }
        } else {
            return this;
        }
    }
}
