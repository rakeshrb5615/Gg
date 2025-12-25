package okhttp3.internal.http2;
public final class Http2Connection implements java.io.Closeable, okhttp3.internal.concurrent.Lockable {
    public static final okhttp3.internal.http2.Http2Connection$Companion F;
    public static final okhttp3.internal.http2.Settings G;
    public long A;
    public final okhttp3.internal.connection.BufferedSocket B;
    public final okhttp3.internal.http2.Http2Writer C;
    public final okhttp3.internal.http2.Http2Connection$ReaderRunnable D;
    public final java.util.LinkedHashSet E;
    public final okhttp3.internal.http2.Http2Connection$Listener a;
    public final java.util.LinkedHashMap b;
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final okhttp3.internal.concurrent.TaskRunner m;
    public final okhttp3.internal.concurrent.TaskQueue n;
    public final okhttp3.internal.concurrent.TaskQueue o;
    public final okhttp3.internal.concurrent.TaskQueue p;
    public final okhttp3.internal.http2.PushObserver q;
    public long r;
    public long s;
    public long t;
    public long u;
    public final okhttp3.internal.http2.FlowControlListener v;
    public final okhttp3.internal.http2.Settings w;
    public okhttp3.internal.http2.Settings x;
    public final okhttp3.internal.http2.flowcontrol.WindowCounter y;
    public long z;

    static Http2Connection()
    {
        okhttp3.internal.http2.Http2Connection.F = new okhttp3.internal.http2.Http2Connection$Companion(0);
        okhttp3.internal.http2.Settings v0_3 = new okhttp3.internal.http2.Settings();
        v0_3.c(4, 65535);
        v0_3.c(5, 16384);
        okhttp3.internal.http2.Http2Connection.G = v0_3;
        return;
    }

    public Http2Connection(okhttp3.internal.http2.Http2Connection$Builder p5)
    {
        this.a = p5.d;
        this.b = new java.util.LinkedHashMap();
        okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_15 = p5.c;
        if (v0_15 == null) {
            kotlin.jvm.internal.j.i("connectionName");
            throw 0;
        } else {
            this.c = v0_15;
            this.e = 3;
            okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_2 = p5.a;
            this.m = v0_2;
            this.n = v0_2.d();
            this.o = v0_2.d();
            this.p = v0_2.d();
            this.q = p5.e;
            this.v = p5.f;
            okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_8 = new okhttp3.internal.http2.Settings();
            v0_8.c(4, 16777216);
            this.w = v0_8;
            okhttp3.internal.http2.Http2Connection$ReaderRunnable v0_9 = okhttp3.internal.http2.Http2Connection.G;
            this.x = v0_9;
            this.y = new okhttp3.internal.http2.flowcontrol.WindowCounter(0);
            this.A = ((long) v0_9.a());
            String v5_1 = p5.b;
            if (v5_1 == null) {
                kotlin.jvm.internal.j.i("socket");
                throw 0;
            } else {
                this.B = v5_1;
                this.C = new okhttp3.internal.http2.Http2Writer(v5_1.b());
                this.D = new okhttp3.internal.http2.Http2Connection$ReaderRunnable(this, new okhttp3.internal.http2.Http2Reader(v5_1.a()));
                this.E = new java.util.LinkedHashSet();
                return;
            }
        }
    }

    public final void A(int p3, long p4)
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.c);
        v0_1.append(91);
        v0_1.append(p3);
        v0_1.append("] windowUpdate");
        okhttp3.internal.concurrent.TaskQueue.b(this.n, v0_1.toString(), new okhttp3.internal.http2.c(this, p3, p4), 6);
        return;
    }

    public final void c(okhttp3.internal.http2.ErrorCode p4, okhttp3.internal.http2.ErrorCode p5, java.io.IOException p6)
    {
        this.s(p4);
        try {
            int v0 = 0;
        } catch (okhttp3.internal.concurrent.TaskQueue v4_12) {
            throw v4_12;
        }
        if (this.b.isEmpty()) {
            okhttp3.internal.concurrent.TaskQueue v4_3 = 0;
        } else {
            int v1_0 = new okhttp3.internal.http2.Http2Stream[0];
            v4_3 = this.b.values().toArray(v1_0);
            this.b.clear();
        }
        okhttp3.internal.concurrent.TaskQueue v4_4 = ((okhttp3.internal.http2.Http2Stream[]) v4_3);
        if (v4_4 != null) {
            int v1_2 = v4_4.length;
        }
        this.C.close();
        try {
            this.B.cancel();
        } catch (java.io.IOException) {
        }
        this.n.e();
        this.o.e();
        this.p.e();
        return;
    }

    public final void close()
    {
        this.c(okhttp3.internal.http2.ErrorCode.c, okhttp3.internal.http2.ErrorCode.n, 0);
        return;
    }

    public final okhttp3.internal.http2.Http2Stream f(int p2)
    {
        try {
            return ((okhttp3.internal.http2.Http2Stream) this.b.get(Integer.valueOf(p2)));
        } catch (Throwable v2_4) {
            throw v2_4;
        }
    }

    public final void flush()
    {
        this.C.flush();
        return;
    }

    public final okhttp3.internal.http2.Http2Stream i(int p2)
    {
        try {
            Throwable v2_3 = ((okhttp3.internal.http2.Http2Stream) this.b.remove(Integer.valueOf(p2)));
            this.notifyAll();
            return v2_3;
        } catch (Throwable v2_4) {
            throw v2_4;
        }
    }

    public final void s(okhttp3.internal.http2.ErrorCode p5)
    {
        try {
            try {
                if (!this.f) {
                    this.f = 1;
                    this.C.s(this.d, p5, okhttp3.internal._UtilCommonKt.a);
                    return;
                } else {
                    return;
                }
            } catch (Throwable v5_2) {
                throw v5_2;
            }
        } catch (Throwable v5_1) {
            throw v5_1;
        }
    }

    public final void x(long p7)
    {
        okhttp3.internal.http2.flowcontrol.WindowCounter.b(this.y, p7, 0, 2);
        long v3_1 = this.y.a();
        if (v3_1 >= ((long) (this.w.a() / 2))) {
            this.A(0, v3_1);
            okhttp3.internal.http2.flowcontrol.WindowCounter.b(this.y, 0, v3_1, 1);
        }
        this.v.b(this.y);
        return;
    }

    public final void y(int p9, boolean p10, x8.g p11, long p12)
    {
        if (p12 == 0) {
            this.C.f(p10, p9, p11, 0);
            return;
        }
        while (p12 > 0) {
            while(true) {
                okhttp3.internal.http2.Http2Writer v4_7 = this.z;
                long v6_2 = this.A;
                if (v4_7 < v6_2) {
                    break;
                }
                if (!this.b.containsKey(Integer.valueOf(p9))) {
                    throw new java.io.IOException("stream closed");
                } else {
                    this.wait();
                }
            }
            int v5_1;
            int v2_2 = Math.min(((int) Math.min(p12, (v6_2 - v4_7))), this.C.c);
            long v6_1 = ((long) v2_2);
            this.z = (this.z + v6_1);
            p12 -= v6_1;
            if ((p10 == null) || (p12 != 0)) {
                v5_1 = 0;
            } else {
                v5_1 = 1;
            }
            this.C.f(v5_1, p9, p11, v2_2);
        }
        return;
    }

    public final void z(int p4, okhttp3.internal.http2.ErrorCode p5)
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.c);
        v0_1.append(91);
        v0_1.append(p4);
        v0_1.append("] writeSynReset");
        okhttp3.internal.concurrent.TaskQueue.b(this.n, v0_1.toString(), new okhttp3.internal.http2.d(this, p4, p5, 2), 6);
        return;
    }
}
