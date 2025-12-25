package okhttp3.internal.connection;
public final class RealRoutePlanner implements okhttp3.internal.connection.RoutePlanner {
    public final okhttp3.internal.concurrent.TaskRunner a;
    public final okhttp3.internal.connection.RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final okhttp3.Address i;
    public final okhttp3.internal.connection.RouteDatabase j;
    public final okhttp3.internal.connection.RealCall k;
    public final boolean l;
    public okhttp3.internal.connection.RouteSelector$Selection m;
    public okhttp3.internal.connection.RouteSelector n;
    public okhttp3.Route o;
    public final i7.g p;

    public RealRoutePlanner(okhttp3.internal.concurrent.TaskRunner p2, okhttp3.internal.connection.RealConnectionPool p3, int p4, int p5, int p6, int p7, boolean p8, boolean p9, okhttp3.Address p10, okhttp3.internal.connection.RouteDatabase p11, okhttp3.internal.connection.RealCall p12, okhttp3.Request p13)
    {
        kotlin.jvm.internal.j.e(p2, "taskRunner");
        kotlin.jvm.internal.j.e(p3, "connectionPool");
        kotlin.jvm.internal.j.e(p11, "routeDatabase");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        this.g = p8;
        this.h = p9;
        this.i = p10;
        this.j = p11;
        this.k = p12;
        this.l = (kotlin.jvm.internal.j.a(p13.b, "GET") ^ 1);
        this.p = new i7.g();
        return;
    }

    public final boolean a(okhttp3.internal.connection.RealConnection p5)
    {
        if ((this.p.isEmpty()) && (this.o == null)) {
            if (p5) {
                try {
                    okhttp3.Route v2 = 0;
                } catch (boolean v0_7) {
                    throw v0_7;
                }
                if (p5.s == 0) {
                    if (p5.q) {
                        if (okhttp3.internal._UtilJvmKt.a(p5.c.a.h, this.i.h)) {
                            v2 = p5.c;
                        } else {
                        }
                    } else {
                    }
                } else {
                }
                if (v2 != null) {
                    this.o = v2;
                    return 1;
                }
            }
            boolean v5_1 = this.m;
            if ((!v5_1) || (v5_1.b >= v5_1.a.size())) {
                boolean v5_4 = this.n;
                if (v5_4) {
                    return v5_4.a();
                }
            } else {
                return 1;
            }
        }
        return 1;
    }

    public final okhttp3.Address b()
    {
        return this.i;
    }

    public final boolean c(okhttp3.HttpUrl p4)
    {
        kotlin.jvm.internal.j.e(p4, "url");
        String v0_2 = this.i.h;
        if ((p4.e != v0_2.e) || (!kotlin.jvm.internal.j.a(p4.d, v0_2.d))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final okhttp3.internal.connection.RoutePlanner$Plan d()
    {
        Object v3_33;
        Throwable v0_1 = this.k.o;
        if (v0_1 != null) {
            java.util.Iterator v4_4;
            Object v3_8;
            if (v0_1.g(this.l)) {
                if (!v0_1.q) {
                    if (this.c(v0_1.c.a.h)) {
                        v3_8 = 0;
                        v4_4 = 0;
                        if (this.k.o == null) {
                            if (v4_4 != null) {
                                okhttp3.internal._UtilJvmKt.b(v4_4);
                            }
                            java.net.Proxy v5_6 = this.k;
                            v5_6.d.k(v5_6, v0_1);
                            v0_1.o.getClass();
                            if (v4_4 == null) {
                                if (v3_8 == null) {
                                    v3_33 = 0;
                                } else {
                                    v0_1.o.getClass();
                                }
                            } else {
                                v0_1.o.getClass();
                            }
                        } else {
                            if (v4_4 != null) {
                                throw new IllegalStateException("Check failed.");
                            } else {
                                v3_33 = new okhttp3.internal.connection.ReusePlan(v0_1);
                            }
                        }
                        if (v3_33 == null) {
                            Throwable v0_34 = this.f(0, 0);
                            if (v0_34 == null) {
                                if (this.p.isEmpty()) {
                                    Throwable v0_21;
                                    Throwable v0_37 = this.o;
                                    if (v0_37 == null) {
                                        Throwable v0_38 = this.m;
                                        if ((v0_38 == null) || (v0_38.b >= v0_38.a.size())) {
                                            Throwable v0_39 = this.n;
                                            if (v0_39 == null) {
                                                v0_39 = new okhttp3.internal.connection.RouteSelector(this.i, this.j, this.k, this.h);
                                                this.n = v0_39;
                                            }
                                            if (!v0_39.a()) {
                                                throw new java.io.IOException("exhausted all routes");
                                            } else {
                                                if (!v0_39.a()) {
                                                    throw new java.util.NoSuchElementException();
                                                } else {
                                                    String v1_23 = new java.util.ArrayList();
                                                    while (v0_39.f < v0_39.e.size()) {
                                                        Object v3_0 = v0_39.a;
                                                        if (v0_39.f >= v0_39.e.size()) {
                                                            String v2_1 = new StringBuilder("No route to ");
                                                            v2_1.append(v3_0.h.d);
                                                            v2_1.append("; exhausted proxy configurations: ");
                                                            v2_1.append(v0_39.e);
                                                            throw new java.net.SocketException(v2_1.toString());
                                                        } else {
                                                            j7.c v9_5;
                                                            int v8_4;
                                                            java.net.Proxy v5_1 = v0_39.e;
                                                            java.util.Iterator v6_2 = v0_39.f;
                                                            v0_39.f = (v6_2 + 1);
                                                            java.net.Proxy v5_3 = ((java.net.Proxy) v5_1.get(v6_2));
                                                            java.util.Iterator v6_3 = v0_39.c;
                                                            boolean v7_2 = new java.util.ArrayList();
                                                            v0_39.g = v7_2;
                                                            if ((v5_3.type() != java.net.Proxy$Type.DIRECT) && (v5_3.type() != java.net.Proxy$Type.SOCKS)) {
                                                                int v8_2 = v5_3.address();
                                                                if (!(v8_2 instanceof java.net.InetSocketAddress)) {
                                                                    Throwable v0_5 = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                                                                    v0_5.append(v8_2.getClass());
                                                                    throw new IllegalArgumentException(v0_5.toString().toString());
                                                                } else {
                                                                    int v8_3 = ((java.net.InetSocketAddress) v8_2);
                                                                    okhttp3.internal.connection.RouteSelector.i.getClass();
                                                                    j7.c v9_4 = v8_3.getAddress();
                                                                    if (v9_4 != null) {
                                                                        v9_5 = v9_4.getHostAddress();
                                                                        kotlin.jvm.internal.j.d(v9_5, "getHostAddress(...)");
                                                                    } else {
                                                                        v9_5 = v8_3.getHostName();
                                                                        kotlin.jvm.internal.j.d(v9_5, "getHostName(...)");
                                                                    }
                                                                    v8_4 = v8_3.getPort();
                                                                }
                                                            } else {
                                                                int v8_5 = v3_0.h;
                                                                v9_5 = v8_5.d;
                                                                v8_4 = v8_5.e;
                                                            }
                                                            if ((1 > v8_4) || (v8_4 >= 65536)) {
                                                                String v1_7 = new StringBuilder("No route to ");
                                                                v1_7.append(v9_5);
                                                                v1_7.append(58);
                                                                v1_7.append(v8_4);
                                                                v1_7.append("; port is out of range");
                                                                throw new java.net.SocketException(v1_7.toString());
                                                            } else {
                                                                if (v5_3.type() != java.net.Proxy$Type.SOCKS) {
                                                                    Object v3_12;
                                                                    kotlin.jvm.internal.j.e(v9_5, "<this>");
                                                                    java.util.Iterator v4_7 = okhttp3.internal._HostnamesCommonKt.a;
                                                                    v4_7.getClass();
                                                                    if (!v4_7.a.matcher(v9_5).matches()) {
                                                                        v6_3.d.o(v6_3, v9_5);
                                                                        java.util.Iterator v4_13 = v3_0.a.a(v9_5);
                                                                        if (v4_13.isEmpty()) {
                                                                            String v1_11 = new StringBuilder();
                                                                            v1_11.append(v3_0.a);
                                                                            v1_11.append(" returned no addresses for ");
                                                                            v1_11.append(v9_5);
                                                                            throw new java.net.UnknownHostException(v1_11.toString());
                                                                        } else {
                                                                            v6_3.d.n(v6_3, v9_5, v4_13);
                                                                            v3_12 = v4_13;
                                                                        }
                                                                    } else {
                                                                        v3_12 = a.a.G(java.net.InetAddress.getByName(v9_5));
                                                                    }
                                                                    if ((v0_39.d) && (v3_12.size() >= 2)) {
                                                                        java.util.Iterator v4_17 = new java.util.ArrayList();
                                                                        java.util.Iterator v6_6 = new java.util.ArrayList();
                                                                        j7.c v9_6 = v3_12.iterator();
                                                                        while (v9_6.hasNext()) {
                                                                            Object v10_6 = v9_6.next();
                                                                            if (!(((java.net.InetAddress) v10_6) instanceof java.net.Inet6Address)) {
                                                                                v6_6.add(v10_6);
                                                                            } else {
                                                                                v4_17.add(v10_6);
                                                                            }
                                                                        }
                                                                        if ((!v4_17.isEmpty()) && (!v6_6.isEmpty())) {
                                                                            java.util.Iterator v4_18 = v4_17.iterator();
                                                                            java.util.Iterator v6_7 = v6_6.iterator();
                                                                            j7.c v9_10 = new j7.c(10);
                                                                            while ((v4_18.hasNext()) || (v6_7.hasNext())) {
                                                                                if (v4_18.hasNext()) {
                                                                                    v9_10.add(v4_18.next());
                                                                                }
                                                                                if (v6_7.hasNext()) {
                                                                                    v9_10.add(v6_7.next());
                                                                                }
                                                                            }
                                                                            v9_10.g();
                                                                            v9_10.c = 1;
                                                                            if (v9_10.b <= 0) {
                                                                                v3_12 = j7.c.d;
                                                                            } else {
                                                                                v3_12 = v9_10;
                                                                            }
                                                                        }
                                                                    }
                                                                    Object v3_23 = v3_12.iterator();
                                                                    while (v3_23.hasNext()) {
                                                                        v7_2.add(new java.net.InetSocketAddress(((java.net.InetAddress) v3_23.next()), v8_4));
                                                                    }
                                                                } else {
                                                                    v7_2.add(java.net.InetSocketAddress.createUnresolved(v9_5, v8_4));
                                                                }
                                                                Object v3_26 = v0_39.g.iterator();
                                                                while (v3_26.hasNext()) {
                                                                    java.util.Iterator v6_11 = new okhttp3.Route(v0_39.a, v5_3, ((java.net.InetSocketAddress) v3_26.next()));
                                                                    if (!v0_39.b.a.contains(v6_11)) {
                                                                        v1_23.add(v6_11);
                                                                    } else {
                                                                        v0_39.h.add(v6_11);
                                                                    }
                                                                }
                                                                if (!v1_23.isEmpty()) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (v1_23.isEmpty()) {
                                                        i7.i.Y(v0_39.h, v1_23);
                                                        v0_39.h.clear();
                                                    }
                                                    Throwable v0_14 = new okhttp3.internal.connection.RouteSelector$Selection(v1_23);
                                                    this.m = v0_14;
                                                    if (this.k.w) {
                                                        throw new java.io.IOException("Canceled");
                                                    } else {
                                                        if (v0_14.b >= v1_23.size()) {
                                                            throw new java.util.NoSuchElementException();
                                                        } else {
                                                            String v2_12 = v0_14.b;
                                                            v0_14.b = (v2_12 + 1);
                                                            v0_21 = this.e(((okhttp3.Route) v1_23.get(v2_12)), v1_23);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            Object v3_30 = v0_38.a;
                                            if (v0_38.b >= v3_30.size()) {
                                                throw new java.util.NoSuchElementException();
                                            } else {
                                                String v2_14 = v0_38.b;
                                                v0_38.b = (v2_14 + 1);
                                                v0_21 = this.e(((okhttp3.Route) v3_30.get(v2_14)), 0);
                                            }
                                        }
                                    } else {
                                        this.o = 0;
                                        v0_21 = this.e(v0_37, 0);
                                    }
                                    String v1_16 = this.f(v0_21, v0_21.q);
                                    if (v1_16 == null) {
                                        return v0_21;
                                    } else {
                                        return v1_16;
                                    }
                                } else {
                                    return ((okhttp3.internal.connection.RoutePlanner$Plan) this.p.removeFirst());
                                }
                            } else {
                                return v0_34;
                            }
                        } else {
                            return v3_33;
                        }
                    } else {
                    }
                }
                v4_4 = this.k.k();
                v3_8 = 0;
            } else {
                v3_8 = (v0_1.q ^ 1);
                v0_1.q = 1;
                v4_4 = this.k.k();
            }
        }
    }

    public final okhttp3.internal.connection.ConnectPlan e(okhttp3.Route p17, java.util.ArrayList p18)
    {
        kotlin.jvm.internal.j.e(p17, "route");
        okhttp3.internal.connection.ConnectPlan v0_16 = p17.a;
        if (v0_16.c != null) {
            if (v0_16.i.contains(okhttp3.Protocol.m)) {
                throw new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
            }
        } else {
            if (!v0_16.j.contains(okhttp3.ConnectionSpec.h)) {
                throw new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client");
            } else {
                okhttp3.internal.connection.ConnectPlan v0_14 = p17.a.h.d;
                okhttp3.internal.platform.Platform.a.getClass();
                if (!okhttp3.internal.platform.Platform.b.i(v0_14)) {
                    throw new java.net.UnknownServiceException(v1.a.l("CLEARTEXT communication to ", v0_14, " not permitted by network security policy"));
                }
            }
        }
        okhttp3.internal.connection.ConnectPlan v2_0 = 0;
        if (p17.b.type() == java.net.Proxy$Type.HTTP) {
            okhttp3.internal.connection.ConnectPlan v0_19 = p17.a;
            if ((v0_19.c != null) || (v0_19.i.contains(okhttp3.Protocol.m))) {
                okhttp3.internal.connection.ConnectPlan v0_23 = new okhttp3.Request$Builder();
                okhttp3.internal.concurrent.TaskRunner v1_15 = p17.a.h;
                kotlin.jvm.internal.j.e(v1_15, "url");
                v0_23.a = v1_15;
                v0_23.b("CONNECT", 0);
                okhttp3.internal.concurrent.TaskRunner v1_17 = p17.a;
                v0_23.a("Host", okhttp3.internal._UtilJvmKt.h(v1_17.h, 1));
                v0_23.a("Proxy-Connection", "Keep-Alive");
                v0_23.a("User-Agent", "okhttp/5.3.2");
                v2_0 = new okhttp3.Request(v0_23);
                okhttp3.internal.connection.ConnectPlan v0_26 = new okhttp3.Response$Builder();
                v0_26.a = v2_0;
                v0_26.b = okhttp3.Protocol.d;
                v0_26.c = 407;
                v0_26.d = "Preemptive Authenticate";
                v0_26.l = -1;
                v0_26.m = -1;
                int v3_11 = v0_26.f;
                v3_11.getClass();
                okhttp3.internal._HeadersCommonKt.b("Proxy-Authenticate");
                okhttp3.internal._HeadersCommonKt.c("OkHttp-Preemptive", "Proxy-Authenticate");
                v3_11.d("Proxy-Authenticate");
                okhttp3.internal._HeadersCommonKt.a(v3_11, "Proxy-Authenticate", "OkHttp-Preemptive");
                okhttp3.internal.connection.ConnectPlan v0_2 = v1_17.f.a(p17, v0_26.a());
                if (v0_2 != null) {
                    v2_0 = v0_2;
                }
            }
        }
        return new okhttp3.internal.connection.ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, p17, p18, 0, v2_0, -1, 0);
    }

    public final okhttp3.internal.connection.ReusePlan f(okhttp3.internal.connection.ConnectPlan p12, java.util.List p13)
    {
        int v6_0;
        okhttp3.internal.connection.RealConnectionPool v0 = this.b;
        boolean v1 = this.l;
        okhttp3.Address v2 = this.i;
        okhttp3.internal.connection.RealCall v3 = this.k;
        if ((p12 == null) || (!p12.e())) {
            v6_0 = 0;
        } else {
            v6_0 = 1;
        }
        v0.getClass();
        java.util.Iterator v7_1 = v0.e.iterator();
        kotlin.jvm.internal.j.d(v7_1, "iterator(...)");
        while (v7_1.hasNext()) {
            java.net.Socket v10_3;
            okhttp3.internal.connection.ConnectionListener v8_2 = ((okhttp3.internal.connection.RealConnection) v7_1.next());
            kotlin.jvm.internal.j.b(v8_2);
            if (v6_0 == 0) {
                if (v8_2.e(v2, p13)) {
                    v3.b(v8_2);
                    v10_3 = 1;
                } else {
                    v10_3 = 0;
                }
            } else {
                java.net.Socket v10_1;
                if (v8_2.p == null) {
                    v10_1 = 0;
                } else {
                    v10_1 = 1;
                }
                if (v10_1 != null) {
                }
            }
            if (v10_3 != null) {
                if (!v8_2.g(v1)) {
                    try {
                        boolean v9_1 = v8_2.q;
                        v8_2.q = 1;
                        java.net.Socket v10_5 = v3.k();
                    } catch (Throwable v12_2) {
                        throw v12_2;
                    }
                    if (v10_5 == null) {
                        if (!v9_1) {
                            v0.a.getClass();
                        }
                    } else {
                        okhttp3.internal._UtilJvmKt.b(v10_5);
                        v0.a.getClass();
                    }
                }
            }
            if (v8_2 != null) {
                if (p12 != null) {
                    this.o = p12.p;
                    Throwable v12_3 = p12.x;
                    if (v12_3 != null) {
                        okhttp3.internal._UtilJvmKt.b(v12_3);
                    }
                }
                Throwable v12_4 = this.k;
                v12_4.d.j(v12_4, v8_2);
                v8_2.o.getClass();
                return new okhttp3.internal.connection.ReusePlan(v8_2);
            } else {
                return 0;
            }
        }
        v8_2 = 0;
    }
}
