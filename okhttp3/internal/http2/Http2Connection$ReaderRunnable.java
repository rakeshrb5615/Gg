package okhttp3.internal.http2;
public final class Http2Connection$ReaderRunnable implements okhttp3.internal.http2.Http2Reader$Handler, u7.a {
    public final okhttp3.internal.http2.Http2Reader a;
    public final synthetic okhttp3.internal.http2.Http2Connection b;

    public Http2Connection$ReaderRunnable(okhttp3.internal.http2.Http2Connection p1, okhttp3.internal.http2.Http2Reader p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void a(boolean p20, int p21, x8.i p22, int p23)
    {
        kotlin.jvm.internal.j.e(p22, "source");
        okhttp3.internal.http2.ErrorCode v3_4 = this.b;
        if ((p21 == 0) || ((p21 & 1) != 0)) {
            okhttp3.internal.http2.Http2Connection v2_2 = v3_4.f(p21);
            if (v2_2 != null) {
                okhttp3.internal.http2.ErrorCode v3_1 = v2_2.n;
                v3_1.getClass();
                long v6_0 = ((long) p23);
                do {
                    x8.g v11 = 1;
                    if (v6_0 <= 0) {
                        v3_1.f.b.x(((long) p23));
                        Throwable v0_3 = v3_1.f;
                        v0_3.b.v.a(v0_3.c);
                    } else {
                        try {
                            okhttp3.internal.http2.Http2Stream v8_4;
                            if ((v3_1.d.b + v6_0) <= v3_1.a) {
                                v8_4 = 0;
                            } else {
                                v8_4 = 1;
                            }
                            if (v8_4 == null) {
                                if (!v3_1.b) {
                                    long v12_1 = p22.t(v3_1.c, v6_0);
                                    if (v12_1 == -1) {
                                        throw new java.io.EOFException();
                                    } else {
                                        v6_0 -= v12_1;
                                        okhttp3.internal.http2.Http2Stream v8_7 = v3_1.f;
                                        if (!v3_1.e) {
                                            x8.g v10_2 = v3_1.d;
                                            if (v10_2.b != 0) {
                                                v11 = 0;
                                            } else {
                                            }
                                            v10_2.L(v3_1.c);
                                        } else {
                                            v3_1.c.s();
                                        }
                                    }
                                } else {
                                    p22.skip(v6_0);
                                }
                            } else {
                                p22.skip(v6_0);
                                v3_1.f.g(okhttp3.internal.http2.ErrorCode.f);
                            }
                        } catch (Throwable v0_5) {
                            throw v0_5;
                        }
                    }
                    if (p20) {
                        v2_2.k(okhttp3.Headers.c, 1);
                    }
                    return;
                } while(v11 == null);
                v8_7.notifyAll();
            } else {
                this.b.z(p21, okhttp3.internal.http2.ErrorCode.d);
                this.b.x(((long) p23));
                p22.skip(((long) p23));
                return;
            }
        } else {
            x8.g v5_1 = new x8.g();
            p22.o(((long) p23));
            p22.t(v5_1, ((long) p23));
            Throwable v0_11 = v3_4.o;
            okhttp3.internal.http2.Http2Connection v2_8 = new StringBuilder();
            v2_8.append(v3_4.c);
            v2_8.append(91);
            v2_8.append(p21);
            v2_8.append("] onData");
            okhttp3.internal.concurrent.TaskQueue.b(v0_11, v2_8.toString(), new okhttp3.internal.http2.a(v3_4, p21, v5_1, p23, p20), 6);
            return;
        }
    }

    public final void c(int p9, java.util.List p10, boolean p11)
    {
        okhttp3.internal.http2.Http2Connection v2 = this.b;
        if ((p9 == null) || ((p9 & 1) != 0)) {
            try {
                okhttp3.internal.http2.Http2Stream v0_8 = v2.f(p9);
            } catch (okhttp3.internal.http2.Http2Stream v0_6) {
                throw v0_6;
            }
            if (v0_8 != null) {
                v0_8.k(okhttp3.internal._UtilJvmKt.g(p10), p11);
                return;
            } else {
                if (!v2.f) {
                    if (p9 > v2.d) {
                        if ((p9 % 2) != (v2.e % 2)) {
                            okhttp3.internal.http2.Http2Stream v0_4 = new okhttp3.internal.http2.Http2Stream(p9, v2, 0, p11, okhttp3.internal._UtilJvmKt.g(p10));
                            v2.d = p9;
                            v2.b.put(Integer.valueOf(p9), v0_4);
                            okhttp3.internal.concurrent.TaskQueue v9_4 = v2.m.d();
                            String v10_3 = new StringBuilder();
                            v10_3.append(v2.c);
                            v10_3.append(91);
                            v10_3.append(p9);
                            v10_3.append("] onStream");
                            okhttp3.internal.concurrent.TaskQueue.b(v9_4, v10_3.toString(), new okhttp3.internal.http2.g(0, v2, v0_4), 6);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            okhttp3.internal.http2.Http2Stream v0_7 = v2.o;
            int v1_5 = new StringBuilder();
            v1_5.append(v2.c);
            v1_5.append(91);
            v1_5.append(p9);
            v1_5.append("] onHeaders");
            okhttp3.internal.concurrent.TaskQueue.b(v0_7, v1_5.toString(), new okhttp3.internal.http2.d(v2, p9, p10, p11), 6);
            return;
        }
    }

    public final void d(int p5, boolean p6, int p7)
    {
        if (p6 == null) {
            okhttp3.internal.concurrent.TaskQueue.b(this.b.n, v1.a.n(new StringBuilder(), this.b.c, " ping"), new okhttp3.internal.http2.f(this.b, p5, p7), 6);
            return;
        } else {
            okhttp3.internal.concurrent.TaskQueue v6_2 = this.b;
            if (p5 == 1) {
                v6_2.r = (v6_2.r + 1);
            } else {
                if (p5 == 2) {
                    v6_2.t = (v6_2.t + 1);
                } else {
                    if (p5 == 3) {
                        v6_2.notifyAll();
                    }
                }
            }
            return;
        }
    }

    public final void e(int p6, java.util.List p7)
    {
        okhttp3.internal.http2.Http2Connection v0 = this.b;
        try {
            if (!v0.E.contains(Integer.valueOf(p6))) {
                v0.E.add(Integer.valueOf(p6));
                okhttp3.internal.concurrent.TaskQueue v1_1 = v0.o;
                String v2_1 = new StringBuilder();
                v2_1.append(v0.c);
                v2_1.append(91);
                v2_1.append(p6);
                v2_1.append("] onRequest");
                okhttp3.internal.concurrent.TaskQueue.b(v1_1, v2_1.toString(), new okhttp3.internal.http2.d(v0, p6, p7, 0), 6);
                return;
            } else {
                v0.z(p6, okhttp3.internal.http2.ErrorCode.d);
                return;
            }
        } catch (int v6_2) {
            throw v6_2;
        }
    }

    public final void f(int p5, okhttp3.internal.http2.ErrorCode p6)
    {
        okhttp3.internal.http2.ErrorCode v0_0 = this.b;
        if ((p5 == 0) || ((p5 & 1) != 0)) {
            int v5_2 = v0_0.i(p5);
            if (v5_2 == 0) {
                return;
            } else {
                try {
                    if (v5_2.h() == null) {
                        v5_2.r = p6;
                        v5_2.notifyAll();
                    }
                } catch (Throwable v6_1) {
                    throw v6_1;
                }
                return;
            }
        } else {
            okhttp3.internal.concurrent.TaskQueue v1_0 = v0_0.o;
            String v2_1 = new StringBuilder();
            v2_1.append(v0_0.c);
            v2_1.append(91);
            v2_1.append(p5);
            v2_1.append("] onReset");
            okhttp3.internal.concurrent.TaskQueue.b(v1_0, v2_1.toString(), new okhttp3.internal.http2.e(v0_0, p5, p6), 6);
            return;
        }
    }

    public final Object invoke()
    {
        h7.l v0_0 = this.b;
        okhttp3.internal.http2.Http2Reader v1 = this.a;
        okhttp3.internal.http2.ErrorCode v2 = okhttp3.internal.http2.ErrorCode.e;
        java.io.IOException v4 = 0;
        try {
            if (!v1.c(1, this)) {
                throw new java.io.IOException("Required SETTINGS preface not received");
            } else {
                try {
                    while (v1.c(0, this)) {
                    }
                } catch (Throwable v5_0) {
                    okhttp3.internal.http2.ErrorCode v3_4 = v2;
                    v0_0.c(v3_4, v2, v4);
                    okhttp3.internal._UtilCommonKt.b(v1);
                    throw v5_0;
                }
                v3_4 = okhttp3.internal.http2.ErrorCode.c;
                try {
                    v2 = okhttp3.internal.http2.ErrorCode.n;
                    v0_0.c(v3_4, v2, 0);
                } catch (java.io.IOException v4) {
                    v2 = okhttp3.internal.http2.ErrorCode.d;
                    v0_0.c(v2, v2, v4);
                }
            }
        } catch (okhttp3.internal.http2.ErrorCode v3_5) {
            v4 = v3_5;
            v3_4 = v2;
        } catch (okhttp3.internal.http2.ErrorCode v3_1) {
            v5_0 = v3_1;
        } catch (Throwable v5_0) {
        }
        okhttp3.internal._UtilCommonKt.b(v1);
        return h7.l.a;
    }
}
