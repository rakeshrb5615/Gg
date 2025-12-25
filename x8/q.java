package x8;
public final class q implements x8.f0 {
    public final x8.a0 a;
    public final java.util.zip.Deflater b;
    public final x8.k c;
    public boolean d;
    public final java.util.zip.CRC32 e;

    public q(x8.h p4)
    {
        x8.g v0_2 = new x8.a0(p4);
        this.a = v0_2;
        int v4_7 = new java.util.zip.Deflater(-1, 1);
        this.b = v4_7;
        this.c = new x8.k(v0_2, v4_7);
        this.e = new java.util.zip.CRC32();
        x8.g v0_1 = v0_2.b;
        v0_1.Q(8075);
        v0_1.M(8);
        v0_1.M(0);
        v0_1.P(0);
        v0_1.M(0);
        v0_1.M(0);
        return;
    }

    public final x8.j0 b()
    {
        return this.a.a.b();
    }

    public final void close()
    {
        int v0_0 = this.b;
        x8.a0 v1 = this.a;
        if (!this.d) {
            int v2_12 = this.c;
            v2_12.b.finish();
            v2_12.c(0);
            long vtmp1 = this.e.getValue();
            x8.g v4 = v1.b;
            if (v1.c) {
                throw new IllegalStateException("closed");
            } else {
                v4.P(x8.b.g(((int) vtmp1)));
                v1.c();
                int v2_6 = v0_0.getBytesRead();
                if (v1.c) {
                    throw new IllegalStateException("closed");
                } else {
                    v4.P(x8.b.g(((int) v2_6)));
                    v1.c();
                    int v2_11 = 0;
                    try {
                        v0_0.end();
                        try {
                            v1.close();
                        } catch (int v0_2) {
                            if (v2_11 != 0) {
                            } else {
                                v2_11 = v0_2;
                            }
                        }
                        this.d = 1;
                        if (v2_11 != 0) {
                            throw v2_11;
                        }
                    } catch (int v0_1) {
                        if (v2_11 != 0) {
                        } else {
                            v2_11 = v0_1;
                        }
                    }
                }
            }
        }
        return;
    }

    public final void flush()
    {
        this.c.flush();
        return;
    }

    public final void k(x8.g p10, long p11)
    {
        x8.c0 v2_0 = p11 cmp 0;
        if (v2_0 < null) {
            throw new IllegalArgumentException(v1.a.g(p11, "byteCount < 0: ").toString());
        } else {
            if (v2_0 != null) {
                x8.c0 v2_1 = p10.a;
                kotlin.jvm.internal.j.b(v2_1);
                long v3 = p11;
                while (v3 > 0) {
                    long v5_5 = ((int) Math.min(v3, ((long) (v2_1.c - v2_1.b))));
                    this.e.update(v2_1.a, v2_1.b, v5_5);
                    v3 -= ((long) v5_5);
                    v2_1 = v2_1.f;
                    kotlin.jvm.internal.j.b(v2_1);
                }
                this.c.k(p10, p11);
                return;
            } else {
                return;
            }
        }
    }
}
