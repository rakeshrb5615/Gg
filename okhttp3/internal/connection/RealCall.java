package okhttp3.internal.connection;
public final class RealCall implements okhttp3.Call, java.lang.Cloneable, okhttp3.internal.concurrent.Lockable {
    public final okhttp3.OkHttpClient a;
    public final okhttp3.Request b;
    public final okhttp3.internal.connection.RealConnectionPool c;
    public final okhttp3.EventListener d;
    public final okhttp3.internal.connection.RealCall$timeout$1 e;
    public final java.util.concurrent.atomic.AtomicBoolean f;
    public Object m;
    public okhttp3.internal.connection.ExchangeFinder n;
    public okhttp3.internal.connection.RealConnection o;
    public boolean p;
    public okhttp3.internal.connection.Exchange q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public volatile boolean w;
    public volatile okhttp3.internal.connection.Exchange x;
    public final java.util.concurrent.CopyOnWriteArrayList y;

    public RealCall(okhttp3.OkHttpClient p4, okhttp3.Request p5)
    {
        this.a = p4;
        this.b = p5;
        this.c = p4.A.a;
        this.d = ((okhttp3.EventListener) p4.d.b);
        java.util.concurrent.atomic.AtomicReference v4_2 = new okhttp3.internal.connection.RealCall$timeout$1(this);
        v4_2.g(((long) 0), java.util.concurrent.TimeUnit.MILLISECONDS);
        this.e = v4_2;
        this.f = new java.util.concurrent.atomic.AtomicBoolean();
        this.v = 1;
        this.y = new java.util.concurrent.CopyOnWriteArrayList();
        new java.util.concurrent.atomic.AtomicReference(p5.e);
        return;
    }

    public static final String a(okhttp3.internal.connection.RealCall p2)
    {
        String v1_1;
        StringBuilder v0_1 = new StringBuilder();
        if (!p2.w) {
            v1_1 = "";
        } else {
            v1_1 = "canceled ";
        }
        v0_1.append(v1_1);
        v0_1.append("call");
        v0_1.append(" to ");
        v0_1.append(p2.b.a.g());
        return v0_1.toString();
    }

    public final void b(okhttp3.internal.connection.RealConnection p3)
    {
        kotlin.jvm.internal.j.e(p3, "connection");
        if (this.o != null) {
            throw new IllegalStateException("Check failed.");
        } else {
            this.o = p3;
            p3.w.add(new okhttp3.internal.connection.RealCall$CallReference(this, this.m));
            return;
        }
    }

    public final okhttp3.Request c()
    {
        return this.b;
    }

    public final void cancel()
    {
        if (!this.w) {
            this.w = 1;
            okhttp3.EventListener v0_4 = this.x;
            if (v0_4 != null) {
                v0_4.d.cancel();
            }
            okhttp3.EventListener v0_1 = this.y.iterator();
            kotlin.jvm.internal.j.d(v0_1, "iterator(...)");
            while (v0_1.hasNext()) {
                ((okhttp3.internal.connection.RoutePlanner$Plan) v0_1.next()).cancel();
            }
            this.d.f(this);
            return;
        } else {
            return;
        }
    }

    public final Object clone()
    {
        return new okhttp3.internal.connection.RealCall(this.a, this.b);
    }

    public final java.io.IOException d(java.io.IOException p4)
    {
        okhttp3.internal.connection.ConnectionListener v0_0 = this.o;
        if (v0_0 != null) {
            try {
                String v1_1 = this.k();
            } catch (okhttp3.EventListener v4_5) {
                throw v4_5;
            }
            if (this.o != null) {
                if (v1_1 != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                if (v1_1 != null) {
                    okhttp3.internal._UtilJvmKt.b(v1_1);
                }
                this.d.k(this, v0_0);
                v0_0.o.getClass();
                if (v1_1 != null) {
                    v0_0.o.getClass();
                }
            }
        }
        if ((!this.p) && (this.e.i())) {
            okhttp3.internal.connection.ConnectionListener v0_7 = new java.io.InterruptedIOException("timeout");
            if (p4 != null) {
                v0_7.initCause(p4);
            }
        } else {
            v0_7 = p4;
        }
        if (p4 == null) {
            this.d.c(this);
            return v0_7;
        } else {
            okhttp3.EventListener v4_4 = this.d;
            kotlin.jvm.internal.j.b(v0_7);
            v4_4.d(this, v0_7);
            return v0_7;
        }
    }

    public final void e(boolean p9)
    {
        try {
            if (!this.v) {
                throw new IllegalStateException("released");
            } else {
                if (p9 != null) {
                    okhttp3.internal.connection.Exchange v2 = this.x;
                    if (v2 != null) {
                        v2.d.cancel();
                        v2.a.h(v2, 1, 1, 1, 1, 0);
                    }
                }
                this.q = 0;
                return;
            }
        } catch (IllegalStateException v0_3) {
            throw v0_3;
        }
    }

    public final okhttp3.Response g()
    {
        int v2_1 = new java.util.ArrayList();
        i7.i.Y(this.a.b, v2_1);
        v2_1.add(new okhttp3.internal.http.RetryAndFollowUpInterceptor(this.a));
        v2_1.add(new okhttp3.internal.http.BridgeInterceptor(this.a.j));
        v2_1.add(new okhttp3.internal.cache.CacheInterceptor());
        v2_1.add(okhttp3.internal.connection.ConnectInterceptor.a);
        i7.i.Y(this.a.c, v2_1);
        v2_1.add(okhttp3.internal.http.CallServerInterceptor.a);
        okhttp3.Request v5 = this.b;
        okhttp3.internal.connection.RealCall v1_2 = this.a;
        int v3_1 = 0;
        try {
            java.io.IOException v0_11 = new okhttp3.internal.http.RealInterceptorChain(this, v2_1, 0, 0, v5, v1_2.v, v1_2.w, v1_2.x).b(v5);
        } catch (java.io.IOException v0_14) {
            v3_1 = 1;
            java.io.IOException v0_15 = this.j(v0_14);
            kotlin.jvm.internal.j.c(v0_15, "null cannot be cast to non-null type kotlin.Throwable");
            throw v0_15;
        } catch (java.io.IOException v0_17) {
            if (v3_1 == 0) {
                this.j(0);
            }
            throw v0_17;
        }
        if (this.w) {
            okhttp3.internal._UtilCommonKt.b(v0_11);
            throw new java.io.IOException("Canceled");
        } else {
            this.j(0);
            return v0_11;
        }
    }

    public final java.io.IOException h(okhttp3.internal.connection.Exchange p4, boolean p5, boolean p6, boolean p7, boolean p8, java.io.IOException p9)
    {
        kotlin.jvm.internal.j.e(p4, "exchange");
        if (p4.equals(this.x)) {
            Throwable v5_1;
            Throwable v0_2 = 0;
            if (p5 == null) {
                if (((!p6) || (!this.s)) && (((!p8) || (!this.t)) && ((p7 == 0) || (!this.u)))) {
                    v5_1 = 0;
                } else {
                    if (p5 != null) {
                        this.r = 0;
                    }
                    if (p6) {
                        this.s = 0;
                    }
                    if (p8) {
                        this.t = 0;
                    }
                    if (p7 != 0) {
                        this.u = 0;
                    }
                    if ((this.r) || ((this.s) || ((this.t) || (this.u)))) {
                        Throwable v5_6 = 0;
                    } else {
                        v5_6 = 1;
                    }
                    if ((v5_6 != null) && (!this.v)) {
                        v0_2 = 1;
                    }
                    int v2 = v0_2;
                    v0_2 = v5_6;
                    v5_1 = v2;
                }
            } else {
                if (this.r) {
                } else {
                }
            }
            if (v0_2 != null) {
                this.x = 0;
                boolean v6_3 = this.o;
                if (v6_3) {
                    try {
                        v6_3.t = (v6_3.t + 1);
                    } catch (Throwable v4_3) {
                        throw v4_3;
                    }
                }
            }
            if (v5_1 != null) {
                return this.d(p9);
            }
        }
        return p9;
    }

    public final void i(n0.a p4)
    {
        if (!this.f.compareAndSet(0, 1)) {
            throw new IllegalStateException("Already Executed");
        } else {
            okhttp3.internal.platform.Platform.a.getClass();
            this.m = okhttp3.internal.platform.Platform.b.h();
            this.d.e(this);
            String v0_6 = this.a.a;
            okhttp3.internal.connection.RealCall$AsyncCall v1_2 = new okhttp3.internal.connection.RealCall$AsyncCall(this, p4);
            v0_6.getClass();
            okhttp3.Dispatcher.c(v0_6, v1_2, 0, 6);
            return;
        }
    }

    public final boolean isCanceled()
    {
        return this.w;
    }

    public final java.io.IOException j(java.io.IOException p3)
    {
        try {
            int v1 = 0;
        } catch (java.io.IOException v3_1) {
            throw v3_1;
        }
        if (this.v) {
            this.v = 0;
            if ((!this.r) && ((!this.s) && ((!this.t) && (!this.u)))) {
                v1 = 1;
            }
        }
        if (v1 != 0) {
            p3 = this.d(p3);
        }
        return p3;
    }

    public final java.net.Socket k()
    {
        Throwable v0_0 = this.o;
        kotlin.jvm.internal.j.b(v0_0);
        okhttp3.internal.concurrent.TaskQueue v1_1 = v0_0.w;
        okhttp3.internal.concurrent.TaskRunner v2_3 = v1_1.size();
        okhttp3.internal.concurrent.TaskRunner v3_0 = 0;
        boolean v4_0 = 0;
        while (v4_0 < v2_3) {
            boolean v6_0 = v1_1.get(v4_0);
            v4_0++;
            if (!kotlin.jvm.internal.j.a(((ref.Reference) v6_0).get(), this)) {
                v3_0++;
            }
            if (v3_0 == -1) {
                throw new IllegalStateException("Check failed.");
            } else {
                v1_1.remove(v3_0);
                this.o = 0;
                if (!v1_1.isEmpty()) {
                    return 0;
                } else {
                    v0_0.x = System.nanoTime();
                    okhttp3.internal.concurrent.TaskQueue v1_3 = this.c;
                    okhttp3.internal.concurrent.TaskRunner v3_2 = v1_3.e;
                    if (v0_0.q) {
                        v0_0.q = 1;
                        v3_2.remove(v0_0);
                        if (v3_2.isEmpty()) {
                            okhttp3.internal.concurrent.TaskQueue v1_4 = v1_3.c;
                            try {
                                if (v1_4.a()) {
                                    v1_4.a.c(v1_4);
                                }
                            } catch (Throwable v0_3) {
                                throw v0_3;
                            }
                        }
                        return v0_0.e;
                    } else {
                        v1_3.c.c(v1_3.d, 0);
                        return 0;
                    }
                }
            }
        }
        v3_0 = -1;
    }
}
