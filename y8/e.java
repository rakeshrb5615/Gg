package y8;
public final class e implements x8.h0 {
    public final java.io.InputStream a;
    public final y8.i b;
    public final synthetic j6.s c;

    public e(j6.s p2)
    {
        this.c = p2;
        java.net.Socket v2_2 = ((java.net.Socket) p2.b);
        this.a = v2_2.getInputStream();
        this.b = new y8.i(v2_2);
        return;
    }

    public final x8.j0 b()
    {
        return this.b;
    }

    public final void close()
    {
        java.io.InputStream v0_0 = this.c;
        y8.i v1 = this.b;
        v1.h();
        try {
            boolean v2_5 = ((java.util.concurrent.atomic.AtomicInteger) v0_0.c);
            java.io.InputStream v0_8 = ((java.net.Socket) v0_0.b);
            kotlin.jvm.internal.j.e(v2_5, "<this>");
        } catch (java.io.InputStream v0_2) {
            if (v1.i()) {
                v0_2 = v1.j(v0_2);
            } else {
            }
            throw v0_2;
        } catch (java.io.InputStream v0_3) {
            v1.i();
            throw v0_3;
        }
        do {
            boolean v2_0;
            int v3_0 = v2_5.get();
            if ((v3_0 & 2) == 0) {
                int v4_1 = (v3_0 | 2);
            } else {
                v2_0 = 0;
            }
            if (!v2_0) {
                v1.i();
                return;
            } else {
                if (v2_0 == 3) {
                    v0_8.close();
                } else {
                    if ((!v0_8.isClosed()) && (!v0_8.isInputShutdown())) {
                        v0_8.shutdownInput();
                    } else {
                        v1.i();
                        return;
                    }
                }
                if (v1.i()) {
                    throw v1.j(0);
                } else {
                    return;
                }
            }
        } while(!v2_5.compareAndSet(v3_0, v4_1));
        v2_0 = v4_1;
    }

    public final long t(x8.g p5, long p6)
    {
        kotlin.jvm.internal.j.e(p5, "sink");
        byte[] v2_4 = p6 cmp 0;
        if (v2_4 != null) {
            if (v2_4 < null) {
                throw new IllegalArgumentException(v1.a.g(p6, "byteCount < 0: ").toString());
            } else {
                long v0_1 = this.b;
                v0_1.f();
                x8.c0 v1_1 = p5.J(1);
                x8.c0 v6_3 = ((int) Math.min(p6, ((long) (8192 - v1_1.c))));
                try {
                    v0_1.h();
                    try {
                        x8.c0 v6_4 = this.a.read(v1_1.a, v1_1.c, v6_3);
                    } catch (long v5_2) {
                        if (v0_1.i()) {
                            v5_2 = v0_1.j(v5_2);
                        } else {
                        }
                        throw v5_2;
                    } catch (long v5_3) {
                        v0_1.i();
                        throw v5_3;
                    }
                    if (v0_1.i()) {
                        throw v0_1.j(0);
                    } else {
                        if (v6_4 != -1) {
                            v1_1.c = (v1_1.c + v6_4);
                            x8.c0 v6_9 = ((long) v6_4);
                            p5.b = (p5.b + v6_9);
                            return v6_9;
                        } else {
                            if (v1_1.b == v1_1.c) {
                                p5.a = v1_1.a();
                                x8.d0.a(v1_1);
                            }
                            return -1;
                        }
                    }
                } catch (long v5_6) {
                    if (!y8.m.a(v5_6)) {
                        throw v5_6;
                    } else {
                        throw new java.io.IOException(v5_6);
                    }
                }
            }
        } else {
            return 0;
        }
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("source(");
        v0_2.append(((java.net.Socket) this.c.b));
        v0_2.append(41);
        return v0_2.toString();
    }
}
