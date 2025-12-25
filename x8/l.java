package x8;
public final class l implements x8.h0 {
    public final x8.u a;
    public long b;
    public boolean c;

    public l(x8.u p1, long p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final x8.j0 b()
    {
        return x8.j0.d;
    }

    public final void close()
    {
        Throwable v0_0 = this.a;
        if (!this.c) {
            this.c = 1;
            Throwable v1_4 = v0_0.c;
            v1_4.lock();
            try {
                boolean v2_2 = (v0_0.b - 1);
                v0_0.b = v2_2;
            } catch (Throwable v0_1) {
                v1_4.unlock();
                throw v0_1;
            }
            if ((!v2_2) && (v0_0.a)) {
                v1_4.unlock();
                v0_0.d.close();
                return;
            } else {
                v1_4.unlock();
                return;
            }
        } else {
            return;
        }
    }

    public final long t(x8.g p17, long p18)
    {
        kotlin.jvm.internal.j.e(p17, "sink");
        if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            x8.u v4_0 = this.a;
            long v5 = this.b;
            if (p18 < 0) {
                throw new IllegalArgumentException(v1.a.g(p18, "byteCount < 0: ").toString());
            } else {
                x8.c0 v2_3 = (p18 + v5);
                long v7_2 = v5;
                while (v7_2 < v2_3) {
                    long v9_2 = p17.J(1);
                    byte[] v12 = v9_2.a;
                    int v13 = v9_2.c;
                    long v18_1 = -1;
                    int v10_3 = ((int) Math.min((v2_3 - v7_2), ((long) (8192 - v13))));
                    kotlin.jvm.internal.j.e(v12, "array");
                    v4_0.d.seek(v7_2);
                    long v11_2 = 0;
                    while (v11_2 < v10_3) {
                        int v14_2 = v4_0.d.read(v12, v13, (v10_3 - v11_2));
                        if (v14_2 != -1) {
                            v11_2 += v14_2;
                        } else {
                            if (v11_2 != 0) {
                                break;
                            }
                            v11_2 = -1;
                            break;
                        }
                    }
                    if (v11_2 != -1) {
                        v9_2.c = (v9_2.c + v11_2);
                        long v9_3 = ((long) v11_2);
                        v7_2 += v9_3;
                        p17.b = (p17.b + v9_3);
                    } else {
                        if (v9_2.b == v9_2.c) {
                            p17.a = v9_2.a();
                            x8.d0.a(v9_2);
                        }
                        if (v5 != v7_2) {
                            long v7_3 = (v7_2 - v5);
                        } else {
                            v7_3 = -1;
                        }
                    }
                    if (v7_3 != v18_1) {
                        this.b = (this.b + v7_3);
                    }
                    return v7_3;
                }
                v18_1 = -1;
            }
        }
    }
}
