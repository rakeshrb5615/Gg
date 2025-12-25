package okhttp3.internal.http2;
public final class Http2Stream$FramingSink implements x8.f0 {
    public final boolean a;
    public final x8.g b;
    public boolean c;
    public final synthetic okhttp3.internal.http2.Http2Stream d;

    public Http2Stream$FramingSink(okhttp3.internal.http2.Http2Stream p1, boolean p2)
    {
        this.d = p1;
        this.a = p2;
        this.b = new x8.g();
        return;
    }

    public final x8.j0 b()
    {
        return this.d.q;
    }

    public final void c(boolean p13)
    {
        okhttp3.internal.http2.Http2Stream v1 = this.d;
        try {
            v1.q.h();
            try {
                while ((v1.d >= v1.e) && ((!this.a) && ((!this.c) && (v1.h() == null)))) {
                    v1.wait();
                }
            } catch (okhttp3.internal.http2.Http2Stream$StreamTimeout v0_8) {
                Throwable v13_13 = v0_8;
                v1.q.l();
                throw v13_13;
            }
            Throwable v13_3;
            v1.q.l();
            v1.d();
            long v10 = Math.min((v1.e - v1.d), this.b.b);
            v1.d = (v1.d + v10);
            if ((p13 == null) || (v10 != this.b.b)) {
                v13_3 = 0;
            } else {
                v13_3 = 1;
            }
            int v8 = v13_3;
            this.d.q.h();
            try {
                Throwable v13_6 = this.d;
                v13_6.b.y(v13_6.a, v8, this.b, v10);
                this.d.q.l();
                return;
            } catch (okhttp3.internal.http2.Http2Stream$StreamTimeout v0_4) {
                Throwable v13_9 = v0_4;
                this.d.q.l();
                throw v13_9;
            }
        } catch (okhttp3.internal.http2.Http2Stream$StreamTimeout v0_10) {
            throw v0_10;
        }
    }

    public final void close()
    {
        try {
            if (!this.c) {
                Throwable v0_0;
                if (this.d.h() != null) {
                    v0_0 = 0;
                } else {
                    v0_0 = 1;
                }
                okhttp3.internal.http2.Http2Stream v1_1 = this.d;
                if (!v1_1.o.a) {
                    if (this.b.b <= 0) {
                        if (v0_0 == null) {
                            okhttp3.internal.http2.Http2Stream v1_2 = this.d;
                            try {
                                this.c = 1;
                                v1_2.notifyAll();
                                this.d.b.flush();
                                this.d.c();
                                return;
                            } catch (Throwable v0_8) {
                                throw v0_8;
                            }
                        } else {
                            v1_1.b.y(v1_1.a, 1, 0, 0);
                        }
                    }
                    while (this.b.b > 0) {
                        this.c(1);
                    }
                }
            } else {
                return;
            }
        } catch (Throwable v0_10) {
            throw v0_10;
        }
    }

    public final void flush()
    {
        try {
            this.d.d();
        } catch (Throwable v1) {
            throw v1;
        }
        while (this.b.b > 0) {
            this.c(0);
            this.d.b.flush();
        }
        return;
    }

    public final void k(x8.g p4, long p5)
    {
        x8.g v0 = this.b;
        v0.k(p4, p5);
        while (v0.b >= 16384) {
            this.c(0);
        }
        return;
    }
}
