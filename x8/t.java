package x8;
public final class t implements x8.h0 {
    public final java.io.InputStream a;
    public final x8.j0 b;

    public t(java.io.InputStream p1, x8.j0 p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final x8.j0 b()
    {
        return this.b;
    }

    public final void close()
    {
        this.a.close();
        return;
    }

    public final long t(x8.g p4, long p5)
    {
        kotlin.jvm.internal.j.e(p4, "sink");
        int v2_1 = p5 cmp 0;
        if (v2_1 != 0) {
            if (v2_1 < 0) {
                throw new IllegalArgumentException(v1.a.g(p5, "byteCount < 0: ").toString());
            } else {
                this.b.f();
                long v0_3 = p4.J(1);
                java.io.IOException v5_4 = this.a.read(v0_3.a, v0_3.c, ((int) Math.min(p5, ((long) (8192 - v0_3.c)))));
                if (v5_4 != -1) {
                    v0_3.c = (v0_3.c + v5_4);
                    java.io.IOException v5_5 = ((long) v5_4);
                    p4.b = (p4.b + v5_5);
                    return v5_5;
                } else {
                    if (v0_3.b == v0_3.c) {
                        p4.a = v0_3.a();
                        x8.d0.a(v0_3);
                    }
                    return -1;
                }
            }
        } else {
            return 0;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("source(");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
