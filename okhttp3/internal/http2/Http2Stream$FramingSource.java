package okhttp3.internal.http2;
public final class Http2Stream$FramingSource implements x8.h0 {
    public final long a;
    public boolean b;
    public final x8.g c;
    public final x8.g d;
    public boolean e;
    public final synthetic okhttp3.internal.http2.Http2Stream f;

    public Http2Stream$FramingSource(okhttp3.internal.http2.Http2Stream p1, long p2, boolean p4)
    {
        this.f = p1;
        this.a = p2;
        this.b = p4;
        this.c = new x8.g();
        this.d = new x8.g();
        return;
    }

    public final x8.j0 b()
    {
        return this.f.p;
    }

    public final void close()
    {
        okhttp3.internal.http2.Http2Stream v0_0 = this.f;
        try {
            this.e = 1;
            java.util.TimeZone v1_2 = this.d;
            long v2 = v1_2.b;
            v1_2.s();
            v0_0.notifyAll();
        } catch (java.util.TimeZone v1_1) {
            throw v1_1;
        }
        if (v2 > 0) {
            this.f.b.x(v2);
        }
        this.f.c();
        return;
    }

    public final long t(x8.g p27, long p28)
    {
        kotlin.jvm.internal.j.e(p27, "sink");
        if (p28 < 0) {
            throw new IllegalArgumentException(v1.a.g(p28, "byteCount < 0: ").toString());
        }
        do {
            okhttp3.internal.http2.flowcontrol.WindowCounter v6_2 = this.f;
            okhttp3.internal.http2.FlowControlListener v7_6;
            v6_2.b.getClass();
            okhttp3.internal.http2.FlowControlListener v7_4 = v6_2.o;
            okhttp3.internal.http2.flowcontrol.WindowCounter v9_0 = 1;
            if (v7_4.c) {
                v7_6 = 1;
            } else {
                if (!v7_4.a) {
                    v7_6 = 0;
                } else {
                }
            }
            if (v7_6 != null) {
                v6_2.p.h();
            }
            if ((v6_2.h() == null) || (this.b)) {
                okhttp3.internal.http2.StreamResetException v8_4 = 0;
            } else {
                v8_4 = v6_2.s;
                if (v8_4 == null) {
                    boolean v11_0 = v6_2.h();
                    kotlin.jvm.internal.j.b(v11_0);
                    v8_4 = new okhttp3.internal.http2.StreamResetException(v11_0);
                }
            }
            if (this.e) {
                throw new java.io.IOException("stream closed");
            } else {
                long v18;
                boolean v11_2 = this.d;
                long v12_0 = v11_2.b;
                if (v12_0 <= 0) {
                    if ((this.b) || (v8_4 != null)) {
                        v9_0 = 0;
                    } else {
                        v6_2.wait();
                    }
                    v18 = -1;
                } else {
                    v18 = v11_2.t(p27, Math.min(p28, v12_0));
                    okhttp3.internal.http2.flowcontrol.WindowCounter.b(v6_2.c, v18, 0, 2);
                    boolean v11_4 = v6_2.c.a();
                    if ((v8_4 == null) && (v11_4 >= ((long) (v6_2.b.w.a() / 2)))) {
                        v6_2.b.A(v6_2.a, v11_4);
                        okhttp3.internal.http2.flowcontrol.WindowCounter.b(v6_2.c, 0, v11_4, 1);
                    }
                    v9_0 = 0;
                }
                if (v7_6 != null) {
                    v6_2.p.l();
                }
                okhttp3.internal.http2.flowcontrol.WindowCounter v6_0 = this.f;
                v6_0.b.v.a(v6_0.c);
            }
        } while(v9_0 == null);
        if (v18 == -1) {
            if (v8_4 != null) {
                throw v8_4;
            } else {
                return -1;
            }
        } else {
            return v18;
        }
    }
}
