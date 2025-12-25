package okhttp3.internal.connection;
public final class Exchange {
    public final okhttp3.internal.connection.RealCall a;
    public final okhttp3.EventListener b;
    public final okhttp3.internal.connection.ExchangeFinder c;
    public final okhttp3.internal.http.ExchangeCodec d;
    public boolean e;

    public Exchange(okhttp3.internal.connection.RealCall p2, okhttp3.EventListener p3, okhttp3.internal.connection.ExchangeFinder p4, okhttp3.internal.http.ExchangeCodec p5)
    {
        kotlin.jvm.internal.j.e(p3, "eventListener");
        kotlin.jvm.internal.j.e(p4, "finder");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public static java.io.IOException a(okhttp3.internal.connection.Exchange p7, long p8, boolean p10, java.io.IOException p11, int p12)
    {
        okhttp3.internal.connection.Exchange v1_2;
        okhttp3.internal.connection.RealCall v0 = p7.a;
        int v2 = 1;
        int v3 = 0;
        if ((p12 & 4) == 0) {
            v1_2 = 1;
        } else {
            v1_2 = 0;
        }
        int v12_1;
        if ((p12 & 8) == 0) {
            v12_1 = 1;
        } else {
            v12_1 = 0;
        }
        int v4_0 = p7.b;
        if (p11 != null) {
            p7.f(p11);
        }
        if (v12_1 != 0) {
            if (p11 == null) {
                v4_0.s(v0, p8);
            } else {
                v4_0.u(v0, p11);
            }
        }
        if (v1_2 != null) {
            if (p11 == null) {
                v4_0.x(v0, p8);
            } else {
                v4_0.z(v0, p11);
            }
        }
        if ((v12_1 == 0) || (p10)) {
            int v8_1 = 1;
            v2 = 0;
        } else {
            v8_1 = 1;
        }
        if ((v1_2 == null) || (p10)) {
            int v9 = 0;
        } else {
            v9 = 0;
            v3 = v8_1;
        }
        if ((v12_1 == 0) || (!p10)) {
            int v5 = v9;
        } else {
            v5 = v8_1;
        }
        if ((v1_2 == null) || (!p10)) {
            int v4_1 = v9;
        } else {
            v4_1 = v8_1;
        }
        return v0.h(p7, v2, v3, v4_1, v5, p11);
    }

    public final x8.f0 b(okhttp3.Request p8)
    {
        okhttp3.internal.http.ExchangeCodec v0_0 = p8.d;
        kotlin.jvm.internal.j.b(v0_0);
        long v4 = v0_0.a();
        this.b.t(this.a);
        return new okhttp3.internal.connection.Exchange$RequestBodySink(this, this.d.i(p8, v4), v4, 0);
    }

    public final okhttp3.internal.connection.RealConnection c()
    {
        IllegalStateException v0_3;
        IllegalStateException v0_2 = this.d.h();
        if (!(v0_2 instanceof okhttp3.internal.connection.RealConnection)) {
            v0_3 = 0;
        } else {
            v0_3 = ((okhttp3.internal.connection.RealConnection) v0_2);
        }
        if (v0_3 == null) {
            throw new IllegalStateException("no connection for CONNECT tunnels");
        } else {
            return v0_3;
        }
    }

    public final okhttp3.internal.http.RealResponseBody d(okhttp3.Response p9)
    {
        java.io.IOException v0_0 = this.d;
        try {
            okhttp3.internal.connection.RealCall v1_2 = p9.f.b("Content-Type");
        } catch (java.io.IOException v0_2) {
            okhttp3.internal.connection.Exchange v3 = this;
            okhttp3.internal.http.RealResponseBody v9_3 = v0_2;
            v3.b.z(v3.a, v9_3);
            this.f(v9_3);
            throw v9_3;
        }
        if (v1_2 == null) {
            v1_2 = 0;
        }
        long v5 = v0_0.f(p9);
        v3 = this;
        try {
            return new okhttp3.internal.http.RealResponseBody(v1_2, v5, x8.b.c(new okhttp3.internal.connection.Exchange$ResponseBodySource(this, v0_0.g(p9), v5, 0)));
        } catch (java.io.IOException v0_2) {
        }
    }

    public final okhttp3.Response$Builder e(boolean p3)
    {
        try {
            java.io.IOException v3_1 = this.d.j(p3);
        } catch (java.io.IOException v3_2) {
            this.b.z(this.a, v3_2);
            this.f(v3_2);
            throw v3_2;
        }
        if (v3_1 == null) {
            return v3_1;
        } else {
            v3_1.n = this;
            return v3_1;
        }
    }

    public final void f(java.io.IOException p3)
    {
        this.e = 1;
        this.d.h().b(this.a, p3);
        return;
    }

    public final okhttp3.internal.connection.Exchange$upgradeToSocket$1 g()
    {
        okhttp3.internal.connection.Exchange$upgradeToSocket$1 v0_0 = this.a;
        if (v0_0.p) {
            throw new IllegalStateException("Check failed.");
        } else {
            v0_0.p = 1;
            v0_0.e.i();
            try {
                if (v0_0.x == null) {
                    throw new IllegalStateException("Check failed.");
                } else {
                    if ((v0_0.t) || (v0_0.u)) {
                        throw new IllegalStateException("Check failed.");
                    } else {
                        if (v0_0.r) {
                            throw new IllegalStateException("Check failed.");
                        } else {
                            if (!v0_0.s) {
                                throw new IllegalStateException("Check failed.");
                            } else {
                                v0_0.s = 0;
                                v0_0.t = 1;
                                v0_0.u = 1;
                                okhttp3.internal.connection.Exchange$upgradeToSocket$1 v0_3 = this.d.h();
                                kotlin.jvm.internal.j.c(v0_3, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
                                okhttp3.internal.connection.Exchange$upgradeToSocket$1 v0_4 = ((okhttp3.internal.connection.RealConnection) v0_3);
                                v0_4.e.setSoTimeout(0);
                                v0_4.h();
                                return new okhttp3.internal.connection.Exchange$upgradeToSocket$1(this);
                            }
                        }
                    }
                }
            } catch (IllegalStateException v1_9) {
                throw v1_9;
            }
        }
    }
}
