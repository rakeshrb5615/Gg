package x8;
public final class z implements x8.h0 {
    public final x8.i a;
    public final x8.g b;
    public x8.c0 c;
    public int d;
    public boolean e;
    public long f;

    public z(x8.i p1)
    {
        int v1_3;
        this.a = p1;
        int v1_1 = p1.a();
        this.b = v1_1;
        int v1_2 = v1_1.a;
        this.c = v1_2;
        if (v1_2 == 0) {
            v1_3 = -1;
        } else {
            v1_3 = v1_2.b;
        }
        this.d = v1_3;
        return;
    }

    public final x8.j0 b()
    {
        return this.a.b();
    }

    public final void close()
    {
        this.e = 1;
        return;
    }

    public final long t(x8.g p9, long p10)
    {
        kotlin.jvm.internal.j.e(p9, "sink");
        x8.g v2_0 = p10 cmp 0;
        if (v2_0 < null) {
            throw new IllegalArgumentException(v1.a.g(p10, "byteCount < 0: ").toString());
        } else {
            if (this.e) {
                throw new IllegalStateException("closed");
            } else {
                long v3_1 = this.c;
                long v4_0 = this.b;
                if (v3_1 != 0) {
                    int v5_0 = v4_0.a;
                    if (v3_1 == v5_0) {
                        long v3_2 = this.d;
                        kotlin.jvm.internal.j.b(v5_0);
                        if (v3_2 == v5_0.b) {
                            if (v2_0 != null) {
                                if (this.a.request((this.f + 1))) {
                                    if (this.c == null) {
                                        int v0_6 = v4_0.a;
                                        if (v0_6 != 0) {
                                            this.c = v0_6;
                                            this.d = v0_6.b;
                                        }
                                    }
                                    long v6 = Math.min(p10, (v4_0.b - this.f));
                                    this.b.z(p9, this.f, v6);
                                    this.f = (this.f + v6);
                                    return v6;
                                } else {
                                    return -1;
                                }
                            } else {
                                return 0;
                            }
                        }
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
            }
        }
    }
}
