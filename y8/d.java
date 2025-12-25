package y8;
public final class d implements x8.f0 {
    public final java.io.OutputStream a;
    public final y8.i b;
    public final synthetic j6.s c;

    public d(j6.s p2)
    {
        this.c = p2;
        java.net.Socket v2_2 = ((java.net.Socket) p2.b);
        this.a = v2_2.getOutputStream();
        this.b = new y8.i(v2_2);
        return;
    }

    public final x8.j0 b()
    {
        return this.b;
    }

    public final void close()
    {
        java.io.IOException v0_0 = this.a;
        boolean v1_0 = this.c;
        y8.i v2 = this.b;
        v2.h();
        try {
            boolean v3_4 = ((java.util.concurrent.atomic.AtomicInteger) v1_0.c);
            boolean v1_3 = ((java.net.Socket) v1_0.b);
            kotlin.jvm.internal.j.e(v3_4, "<this>");
        } catch (java.io.IOException v0_4) {
            if (v2.i()) {
                v0_4 = v2.j(v0_4);
            } else {
            }
            throw v0_4;
        } catch (java.io.IOException v0_5) {
            v2.i();
            throw v0_5;
        }
        do {
            boolean v3_0;
            int v4_0 = v3_4.get();
            if ((v4_0 & 1) == 0) {
                int v5_1 = (v4_0 | 1);
            } else {
                v3_0 = 0;
            }
            if (!v3_0) {
                v2.i();
                return;
            } else {
                if (v3_0 == 3) {
                    v1_3.close();
                } else {
                    if (!v1_3.isClosed()) {
                        if (!v1_3.isOutputShutdown()) {
                            v0_0.flush();
                            v1_3.shutdownOutput();
                            if (v2.i()) {
                                throw v2.j(0);
                            } else {
                                return;
                            }
                        } else {
                        }
                    }
                    v2.i();
                    return;
                }
            }
        } while(!v3_4.compareAndSet(v4_0, v5_1));
        v3_0 = v5_1;
    }

    public final void flush()
    {
        java.io.IOException v0_0 = this.b;
        v0_0.h();
        try {
            this.a.flush();
        } catch (java.io.IOException v1_0) {
            if (v0_0.i()) {
                v1_0 = v0_0.j(v1_0);
            } else {
            }
            throw v1_0;
        } catch (java.io.IOException v1_1) {
            v0_0.i();
            throw v1_1;
        }
        if (v0_0.i()) {
            throw v0_0.j(0);
        } else {
            return;
        }
    }

    public final void k(x8.g p7, long p8)
    {
        x8.b.e(p7.b, 0, p8);
        while (p8 > 0) {
            x8.c0 v1_3 = this.b;
            v1_3.f();
            Throwable v0_1 = p7.a;
            kotlin.jvm.internal.j.b(v0_1);
            int v2_5 = ((int) Math.min(p8, ((long) (v0_1.c - v0_1.b))));
            v1_3.h();
            try {
                this.a.write(v0_1.a, v0_1.b, v2_5);
            } catch (Throwable v0_2) {
                java.io.IOException v7_1 = v0_2;
                if (v1_3.i()) {
                    v7_1 = v1_3.j(v7_1);
                } else {
                }
                throw v7_1;
            } catch (Throwable v0_3) {
                java.io.IOException v7_2 = v0_3;
                v1_3.i();
                throw v7_2;
            }
            if (v1_3.i()) {
                throw v1_3.j(0);
            } else {
                x8.c0 v1_1 = (v0_1.b + v2_5);
                v0_1.b = v1_1;
                int v2_6 = ((long) v2_5);
                p8 -= v2_6;
                p7.b = (p7.b - v2_6);
                if (v1_1 == v0_1.c) {
                    p7.a = v0_1.a();
                    x8.d0.a(v0_1);
                }
            }
        }
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("sink(");
        v0_2.append(((java.net.Socket) this.c.b));
        v0_2.append(41);
        return v0_2.toString();
    }
}
