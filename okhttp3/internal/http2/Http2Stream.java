package okhttp3.internal.http2;
public final class Http2Stream implements okhttp3.internal.concurrent.Lockable, x8.g0 {
    public static final synthetic int t;
    public final int a;
    public final okhttp3.internal.http2.Http2Connection b;
    public final okhttp3.internal.http2.flowcontrol.WindowCounter c;
    public long d;
    public long e;
    public final java.util.ArrayDeque f;
    public boolean m;
    public final okhttp3.internal.http2.Http2Stream$FramingSource n;
    public final okhttp3.internal.http2.Http2Stream$FramingSink o;
    public final okhttp3.internal.http2.Http2Stream$StreamTimeout p;
    public final okhttp3.internal.http2.Http2Stream$StreamTimeout q;
    public okhttp3.internal.http2.ErrorCode r;
    public java.io.IOException s;

    static Http2Stream()
    {
        new okhttp3.internal.http2.Http2Stream$Companion(0);
        return;
    }

    public Http2Stream(int p4, okhttp3.internal.http2.Http2Connection p5, boolean p6, boolean p7, okhttp3.Headers p8)
    {
        kotlin.jvm.internal.j.e(p5, "connection");
        this.a = p4;
        this.b = p5;
        this.c = new okhttp3.internal.http2.flowcontrol.WindowCounter(p4);
        this.e = ((long) p5.x.a());
        IllegalStateException v4_3 = new java.util.ArrayDeque();
        this.f = v4_3;
        this.n = new okhttp3.internal.http2.Http2Stream$FramingSource(this, ((long) p5.w.a()), p7);
        this.o = new okhttp3.internal.http2.Http2Stream$FramingSink(this, p6);
        this.p = new okhttp3.internal.http2.Http2Stream$StreamTimeout(this);
        this.q = new okhttp3.internal.http2.Http2Stream$StreamTimeout(this);
        if (p8 == null) {
            if (!this.i()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            } else {
                return;
            }
        } else {
            if (this.i()) {
                throw new IllegalStateException("locally-initiated streams shouldn\'t have headers yet");
            } else {
                v4_3.add(p8);
                return;
            }
        }
    }

    public final x8.h0 a()
    {
        return this.n;
    }

    public final x8.f0 b()
    {
        return this.o;
    }

    public final void c()
    {
        okhttp3.internal.http2.Http2Connection v0_1;
        okhttp3.internal.http2.Http2Connection v0_0 = this.n;
        if ((v0_0.b) || (!v0_0.e)) {
            v0_1 = 0;
        } else {
            okhttp3.internal.http2.Http2Connection v0_6 = this.o;
            if (!v0_6.a) {
                if (!v0_6.c) {
                } else {
                }
            }
            v0_1 = 1;
        }
        int v1_0 = this.j();
        if (v0_1 == null) {
            if (v1_0 == 0) {
                this.b.i(this.a);
            }
            return;
        } else {
            this.e(okhttp3.internal.http2.ErrorCode.n, 0);
            return;
        }
    }

    public final void cancel()
    {
        this.g(okhttp3.internal.http2.ErrorCode.n);
        return;
    }

    public final void d()
    {
        okhttp3.internal.http2.StreamResetException v0_0 = this.o;
        if (v0_0.c) {
            throw new java.io.IOException("stream closed");
        } else {
            if (v0_0.a) {
                throw new java.io.IOException("stream finished");
            } else {
                if (this.h() == null) {
                    return;
                } else {
                    okhttp3.internal.http2.StreamResetException v0_3 = this.s;
                    if (v0_3 == null) {
                        okhttp3.internal.http2.ErrorCode v1_2 = this.h();
                        kotlin.jvm.internal.j.b(v1_2);
                        v0_3 = new okhttp3.internal.http2.StreamResetException(v1_2);
                    }
                    throw v0_3;
                }
            }
        }
    }

    public final void e(okhttp3.internal.http2.ErrorCode p2, java.io.IOException p3)
    {
        if (this.f(p2, p3)) {
            this.b.C.z(this.a, p2);
            return;
        } else {
            return;
        }
    }

    public final boolean f(okhttp3.internal.http2.ErrorCode p3, java.io.IOException p4)
    {
        try {
            if (this.h() == null) {
                this.r = p3;
                this.s = p4;
                this.notifyAll();
                if ((!this.n.b) || (!this.o.a)) {
                    this.b.i(this.a);
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } catch (int v3_1) {
            throw v3_1;
        }
    }

    public final void g(okhttp3.internal.http2.ErrorCode p3)
    {
        if (this.f(p3, 0)) {
            this.b.z(this.a, p3);
            return;
        } else {
            return;
        }
    }

    public final okhttp3.internal.http2.ErrorCode h()
    {
        try {
            return this.r;
        } catch (Throwable v0_1) {
            throw v0_1;
        }
    }

    public final boolean i()
    {
        int v0_2;
        if ((this.a & 1) != 1) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        this.b.getClass();
        if (1 != v0_2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean j()
    {
        if (this.h() == null) {
            boolean v0_5 = this.n;
            if (v0_5.b) {
                boolean v0_7 = this.o;
                if (((v0_7.a) || (v0_7.c)) && (this.m)) {
                    return 0;
                }
            } else {
                if (v0_5.e) {
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final void k(okhttp3.Headers p3, boolean p4)
    {
        kotlin.jvm.internal.j.e(p3, "headers");
        if ((!this.m) || (p3.b(":status") != null)) {
            this.m = 1;
            this.f.add(p3);
        } else {
            if (p3.b(":method") == null) {
                this.n.getClass();
            } else {
            }
        }
        if (p4 != 0) {
            this.n.b = 1;
        }
        okhttp3.internal.http2.Http2Connection v3_4 = this.j();
        this.notifyAll();
        if (v3_4 == null) {
            this.b.i(this.a);
        }
        return;
    }
}
