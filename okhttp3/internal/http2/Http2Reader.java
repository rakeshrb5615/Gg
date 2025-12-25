package okhttp3.internal.http2;
public final class Http2Reader implements java.io.Closeable {
    public static final okhttp3.internal.http2.Http2Reader$Companion d;
    public static final java.util.logging.Logger e;
    public final x8.i a;
    public final okhttp3.internal.http2.Http2Reader$ContinuationSource b;
    public final okhttp3.internal.http2.Hpack$Reader c;

    static Http2Reader()
    {
        okhttp3.internal.http2.Http2Reader.d = new okhttp3.internal.http2.Http2Reader$Companion(0);
        java.util.logging.Logger v0_4 = java.util.logging.Logger.getLogger(okhttp3.internal.http2.Http2.getName());
        kotlin.jvm.internal.j.d(v0_4, "getLogger(...)");
        okhttp3.internal.http2.Http2Reader.e = v0_4;
        return;
    }

    public Http2Reader(x8.i p2)
    {
        kotlin.jvm.internal.j.e(p2, "source");
        this.a = p2;
        okhttp3.internal.http2.Http2Reader$ContinuationSource v0_2 = new okhttp3.internal.http2.Http2Reader$ContinuationSource(p2);
        this.b = v0_2;
        this.c = new okhttp3.internal.http2.Hpack$Reader(v0_2);
        return;
    }

    public final boolean c(boolean p19, okhttp3.internal.http2.Http2Connection$ReaderRunnable p20)
    {
        String v2_12 = okhttp3.internal.http2.Http2Reader.e;
        int v3_11 = okhttp3.internal.http2.Http2Reader.d;
        okhttp3.internal.http2.Http2Stream[] v4_10 = this.a;
        int v7_2 = 0;
        try {
            v4_10.o(9);
            int v5_10 = okhttp3.internal._UtilCommonKt.l(v4_10);
        } catch (java.io.EOFException) {
            return 0;
        }
        if (v5_10 > 16384) {
            throw new java.io.IOException(g2.g.c(v5_10, "FRAME_SIZE_ERROR: "));
        } else {
            okhttp3.internal.http2.ErrorCode v8_3 = (v4_10.readByte() & 255);
            int v9_1 = v4_10.readByte();
            int v10_1 = (v9_1 & 255);
            int v11_3 = (v4_10.readInt() & 2147483647);
            if ((v8_3 != 8) && (v2_12.isLoggable(java.util.logging.Level.FINE))) {
                okhttp3.internal.http2.Http2.a.getClass();
                v2_12.fine(okhttp3.internal.http2.Http2.b(1, v11_3, v5_10, v8_3, v10_1));
            }
            if ((p19) && (v8_3 != 4)) {
                String v2_50 = new StringBuilder("Expected a SETTINGS frame but was ");
                okhttp3.internal.http2.Http2.a.getClass();
                v2_50.append(okhttp3.internal.http2.Http2.a(v8_3));
                throw new java.io.IOException(v2_50.toString());
            } else {
                int v16 = 0;
                switch (v8_3) {
                    case 0:
                        if (v11_3 == 0) {
                            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        } else {
                            String v2_45;
                            if ((v9_1 & 1) == 0) {
                                v2_45 = 0;
                            } else {
                                v2_45 = 1;
                            }
                            if ((v9_1 & 32) != 0) {
                                throw new java.io.IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            } else {
                                if ((v9_1 & 8) != 0) {
                                    v7_2 = (v4_10.readByte() & 255);
                                }
                                v3_11.getClass();
                                p20.a(v2_45, v11_3, v4_10, okhttp3.internal.http2.Http2Reader$Companion.a(v5_10, v10_1, v7_2));
                                v4_10.skip(((long) v7_2));
                                return 1;
                            }
                        }
                    case 1:
                        if (v11_3 == 0) {
                            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        } else {
                            String v2_42;
                            if ((v9_1 & 1) == 0) {
                                v2_42 = 0;
                            } else {
                                v2_42 = 1;
                            }
                            if ((v9_1 & 8) != 0) {
                                v7_2 = (v4_10.readByte() & 255);
                            }
                            if ((v9_1 & 32) != 0) {
                                this.i(p20, v11_3);
                                v5_10 -= 5;
                            }
                            v3_11.getClass();
                            p20.c(v11_3, this.f(okhttp3.internal.http2.Http2Reader$Companion.a(v5_10, v10_1, v7_2), v7_2, v10_1, v11_3), v2_42);
                            return 1;
                        }
                    case 2:
                        if (v5_10 != 5) {
                            throw new java.io.IOException(v1.a.j("TYPE_PRIORITY length: ", v5_10, " != 5"));
                        } else {
                            if (v11_3 == 0) {
                                throw new java.io.IOException("TYPE_PRIORITY streamId == 0");
                            } else {
                                this.i(p20, v11_3);
                                return 1;
                            }
                        }
                    case 3:
                        if (v5_10 != 4) {
                            throw new java.io.IOException(v1.a.j("TYPE_RST_STREAM length: ", v5_10, " != 4"));
                        } else {
                            if (v11_3 == 0) {
                                throw new java.io.IOException("TYPE_RST_STREAM streamId == 0");
                            } else {
                                String v2_35 = v4_10.readInt();
                                okhttp3.internal.http2.ErrorCode.b.getClass();
                                int v3_16 = okhttp3.internal.http2.ErrorCode.values();
                                while (v7_2 < v3_16.length) {
                                    int v5_9 = v3_16[v7_2];
                                    if (v5_9.a != v2_35) {
                                        v7_2++;
                                    }
                                    if (v5_9 == 0) {
                                        throw new java.io.IOException(g2.g.c(v2_35, "TYPE_RST_STREAM unexpected error code: "));
                                    } else {
                                        p20.f(v11_3, v5_9);
                                        return 1;
                                    }
                                }
                                v5_9 = 0;
                            }
                        }
                    case 4:
                        if (v11_3 != 0) {
                            throw new java.io.IOException("TYPE_SETTINGS streamId != 0");
                        } else {
                            if ((v9_1 & 1) == 0) {
                                if ((v5_10 % 6) != 0) {
                                    throw new java.io.IOException(g2.g.c(v5_10, "TYPE_SETTINGS length % 6 != 0: "));
                                } else {
                                    String v2_26 = new okhttp3.internal.http2.Settings();
                                    int v3_8 = w3.a.e(w3.a.f(0, v5_10), 6);
                                    int v7_3 = v3_8.a;
                                    okhttp3.internal.http2.ErrorCode v8_4 = v3_8.b;
                                    int v3_9 = v3_8.c;
                                    if (((v3_9 > 0) && (v7_3 <= v8_4)) || ((v3_9 < 0) && (v8_4 <= v7_3))) {
                                        while(true) {
                                            int v9_3 = (v4_10.readShort() & 65535);
                                            int v10_3 = v4_10.readInt();
                                            if (v9_3 == 2) {
                                                if ((v10_3 != 0) && (v10_3 != 1)) {
                                                    break;
                                                }
                                            } else {
                                                if (v9_3 == 4) {
                                                    if (v10_3 < 0) {
                                                        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                    }
                                                } else {
                                                    if ((v9_3 == 5) && ((v10_3 < 16384) || (v10_3 > 16777215))) {
                                                        throw new java.io.IOException(g2.g.c(v10_3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                                    }
                                                }
                                            }
                                            v2_26.c(v9_3, v10_3);
                                            if (v7_3 != v8_4) {
                                                v7_3 += v3_9;
                                            }
                                        }
                                        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    }
                                    int v3_10 = p20.b;
                                    okhttp3.internal.concurrent.TaskQueue.b(v3_10.n, v1.a.n(new StringBuilder(), v3_10.c, " applyAndAckSettings"), new okhttp3.internal.http2.g(1, p20, v2_26), 6);
                                    return 1;
                                }
                            } else {
                                if (v5_10 != 0) {
                                    throw new java.io.IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                } else {
                                }
                            }
                        }
                    case 5:
                        if (v11_3 == 0) {
                            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        } else {
                            if ((v9_1 & 8) != 0) {
                                v7_2 = (v4_10.readByte() & 255);
                            }
                            String v2_19 = (v4_10.readInt() & 2147483647);
                            int v5_7 = (v5_10 - 4);
                            v3_11.getClass();
                            p20.e(v2_19, this.f(okhttp3.internal.http2.Http2Reader$Companion.a(v5_7, v10_1, v7_2), v7_2, v10_1, v11_3));
                            return 1;
                        }
                    case 6:
                        if (v5_10 != 8) {
                            throw new java.io.IOException(g2.g.c(v5_10, "TYPE_PING length != 8: "));
                        } else {
                            if (v11_3 != 0) {
                                throw new java.io.IOException("TYPE_PING streamId != 0");
                            } else {
                                String v2_14 = v4_10.readInt();
                                int v3_4 = v4_10.readInt();
                                if ((v9_1 & 1) != 0) {
                                    v7_2 = 1;
                                }
                                p20.d(v2_14, v7_2, v3_4);
                                return 1;
                            }
                        }
                    case 7:
                        if (v5_10 < 8) {
                            throw new java.io.IOException(g2.g.c(v5_10, "TYPE_GOAWAY length < 8: "));
                        } else {
                            if (v11_3 != 0) {
                                throw new java.io.IOException("TYPE_GOAWAY streamId != 0");
                            } else {
                                String v2_5 = v4_10.readInt();
                                int v3_0 = v4_10.readInt();
                                int v5_2 = (v5_10 - 8);
                                okhttp3.internal.http2.ErrorCode.b.getClass();
                                okhttp3.internal.http2.Http2Connection v6_2 = okhttp3.internal.http2.ErrorCode.values();
                                int v9_0 = 0;
                                while (v9_0 < v6_2.length) {
                                    int v10_0 = v6_2[v9_0];
                                    if (v10_0.a != v3_0) {
                                        v9_0++;
                                    } else {
                                        v16 = v10_0;
                                        break;
                                    }
                                }
                                if (v16 == 0) {
                                    throw new java.io.IOException(g2.g.c(v3_0, "TYPE_GOAWAY unexpected error code: "));
                                } else {
                                    int v3_1 = x8.j.d;
                                    if (v5_2 > 0) {
                                        v3_1 = v4_10.e(((long) v5_2));
                                    }
                                    kotlin.jvm.internal.j.e(v3_1, "debugData");
                                    v3_1.d();
                                    int v3_2 = p20.b;
                                    try {
                                        int v5_4 = new okhttp3.internal.http2.Http2Stream[0];
                                        okhttp3.internal.http2.Http2Stream[] v4_3 = v3_2.b.values().toArray(v5_4);
                                        v3_2.f = 1;
                                        okhttp3.internal.http2.Http2Stream[] v4_4 = ((okhttp3.internal.http2.Http2Stream[]) v4_3);
                                        int v3_3 = v4_4.length;
                                    } catch (Throwable v0_12) {
                                        throw v0_12;
                                    }
                                    while (v7_2 < v3_3) {
                                        int v5_5 = v4_4[v7_2];
                                        if ((v5_5.a > v2_5) && (v5_5.i())) {
                                            try {
                                                if (v5_5.h() == null) {
                                                    v5_5.r = okhttp3.internal.http2.ErrorCode.m;
                                                    v5_5.notifyAll();
                                                }
                                                p20.b.i(v5_5.a);
                                            } catch (Throwable v0_13) {
                                                throw v0_13;
                                            }
                                        }
                                        v7_2++;
                                    }
                                }
                            }
                        }
                        break;
                    case 8:
                        if (v5_10 != 4) {
                            okhttp3.internal.http2.Http2Stream[] v4_12 = new StringBuilder("TYPE_WINDOW_UPDATE length !=4: ");
                            v4_12.append(v5_10);
                            throw new java.io.IOException(v4_12.toString());
                        } else {
                            int v3_29 = (((long) v4_10.readInt()) & 2147483647);
                            okhttp3.internal.http2.Http2Connection v6_18 = v3_29 cmp 0;
                            if (v6_18 == null) {
                                throw new java.io.IOException("windowSizeIncrement was 0");
                            } else {
                                if (v2_12.isLoggable(java.util.logging.Level.FINE)) {
                                    okhttp3.internal.http2.Http2.a.getClass();
                                    v2_12.fine(okhttp3.internal.http2.Http2.c(1, v11_3, v5_10, v3_29));
                                }
                                if (v11_3 != 0) {
                                    String v2_0 = p20.b.f(v11_3);
                                    if (v2_0 == null) {
                                    } else {
                                        try {
                                            v2_0.e = (v2_0.e + v3_29);
                                        } catch (Throwable v0_2) {
                                            throw v0_2;
                                        }
                                        if (v6_18 > null) {
                                            v2_0.notifyAll();
                                        }
                                        return 1;
                                    }
                                } else {
                                    String v2_1 = p20.b;
                                    try {
                                        v2_1.A = (v2_1.A + v3_29);
                                        v2_1.notifyAll();
                                        return 1;
                                    } catch (Throwable v0_3) {
                                        throw v0_3;
                                    }
                                }
                            }
                        }
                    default:
                        v4_10.skip(((long) v5_10));
                        return 1;
                }
                return 1;
            }
        }
    }

    public final void close()
    {
        this.a.close();
        return;
    }

    public final java.util.List f(int p5, int p6, int p7, int p8)
    {
        int v0_0 = this.b;
        v0_0.e = p5;
        v0_0.b = p5;
        v0_0.f = p6;
        v0_0.c = p7;
        v0_0.d = p8;
        String v5_6 = this.c;
        java.io.IOException v6_5 = v5_6.c;
        StringBuilder v7_3 = v5_6.b;
        while (!v6_5.h()) {
            int v8_8 = v6_5.readByte();
            int v0_5 = (v8_8 & 255);
            if (v0_5 == 128) {
                throw new java.io.IOException("index == 0");
            } else {
                if ((v8_8 & 128) != 128) {
                    if (v0_5 != 64) {
                        if ((v8_8 & 64) != 64) {
                            if ((v8_8 & 32) != 32) {
                                if ((v0_5 != 16) && (v0_5 != 0)) {
                                    v7_3.add(new okhttp3.internal.http2.Header(v5_6.b((v5_6.e(v0_5, 15) - 1)), v5_6.d()));
                                } else {
                                    int v0_7 = v5_6.d();
                                    okhttp3.internal.http2.Hpack.a.getClass();
                                    okhttp3.internal.http2.Hpack.a(v0_7);
                                    v7_3.add(new okhttp3.internal.http2.Header(v0_7, v5_6.d()));
                                }
                            } else {
                                int v8_18 = v5_6.e(v0_5, 31);
                                v5_6.a = v8_18;
                                if ((v8_18 < 0) || (v8_18 > 4096)) {
                                    StringBuilder v7_2 = new StringBuilder("Invalid dynamic table size update ");
                                    v7_2.append(v5_6.a);
                                    throw new java.io.IOException(v7_2.toString());
                                } else {
                                    int v0_9 = v5_6.g;
                                    if (v8_18 < v0_9) {
                                        if (v8_18 != 0) {
                                            v5_6.a((v0_9 - v8_18));
                                        } else {
                                            int v8_20 = v5_6.d;
                                            i7.h.d0(v8_20, 0, v8_20.length);
                                            v5_6.e = (v5_6.d.length - 1);
                                            v5_6.f = 0;
                                            v5_6.g = 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            v5_6.c(new okhttp3.internal.http2.Header(v5_6.b((v5_6.e(v0_5, 63) - 1)), v5_6.d()));
                        }
                    } else {
                        int v0_1 = v5_6.d();
                        okhttp3.internal.http2.Hpack.a.getClass();
                        okhttp3.internal.http2.Hpack.a(v0_1);
                        v5_6.c(new okhttp3.internal.http2.Header(v0_1, v5_6.d()));
                    }
                } else {
                    int v8_5 = v5_6.e(v0_5, 127);
                    int v0_2 = (v8_5 - 1);
                    if (v0_2 >= 0) {
                        int v1_3 = okhttp3.internal.http2.Hpack.a;
                        v1_3.getClass();
                        int v2_0 = okhttp3.internal.http2.Hpack.b;
                        if (v0_2 <= (v2_0.length - 1)) {
                            v1_3.getClass();
                            v7_3.add(v2_0[v0_2]);
                        }
                    }
                    okhttp3.internal.http2.Hpack.a.getClass();
                    int v1_9 = ((v5_6.e + 1) + (v0_2 - okhttp3.internal.http2.Hpack.b.length));
                    if (v1_9 >= 0) {
                        int v0_4 = v5_6.d;
                        if (v1_9 < v0_4.length) {
                            int v8_6 = v0_4[v1_9];
                            kotlin.jvm.internal.j.b(v8_6);
                            v7_3.add(v8_6);
                        }
                    }
                    throw new java.io.IOException(g2.g.c(v8_5, "Header index too large "));
                }
            }
        }
        String v5_1 = i7.i.j0(v7_3);
        v7_3.clear();
        return v5_1;
    }

    public final void i(okhttp3.internal.http2.Http2Connection$ReaderRunnable p1, int p2)
    {
        p1 = this.a;
        p1.readInt();
        p1.readByte();
        return;
    }
}
