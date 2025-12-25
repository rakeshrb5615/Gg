package okhttp3.internal.connection;
public final class FastFallbackExchangeFinder implements okhttp3.internal.connection.ExchangeFinder {
    public final okhttp3.internal.connection.RealRoutePlanner a;
    public final okhttp3.internal.concurrent.TaskRunner b;
    public final long c;
    public long d;
    public final java.util.concurrent.CopyOnWriteArrayList e;
    public final java.util.concurrent.BlockingQueue f;

    public FastFallbackExchangeFinder(okhttp3.internal.connection.RealRoutePlanner p3, okhttp3.internal.concurrent.TaskRunner p4)
    {
        kotlin.jvm.internal.j.e(p4, "taskRunner");
        this.a = p3;
        this.b = p4;
        this.c = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(250);
        this.d = -9223372036854775808;
        this.e = new java.util.concurrent.CopyOnWriteArrayList();
        this.f = new java.util.concurrent.LinkedBlockingDeque();
        return;
    }

    public final okhttp3.internal.connection.RealConnection a()
    {
        okhttp3.internal.connection.RealConnection v0_0 = this.a;
        String v1_0 = this.e;
        java.io.IOException v3 = 0;
        try {
            while ((!v1_0.isEmpty()) || (v0_0.a(0))) {
                if (v0_0.k.w) {
                    throw new java.io.IOException("Canceled");
                } else {
                    int v7_0;
                    okhttp3.internal.connection.RoutePlanner$ConnectResult v6_2;
                    java.io.IOException v4_3 = System.nanoTime();
                    okhttp3.internal.connection.RoutePlanner$ConnectResult v6_1 = (this.d - v4_3);
                    if (v1_0.isEmpty()) {
                        v6_2 = this.d();
                        v7_0 = this.c;
                        this.d = (v4_3 + v7_0);
                    } else {
                        if (v6_1 > 0) {
                            v7_0 = v6_1;
                            v6_2 = 0;
                        } else {
                        }
                    }
                    if (v6_2 == null) {
                        if (!v1_0.isEmpty()) {
                            java.io.IOException v4_7 = ((okhttp3.internal.connection.RoutePlanner$ConnectResult) this.f.poll(v7_0, java.util.concurrent.TimeUnit.NANOSECONDS));
                            if (v4_7 != null) {
                                v1_0.remove(v4_7.a);
                                v6_2 = v4_7;
                            } else {
                                v6_2 = 0;
                            }
                        }
                        if (v6_2 == null) {
                        }
                    }
                    i7.g v5_5;
                    java.io.IOException v4_9 = v6_2.a;
                    int v7_1 = 0;
                    if ((v6_2.b != null) || (v6_2.c != null)) {
                        v5_5 = 0;
                    } else {
                        v5_5 = 1;
                    }
                    if (v5_5 != null) {
                        this.c();
                        if (!v4_9.e()) {
                            v6_2 = v4_9.c();
                        }
                        if ((v6_2.b == null) && (v6_2.c == null)) {
                            v7_1 = 1;
                        }
                        if (v7_1 != 0) {
                            okhttp3.internal.connection.RealConnection v0_4 = v6_2.a.d();
                            this.c();
                            return v0_4;
                        }
                    }
                    java.io.IOException v4_12 = v6_2.c;
                    if (v4_12 != null) {
                        if (!(v4_12 instanceof java.io.IOException)) {
                            throw v4_12;
                        } else {
                            if (v3 != null) {
                                q4.b.a(v3, v4_12);
                            } else {
                                v3 = ((java.io.IOException) v4_12);
                            }
                        }
                    }
                    java.io.IOException v4_15 = v6_2.b;
                    if (v4_15 != null) {
                        v0_0.p.addFirst(v4_15);
                    }
                }
            }
        } catch (okhttp3.internal.connection.RealConnection v0_5) {
            this.c();
            throw v0_5;
        }
        this.c();
        kotlin.jvm.internal.j.b(v3);
        throw v3;
    }

    public final okhttp3.internal.connection.RoutePlanner b()
    {
        return this.a;
    }

    public final void c()
    {
        java.util.concurrent.CopyOnWriteArrayList v0 = this.e;
        java.util.Iterator v1 = v0.iterator();
        kotlin.jvm.internal.j.d(v1, "iterator(...)");
        while (v1.hasNext()) {
            okhttp3.internal.connection.RoutePlanner$Plan v2_1 = ((okhttp3.internal.connection.RoutePlanner$Plan) v1.next());
            v2_1.cancel();
            okhttp3.internal.connection.RoutePlanner$Plan v2_2 = v2_1.a();
            if (v2_2 != null) {
                this.a.p.addLast(v2_2);
            }
        }
        v0.clear();
        return;
    }

    public final okhttp3.internal.connection.RoutePlanner$ConnectResult d()
    {
        String v0_0 = this.a;
        if (v0_0.a(0)) {
            try {
                okhttp3.internal.connection.FailedPlan v2_0 = v0_0.d();
            } catch (okhttp3.internal.connection.FailedPlan v2_3) {
                v2_0 = new okhttp3.internal.connection.FailedPlan(v2_3);
            }
            if (!v2_0.e()) {
                if (!(v2_0 instanceof okhttp3.internal.connection.FailedPlan)) {
                    this.e.add(v2_0);
                    okhttp3.internal.concurrent.TaskQueue v3_4 = new StringBuilder();
                    v3_4.append(okhttp3.internal._UtilJvmKt.b);
                    v3_4.append(" connect ");
                    v3_4.append(v0_0.i.h.g());
                    this.b.d().c(new okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1(v3_4.toString(), v2_0, this), 0);
                } else {
                    return ((okhttp3.internal.connection.FailedPlan) v2_0).a;
                }
            } else {
                return new okhttp3.internal.connection.RoutePlanner$ConnectResult(v2_0, 0, 0, 6);
            }
        }
        return 0;
    }
}
