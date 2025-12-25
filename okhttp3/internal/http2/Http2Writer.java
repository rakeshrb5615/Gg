package okhttp3.internal.http2;
public final class Http2Writer implements java.io.Closeable, okhttp3.internal.concurrent.Lockable {
    public static final java.util.logging.Logger f;
    public final x8.h a;
    public final x8.g b;
    public int c;
    public boolean d;
    public final okhttp3.internal.http2.Hpack$Writer e;

    static Http2Writer()
    {
        new okhttp3.internal.http2.Http2Writer$Companion(0);
        okhttp3.internal.http2.Http2Writer.f = java.util.logging.Logger.getLogger(okhttp3.internal.http2.Http2.getName());
        return;
    }

    public Http2Writer(x8.h p2)
    {
        kotlin.jvm.internal.j.e(p2, "sink");
        this.a = p2;
        x8.g v2_2 = new x8.g();
        this.b = v2_2;
        this.c = 16384;
        this.e = new okhttp3.internal.http2.Hpack$Writer(v2_2);
        return;
    }

    public final void A(int p5, long p6)
    {
        if (this.d) {
            throw new java.io.IOException("closed");
        } else {
            if ((p6 == 0) || (p6 > 2147483647)) {
                x8.h v5_2 = new StringBuilder("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                v5_2.append(p6);
                throw new IllegalArgumentException(v5_2.toString().toString());
            } else {
                int v0_1 = okhttp3.internal.http2.Http2Writer.f;
                if (v0_1.isLoggable(java.util.logging.Level.FINE)) {
                    okhttp3.internal.http2.Http2.a.getClass();
                    v0_1.fine(okhttp3.internal.http2.Http2.c(0, p5, 4, p6));
                }
                this.i(p5, 4, 8, 0);
                this.a.writeInt(((int) p6));
                this.a.flush();
                return;
            }
        }
    }

    public final void c(okhttp3.internal.http2.Settings p6)
    {
        kotlin.jvm.internal.j.e(p6, "peerSettings");
        if (this.d) {
            throw new java.io.IOException("closed");
        } else {
            okhttp3.internal.http2.Hpack$Writer v0_2 = this.c;
            int v1_7 = p6.a;
            if ((v1_7 & 32) != 0) {
                v0_2 = p6.b[5];
            }
            okhttp3.internal.http2.Hpack$Writer v0_5;
            this.c = v0_2;
            int v2_2 = -1;
            if ((v1_7 & 2) == 0) {
                v0_5 = -1;
            } else {
                v0_5 = p6.b[1];
            }
            if (v0_5 != -1) {
                okhttp3.internal.http2.Hpack$Writer v0_7 = this.e;
                if ((v1_7 & 2) != 0) {
                    v2_2 = p6.b[1];
                }
                v0_7.getClass();
                int v6_3 = Math.min(v2_2, 16384);
                int v1_1 = v0_7.d;
                if (v1_1 != v6_3) {
                    if (v6_3 < v1_1) {
                        v0_7.b = Math.min(v0_7.b, v6_3);
                    }
                    v0_7.c = 1;
                    v0_7.d = v6_3;
                    int v1_4 = v0_7.h;
                    if (v6_3 < v1_4) {
                        if (v6_3 != 0) {
                            v0_7.a((v1_4 - v6_3));
                        } else {
                            int v6_5 = v0_7.e;
                            i7.h.d0(v6_5, 0, v6_5.length);
                            v0_7.f = (v0_7.e.length - 1);
                            v0_7.g = 0;
                            v0_7.h = 0;
                        }
                    }
                } else {
                }
            }
            this.i(0, 0, 4, 1);
            this.a.flush();
            return;
        }
    }

    public final void close()
    {
        try {
            this.d = 1;
            this.a.close();
            return;
        } catch (Throwable v0_2) {
            throw v0_2;
        }
    }

    public final void f(boolean p3, int p4, x8.g p5, int p6)
    {
        try {
            if (this.d) {
                throw new java.io.IOException("closed");
            } else {
                this.i(p4, p6, 0, p3);
                if (p6 > 0) {
                    x8.h v3_4 = this.a;
                    kotlin.jvm.internal.j.b(p5);
                    v3_4.k(p5, ((long) p6));
                }
                return;
            }
        } catch (x8.h v3_1) {
            throw v3_1;
        }
    }

    public final void flush()
    {
        try {
            if (this.d) {
                throw new java.io.IOException("closed");
            } else {
                this.a.flush();
                return;
            }
        } catch (java.io.IOException v0_3) {
            throw v0_3;
        }
    }

    public final void i(int p3, int p4, int p5, int p6)
    {
        if (p5 != 8) {
            x8.h v1_0 = okhttp3.internal.http2.Http2Writer.f;
            if (v1_0.isLoggable(java.util.logging.Level.FINE)) {
                okhttp3.internal.http2.Http2.a.getClass();
                v1_0.fine(okhttp3.internal.http2.Http2.b(0, p3, p4, p5, p6));
            }
        }
        if (p4 > this.c) {
            String v3_2 = new StringBuilder("FRAME_SIZE_ERROR length > ");
            v3_2.append(this.c);
            v3_2.append(": ");
            v3_2.append(p4);
            throw new IllegalArgumentException(v3_2.toString().toString());
        } else {
            if ((-2147483648 & p3) != 0) {
                throw new IllegalArgumentException(g2.g.c(p3, "reserved bit set: ").toString());
            } else {
                x8.h v1_1 = this.a;
                kotlin.jvm.internal.j.e(v1_1, "<this>");
                v1_1.writeByte(((p4 >> 16) & 255));
                v1_1.writeByte(((p4 >> 8) & 255));
                v1_1.writeByte((p4 & 255));
                v1_1.writeByte((p5 & 255));
                v1_1.writeByte((p6 & 255));
                v1_1.writeInt((p3 & 2147483647));
                return;
            }
        }
    }

    public final void s(int p4, okhttp3.internal.http2.ErrorCode p5, byte[] p6)
    {
        try {
            if (this.d) {
                throw new java.io.IOException("closed");
            } else {
                if (p5.a == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                } else {
                    this.i(0, (p6.length + 8), 7, 0);
                    this.a.writeInt(p4);
                    this.a.writeInt(p5.a);
                    if (p6.length != 0) {
                        this.a.write(p6);
                    } else {
                    }
                    this.a.flush();
                    return;
                }
            }
        } catch (x8.h v4_5) {
            throw v4_5;
        }
    }

    public final void x(boolean p9, int p10, java.util.ArrayList p11)
    {
        try {
            if (this.d) {
                throw new java.io.IOException("closed");
            } else {
                long v6_0;
                this.e.d(p11);
                long v0_3 = this.b.b;
                int v2_1 = Math.min(((long) this.c), v0_3);
                x8.g v11_2 = v0_3 cmp v2_1;
                if (v11_2 != null) {
                    v6_0 = 0;
                } else {
                    v6_0 = 4;
                }
                if (p9 != null) {
                    v6_0 |= 1;
                }
                this.i(p10, ((int) v2_1), 1, v6_0);
                this.a.k(this.b, v2_1);
                if (v11_2 > null) {
                    long v0_1 = (v0_3 - v2_1);
                    while (v0_1 > 0) {
                        x8.g v11_4;
                        long v6_3 = Math.min(((long) this.c), v0_1);
                        v0_1 -= v6_3;
                        if (v0_1 != 0) {
                            v11_4 = 0;
                        } else {
                            v11_4 = 4;
                        }
                        this.i(p10, ((int) v6_3), 9, v11_4);
                        this.a.k(this.b, v6_3);
                    }
                }
                return;
            }
        } catch (x8.h v9_8) {
            throw v9_8;
        }
    }

    public final void y(int p4, boolean p5, int p6)
    {
        try {
            if (this.d) {
                throw new java.io.IOException("closed");
            } else {
                this.i(0, 8, 6, p5);
                this.a.writeInt(p4);
                this.a.writeInt(p6);
                this.a.flush();
                return;
            }
        } catch (java.io.IOException v4_5) {
            throw v4_5;
        }
    }

    public final void z(int p4, okhttp3.internal.http2.ErrorCode p5)
    {
        try {
            if (this.d) {
                throw new java.io.IOException("closed");
            } else {
                if (p5.a == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                } else {
                    this.i(p4, 4, 3, 0);
                    this.a.writeInt(p5.a);
                    this.a.flush();
                    return;
                }
            }
        } catch (String v4_1) {
            throw v4_1;
        }
    }
}
